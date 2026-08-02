package ru.rustore.sdk.activitylauncher;

import android.os.Bundle;
import android.os.ResultReceiver;
import ru.rustore.sdk.activitylauncher.a;
import xsna.qa80;

/* compiled from: CallbackResultReceiver.kt */
/* loaded from: classes9.dex */
public final class CallbackResultReceiver extends ResultReceiver {
    public final qa80 b;

    public CallbackResultReceiver(qa80 qa80Var) {
        super(null);
        this.b = qa80Var;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        super.onReceiveResult(i, bundle);
        this.b.g(i != -1 ? i != 0 ? i != 2 ? i != 9901 ? i != 9902 ? new a.d(i) : a.f.b : a.e.b : a.C2395a.b : a.b.b : a.c.b);
    }
}
