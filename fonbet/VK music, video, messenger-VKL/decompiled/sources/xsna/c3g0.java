package xsna;

import android.os.ResultReceiver;

/* compiled from: ReplyBarContract.kt */
/* loaded from: classes3.dex */
public interface c3g0 extends dc6<Object> {
    static /* synthetic */ void gg(c3g0 c3g0Var, ResultReceiver resultReceiver, int i) {
        if ((i & 1) != 0) {
            resultReceiver = null;
        }
        c3g0Var.ci(resultReceiver, (i & 2) == 0);
    }

    void ci(ResultReceiver resultReceiver, boolean z);
}
