package com.yandex.go.agreement.trackable.mapper;

import defpackage.cd;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.agreement.trackable.mapper.TrackableAcceptanceUiStateMapper$map$2$title$1", f = "TrackableAcceptanceUiStateMapper.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class TrackableAcceptanceUiStateMapper$map$2$title$1 extends SuspendLambda implements wls {
    final /* synthetic */ cd $acceptance;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackableAcceptanceUiStateMapper$map$2$title$1(cd cdVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$acceptance = cdVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrackableAcceptanceUiStateMapper$map$2$title$1(this.$acceptance, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrackableAcceptanceUiStateMapper$map$2$title$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            FormattedText formattedText = this.$acceptance.c;
            if (formattedText == null) {
                return null;
            }
            c cVar = this.this$0.c;
            this.L$0 = null;
            this.label = 1;
            obj = c.i(cVar, formattedText, null, this, 30);
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
        return (CharSequence) obj;
    }
}
