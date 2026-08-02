package com.yandex.go.chargers.passes.ui.purchase;

import com.yandex.go.chargers.passes.data.r0;
import defpackage.bvf0;
import defpackage.cy9;
import defpackage.eia;
import defpackage.ejb1;
import defpackage.fia;
import defpackage.gia;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.w511;
import defpackage.xia;
import defpackage.yt11;
import defpackage.zia;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes12.dex */
public final class c implements yt11 {
    public final ru.yandex.taxi.widget.c a;
    public final r0 b;
    public final com.yandex.go.chargers.payments.data.a c;
    public final d d;
    public final kotlinx.coroutines.flow.r0 e = bvf0.c(new zia(""));

    public c(ru.yandex.taxi.widget.c cVar, r0 r0Var, com.yandex.go.chargers.payments.data.a aVar, d dVar) {
        this.a = cVar;
        this.b = r0Var;
        this.c = aVar;
        this.d = dVar;
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return e.d(this.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        if (r12 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, ContinuationImpl continuationImpl) {
        ChargersPassesPurchaseUiStateInteractor$purchase$1 chargersPassesPurchaseUiStateInteractor$purchase$1;
        int i;
        zy11 zy11Var;
        kotlinx.coroutines.flow.r0 r0Var;
        gia giaVar;
        try {
            if (continuationImpl instanceof ChargersPassesPurchaseUiStateInteractor$purchase$1) {
                chargersPassesPurchaseUiStateInteractor$purchase$1 = (ChargersPassesPurchaseUiStateInteractor$purchase$1) continuationImpl;
                int i2 = chargersPassesPurchaseUiStateInteractor$purchase$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    chargersPassesPurchaseUiStateInteractor$purchase$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = chargersPassesPurchaseUiStateInteractor$purchase$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = chargersPassesPurchaseUiStateInteractor$purchase$1.label;
                    zy11Var = zy11.a;
                    r0Var = this.e;
                    r0 r0Var2 = this.b;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        List c = ejb1.c(this.c.d());
                        chargersPassesPurchaseUiStateInteractor$purchase$1.L$0 = null;
                        chargersPassesPurchaseUiStateInteractor$purchase$1.L$1 = null;
                        chargersPassesPurchaseUiStateInteractor$purchase$1.L$2 = null;
                        chargersPassesPurchaseUiStateInteractor$purchase$1.label = 1;
                        obj = r0Var2.a(str, str2, c, chargersPassesPurchaseUiStateInteractor$purchase$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return zy11Var;
                        }
                        kotlin.b.b(obj);
                    }
                    giaVar = (gia) obj;
                    if (!(giaVar instanceof eia)) {
                        xia xiaVar = new xia(((eia) giaVar).a);
                        r0Var.getClass();
                        r0Var.m(null, xiaVar);
                        return zy11Var;
                    }
                    if (!(giaVar instanceof fia)) {
                        w511.b();
                        return null;
                    }
                    rol0 f = r0Var2.f(((fia) giaVar).a);
                    b bVar = new b(this);
                    chargersPassesPurchaseUiStateInteractor$purchase$1.L$0 = null;
                    chargersPassesPurchaseUiStateInteractor$purchase$1.L$1 = null;
                    chargersPassesPurchaseUiStateInteractor$purchase$1.L$2 = null;
                    chargersPassesPurchaseUiStateInteractor$purchase$1.L$3 = null;
                    chargersPassesPurchaseUiStateInteractor$purchase$1.label = 2;
                    return f.collect(bVar, chargersPassesPurchaseUiStateInteractor$purchase$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
                }
            }
            if (i != 0) {
            }
            giaVar = (gia) obj;
            if (!(giaVar instanceof eia)) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            xia xiaVar2 = new xia(cy9.e);
            r0Var.getClass();
            r0Var.m(null, xiaVar2);
            return zy11Var;
        }
        chargersPassesPurchaseUiStateInteractor$purchase$1 = new ChargersPassesPurchaseUiStateInteractor$purchase$1(this, continuationImpl);
        Object obj2 = chargersPassesPurchaseUiStateInteractor$purchase$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesPurchaseUiStateInteractor$purchase$1.label;
        zy11Var = zy11.a;
        r0Var = this.e;
        r0 r0Var22 = this.b;
    }
}
