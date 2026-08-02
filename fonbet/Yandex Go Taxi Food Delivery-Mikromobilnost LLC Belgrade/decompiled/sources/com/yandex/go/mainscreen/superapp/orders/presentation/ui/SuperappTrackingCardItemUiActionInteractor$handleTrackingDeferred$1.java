package com.yandex.go.mainscreen.superapp.orders.presentation.ui;

import com.yandex.go.mainscreen.superapp.orders.domain.h;
import defpackage.a301;
import defpackage.c151;
import defpackage.chw0;
import defpackage.d380;
import defpackage.dvw;
import defpackage.hlx0;
import defpackage.j18;
import defpackage.jst;
import defpackage.k601;
import defpackage.l601;
import defpackage.lia1;
import defpackage.m601;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o801;
import defpackage.q351;
import defpackage.s351;
import defpackage.tse;
import defpackage.w201;
import defpackage.w511;
import defpackage.wls;
import defpackage.ze5;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.order.analytics.model.WidgetType;
import ru.yandex.taxi.widgets.data.repository.t;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.orders.presentation.ui.SuperappTrackingCardItemUiActionInteractor$handleTrackingDeferred$1", f = "SuperappTrackingCardItemUiActionInteractor.kt", l = {260}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperappTrackingCardItemUiActionInteractor$handleTrackingDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $targetFilter;
    final /* synthetic */ w201 $tracking;
    int label;
    final /* synthetic */ chw0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappTrackingCardItemUiActionInteractor$handleTrackingDeferred$1(chw0 chw0Var, w201 w201Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chw0Var;
        this.$tracking = w201Var;
        this.$targetFilter = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperappTrackingCardItemUiActionInteractor$handleTrackingDeferred$1(this.this$0, this.$tracking, this.$targetFilter, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappTrackingCardItemUiActionInteractor$handleTrackingDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h hVar = this.this$0.l;
            String e = lia1.e(this.$tracking);
            String str = this.$targetFilter;
            this.label = 1;
            t tVar = hVar.c.c;
            tVar.getClass();
            j18 j18Var = new j18(1, dvw.b(this));
            j18Var.u();
            synchronized (tVar.o) {
                try {
                    LinkedHashMap linkedHashMap = tVar.n;
                    Object obj2 = linkedHashMap.get(e);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(e, obj2);
                    }
                    ((List) obj2).add(j18Var);
                    j18Var.w(new ze5(3, tVar, e, j18Var));
                    r0 r0Var = tVar.i.a;
                    do {
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, kotlin.collections.b.o((Map) value, new Pair(e, new o801(str)))));
                } catch (Throwable th) {
                    throw th;
                }
            }
            obj = j18Var.s();
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            chw0 chw0Var = this.this$0;
            a301 a301Var = chw0Var.j;
            w201 w201Var = this.$tracking;
            m601 m601Var = chw0Var.c;
            String str2 = (String) chw0Var.b.invoke();
            c151 c151Var = a301Var.a;
            hlx0 a = a301Var.b.a(w201Var, "swipe", m601Var, str2);
            if (m601Var.equals(l601.a)) {
                s351 s351Var = c151Var.f;
                q351 q351Var = (q351) a.x;
                s351Var.getClass();
                Map a2 = s351.a(q351Var);
                i d = ((j) c151Var.b).d("PreviewOrderList.SwipeFailed");
                String str3 = (String) a.w;
                LinkedHashMap linkedHashMap2 = d.a;
                linkedHashMap2.put("screen_type", str3);
                d.d("open_reason", c151Var.e.a.getAlias());
                linkedHashMap2.put("widget", a2);
                linkedHashMap2.put("widget_type", ((WidgetType) a.c).getTypeIdentifier());
                linkedHashMap2.put("widget_id", (String) a.b);
                linkedHashMap2.put("button_name", (String) a.y);
                d.m();
            } else {
                if (!(m601Var instanceof k601)) {
                    w511.b();
                    return null;
                }
                c151Var.getClass();
                d380 d380Var = (d380) kotlin.collections.a.R(((q351) a.x).c);
                if (d380Var != null) {
                    i d2 = ((j) c151Var.b).d("PreviewOrderDetails.SwipeFailed");
                    LinkedHashMap linkedHashMap3 = d2.a;
                    linkedHashMap3.put("open_from_screen_type", (String) a.w);
                    linkedHashMap3.put("button_name", (String) a.y);
                    linkedHashMap3.putAll(d380Var.e());
                    d2.m();
                } else {
                    jst.e.c("list of OrderParams is empty");
                }
            }
        }
        return zy11.a;
    }
}
