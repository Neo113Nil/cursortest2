package com.ybsdk.feature.card.internal.presentation.singlecard;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$Request;
import com.ybsdk.feature.card.api.entities.YbCardStatusEntity;
import com.ybsdk.feature.card.internal.interactors.d;
import defpackage.ayp0;
import defpackage.dzh0;
import defpackage.e7r0;
import defpackage.fe8;
import defpackage.gao;
import defpackage.mf8;
import defpackage.mvg;
import defpackage.n0t0;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.qn8;
import defpackage.rgs0;
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
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.presentation.singlecard.SingleCardViewModel$freezeCard$2", f = "SingleCardViewModel.kt", l = {NetworkRequestException.INVALID_RANGE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SingleCardViewModel$freezeCard$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $cardId;
    final /* synthetic */ String $freezeKey;
    final /* synthetic */ boolean $isFrozen;
    final /* synthetic */ String $verificationToken;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleCardViewModel$freezeCard$2(String str, a aVar, boolean z, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.$freezeKey = str;
        this.this$0 = aVar;
        this.$isFrozen = z;
        this.$cardId = str2;
        this.$verificationToken = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SingleCardViewModel$freezeCard$2(this.$freezeKey, this.this$0, this.$isFrozen, this.$cardId, this.$verificationToken, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SingleCardViewModel$freezeCard$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        YbCardStatusEntity ybCardStatusEntity;
        Object obj2;
        int i;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        String str = null;
        if (i2 == 0) {
            b.b(obj);
            String str2 = this.$freezeKey;
            if (str2 != null) {
                a aVar = this.this$0;
                String str3 = this.$cardId;
                pz40 Y = aVar.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, rgs0.a((rgs0) value, null, false, null, false, null, new e7r0(str3, str2, 4), true, 639)));
            }
            boolean z = this.$isFrozen;
            YbCardStatusEntity ybCardStatusEntity2 = z ? YbCardStatusEntity.ACTIVE : YbCardStatusEntity.FROZEN;
            int i3 = z ? dzh0.ybsdk_card_card_unfreeze_failure : dzh0.ybsdk_card_card_freeze_failure;
            a aVar2 = this.this$0;
            d dVar = aVar2.J;
            String str4 = this.$cardId;
            String str5 = this.$verificationToken;
            this.L$0 = ybCardStatusEntity2;
            this.I$0 = i3;
            this.label = 1;
            Object c = dVar.c(str4, ybCardStatusEntity2, aVar2, str5, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
            ybCardStatusEntity = ybCardStatusEntity2;
            obj2 = c;
            i = i3;
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            ybCardStatusEntity = (YbCardStatusEntity) this.L$0;
            b.b(obj);
            obj2 = ((Result) obj).getValue();
        }
        a aVar3 = this.this$0;
        boolean z2 = this.$isFrozen;
        if (!(obj2 instanceof Result.Failure)) {
            ayp0 ayp0Var = (ayp0) obj2;
            if (ayp0Var instanceof xxp0) {
                tfl0 tfl0Var = aVar3.E;
                qn8 qn8Var = aVar3.F;
                if (z2) {
                    com.ybsdk.core.utils.text.b bVar = Text.Companion;
                    int i4 = dzh0.ybsdk_card_card_unfreeze_action;
                    bVar.getClass();
                    new Text.Resource(i4);
                } else {
                    com.ybsdk.core.utils.text.b bVar2 = Text.Companion;
                    int i5 = dzh0.ybsdk_card_card_freeze_action;
                    bVar2.getClass();
                    new Text.Resource(i5);
                }
                tfl0Var.h(((mf8) qn8Var).b(((xxp0) ayp0Var).a, CardSecondFactorHelper$Request.FREEZING));
            } else if (ayp0Var instanceof yxp0) {
                aVar3.Z(new fe8(new n0t0(new Text.Resource(i))));
                aVar3.L.o(ybCardStatusEntity, ((rgs0) aVar3.X()).b(), false, "2fa denied");
            } else {
                if (!(ayp0Var instanceof zxp0)) {
                    w511.b();
                    return null;
                }
                aVar3.L.o(ybCardStatusEntity, ((rgs0) aVar3.X()).b(), true, null);
                aVar3.f0(false);
            }
            aVar3.K.getClass();
        }
        a aVar4 = this.this$0;
        Throwable a = Result.a(obj2);
        if (a != null) {
            x4c.g("Exception during freezeCard() in CardDetailsViewModel", a, null, null, 12);
            aVar4.L.o(ybCardStatusEntity, ((rgs0) aVar4.X()).b(), false, a.getMessage());
            aVar4.Z(new fe8(gao.d(new Text.Resource(i), Text.Empty.INSTANCE, a)));
        }
        pz40 Y2 = this.this$0.Y();
        do {
            r0Var2 = (r0) Y2;
            value2 = r0Var2.getValue();
        } while (!r0Var2.k(value2, rgs0.a((rgs0) value2, null, false, null, false, null, new e7r0(str, str, 7), false, 639)));
        return zy11.a;
    }
}
