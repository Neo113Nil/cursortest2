package com.yandex.passport.sloth.command.performers;

import com.yandex.passport.sloth.SlothMetricaEvent$Event;
import com.yandex.passport.sloth.command.data.e1;
import com.yandex.passport.sloth.g0;
import com.yandex.passport.sloth.n0;
import com.yandex.passport.sloth.z0;
import defpackage.g8e;
import defpackage.iqn;
import defpackage.kqn;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class r implements com.yandex.passport.sloth.command.q {
    public final z0 a;
    public final com.yandex.passport.sloth.v b;

    public r(com.yandex.passport.sloth.v vVar, z0 z0Var) {
        this.a = z0Var;
        this.b = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.sloth.command.q
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(e1 e1Var, ContinuationImpl continuationImpl) {
        SocialAuthCommandPerformer$performCommand$1 socialAuthCommandPerformer$performCommand$1;
        int i;
        if (continuationImpl instanceof SocialAuthCommandPerformer$performCommand$1) {
            socialAuthCommandPerformer$performCommand$1 = (SocialAuthCommandPerformer$performCommand$1) continuationImpl;
            int i2 = socialAuthCommandPerformer$performCommand$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                socialAuthCommandPerformer$performCommand$1.label = i2 - Integer.MIN_VALUE;
                Object obj = socialAuthCommandPerformer$performCommand$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = socialAuthCommandPerformer$performCommand$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = e1Var.a;
                    if (str == null) {
                        com.yandex.passport.sloth.command.d dVar = com.yandex.passport.sloth.command.d.g;
                        return dVar instanceof com.yandex.passport.sloth.command.r ? new iqn(dVar) : new kqn(dVar);
                    }
                    this.a.a(new n0(SlothMetricaEvent$Event.SOCIAL_AUTH_STARTED, g8e.z("socialConfiguration", str)));
                    g0 g0Var = new g0(str);
                    socialAuthCommandPerformer$performCommand$1.label = 1;
                    if (this.b.c(g0Var, socialAuthCommandPerformer$performCommand$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new iqn(com.yandex.passport.sloth.command.u.c);
            }
        }
        socialAuthCommandPerformer$performCommand$1 = new SocialAuthCommandPerformer$performCommand$1(this, continuationImpl);
        Object obj2 = socialAuthCommandPerformer$performCommand$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = socialAuthCommandPerformer$performCommand$1.label;
        if (i != 0) {
        }
        return new iqn(com.yandex.passport.sloth.command.u.c);
    }
}
