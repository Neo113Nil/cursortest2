package com.yandex.plus.pay.internal.feature.contacts;

import com.yandex.plus.pay.common.internal.log.PayCoreLogTag;
import com.yandex.plus.pay.internal.model.PlusPayWebCollectContactsParams;
import com.yandex.plus.pay.internal.model.PlusPayWebCollectContactsResult;
import defpackage.df41;
import defpackage.kbc;
import defpackage.mdd0;
import defpackage.ny61;
import defpackage.qbc;
import defpackage.xca1;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final com.yandex.plus.pay.graphql.contacts.a a;
    public final mdd0 b;
    public final df41 c = new df41();

    public a(com.yandex.plus.pay.graphql.contacts.a aVar, mdd0 mdd0Var) {
        this.a = aVar;
        this.b = mdd0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:21|22))(3:23|24|(1:26))|12|13|(2:15|16)(2:18|19)))|33|6|7|(0)(0)|12|13|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        r8 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
    
        r8 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayWebCollectContactsParams plusPayWebCollectContactsParams, ContinuationImpl continuationImpl) {
        CollectContactsInteractorImpl$getWebCollectContacts$1 collectContactsInteractorImpl$getWebCollectContacts$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof CollectContactsInteractorImpl$getWebCollectContacts$1) {
            collectContactsInteractorImpl$getWebCollectContacts$1 = (CollectContactsInteractorImpl$getWebCollectContacts$1) continuationImpl;
            int i2 = collectContactsInteractorImpl$getWebCollectContacts$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                collectContactsInteractorImpl$getWebCollectContacts$1.label = i2 - Integer.MIN_VALUE;
                Object obj = collectContactsInteractorImpl$getWebCollectContacts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = collectContactsInteractorImpl$getWebCollectContacts$1.label;
                df41 df41Var = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.plus.pay.graphql.contacts.a aVar = this.a;
                    df41Var.getClass();
                    kbc a2 = df41.a(plusPayWebCollectContactsParams);
                    collectContactsInteractorImpl$getWebCollectContacts$1.L$0 = null;
                    collectContactsInteractorImpl$getWebCollectContacts$1.L$1 = null;
                    collectContactsInteractorImpl$getWebCollectContacts$1.L$2 = null;
                    collectContactsInteractorImpl$getWebCollectContacts$1.L$3 = null;
                    collectContactsInteractorImpl$getWebCollectContacts$1.I$0 = 0;
                    collectContactsInteractorImpl$getWebCollectContacts$1.I$1 = 0;
                    collectContactsInteractorImpl$getWebCollectContacts$1.label = 1;
                    obj = aVar.a(a2, collectContactsInteractorImpl$getWebCollectContacts$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                a = Result.a(obj);
                if (a != null) {
                    qbc qbcVar = (qbc) obj;
                    df41Var.getClass();
                    return new PlusPayWebCollectContactsResult(qbcVar.a, qbcVar.b, qbcVar.c);
                }
                mdd0.g(this.b, PayCoreLogTag.CONTACTS, null, a, 10);
                throw xca1.e(a);
            }
        }
        collectContactsInteractorImpl$getWebCollectContacts$1 = new CollectContactsInteractorImpl$getWebCollectContacts$1(this, continuationImpl);
        Object obj2 = collectContactsInteractorImpl$getWebCollectContacts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = collectContactsInteractorImpl$getWebCollectContacts$1.label;
        df41 df41Var2 = this.c;
        if (i != 0) {
        }
        a = Result.a(obj2);
        if (a != null) {
        }
    }
}
