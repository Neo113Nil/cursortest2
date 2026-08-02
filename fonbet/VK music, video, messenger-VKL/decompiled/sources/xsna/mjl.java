package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class mjl implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ mjl(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.setValue(jgz.j((tny) obj, true));
                break;
            default:
                Float f = (Float) obj;
                f.floatValue();
                this.c.setValue(f);
                break;
        }
        return s3q0.a;
    }
}
