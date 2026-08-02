package com.yandex.feedsdk.internal.safe;

import core.network.mapi.exception.IssueType;
import core.network.mapi.exception.MapiClientException;
import defpackage.g8e;
import defpackage.ku00;
import defpackage.lu00;
import defpackage.ny61;
import defpackage.v5j0;
import defpackage.vu00;
import defpackage.wu00;
import defpackage.xu00;
import defpackage.yu00;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a implements lu00 {
    public final lu00 a;

    public a(lu00 lu00Var) {
        this.a = lu00Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(vu00 vu00Var, yu00 yu00Var, ku00 ku00Var, v5j0 v5j0Var, ContinuationImpl continuationImpl) {
        SafeMapiClient$executeWrappedClientRequest$1 safeMapiClient$executeWrappedClientRequest$1;
        int i;
        try {
            if (continuationImpl instanceof SafeMapiClient$executeWrappedClientRequest$1) {
                safeMapiClient$executeWrappedClientRequest$1 = (SafeMapiClient$executeWrappedClientRequest$1) continuationImpl;
                int i2 = safeMapiClient$executeWrappedClientRequest$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    safeMapiClient$executeWrappedClientRequest$1.label = i2 - Integer.MIN_VALUE;
                    SafeMapiClient$executeWrappedClientRequest$1 safeMapiClient$executeWrappedClientRequest$12 = safeMapiClient$executeWrappedClientRequest$1;
                    Object obj = safeMapiClient$executeWrappedClientRequest$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = safeMapiClient$executeWrappedClientRequest$12.label;
                    if (i != 0) {
                        b.b(obj);
                        lu00 lu00Var = this.a;
                        safeMapiClient$executeWrappedClientRequest$12.L$0 = vu00Var;
                        safeMapiClient$executeWrappedClientRequest$12.L$1 = null;
                        safeMapiClient$executeWrappedClientRequest$12.L$2 = null;
                        safeMapiClient$executeWrappedClientRequest$12.L$3 = null;
                        safeMapiClient$executeWrappedClientRequest$12.label = 1;
                        obj = lu00Var.executeRequest(vu00Var, yu00Var, ku00Var, v5j0Var, safeMapiClient$executeWrappedClientRequest$12);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vu00Var = (vu00) safeMapiClient$executeWrappedClientRequest$12.L$0;
                        b.b(obj);
                    }
                    return (xu00) obj;
                }
            }
            if (i != 0) {
            }
            return (xu00) obj;
        } catch (MapiClientException e) {
            throw e;
        } catch (Throwable th) {
            throw new MapiClientException(g8e.o("Undeclared exception. ", th.getMessage()), th, new wu00(vu00Var, null, null, null, null, null, null, null, null, null), IssueType.COMMUNICATION);
        }
        safeMapiClient$executeWrappedClientRequest$1 = new SafeMapiClient$executeWrappedClientRequest$1(this, continuationImpl);
        SafeMapiClient$executeWrappedClientRequest$1 safeMapiClient$executeWrappedClientRequest$122 = safeMapiClient$executeWrappedClientRequest$1;
        Object obj2 = safeMapiClient$executeWrappedClientRequest$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = safeMapiClient$executeWrappedClientRequest$122.label;
    }

    @Override // defpackage.lu00
    public final Object executeRequest(vu00 vu00Var, yu00 yu00Var, ku00 ku00Var, Continuation continuation) {
        return a(vu00Var, yu00Var, ku00Var, new v5j0(vu00Var, null), (ContinuationImpl) continuation);
    }

    @Override // defpackage.lu00
    public final Object executeRequest(vu00 vu00Var, yu00 yu00Var, ku00 ku00Var, v5j0 v5j0Var, Continuation continuation) {
        return a(vu00Var, yu00Var, ku00Var, v5j0Var, (ContinuationImpl) continuation);
    }
}
