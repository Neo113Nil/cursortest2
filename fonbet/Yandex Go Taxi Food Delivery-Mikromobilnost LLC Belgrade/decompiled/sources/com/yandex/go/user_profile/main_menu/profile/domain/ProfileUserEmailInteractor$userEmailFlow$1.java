package com.yandex.go.user_profile.main_menu.profile.domain;

import defpackage.avj0;
import defpackage.bms;
import defpackage.evu0;
import defpackage.kyh0;
import defpackage.l10;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tl21;
import defpackage.ul21;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ltl21;", "emailInfo", "", "isEnabled", "Ll10;", "activeEnvironment", "Lul21;", "<anonymous>", "(Ltl21;ZLl10;)Lul21;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.user_profile.main_menu.profile.domain.ProfileUserEmailInteractor$userEmailFlow$1", f = "ProfileUserEmailInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ProfileUserEmailInteractor$userEmailFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileUserEmailInteractor$userEmailFlow$1(d dVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        ProfileUserEmailInteractor$userEmailFlow$1 profileUserEmailInteractor$userEmailFlow$1 = new ProfileUserEmailInteractor$userEmailFlow$1(this.this$0, (Continuation) obj4);
        profileUserEmailInteractor$userEmailFlow$1.L$0 = (tl21) obj;
        profileUserEmailInteractor$userEmailFlow$1.Z$0 = booleanValue;
        profileUserEmailInteractor$userEmailFlow$1.L$1 = (l10) obj3;
        return profileUserEmailInteractor$userEmailFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String h;
        tl21 tl21Var = (tl21) this.L$0;
        boolean z = this.Z$0;
        l10 l10Var = (l10) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        zuj0 zuj0Var = this.this$0.a;
        String str = tl21Var.a;
        if (evu0.J(str)) {
            if (!l10Var.a.equals("default")) {
                return new ul21(false, false, "", "");
            }
            return new ul21(true, z, "", ((avj0) zuj0Var).h(kyh0.settings_add_email));
        }
        if (tl21Var.b == 1) {
            h = ((avj0) zuj0Var).h(kyh0.settings_mail_title);
        } else {
            h = ((avj0) zuj0Var).h(kyh0.mail_needs_confirmation);
        }
        return new ul21(false, z, h, str);
    }
}
