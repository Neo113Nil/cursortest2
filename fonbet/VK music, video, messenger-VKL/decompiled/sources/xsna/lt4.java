package xsna;

import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* compiled from: AudioPlaylistHolder.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class lt4 extends MutablePropertyReference0Impl {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lt4(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i);
        this.b = i2;
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
    public final Object get() {
        switch (this.b) {
            case 0:
                nt4 nt4Var = (nt4) this.receiver;
                int i = nt4.U;
                return Boolean.valueOf(nt4Var.t);
            default:
                tuj0 tuj0Var = (tuj0) this.receiver;
                int i2 = tuj0.G;
                return Boolean.valueOf(tuj0Var.t);
        }
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
    public final void set(Object obj) {
        switch (this.b) {
            case 0:
                nt4 nt4Var = (nt4) this.receiver;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i = nt4.U;
                nt4Var.t = booleanValue;
                break;
            default:
                tuj0 tuj0Var = (tuj0) this.receiver;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                int i2 = tuj0.G;
                tuj0Var.t = booleanValue2;
                break;
        }
    }
}
