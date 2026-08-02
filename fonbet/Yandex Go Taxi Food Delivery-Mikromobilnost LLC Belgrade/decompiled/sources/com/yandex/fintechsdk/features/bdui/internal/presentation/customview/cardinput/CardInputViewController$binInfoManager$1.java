package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput;

import com.yandex.yphone.service.settings.AppSettingsContract$Setting;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.xb8;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", AppSettingsContract$Setting.COLUMN_PREFIX, "Lkotlin/Result;", "Let5;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.CardInputViewController$binInfoManager$1", f = "CardInputViewController.kt", l = {HProv.PP_DHOID}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CardInputViewController$binInfoManager$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardInputViewController$binInfoManager$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CardInputViewController$binInfoManager$1 cardInputViewController$binInfoManager$1 = new CardInputViewController$binInfoManager$1(this.this$0, continuation);
        cardInputViewController$binInfoManager$1.L$0 = obj;
        return cardInputViewController$binInfoManager$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardInputViewController$binInfoManager$1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            String str = (String) this.L$0;
            a aVar = this.this$0;
            xb8 xb8Var = aVar.b;
            String str2 = aVar.w;
            this.label = 1;
            a = ((com.yandex.fintechsdk.data.payment.method.impl.internal.card.a) xb8Var).a(str2, str, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
