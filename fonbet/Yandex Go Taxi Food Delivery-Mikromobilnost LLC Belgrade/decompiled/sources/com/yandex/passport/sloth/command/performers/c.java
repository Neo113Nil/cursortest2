package com.yandex.passport.sloth.command.performers;

import com.yandex.passport.sloth.y;
import defpackage.iqn;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class c implements com.yandex.passport.sloth.command.q {
    public final com.yandex.passport.sloth.v a;

    public c(com.yandex.passport.sloth.v vVar) {
        this.a = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.sloth.command.q
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.passport.sloth.command.data.c cVar, ContinuationImpl continuationImpl) {
        CreateProfilePerformer$performCommand$1 createProfilePerformer$performCommand$1;
        int i;
        if (continuationImpl instanceof CreateProfilePerformer$performCommand$1) {
            createProfilePerformer$performCommand$1 = (CreateProfilePerformer$performCommand$1) continuationImpl;
            int i2 = createProfilePerformer$performCommand$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                createProfilePerformer$performCommand$1.label = i2 - Integer.MIN_VALUE;
                Object obj = createProfilePerformer$performCommand$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = createProfilePerformer$performCommand$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    y yVar = new y(cVar.a);
                    createProfilePerformer$performCommand$1.label = 1;
                    if (this.a.c(yVar, createProfilePerformer$performCommand$1) == coroutineSingletons) {
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
        createProfilePerformer$performCommand$1 = new CreateProfilePerformer$performCommand$1(this, continuationImpl);
        Object obj2 = createProfilePerformer$performCommand$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = createProfilePerformer$performCommand$1.label;
        if (i != 0) {
        }
        return new iqn(com.yandex.passport.sloth.command.u.c);
    }
}
