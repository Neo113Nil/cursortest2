package xsna;

import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: NewsfeedRouterImpl.kt */
/* loaded from: classes4.dex */
public final class qw60 implements fcn {
    public final /* synthetic */ Ref$ObjectRef<dw20> b;

    public qw60(Ref$ObjectRef<dw20> ref$ObjectRef) {
        this.b = ref$ObjectRef;
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    @Override // xsna.fcn
    public final void b(boolean z) {
        dw20 dw20Var = this.b.element;
        if (dw20Var != null) {
            dw20Var.hide();
        }
    }

    @Override // xsna.fcn
    public final void dismiss() {
        b(false);
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }
}
