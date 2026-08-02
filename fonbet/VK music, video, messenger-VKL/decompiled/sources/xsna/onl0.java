package xsna;

import java.util.List;

/* compiled from: StorefrontServicesFaveController.kt */
/* loaded from: classes18.dex */
public final class onl0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ onl0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((lq9) this.c).resumeWith(Boolean.FALSE);
                return s3q0.a;
            default:
                ((List) this.c).get(((Number) obj).intValue());
                return null;
        }
    }
}
