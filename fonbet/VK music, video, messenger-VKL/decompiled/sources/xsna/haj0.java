package xsna;

import android.net.ConnectivityManager;
import androidx.work.impl.constraints.c;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Lambda;

/* compiled from: WorkConstraintsTracker.kt */
/* loaded from: classes12.dex */
public final class haj0 extends Lambda implements gzs<s3q0> {
    final /* synthetic */ ConnectivityManager $connManager;
    final /* synthetic */ izs<androidx.work.impl.constraints.a, s3q0> $onConstraintState;
    final /* synthetic */ androidx.work.impl.constraints.d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public haj0(c.b bVar, ConnectivityManager connectivityManager, androidx.work.impl.constraints.d dVar) {
        super(0);
        this.$onConstraintState = bVar;
        this.$connManager = connectivityManager;
        this.this$0 = dVar;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        Object obj = androidx.work.impl.constraints.d.b;
        izs<androidx.work.impl.constraints.a, s3q0> izsVar = this.$onConstraintState;
        ConnectivityManager connectivityManager = this.$connManager;
        androidx.work.impl.constraints.d dVar = this.this$0;
        synchronized (obj) {
            LinkedHashMap linkedHashMap = androidx.work.impl.constraints.d.c;
            linkedHashMap.remove(izsVar);
            if (linkedHashMap.isEmpty()) {
                m100 c = m100.c();
                int i = wux0.a;
                c.getClass();
                connectivityManager.unregisterNetworkCallback(dVar);
            }
        }
        return s3q0.a;
    }
}
