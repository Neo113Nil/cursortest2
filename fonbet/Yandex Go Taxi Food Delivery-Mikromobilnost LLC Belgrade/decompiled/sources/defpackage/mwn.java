package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes8.dex */
public final class mwn implements z320 {
    @Override // defpackage.z320
    public final PendingIntent a(Context context, String str) {
        return PendingIntent.getActivity(context, 0, new Intent(), 201326592);
    }
}
