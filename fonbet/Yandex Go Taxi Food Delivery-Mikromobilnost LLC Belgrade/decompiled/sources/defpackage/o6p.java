package defpackage;

import com.yandex.payment.sdk.flex.api.actions.FlexActionParameters$STRATEGY;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class o6p extends nw4 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o6p(vfr vfrVar, yfr yfrVar, int i) {
        super(vfrVar, yfrVar);
        this.c = i;
    }

    @Override // defpackage.nw4
    public final mgr a(kr krVar, n6u n6uVar) {
        FlexActionParameters$STRATEGY flexActionParameters$STRATEGY;
        switch (this.c) {
            case 0:
                i6p i6pVar = (i6p) krVar;
                return new agr(i6pVar.a, i6pVar.b, i6pVar.c, i6pVar.d, i6pVar.e, i6pVar.f, i6pVar.g, i6pVar.h, i6pVar.i, i6pVar.l, i6pVar.m, new m6p(i6pVar, n6uVar, 0), new m6p(i6pVar, n6uVar, 1));
            case 1:
                z9r z9rVar = (z9r) krVar;
                return new bgr(z9rVar.a, z9rVar.b);
            case 2:
                return new cgr(((f970) krVar).a);
            case 3:
                aoq0 aoq0Var = (aoq0) krVar;
                return new egr(aoq0Var.a, aoq0Var.b);
            case 4:
                uoq0 uoq0Var = (uoq0) krVar;
                return new fgr(uoq0Var.a, uoq0Var.b);
            case 5:
                i7s0 i7s0Var = (i7s0) krVar;
                return new ggr(i7s0Var.a, i7s0Var.b);
            case 6:
                return new hgr();
            case 7:
                e511 e511Var = (e511) krVar;
                List<lbi0> list = e511Var.a;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (lbi0 lbi0Var : list) {
                    arrayList.add(new dgr(lbi0Var.d, lbi0Var.a, lbi0Var.e, lbi0Var.b, lbi0Var.c));
                }
                return new igr(arrayList, new g511(n6uVar, e511Var, 0), new g511(n6uVar, e511Var, 1));
            case 8:
                q511 q511Var = (q511) krVar;
                String str = q511Var.a;
                if (jl40.l(str, "bind")) {
                    flexActionParameters$STRATEGY = FlexActionParameters$STRATEGY.NFC_BIND;
                } else {
                    if (!jl40.l(str, "write_tickets")) {
                        ny61.s();
                        return null;
                    }
                    flexActionParameters$STRATEGY = FlexActionParameters$STRATEGY.NFC_WRITE;
                }
                return new jgr(flexActionParameters$STRATEGY, new s511(n6uVar, q511Var, 0), new s511(n6uVar, q511Var, 1));
            default:
                sb11 sb11Var = (sb11) krVar;
                List<wb51> list2 = sb11Var.a;
                ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                for (wb51 wb51Var : list2) {
                    int i = wb51Var.a;
                    String str2 = wb51Var.b;
                    arrayList2.add(new lgr(i, wb51Var.c, wb51Var.d, wb51Var.h, wb51Var.i, str2, wb51Var.e, wb51Var.f, wb51Var.j, wb51Var.g));
                }
                return new kgr(arrayList2, new ub11(n6uVar, sb11Var, 0), new ub11(n6uVar, sb11Var, 1));
        }
    }

    @Override // defpackage.nw4, defpackage.dw
    public void handle(kr krVar, n6u n6uVar) {
        switch (this.c) {
            case 0:
                super.handle((i6p) krVar, n6uVar);
                break;
            default:
                super.handle(krVar, n6uVar);
                break;
        }
    }
}
