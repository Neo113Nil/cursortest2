package xsna;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: SizeConfigStrategy.java */
/* loaded from: classes12.dex */
public final class qxj0 {
    public static final Bitmap.Config[] d;
    public static final Bitmap.Config[] e;
    public static final Bitmap.Config[] f;
    public static final Bitmap.Config[] g;
    public static final Bitmap.Config[] h;
    public final c a = new c(0);
    public final tmu<b, Bitmap> b = new tmu<>();
    public final HashMap c = new HashMap();

    /* compiled from: SizeConfigStrategy.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: SizeConfigStrategy.java */
    public static final class b implements hvb0 {
        public final c a;
        public int b;
        public Bitmap.Config c;

        public b(c cVar) {
            this.a = cVar;
        }

        @Override // xsna.hvb0
        public final void a() {
            this.a.r(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.b == bVar.b && s2r0.b(this.c, bVar.c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = this.b * 31;
            Bitmap.Config config = this.c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return qxj0.c(this.b, this.c);
        }
    }

    /* compiled from: SizeConfigStrategy.java */
    public static class c extends of6 {
        public final hvb0 B() {
            return new b(this);
        }
    }

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
        return X3.j.d + i + "](" + config + ")";
    }

    public final void a(Bitmap bitmap, Integer num) {
        NavigableMap<Integer, Integer> d2 = d(bitmap.getConfig());
        Integer num2 = d2.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                d2.remove(num);
                return;
            } else {
                d2.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(s2r0.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    @Nullable
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int d2 = s2r0.d(config) * i * i2;
        c cVar = this.a;
        hvb0 hvb0Var = (hvb0) ((ArrayDeque) cVar.a).poll();
        if (hvb0Var == null) {
            hvb0Var = cVar.B();
        }
        b bVar = (b) hvb0Var;
        bVar.b = d2;
        bVar.c = config;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = e;
        } else {
            int i3 = a.a[config.ordinal()];
            configArr = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? new Bitmap.Config[]{config} : h : g : f : d;
        }
        int length = configArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i4];
            Integer ceilingKey = d(config2).ceilingKey(Integer.valueOf(d2));
            if (ceilingKey == null || ceilingKey.intValue() > d2 * 8) {
                i4++;
            } else if (ceilingKey.intValue() != d2 || (config2 != null ? !config2.equals(config) : config != null)) {
                cVar.r(bVar);
                int intValue = ceilingKey.intValue();
                hvb0 hvb0Var2 = (hvb0) ((ArrayDeque) cVar.a).poll();
                if (hvb0Var2 == null) {
                    hvb0Var2 = cVar.B();
                }
                bVar = (b) hvb0Var2;
                bVar.b = intValue;
                bVar.c = config2;
            }
        }
        Bitmap a2 = this.b.a(bVar);
        if (a2 != null) {
            a(a2, Integer.valueOf(bVar.b));
            a2.reconfigure(i, i2, config);
        }
        return a2;
    }

    public final NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        HashMap hashMap = this.c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int c2 = s2r0.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        c cVar = this.a;
        hvb0 hvb0Var = (hvb0) ((ArrayDeque) cVar.a).poll();
        if (hvb0Var == null) {
            hvb0Var = cVar.B();
        }
        b bVar = (b) hvb0Var;
        bVar.b = c2;
        bVar.c = config;
        this.b.b(bVar, bitmap);
        NavigableMap<Integer, Integer> d2 = d(bitmap.getConfig());
        Integer num = d2.get(Integer.valueOf(bVar.b));
        d2.put(Integer.valueOf(bVar.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder e2 = fw3.e("SizeConfigStrategy{groupedMap=");
        e2.append(this.b);
        e2.append(", sortedSizes=(");
        HashMap hashMap = this.c;
        for (Map.Entry entry : hashMap.entrySet()) {
            e2.append(entry.getKey());
            e2.append('[');
            e2.append(entry.getValue());
            e2.append("], ");
        }
        if (!hashMap.isEmpty()) {
            e2.replace(e2.length() - 2, e2.length(), "");
        }
        e2.append(")}");
        return e2.toString();
    }
}
