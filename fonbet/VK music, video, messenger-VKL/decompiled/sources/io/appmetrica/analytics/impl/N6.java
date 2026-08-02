package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: classes8.dex */
public final class N6 extends ResultReceiver {
    public final M6 a;

    public N6(Handler handler, M6 m6) {
        super(handler);
        this.a = m6;
    }

    public static void a(ResultReceiver resultReceiver, C4797e4 c4797e4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            c4797e4.b(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.a.a(i, bundle);
    }

    public static void a(ResultReceiver resultReceiver, Tl tl, C4797e4 c4797e4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("startup_error_key_code", tl.a);
            c4797e4.b(bundle);
            resultReceiver.send(2, bundle);
        }
    }
}
