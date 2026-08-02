package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;

/* loaded from: classes10.dex */
public final class k50 extends x40 {
    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", (IntentSenderRequest) obj);
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
