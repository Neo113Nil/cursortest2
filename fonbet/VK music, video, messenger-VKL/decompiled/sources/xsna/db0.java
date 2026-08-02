package xsna;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;

/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes11.dex */
public final class db0 extends va0<IntentSenderRequest, ActivityResult> {
    @Override // xsna.va0
    public final Intent a(Context context, IntentSenderRequest intentSenderRequest) {
        return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
    }

    @Override // xsna.va0
    public final ActivityResult c(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
