package com.yandex.go.payments.shared;

import com.yandex.go.payments.shared.data.CoopAccountApi;
import com.yandex.go.payments.shared.data.model.PhonishAccountLinkedRequest;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class c {
    public final CoopAccountApi a;
    public final tt2 b;

    public c(CoopAccountApi coopAccountApi, tt2 tt2Var) {
        this.a = coopAccountApi;
        this.b = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        NotifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$1 notifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$1;
        int i;
        if (continuationImpl instanceof NotifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$1) {
            notifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$1 = (NotifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$1) continuationImpl;
            int i2 = notifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                notifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$1.label = i2 - Integer.MIN_VALUE;
                Object obj = notifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PhonishAccountLinkedRequest phonishAccountLinkedRequest = new PhonishAccountLinkedRequest(str);
                    this.b.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    NotifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$2 notifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$2 = new NotifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$2(this, phonishAccountLinkedRequest, null);
                    notifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$1.L$0 = null;
                    notifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$1.L$1 = null;
                    notifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$1.label = 1;
                    if (tje.k0(mdhVar, notifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$2, notifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        notifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$1 = new NotifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$1(this, continuationImpl);
        Object obj2 = notifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
