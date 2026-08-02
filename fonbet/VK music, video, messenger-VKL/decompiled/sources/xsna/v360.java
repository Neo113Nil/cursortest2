package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: NetworkInitTaskLogic.kt */
/* loaded from: classes11.dex */
public final /* synthetic */ class v360 extends FunctionReferenceImpl implements gzs<Integer> {
    @Override // xsna.gzs
    public final Integer invoke() {
        ((o2l) this.receiver).getClass();
        return Integer.valueOf(o2l.g() ? Integer.parseInt(o2l.c("__dbg_network_fail_on_request_sleep_timeout", "0")) : 0);
    }
}
