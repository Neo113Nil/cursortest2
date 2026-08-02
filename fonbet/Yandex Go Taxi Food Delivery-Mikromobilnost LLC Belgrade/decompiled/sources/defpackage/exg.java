package defpackage;

/* loaded from: classes9.dex */
public final /* synthetic */ class exg implements okx {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ exg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.okx
    public final v0x a(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return jl40.l(obj, qoi0.a(rwg.class)) ? swg.c : ((okx) obj2).a(obj);
            case 1:
                return new ld80((jc60) obj2);
            case 2:
                return (v0x) ((icc0) obj2).get();
            default:
                return new pur0((o370) obj2, obj);
        }
    }
}
