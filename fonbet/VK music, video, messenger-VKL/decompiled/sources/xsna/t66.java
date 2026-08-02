package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BaseAuthPresenter.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class t66 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t66(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((com.vk.auth.main.e) this.receiver).h();
                return s3q0.a;
            case 1:
                ((zqh0) this.receiver).c();
                return s3q0.a;
            default:
                return Boolean.valueOf(((g950) this.receiver).c());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t66(Object obj) {
        super(0, obj, g950.class, "hasMusicSubscriptionForOffline", "hasMusicSubscriptionForOffline()Z", 0);
        this.b = 2;
    }
}
