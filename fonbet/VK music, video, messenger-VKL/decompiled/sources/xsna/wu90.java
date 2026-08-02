package xsna;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* compiled from: PendingIntentCompat.java */
/* loaded from: classes11.dex */
public final class wu90 {
    public static PendingIntent a(Context context, Intent intent) {
        return PendingIntent.getActivity(context, 0, intent, 201326592);
    }
}
