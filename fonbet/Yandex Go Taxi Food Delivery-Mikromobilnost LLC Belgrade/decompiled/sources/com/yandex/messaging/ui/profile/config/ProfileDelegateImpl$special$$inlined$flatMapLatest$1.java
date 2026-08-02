package com.yandex.messaging.ui.profile.config;

import defpackage.im;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p8g;
import defpackage.v320;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.profile.config.ProfileDelegateImpl$special$$inlined$flatMapLatest$1", f = "ProfileDelegateImpl.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class ProfileDelegateImpl$special$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a receiver$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileDelegateImpl$special$$inlined$flatMapLatest$1(Continuation continuation, a aVar) {
        super(3, continuation);
        this.receiver$inlined = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ProfileDelegateImpl$special$$inlined$flatMapLatest$1 profileDelegateImpl$special$$inlined$flatMapLatest$1 = new ProfileDelegateImpl$special$$inlined$flatMapLatest$1((Continuation) obj3, this.receiver$inlined);
        profileDelegateImpl$special$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        profileDelegateImpl$special$$inlined$flatMapLatest$1.L$1 = obj2;
        return profileDelegateImpl$special$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        vpr vprVar = (vpr) this.L$0;
        v320 v320Var = (v320) this.L$1;
        a aVar = this.receiver$inlined;
        im imVar = a.c;
        aVar.getClass();
        p8g p8gVar = (p8g) v320Var;
        g I = e.I(p8gVar.c().a(zy11Var), new ProfileDelegateImpl$mapProfileToAccountsModel$1(aVar, p8gVar, null));
        this.label = 1;
        return e.u(I, vprVar, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
