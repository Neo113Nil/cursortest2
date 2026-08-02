package com.yandex.passport.sloth.command.performers;

import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.z;
import defpackage.iqn;
import defpackage.ny61;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class d implements com.yandex.passport.sloth.command.q {
    public final com.yandex.passport.sloth.v a;
    public final SlothParams b;

    public d(com.yandex.passport.sloth.v vVar, SlothParams slothParams) {
        this.a = vVar;
        this.b = slothParams;
    }

    @Override // com.yandex.passport.sloth.command.q
    public final /* bridge */ /* synthetic */ Object a(Object obj, Continuation continuation) {
        return b(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Continuation continuation) {
        DeletedAccountAuthCommandPerformer$performCommand$1 deletedAccountAuthCommandPerformer$performCommand$1;
        int i;
        if (continuation instanceof DeletedAccountAuthCommandPerformer$performCommand$1) {
            deletedAccountAuthCommandPerformer$performCommand$1 = (DeletedAccountAuthCommandPerformer$performCommand$1) continuation;
            int i2 = deletedAccountAuthCommandPerformer$performCommand$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deletedAccountAuthCommandPerformer$performCommand$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deletedAccountAuthCommandPerformer$performCommand$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deletedAccountAuthCommandPerformer$performCommand$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SlothParams slothParams = this.b;
                    if (slothParams.getVariant() instanceof com.yandex.passport.sloth.data.x) {
                        z zVar = new z(((com.yandex.passport.sloth.data.x) slothParams.getVariant()).b);
                        deletedAccountAuthCommandPerformer$performCommand$1.label = 1;
                        if (this.a.c(zVar, deletedAccountAuthCommandPerformer$performCommand$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        deletedAccountAuthCommandPerformer$performCommand$1 = new DeletedAccountAuthCommandPerformer$performCommand$1(this, (ContinuationImpl) continuation);
        Object obj2 = deletedAccountAuthCommandPerformer$performCommand$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deletedAccountAuthCommandPerformer$performCommand$1.label;
        if (i != 0) {
        }
        return new iqn(com.yandex.passport.sloth.command.u.c);
    }
}
