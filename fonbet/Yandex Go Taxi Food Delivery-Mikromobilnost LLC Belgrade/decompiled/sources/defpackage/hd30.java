package defpackage;

import android.content.Context;
import ru.yandex.taxi.banners.c;

/* loaded from: classes14.dex */
public final class hd30 extends h55 {
    public final /* synthetic */ int D;
    public final Object E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hd30(int i, Object obj) {
        super(null);
        this.D = i;
        this.E = obj;
    }

    @Override // defpackage.h55
    public void I(Object obj) {
        switch (this.D) {
            case 1:
                c cVar = (c) this.E;
                cVar.e();
                cVar.o();
                break;
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        int i = this.D;
        int i2 = 22;
        int i3 = 1;
        Object obj2 = this.E;
        switch (i) {
            case 0:
                z((m950) ((i020) obj2).get(), new wz00(this, i3));
                break;
            case 1:
                ((c) obj2).g(((y7n0) obj).a, null, null, new qa0(22, this), new hxj0(29, this), true);
                break;
            default:
                e6g e6gVar = (e6g) obj2;
                e6gVar.getClass();
                int i4 = 13;
                flx0 flx0Var = new flx0(new y501(new pbg(e6gVar, 3), i4), new pbg(e6gVar, 12), i2);
                pbg pbgVar = new pbg(e6gVar, 8);
                pbg pbgVar2 = new pbg(e6gVar, 17);
                pbg pbgVar3 = new pbg(e6gVar, i3);
                pbg pbgVar4 = new pbg(e6gVar, 14);
                pbg pbgVar5 = new pbg(e6gVar, 2);
                pbg pbgVar6 = new pbg(e6gVar, 11);
                int i5 = 20;
                flx0 flx0Var2 = new flx0(new pbg(e6gVar, 9), new pbg(e6gVar, 10), i5);
                y501 y501Var = new y501(new pbg(e6gVar, i5), 16);
                qcz0 qcz0Var = new qcz0(new pbg(e6gVar, 4), 19);
                usx0 usx0Var = new usx0(pbgVar3, pbgVar4, pbgVar5, flx0Var, (xvf0) ap01.a, pbgVar6, flx0Var2, y501Var, qcz0Var);
                oti otiVar = new oti(new pbg(e6gVar, i4), new pbg(e6gVar, 15), 11);
                pbg pbgVar7 = new pbg(e6gVar, 5);
                pbg pbgVar8 = new pbg(e6gVar, 7);
                int i6 = 0;
                n3w a = n3w.a(new tp01(new hwo0(n3w.a(new pp01(new vmn0(flx0Var, pbgVar, pbgVar2, usx0Var, new u6o0((xvf0) otiVar, (xvf0) new gh10(pbgVar7, pbgVar8, i3), (xvf0) new gh10(pbgVar7, pbgVar8, 2), (xvf0) new gh10(pbgVar7, pbgVar8, i6), (xvf0) new flx0(pbgVar4, new pbg(e6gVar, 6), 17), (xvf0) qcz0Var, 28), new pbg(e6gVar, i6)))), new pbg(e6gVar, 16), pbgVar2, new pbg(e6gVar, 19), 26)));
                pbg pbgVar9 = new pbg(e6gVar, 18);
                i130 i130Var = (i130) e6gVar.t;
                q5z.h(i130Var);
                Context context = (Context) e6gVar.e;
                q5z.h(context);
                exu0 exu0Var = (exu0) e6gVar.d;
                q5z.h(exu0Var);
                pwy0 pwy0Var = (pwy0) e6gVar.h;
                q5z.h(pwy0Var);
                z(new fl5(i130Var, context, exu0Var, pwy0Var, (tp01) a.a, pbgVar9), new yio0(24, this));
                break;
        }
    }
}
