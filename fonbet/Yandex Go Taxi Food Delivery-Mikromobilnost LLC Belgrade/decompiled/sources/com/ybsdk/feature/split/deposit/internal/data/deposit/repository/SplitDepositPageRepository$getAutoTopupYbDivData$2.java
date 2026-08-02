package com.ybsdk.feature.split.deposit.internal.data.deposit.repository;

import com.ybsdk.feature.split.deposit.internal.data.network.dto.GetDepositPageResponse;
import defpackage.i24;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.rr51;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Li24;", "<anonymous>", "(Ltse;)Li24;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.split.deposit.internal.data.deposit.repository.SplitDepositPageRepository$getAutoTopupYbDivData$2", f = "SplitDepositPageRepository.kt", l = {HProv.PP_DELETE_KEYSET, HProv.PP_DELETE_SAVED_PASSWD, HProv.PP_VERSION_TIMESTAMP, 128}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SplitDepositPageRepository$getAutoTopupYbDivData$2 extends SuspendLambda implements wls {
    final /* synthetic */ GetDepositPageResponse.AutoTopupData.StatusScreen $statusScreens;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitDepositPageRepository$getAutoTopupYbDivData$2(GetDepositPageResponse.AutoTopupData.StatusScreen statusScreen, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$statusScreens = statusScreen;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SplitDepositPageRepository$getAutoTopupYbDivData$2 splitDepositPageRepository$getAutoTopupYbDivData$2 = new SplitDepositPageRepository$getAutoTopupYbDivData$2(this.$statusScreens, this.this$0, continuation);
        splitDepositPageRepository$getAutoTopupYbDivData$2.L$0 = obj;
        return splitDepositPageRepository$getAutoTopupYbDivData$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SplitDepositPageRepository$getAutoTopupYbDivData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh nohVar;
        noh nohVar2;
        noh nohVar3;
        rr51 rr51Var;
        noh nohVar4;
        Object k;
        rr51 rr51Var2;
        Object k2;
        rr51 rr51Var3;
        rr51 rr51Var4;
        rr51 rr51Var5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tse tseVar = (tse) this.L$0;
            qoh h = tje.h(tseVar, null, null, new SplitDepositPageRepository$getAutoTopupYbDivData$2$pending$1(this.$statusScreens, this.this$0, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new SplitDepositPageRepository$getAutoTopupYbDivData$2$fail$1(this.$statusScreens, this.this$0, null), 3);
            qoh h3 = tje.h(tseVar, null, null, new SplitDepositPageRepository$getAutoTopupYbDivData$2$timeout$1(this.$statusScreens, this.this$0, null), 3);
            qoh h4 = tje.h(tseVar, null, null, new SplitDepositPageRepository$getAutoTopupYbDivData$2$success$1(this.$statusScreens, this.this$0, null), 3);
            this.L$0 = h2;
            this.L$1 = h3;
            this.L$2 = h4;
            this.label = 1;
            Object s = h.s(this);
            if (s != coroutineSingletons) {
                nohVar = h4;
                obj = s;
                nohVar2 = h2;
                nohVar3 = h3;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                rr51Var = (rr51) this.L$2;
                nohVar4 = (noh) this.L$1;
                nohVar3 = (noh) this.L$0;
                b.b(obj);
                rr51 rr51Var6 = (rr51) obj;
                this.L$0 = nohVar4;
                this.L$1 = rr51Var;
                this.L$2 = rr51Var6;
                this.label = 3;
                k = nohVar3.k(this);
                if (k != coroutineSingletons) {
                    rr51Var2 = rr51Var6;
                    obj = k;
                    rr51 rr51Var7 = (rr51) obj;
                    this.L$0 = rr51Var;
                    this.L$1 = rr51Var2;
                    this.L$2 = rr51Var7;
                    this.label = 4;
                    k2 = nohVar4.k(this);
                    if (k2 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rr51Var3 = (rr51) this.L$2;
                rr51Var5 = (rr51) this.L$1;
                rr51Var4 = (rr51) this.L$0;
                b.b(obj);
                return new i24(rr51Var4, rr51Var5, rr51Var3, (rr51) obj);
            }
            rr51 rr51Var8 = (rr51) this.L$2;
            rr51 rr51Var9 = (rr51) this.L$1;
            nohVar4 = (noh) this.L$0;
            b.b(obj);
            rr51Var2 = rr51Var8;
            rr51Var = rr51Var9;
            rr51 rr51Var72 = (rr51) obj;
            this.L$0 = rr51Var;
            this.L$1 = rr51Var2;
            this.L$2 = rr51Var72;
            this.label = 4;
            k2 = nohVar4.k(this);
            if (k2 != coroutineSingletons) {
                rr51Var3 = rr51Var72;
                obj = k2;
                rr51Var4 = rr51Var;
                rr51Var5 = rr51Var2;
                return new i24(rr51Var4, rr51Var5, rr51Var3, (rr51) obj);
            }
            return coroutineSingletons;
        }
        nohVar = (noh) this.L$2;
        nohVar3 = (noh) this.L$1;
        nohVar2 = (noh) this.L$0;
        b.b(obj);
        rr51 rr51Var10 = (rr51) obj;
        this.L$0 = nohVar3;
        this.L$1 = nohVar;
        this.L$2 = rr51Var10;
        this.label = 2;
        Object k3 = nohVar2.k(this);
        if (k3 != coroutineSingletons) {
            noh nohVar5 = nohVar;
            rr51Var = rr51Var10;
            obj = k3;
            nohVar4 = nohVar5;
            rr51 rr51Var62 = (rr51) obj;
            this.L$0 = nohVar4;
            this.L$1 = rr51Var;
            this.L$2 = rr51Var62;
            this.label = 3;
            k = nohVar3.k(this);
            if (k != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
