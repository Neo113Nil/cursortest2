package com.yandex.go.transfer_requirement.state.service_section;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.state.service_section.ServiceSectionUiStateMapper$mapLuggageCount$2$title$1$1", f = "ServiceSectionUiStateMapper.kt", l = {175}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ServiceSectionUiStateMapper$mapLuggageCount$2$title$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ FormattedText $it;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceSectionUiStateMapper$mapLuggageCount$2$title$1$1(a aVar, FormattedText formattedText, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$it = formattedText;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ServiceSectionUiStateMapper$mapLuggageCount$2$title$1$1(this.this$0, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ServiceSectionUiStateMapper$mapLuggageCount$2$title$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        c cVar = this.this$0.a;
        FormattedText formattedText = this.$it;
        this.label = 1;
        Object e = c.e(cVar, formattedText, null, false, this, 30);
        return e == coroutineSingletons ? coroutineSingletons : e;
    }
}
