package xsna;

import com.vk.dto.common.Peer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: WriteRestrictionInteractor.kt */
/* loaded from: classes2.dex */
public final class v2y0 {
    public final mjg a;
    public final ezv b;

    public v2y0(mjg mjgVar, ezv ezvVar) {
        this.a = mjgVar;
        this.b = ezvVar;
    }

    public final Object a(int i, long j, Peer peer, SuspendLambda suspendLambda) {
        Object k = myc0.k(hqu0.b(), new s2y0(this, j, peer, i, null), suspendLambda);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
    }

    public final Object b(long j, Peer peer, SuspendLambda suspendLambda) {
        Object k = myc0.k(hqu0.b(), new t2y0(this, j, peer, null), suspendLambda);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
    }
}
