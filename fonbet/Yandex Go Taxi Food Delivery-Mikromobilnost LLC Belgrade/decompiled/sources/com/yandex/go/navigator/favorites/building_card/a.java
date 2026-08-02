package com.yandex.go.navigator.favorites.building_card;

import defpackage.agd;
import defpackage.bt6;
import defpackage.ct6;
import defpackage.ps6;
import defpackage.q3d;
import defpackage.qs6;
import defpackage.rol0;
import defpackage.tje;
import defpackage.tls;
import defpackage.yfd;
import defpackage.ys6;
import defpackage.zs6;
import defpackage.zy11;
import kotlinx.coroutines.flow.e;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements tls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ qs6 b;
    public final /* synthetic */ zs6 c;
    public final /* synthetic */ Object w;

    public /* synthetic */ a(qs6 qs6Var, zs6 zs6Var, ps6 ps6Var) {
        this.b = qs6Var;
        this.c = zs6Var;
        this.w = ps6Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.w;
        zs6 zs6Var = this.c;
        qs6 qs6Var = this.b;
        switch (i) {
            case 0:
                bt6 bt6Var = (bt6) obj2;
                yfd yfdVar = (yfd) obj;
                ps6 ps6Var = new ps6(qs6Var);
                ct6 ct6Var = (ct6) ((agd) yfdVar).a;
                agd agdVar = (agd) yfdVar;
                agdVar.c = e.n(bt6Var.c.c, new rol0(new BuildingCardUiStateInteractor$contentFlow$1(bt6Var, ct6Var, null)), bt6Var.d.d, new BuildingCardUiStateInteractor$uiStateFlow$1(4, null));
                agdVar.e = new a(qs6Var, zs6Var, ps6Var);
                q3d.a.getClass();
                agdVar.g = q3d.b;
                break;
            default:
                tje.N(qs6Var.o(), null, null, new BuildingCardRouter$content$1$1$1(zs6Var, (ys6) obj, (ps6) obj2, null), 3);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ a(qs6 qs6Var, bt6 bt6Var, zs6 zs6Var) {
        this.b = qs6Var;
        this.w = bt6Var;
        this.c = zs6Var;
    }
}
