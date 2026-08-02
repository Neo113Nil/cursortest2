package com.ybsdk.feature.transfer.version2.internal.screens.main.domain;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.uc8;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Luc8;", "", "<anonymous>", "(Ljava/util/List;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.main.domain.AddCardInteractor$pollAddedCard$2", f = "AddCardInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AddCardInteractor$pollAddedCard$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $trustId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddCardInteractor$pollAddedCard$2(String str, Continuation continuation) {
        super(2, continuation);
        this.$trustId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AddCardInteractor$pollAddedCard$2 addCardInteractor$pollAddedCard$2 = new AddCardInteractor$pollAddedCard$2(this.$trustId, continuation);
        addCardInteractor$pollAddedCard$2.L$0 = obj;
        return addCardInteractor$pollAddedCard$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddCardInteractor$pollAddedCard$2) create((List) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List list = (List) this.L$0;
        String str = this.$trustId;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (jl40.l(((uc8) it.next()).a, str)) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
