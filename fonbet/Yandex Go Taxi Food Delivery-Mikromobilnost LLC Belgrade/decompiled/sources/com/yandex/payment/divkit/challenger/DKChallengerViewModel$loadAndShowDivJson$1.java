package com.yandex.payment.divkit.challenger;

import com.yandex.payment.divkit.usecases.e;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.SbpChallengeInfo;
import defpackage.cnk;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.omk;
import defpackage.psf;
import defpackage.tse;
import defpackage.u2l;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.challenger.DKChallengerViewModel$loadAndShowDivJson$1", f = "DKChallengerViewModel.kt", l = {MSException.ERROR_NO_MORE_ITEMS, 260}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class DKChallengerViewModel$loadAndShowDivJson$1 extends SuspendLambda implements wls {
    final /* synthetic */ SbpChallengeInfo $info;
    final /* synthetic */ PaymentMethod.SbpToken $token;
    Object L$0;
    int label;
    final /* synthetic */ psf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKChallengerViewModel$loadAndShowDivJson$1(psf psfVar, SbpChallengeInfo sbpChallengeInfo, PaymentMethod.SbpToken sbpToken, Continuation continuation) {
        super(2, continuation);
        this.this$0 = psfVar;
        this.$info = sbpChallengeInfo;
        this.$token = sbpToken;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DKChallengerViewModel$loadAndShowDivJson$1(this.this$0, this.$info, this.$token, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DKChallengerViewModel$loadAndShowDivJson$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r9 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            psf psfVar = this.this$0;
            e eVar = psfVar.b;
            SbpChallengeInfo sbpChallengeInfo = this.$info;
            PaymentMethod.SbpToken sbpToken = this.$token;
            u2l u2lVar = psfVar.z;
            this.label = 1;
            obj = eVar.b(sbpChallengeInfo, sbpToken, u2lVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11Var;
            }
            b.b(obj);
        }
        psf psfVar2 = this.this$0;
        this.L$0 = null;
        this.label = 2;
        Object emit = psfVar2.B.emit(new cnk((omk) obj, Collections.singletonList(new Pair("isLightTheme", String.valueOf(psfVar2.A)))), this);
        if (emit != coroutineSingletons) {
            emit = zy11Var;
        }
        return emit == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
