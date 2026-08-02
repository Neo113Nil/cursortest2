package com.yandex.go.multimodal_route.ui.onboarding;

import defpackage.cu40;
import defpackage.mja1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wt40;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcu40;", "<anonymous>", "(Ltse;)Lcu40;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.ui.onboarding.MultimodalRouteOnboardingUiStateInteractor$getUiState$state$1", f = "MultimodalRouteOnboardingUiStateInteractor.kt", l = {29, 30, 31}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MultimodalRouteOnboardingUiStateInteractor$getUiState$state$1 extends SuspendLambda implements wls {
    final /* synthetic */ wt40 $config;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultimodalRouteOnboardingUiStateInteractor$getUiState$state$1(c cVar, wt40 wt40Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$config = wt40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MultimodalRouteOnboardingUiStateInteractor$getUiState$state$1(this.this$0, this.$config, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MultimodalRouteOnboardingUiStateInteractor$getUiState$state$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r13 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
    
        if (r13 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0094  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MultimodalRouteOnboardingUiStateInteractor$getUiState$state$1 multimodalRouteOnboardingUiStateInteractor$getUiState$state$1;
        CharSequence charSequence;
        CharSequence charSequence2;
        Object e;
        CharSequence charSequence3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.widget.c cVar = this.this$0.b;
            FormattedText formattedText = this.$config.a;
            this.label = 1;
            multimodalRouteOnboardingUiStateInteractor$getUiState$state$1 = this;
            obj = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, multimodalRouteOnboardingUiStateInteractor$getUiState$state$1, 30);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence3 = (CharSequence) this.L$1;
                    charSequence = (CharSequence) this.L$0;
                    kotlin.b.b(obj);
                    multimodalRouteOnboardingUiStateInteractor$getUiState$state$1 = this;
                    CharSequence charSequence4 = (CharSequence) obj;
                    String str = multimodalRouteOnboardingUiStateInteractor$getUiState$state$1.$config.c;
                    return new cu40(charSequence, charSequence4, charSequence3, str != null ? mja1.a(str, null, 6) : null);
                }
                charSequence = (CharSequence) this.L$0;
                kotlin.b.b(obj);
                multimodalRouteOnboardingUiStateInteractor$getUiState$state$1 = this;
                charSequence2 = (CharSequence) obj;
                ru.yandex.taxi.widget.c cVar2 = multimodalRouteOnboardingUiStateInteractor$getUiState$state$1.this$0.b;
                FormattedText formattedText2 = multimodalRouteOnboardingUiStateInteractor$getUiState$state$1.$config.d;
                multimodalRouteOnboardingUiStateInteractor$getUiState$state$1.L$0 = charSequence;
                multimodalRouteOnboardingUiStateInteractor$getUiState$state$1.L$1 = charSequence2;
                multimodalRouteOnboardingUiStateInteractor$getUiState$state$1.label = 3;
                e = ru.yandex.taxi.widget.c.e(cVar2, formattedText2, null, false, multimodalRouteOnboardingUiStateInteractor$getUiState$state$1, 30);
                if (e != coroutineSingletons) {
                    charSequence3 = charSequence2;
                    obj = e;
                    CharSequence charSequence42 = (CharSequence) obj;
                    String str2 = multimodalRouteOnboardingUiStateInteractor$getUiState$state$1.$config.c;
                    return new cu40(charSequence, charSequence42, charSequence3, str2 != null ? mja1.a(str2, null, 6) : null);
                }
                return coroutineSingletons;
            }
            kotlin.b.b(obj);
            multimodalRouteOnboardingUiStateInteractor$getUiState$state$1 = this;
        }
        charSequence = (CharSequence) obj;
        FormattedText formattedText3 = multimodalRouteOnboardingUiStateInteractor$getUiState$state$1.$config.b;
        if (formattedText3 == null) {
            charSequence2 = null;
            ru.yandex.taxi.widget.c cVar22 = multimodalRouteOnboardingUiStateInteractor$getUiState$state$1.this$0.b;
            FormattedText formattedText22 = multimodalRouteOnboardingUiStateInteractor$getUiState$state$1.$config.d;
            multimodalRouteOnboardingUiStateInteractor$getUiState$state$1.L$0 = charSequence;
            multimodalRouteOnboardingUiStateInteractor$getUiState$state$1.L$1 = charSequence2;
            multimodalRouteOnboardingUiStateInteractor$getUiState$state$1.label = 3;
            e = ru.yandex.taxi.widget.c.e(cVar22, formattedText22, null, false, multimodalRouteOnboardingUiStateInteractor$getUiState$state$1, 30);
            if (e != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        ru.yandex.taxi.widget.c cVar3 = multimodalRouteOnboardingUiStateInteractor$getUiState$state$1.this$0.b;
        multimodalRouteOnboardingUiStateInteractor$getUiState$state$1.L$0 = charSequence;
        multimodalRouteOnboardingUiStateInteractor$getUiState$state$1.L$1 = null;
        multimodalRouteOnboardingUiStateInteractor$getUiState$state$1.label = 2;
        obj = ru.yandex.taxi.widget.c.e(cVar3, formattedText3, null, false, multimodalRouteOnboardingUiStateInteractor$getUiState$state$1, 30);
    }
}
