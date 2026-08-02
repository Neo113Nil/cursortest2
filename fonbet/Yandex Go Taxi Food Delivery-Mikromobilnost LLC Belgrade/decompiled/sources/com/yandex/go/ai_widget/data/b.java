package com.yandex.go.ai_widget.data;

import com.yandex.go.address.models.Address;
import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationGeopointWrapper;
import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationKnownOrderInfo;
import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationRequestBody;
import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationState;
import com.yandex.go.shortcuts.dto.request.KnownOrderInfo;
import com.yandex.go.shortcuts.dto.request.ProductsParamsState;
import com.yandex.go.shortcuts.impl.repository.s;
import defpackage.bg5;
import defpackage.kx70;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tcc;
import defpackage.uaf0;
import defpackage.yaf0;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.superapp.knownOrder.u;

/* loaded from: classes12.dex */
public final class b {
    public final bg5 a;
    public final u b;
    public final com.yandex.go.route.interactor.b c;
    public final s d;

    public b(bg5 bg5Var, u uVar, com.yandex.go.route.interactor.b bVar, s sVar) {
        this.a = bg5Var;
        this.b = uVar;
        this.c = bVar;
        this.d = sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ba, code lost:
    
        if (r1 != r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bc, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x004f, code lost:
    
        if (r1 == r2) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069 A[LOOP:1: B:34:0x0063->B:36:0x0069, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a A[LOOP:2: B:39:0x0084->B:41:0x008a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        AiWidgetEvaluationRequestBodyInteractor$create$1 aiWidgetEvaluationRequestBodyInteractor$create$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof AiWidgetEvaluationRequestBodyInteractor$create$1) {
            aiWidgetEvaluationRequestBodyInteractor$create$1 = (AiWidgetEvaluationRequestBodyInteractor$create$1) continuationImpl;
            int i2 = aiWidgetEvaluationRequestBodyInteractor$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aiWidgetEvaluationRequestBodyInteractor$create$1.label = i2 - Integer.MIN_VALUE;
                AiWidgetEvaluationRequestBodyInteractor$create$1 aiWidgetEvaluationRequestBodyInteractor$create$12 = aiWidgetEvaluationRequestBodyInteractor$create$1;
                Object obj = aiWidgetEvaluationRequestBodyInteractor$create$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aiWidgetEvaluationRequestBodyInteractor$create$12.label;
                ArrayList arrayList = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    aiWidgetEvaluationRequestBodyInteractor$create$12.label = 1;
                    obj = e.y(this.b.k, aiWidgetEvaluationRequestBodyInteractor$create$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        ProductsParamsState productsParamsState = (ProductsParamsState) obj;
                        Address h = this.c.c().h();
                        zzs B = h != null ? h.B() : null;
                        zzs zzsVar = productsParamsState.a;
                        AiWidgetEvaluationGeopointWrapper aiWidgetEvaluationGeopointWrapper = B != null ? new AiWidgetEvaluationGeopointWrapper(scc.g(new Double(B.b), new Double(B.a))) : null;
                        bg5 bg5Var = this.a;
                        Integer num = new Integer(bg5Var.b());
                        String title = bg5Var.c().getTitle();
                        AiWidgetEvaluationGeopointWrapper aiWidgetEvaluationGeopointWrapper2 = new AiWidgetEvaluationGeopointWrapper(scc.g(new Double(zzsVar.b), new Double(zzsVar.a)));
                        String str = productsParamsState.k;
                        String str2 = productsParamsState.j;
                        List list = productsParamsState.o;
                        if (list != null) {
                            List list2 = list;
                            arrayList = new ArrayList(tcc.n(list2, 10));
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(new AiWidgetEvaluationKnownOrderInfo(((KnownOrderInfo) it2.next()).b));
                            }
                        }
                        return new AiWidgetEvaluationRequestBody(aiWidgetEvaluationGeopointWrapper, num, title, new AiWidgetEvaluationState(aiWidgetEvaluationGeopointWrapper2, str, str2, arrayList));
                    }
                    kotlin.b.b(obj);
                }
                List<kx70> list3 = (List) obj;
                ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((kx70) it.next()).d());
                }
                ArrayList arrayList3 = new ArrayList(tcc.n(list3, 10));
                for (kx70 kx70Var : list3) {
                    arrayList3.add(new KnownOrderInfo(kx70Var.a, kx70Var.b.getAlias(), kx70Var.c, kx70Var.e, kx70Var.f, kx70Var.g));
                }
                uaf0 uaf0Var = yaf0.b;
                aiWidgetEvaluationRequestBodyInteractor$create$12.L$0 = null;
                aiWidgetEvaluationRequestBodyInteractor$create$12.label = 2;
                obj = this.d.c(null, arrayList2, arrayList3, uaf0Var, aiWidgetEvaluationRequestBodyInteractor$create$12);
            }
        }
        aiWidgetEvaluationRequestBodyInteractor$create$1 = new AiWidgetEvaluationRequestBodyInteractor$create$1(this, continuationImpl);
        AiWidgetEvaluationRequestBodyInteractor$create$1 aiWidgetEvaluationRequestBodyInteractor$create$122 = aiWidgetEvaluationRequestBodyInteractor$create$1;
        Object obj2 = aiWidgetEvaluationRequestBodyInteractor$create$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aiWidgetEvaluationRequestBodyInteractor$create$122.label;
        ArrayList arrayList4 = null;
        if (i != 0) {
        }
        List<kx70> list32 = (List) obj2;
        ArrayList arrayList22 = new ArrayList(tcc.n(list32, 10));
        it = list32.iterator();
        while (it.hasNext()) {
        }
        ArrayList arrayList32 = new ArrayList(tcc.n(list32, 10));
        while (r1.hasNext()) {
        }
        uaf0 uaf0Var2 = yaf0.b;
        aiWidgetEvaluationRequestBodyInteractor$create$122.L$0 = null;
        aiWidgetEvaluationRequestBodyInteractor$create$122.label = 2;
        obj2 = this.d.c(null, arrayList22, arrayList32, uaf0Var2, aiWidgetEvaluationRequestBodyInteractor$create$122);
    }
}
