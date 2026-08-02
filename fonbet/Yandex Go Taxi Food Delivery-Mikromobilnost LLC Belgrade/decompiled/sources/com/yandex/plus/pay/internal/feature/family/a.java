package com.yandex.plus.pay.internal.feature.family;

import com.yandex.plus.pay.common.internal.log.PayCoreLogTag;
import com.yandex.plus.pay.internal.model.PlusPayWebFamilyInviteResult;
import defpackage.acd0;
import defpackage.bcd0;
import defpackage.mdd0;
import defpackage.ny61;
import defpackage.vww;
import defpackage.w511;
import defpackage.www;
import defpackage.xca1;
import defpackage.xww;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final com.yandex.plus.pay.graphql.family.a a;
    public final mdd0 b;
    public final bcd0 c = new bcd0();

    public a(com.yandex.plus.pay.graphql.family.a aVar, mdd0 mdd0Var) {
        this.a = aVar;
        this.b = mdd0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:46|47))(3:48|49|(1:51))|12|13|(2:15|(4:17|(2:19|(2:21|(2:23|(2:25|(1:27)(2:31|32))(1:33))(1:34))(1:35))(1:36)|28|29)(2:37|(2:39|40)(2:41|42)))(2:43|44)))|59|6|7|(0)(0)|12|13|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0036, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0060, code lost:
    
        r0 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x005c, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x005e, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x005f, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0034, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0057, code lost:
    
        r0 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        FamilyInviteInteractorImpl$getFamilyInviteWebUrl$1 familyInviteInteractorImpl$getFamilyInviteWebUrl$1;
        int i;
        Throwable a;
        PlusPayWebFamilyInviteResult.Cancelled.Reason reason;
        if (continuationImpl instanceof FamilyInviteInteractorImpl$getFamilyInviteWebUrl$1) {
            familyInviteInteractorImpl$getFamilyInviteWebUrl$1 = (FamilyInviteInteractorImpl$getFamilyInviteWebUrl$1) continuationImpl;
            int i2 = familyInviteInteractorImpl$getFamilyInviteWebUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                familyInviteInteractorImpl$getFamilyInviteWebUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = familyInviteInteractorImpl$getFamilyInviteWebUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = familyInviteInteractorImpl$getFamilyInviteWebUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.plus.pay.graphql.family.a aVar = this.a;
                    familyInviteInteractorImpl$getFamilyInviteWebUrl$1.L$0 = null;
                    familyInviteInteractorImpl$getFamilyInviteWebUrl$1.L$1 = null;
                    familyInviteInteractorImpl$getFamilyInviteWebUrl$1.L$2 = null;
                    familyInviteInteractorImpl$getFamilyInviteWebUrl$1.I$0 = 0;
                    familyInviteInteractorImpl$getFamilyInviteWebUrl$1.I$1 = 0;
                    familyInviteInteractorImpl$getFamilyInviteWebUrl$1.label = 1;
                    obj = aVar.a(familyInviteInteractorImpl$getFamilyInviteWebUrl$1);
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
                if (a == null) {
                    mdd0.g(this.b, PayCoreLogTag.FAMILY, null, a, 10);
                    throw xca1.e(a);
                }
                xww xwwVar = (xww) obj;
                this.c.getClass();
                if (!(xwwVar instanceof vww)) {
                    if (xwwVar instanceof www) {
                        www wwwVar = (www) xwwVar;
                        return new PlusPayWebFamilyInviteResult.Success(wwwVar.a, wwwVar.b);
                    }
                    w511.b();
                    return null;
                }
                int i3 = acd0.a[((vww) xwwVar).a.ordinal()];
                if (i3 == 1) {
                    reason = PlusPayWebFamilyInviteResult.Cancelled.Reason.MAX_FAMILY_MEMBERS;
                } else if (i3 == 2) {
                    reason = PlusPayWebFamilyInviteResult.Cancelled.Reason.USER_HAS_NO_FAMILY;
                } else if (i3 == 3) {
                    reason = PlusPayWebFamilyInviteResult.Cancelled.Reason.USER_IS_A_FAMILY_CHILD;
                } else if (i3 == 4) {
                    reason = PlusPayWebFamilyInviteResult.Cancelled.Reason.USER_REGION_IS_NOT_SUPPORTED;
                } else {
                    if (i3 != 5) {
                        w511.b();
                        return null;
                    }
                    reason = PlusPayWebFamilyInviteResult.Cancelled.Reason.UNKNOWN_REASON;
                }
                return new PlusPayWebFamilyInviteResult.Cancelled(reason);
            }
        }
        familyInviteInteractorImpl$getFamilyInviteWebUrl$1 = new FamilyInviteInteractorImpl$getFamilyInviteWebUrl$1(this, continuationImpl);
        Object obj2 = familyInviteInteractorImpl$getFamilyInviteWebUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = familyInviteInteractorImpl$getFamilyInviteWebUrl$1.label;
        if (i != 0) {
        }
        a = Result.a(obj2);
        if (a == null) {
        }
    }
}
