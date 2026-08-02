package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* compiled from: SecureBroadcastExt.kt */
/* loaded from: classes5.dex */
public final class n2i0 {
    public static final void a(Context context, String str, Intent intent) {
        if (nax.a(intent) && !nax.c(intent) && Build.VERSION.SDK_INT >= 34) {
            intent.setPackage(context.getPackageName());
        }
        context.sendBroadcast(intent, str);
    }
}
