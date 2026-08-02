package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VoipMediaMuteAnalyticsDelegateImpl.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class zrw0 extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
    public zrw0(c3x0 c3x0Var) {
        super(1, c3x0Var, esw0.class, "onAdminUserVideoDisabled", "onAdminUserVideoDisabled(Z)V", 0);
    }

    @Override // xsna.izs
    public final s3q0 invoke(Boolean bool) {
        ((esw0) this.receiver).b(bool.booleanValue());
        return s3q0.a;
    }
}
