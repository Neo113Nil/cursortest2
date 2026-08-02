package okhttp3;

import com.ironsource.B5;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import xsna.air;
import xsna.brm0;
import xsna.epx;
import xsna.qoy;
import xsna.tyx;

/* compiled from: MediaType.kt */
/* loaded from: classes11.dex */
public final class m {
    public static final Pattern e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;
    public final String b;
    public final String c;
    public final String[] d;

    /* compiled from: MediaType.kt */
    public static final class a {
        public static m a(String str) {
            Matcher matcher = m.e.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(air.b('\"', "No subtype found for: \"", str).toString());
            }
            String group = matcher.group(1);
            Locale locale = Locale.US;
            String lowerCase = group.toLowerCase(locale);
            String lowerCase2 = matcher.group(2).toLowerCase(locale);
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = m.f.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (!matcher2.lookingAt()) {
                    throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"').toString());
                }
                String group2 = matcher2.group(1);
                if (group2 == null) {
                    end = matcher2.end();
                } else {
                    String group3 = matcher2.group(2);
                    if (group3 == null) {
                        group3 = matcher2.group(3);
                    } else if (brm0.B(group3, "'", false) && brm0.v(group3, "'", false) && group3.length() > 2) {
                        group3 = qoy.c(1, 1, group3);
                    }
                    arrayList.add(group2);
                    arrayList.add(group3);
                    end = matcher2.end();
                }
            }
            return new m(str, lowerCase, (String[]) arrayList.toArray(new String[0]), lowerCase2);
        }
    }

    public m(String str, String str2, String[] strArr, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Charset a(Charset charset) {
        String str;
        String[] strArr = this.d;
        int i = 0;
        int b = tyx.b(0, strArr.length - 1, 2);
        if (b >= 0) {
            while (!brm0.w(strArr[i], B5.N, true)) {
                if (i != b) {
                    i += 2;
                }
            }
            str = strArr[i + 1];
            if (str != null) {
                return charset;
            }
            try {
                return Charset.forName(str);
            } catch (IllegalArgumentException unused) {
                return charset;
            }
        }
        str = null;
        if (str != null) {
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m) && epx.f(((m) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
