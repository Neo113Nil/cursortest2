package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AudioBufferingHandlerThread.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class ll4 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ll4(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((ml4) this.receiver).isAlive());
            default:
                ((com.vk.voip.ui.hint.a) this.receiver).i();
                return s3q0.a;
        }
    }
}
