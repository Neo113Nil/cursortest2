package xsna;

import xsna.ddv;

/* compiled from: VoipScheduleCallView.kt */
/* loaded from: classes7.dex */
public final class lxw0 implements ddv.b<hfz> {
    public final /* synthetic */ oxw0 a;

    public lxw0(oxw0 oxw0Var) {
        this.a = oxw0Var;
    }

    @Override // xsna.ddv.b
    public final hfz a(int i) {
        sxm adapter;
        adapter = this.a.getAdapter();
        return (hfz) j5g.b0(i, adapter.getItems());
    }
}
