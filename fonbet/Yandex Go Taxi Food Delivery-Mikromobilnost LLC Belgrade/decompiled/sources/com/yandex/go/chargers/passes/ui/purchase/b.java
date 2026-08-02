package com.yandex.go.chargers.passes.ui.purchase;

import defpackage.bia;
import defpackage.lia;
import defpackage.mia;
import defpackage.n4u0;
import defpackage.nia;
import defpackage.ny61;
import defpackage.oia;
import defpackage.pia;
import defpackage.pz40;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xia;
import defpackage.zia;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class b implements vpr {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (r9 == r11) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
    
        if (r9 == r11) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
    
        if (r9 == r11) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(pia piaVar, Continuation continuation) {
        ChargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1 chargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1;
        int i;
        n4u0 n4u0Var;
        n4u0 n4u0Var2;
        n4u0 n4u0Var3;
        c cVar = this.a;
        d dVar = cVar.d;
        r0 r0Var = cVar.e;
        if (continuation instanceof ChargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1) {
            chargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1 = (ChargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1) continuation;
            int i2 = chargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (piaVar instanceof nia) {
                        ru.yandex.taxi.widget.c cVar2 = cVar.a;
                        FormattedText formattedText = ((nia) piaVar).a;
                        chargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1.L$0 = null;
                        chargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1.L$1 = r0Var;
                        chargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1.label = 1;
                        obj = ru.yandex.taxi.widget.c.i(cVar2, formattedText, null, chargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1, 30);
                        n4u0Var = r0Var;
                    } else if (piaVar instanceof oia) {
                        bia biaVar = ((oia) piaVar).b;
                        chargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1.L$0 = null;
                        chargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1.L$1 = r0Var;
                        chargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1.label = 2;
                        obj = dVar.b(biaVar, chargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1);
                        n4u0Var2 = r0Var;
                    } else if (piaVar instanceof mia) {
                        bia biaVar2 = ((mia) piaVar).a;
                        chargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1.L$0 = null;
                        chargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1.L$1 = r0Var;
                        chargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1.label = 3;
                        obj = dVar.a(biaVar2, chargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1);
                        n4u0Var3 = r0Var;
                    } else {
                        if (!(piaVar instanceof lia)) {
                            w511.b();
                            return null;
                        }
                        xia xiaVar = new xia(((lia) piaVar).a);
                        r0Var.getClass();
                        r0Var.m(null, xiaVar);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    n4u0 n4u0Var4 = (pz40) chargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1.L$1;
                    kotlin.b.b(obj);
                    n4u0Var = n4u0Var4;
                    zia ziaVar = new zia((CharSequence) obj);
                    r0 r0Var2 = (r0) n4u0Var;
                    r0Var2.getClass();
                    r0Var2.m(null, ziaVar);
                } else if (i == 2) {
                    n4u0 n4u0Var5 = (pz40) chargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1.L$1;
                    kotlin.b.b(obj);
                    n4u0Var2 = n4u0Var5;
                    ((r0) n4u0Var2).l(obj);
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    n4u0 n4u0Var6 = (pz40) chargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1.L$1;
                    kotlin.b.b(obj);
                    n4u0Var3 = n4u0Var6;
                    ((r0) n4u0Var3).l(obj);
                }
                return zy11.a;
            }
        }
        chargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1 = new ChargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1(this, continuation);
        Object obj2 = chargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesPurchaseUiStateInteractor$purchase$2$1$emit$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
