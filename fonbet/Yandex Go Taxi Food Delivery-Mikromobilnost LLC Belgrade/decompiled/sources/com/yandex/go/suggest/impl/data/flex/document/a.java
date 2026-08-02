package com.yandex.go.suggest.impl.data.flex.document;

import defpackage.aks0;
import defpackage.bwp0;
import defpackage.cnr0;
import defpackage.ny61;
import defpackage.pwy;
import defpackage.r6s0;
import defpackage.tpr;
import defpackage.u1m;
import defpackage.uwl;
import defpackage.vpr;
import defpackage.ywl;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.e;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
        this.b = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00fc, code lost:
    
        if (r0.emit(r4, r2) != r3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperappSuggestDocumentInteractor$special$$inlined$map$1$2$1 superappSuggestDocumentInteractor$special$$inlined$map$1$2$1;
        Object obj2;
        CoroutineSingletons coroutineSingletons;
        int i;
        vpr vprVar;
        c cVar;
        vpr vprVar2;
        if (continuation instanceof SuperappSuggestDocumentInteractor$special$$inlined$map$1$2$1) {
            superappSuggestDocumentInteractor$special$$inlined$map$1$2$1 = (SuperappSuggestDocumentInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                obj2 = superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    c cVar2 = this.b;
                    tpr tprVar = cVar2.c.k;
                    superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar3 = this.a;
                    superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$4 = vprVar3;
                    superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$5 = null;
                    superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$6 = null;
                    superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$7 = cVar2;
                    superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.label = 1;
                    Object y = e.y(tprVar, superappSuggestDocumentInteractor$special$$inlined$map$1$2$1);
                    if (y != coroutineSingletons) {
                        vprVar = vprVar3;
                        cVar = cVar2;
                        obj2 = y;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    cVar = (c) superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$7;
                    vprVar = (vpr) superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar2 = (vpr) superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                    pwy pwyVar = new pwy((u1m) obj2, new ywl(new aks0("(theme bgMinor 0p (col (space 24p) (col (repeat 5 (padded 0p 72p 0p 0p (row (padded 8p (bone 40p 40p 19p)) (padded 20p 32p 20p 0p (bone 100% 16p 8p)))))) (space 24p) (col (repeat 2 (padded 0p 26p 36p 26p (row 100% sb (repeat 4 (col (bone 48p 48p 16p)))))))))", null), null, cnr0.b, new uwl(null, null, r6s0.INSTANCE, null, null, null), null, null), false, 4);
                    superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$4 = null;
                    superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$5 = null;
                    superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$6 = null;
                    superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.label = 3;
                }
                superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$0 = null;
                superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$1 = null;
                superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$2 = null;
                superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$3 = null;
                superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$4 = vprVar;
                superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$5 = null;
                superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$6 = null;
                superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$7 = null;
                superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.label = 2;
                obj2 = cVar.h.a((bwp0) obj2, superappSuggestDocumentInteractor$special$$inlined$map$1$2$1);
                if (obj2 != coroutineSingletons) {
                    vprVar2 = vprVar;
                    pwy pwyVar2 = new pwy((u1m) obj2, new ywl(new aks0("(theme bgMinor 0p (col (space 24p) (col (repeat 5 (padded 0p 72p 0p 0p (row (padded 8p (bone 40p 40p 19p)) (padded 20p 32p 20p 0p (bone 100% 16p 8p)))))) (space 24p) (col (repeat 2 (padded 0p 26p 36p 26p (row 100% sb (repeat 4 (col (bone 48p 48p 16p)))))))))", null), null, cnr0.b, new uwl(null, null, r6s0.INSTANCE, null, null, null), null, null), false, 4);
                    superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$4 = null;
                    superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$5 = null;
                    superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$6 = null;
                    superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.label = 3;
                }
                return coroutineSingletons;
            }
        }
        superappSuggestDocumentInteractor$special$$inlined$map$1$2$1 = new SuperappSuggestDocumentInteractor$special$$inlined$map$1$2$1(this, continuation);
        obj2 = superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$0 = null;
        superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$1 = null;
        superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$2 = null;
        superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$3 = null;
        superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$4 = vprVar;
        superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$5 = null;
        superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$6 = null;
        superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.L$7 = null;
        superappSuggestDocumentInteractor$special$$inlined$map$1$2$1.label = 2;
        obj2 = cVar.h.a((bwp0) obj2, superappSuggestDocumentInteractor$special$$inlined$map$1$2$1);
        if (obj2 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
