package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts;

import defpackage.ehb1;
import defpackage.gce;
import defpackage.hce;
import defpackage.ice;
import defpackage.jce;
import defpackage.knd0;
import defpackage.nce;
import defpackage.ny61;
import defpackage.w511;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final knd0 a;
    public final gce b;

    public a(knd0 knd0Var, gce gceVar) {
        this.a = knd0Var;
        this.b = gceVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        GetContactsContentInteractorImpl$getContactsContent$1 getContactsContentInteractorImpl$getContactsContent$1;
        int i;
        jce jceVar;
        if (continuationImpl instanceof GetContactsContentInteractorImpl$getContactsContent$1) {
            getContactsContentInteractorImpl$getContactsContent$1 = (GetContactsContentInteractorImpl$getContactsContent$1) continuationImpl;
            int i2 = getContactsContentInteractorImpl$getContactsContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getContactsContentInteractorImpl$getContactsContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getContactsContentInteractorImpl$getContactsContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getContactsContentInteractorImpl$getContactsContent$1.label;
                if (i != 0) {
                    b.b(obj);
                    getContactsContentInteractorImpl$getContactsContent$1.label = 1;
                    obj = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.a) this.b).a(getContactsContentInteractorImpl$getContactsContent$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                jceVar = (jce) obj;
                if (!(jceVar instanceof ice)) {
                    ice iceVar = (ice) jceVar;
                    return new nce(ehb1.b(iceVar.a, this.a.a().a), iceVar.b);
                }
                if (!(jceVar instanceof hce) && jceVar != null) {
                    w511.b();
                }
                return null;
            }
        }
        getContactsContentInteractorImpl$getContactsContent$1 = new GetContactsContentInteractorImpl$getContactsContent$1(this, continuationImpl);
        Object obj2 = getContactsContentInteractorImpl$getContactsContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getContactsContentInteractorImpl$getContactsContent$1.label;
        if (i != 0) {
        }
        jceVar = (jce) obj2;
        if (!(jceVar instanceof ice)) {
        }
    }
}
