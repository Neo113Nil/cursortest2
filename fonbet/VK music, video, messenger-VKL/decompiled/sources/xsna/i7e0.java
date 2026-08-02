package xsna;

import com.ironsource.X3;
import com.unity3d.ads.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PropertyBoxParserImpl.java */
/* loaded from: classes12.dex */
public final class i7e0 extends vc {
    public static final String[] h = new String[0];
    public Properties c;
    public Pattern d;
    public StringBuilder e;
    public ThreadLocal<String> f;
    public ThreadLocal<String[]> g;

    @Override // xsna.vc
    public final ga8 a(String str, byte[] bArr, String str2) {
        String property;
        ThreadLocal<String> threadLocal = this.f;
        StringBuilder sb = this.e;
        ThreadLocal<String[]> threadLocal2 = this.g;
        Properties properties = this.c;
        if (bArr == null) {
            property = properties.getProperty(str);
            if (property == null) {
                sb.append(str2);
                sb.append('-');
                sb.append(str);
                String sb2 = sb.toString();
                sb.setLength(0);
                property = properties.getProperty(sb2);
            }
        } else {
            if (!"uuid".equals(str)) {
                throw new RuntimeException("we have a userType but no uuid box type. Something's wrong");
            }
            property = properties.getProperty("uuid[" + skd.c(0, bArr).toUpperCase() + X3.j.e);
            if (property == null) {
                property = properties.getProperty(String.valueOf(str2) + "-uuid[" + skd.c(0, bArr).toUpperCase() + X3.j.e);
            }
            if (property == null) {
                property = properties.getProperty("uuid");
            }
        }
        if (property == null) {
            property = properties.getProperty(BuildConfig.FLAVOR);
        }
        if (property == null) {
            throw new RuntimeException("No box object found for ".concat(str));
        }
        boolean endsWith = property.endsWith(")");
        String[] strArr = h;
        if (endsWith) {
            Matcher matcher = this.d.matcher(property);
            if (!matcher.matches()) {
                throw new RuntimeException("Cannot work with that constructor: ".concat(property));
            }
            threadLocal.set(matcher.group(1));
            if (matcher.group(2).length() == 0) {
                threadLocal2.set(strArr);
            } else {
                threadLocal2.set(matcher.group(2).length() > 0 ? matcher.group(2).split(StringUtils.COMMA) : new String[0]);
            }
        } else {
            threadLocal2.set(strArr);
            threadLocal.set(property);
        }
        String[] strArr2 = threadLocal2.get();
        try {
            Class<?> cls = Class.forName(threadLocal.get());
            if (strArr2.length <= 0) {
                return (ga8) cls.newInstance();
            }
            Class<?>[] clsArr = new Class[strArr2.length];
            Object[] objArr = new Object[strArr2.length];
            for (int i = 0; i < strArr2.length; i++) {
                if ("userType".equals(strArr2[i])) {
                    objArr[i] = bArr;
                    clsArr[i] = byte[].class;
                } else if ("type".equals(strArr2[i])) {
                    objArr[i] = str;
                    clsArr[i] = String.class;
                } else {
                    if (!"parent".equals(strArr2[i])) {
                        throw new InternalError("No such param: " + strArr2[i]);
                    }
                    objArr[i] = str2;
                    clsArr[i] = String.class;
                }
            }
            return (ga8) cls.getConstructor(clsArr).newInstance(objArr);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }
}
