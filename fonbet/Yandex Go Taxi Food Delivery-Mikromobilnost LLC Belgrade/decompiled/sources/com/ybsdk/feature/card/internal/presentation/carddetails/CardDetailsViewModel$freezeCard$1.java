package com.ybsdk.feature.card.internal.presentation.carddetails;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenFreezeResultResult;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenUnfreezeResultResult;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$Request;
import com.ybsdk.feature.card.api.entities.YbCardStatusEntity;
import com.ybsdk.feature.card.internal.interactors.d;
import defpackage.ayp0;
import defpackage.bq51;
import defpackage.bq8;
import defpackage.dzh0;
import defpackage.fe8;
import defpackage.gao;
import defpackage.id8;
import defpackage.jd8;
import defpackage.mf8;
import defpackage.mvg;
import defpackage.n0t0;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.qn8;
import defpackage.tfl0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.xxp0;
import defpackage.yxp0;
import defpackage.zxp0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsViewModel$freezeCard$1", f = "CardDetailsViewModel.kt", l = {755}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardDetailsViewModel$freezeCard$1 extends SuspendLambda implements wls {
    final /* synthetic */ bq51 $card;
    final /* synthetic */ String $verificationToken;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDetailsViewModel$freezeCard$1(b bVar, bq51 bq51Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$card = bq51Var;
        this.$verificationToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardDetailsViewModel$freezeCard$1(this.this$0, this.$card, this.$verificationToken, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardDetailsViewModel$freezeCard$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        bq8 bq8Var;
        YbCardStatusEntity ybCardStatusEntity;
        Object obj2;
        int i;
        r0 r0Var2;
        Object value2;
        bq8 bq8Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            bq51 bq51Var = this.$card;
            pz40 Y = bVar.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
                bq8Var = (bq8) value;
            } while (!r0Var.k(value, bq8.a(bq8Var, null, null, false, kotlin.collections.b.o(bq8Var.d, new Pair(bq51Var.d, Boolean.TRUE)), null, null, null, null, null, 16375)));
            YbCardStatusEntity ybCardStatusEntity2 = this.$card.e;
            YbCardStatusEntity ybCardStatusEntity3 = YbCardStatusEntity.FROZEN;
            YbCardStatusEntity ybCardStatusEntity4 = ybCardStatusEntity2 == ybCardStatusEntity3 ? YbCardStatusEntity.ACTIVE : ybCardStatusEntity3;
            jd8 jd8Var = this.this$0.J;
            jd8Var.getClass();
            int i3 = id8.a[ybCardStatusEntity4.ordinal()];
            AppAnalyticsReporter appAnalyticsReporter = jd8Var.a;
            if (i3 == 1) {
                appAnalyticsReporter.l.a.a("card.main_screen.unfreeze.initiated", null);
            } else {
                appAnalyticsReporter.l.a.a("card.main_screen.freeze.initiated", null);
            }
            bq51 bq51Var2 = this.$card;
            int i4 = bq51Var2.e == ybCardStatusEntity3 ? dzh0.ybsdk_card_card_unfreeze_failure : dzh0.ybsdk_card_card_freeze_failure;
            b bVar2 = this.this$0;
            d dVar = bVar2.R;
            String str = bq51Var2.d;
            String str2 = this.$verificationToken;
            this.L$0 = ybCardStatusEntity4;
            this.I$0 = i4;
            this.label = 1;
            YbCardStatusEntity ybCardStatusEntity5 = ybCardStatusEntity4;
            Object c = dVar.c(str, ybCardStatusEntity5, bVar2, str2, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
            ybCardStatusEntity = ybCardStatusEntity5;
            obj2 = c;
            i = i4;
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            ybCardStatusEntity = (YbCardStatusEntity) this.L$0;
            kotlin.b.b(obj);
            obj2 = ((Result) obj).getValue();
        }
        b bVar3 = this.this$0;
        bq51 bq51Var3 = this.$card;
        AppAnalyticsReporter appAnalyticsReporter2 = bVar3.J.a;
        boolean z = obj2 instanceof Result.Failure;
        if (!z && (((ayp0) obj2) instanceof zxp0)) {
            if (ybCardStatusEntity == YbCardStatusEntity.ACTIVE) {
                appAnalyticsReporter2.l.e(jd8.d(bq51Var3), CardMainScreenEvents$CardMainScreenUnfreezeResultResult.OK, null);
            } else {
                appAnalyticsReporter2.l.c(jd8.c(bq51Var3), CardMainScreenEvents$CardMainScreenFreezeResultResult.OK, null);
            }
        }
        if (Result.a(obj2) != null) {
            if (ybCardStatusEntity == YbCardStatusEntity.ACTIVE) {
                appAnalyticsReporter2.l.e(jd8.d(bq51Var3), CardMainScreenEvents$CardMainScreenUnfreezeResultResult.ERROR, null);
            } else {
                appAnalyticsReporter2.l.c(jd8.c(bq51Var3), CardMainScreenEvents$CardMainScreenFreezeResultResult.ERROR, null);
            }
        }
        b bVar4 = this.this$0;
        bq51 bq51Var4 = this.$card;
        if (!z) {
            ayp0 ayp0Var = (ayp0) obj2;
            if (ayp0Var instanceof xxp0) {
                tfl0 tfl0Var = bVar4.C;
                qn8 qn8Var = bVar4.H;
                if (bq51Var4.e == YbCardStatusEntity.FROZEN) {
                    com.ybsdk.core.utils.text.b bVar5 = Text.Companion;
                    int i5 = dzh0.ybsdk_card_card_unfreeze_action;
                    bVar5.getClass();
                    new Text.Resource(i5);
                } else {
                    com.ybsdk.core.utils.text.b bVar6 = Text.Companion;
                    int i6 = dzh0.ybsdk_card_card_freeze_action;
                    bVar6.getClass();
                    new Text.Resource(i6);
                }
                tfl0Var.h(((mf8) qn8Var).b(((xxp0) ayp0Var).a, CardSecondFactorHelper$Request.FREEZING));
            } else if (ayp0Var instanceof yxp0) {
                bVar4.Z(new fe8(new n0t0(new Text.Resource(i), Text.Empty.INSTANCE)));
            } else {
                if (!(ayp0Var instanceof zxp0)) {
                    w511.b();
                    return null;
                }
                bVar4.v0(false);
            }
            bVar4.Q.getClass();
        }
        b bVar7 = this.this$0;
        Throwable a = Result.a(obj2);
        if (a != null) {
            x4c.g("Exception during freezeCard() in CardDetailsViewModel", a, null, null, 12);
            bVar7.Z(new fe8(gao.d(new Text.Resource(i), Text.Empty.INSTANCE, a)));
        }
        b bVar8 = this.this$0;
        bq51 bq51Var5 = this.$card;
        pz40 Y2 = bVar8.Y();
        do {
            r0Var2 = (r0) Y2;
            value2 = r0Var2.getValue();
            bq8Var2 = (bq8) value2;
        } while (!r0Var2.k(value2, bq8.a(bq8Var2, null, null, false, kotlin.collections.b.j(bq51Var5.d, bq8Var2.d), null, null, null, null, null, 16375)));
        return zy11.a;
    }
}
