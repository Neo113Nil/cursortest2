package com.yandex.messaging.ui.calllist.info;

import defpackage.cd0;
import defpackage.gft;
import defpackage.hft;
import defpackage.mvg;
import defpackage.nbt;
import defpackage.nft;
import defpackage.ny61;
import defpackage.pb;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.calllist.info.CallHistoryInfoViewModel$contactStateFlow$lambda$7$$inlined$flatMapLatest$1", f = "CallHistoryInfoViewModel.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class CallHistoryInfoViewModel$contactStateFlow$lambda$7$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ hft $getUserEmailUseCase$inlined;
    final /* synthetic */ nft $getUserInfoUseCase$inlined;
    final /* synthetic */ String $userId$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallHistoryInfoViewModel$contactStateFlow$lambda$7$$inlined$flatMapLatest$1(Continuation continuation, nft nftVar, String str, hft hftVar) {
        super(3, continuation);
        this.$getUserInfoUseCase$inlined = nftVar;
        this.$userId$inlined = str;
        this.$getUserEmailUseCase$inlined = hftVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CallHistoryInfoViewModel$contactStateFlow$lambda$7$$inlined$flatMapLatest$1 callHistoryInfoViewModel$contactStateFlow$lambda$7$$inlined$flatMapLatest$1 = new CallHistoryInfoViewModel$contactStateFlow$lambda$7$$inlined$flatMapLatest$1((Continuation) obj3, this.$getUserInfoUseCase$inlined, this.$userId$inlined, this.$getUserEmailUseCase$inlined);
        callHistoryInfoViewModel$contactStateFlow$lambda$7$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        callHistoryInfoViewModel$contactStateFlow$lambda$7$$inlined$flatMapLatest$1.L$1 = obj2;
        return callHistoryInfoViewModel$contactStateFlow$lambda$7$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr pbVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            nbt nbtVar = (nbt) this.L$1;
            if (nbtVar != null) {
                pbVar = new cd0(12, this.$getUserInfoUseCase$inlined.d(this.$userId$inlined, false), nbtVar);
            } else {
                pbVar = new pb(this.$getUserEmailUseCase$inlined.a(new gft(this.$userId$inlined)), 17);
            }
            this.label = 1;
            if (e.u(pbVar, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
