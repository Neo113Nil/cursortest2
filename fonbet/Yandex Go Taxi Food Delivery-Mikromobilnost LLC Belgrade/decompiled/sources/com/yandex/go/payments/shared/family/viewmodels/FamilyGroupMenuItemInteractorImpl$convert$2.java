package com.yandex.go.payments.shared.family.viewmodels;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.family.viewmodels.FamilyGroupMenuItemInteractorImpl$convert$2", f = "FamilyGroupMenuItemInteractorImpl.kt", l = {85}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class FamilyGroupMenuItemInteractorImpl$convert$2 extends SuspendLambda implements wls {
    final /* synthetic */ Map<String, String> $templates;
    final /* synthetic */ FormattedText $text;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyGroupMenuItemInteractorImpl$convert$2(c cVar, FormattedText formattedText, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$text = formattedText;
        this.$templates = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FamilyGroupMenuItemInteractorImpl$convert$2(this.this$0, this.$text, this.$templates, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FamilyGroupMenuItemInteractorImpl$convert$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ru.yandex.taxi.widget.c cVar = this.this$0.b;
        FormattedText formattedText = this.$text;
        Map<String, String> map = this.$templates;
        this.label = 1;
        Object e = ru.yandex.taxi.widget.c.e(cVar, formattedText, map, false, this, 28);
        return e == coroutineSingletons ? coroutineSingletons : e;
    }
}
