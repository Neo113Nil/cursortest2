package xsna;

import android.app.Activity;
import android.content.IntentSender;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class us01 {
    public final /* synthetic */ Activity a;

    public us01(Activity activity) {
        this.a = activity;
    }

    public final void a(IntentSender intentSender, int i) throws IntentSender.SendIntentException {
        this.a.startIntentSenderForResult(intentSender, i, null, 0, 0, 0);
    }
}
