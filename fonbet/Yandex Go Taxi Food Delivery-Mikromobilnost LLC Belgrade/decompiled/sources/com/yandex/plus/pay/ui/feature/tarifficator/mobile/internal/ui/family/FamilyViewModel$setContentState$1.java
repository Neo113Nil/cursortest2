package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family;

import defpackage.eu90;
import defpackage.i7t;
import defpackage.ind0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.obp;
import defpackage.rbp;
import defpackage.tse;
import defpackage.wap;
import defpackage.wls;
import defpackage.xvz;
import defpackage.zy11;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.FamilyViewModel$setContentState$1", f = "FamilyViewModel.kt", l = {128}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FamilyViewModel$setContentState$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyViewModel$setContentState$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FamilyViewModel$setContentState$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FamilyViewModel$setContentState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            i7t i7tVar = this.this$0.c;
            this.label = 1;
            obj = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.a) i7tVar).a(this);
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
        wap wapVar = (wap) obj;
        b bVar = this.this$0;
        if (wapVar != null) {
            String str = wapVar.c;
            String str2 = wapVar.a;
            ind0 a = bVar.b.a.a();
            bVar.z = wapVar;
            r0 r0Var = bVar.C;
            rbp rbpVar = new rbp(str2, wapVar.b, str);
            r0Var.getClass();
            r0Var.m(null, rbpVar);
            obp obpVar = bVar.x;
            String uuid = a.a.toString();
            eu90 eu90Var = obpVar.b;
            LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", uuid, "url", str2);
            t.put("skipButtonText", str);
            t.put("_meta", eu90.c(new HashMap()));
            eu90Var.f("FamilyInvite.Screen.Shown", t);
        } else {
            bVar.W();
        }
        return zy11.a;
    }
}
