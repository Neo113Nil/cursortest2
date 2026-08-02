package com.yandex.delivery.utils.dialogmanager;

import defpackage.bpc;
import defpackage.cpc;
import defpackage.epc;
import defpackage.ny61;
import defpackage.qej;
import defpackage.rxh0;
import defpackage.rzh0;
import defpackage.tls;
import defpackage.w511;
import defpackage.y6o;
import defpackage.yuj0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a {
    public final yuj0 a;
    public final com.yandex.delivery.utils.dialogmanager.impl.b b;

    public a(yuj0 yuj0Var, com.yandex.delivery.utils.dialogmanager.impl.b bVar) {
        this.a = yuj0Var;
        this.b = bVar;
    }

    public static Object e(a aVar, bpc bpcVar, ContinuationImpl continuationImpl) {
        ErrorDialogInteractor$showErrorDialog$2 errorDialogInteractor$showErrorDialog$2 = new ErrorDialogInteractor$showErrorDialog$2();
        if (bpcVar instanceof cpc) {
            Object a = aVar.a(((cpc) bpcVar).a(), errorDialogInteractor$showErrorDialog$2, continuationImpl);
            if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return a;
            }
        } else {
            if (!(bpcVar instanceof epc)) {
                aVar.getClass();
                w511.b();
                return null;
            }
            Object c = aVar.c(errorDialogInteractor$showErrorDialog$2, continuationImpl);
            if (c == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return c;
            }
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(y6o y6oVar, tls tlsVar, ContinuationImpl continuationImpl) {
        ErrorDialogInteractor$requestErrorDialog$1 errorDialogInteractor$requestErrorDialog$1;
        Object obj;
        int i;
        tls tlsVar2;
        if (continuationImpl instanceof ErrorDialogInteractor$requestErrorDialog$1) {
            errorDialogInteractor$requestErrorDialog$1 = (ErrorDialogInteractor$requestErrorDialog$1) continuationImpl;
            int i2 = errorDialogInteractor$requestErrorDialog$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                errorDialogInteractor$requestErrorDialog$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = errorDialogInteractor$requestErrorDialog$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = errorDialogInteractor$requestErrorDialog$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            tlsVar2 = (tls) errorDialogInteractor$requestErrorDialog$1.L$1;
                            kotlin.b.b(obj2);
                        } else {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        }
                    }
                    kotlin.b.b(obj2);
                    return zy11Var;
                }
                kotlin.b.b(obj2);
                if (y6oVar == null) {
                    errorDialogInteractor$requestErrorDialog$1.L$0 = null;
                    errorDialogInteractor$requestErrorDialog$1.L$1 = null;
                    errorDialogInteractor$requestErrorDialog$1.label = 1;
                    if (c(tlsVar, errorDialogInteractor$requestErrorDialog$1) != obj) {
                        return zy11Var;
                    }
                } else {
                    String c = y6oVar.c();
                    String b = y6oVar.b();
                    String a = y6oVar.a();
                    if (a == null) {
                        a = this.a.a(rzh0.logistics_ok_button, new Object[0]);
                    }
                    qej qejVar = new qej(c, b, a, null, null, false, null, null, 248);
                    errorDialogInteractor$requestErrorDialog$1.L$0 = null;
                    errorDialogInteractor$requestErrorDialog$1.L$1 = tlsVar;
                    errorDialogInteractor$requestErrorDialog$1.L$2 = null;
                    errorDialogInteractor$requestErrorDialog$1.label = 2;
                    if (this.b.a(qejVar, errorDialogInteractor$requestErrorDialog$1) != obj) {
                        tlsVar2 = tlsVar;
                    }
                }
                return obj;
                errorDialogInteractor$requestErrorDialog$1.L$0 = null;
                errorDialogInteractor$requestErrorDialog$1.L$1 = null;
                errorDialogInteractor$requestErrorDialog$1.L$2 = null;
                errorDialogInteractor$requestErrorDialog$1.label = 3;
                if (tlsVar2.invoke(errorDialogInteractor$requestErrorDialog$1) != obj) {
                    return obj;
                }
            }
        }
        errorDialogInteractor$requestErrorDialog$1 = new ErrorDialogInteractor$requestErrorDialog$1(this, continuationImpl);
        Object obj22 = errorDialogInteractor$requestErrorDialog$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = errorDialogInteractor$requestErrorDialog$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
        errorDialogInteractor$requestErrorDialog$1.L$0 = null;
        errorDialogInteractor$requestErrorDialog$1.L$1 = null;
        errorDialogInteractor$requestErrorDialog$1.L$2 = null;
        errorDialogInteractor$requestErrorDialog$1.label = 3;
        if (tlsVar2.invoke(errorDialogInteractor$requestErrorDialog$1) != obj) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
    
        if (r0.invoke(r2) != r3) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(tls tlsVar, Continuation continuation) {
        ErrorDialogInteractor$requestUnknownErrorDialog$1 errorDialogInteractor$requestUnknownErrorDialog$1;
        int i;
        tls tlsVar2;
        if (continuation instanceof ErrorDialogInteractor$requestUnknownErrorDialog$1) {
            errorDialogInteractor$requestUnknownErrorDialog$1 = (ErrorDialogInteractor$requestUnknownErrorDialog$1) continuation;
            int i2 = errorDialogInteractor$requestUnknownErrorDialog$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                errorDialogInteractor$requestUnknownErrorDialog$1.label = i2 - Integer.MIN_VALUE;
                Object obj = errorDialogInteractor$requestUnknownErrorDialog$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = errorDialogInteractor$requestUnknownErrorDialog$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    yuj0 yuj0Var = this.a;
                    qej qejVar = new qej(yuj0Var.a(rxh0.delivery_unknown_error_dialog_title, new Object[0]), yuj0Var.a(rxh0.delivery_unknown_error_dialog_message, new Object[0]), yuj0Var.a(rxh0.delivery_unknown_error_dialog_positive_button, new Object[0]), null, null, false, null, null, 248);
                    errorDialogInteractor$requestUnknownErrorDialog$1.L$0 = tlsVar;
                    errorDialogInteractor$requestUnknownErrorDialog$1.L$1 = null;
                    errorDialogInteractor$requestUnknownErrorDialog$1.label = 1;
                    if (this.b.a(qejVar, errorDialogInteractor$requestUnknownErrorDialog$1) != coroutineSingletons) {
                        tlsVar2 = tlsVar;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                tlsVar2 = (tls) errorDialogInteractor$requestUnknownErrorDialog$1.L$0;
                kotlin.b.b(obj);
                errorDialogInteractor$requestUnknownErrorDialog$1.L$0 = null;
                errorDialogInteractor$requestUnknownErrorDialog$1.L$1 = null;
                errorDialogInteractor$requestUnknownErrorDialog$1.label = 2;
            }
        }
        errorDialogInteractor$requestUnknownErrorDialog$1 = new ErrorDialogInteractor$requestUnknownErrorDialog$1(this, continuation);
        Object obj2 = errorDialogInteractor$requestUnknownErrorDialog$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = errorDialogInteractor$requestUnknownErrorDialog$1.label;
        if (i != 0) {
        }
        errorDialogInteractor$requestUnknownErrorDialog$1.L$0 = null;
        errorDialogInteractor$requestUnknownErrorDialog$1.L$1 = null;
        errorDialogInteractor$requestUnknownErrorDialog$1.label = 2;
    }
}
