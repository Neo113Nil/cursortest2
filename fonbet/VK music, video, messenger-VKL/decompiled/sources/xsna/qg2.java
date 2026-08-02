package xsna;

import com.huawei.hms.support.api.entity.common.CommonConstant;

/* compiled from: AnimatedBoundaryDrawState.kt */
/* loaded from: classes16.dex */
public final class qg2 implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public qg2(com.vk.im.ui.components.contacts.b bVar, boolean z) {
        this.d = bVar;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                vg2 vg2Var = (vg2) this.d;
                return Integer.valueOf((!this.c || vg2Var.c <= 0) ? vg2Var.a.a.getAlpha() : 255);
            default:
                com.vk.im.ui.components.contacts.b bVar = (com.vk.im.ui.components.contacts.b) this.d;
                bVar.o.onNext(gdj.a(bVar.d(), null, sbj.a(bVar.d().e, null, null, null, null, null, this.c, null, 64511), null, null, null, false, null, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS));
                return s3q0.a;
        }
    }

    public qg2(boolean z, vg2 vg2Var) {
        this.c = z;
        this.d = vg2Var;
    }
}
