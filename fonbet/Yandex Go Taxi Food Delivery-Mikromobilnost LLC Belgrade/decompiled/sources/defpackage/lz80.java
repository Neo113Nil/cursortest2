package defpackage;

import com.yandex.go.overdraft.g;

/* loaded from: classes13.dex */
public final /* synthetic */ class lz80 implements sy60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ lz80(g gVar, int i) {
        this.a = i;
        this.b = gVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        g gVar = this.b;
        switch (i) {
            case 0:
                mz80 mz80Var = gVar.a0;
                if (mz80Var != null) {
                    mz80Var.a(zy80.a);
                }
                gVar.r(new qu(9));
                break;
            default:
                rz80 rz80Var = (rz80) gVar.x;
                if (rz80Var instanceof pz80) {
                    pz80 pz80Var = (pz80) rz80Var;
                    j4n j4nVar = gVar.Z;
                    if (j4nVar != null) {
                        f28 o = j4nVar.o();
                        ((com.yandex.go.overdraft.domain.g) gVar.M.get()).f();
                        gVar.D(o, pz80Var, new lz80(gVar, 0));
                        break;
                    }
                }
                break;
        }
    }
}
