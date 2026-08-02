package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.util.LongSparseArray;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: KeyboardController.kt */
/* loaded from: classes.dex */
public final class ify {
    public static final int a;
    public static final LongSparseArray<Integer> b;
    public static int c;
    public static final CopyOnWriteArrayList<WeakReference<a>> d;
    public static final bpn0 e;

    /* compiled from: KeyboardController.kt */
    public interface a {
        void Y0();

        void x0(int i);
    }

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        a = hbh0.b(100, context);
        b = new LongSparseArray<>();
        d = new CopyOnWriteArrayList<>();
        e = new bpn0(new mb8(3));
    }

    public static void a(a aVar) {
        d.add(new WeakReference<>(aVar));
    }

    public static long b(Context context) {
        return (context.getResources().getDisplayMetrics().widthPixels << 32) | (context.getResources().getDisplayMetrics().heightPixels << 16) | context.getResources().getDisplayMetrics().densityDpi;
    }

    public static int c(Context context, Integer num) {
        LongSparseArray<Integer> longSparseArray = b;
        if (longSparseArray.size() == 0) {
            Context context2 = e43.a;
            if (context2 == null) {
                context2 = null;
            }
            int d2 = hbh0.d(context2);
            bpn0 bpn0Var = e;
            for (String str : ((SharedPreferences) bpn0Var.getValue()).getAll().keySet()) {
                longSparseArray.put(Long.parseLong(str), Integer.valueOf(((SharedPreferences) bpn0Var.getValue()).getInt(str, d2 / 2)));
            }
        }
        return longSparseArray.get(b(context), Integer.valueOf(num != null ? num.intValue() : hbh0.d(context) / 2)).intValue();
    }

    public static int d(int i, Integer num) {
        if ((i & 1) != 0) {
            num = null;
        }
        Context context = e43.a;
        return c(context != null ? context : null, num);
    }

    public static boolean e(int i) {
        return i > a;
    }

    public static void f(Rect rect) {
        int i = c;
        int i2 = rect.bottom;
        if (i == i2) {
            return;
        }
        c = i2;
        if (e(i2)) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            b.put(b(context), Integer.valueOf(rect.bottom));
            SharedPreferences.Editor edit = ((SharedPreferences) e.getValue()).edit();
            Context context2 = e43.a;
            edit.putInt(String.valueOf(b(context2 != null ? context2 : null)), rect.bottom).apply();
        }
        boolean e2 = e(rect.bottom);
        CopyOnWriteArrayList<WeakReference<a>> copyOnWriteArrayList = d;
        if (!e2) {
            Iterator<WeakReference<a>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                a aVar = it.next().get();
                if (aVar != null) {
                    aVar.Y0();
                }
            }
            return;
        }
        int i3 = c;
        Iterator<WeakReference<a>> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            a aVar2 = it2.next().get();
            if (aVar2 != null) {
                aVar2.x0(i3);
            }
        }
    }

    public static void g(a aVar) {
        CopyOnWriteArrayList<WeakReference<a>> copyOnWriteArrayList = d;
        Iterator<WeakReference<a>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<a> next = it.next();
            if (next.get() == aVar) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }
}
