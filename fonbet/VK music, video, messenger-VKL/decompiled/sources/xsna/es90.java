package xsna;

import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bbv0;

/* compiled from: PayVerificationPresenter.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class es90 extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(Throwable th) {
        as90 as90Var = ((cs90) this.receiver).e;
        as90Var.un();
        bbv0.g.getClass();
        bbv0.a.c(th);
        as90Var.Sk(R.string.vk_pay_checkout_something_wrong);
        return s3q0.a;
    }
}
