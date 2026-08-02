package com.yandex.go.places.map.ui.pinwar;

import com.yandex.go.places.impl.domain.interactors.map.f;
import com.yandex.go.places.map.data.repositories.h;
import defpackage.a4j0;
import defpackage.fr;
import defpackage.kn00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.map.ui.pinwar.PinsMapPresenterV2$handleOnOrganizationPinShown$1", f = "PinsMapPresenterV2.kt", l = {102}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PinsMapPresenterV2$handleOnOrganizationPinShown$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinsMapPresenterV2$handleOnOrganizationPinShown$1(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinsMapPresenterV2$handleOnOrganizationPinShown$1(this.this$0, this.$id, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinsMapPresenterV2$handleOnOrganizationPinShown$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h hVar = this.this$0.A;
            String str = this.$id;
            this.label = 1;
            obj = hVar.h(str, this);
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
        kn00 kn00Var = (kn00) obj;
        if (kn00Var != null) {
            f fVar = this.this$0.K;
            a4j0 a4j0Var = fVar.f;
            if (!a4j0Var.a.a.contains(kn00Var.getId())) {
                a4j0Var.a.a.add(kn00Var.getId());
                fr c = kn00Var.c();
                if (c != null) {
                    fVar.a.a(c, null);
                }
            }
        }
        return zy11.a;
    }
}
