package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts;

import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.internal.model.PlusPayWebCollectContactsParams;
import com.yandex.plus.pay.internal.model.PlusPayWebCollectContactsResult;
import com.yandex.plus.ui.core.theme.PlusTheme;
import defpackage.add0;
import defpackage.bad0;
import defpackage.eu90;
import defpackage.gce;
import defpackage.hce;
import defpackage.ice;
import defpackage.jnd0;
import defpackage.lde;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.pgz;
import defpackage.tpd0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a implements gce {
    public final add0 a;
    public final bad0 b;
    public final jnd0 c;
    public final lde d;
    public final n4u0 e;
    public final pgz f;

    public a(add0 add0Var, bad0 bad0Var, jnd0 jnd0Var, lde ldeVar, n4u0 n4u0Var, pgz pgzVar) {
        this.a = add0Var;
        this.b = bad0Var;
        this.c = jnd0Var;
        this.d = ldeVar;
        this.e = n4u0Var;
        this.f = pgzVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:31|32))(7:33|(1:35)|36|(1:38)(1:43)|39|40|(1:42))|12|13|(6:15|(1:17)|18|(1:20)(1:24)|21|22)(2:25|(2:27|28)(1:29))))|51|6|7|(0)(0)|12|13|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0042, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a0, code lost:
    
        r0 = new kotlin.Result.Failure(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009c, code lost:
    
        r10 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009e, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0040, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0097, code lost:
    
        r0 = new kotlin.Result.Failure(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ContactsCollectionRepositoryImpl$getContactsCollectionStatus$1 contactsCollectionRepositoryImpl$getContactsCollectionStatus$1;
        int i;
        Throwable a;
        Object iceVar;
        if (continuationImpl instanceof ContactsCollectionRepositoryImpl$getContactsCollectionStatus$1) {
            contactsCollectionRepositoryImpl$getContactsCollectionStatus$1 = (ContactsCollectionRepositoryImpl$getContactsCollectionStatus$1) continuationImpl;
            int i2 = contactsCollectionRepositoryImpl$getContactsCollectionStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                contactsCollectionRepositoryImpl$getContactsCollectionStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = contactsCollectionRepositoryImpl$getContactsCollectionStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = contactsCollectionRepositoryImpl$getContactsCollectionStatus$1.label;
                pgz pgzVar = this.f;
                if (i != 0) {
                    b.b(obj);
                    LogPriority logPriority = LogPriority.DEBUG;
                    if (pgzVar.e(logPriority)) {
                        pgzVar.a(logPriority, "ContactsCollectionRepositoryImpl", "Started loading contacts collection status");
                    }
                    ContactsCollectionRepositoryImpl$getContactsCollectionStatus$3$1 contactsCollectionRepositoryImpl$getContactsCollectionStatus$3$1 = new ContactsCollectionRepositoryImpl$getContactsCollectionStatus$3$1(this, new PlusPayWebCollectContactsParams(tpd0.a(this.b.a(), (PlusTheme) this.e.getValue()) ? PlusPayWebCollectContactsParams.PageTheme.DARK : PlusPayWebCollectContactsParams.PageTheme.LIGHT), null);
                    contactsCollectionRepositoryImpl$getContactsCollectionStatus$1.L$0 = null;
                    contactsCollectionRepositoryImpl$getContactsCollectionStatus$1.L$1 = null;
                    contactsCollectionRepositoryImpl$getContactsCollectionStatus$1.L$2 = null;
                    contactsCollectionRepositoryImpl$getContactsCollectionStatus$1.L$3 = null;
                    contactsCollectionRepositoryImpl$getContactsCollectionStatus$1.L$4 = null;
                    contactsCollectionRepositoryImpl$getContactsCollectionStatus$1.I$0 = 0;
                    contactsCollectionRepositoryImpl$getContactsCollectionStatus$1.I$1 = 0;
                    contactsCollectionRepositoryImpl$getContactsCollectionStatus$1.label = 1;
                    obj = kotlinx.coroutines.a.u(1000L, contactsCollectionRepositoryImpl$getContactsCollectionStatus$3$1, contactsCollectionRepositoryImpl$getContactsCollectionStatus$1);
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
                a = Result.a(obj);
                lde ldeVar = this.d;
                if (a == null) {
                    eu90 eu90Var = ldeVar.a;
                    eu90Var.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("fail_reason", "Failed to get contacts status");
                    linkedHashMap.put("_meta", eu90.c(new HashMap()));
                    eu90Var.f("CollectingContacts.Fail", linkedHashMap);
                    LogPriority logPriority2 = LogPriority.ERROR;
                    if (!pgzVar.e(logPriority2)) {
                        return null;
                    }
                    pgzVar.b(logPriority2, "ContactsCollectionRepositoryImpl", "Failed to get contacts status", a);
                    return null;
                }
                PlusPayWebCollectContactsResult plusPayWebCollectContactsResult = (PlusPayWebCollectContactsResult) obj;
                LogPriority logPriority3 = LogPriority.DEBUG;
                if (pgzVar.e(logPriority3)) {
                    pgzVar.a(logPriority3, "ContactsCollectionRepositoryImpl", "Successfully got contacts status: " + plusPayWebCollectContactsResult);
                }
                if (plusPayWebCollectContactsResult.getAlreadyCollected()) {
                    ldeVar.a("Already collected");
                    iceVar = hce.a;
                } else {
                    ldeVar.b(this.c.a.a().a.toString(), plusPayWebCollectContactsResult.getUrl(), plusPayWebCollectContactsResult.getSkipText());
                    iceVar = new ice(plusPayWebCollectContactsResult.getUrl(), plusPayWebCollectContactsResult.getSkipText());
                }
                return iceVar;
            }
        }
        contactsCollectionRepositoryImpl$getContactsCollectionStatus$1 = new ContactsCollectionRepositoryImpl$getContactsCollectionStatus$1(this, continuationImpl);
        Object obj2 = contactsCollectionRepositoryImpl$getContactsCollectionStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = contactsCollectionRepositoryImpl$getContactsCollectionStatus$1.label;
        pgz pgzVar2 = this.f;
        if (i != 0) {
        }
        a = Result.a(obj2);
        lde ldeVar2 = this.d;
        if (a == null) {
        }
    }
}
