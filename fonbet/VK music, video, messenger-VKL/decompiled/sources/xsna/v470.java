package xsna;

import kotlin.jvm.internal.Lambda;
import xsna.q630;

/* compiled from: NodeChain.kt */
/* loaded from: classes11.dex */
public final class v470 extends Lambda implements izs<q630.b, Boolean> {
    final /* synthetic */ ci50<q630.b> $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v470(ci50<q630.b> ci50Var) {
        super(1);
        this.$result = ci50Var;
    }

    @Override // xsna.izs
    public final Boolean invoke(q630.b bVar) {
        this.$result.b(bVar);
        return Boolean.TRUE;
    }
}
