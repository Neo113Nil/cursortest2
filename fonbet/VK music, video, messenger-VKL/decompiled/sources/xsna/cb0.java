package xsna;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;

/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes.dex */
public final class cb0 extends va0<Intent, ActivityResult> {
    @Override // xsna.va0
    public final Intent a(Context context, Intent intent) {
        return intent;
    }

    @Override // xsna.va0
    public final ActivityResult c(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
