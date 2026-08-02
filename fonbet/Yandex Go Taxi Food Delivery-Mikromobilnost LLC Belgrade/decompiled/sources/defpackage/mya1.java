package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.util.Log;
import android.view.DragEvent;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.view.b;

/* loaded from: classes11.dex */
public abstract class mya1 {
    public static mgv a;

    public static final lum a(wls wlsVar, tls tlsVar) {
        return new lum(new t1m0((byte) 0, 18), t5m0.a, new p5m0(wlsVar, tlsVar, 1), u5m0.a);
    }

    public static boolean b(AppCompatEditText appCompatEditText, DragEvent dragEvent) {
        Activity activity;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && b.h(appCompatEditText) != null) {
            Context context = appCompatEditText.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + appCompatEditText);
                return false;
            }
            if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                return ur2.a(dragEvent, appCompatEditText, activity);
            }
        }
        return false;
    }

    public static boolean c(AppCompatEditText appCompatEditText, int i) {
        jge jgeVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || b.h(appCompatEditText) == null || !(i == 16908322 || i == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) appCompatEditText.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                jgeVar = new gyc(primaryClip, 1);
            } else {
                kge kgeVar = new kge();
                kgeVar.b = primaryClip;
                kgeVar.c = 1;
                jgeVar = kgeVar;
            }
            jgeVar.g(i != 16908322 ? 1 : 0);
            b.l(appCompatEditText, jgeVar.build());
        }
        return true;
    }

    public static void d(int i, int i2) {
        String d;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                d = bza1.d("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    ny61.g(unr0.m(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
                    return;
                }
                d = bza1.d("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(d);
        }
    }

    public static void e(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? f(i, i3, "start index") : (i2 < 0 || i2 > i3) ? f(i2, i3, "end index") : bza1.d("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String f(int i, int i2, String str) {
        if (i < 0) {
            return bza1.d("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return bza1.d("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        ny61.g(unr0.m(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
        return null;
    }
}
