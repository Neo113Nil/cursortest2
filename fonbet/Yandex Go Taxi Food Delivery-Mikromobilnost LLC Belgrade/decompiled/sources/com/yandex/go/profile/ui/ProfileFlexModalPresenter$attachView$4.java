package com.yandex.go.profile.ui;

import com.yandex.go.promocodes.referral.impl.provider.k;
import defpackage.cne0;
import defpackage.g8e;
import defpackage.jst;
import defpackage.mef0;
import defpackage.mvg;
import defpackage.nni0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.startup.launch.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.profile.ui.ProfileFlexModalPresenter$attachView$4", f = "ProfileFlexModalPresenter.kt", l = {44}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ProfileFlexModalPresenter$attachView$4 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ mef0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileFlexModalPresenter$attachView$4(mef0 mef0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mef0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProfileFlexModalPresenter$attachView$4(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ProfileFlexModalPresenter$attachView$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            nni0 nni0Var = this.this$0.y;
            this.label = 1;
            k kVar = (k) nni0Var;
            h hVar = kVar.a;
            String Hg = hVar.Hg();
            if (!((cne0) hVar.b).f("can_generate_referrals")) {
                jst.e.getClass();
            } else if (Hg == null) {
                g8e.C("User unauthorized but canGenerateReferrals=true. Skipping update", jst.e);
            } else {
                obj2 = kVar.b(Hg, this);
                if (obj2 != coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            obj2 = zy11Var;
            if (obj2 != coroutineSingletons) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11Var;
    }
}
