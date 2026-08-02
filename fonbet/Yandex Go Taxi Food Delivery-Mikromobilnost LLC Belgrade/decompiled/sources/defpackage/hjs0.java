package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public class hjs0 {
    public static final Bitmap.Config[] d;
    public static final Bitmap.Config[] e;
    public static final Bitmap.Config[] f;
    public static final Bitmap.Config[] g;
    public static final Bitmap.Config[] h;
    public final hzz a = new hzz(1);
    public final u1n b = new u1n(27);
    public final HashMap c = new HashMap();

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        d = configArr;
        e = configArr;
        f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + Extension.C_BRAKE;
    }

    public final void a(Bitmap bitmap, Integer num) {
        NavigableMap d2 = d(bitmap.getConfig());
        Integer num2 = (Integer) d2.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                d2.remove(num);
                return;
            } else {
                d2.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
        sb.append(num);
        String c = c(pw21.f(bitmap), bitmap.getConfig());
        sb.append(", removed: ");
        sb.append(c);
        sb.append(", this: ");
        sb.append(this);
        throw new NullPointerException(sb.toString());
    }

    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int g2 = pw21.g(config) * i * i2;
        hzz hzzVar = this.a;
        c6e0 c6e0Var = (c6e0) ((ArrayDeque) hzzVar.b).poll();
        if (c6e0Var == null) {
            c6e0Var = hzzVar.Ug();
        }
        gjs0 gjs0Var = (gjs0) c6e0Var;
        gjs0Var.b = g2;
        gjs0Var.c = config;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = e;
        } else {
            int i3 = fjs0.a[config.ordinal()];
            configArr = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? new Bitmap.Config[]{config} : h : g : f : d;
        }
        int length = configArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i4];
            Integer num = (Integer) d(config2).ceilingKey(Integer.valueOf(g2));
            if (num == null || num.intValue() > g2 * 8) {
                i4++;
            } else if (num.intValue() != g2 || (config2 != null ? !config2.equals(config) : config != null)) {
                hzzVar.Kg(gjs0Var);
                int intValue = num.intValue();
                c6e0 c6e0Var2 = (c6e0) ((ArrayDeque) hzzVar.b).poll();
                if (c6e0Var2 == null) {
                    c6e0Var2 = hzzVar.Ug();
                }
                gjs0Var = (gjs0) c6e0Var2;
                gjs0Var.b = intValue;
                gjs0Var.c = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.b.f(gjs0Var);
        if (bitmap != null) {
            a(bitmap, Integer.valueOf(gjs0Var.b));
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap hashMap = this.c;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int f2 = pw21.f(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        hzz hzzVar = this.a;
        c6e0 c6e0Var = (c6e0) ((ArrayDeque) hzzVar.b).poll();
        if (c6e0Var == null) {
            c6e0Var = hzzVar.Ug();
        }
        gjs0 gjs0Var = (gjs0) c6e0Var;
        gjs0Var.b = f2;
        gjs0Var.c = config;
        this.b.n(gjs0Var, bitmap);
        NavigableMap d2 = d(bitmap.getConfig());
        Integer num = (Integer) d2.get(Integer.valueOf(gjs0Var.b));
        d2.put(Integer.valueOf(gjs0Var.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder t = qv10.t("SizeConfigStrategy{groupedMap=");
        t.append(this.b);
        t.append(", sortedSizes=(");
        HashMap hashMap = this.c;
        for (Map.Entry entry : hashMap.entrySet()) {
            t.append(entry.getKey());
            t.append('[');
            t.append(entry.getValue());
            t.append("], ");
        }
        if (!hashMap.isEmpty()) {
            t.replace(t.length() - 2, t.length(), "");
        }
        t.append(")}");
        return t.toString();
    }
}
