package com.yandex.go.walking.navigation.impl.guidance.interactor;

import com.yandex.go.walking.navigation.impl.model.WalkNavFocusButtonState;
import defpackage.a640;
import defpackage.avj0;
import defpackage.dwh0;
import defpackage.h711;
import defpackage.k4u;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.n611;
import defpackage.ny61;
import defpackage.o341;
import defpackage.qpb1;
import defpackage.t7s;
import defpackage.tcc;
import defpackage.tje;
import defpackage.vpr;
import defpackage.z041;
import defpackage.zls;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.TimeUnitsVisibility;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.walking.navigation.impl.guidance.interactor.WalkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$3", f = "WalkNavGuidanceUiStateInteractor.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class WalkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$3(x xVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = xVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        WalkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$3 walkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$3 = new WalkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$3(this.this$0, (Continuation) obj3);
        walkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$0 = (vpr) obj;
        walkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return walkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v16, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String c;
        String str;
        ?? r4;
        String str2;
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            boolean booleanValue = ((Boolean) objArr[5]).booleanValue();
            Long l = (Long) obj6;
            WalkNavFocusButtonState walkNavFocusButtonState = (WalkNavFocusButtonState) obj5;
            z041 z041Var = (z041) obj4;
            k4u k4uVar = (k4u) obj3;
            o341 o341Var = (o341) obj2;
            a640 a640Var = this.this$0.f;
            boolean z = l != null;
            if (z) {
                List list = o341Var.d;
                ArrayList arrayList = new ArrayList();
                for (Object obj7 : list) {
                    if (obj7 instanceof n611) {
                        arrayList.add(obj7);
                    }
                }
                n611 n611Var = (n611) kotlin.collections.a.R(arrayList);
                String str3 = n611Var != null ? n611Var.a : null;
                if (str3 == null) {
                    str3 = "";
                }
                c = a640Var.b(str3);
            } else {
                c = k4uVar != null ? a640Var.c(k4uVar.b, (long) k4uVar.a) : o341Var.a;
            }
            String str4 = c;
            String d = z ? str4 : a640Var.d(str4);
            if (z) {
                Long l2 = o341Var.i;
                long longValue = l2 != null ? l.longValue() - l2.longValue() : 0L;
                String a = a640Var.a(o341Var.j);
                zuj0 zuj0Var = a640Var.b;
                str = ((avj0) zuj0Var).i(kyh0.walking_navigation_distance, a, qpb1.c(zuj0Var, TimeUnit.SECONDS.toMillis((int) (longValue / 1000)), TimeUnitsVisibility.TWO_TIME_UNITS));
            } else if (k4uVar != null) {
                long j = (long) k4uVar.a;
                a640Var.getClass();
                Calendar calendar = Calendar.getInstance();
                calendar.add(13, (int) j);
                str = ((avj0) a640Var.b).i(kyh0.walking_navigation_arrival_time, t7s.c(a640Var.a, calendar, 1));
            } else {
                str = o341Var.c;
            }
            String str5 = str;
            if (z) {
                r4 = EmptyList.a;
            } else if (k4uVar != null) {
                List list2 = o341Var.d;
                long j2 = (long) k4uVar.a;
                a640Var.getClass();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.add(13, (int) j2);
                String c2 = t7s.c(a640Var.a, calendar2, 1);
                List<h711> list3 = list2;
                r4 = new ArrayList(tcc.n(list3, 10));
                for (h711 h711Var : list3) {
                    if (h711Var instanceof n611) {
                        n611 n611Var2 = (n611) h711Var;
                        h711Var = new n611(n611Var2.a, c2, n611Var2.c, n611Var2.d, n611Var2.e, n611Var2.f, n611Var2.g);
                    }
                    r4.add(h711Var);
                }
            } else {
                r4 = o341Var.d;
            }
            List list4 = r4;
            if (z) {
                double d2 = o341Var.j;
                a640Var.getClass();
                int ceil = (int) Math.ceil(d2 / 0.71d);
                str2 = tje.U(a640Var.a, dwh0.walking_navigation_finish_steps, kyh0.walking_navigation_finish_steps_other, ceil, Integer.valueOf(ceil));
            } else {
                str2 = o341Var.e;
            }
            String str6 = str2;
            o341Var.getClass();
            o341 o341Var2 = new o341(str4, d, str5, list4, str6, z041Var, walkNavFocusButtonState, z, o341Var.i, o341Var.j, l, booleanValue, o341Var.m);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(o341Var2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
