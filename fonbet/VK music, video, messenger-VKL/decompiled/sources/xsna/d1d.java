package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ClipItemLikesRenderDelegate.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class d1d extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1d(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((lfe) this.receiver).invalidate();
                return s3q0.a;
            default:
                return Boolean.valueOf(((b25) this.receiver).b());
        }
    }
}
