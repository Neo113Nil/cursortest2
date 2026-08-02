package com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
import defpackage.ny61;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final Transfer2Api a;

    public a(Transfer2Api transfer2Api) {
        this.a = transfer2Api;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        AutoPullsListRepository$deletePermission$1 autoPullsListRepository$deletePermission$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof AutoPullsListRepository$deletePermission$1) {
            autoPullsListRepository$deletePermission$1 = (AutoPullsListRepository$deletePermission$1) continuationImpl;
            int i2 = autoPullsListRepository$deletePermission$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoPullsListRepository$deletePermission$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoPullsListRepository$deletePermission$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoPullsListRepository$deletePermission$1.label;
                if (i != 0) {
                    b.b(obj);
                    AutoPullsListRepository$deletePermission$2 autoPullsListRepository$deletePermission$2 = new AutoPullsListRepository$deletePermission$2(this, str, null);
                    autoPullsListRepository$deletePermission$1.label = 1;
                    c = c.c(autoPullsListRepository$deletePermission$2, autoPullsListRepository$deletePermission$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                AutoPullsListRepository$deletePermission$3$1 autoPullsListRepository$deletePermission$3$1 = new AutoPullsListRepository$deletePermission$3$1(2, null);
                autoPullsListRepository$deletePermission$1.label = 2;
                Object d = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) c, autoPullsListRepository$deletePermission$3$1, autoPullsListRepository$deletePermission$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        autoPullsListRepository$deletePermission$1 = new AutoPullsListRepository$deletePermission$1(this, continuationImpl);
        Object obj2 = autoPullsListRepository$deletePermission$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoPullsListRepository$deletePermission$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        AutoPullsListRepository$getPermissions$1 autoPullsListRepository$getPermissions$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof AutoPullsListRepository$getPermissions$1) {
            autoPullsListRepository$getPermissions$1 = (AutoPullsListRepository$getPermissions$1) continuationImpl;
            int i2 = autoPullsListRepository$getPermissions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoPullsListRepository$getPermissions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoPullsListRepository$getPermissions$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoPullsListRepository$getPermissions$1.label;
                if (i != 0) {
                    b.b(obj);
                    AutoPullsListRepository$getPermissions$2 autoPullsListRepository$getPermissions$2 = new AutoPullsListRepository$getPermissions$2(this, null);
                    autoPullsListRepository$getPermissions$1.label = 1;
                    c = c.c(autoPullsListRepository$getPermissions$2, autoPullsListRepository$getPermissions$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                autoPullsListRepository$getPermissions$1.label = 2;
                Object c2 = c((DataWithStatusResponse) c, autoPullsListRepository$getPermissions$1);
                return c2 == obj2 ? obj2 : c2;
            }
        }
        autoPullsListRepository$getPermissions$1 = new AutoPullsListRepository$getPermissions$1(this, continuationImpl);
        Object obj3 = autoPullsListRepository$getPermissions$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoPullsListRepository$getPermissions$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(DataWithStatusResponse dataWithStatusResponse, ContinuationImpl continuationImpl) {
        AutoPullsListRepository$toPermissionsEntity$1 autoPullsListRepository$toPermissionsEntity$1;
        int i;
        if (continuationImpl instanceof AutoPullsListRepository$toPermissionsEntity$1) {
            autoPullsListRepository$toPermissionsEntity$1 = (AutoPullsListRepository$toPermissionsEntity$1) continuationImpl;
            int i2 = autoPullsListRepository$toPermissionsEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoPullsListRepository$toPermissionsEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoPullsListRepository$toPermissionsEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoPullsListRepository$toPermissionsEntity$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                AutoPullsListRepository$toPermissionsEntity$2 autoPullsListRepository$toPermissionsEntity$2 = new AutoPullsListRepository$toPermissionsEntity$2(this, null);
                autoPullsListRepository$toPermissionsEntity$1.label = 1;
                Object d = com.ybsdk.core.utils.dto.b.d(dataWithStatusResponse, autoPullsListRepository$toPermissionsEntity$2, autoPullsListRepository$toPermissionsEntity$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        autoPullsListRepository$toPermissionsEntity$1 = new AutoPullsListRepository$toPermissionsEntity$1(this, continuationImpl);
        Object obj2 = autoPullsListRepository$toPermissionsEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoPullsListRepository$toPermissionsEntity$1.label;
        if (i == 0) {
        }
    }
}
