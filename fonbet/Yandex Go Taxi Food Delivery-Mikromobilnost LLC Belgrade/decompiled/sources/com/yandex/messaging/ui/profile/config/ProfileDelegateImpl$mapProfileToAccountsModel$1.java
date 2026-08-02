package com.yandex.messaging.ui.profile.config;

import defpackage.hff;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p8g;
import defpackage.rp21;
import defpackage.v320;
import defpackage.wls;
import defpackage.x4b0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx4b0;", "personalInfo", "Lpm;", "<anonymous>", "(Lx4b0;)Lpm;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.profile.config.ProfileDelegateImpl$mapProfileToAccountsModel$1", f = "ProfileDelegateImpl.kt", l = {HProv.ALG_SID_KECCAK_224}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ProfileDelegateImpl$mapProfileToAccountsModel$1 extends SuspendLambda implements wls {
    final /* synthetic */ v320 $profile;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileDelegateImpl$mapProfileToAccountsModel$1(a aVar, v320 v320Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$profile = v320Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ProfileDelegateImpl$mapProfileToAccountsModel$1 profileDelegateImpl$mapProfileToAccountsModel$1 = new ProfileDelegateImpl$mapProfileToAccountsModel$1(this.this$0, this.$profile, continuation);
        profileDelegateImpl$mapProfileToAccountsModel$1.L$0 = obj;
        return profileDelegateImpl$mapProfileToAccountsModel$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ProfileDelegateImpl$mapProfileToAccountsModel$1) create((x4b0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        x4b0 x4b0Var = (x4b0) this.L$0;
        a aVar = this.this$0;
        hff hffVar = (hff) ((p8g) this.$profile).N0.get();
        rp21 h = ((p8g) this.$profile).h();
        this.label = 1;
        Object a = a.a(aVar, hffVar, x4b0Var, h, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
