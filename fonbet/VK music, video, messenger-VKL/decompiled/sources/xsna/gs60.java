package xsna;

import xsna.ds60;

/* compiled from: NewsfeedListUpdateItemsTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class gs60 extends evg0<ur60, on50, ds60.h, ds60, qr60, yo60> {
    public final qn60 f;
    public final pn60 g;

    public gs60(qn60 qn60Var, pn60 pn60Var, jm50 jm50Var, nn50<ur60, on50, ds60, qr60, yo60> nn50Var) {
        super(jm50Var, nn50Var);
        this.f = qn60Var;
        this.g = pn60Var;
    }

    @Override // xsna.mn50
    public final /* bridge */ /* synthetic */ jn50 d(hn50 hn50Var) {
        s((ds60.h) hn50Var);
        return null;
    }

    public final void s(ds60.h hVar) {
        if (hVar instanceof ds60.h.b) {
            fs60.b(this, new u14(15, this, (ds60.h.b) hVar));
        } else if (hVar instanceof ds60.h.a) {
            fs60.b(this, new com.vk.movika.sdk.base.logic.processor.actions.e(15, this, (ds60.h.a) hVar));
        }
    }
}
