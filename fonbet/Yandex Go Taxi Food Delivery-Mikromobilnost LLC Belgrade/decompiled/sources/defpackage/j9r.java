package defpackage;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;

/* loaded from: classes10.dex */
public final class j9r {
    public final Context a;

    public j9r(Context context) {
        this.a = context;
    }

    public final void a(jdj jdjVar, u18 u18Var) {
        CancellationSignal cancellationSignal;
        if (u18Var != null) {
            synchronized (u18Var) {
                try {
                    if (u18Var.c == null) {
                        CancellationSignal cancellationSignal2 = new CancellationSignal();
                        u18Var.c = cancellationSignal2;
                        if (u18Var.a) {
                            cancellationSignal2.cancel();
                        }
                    }
                    cancellationSignal = u18Var.c;
                } finally {
                }
            }
        } else {
            cancellationSignal = null;
        }
        FingerprintManager b = h9r.b(this.a);
        if (b != null) {
            h9r.a(b, h9r.e(jdjVar), cancellationSignal, new g9r());
        }
    }
}
