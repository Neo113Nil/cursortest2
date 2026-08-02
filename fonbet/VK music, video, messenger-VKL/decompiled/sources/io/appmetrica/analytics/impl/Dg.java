package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: classes8.dex */
public final class Dg extends ResultReceiver {
    public final InterfaceC5094pg a;

    public Dg(Handler handler, InterfaceC5094pg interfaceC5094pg) {
        super(handler);
        this.a = interfaceC5094pg;
    }

    public static void a(ResultReceiver resultReceiver, C5298xg c5298xg) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("referrer", c5298xg == null ? null : c5298xg.a());
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            C5298xg c5298xg = null;
            try {
                byte[] byteArray = bundle.getByteArray("referrer");
                if (byteArray != null && byteArray.length != 0) {
                    c5298xg = new C5298xg(byteArray);
                }
            } catch (Throwable unused) {
            }
            this.a.a(c5298xg);
        }
    }
}
