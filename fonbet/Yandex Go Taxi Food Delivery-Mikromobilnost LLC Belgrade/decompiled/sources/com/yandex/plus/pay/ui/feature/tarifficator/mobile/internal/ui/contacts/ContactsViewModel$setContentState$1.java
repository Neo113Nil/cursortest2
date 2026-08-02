package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts;

import defpackage.eu90;
import defpackage.ind0;
import defpackage.lde;
import defpackage.mvg;
import defpackage.nce;
import defpackage.ny61;
import defpackage.ode;
import defpackage.tse;
import defpackage.wls;
import defpackage.xvz;
import defpackage.zy11;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsViewModel$setContentState$1", f = "ContactsViewModel.kt", l = {109}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ContactsViewModel$setContentState$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsViewModel$setContentState$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ContactsViewModel$setContentState$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ContactsViewModel$setContentState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.a aVar = this.this$0.c;
            this.label = 1;
            obj = aVar.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        nce nceVar = (nce) obj;
        a aVar2 = this.this$0;
        if (nceVar != null) {
            String str = nceVar.b;
            String str2 = nceVar.a;
            ind0 a = aVar2.b.a.a();
            aVar2.y = nceVar;
            r0 r0Var = aVar2.z;
            ode odeVar = new ode(str2, str);
            r0Var.getClass();
            r0Var.m(null, odeVar);
            lde ldeVar = aVar2.x;
            String uuid = a.a.toString();
            eu90 eu90Var = ldeVar.a;
            LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", uuid, "url", str2);
            t.put("skipButtonText", str);
            t.put("_meta", eu90.c(new HashMap()));
            eu90Var.f("CollectingContacts.Screen.Shown", t);
        } else {
            aVar2.W();
        }
        return zy11.a;
    }
}
