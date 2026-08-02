package defpackage;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.j;
import com.google.android.gms.measurement.internal.n;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class cla1 extends u791 {
    public final /* synthetic */ int e;
    public final /* synthetic */ tha1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cla1(j jVar, tha1 tha1Var, int i) {
        super(tha1Var);
        this.e = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(jVar);
                this.f = jVar;
                super(tha1Var);
                break;
            default:
                Objects.requireNonNull(jVar);
                this.f = jVar;
                break;
        }
    }

    @Override // defpackage.u791
    public final void a() {
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        int i = this.e;
        tha1 tha1Var = this.f;
        switch (i) {
            case 0:
                j jVar = ((g) ((j) tha1Var).b).F;
                g.f(jVar);
                new Thread(new xka1(jVar, 0)).start();
                break;
            case 1:
                ((j) tha1Var).fh();
                break;
            default:
                n nVar = (n) tha1Var;
                nVar.M1().Gg();
                String str = (String) nVar.J.pollFirst();
                if (str != null) {
                    ((kl40) nVar.q4()).getClass();
                    nVar.d0 = SystemClock.elapsedRealtime();
                    nVar.B0().H.b(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    Context context = nVar.E.a;
                    if (Build.VERSION.SDK_INT < 34) {
                        context.sendBroadcast(intent);
                    } else {
                        makeBasic = BroadcastOptions.makeBasic();
                        shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                        bundle = shareIdentityEnabled.toBundle();
                        context.sendBroadcast(intent, null, bundle);
                    }
                }
                nVar.C();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cla1(n nVar, tha1 tha1Var) {
        super(tha1Var);
        this.e = 2;
        this.f = nVar;
    }
}
