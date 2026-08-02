package androidx.compose.material3;

import defpackage.lx20;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.vmz;
import defpackage.zy11;

/* loaded from: classes10.dex */
public final /* synthetic */ class l implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ w b;
    public final /* synthetic */ tse c;
    public final /* synthetic */ Object w;

    public /* synthetic */ l(w wVar, sls slsVar, tse tseVar) {
        this.a = 0;
        this.b = wVar;
        this.w = slsVar;
        this.c = tseVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.w;
        tse tseVar = this.c;
        w wVar = this.b;
        switch (i) {
            case 0:
                sls slsVar = (sls) obj;
                int i2 = lx20.a[wVar.d().ordinal()];
                if (i2 == 2) {
                    tje.N(tseVar, null, null, new ModalBottomSheetKt$ModalBottomSheetContent$6$2$1$1$1(wVar, null), 3);
                } else if (i2 != 3) {
                    tje.N(tseVar, null, null, new ModalBottomSheetKt$ModalBottomSheetContent$6$2$1$1$2(wVar, null), 3);
                } else {
                    slsVar.invoke();
                }
                return zy11Var;
            case 1:
                sls slsVar2 = (sls) obj;
                if (((Boolean) wVar.d.invoke(SheetValue.Hidden)).booleanValue()) {
                    tje.N(tseVar, null, null, new ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1(wVar, null), 3).w(new vmz(27, wVar, slsVar2));
                }
                return zy11Var;
            default:
                w wVar2 = (w) obj;
                if (((Boolean) wVar.d.invoke(SheetValue.Expanded)).booleanValue()) {
                    tje.N(tseVar, null, null, new ModalBottomSheetKt$ModalBottomSheetContent$6$2$2$1$1$2$1(wVar2, null), 3);
                }
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ l(w wVar, tse tseVar, Object obj, int i) {
        this.a = i;
        this.b = wVar;
        this.c = tseVar;
        this.w = obj;
    }
}
