package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: NetworkInitTaskLogic.kt */
/* loaded from: classes11.dex */
public final /* synthetic */ class u360 extends FunctionReferenceImpl implements gzs<Boolean> {
    @Override // xsna.gzs
    public final Boolean invoke() {
        ((o2l) this.receiver).getClass();
        boolean z = false;
        if (o2l.g() && o2l.b("__dbg_network_fail_on_request_knet", false)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
