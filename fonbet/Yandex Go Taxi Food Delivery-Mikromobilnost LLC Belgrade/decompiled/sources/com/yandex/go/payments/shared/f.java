package com.yandex.go.payments.shared;

import com.google.android.gms.location.DeviceOrientationRequest;
import com.yandex.go.payments.shared.data.model.Account;
import defpackage.cda0;
import defpackage.ea70;
import defpackage.ga70;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.snr0;
import defpackage.vub1;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class f {
    public final cda0 a;
    public final v b;

    public f(cda0 cda0Var, v vVar) {
        this.a = cda0Var;
        this.b = vVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|8|(1:(1:(4:12|13|14|15)(2:18|19))(1:20))(1:33)|21|(1:23)|24|25|(2:27|28)(2:31|32)))|45|6|7|8|(0)(0)|21|(0)|24|25|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
    
        if (r0 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        if (r0 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0040, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b6, code lost:
    
        defpackage.xby.l(defpackage.jst.e, "B2B.TOKEN_ERROR:RESOLVE_OPENABLE_ACCOUNT", null, r0, defpackage.oyr.p("Shared account ", r12.getId(), " is unavailable (deleted or no access), trying the next one"), 2);
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b5, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x003d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b2, code lost:
    
        return new defpackage.fa70(r12, r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0052  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [snr0] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v2, types: [snr0] */
    /* JADX WARN: Type inference failed for: r12v7, types: [snr0] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.Iterator] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a2 -> B:14:0x00a5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        OpenableSharedAccountInteractor$resolve$1 openableSharedAccountInteractor$resolve$1;
        int i;
        ?? r2;
        String str2;
        Iterable iterable;
        if (continuationImpl instanceof OpenableSharedAccountInteractor$resolve$1) {
            openableSharedAccountInteractor$resolve$1 = (OpenableSharedAccountInteractor$resolve$1) continuationImpl;
            int i2 = openableSharedAccountInteractor$resolve$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                openableSharedAccountInteractor$resolve$1.label = i2 - Integer.MIN_VALUE;
                OpenableSharedAccountInteractor$resolve$1 openableSharedAccountInteractor$resolve$12 = openableSharedAccountInteractor$resolve$1;
                Object obj = openableSharedAccountInteractor$resolve$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = openableSharedAccountInteractor$resolve$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    rol0 k = com.yandex.go.coroutines.b.k(new e(((com.yandex.go.payments.paymentlist.data.c) this.a).u), DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, null);
                    openableSharedAccountInteractor$resolve$12.L$0 = str;
                    openableSharedAccountInteractor$resolve$12.label = 1;
                    obj = kotlinx.coroutines.flow.e.A(k, openableSharedAccountInteractor$resolve$12);
                    str2 = str;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        snr0 snr0Var = (snr0) openableSharedAccountInteractor$resolve$12.L$3;
                        ?? r22 = (Iterator) openableSharedAccountInteractor$resolve$12.L$2;
                        kotlin.b.b(obj);
                        i = r22;
                        str = snr0Var;
                        return new ea70(str, (Account) obj);
                    }
                    String str3 = (String) openableSharedAccountInteractor$resolve$12.L$0;
                    kotlin.b.b(obj);
                    str2 = str3;
                }
                iterable = (List) obj;
                if (iterable == null) {
                    iterable = EmptyList.a;
                }
                r2 = vub1.c(str2, iterable).iterator();
                if (r2.hasNext()) {
                    return ga70.a;
                }
                snr0 snr0Var2 = (snr0) r2.next();
                v vVar = this.b;
                String id = snr0Var2.getId();
                openableSharedAccountInteractor$resolve$12.L$0 = null;
                openableSharedAccountInteractor$resolve$12.L$1 = null;
                openableSharedAccountInteractor$resolve$12.L$2 = r2;
                openableSharedAccountInteractor$resolve$12.L$3 = snr0Var2;
                openableSharedAccountInteractor$resolve$12.label = 2;
                obj = vVar.g(id, openableSharedAccountInteractor$resolve$12);
                i = r2;
                str = snr0Var2;
            }
        }
        openableSharedAccountInteractor$resolve$1 = new OpenableSharedAccountInteractor$resolve$1(this, continuationImpl);
        OpenableSharedAccountInteractor$resolve$1 openableSharedAccountInteractor$resolve$122 = openableSharedAccountInteractor$resolve$1;
        Object obj2 = openableSharedAccountInteractor$resolve$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = openableSharedAccountInteractor$resolve$122.label;
        if (i != 0) {
        }
        iterable = (List) obj2;
        if (iterable == null) {
        }
        r2 = vub1.c(str2, iterable).iterator();
        if (r2.hasNext()) {
        }
    }
}
