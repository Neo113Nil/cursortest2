package com.ybsdk.feature.card.internal.presentation.carddeletion;

import com.ybsdk.core.analytics.generated.delegates.CardCommonEvents$CardUserBlockResultResult;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$Request;
import com.ybsdk.feature.card.internal.interactors.c;
import defpackage.ayp0;
import defpackage.dzh0;
import defpackage.i5z0;
import defpackage.mf8;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.qn8;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xxp0;
import defpackage.yxp0;
import defpackage.zc8;
import defpackage.zxp0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.presentation.carddeletion.CardDeletionViewModel$deleteCard$2", f = "CardDeletionViewModel.kt", l = {99}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardDeletionViewModel$deleteCard$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $verificationToken;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDeletionViewModel$deleteCard$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$verificationToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardDeletionViewModel$deleteCard$2(this.this$0, this.$verificationToken, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardDeletionViewModel$deleteCard$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            c cVar = aVar.B;
            String str = ((zc8) aVar.X()).a;
            a aVar2 = this.this$0;
            String str2 = this.$verificationToken;
            this.label = 1;
            a = cVar.a(aVar2, str, str2, this);
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
        a aVar3 = this.this$0;
        if (!(a instanceof Result.Failure)) {
            ayp0 ayp0Var = (ayp0) a;
            if (ayp0Var instanceof xxp0) {
                qn8 qn8Var = aVar3.C;
                com.ybsdk.core.utils.text.b bVar = Text.Companion;
                int i2 = dzh0.ybsdk_card_deletion_delete_button_title;
                bVar.getClass();
                new Text.Resource(i2);
                aVar3.F.h(((mf8) qn8Var).b(((xxp0) ayp0Var).a, CardSecondFactorHelper$Request.DELETION));
            } else if (ayp0Var instanceof yxp0) {
                pz40 Y = aVar3.Y();
                do {
                    r0Var3 = (r0) Y;
                    value3 = r0Var3.getValue();
                } while (!r0Var3.k(value3, zc8.a((zc8) value3, CardDeletionOperationState.ERROR, ((yxp0) ayp0Var).a, 11)));
                aVar3.E.k.j(CardCommonEvents$CardUserBlockResultResult.ERROR, "2fa denied");
            } else {
                if (!(ayp0Var instanceof zxp0)) {
                    w511.b();
                    return null;
                }
                pz40 Y2 = aVar3.Y();
                do {
                    r0Var2 = (r0) Y2;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, zc8.a((zc8) value2, CardDeletionOperationState.SUCCESS, null, 27)));
                aVar3.E.k.j(CardCommonEvents$CardUserBlockResultResult.OK, null);
            }
        }
        a aVar4 = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            i5z0.a.l(a2, new Object[0]);
            pz40 Y3 = aVar4.Y();
            do {
                r0Var = (r0) Y3;
                value = r0Var.getValue();
            } while (!r0Var.k(value, zc8.a((zc8) value, CardDeletionOperationState.ERROR, null, 27)));
            aVar4.E.k.j(CardCommonEvents$CardUserBlockResultResult.ERROR, a2.getMessage());
        }
        return zy11.a;
    }
}
