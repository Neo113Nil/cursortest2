package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class s810 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s810(izs izsVar, boolean z) {
        this.b = 2;
        this.d = izsVar;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                break;
            case 1:
                f840 f840Var = (f840) this.d;
                if (this.c) {
                    f840Var.m.dispose();
                    f840Var.g.a();
                }
                break;
            default:
                ((izs) this.d).invoke(Boolean.valueOf(!this.c));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ s810(boolean z, Object obj, int i) {
        this.b = i;
        this.c = z;
        this.d = obj;
    }
}
