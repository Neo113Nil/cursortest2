package com.yandex.go.taxi.order.cancel.reasons.interactor;

import com.yandex.go.zone.dto.objects.CancelReasonsPresentation;
import com.yandex.go.zone.dto.objects.UserCancelReasonChoice;
import defpackage.evu0;
import defpackage.gy7;
import defpackage.jl40;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.vw7;
import defpackage.ww7;
import defpackage.xw7;
import defpackage.yx7;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.cancel.reasons.interactor.CancelReasonsV2Interactor$uiStateFlow$$inlined$combine$1$3", f = "CancelReasonsV2Interactor.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class CancelReasonsV2Interactor$uiStateFlow$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ yx7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelReasonsV2Interactor$uiStateFlow$$inlined$combine$1$3(Continuation continuation, yx7 yx7Var) {
        super(3, continuation);
        this.this$0 = yx7Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CancelReasonsV2Interactor$uiStateFlow$$inlined$combine$1$3 cancelReasonsV2Interactor$uiStateFlow$$inlined$combine$1$3 = new CancelReasonsV2Interactor$uiStateFlow$$inlined$combine$1$3((Continuation) obj3, this.this$0);
        cancelReasonsV2Interactor$uiStateFlow$$inlined$combine$1$3.L$0 = (vpr) obj;
        cancelReasonsV2Interactor$uiStateFlow$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return cancelReasonsV2Interactor$uiStateFlow$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
            boolean booleanValue = ((Boolean) obj6).booleanValue();
            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
            vw7 vw7Var = (vw7) obj4;
            String str = vw7Var != null ? vw7Var.a : null;
            List list = (List) obj3;
            CancelReasonsPresentation cancelReasonsPresentation = (CancelReasonsPresentation) obj2;
            k7x0 k7x0Var = this.this$0.c.a;
            List A0 = kotlin.collections.a.A0(list, (cancelReasonsPresentation == null || booleanValue2) ? list.size() : cancelReasonsPresentation.b.a);
            ArrayList arrayList = new ArrayList(tcc.n(A0, 10));
            Iterator it = A0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                UserCancelReasonChoice userCancelReasonChoice = (UserCancelReasonChoice) it.next();
                String str2 = userCancelReasonChoice.a;
                if (evu0.J(str2)) {
                    str2 = null;
                }
                String a = str2 != null ? ((m7x0) k7x0Var).a(str2) : null;
                String str3 = a == null ? "" : a;
                boolean l = jl40.l(userCancelReasonChoice.b, str == null ? null : str);
                String str4 = userCancelReasonChoice.d;
                if (!l) {
                    str4 = null;
                }
                arrayList.add(new ww7(userCancelReasonChoice.b, str3, userCancelReasonChoice.c, str4 == null ? "" : str4, l));
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            boolean z = list.size() == arrayList2.size();
            if (cancelReasonsPresentation != null) {
                CancelReasonsPresentation.ExpandInfo expandInfo = cancelReasonsPresentation.b;
                if (!z) {
                    String str5 = expandInfo.b;
                    if (evu0.J(str5)) {
                        str5 = null;
                    }
                    String a2 = str5 != null ? ((m7x0) k7x0Var).a(str5) : null;
                    if (a2 == null) {
                        a2 = "";
                    }
                    arrayList2.add(new xw7(a2, expandInfo.c));
                }
            }
            String str6 = cancelReasonsPresentation != null ? cancelReasonsPresentation.a : null;
            gy7 gy7Var = new gy7(str6 != null ? str6 : "", arrayList2, !booleanValue && z);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(gy7Var, this) == coroutineSingletons) {
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
