package com.yandex.go.ultima_mode.ui.header.state;

import com.yandex.go.ultima_mode.api.data.UltimaModeResponse;
import defpackage.d9s;
import defpackage.gwk0;
import defpackage.ief;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ultima_mode.ui.header.state.UltimaModeHeaderUiStateMapper$map$2$titleTrail$1", f = "UltimaModeHeaderUiStateMapper.kt", l = {38}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UltimaModeHeaderUiStateMapper$map$2$titleTrail$1 extends SuspendLambda implements wls {
    final /* synthetic */ ief $currencyRulesDto;
    final /* synthetic */ UltimaModeResponse.Title $titleDto;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UltimaModeHeaderUiStateMapper$map$2$titleTrail$1(a aVar, UltimaModeResponse.Title title, ief iefVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$titleDto = title;
        this.$currencyRulesDto = iefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UltimaModeHeaderUiStateMapper$map$2$titleTrail$1(this.this$0, this.$titleDto, this.$currencyRulesDto, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UltimaModeHeaderUiStateMapper$map$2$titleTrail$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj2 = null;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        UltimaModeResponse.Title.Trail trail = this.$titleDto.b;
        FormattedText formattedText = trail != null ? trail.a : null;
        ief iefVar = this.$currencyRulesDto;
        this.label = 1;
        if (formattedText != null) {
            obj2 = aVar.b.t(d9s.c(formattedText, aVar.a, iefVar != null ? gwk0.h(iefVar) : null, true), this);
        } else {
            aVar.getClass();
        }
        return obj2 == coroutineSingletons ? coroutineSingletons : obj2;
    }
}
