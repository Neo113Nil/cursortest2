package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family;

import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.internal.model.PlusPayWebFamilyInviteResult;
import defpackage.add0;
import defpackage.ny61;
import defpackage.obp;
import defpackage.pgz;
import defpackage.w511;
import defpackage.yap;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a implements yap {
    public final add0 a;
    public final obp b;
    public final pgz c;

    public a(add0 add0Var, obp obpVar, pgz pgzVar) {
        this.a = add0Var;
        this.b = obpVar;
        this.c = pgzVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(12:5|6|7|(1:(2:10|11)(2:45|46))(4:47|(1:49)|50|(1:52))|12|13|(2:15|(1:17))|18|(4:20|(1:22)|23|(1:25))|(1:27)|28|(2:30|31)(2:33|(2:35|(2:37|38)(1:39))(1:(1:43)(2:41|42)))))|60|6|7|(0)(0)|12|13|(0)|18|(0)|(0)|28|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x003a, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0076, code lost:
    
        r0 = new kotlin.Result.Failure(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0072, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0074, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0075, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0038, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x006d, code lost:
    
        r0 = new kotlin.Result.Failure(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        FamilyInvitationRepositoryImpl$getFamilyInvitation$1 familyInvitationRepositoryImpl$getFamilyInvitation$1;
        int i;
        boolean z;
        Throwable a;
        PlusPayWebFamilyInviteResult plusPayWebFamilyInviteResult;
        if (continuationImpl instanceof FamilyInvitationRepositoryImpl$getFamilyInvitation$1) {
            familyInvitationRepositoryImpl$getFamilyInvitation$1 = (FamilyInvitationRepositoryImpl$getFamilyInvitation$1) continuationImpl;
            int i2 = familyInvitationRepositoryImpl$getFamilyInvitation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                familyInvitationRepositoryImpl$getFamilyInvitation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = familyInvitationRepositoryImpl$getFamilyInvitation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = familyInvitationRepositoryImpl$getFamilyInvitation$1.label;
                pgz pgzVar = this.c;
                if (i != 0) {
                    b.b(obj);
                    LogPriority logPriority = LogPriority.DEBUG;
                    if (pgzVar.e(logPriority)) {
                        pgzVar.a(logPriority, "FamilyInvitationRepositoryImpl", "Started loading family invitation info");
                    }
                    FamilyInvitationRepositoryImpl$getFamilyInvitation$familyInvitationResult$1$1 familyInvitationRepositoryImpl$getFamilyInvitation$familyInvitationResult$1$1 = new FamilyInvitationRepositoryImpl$getFamilyInvitation$familyInvitationResult$1$1(this, null);
                    familyInvitationRepositoryImpl$getFamilyInvitation$1.L$0 = null;
                    familyInvitationRepositoryImpl$getFamilyInvitation$1.L$1 = null;
                    familyInvitationRepositoryImpl$getFamilyInvitation$1.L$2 = null;
                    familyInvitationRepositoryImpl$getFamilyInvitation$1.I$0 = 0;
                    familyInvitationRepositoryImpl$getFamilyInvitation$1.I$1 = 0;
                    familyInvitationRepositoryImpl$getFamilyInvitation$1.label = 1;
                    obj = kotlinx.coroutines.a.u(1000L, familyInvitationRepositoryImpl$getFamilyInvitation$familyInvitationResult$1$1, familyInvitationRepositoryImpl$getFamilyInvitation$1);
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
                z = obj instanceof Result.Failure;
                if (!z) {
                    PlusPayWebFamilyInviteResult plusPayWebFamilyInviteResult2 = (PlusPayWebFamilyInviteResult) obj;
                    LogPriority logPriority2 = LogPriority.DEBUG;
                    if (pgzVar.e(logPriority2)) {
                        pgzVar.a(logPriority2, "FamilyInvitationRepositoryImpl", "Successfully got family invitation info: " + plusPayWebFamilyInviteResult2);
                    }
                }
                a = Result.a(obj);
                obp obpVar = this.b;
                if (a != null) {
                    String message = a.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    obpVar.a(message);
                    LogPriority logPriority3 = LogPriority.ERROR;
                    if (pgzVar.e(logPriority3)) {
                        pgzVar.b(logPriority3, "FamilyInvitationRepositoryImpl", "Failed to get family invitation info", a);
                    }
                }
                if (z) {
                    obj = null;
                }
                plusPayWebFamilyInviteResult = (PlusPayWebFamilyInviteResult) obj;
                if (!(plusPayWebFamilyInviteResult instanceof PlusPayWebFamilyInviteResult.Success)) {
                    return (PlusPayWebFamilyInviteResult.Success) plusPayWebFamilyInviteResult;
                }
                if (!(plusPayWebFamilyInviteResult instanceof PlusPayWebFamilyInviteResult.Cancelled)) {
                    if (plusPayWebFamilyInviteResult == null) {
                        return null;
                    }
                    w511.b();
                    return null;
                }
                PlusPayWebFamilyInviteResult.Cancelled cancelled = (PlusPayWebFamilyInviteResult.Cancelled) plusPayWebFamilyInviteResult;
                obpVar.a(cancelled.getReason().getDescription());
                LogPriority logPriority4 = LogPriority.DEBUG;
                if (!pgzVar.e(logPriority4)) {
                    return null;
                }
                pgzVar.a(logPriority4, "FamilyInvitationRepositoryImpl", "Family invitation is cancelled: " + cancelled.getReason().getDescription());
                return null;
            }
        }
        familyInvitationRepositoryImpl$getFamilyInvitation$1 = new FamilyInvitationRepositoryImpl$getFamilyInvitation$1(this, continuationImpl);
        Object obj2 = familyInvitationRepositoryImpl$getFamilyInvitation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = familyInvitationRepositoryImpl$getFamilyInvitation$1.label;
        pgz pgzVar2 = this.c;
        if (i != 0) {
        }
        z = obj2 instanceof Result.Failure;
        if (!z) {
        }
        a = Result.a(obj2);
        obp obpVar2 = this.b;
        if (a != null) {
        }
        if (z) {
        }
        plusPayWebFamilyInviteResult = (PlusPayWebFamilyInviteResult) obj2;
        if (!(plusPayWebFamilyInviteResult instanceof PlusPayWebFamilyInviteResult.Success)) {
        }
    }
}
