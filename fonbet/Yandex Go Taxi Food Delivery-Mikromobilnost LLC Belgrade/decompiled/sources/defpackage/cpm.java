package defpackage;

import com.yx360.design.compose.atoms.DsButtonClose$Type;
import skeletor.render.SkeletonContentView;

/* loaded from: classes11.dex */
public final class cpm implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cpm(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        mgv mgvVar;
        String e;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                DsButtonClose$Type dsButtonClose$Type = (DsButtonClose$Type) obj3;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        return zy11Var;
                    }
                }
                int[] iArr = bpm.a;
                int i2 = iArr[dsButtonClose$Type.ordinal()];
                if (i2 == 1) {
                    qnm qnmVar = qnm.a;
                    mgvVar = klb1.a;
                    if (mgvVar == null) {
                        lgv lgvVar = new lgv("ChevronLeftOutlineSm", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 224);
                        a6t0 a6t0Var = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
                        uq90 uq90Var = new uq90();
                        uq90Var.j(6.186f, 8.086f);
                        uq90Var.h(11.716f, 15.086f);
                        uq90Var.f(9.813f);
                        uq90Var.h(4.283f, 8.086f);
                        uq90Var.h(9.801f, 1.086f);
                        uq90Var.f(11.703f);
                        uq90Var.h(6.186f, 8.086f);
                        uq90Var.c();
                        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", uq90Var.a);
                        mgvVar = lgvVar.d();
                        klb1.a = mgvVar;
                    }
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    qnm qnmVar2 = qnm.a;
                    mgvVar = rnb1.a;
                    if (mgvVar == null) {
                        lgv lgvVar2 = new lgv("CloseOutlineSm", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 224);
                        a6t0 a6t0Var2 = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
                        uq90 g = tse0.g(14.029f, 3.029f, 9.06f, 7.999f);
                        g.h(14.029f, 12.969f);
                        g.h(12.969f, 14.029f);
                        g.h(7.999f, 9.06f);
                        g.h(3.029f, 14.029f);
                        g.h(1.969f, 12.969f);
                        g.h(6.938f, 7.999f);
                        g.h(1.969f, 3.029f);
                        g.h(3.029f, 1.969f);
                        g.h(7.999f, 6.938f);
                        tse0.u(g, 12.969f, 1.969f, 14.029f, 3.029f);
                        lgvVar2.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var2, null, "", g.a);
                        mgvVar = lgvVar2.d();
                        rnb1.a = mgvVar;
                    }
                }
                mgv mgvVar2 = mgvVar;
                int i3 = iArr[dsButtonClose$Type.ordinal()];
                if (i3 == 1) {
                    bts btsVar2 = (bts) fidVar;
                    btsVar2.e0(-1537999635);
                    btsVar2.e0(-1040960805);
                    btsVar2.e0(966458015);
                    e = ohb1.e(btsVar2, gzh0.atoms_back_button);
                    btsVar2.t(false);
                    btsVar2.t(false);
                    btsVar2.t(false);
                } else {
                    if (i3 != 2) {
                        throw unr0.y(-1538001773, (bts) fidVar, false);
                    }
                    bts btsVar3 = (bts) fidVar;
                    btsVar3.e0(-1537997234);
                    btsVar3.e0(1816471250);
                    btsVar3.e0(1760361800);
                    e = ohb1.e(btsVar3, gzh0.atoms_close_button);
                    btsVar3.t(false);
                    btsVar3.t(false);
                    btsVar3.t(false);
                }
                p4v.a(mgvVar2, e, null, this.b, fidVar, 0, 4);
                return zy11Var;
            default:
                fid fidVar2 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar4 = (bts) fidVar2;
                    if (btsVar4.E()) {
                        btsVar4.Y();
                        return zy11Var;
                    }
                }
                qnm.c.getClass();
                p4v.b((pa90) obj3, null, ljs0.m(c530.a, 24.0f), this.b, fidVar2, 48, 0);
                return zy11Var;
        }
    }
}
