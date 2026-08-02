package com.yandex.go.summary.interactor.common.state;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.common.state.SelectorUiStateInteractor$convertFormattedTextWithFallback$2", f = "SelectorUiStateInteractor.kt", l = {818}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SelectorUiStateInteractor$convertFormattedTextWithFallback$2 extends SuspendLambda implements wls {
    final /* synthetic */ FormattedText $text;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectorUiStateInteractor$convertFormattedTextWithFallback$2(c cVar, FormattedText formattedText, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$text = formattedText;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SelectorUiStateInteractor$convertFormattedTextWithFallback$2(this.this$0, this.$text, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectorUiStateInteractor$convertFormattedTextWithFallback$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c cVar;
        FormattedText formattedText;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar2 = this.this$0;
                FormattedText formattedText2 = this.$text;
                try {
                    ru.yandex.taxi.widget.utils.e eVar = cVar2.d;
                    this.L$0 = cVar2;
                    this.L$1 = formattedText2;
                    this.label = 1;
                    Object t = eVar.t(formattedText2, this);
                    if (t == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = t;
                    cVar = cVar2;
                    formattedText = formattedText2;
                } catch (Throwable unused) {
                    cVar = cVar2;
                    formattedText = formattedText2;
                    return cVar.d.r(formattedText);
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                formattedText = (FormattedText) this.L$1;
                cVar = (c) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable unused2) {
                    return cVar.d.r(formattedText);
                }
            }
            return (CharSequence) obj;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
