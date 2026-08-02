package xsna;

import android.content.Context;
import android.location.Location;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WebAppLocationBridge.kt */
/* loaded from: classes11.dex */
public final class sex0 {
    public static final sex0 a = new sex0();

    public static void a(Boolean bool) {
        if (!bool.booleanValue()) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(g(str, objArr));
        }
    }

    public static void d(int i, int i2) {
        String g;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                g = g("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(lhg.a(i2, "negative size: "));
                }
                g = g("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(g);
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void f(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static String g(String str, Object... objArr) {
        int indexOf;
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i2)) != -1) {
            sb.append(str.substring(i2, indexOf));
            sb.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        sb.append(str.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final void j(ImageView imageView, Integer num) {
        if (num == null || num.intValue() == 0) {
            imageView.setImageDrawable(null);
            imageView.setVisibility(8);
        } else {
            imageView.setImageResource(num.intValue());
            imageView.setVisibility(0);
        }
    }

    public io.reactivex.rxjava3.internal.operators.observable.z h(Context context) {
        AtomicReference<Location> atomicReference = oxz.a;
        return oxz.c(3000L, context);
    }

    public boolean i(Context context) {
        return pmr0.a(context) || pmr0.b(context);
    }
}
