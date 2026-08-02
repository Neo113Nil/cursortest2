package com.yandex.passport.sloth.command.performers;

import com.yandex.passport.sloth.command.data.m0;
import com.yandex.passport.sloth.d0;
import defpackage.iqn;
import defpackage.kqn;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class n implements com.yandex.passport.sloth.command.q {
    public final com.yandex.passport.sloth.v a;

    public n(com.yandex.passport.sloth.v vVar) {
        this.a = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.sloth.command.q
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(m0 m0Var, ContinuationImpl continuationImpl) {
        SamlSsoAuthCommandPerformer$performCommand$1 samlSsoAuthCommandPerformer$performCommand$1;
        int i;
        if (continuationImpl instanceof SamlSsoAuthCommandPerformer$performCommand$1) {
            samlSsoAuthCommandPerformer$performCommand$1 = (SamlSsoAuthCommandPerformer$performCommand$1) continuationImpl;
            int i2 = samlSsoAuthCommandPerformer$performCommand$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                samlSsoAuthCommandPerformer$performCommand$1.label = i2 - Integer.MIN_VALUE;
                Object obj = samlSsoAuthCommandPerformer$performCommand$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = samlSsoAuthCommandPerformer$performCommand$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = m0Var.a;
                    if (str == null) {
                        com.yandex.passport.sloth.command.d dVar = new com.yandex.passport.sloth.command.d("samlSsoUrl".concat("_missing"));
                        return dVar instanceof com.yandex.passport.sloth.command.r ? new iqn(dVar) : new kqn(dVar);
                    }
                    d0 d0Var = new d0(str);
                    samlSsoAuthCommandPerformer$performCommand$1.label = 1;
                    if (this.a.c(d0Var, samlSsoAuthCommandPerformer$performCommand$1) == coroutineSingletons) {
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
        samlSsoAuthCommandPerformer$performCommand$1 = new SamlSsoAuthCommandPerformer$performCommand$1(this, continuationImpl);
        Object obj2 = samlSsoAuthCommandPerformer$performCommand$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = samlSsoAuthCommandPerformer$performCommand$1.label;
        if (i != 0) {
        }
        return new iqn(com.yandex.passport.sloth.command.u.c);
    }
}
