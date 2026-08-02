package xsna;

import android.net.ConnectivityManager;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: WorkConstraintsTracker.kt */
/* loaded from: classes12.dex */
public final class suw extends Lambda implements gzs<s3q0> {
    final /* synthetic */ Ref$BooleanRef $callbackRegistered;
    final /* synthetic */ ConnectivityManager $connManager;
    final /* synthetic */ androidx.work.impl.constraints.b $networkCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public suw(Ref$BooleanRef ref$BooleanRef, ConnectivityManager connectivityManager, androidx.work.impl.constraints.b bVar) {
        super(0);
        this.$callbackRegistered = ref$BooleanRef;
        this.$connManager = connectivityManager;
        this.$networkCallback = bVar;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        if (this.$callbackRegistered.element) {
            m100 c = m100.c();
            int i = wux0.a;
            c.getClass();
            this.$connManager.unregisterNetworkCallback(this.$networkCallback);
        }
        return s3q0.a;
    }
}
