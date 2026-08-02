package com.yandex.go.superapp_carts.ui.preview;

import defpackage.avj0;
import defpackage.bxh0;
import defpackage.h2m;
import defpackage.jg90;
import defpackage.kg90;
import defpackage.kyh0;
import defpackage.l2m;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.q3m;
import defpackage.tse;
import defpackage.u1m;
import defpackage.wls;
import defpackage.z131;
import defpackage.zy11;
import java.io.InputStream;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lq3m;", "<anonymous>", "(Ltse;)Lq3m;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp_carts.ui.preview.SuperappCartPreviewInteractor$getPreviewDocumentWithVariables$2", f = "SuperappCartPreviewInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperappCartPreviewInteractor$getPreviewDocumentWithVariables$2 extends SuspendLambda implements wls {
    final /* synthetic */ l2m $parser;
    final /* synthetic */ u1m $query;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappCartPreviewInteractor$getPreviewDocumentWithVariables$2(b bVar, l2m l2mVar, u1m u1mVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$parser = l2mVar;
        this.$query = u1mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperappCartPreviewInteractor$getPreviewDocumentWithVariables$2(this.this$0, this.$parser, this.$query, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappCartPreviewInteractor$getPreviewDocumentWithVariables$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        InputStream openRawResource = ((avj0) bVar.c).a.getResources().openRawResource(bxh0.superapp_cart_preview);
        try {
            kg90 kg90Var = (kg90) this.$parser.b(this.$query, null, null).a(kotlin.collections.b.f(), openRawResource);
            ooc.g(openRawResource, null);
            if (!(kg90Var instanceof jg90)) {
                return null;
            }
            return new q3m(((h2m) ((jg90) kg90Var).a).a, Collections.singletonList(new z131("superapp_cart.screen.title", ((avj0) this.this$0.c).h(kyh0.superapp_cart_header_title))));
        } finally {
        }
    }
}
