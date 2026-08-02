package com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.dto.TwoFactorAuthResponse;
import com.ybsdk.core.utils.dto.f;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
import defpackage.iyd0;
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

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r0 == r9) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        Me2meDebitResultRepository$autoPullConfirm$1 me2meDebitResultRepository$autoPullConfirm$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof Me2meDebitResultRepository$autoPullConfirm$1) {
            me2meDebitResultRepository$autoPullConfirm$1 = (Me2meDebitResultRepository$autoPullConfirm$1) continuationImpl;
            int i2 = me2meDebitResultRepository$autoPullConfirm$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                me2meDebitResultRepository$autoPullConfirm$1.label = i2 - Integer.MIN_VALUE;
                Object obj = me2meDebitResultRepository$autoPullConfirm$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = me2meDebitResultRepository$autoPullConfirm$1.label;
                if (i != 0) {
                    b.b(obj);
                    Me2meDebitResultRepository$autoPullConfirm$2 me2meDebitResultRepository$autoPullConfirm$2 = new Me2meDebitResultRepository$autoPullConfirm$2(this, str2, str3, str4, str, null);
                    me2meDebitResultRepository$autoPullConfirm$1.label = 1;
                    c = c.c(me2meDebitResultRepository$autoPullConfirm$2, me2meDebitResultRepository$autoPullConfirm$1);
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
                Me2meDebitResultRepository$autoPullConfirm$3$1 me2meDebitResultRepository$autoPullConfirm$3$1 = new Me2meDebitResultRepository$autoPullConfirm$3$1(2, null);
                me2meDebitResultRepository$autoPullConfirm$1.label = 2;
                Object a2 = f.a((TwoFactorAuthResponse) c, me2meDebitResultRepository$autoPullConfirm$3$1, me2meDebitResultRepository$autoPullConfirm$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        me2meDebitResultRepository$autoPullConfirm$1 = new Me2meDebitResultRepository$autoPullConfirm$1(this, continuationImpl);
        Object obj2 = me2meDebitResultRepository$autoPullConfirm$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = me2meDebitResultRepository$autoPullConfirm$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
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
    public final Object b(String str, ContinuationImpl continuationImpl) {
        Me2meDebitResultRepository$autoPullDelete$1 me2meDebitResultRepository$autoPullDelete$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof Me2meDebitResultRepository$autoPullDelete$1) {
            me2meDebitResultRepository$autoPullDelete$1 = (Me2meDebitResultRepository$autoPullDelete$1) continuationImpl;
            int i2 = me2meDebitResultRepository$autoPullDelete$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                me2meDebitResultRepository$autoPullDelete$1.label = i2 - Integer.MIN_VALUE;
                Object obj = me2meDebitResultRepository$autoPullDelete$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = me2meDebitResultRepository$autoPullDelete$1.label;
                if (i != 0) {
                    b.b(obj);
                    Me2meDebitResultRepository$autoPullDelete$2 me2meDebitResultRepository$autoPullDelete$2 = new Me2meDebitResultRepository$autoPullDelete$2(this, str, null);
                    me2meDebitResultRepository$autoPullDelete$1.label = 1;
                    c = c.c(me2meDebitResultRepository$autoPullDelete$2, me2meDebitResultRepository$autoPullDelete$1);
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
                Me2meDebitResultRepository$autoPullDelete$3$1 me2meDebitResultRepository$autoPullDelete$3$1 = new Me2meDebitResultRepository$autoPullDelete$3$1(2, null);
                me2meDebitResultRepository$autoPullDelete$1.label = 2;
                Object d = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) c, me2meDebitResultRepository$autoPullDelete$3$1, me2meDebitResultRepository$autoPullDelete$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        me2meDebitResultRepository$autoPullDelete$1 = new Me2meDebitResultRepository$autoPullDelete$1(this, continuationImpl);
        Object obj2 = me2meDebitResultRepository$autoPullDelete$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = me2meDebitResultRepository$autoPullDelete$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, String str, ContinuationImpl continuationImpl) {
        Me2meDebitResultRepository$getMe2MeDebitResult$1 me2meDebitResultRepository$getMe2MeDebitResult$1;
        int i2;
        Object c;
        Throwable a;
        iyd0 iyd0Var;
        Object f;
        if (continuationImpl instanceof Me2meDebitResultRepository$getMe2MeDebitResult$1) {
            me2meDebitResultRepository$getMe2MeDebitResult$1 = (Me2meDebitResultRepository$getMe2MeDebitResult$1) continuationImpl;
            int i3 = me2meDebitResultRepository$getMe2MeDebitResult$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                me2meDebitResultRepository$getMe2MeDebitResult$1.label = i3 - Integer.MIN_VALUE;
                Object obj = me2meDebitResultRepository$getMe2MeDebitResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = me2meDebitResultRepository$getMe2MeDebitResult$1.label;
                if (i2 != 0) {
                    b.b(obj);
                    Me2meDebitResultRepository$getMe2MeDebitResult$2 me2meDebitResultRepository$getMe2MeDebitResult$2 = new Me2meDebitResultRepository$getMe2MeDebitResult$2(this, str, i, null);
                    me2meDebitResultRepository$getMe2MeDebitResult$1.label = 1;
                    c = c.c(me2meDebitResultRepository$getMe2MeDebitResult$2, me2meDebitResultRepository$getMe2MeDebitResult$1);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iyd0Var = (iyd0) me2meDebitResultRepository$getMe2MeDebitResult$1.L$0;
                        b.b(obj);
                        f = ((Result) obj).getValue();
                        return !(f instanceof Result.Failure) ? new iyd0(iyd0Var.b, f) : f;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                iyd0Var = (iyd0) c;
                DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) iyd0Var.a;
                Me2meDebitResultRepository$getMe2MeDebitResult$3$1$1 me2meDebitResultRepository$getMe2MeDebitResult$3$1$1 = new Me2meDebitResultRepository$getMe2MeDebitResult$3$1$1(2, null);
                me2meDebitResultRepository$getMe2MeDebitResult$1.L$0 = iyd0Var;
                me2meDebitResultRepository$getMe2MeDebitResult$1.label = 2;
                f = com.ybsdk.core.utils.dto.b.f(dataWithStatusResponse, me2meDebitResultRepository$getMe2MeDebitResult$3$1$1, me2meDebitResultRepository$getMe2MeDebitResult$1);
            }
        }
        me2meDebitResultRepository$getMe2MeDebitResult$1 = new Me2meDebitResultRepository$getMe2MeDebitResult$1(this, continuationImpl);
        Object obj2 = me2meDebitResultRepository$getMe2MeDebitResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = me2meDebitResultRepository$getMe2MeDebitResult$1.label;
        if (i2 != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r0 == r11) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, String str3, String str4, String str5, String str6, ContinuationImpl continuationImpl) {
        Me2meDebitResultRepository$getMe2MeDebitTransferId$1 me2meDebitResultRepository$getMe2MeDebitTransferId$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof Me2meDebitResultRepository$getMe2MeDebitTransferId$1) {
            me2meDebitResultRepository$getMe2MeDebitTransferId$1 = (Me2meDebitResultRepository$getMe2MeDebitTransferId$1) continuationImpl;
            int i2 = me2meDebitResultRepository$getMe2MeDebitTransferId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                me2meDebitResultRepository$getMe2MeDebitTransferId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = me2meDebitResultRepository$getMe2MeDebitTransferId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = me2meDebitResultRepository$getMe2MeDebitTransferId$1.label;
                if (i != 0) {
                    b.b(obj);
                    Me2meDebitResultRepository$getMe2MeDebitTransferId$2 me2meDebitResultRepository$getMe2MeDebitTransferId$2 = new Me2meDebitResultRepository$getMe2MeDebitTransferId$2(this, str3, str4, str5, str, str2, str6, null);
                    me2meDebitResultRepository$getMe2MeDebitTransferId$1.label = 1;
                    c = c.c(me2meDebitResultRepository$getMe2MeDebitTransferId$2, me2meDebitResultRepository$getMe2MeDebitTransferId$1);
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
                Me2meDebitResultRepository$getMe2MeDebitTransferId$3$1 me2meDebitResultRepository$getMe2MeDebitTransferId$3$1 = new Me2meDebitResultRepository$getMe2MeDebitTransferId$3$1(2, null);
                me2meDebitResultRepository$getMe2MeDebitTransferId$1.label = 2;
                Object a2 = f.a((TwoFactorAuthResponse) c, me2meDebitResultRepository$getMe2MeDebitTransferId$3$1, me2meDebitResultRepository$getMe2MeDebitTransferId$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        me2meDebitResultRepository$getMe2MeDebitTransferId$1 = new Me2meDebitResultRepository$getMe2MeDebitTransferId$1(this, continuationImpl);
        Object obj2 = me2meDebitResultRepository$getMe2MeDebitTransferId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = me2meDebitResultRepository$getMe2MeDebitTransferId$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
