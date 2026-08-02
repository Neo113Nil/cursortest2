package defpackage;

import android.util.Range;
import android.util.Rational;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes10.dex */
public abstract class ll31 {
    public static final HashMap a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        HashMap hashMap2 = new HashMap();
        e94 e94Var = e94.d;
        hashMap2.put(1, e94Var);
        e94 e94Var2 = e94.g;
        hashMap2.put(2, e94Var2);
        e94 e94Var3 = e94.h;
        hashMap2.put(4096, e94Var3);
        hashMap2.put(8192, e94Var3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(1, e94Var);
        hashMap3.put(2, e94Var2);
        hashMap3.put(4096, e94Var3);
        hashMap3.put(8192, e94Var3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(1, e94Var);
        hashMap4.put(4, e94Var2);
        hashMap4.put(4096, e94Var3);
        hashMap4.put(16384, e94Var3);
        hashMap4.put(2, e94Var);
        hashMap4.put(8, e94Var2);
        hashMap4.put(8192, e94Var3);
        hashMap4.put(32768, e94Var3);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(256, e94Var2);
        hashMap5.put(512, e94.e);
        hashMap.put("video/hevc", hashMap2);
        hashMap.put("video/av01", hashMap3);
        hashMap.put("video/x-vnd.on2.vp9", hashMap4);
        hashMap.put("video/dolby-vision", hashMap5);
    }

    public static e94 a(int i, String str) {
        e94 e94Var;
        Map map = (Map) a.get(str);
        if (map != null && (e94Var = (e94) map.get(Integer.valueOf(i))) != null) {
            return e94Var;
        }
        String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i));
        sgb1.g(5, "VideoConfigUtil");
        return e94.d;
    }

    public static t38 b(i94 i94Var, Range range) {
        Range range2 = znw0.q;
        int intValue = range2.equals(range) ? 30 : ((Integer) range.getUpper()).intValue();
        int i = i94Var.b;
        if (i == 0) {
            i = intValue;
        }
        Locale locale = Locale.ENGLISH;
        Integer valueOf = Integer.valueOf(intValue);
        Integer valueOf2 = Integer.valueOf(i);
        boolean equals = range2.equals(range);
        Object obj = range;
        if (equals) {
            obj = "<UNSPECIFIED>";
        }
        String.format(locale, "Resolved capture/encode frame rate %dfps/%dfps, [Expected operating range: %s]", valueOf, valueOf2, obj);
        sgb1.g(3, "VideoConfigUtil");
        return new t38(intValue, i);
    }

    public static g94 c(k74 k74Var, q8n q8nVar, qo31 qo31Var) {
        boolean b = q8nVar.b();
        int i = q8nVar.a;
        d6z.y("Dynamic range must be a fully specified dynamic range [provided dynamic range: " + q8nVar + "]", b);
        int i2 = k74Var.c;
        String str = "video/avc";
        String str2 = i2 != 1 ? "video/avc" : "video/x-vnd.on2.vp8";
        if (qo31Var != null) {
            Set set = (Set) t8n.b.get(Integer.valueOf(i));
            if (set == null) {
                set = Collections.EMPTY_SET;
            }
            Set set2 = (Set) t8n.a.get(Integer.valueOf(q8nVar.b));
            if (set2 == null) {
                set2 = Collections.EMPTY_SET;
            }
            for (lzn lznVar : ((j94) qo31Var).d) {
                if (set.contains(Integer.valueOf(lznVar.f())) && set2.contains(Integer.valueOf(lznVar.a()))) {
                    String h = lznVar.h();
                    if (str2.equals(h)) {
                        sgb1.g(3, "VideoConfigUtil");
                    } else if (i2 == -1) {
                        q8nVar.toString();
                        sgb1.g(3, "VideoConfigUtil");
                    }
                    str2 = h;
                    break;
                }
            }
        }
        lznVar = null;
        if (lznVar == null) {
            if (i2 == -1) {
                if (i != 1) {
                    if (i == 3 || i == 4 || i == 5) {
                        str = "video/hevc";
                    } else {
                        if (i != 6) {
                            throw new UnsupportedOperationException("Unsupported dynamic range: " + q8nVar + "\nNo supported default mime type available.");
                        }
                        str = "video/dolby-vision";
                    }
                }
                str2 = str;
            }
            if (qo31Var == null) {
                q8nVar.toString();
                sgb1.g(3, "VideoConfigUtil");
            } else {
                q8nVar.toString();
                sgb1.g(3, "VideoConfigUtil");
            }
        }
        f94 f94Var = new f94();
        if (str2 == null) {
            ny61.t("Null mimeType");
            return null;
        }
        f94Var.a = str2;
        f94Var.b = -1;
        if (lznVar != null) {
            f94Var.c = lznVar;
        }
        String str3 = f94Var.a == null ? " mimeType" : "";
        if (str3.isEmpty()) {
            return new g94(f94Var.a, f94Var.b.intValue(), f94Var.c);
        }
        ny61.r("Missing required properties:".concat(str3));
        return null;
    }

    public static int d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Range range) {
        Rational rational = new Rational(i2, i3);
        Rational rational2 = new Rational(i4, i5);
        Rational rational3 = new Rational(i6, i7);
        int doubleValue = (int) (new Rational(i8, i9).doubleValue() * rational3.doubleValue() * rational2.doubleValue() * rational.doubleValue() * i);
        if (sgb1.g(3, "VideoConfigUtil")) {
            String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(doubleValue));
        }
        if (!i94.e.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(doubleValue));
            int intValue = num.intValue();
            if (sgb1.g(3, "VideoConfigUtil")) {
                String.format("\nClamped to range %s -> %dbps", range, num);
            }
            doubleValue = intValue;
        }
        sgb1.g(3, "VideoConfigUtil");
        return doubleValue;
    }
}
