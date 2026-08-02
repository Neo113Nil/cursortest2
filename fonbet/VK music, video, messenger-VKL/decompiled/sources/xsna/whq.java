package xsna;

import com.googlecode.mp4parser.AbstractBox;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.StringTokenizer;
import xsna.o0y;

/* compiled from: Factory.java */
/* loaded from: classes8.dex */
public final class whq {
    public static final Hashtable b;
    public static final Object[] c;
    public static /* synthetic */ Class d;
    public final ClassLoader a;

    static {
        Hashtable hashtable = new Hashtable();
        b = hashtable;
        hashtable.put("void", Void.TYPE);
        hashtable.put("boolean", Boolean.TYPE);
        hashtable.put("byte", Byte.TYPE);
        hashtable.put("char", Character.TYPE);
        hashtable.put("short", Short.TYPE);
        hashtable.put("int", Integer.TYPE);
        hashtable.put("long", Long.TYPE);
        hashtable.put("float", Float.TYPE);
        hashtable.put("double", Double.TYPE);
        c = new Object[0];
    }

    public whq(String str, Class cls) {
        this.a = cls.getClassLoader();
    }

    public static Class a(ClassLoader classLoader, String str) {
        if (str.equals("*")) {
            return null;
        }
        Class cls = (Class) b.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            return classLoader == null ? Class.forName(str) : Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            Class<?> cls2 = d;
            if (cls2 == null) {
                try {
                    cls2 = Class.forName("java.lang.ClassNotFoundException");
                    d = cls2;
                } catch (ClassNotFoundException e) {
                    throw new NoClassDefFoundError(e.getMessage());
                }
            }
            return cls2;
        }
    }

    public static o0y b(n0y n0yVar, AbstractBox abstractBox, AbstractBox abstractBox2, Serializable serializable, Object obj) {
        return new o0y(n0yVar, abstractBox, abstractBox2, new Object[]{serializable, obj});
    }

    public static o0y c(n0y n0yVar, Object obj, Object obj2) {
        return new o0y(n0yVar, obj, obj2, c);
    }

    public static o0y d(n0y n0yVar, Object obj, Object obj2, Object obj3) {
        return new o0y(n0yVar, obj, obj2, new Object[]{obj3});
    }

    public final xk20 e(String str, String str2, String str3, String str4, String str5, String str6) {
        int parseInt = Integer.parseInt("1", 16);
        ClassLoader classLoader = this.a;
        Class a = a(classLoader, str2);
        StringTokenizer stringTokenizer = new StringTokenizer(str3, StringUtils.PROCESS_POSTFIX_DELIMITER);
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i = 0; i < countTokens; i++) {
            clsArr[i] = a(classLoader, stringTokenizer.nextToken());
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str4, StringUtils.PROCESS_POSTFIX_DELIMITER);
        int countTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[countTokens2];
        for (int i2 = 0; i2 < countTokens2; i2++) {
            strArr[i2] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer(str5, StringUtils.PROCESS_POSTFIX_DELIMITER);
        int countTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[countTokens3];
        for (int i3 = 0; i3 < countTokens3; i3++) {
            clsArr2[i3] = a(classLoader, stringTokenizer3.nextToken());
        }
        Class a2 = a(classLoader, str6);
        xk20 xk20Var = new xk20();
        xk20Var.a = parseInt;
        xk20Var.b = str;
        xk20Var.d = a;
        xk20Var.g = clsArr;
        xk20Var.h = a2;
        return xk20Var;
    }

    public final o0y.a f(xk20 xk20Var) {
        o0y.a aVar = new o0y.a();
        aVar.a = xk20Var;
        return aVar;
    }
}
