package defpackage;

import kotlin.a;

/* loaded from: classes4.dex */
public final class fys implements xh2 {
    public final myu0 a = new myu0();
    public final i3y b;
    public final i3y c;
    public final i3y d;
    public final i3y e;

    public fys() {
        final int i = 0;
        this.b = a.a(new sls(this) { // from class: dys
            public final /* synthetic */ fys b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                fys fysVar = this.b;
                switch (i2) {
                    case 0:
                        return new iu1(fysVar.a);
                    case 1:
                        return new vy01(fysVar.a);
                    case 2:
                        return new vkm0(fysVar.a);
                    default:
                        return new xwk0(fysVar.a);
                }
            }
        });
        final int i2 = 1;
        this.c = a.a(new sls(this) { // from class: dys
            public final /* synthetic */ fys b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                fys fysVar = this.b;
                switch (i22) {
                    case 0:
                        return new iu1(fysVar.a);
                    case 1:
                        return new vy01(fysVar.a);
                    case 2:
                        return new vkm0(fysVar.a);
                    default:
                        return new xwk0(fysVar.a);
                }
            }
        });
        final int i3 = 2;
        this.d = a.a(new sls(this) { // from class: dys
            public final /* synthetic */ fys b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                fys fysVar = this.b;
                switch (i22) {
                    case 0:
                        return new iu1(fysVar.a);
                    case 1:
                        return new vy01(fysVar.a);
                    case 2:
                        return new vkm0(fysVar.a);
                    default:
                        return new xwk0(fysVar.a);
                }
            }
        });
        final int i4 = 3;
        this.e = a.a(new sls(this) { // from class: dys
            public final /* synthetic */ fys b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i4;
                fys fysVar = this.b;
                switch (i22) {
                    case 0:
                        return new iu1(fysVar.a);
                    case 1:
                        return new vy01(fysVar.a);
                    case 2:
                        return new vkm0(fysVar.a);
                    default:
                        return new xwk0(fysVar.a);
                }
            }
        });
    }

    @Override // defpackage.xh2
    public final void a(tg2 tg2Var, ryh ryhVar, o530 o530Var) {
        cys cysVar = (cys) tg2Var;
        eys eysVar = new eys(cysVar, o530Var, ryhVar);
        myu0 myu0Var = this.a;
        myu0Var.a.clear();
        myu0Var.b = eysVar;
        lu1 lu1Var = cysVar.e;
        if (lu1Var != null) {
            ((iu1) this.b.getValue()).b(new gu1(cysVar.a, cysVar.b, cysVar.c, cysVar.d, lu1Var), ryhVar);
        }
        gw01 gw01Var = cysVar.f;
        if (gw01Var != null) {
            yy01 yy01Var = gw01Var.a;
            if (yy01Var != null) {
                ((vy01) this.c.getValue()).b(new uy01(cysVar.a, cysVar.b, cysVar.c, cysVar.d, yy01Var), ryhVar);
            }
            ykm0 ykm0Var = gw01Var.b;
            if (ykm0Var != null) {
                ((vkm0) this.d.getValue()).b(new ukm0(cysVar.a, cysVar.b, cysVar.c, cysVar.d, ykm0Var), ryhVar);
            }
            axk0 axk0Var = gw01Var.c;
            if (axk0Var != null) {
                ((xwk0) this.e.getValue()).b(new wwk0(cysVar.a, cysVar.b, cysVar.c, cysVar.d, axk0Var), ryhVar);
            }
        }
    }
}
