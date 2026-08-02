package com.ybsdk.feature.card.internal.presentation.cardreissue;

import com.ybsdk.core.analytics.generated.delegates.CardCommonEvents$CardReissueStartResultResult;
import com.ybsdk.core.utils.d;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$Request;
import com.ybsdk.feature.card.internal.interactors.j;
import defpackage.b64;
import defpackage.dm8;
import defpackage.ds31;
import defpackage.em8;
import defpackage.g8e;
import defpackage.gm8;
import defpackage.hm8;
import defpackage.km8;
import defpackage.m04;
import defpackage.mf8;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pk11;
import defpackage.pz40;
import defpackage.qk11;
import defpackage.qn8;
import defpackage.rk11;
import defpackage.sk11;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.tse;
import defpackage.u3f;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.presentation.cardreissue.CardReissueViewModel$startCardReissue$1", f = "CardReissueViewModel.kt", l = {HProv.PP_REBOOT}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardReissueViewModel$startCardReissue$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $operationId;
    final /* synthetic */ String $verificationToken;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lsk11;", "Lu3f;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.card.internal.presentation.cardreissue.CardReissueViewModel$startCardReissue$1$2", f = "CardReissueViewModel.kt", l = {99}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.card.internal.presentation.cardreissue.CardReissueViewModel$startCardReissue$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ String $operationId;
        final /* synthetic */ String $verificationToken;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(a aVar, String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$operationId = str;
            this.$verificationToken = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$operationId, this.$verificationToken, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                String str = (String) this.L$0;
                a aVar = this.this$0;
                j jVar = aVar.D;
                String cardId = aVar.B.getCardId();
                String str2 = this.$operationId;
                String str3 = this.$verificationToken;
                this.label = 1;
                b = jVar.b(cardId, str2, str3, str, this);
                if (b == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                b = ((Result) obj).getValue();
            }
            return new Result(b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardReissueViewModel$startCardReissue$1(a aVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$operationId = str;
        this.$verificationToken = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardReissueViewModel$startCardReissue$1(this.this$0, this.$operationId, this.$verificationToken, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardReissueViewModel$startCardReissue$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        km8 km8Var;
        Object a;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        km8 km8Var2;
        r0 r0Var4;
        Object value4;
        Text.Constant i;
        Text g;
        r0 r0Var5;
        Object value5;
        Object obj2;
        u3f u3fVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            a aVar = this.this$0;
            Text.Resource resource = a.I;
            pz40 Y = aVar.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
                km8Var = (km8) value;
            } while (!r0Var.k(value, new hm8(km8Var.getTitle(), km8Var.getMessage(), aVar.B.getLandingImage())));
            a aVar2 = this.this$0;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(aVar2, this.$operationId, this.$verificationToken, null);
            this.label = 1;
            a = d.a(aVar2, anonymousClass2, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        a aVar3 = this.this$0;
        if (!(a instanceof Result.Failure)) {
            sk11 sk11Var = (sk11) a;
            if (sk11Var instanceof rk11) {
                aVar3.F.a.k.i(CardCommonEvents$CardReissueStartResultResult.OK, null);
                pz40 Y2 = aVar3.Y();
                do {
                    r0Var5 = (r0) Y2;
                    value5 = r0Var5.getValue();
                    obj2 = ((rk11) sk11Var).a;
                    u3fVar = (u3f) obj2;
                } while (!r0Var5.k(value5, new gm8(u3fVar.b, u3fVar.c, null, null, null)));
                tje.N(ds31.a(aVar3), null, null, new CardReissueViewModel$observeCardReissueStatus$1(aVar3, ((u3f) obj2).a, null), 3);
            } else if (sk11Var instanceof qk11) {
                qk11 qk11Var = (qk11) sk11Var;
                String str = qk11Var.b;
                String str2 = qk11Var.a;
                String l = b64.l("error=", str2, " description=", str);
                x4c.g("Card reissue error", null, l, null, 10);
                aVar3.F.a.k.i(CardCommonEvents$CardReissueStartResultResult.ERROR, l);
                pz40 Y3 = aVar3.Y();
                do {
                    r0Var4 = (r0) Y3;
                    value4 = r0Var4.getValue();
                    i = g8e.i(Text.Companion, str2);
                    g = com.ybsdk.core.utils.text.d.g(str);
                    if (g == null) {
                        g = a.J;
                    }
                } while (!r0Var4.k(value4, new em8(i, g, qk11Var.d, null)));
            } else {
                if (!(sk11Var instanceof pk11)) {
                    w511.b();
                    return null;
                }
                aVar3.F.a.k.i(CardCommonEvents$CardReissueStartResultResult.AUTHENTICATION_REQUIRED, null);
                tfl0 tfl0Var = aVar3.H;
                qn8 qn8Var = aVar3.E;
                Text.Empty empty = Text.Empty.INSTANCE;
                pk11 pk11Var = (pk11) sk11Var;
                tfl0Var.h(((mf8) qn8Var).b(pk11Var.a, CardSecondFactorHelper$Request.REISSUE));
                pz40 Y4 = aVar3.Y();
                do {
                    r0Var3 = (r0) Y4;
                    value3 = r0Var3.getValue();
                    km8Var2 = (km8) value3;
                } while (!r0Var3.k(value3, new dm8(km8Var2.getTitle(), km8Var2.getMessage(), pk11Var.b)));
            }
        }
        a aVar4 = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            x4c.g("Error in time start of card reissue", a2, null, null, 12);
            m04 m04Var = aVar4.F;
            m04Var.a.k.i(CardCommonEvents$CardReissueStartResultResult.ERROR, a2.getMessage());
            pz40 Y5 = aVar4.Y();
            do {
                r0Var2 = (r0) Y5;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, new em8(a.I, a.J, null, a2)));
        }
        return zy11.a;
    }
}
