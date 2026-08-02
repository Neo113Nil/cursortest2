package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GetStepsCommand.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class put extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ put(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((kut) this.receiver).j();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                ((bp70) this.receiver).U0();
                break;
            default:
                ((hpb0) this.receiver).t();
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public put(Object obj) {
        super(0, obj, bp70.class, "loadAndFallbackToAnotherVerificationMethod", "loadAndFallbackToAnotherVerificationMethod()V", 0);
        this.b = 3;
    }
}
