package xsna;

import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class tm9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Ref$BooleanRef c;

    public /* synthetic */ tm9(Ref$BooleanRef ref$BooleanRef, int i) {
        this.b = i;
        this.c = ref$BooleanRef;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.element = true;
                break;
            default:
                lu60 lu60Var = (lu60) obj;
                this.c.element = (lu60Var instanceof ew60) || (lu60Var instanceof bl60);
                break;
        }
        return s3q0.a;
    }
}
