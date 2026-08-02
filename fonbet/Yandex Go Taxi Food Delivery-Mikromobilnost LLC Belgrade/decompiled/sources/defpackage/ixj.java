package defpackage;

import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.zzco;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class ixj implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ixj(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                synchronized (((eyj) this.b)) {
                    try {
                        eyj eyjVar = (eyj) this.b;
                        if (eyjVar.B == null) {
                            return null;
                        }
                        eyjVar.R();
                        if (((eyj) this.b).o()) {
                            ((eyj) this.b).G();
                            ((eyj) this.b).D = 0;
                        }
                        return null;
                    } finally {
                    }
                }
            default:
                e eVar = ((FirebaseAnalytics) this.b).a;
                eVar.getClass();
                zzco zzcoVar = new zzco();
                eVar.a(new nn91(eVar, zzcoVar));
                return zzcoVar.zzc(120000L);
        }
    }
}
