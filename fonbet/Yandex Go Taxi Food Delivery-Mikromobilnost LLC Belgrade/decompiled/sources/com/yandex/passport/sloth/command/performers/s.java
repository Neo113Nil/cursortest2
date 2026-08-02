package com.yandex.passport.sloth.command.performers;

import com.yandex.passport.sloth.command.data.h1;
import com.yandex.passport.sloth.h0;
import defpackage.iqn;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class s implements com.yandex.passport.sloth.command.q {
    public final com.yandex.passport.sloth.v a;

    public s(com.yandex.passport.sloth.v vVar) {
        this.a = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.sloth.command.q
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(h1 h1Var, ContinuationImpl continuationImpl) {
        StorePhoneNumberCommandPerformer$performCommand$1 storePhoneNumberCommandPerformer$performCommand$1;
        int i;
        if (continuationImpl instanceof StorePhoneNumberCommandPerformer$performCommand$1) {
            storePhoneNumberCommandPerformer$performCommand$1 = (StorePhoneNumberCommandPerformer$performCommand$1) continuationImpl;
            int i2 = storePhoneNumberCommandPerformer$performCommand$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                storePhoneNumberCommandPerformer$performCommand$1.label = i2 - Integer.MIN_VALUE;
                Object obj = storePhoneNumberCommandPerformer$performCommand$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = storePhoneNumberCommandPerformer$performCommand$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h0 h0Var = new h0(h1Var.a);
                    storePhoneNumberCommandPerformer$performCommand$1.label = 1;
                    if (this.a.c(h0Var, storePhoneNumberCommandPerformer$performCommand$1) == coroutineSingletons) {
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
        storePhoneNumberCommandPerformer$performCommand$1 = new StorePhoneNumberCommandPerformer$performCommand$1(this, continuationImpl);
        Object obj2 = storePhoneNumberCommandPerformer$performCommand$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = storePhoneNumberCommandPerformer$performCommand$1.label;
        if (i != 0) {
        }
        return new iqn(com.yandex.passport.sloth.command.u.c);
    }
}
