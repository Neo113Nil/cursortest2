package com.yandex.passport.internal.sloth.performers;

import com.yandex.passport.sloth.command.r;
import com.yandex.passport.sloth.command.s;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.iqn;
import defpackage.kqn;
import defpackage.mqn;
import defpackage.ny61;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class c implements s {
    @Override // com.yandex.passport.sloth.command.s
    public final /* bridge */ /* synthetic */ Object a(SlothParams slothParams, Object obj, Continuation continuation) {
        return b((ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mqn b(ContinuationImpl continuationImpl) {
        GetOtpCommandPerformer$performCommand$1 getOtpCommandPerformer$performCommand$1;
        int i;
        try {
            if (continuationImpl instanceof GetOtpCommandPerformer$performCommand$1) {
                getOtpCommandPerformer$performCommand$1 = (GetOtpCommandPerformer$performCommand$1) continuationImpl;
                int i2 = getOtpCommandPerformer$performCommand$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    getOtpCommandPerformer$performCommand$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = getOtpCommandPerformer$performCommand$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = getOtpCommandPerformer$performCommand$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        com.yandex.passport.sloth.command.d dVar = new com.yandex.passport.sloth.command.d("OTP service is misconfigured");
                        return dVar instanceof r ? new iqn(dVar) : new kqn(dVar);
                    }
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    String str = (String) obj;
                    if (str != null) {
                        return new iqn(com.yandex.passport.internal.ui.sloth.e.b(new Pair("otp", str)));
                    }
                    com.yandex.passport.sloth.command.d dVar2 = new com.yandex.passport.sloth.command.d("Cannot generate OTP from the data");
                    return dVar2 instanceof r ? new iqn(dVar2) : new kqn(dVar2);
                }
            }
            if (i != 0) {
            }
        } catch (Throwable unused) {
            com.yandex.passport.sloth.command.d dVar3 = new com.yandex.passport.sloth.command.d("Error getting OTP");
            return dVar3 instanceof r ? new iqn(dVar3) : new kqn(dVar3);
        }
        getOtpCommandPerformer$performCommand$1 = new GetOtpCommandPerformer$performCommand$1(this, continuationImpl);
        Object obj2 = getOtpCommandPerformer$performCommand$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getOtpCommandPerformer$performCommand$1.label;
    }
}
