package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BaseAuthPresenter.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class r66 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r66(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((com.vk.auth.main.e) this.receiver).d();
                return s3q0.a;
            case 1:
                return ((rew0) ((va9) this.receiver).f.getValue()).f();
            case 2:
                return Integer.valueOf(((frn0) this.receiver).d());
            default:
                return Boolean.valueOf(((g950) this.receiver).c());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r66(Object obj) {
        super(0, obj, va9.class, "getCurrentCallUserId", "getCurrentCallUserId()Lcom/vk/dto/common/id/UserId;", 0);
        this.b = 1;
    }
}
