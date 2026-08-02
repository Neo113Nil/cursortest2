package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import com.yandex.go.tariffcard.api.experiment.HeaderBackground;
import com.yandex.go.tariffcard.experiment.MulticlassTariffsHeaderRedesignExperiment;
import defpackage.evu0;
import defpackage.f6v;
import defpackage.fnx0;
import defpackage.hcx0;
import defpackage.mi31;
import defpackage.mja1;
import defpackage.mvg;
import defpackage.nvi0;
import defpackage.ny61;
import defpackage.o9u;
import defpackage.ovi0;
import defpackage.p9u;
import defpackage.q9u;
import defpackage.r9u;
import defpackage.sdu;
import defpackage.vfx0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.HeaderUiStateInteractor$uiStateFlow$$inlined$combine$1$3", f = "HeaderUiStateInteractor.kt", l = {337, MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class HeaderUiStateInteractor$uiStateFlow$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$10;
    Object L$11;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderUiStateInteractor$uiStateFlow$$inlined$combine$1$3(Continuation continuation, b bVar) {
        super(3, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        HeaderUiStateInteractor$uiStateFlow$$inlined$combine$1$3 headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3 = new HeaderUiStateInteractor$uiStateFlow$$inlined$combine$1$3((Continuation) obj3, this.this$0);
        headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$0 = (vpr) obj;
        headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x019f, code lost:
    
        if (r7.emit(r0, r5) == r8) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x01a1, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x016c, code lost:
    
        if (r0 == r8) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc A[LOOP:0: B:16:0x0086->B:24:0x00cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d5 A[EDGE_INSN: B:25:0x00d5->B:26:0x00d5 BREAK  A[LOOP:0: B:16:0x0086->B:24:0x00cc], SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fnx0 fnx0Var;
        Object obj2;
        Object c;
        boolean z;
        HeaderUiStateInteractor$uiStateFlow$$inlined$combine$1$3 headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3 = this;
        vpr vprVar = (vpr) headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$0;
        Object[] objArr = (Object[]) headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj3 = objArr[0];
            Object obj4 = objArr[1];
            Object obj5 = objArr[2];
            Object obj6 = objArr[3];
            Object obj7 = objArr[4];
            Object obj8 = objArr[5];
            MulticlassTariffsHeaderRedesignExperiment multiclassTariffsHeaderRedesignExperiment = (MulticlassTariffsHeaderRedesignExperiment) objArr[6];
            hcx0 hcx0Var = (hcx0) obj6;
            nvi0 nvi0Var = (nvi0) obj5;
            PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState = (PriceUpdate$PriceLoadingState) obj4;
            fnx0Var = (fnx0) obj3;
            b bVar = headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.this$0;
            mi31 mi31Var = fnx0Var.a;
            String str = fnx0Var.d;
            Iterator it = ((List) obj7).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                r9u r9uVar = (r9u) obj2;
                if (r9uVar instanceof p9u) {
                    List list = (List) ((p9u) r9uVar).a.get(str);
                    if (list != null) {
                        z = list.contains(mi31Var.f);
                        if (z) {
                            break;
                        }
                    }
                    z = false;
                    if (z) {
                    }
                } else {
                    if (r9uVar instanceof o9u) {
                        List list2 = (List) ((o9u) r9uVar).a.get(str);
                        if (list2 != null) {
                            z = list2.contains(mi31Var.f);
                        }
                        z = false;
                    } else {
                        if (!(r9uVar instanceof q9u)) {
                            w511.b();
                            return null;
                        }
                        z = true;
                    }
                    if (z) {
                    }
                }
                return zy11.a;
            }
            r9u r9uVar2 = (r9u) obj2;
            if (r9uVar2 == null) {
                r9uVar2 = q9u.a;
            }
            headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$0 = null;
            headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$1 = null;
            headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$2 = vprVar;
            headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$3 = null;
            headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$4 = null;
            headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$5 = null;
            headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$6 = null;
            headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$7 = null;
            headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$8 = null;
            headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$9 = null;
            headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$10 = null;
            headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$11 = fnx0Var;
            headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.label = 1;
            bVar.getClass();
            Map map = multiclassTariffsHeaderRedesignExperiment.b;
            String str2 = mi31Var.b;
            String str3 = mi31Var.f;
            List list3 = (List) map.get(str2);
            if (list3 == null || !list3.contains(str3)) {
                HeaderBackground f = bVar.d.f(mi31Var.b, str3, mi31Var.a.K0);
                String str4 = f != null ? f.a : null;
                ovi0 a = (str4 == null || evu0.J(str4)) ? null : mja1.a(str4, null, 6);
                if (a == null || a.equals(nvi0Var)) {
                    headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3 = this;
                    c = bVar.c(mi31Var, priceUpdate$PriceLoadingState, hcx0Var.a, headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3);
                    if (c != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        c = (sdu) c;
                    }
                } else {
                    c = bVar.b(mi31Var, priceUpdate$PriceLoadingState, a, hcx0Var.b, r9uVar2, this);
                    headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3 = this;
                    if (c != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        c = (sdu) c;
                    }
                }
            } else {
                c = bVar.e(mi31Var, priceUpdate$PriceLoadingState, hcx0Var.a, multiclassTariffsHeaderRedesignExperiment.c, headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3);
                headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3 = this;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fnx0 fnx0Var2 = (fnx0) headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$11;
            vprVar = (vpr) headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$2;
            kotlin.b.b(obj);
            fnx0Var = fnx0Var2;
            c = obj;
        }
        vfx0 vfx0Var = headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.this$0.b;
        mi31 mi31Var2 = fnx0Var.a;
        vfx0Var.getClass();
        f6v b = ru.yandex.taxi.requirements.utils.c.b(c, vfx0.a(mi31Var2));
        headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$0 = null;
        headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$1 = null;
        headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$2 = null;
        headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$3 = null;
        headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$4 = null;
        headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$5 = null;
        headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$6 = null;
        headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$7 = null;
        headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$8 = null;
        headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$9 = null;
        headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$10 = null;
        headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$11 = null;
        headerUiStateInteractor$uiStateFlow$$inlined$combine$1$3.label = 2;
    }
}
