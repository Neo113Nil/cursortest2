package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class o3w0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ k2w0 b;

    public /* synthetic */ o3w0(k2w0 k2w0Var, int i) {
        this.a = i;
        this.b = k2w0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        k2w0 k2w0Var = this.b;
        switch (i) {
            case 0:
                k2w0Var.clarifyAddressViewVisibilityChanged((f2w0) obj);
                break;
            default:
                k2w0Var.renderBottomView((o900) obj);
                break;
        }
        return zy11Var;
    }
}
