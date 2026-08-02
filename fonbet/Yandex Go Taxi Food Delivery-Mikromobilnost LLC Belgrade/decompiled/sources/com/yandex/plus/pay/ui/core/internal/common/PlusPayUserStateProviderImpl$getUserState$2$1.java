package com.yandex.plus.pay.ui.core.internal.common;

import com.yandex.plus.core.user.SubscriptionStatus;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zgd0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzgd0;", "<anonymous>", "(Ltse;)Lzgd0;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.core.internal.common.PlusPayUserStateProviderImpl$getUserState$2$1", f = "PlusPayUserStateProviderImpl.kt", l = {46, 48}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlusPayUserStateProviderImpl$getUserState$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $forceUpdate;
    final /* synthetic */ long $puid;
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusPayUserStateProviderImpl$getUserState$2$1(long j, a aVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$puid = j;
        this.this$0 = aVar;
        this.$forceUpdate = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlusPayUserStateProviderImpl$getUserState$2$1 plusPayUserStateProviderImpl$getUserState$2$1 = new PlusPayUserStateProviderImpl$getUserState$2$1(this.$puid, this.this$0, this.$forceUpdate, continuation);
        plusPayUserStateProviderImpl$getUserState$2$1.L$0 = obj;
        return plusPayUserStateProviderImpl$getUserState$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusPayUserStateProviderImpl$getUserState$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        noh nohVar;
        String str;
        int i;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            qoh h = tje.h(tseVar, null, null, new PlusPayUserStateProviderImpl$getUserState$2$1$avatarUrl$1(this.this$0, this.$forceUpdate, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new PlusPayUserStateProviderImpl$getUserState$2$1$login$1(this.this$0, this.$forceUpdate, null), 3);
            j = this.$puid;
            this.L$0 = null;
            this.L$1 = h;
            this.L$2 = null;
            this.J$0 = j;
            this.label = 1;
            Object s = h2.s(this);
            if (s != coroutineSingletons) {
                nohVar = h;
                obj = s;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            long j2 = this.J$0;
            String str2 = (String) this.L$3;
            b.b(obj);
            j = j2;
            str = str2;
            return new zgd0(j, str, (String) obj, i == 0);
        }
        j = this.J$0;
        nohVar = (noh) this.L$1;
        b.b(obj);
        String str3 = (String) obj;
        int i3 = ((com.yandex.plus.pay.internal.b) this.this$0.c).c() == SubscriptionStatus.SUBSCRIPTION_PLUS ? 1 : 0;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = str3;
        this.J$0 = j;
        this.I$0 = i3;
        this.label = 2;
        Object k = nohVar.k(this);
        if (k != coroutineSingletons) {
            str = str3;
            i = i3;
            obj = k;
            return new zgd0(j, str, (String) obj, i == 0);
        }
        return coroutineSingletons;
    }
}
