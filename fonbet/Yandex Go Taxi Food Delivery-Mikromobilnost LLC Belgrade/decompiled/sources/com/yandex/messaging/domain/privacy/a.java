package com.yandex.messaging.domain.privacy;

import com.yandex.messaging.core.net.entities.PrivacyBucket;
import com.yandex.messaging.internal.v;
import defpackage.jqr;
import defpackage.kse;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.rcy0;
import defpackage.sft;
import defpackage.tpr;
import defpackage.x4b0;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes15.dex */
public final class a {
    public final rcy0 a;
    public final v b;
    public final sft c;
    public final com.yandex.messaging.internal.storage.privacy.a d;
    public final kse e;

    public a(rcy0 rcy0Var, v vVar, sft sftVar, com.yandex.messaging.internal.storage.privacy.a aVar, kse kseVar) {
        this.a = rcy0Var;
        this.b = vVar;
        this.c = sftVar;
        this.d = aVar;
        this.e = kseVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, oyj0 oyj0Var, ContinuationImpl continuationImpl) {
        PrivacySearchAlertController$shouldShowAlertForPrivacy$1 privacySearchAlertController$shouldShowAlertForPrivacy$1;
        Object obj;
        int i;
        PrivacyBucket.Value value;
        aVar.getClass();
        if (continuationImpl instanceof PrivacySearchAlertController$shouldShowAlertForPrivacy$1) {
            privacySearchAlertController$shouldShowAlertForPrivacy$1 = (PrivacySearchAlertController$shouldShowAlertForPrivacy$1) continuationImpl;
            int i2 = privacySearchAlertController$shouldShowAlertForPrivacy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                privacySearchAlertController$shouldShowAlertForPrivacy$1.label = i2 - Integer.MIN_VALUE;
                obj = privacySearchAlertController$shouldShowAlertForPrivacy$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = privacySearchAlertController$shouldShowAlertForPrivacy$1.label;
                Integer num = null;
                if (i != 0) {
                    b.b(obj);
                    if (!aVar.a.w) {
                        return Boolean.FALSE;
                    }
                    privacySearchAlertController$shouldShowAlertForPrivacy$1.L$0 = oyj0Var;
                    privacySearchAlertController$shouldShowAlertForPrivacy$1.label = 1;
                    obj = aVar.b(privacySearchAlertController$shouldShowAlertForPrivacy$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oyj0Var = (oyj0) privacySearchAlertController$shouldShowAlertForPrivacy$1.L$0;
                    b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return Boolean.FALSE;
                }
                PrivacyBucket privacyBucket = (PrivacyBucket) oyj0Var.b();
                if (privacyBucket != null && (value = privacyBucket.value) != null) {
                    num = value.search;
                }
                return Boolean.valueOf(num != null && num.intValue() == 0);
            }
        }
        privacySearchAlertController$shouldShowAlertForPrivacy$1 = new PrivacySearchAlertController$shouldShowAlertForPrivacy$1(aVar, continuationImpl);
        obj = privacySearchAlertController$shouldShowAlertForPrivacy$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = privacySearchAlertController$shouldShowAlertForPrivacy$1.label;
        Integer num2 = null;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        PrivacySearchAlertController$isUserWithoutOrganizations$1 privacySearchAlertController$isUserWithoutOrganizations$1;
        int i;
        if (continuationImpl instanceof PrivacySearchAlertController$isUserWithoutOrganizations$1) {
            privacySearchAlertController$isUserWithoutOrganizations$1 = (PrivacySearchAlertController$isUserWithoutOrganizations$1) continuationImpl;
            int i2 = privacySearchAlertController$isUserWithoutOrganizations$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                privacySearchAlertController$isUserWithoutOrganizations$1.label = i2 - Integer.MIN_VALUE;
                Object obj = privacySearchAlertController$isUserWithoutOrganizations$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = privacySearchAlertController$isUserWithoutOrganizations$1.label;
                if (i != 0) {
                    b.b(obj);
                    tpr a = this.b.a(zy11.a);
                    privacySearchAlertController$isUserWithoutOrganizations$1.label = 1;
                    obj = e.y(a, privacySearchAlertController$isUserWithoutOrganizations$1);
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
                return Boolean.valueOf(((x4b0) obj).j.length == 0);
            }
        }
        privacySearchAlertController$isUserWithoutOrganizations$1 = new PrivacySearchAlertController$isUserWithoutOrganizations$1(this, continuationImpl);
        Object obj2 = privacySearchAlertController$isUserWithoutOrganizations$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = privacySearchAlertController$isUserWithoutOrganizations$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((x4b0) obj2).j.length == 0);
    }

    public final tpr c() {
        return e.F(e.t(new jqr(new m0(this.d.c, this.c.a(zy11.a), new PrivacySearchAlertController$shouldShowAlertFlow$1(this, null)), new PrivacySearchAlertController$shouldShowAlertFlow$2(this, null), 3)), this.e.e);
    }
}
