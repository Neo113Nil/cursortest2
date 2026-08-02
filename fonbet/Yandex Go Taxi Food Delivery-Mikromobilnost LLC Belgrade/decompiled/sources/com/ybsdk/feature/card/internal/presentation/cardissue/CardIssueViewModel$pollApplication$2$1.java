package com.ybsdk.feature.card.internal.presentation.cardissue;

import com.ybsdk.feature.card.api.CardApplicationsRepository$CardIssueResult;
import com.ybsdk.feature.card.internal.interactors.f;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.s7o;
import defpackage.sh8;
import defpackage.tse;
import defpackage.vh8;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.presentation.cardissue.CardIssueViewModel$pollApplication$2$1", f = "CardIssueViewModel.kt", l = {HProv.PP_INFO}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardIssueViewModel$pollApplication$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $applicationId;
    final /* synthetic */ a $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardIssueViewModel$pollApplication$2$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$this_runCatching = aVar;
        this.$applicationId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardIssueViewModel$pollApplication$2$1(this.$this_runCatching, this.$applicationId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardIssueViewModel$pollApplication$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            f fVar = this.$this_runCatching.B;
            String str = this.$applicationId;
            this.label = 1;
            obj = ((com.ybsdk.common.repositiories.card.b) fVar.a).b(str, this);
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
        int i2 = vh8.a[((CardApplicationsRepository$CardIssueResult) obj).ordinal()];
        if (i2 == 1) {
            pz40 Y = this.$this_runCatching.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, sh8.a((sh8) value, false, s7o.c, null, 12)));
        } else {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            pz40 Y2 = this.$this_runCatching.Y();
            do {
                r0Var2 = (r0) Y2;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, sh8.a((sh8) value2, false, null, null, 12)));
        }
        return zy11.a;
    }
}
