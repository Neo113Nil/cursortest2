package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.common.api.internal.zabx;

/* loaded from: classes11.dex */
public abstract class d091 extends qke {
    public static void J(Context context, zabx zabxVar, IntentFilter intentFilter) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            context.registerReceiver(zabxVar, intentFilter, i >= 33 ? 2 : 0);
        } else {
            context.registerReceiver(zabxVar, intentFilter);
        }
    }
}
