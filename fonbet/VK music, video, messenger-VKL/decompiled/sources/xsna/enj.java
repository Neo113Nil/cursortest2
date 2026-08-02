package xsna;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import java.util.Arrays;
import xsna.e3m;

/* compiled from: ContextExt.kt */
/* loaded from: classes.dex */
public final class enj {
    public static final bpn0 a = new bpn0(new jvg(1));

    public static final void a(Drawable drawable, int i, int i2) {
        Drawable findDrawableByLayerId;
        LayerDrawable layerDrawable = drawable instanceof LayerDrawable ? (LayerDrawable) drawable : null;
        if (layerDrawable == null || (findDrawableByLayerId = layerDrawable.findDrawableByLayerId(i)) == null) {
            return;
        }
        findDrawableByLayerId.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_ATOP));
    }

    public static final Activity b(View view) {
        while (e3m.h(view.getContext()) == null) {
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                return null;
            }
        }
        return e3m.h(view.getContext());
    }

    public static final Drawable c(int i, int i2, Context context) {
        e3m.a aVar = e3m.a;
        Drawable mutate = m33.a(i, context).mutate();
        mutate.setTint(i2);
        return mutate;
    }

    public static final Drawable d(int i, int i2, Context context) {
        e3m.a aVar = e3m.a;
        return c(i, context.getColor(i2), context);
    }

    public static final Drawable e(int i, int i2, Context context) {
        return c(i, e3m.f(i2, context), context);
    }

    public static final String f(int i, int i2, Context context) {
        return context.getResources().getQuantityString(i, i2, Integer.valueOf(i2));
    }

    public static String g(Resources resources, int i, long j, int i2, Object[] objArr) {
        return j >= 1000 ? resources.getString(i2, Arrays.copyOf(objArr, objArr.length)) : h(resources, i, j, Arrays.copyOf(objArr, objArr.length));
    }

    public static final String h(Resources resources, int i, long j, Object... objArr) {
        return resources.getQuantityString(i, (int) (j % 1000), Arrays.copyOf(objArr, objArr.length));
    }

    public static final String i(Resources resources, int i, int i2, int i3, Object... objArr) {
        return i2 > 0 ? resources.getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length)) : resources.getString(i3);
    }

    public static final String[] j(int i, Context context) {
        return context.getResources().getStringArray(i);
    }

    public static final Uri k(int i, Context context) throws Resources.NotFoundException {
        return Uri.parse("android.resource://" + context.getResources().getResourcePackageName(i) + '/' + context.getResources().getResourceTypeName(i) + '/' + context.getResources().getResourceEntryName(i));
    }

    public static final boolean l(Context context, String str) {
        if (context != null) {
            try {
                if (context.checkCallingOrSelfPermission(str) == 0) {
                    return true;
                }
            } catch (RuntimeException unused) {
            }
        }
        return false;
    }

    public static final boolean m(Context context, String... strArr) {
        for (String str : strArr) {
            if (!l(context, str)) {
                return false;
            }
        }
        return true;
    }

    @ozl
    public static final boolean n(Context context) {
        NetworkInfo networkInfo = null;
        ConnectivityManager connectivityManager = (ConnectivityManager) (context != null ? context.getSystemService("connectivity") : null);
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException e) {
                Log.e("PhotoViewer", e.getMessage(), e);
            }
        }
        if (networkInfo != null) {
            return networkInfo.isConnectedOrConnecting();
        }
        return false;
    }

    public static final void o(Context context, Intent intent, io.reactivex.rxjava3.functions.f<Throwable> fVar) {
        try {
            context.startActivity(intent);
        } catch (Throwable th) {
            if (fVar != null) {
                fVar.accept(th);
            }
        }
    }

    public static final void p(Context context, Intent intent) {
        Activity h = e3m.h(context);
        if (h == null) {
            intent.addFlags(268435456);
        }
        if (h != null) {
            context = h;
        }
        context.startActivity(intent);
    }

    public static final s3q0 q(int i, int i2, Context context) {
        if (context == null) {
            return null;
        }
        r(context, context.getString(i), i2);
        return s3q0.a;
    }

    public static final void r(final Context context, final CharSequence charSequence, final int i) {
        if (charSequence == null || charSequence.length() == 0 || context == null) {
            return;
        }
        ((Handler) a.getValue()).post(new Runnable() { // from class: xsna.dnj
            @Override // java.lang.Runnable
            public final void run() {
                Toast.makeText(context, charSequence, i).show();
            }
        });
    }

    public static final void s(Context context, BroadcastReceiver broadcastReceiver) {
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (Throwable th) {
            Log.e("ContextExt", th.getMessage(), th);
        }
    }
}
