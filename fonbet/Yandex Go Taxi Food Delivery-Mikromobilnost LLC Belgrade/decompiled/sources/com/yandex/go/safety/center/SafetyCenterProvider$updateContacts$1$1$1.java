package com.yandex.go.safety.center;

import com.yandex.go.safety.center.api.BaseTrustedContacts;
import com.yandex.go.safety.center.api.TrustedContact;
import com.yandex.go.safety.center.model.PresentationContact$Mode;
import defpackage.bgb0;
import defpackage.cmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.swe0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.SafetyCenterProvider$updateContacts$1$1$1", f = "SafetyCenterProvider.kt", l = {364}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterProvider$updateContacts$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<swe0> $contacts;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterProvider$updateContacts$1$1$1(j jVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$contacts = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterProvider$updateContacts$1$1$1(this.this$0, this.$contacts, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterProvider$updateContacts$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            SafetyCenterApi safetyCenterApi = this.this$0.a;
            List<swe0> list = this.$contacts;
            ArrayList arrayList = new ArrayList();
            for (swe0 swe0Var : list) {
                if (swe0Var.c != PresentationContact$Mode.REMOVING) {
                    arrayList.add(new TrustedContact(swe0Var.a, bgb0.b(swe0Var.b)));
                }
            }
            cmt<zy11> a = safetyCenterApi.a(new BaseTrustedContacts(arrayList));
            this.label = 1;
            if (ru.yandex.taxi.network.api.a.a(a, null, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        j jVar = this.this$0;
        jVar.getClass();
        jVar.i(PresentationContact$Mode.ADDING);
        return zy11.a;
    }
}
