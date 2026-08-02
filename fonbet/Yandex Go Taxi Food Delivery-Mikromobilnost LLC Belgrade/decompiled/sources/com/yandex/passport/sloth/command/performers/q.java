package com.yandex.passport.sloth.command.performers;

import com.yandex.passport.sloth.command.data.b1;
import com.yandex.passport.sloth.f0;
import defpackage.iqn;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class q implements com.yandex.passport.sloth.command.q {
    public final com.yandex.passport.sloth.v a;

    public q(com.yandex.passport.sloth.v vVar) {
        this.a = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.sloth.command.q
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(b1 b1Var, ContinuationImpl continuationImpl) {
        SocialActionPerformer$performCommand$1 socialActionPerformer$performCommand$1;
        int i;
        if (continuationImpl instanceof SocialActionPerformer$performCommand$1) {
            socialActionPerformer$performCommand$1 = (SocialActionPerformer$performCommand$1) continuationImpl;
            int i2 = socialActionPerformer$performCommand$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                socialActionPerformer$performCommand$1.label = i2 - Integer.MIN_VALUE;
                Object obj = socialActionPerformer$performCommand$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = socialActionPerformer$performCommand$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f0 f0Var = new f0(b1Var.a, b1Var.b, b1Var.c);
                    socialActionPerformer$performCommand$1.label = 1;
                    if (this.a.c(f0Var, socialActionPerformer$performCommand$1) == coroutineSingletons) {
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
        socialActionPerformer$performCommand$1 = new SocialActionPerformer$performCommand$1(this, continuationImpl);
        Object obj2 = socialActionPerformer$performCommand$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = socialActionPerformer$performCommand$1.label;
        if (i != 0) {
        }
        return new iqn(com.yandex.passport.sloth.command.u.c);
    }
}
