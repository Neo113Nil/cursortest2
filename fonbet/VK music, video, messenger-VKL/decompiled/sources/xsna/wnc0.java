package xsna;

import android.view.View;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PostingStep1View.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class wnc0 extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        enc0 enc0Var = (enc0) this.receiver;
        View view = enc0Var.y;
        if (view != null) {
            bwt0.d0(view, !booleanValue);
        }
        View view2 = enc0Var.x;
        if (view2 != null) {
            bwt0.d0(view2, !booleanValue);
        }
        return s3q0.a;
    }
}
