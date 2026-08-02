package xsna;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: SessionDebugInfoAggregator.kt */
/* loaded from: classes14.dex */
public final class hti0 {
    public static final ArrayList<String> a = new ArrayList<>();
    public static final ArrayList<String> b = new ArrayList<>();
    public static String c;
    public static String d;
    public static Map<String, String> e;
    public static Integer f;

    public static String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("Creation Session Id: " + f);
        sb.append("\n\n\nGallery Inputs:\n");
        Iterator<String> it = a.iterator();
        while (it.hasNext()) {
            sb.append(new File(it.next()).getName() + '\n');
        }
        sb.append("\n\n\nEditor Files:\n");
        Iterator<String> it2 = b.iterator();
        while (it2.hasNext()) {
            sb.append(new File(it2.next()).getName() + '\n');
        }
        sb.append("\n\n\nResult For Upload:\n");
        String str = c;
        if (str == null) {
            str = "";
        }
        sb.append(new File(str).getName());
        sb.append("\n\n\nEditor Timeline:\n");
        String str2 = d;
        sb.append(str2 != null ? e(str2) : null);
        sb.append("\n\n\nUpload Params:\n");
        Map<String, String> map = e;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                StringBuilder b2 = ho8.b(key, ":\n");
                b2.append(e(value));
                b2.append('\n');
                sb.append(b2.toString());
            }
        }
        return sb.toString();
    }

    public static void b(Context context) {
        io.reactivex.rxjava3.core.x n = hg1.n(new io.reactivex.rxjava3.internal.operators.single.v(new gti0(0)), context, false, null, 62);
        asu0.a.getClass();
        itg0.n(n.q(asu0.p()).h(new hu50(new n1g0(4), 16)));
    }

    public static ArrayList c() {
        return b;
    }

    public static ArrayList d() {
        return a;
    }

    public static String e(String str) {
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        String obj = str.toString();
        StringBuilder sb = new StringBuilder(obj.length());
        int i = 0;
        while (i < obj.length()) {
            char charAt = obj.charAt(i);
            if (charAt != '(') {
                if (charAt != ')') {
                    if (charAt == ',') {
                        sb.append(charAt);
                        sb.append('\n');
                        sb.append(drm0.R("", ref$IntRef.element * 4, ' '));
                        int i2 = i + 1;
                        if (i2 >= 0 && i2 < obj.length()) {
                            charAt = obj.charAt(i2);
                        }
                        if (charAt == ' ') {
                            i = i2;
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } else if (charAt != '[') {
                        if (charAt != ']') {
                            if (charAt != '{') {
                                if (charAt != '}') {
                                    sb.append(charAt);
                                }
                            }
                        }
                    }
                    i++;
                }
                ref$IntRef.element--;
                sb.append('\n');
                sb.append(drm0.R("", ref$IntRef.element * 4, ' '));
                sb.append(charAt);
                i++;
            }
            ref$IntRef.element++;
            sb.append(charAt);
            sb.append('\n');
            sb.append(drm0.R("", ref$IntRef.element * 4, ' '));
            i++;
        }
        return sb.toString();
    }

    public static void f(int i) {
        a.clear();
        b.clear();
        d = null;
        c = null;
        e = null;
        f = Integer.valueOf(i);
    }

    public static void g(String str) {
        d = str;
    }

    public static void h(String str) {
        c = str;
    }

    public static void i(Map map) {
        e = map;
    }
}
