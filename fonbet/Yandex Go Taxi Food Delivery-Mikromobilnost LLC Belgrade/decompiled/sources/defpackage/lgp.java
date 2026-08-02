package defpackage;

/* loaded from: classes6.dex */
public final class lgp implements tys {
    public final /* synthetic */ int a;
    public final cms b;
    public final cms c;

    public /* synthetic */ lgp(cms cmsVar, cms cmsVar2, int i) {
        this.a = i;
        this.b = cmsVar;
        this.c = cmsVar2;
    }

    @Override // defpackage.tys
    public final void a(wys wysVar, Object obj) {
        int i = this.a;
        cms cmsVar = this.c;
        switch (i) {
            case 0:
                ((wls) cmsVar).invoke(wysVar, (w2x) obj);
                break;
            case 1:
                ((wls) cmsVar).invoke(wysVar, (zjk0) obj);
                break;
            case 2:
                ((wls) cmsVar).invoke(wysVar, obj);
                break;
            default:
                ((wls) ((tfx) this.b)).invoke(wysVar, obj);
                break;
        }
    }

    @Override // defpackage.tys
    public final boolean b(Object obj, Object obj2) {
        int i = this.a;
        cms cmsVar = this.b;
        switch (i) {
            case 0:
                return ((Boolean) ((wls) cmsVar).invoke((w2x) obj, (w2x) obj2)).booleanValue();
            case 1:
                return ((Boolean) ((wls) cmsVar).invoke((zjk0) obj, (zjk0) obj2)).booleanValue();
            case 2:
                return ((Boolean) ((wls) cmsVar).invoke(obj, obj2)).booleanValue();
            default:
                jgx jgxVar = (jgx) this.c;
                return !jl40.l(jgxVar.get(obj), jgxVar.get(obj2));
        }
    }
}
