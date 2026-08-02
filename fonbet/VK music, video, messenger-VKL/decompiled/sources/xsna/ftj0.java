package xsna;

import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* compiled from: SingleAlbumHolder.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class ftj0 extends MutablePropertyReference0Impl {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ftj0(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i);
        this.b = i2;
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
    public final Object get() {
        switch (this.b) {
            case 0:
                gtj0 gtj0Var = (gtj0) this.receiver;
                int i = gtj0.I;
                return Boolean.valueOf(gtj0Var.t);
            default:
                cvj0 cvj0Var = (cvj0) this.receiver;
                int i2 = cvj0.n0;
                return Boolean.valueOf(cvj0Var.t);
        }
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
    public final void set(Object obj) {
        switch (this.b) {
            case 0:
                gtj0 gtj0Var = (gtj0) this.receiver;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i = gtj0.I;
                gtj0Var.t = booleanValue;
                break;
            default:
                cvj0 cvj0Var = (cvj0) this.receiver;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                int i2 = cvj0.n0;
                cvj0Var.t = booleanValue2;
                break;
        }
    }
}
