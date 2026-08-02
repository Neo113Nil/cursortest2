package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ModerationConfirmAdultInteractorImpl.kt */
/* loaded from: classes18.dex */
public final class o430 implements n430 {
    public final b25 a;
    public final s430 b;

    /* compiled from: ModerationConfirmAdultInteractorImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<or00, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(or00 or00Var) {
            ((b25) this.receiver).Q(or00Var);
            return s3q0.a;
        }
    }

    public o430(b25 b25Var) {
        s430 s430Var = new s430();
        this.a = b25Var;
        this.b = s430Var;
    }

    @Override // xsna.n430
    public final io.reactivex.rxjava3.core.x<s3q0> a() {
        this.b.a.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.r(rsg0.w0(yfb.x(new tfx("market.setUserIsAdult", new tr(13), new ur(21)))), new np1(new wik(this, 24), 29)).l(new xl0(new a(1, this.a, b25.class, "setMarketAdultConfig", "setMarketAdultConfig(Lcom/vk/dto/account/MarketAdultConfig;)V", 0), 28));
    }
}
