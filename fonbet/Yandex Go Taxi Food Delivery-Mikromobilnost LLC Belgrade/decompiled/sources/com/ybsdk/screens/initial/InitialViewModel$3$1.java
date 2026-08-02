package com.ybsdk.screens.initial;

import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import defpackage.bwv;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.initial.InitialViewModel$3$1", f = "InitialViewModel.kt", l = {HProv.PP_VERSION_TIMESTAMP}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InitialViewModel$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ DeeplinkAction.DeeplinkError $error;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitialViewModel$3$1(d dVar, DeeplinkAction.DeeplinkError deeplinkError, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$error = deeplinkError;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InitialViewModel$3$1(this.this$0, this.$error, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InitialViewModel$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            this.label = 1;
            obj = d.b0(dVar, this);
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
        String str = (String) obj;
        d dVar2 = this.this$0;
        DeeplinkAction.DeeplinkError deeplinkError = this.$error;
        pz40 Y = dVar2.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new bwv(deeplinkError.getTitle(), deeplinkError.getDescription(), deeplinkError.getPrimaryButtonText(), deeplinkError.getButtonAction(), deeplinkError.getHyperlinkTitle(), deeplinkError.getHyperlinkAction(), deeplinkError.getImageUrl(), deeplinkError.getImageUrlDark(), str)));
        return zy11.a;
    }
}
