package com.yandex.go.places.impl.data.repositories.organizations;

import defpackage.gvp0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s95;
import defpackage.t95;
import defpackage.tse;
import defpackage.u95;
import defpackage.v95;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lv95;", "<anonymous>", "(Ltse;)Lv95;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.data.repositories.organizations.OrganizationsSearchOptionsRepository$getSearchOptionById$2", f = "OrganizationsSearchOptionsRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationsSearchOptionsRepository$getSearchOptionById$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $optionId;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationsSearchOptionsRepository$getSearchOptionById$2(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$optionId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationsSearchOptionsRepository$getSearchOptionById$2(this.this$0, this.$optionId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationsSearchOptionsRepository$getSearchOptionById$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        boolean z;
        Object obj2;
        Object obj3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List a = this.this$0.a();
        String str = this.$optionId;
        Iterator it = a.iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
                v95 v95Var = (v95) next;
                z = false;
                if (v95Var instanceof s95) {
                    Iterator it2 = ((s95) v95Var).b.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it2.next();
                        if (jl40.l(((gvp0) obj3).a, str)) {
                            break;
                        }
                    }
                    if (obj3 == null) {
                    }
                    z = true;
                } else if (v95Var instanceof t95) {
                    Iterator it3 = ((t95) v95Var).b.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it3.next();
                        if (jl40.l(((gvp0) obj2).a, str)) {
                            break;
                        }
                    }
                    if (obj2 == null) {
                    }
                    z = true;
                } else if (v95Var instanceof u95) {
                    z = jl40.l(((u95) v95Var).b.a, str);
                } else {
                    w511.b();
                }
            }
            return null;
        } while (!z);
        return next;
    }
}
