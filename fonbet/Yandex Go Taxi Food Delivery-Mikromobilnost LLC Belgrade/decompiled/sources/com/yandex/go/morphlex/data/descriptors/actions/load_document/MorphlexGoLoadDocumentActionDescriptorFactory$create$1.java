package com.yandex.go.morphlex.data.descriptors.actions.load_document;

import com.yandex.go.morphlex.data.e;
import defpackage.h830;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lu1m;", "<anonymous>", "()Lu1m;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.morphlex.data.descriptors.actions.load_document.MorphlexGoLoadDocumentActionDescriptorFactory$create$1", f = "MorphlexGoLoadDocumentActionDescriptorFactory.kt", l = {27}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MorphlexGoLoadDocumentActionDescriptorFactory$create$1 extends SuspendLambda implements tls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MorphlexGoLoadDocumentActionDescriptorFactory$create$1(a aVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MorphlexGoLoadDocumentActionDescriptorFactory$create$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((MorphlexGoLoadDocumentActionDescriptorFactory$create$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            h830 h830Var = aVar.d.a;
            if (h830Var == null) {
                ny61.g("Required value was null.");
                return null;
            }
            e eVar = (e) aVar.c.get();
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = eVar.c(h830Var, this);
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
        if (obj != null) {
            return obj;
        }
        ny61.g("Required value was null.");
        return null;
    }
}
