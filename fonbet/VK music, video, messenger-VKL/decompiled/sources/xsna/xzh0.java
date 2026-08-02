package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SearchVideoServiceRootDelegate.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class xzh0 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xzh0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((uzh0) this.receiver).b();
                break;
            default:
                ((wzh0) this.receiver).j();
                break;
        }
        return s3q0.a;
    }
}
