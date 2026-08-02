package com.yandex.go.chargers.discounts.activate.domain;

import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsActivateResponseDto;
import com.yandex.go.chargers.discounts.data.models.i;
import defpackage.cs8;
import defpackage.cy9;
import defpackage.em9;
import defpackage.fmt;
import defpackage.ir9;
import defpackage.ny61;
import defpackage.ot9;
import defpackage.pt9;
import defpackage.q00;
import defpackage.rt9;
import defpackage.tls;
import defpackage.xt9;
import defpackage.yj9;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final em9 a;
    public final com.yandex.go.chargers.error.data.a b;
    public final com.yandex.go.chargers.discounts.activate.data.a c;
    public final xt9 d;

    public a(em9 em9Var, com.yandex.go.chargers.error.data.a aVar, com.yandex.go.chargers.discounts.activate.data.a aVar2, xt9 xt9Var) {
        this.a = em9Var;
        this.b = aVar;
        this.c = aVar2;
        this.d = xt9Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(2:3|(4:5|6|7|8))|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0150, code lost:
    
        if (r7 != r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00af, code lost:
    
        if (r7 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0070, code lost:
    
        r12 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0116 A[Catch: all -> 0x0070, CancellationException -> 0x0159, TryCatch #1 {all -> 0x0070, blocks: (B:20:0x006b, B:21:0x0104, B:23:0x0116, B:24:0x011c, B:29:0x0080, B:31:0x008e, B:33:0x00d2, B:35:0x00dc, B:38:0x00f1), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc A[Catch: all -> 0x0070, CancellationException -> 0x0159, TryCatch #1 {all -> 0x0070, blocks: (B:20:0x006b, B:21:0x0104, B:23:0x0116, B:24:0x011c, B:29:0x0080, B:31:0x008e, B:33:0x00d2, B:35:0x00dc, B:38:0x00f1), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f1 A[Catch: all -> 0x0070, CancellationException -> 0x0159, TryCatch #1 {all -> 0x0070, blocks: (B:20:0x006b, B:21:0x0104, B:23:0x0116, B:24:0x011c, B:29:0x0080, B:31:0x008e, B:33:0x00d2, B:35:0x00dc, B:38:0x00f1), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r12v15, types: [tls] */
    /* JADX WARN: Type inference failed for: r13v16, types: [tls] */
    /* JADX WARN: Type inference failed for: r13v6, types: [tls] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cs8 cs8Var, ContinuationImpl continuationImpl) {
        ChargersDiscountsActivateInteractor$activatePromocode$1 chargersDiscountsActivateInteractor$activatePromocode$1;
        ?? r2;
        String str2;
        cy9 cy9Var;
        cs8 cs8Var2;
        String str3;
        cs8 cs8Var3;
        i iVar;
        cs8 cs8Var4;
        String str4;
        try {
            if (continuationImpl instanceof ChargersDiscountsActivateInteractor$activatePromocode$1) {
                chargersDiscountsActivateInteractor$activatePromocode$1 = (ChargersDiscountsActivateInteractor$activatePromocode$1) continuationImpl;
                int i = chargersDiscountsActivateInteractor$activatePromocode$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    chargersDiscountsActivateInteractor$activatePromocode$1.label = i - Integer.MIN_VALUE;
                    Object obj = chargersDiscountsActivateInteractor$activatePromocode$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r2 = chargersDiscountsActivateInteractor$activatePromocode$1.label;
                    em9 em9Var = this.a;
                    xt9 xt9Var = this.d;
                    zy11 zy11Var = zy11.a;
                    switch (r2) {
                        case 0:
                            b.b(obj);
                            chargersDiscountsActivateInteractor$activatePromocode$1.L$0 = str;
                            chargersDiscountsActivateInteractor$activatePromocode$1.L$1 = cs8Var;
                            chargersDiscountsActivateInteractor$activatePromocode$1.label = 1;
                            xt9Var.a(pt9.a, str, chargersDiscountsActivateInteractor$activatePromocode$1);
                            cs8Var2 = cs8Var;
                            break;
                        case 1:
                            ?? r13 = (tls) chargersDiscountsActivateInteractor$activatePromocode$1.L$1;
                            str = (String) chargersDiscountsActivateInteractor$activatePromocode$1.L$0;
                            b.b(obj);
                            cs8Var2 = r13;
                            try {
                                com.yandex.go.chargers.discounts.activate.data.a aVar = this.c;
                                yj9 a = yj9.a(((q00) xt9Var.a.getValue()).b, str);
                                chargersDiscountsActivateInteractor$activatePromocode$1.L$0 = str;
                                chargersDiscountsActivateInteractor$activatePromocode$1.L$1 = cs8Var2;
                                chargersDiscountsActivateInteractor$activatePromocode$1.label = 2;
                                obj = aVar.a(a, chargersDiscountsActivateInteractor$activatePromocode$1);
                                if (obj != coroutineSingletons) {
                                    str3 = str;
                                    cs8Var3 = cs8Var2;
                                    iVar = ((ChargersDiscountsActivateResponseDto) ((fmt) obj).a).a;
                                    if (iVar != null) {
                                        ot9 ot9Var = new ot9(0);
                                        chargersDiscountsActivateInteractor$activatePromocode$1.L$0 = str3;
                                        chargersDiscountsActivateInteractor$activatePromocode$1.L$1 = null;
                                        chargersDiscountsActivateInteractor$activatePromocode$1.L$2 = iVar;
                                        chargersDiscountsActivateInteractor$activatePromocode$1.label = 3;
                                        xt9Var.a(ot9Var, str3, chargersDiscountsActivateInteractor$activatePromocode$1);
                                        r2 = str3;
                                        if (zy11Var == coroutineSingletons) {
                                        }
                                        em9.g(em9Var, r2, iVar == null ? iVar.getA() : null, null, 4);
                                        return zy11Var;
                                    }
                                    rt9 rt9Var = new rt9(iVar);
                                    chargersDiscountsActivateInteractor$activatePromocode$1.L$0 = str3;
                                    chargersDiscountsActivateInteractor$activatePromocode$1.L$1 = cs8Var3;
                                    chargersDiscountsActivateInteractor$activatePromocode$1.L$2 = iVar;
                                    chargersDiscountsActivateInteractor$activatePromocode$1.label = 4;
                                    xt9Var.a(rt9Var, str3, chargersDiscountsActivateInteractor$activatePromocode$1);
                                    str4 = str3;
                                    cs8Var4 = cs8Var3;
                                    if (zy11Var == coroutineSingletons) {
                                    }
                                    cs8Var4.invoke(new ir9(iVar.b(), iVar.getA(), null));
                                    r2 = str4;
                                    em9.g(em9Var, r2, iVar == null ? iVar.getA() : null, null, 4);
                                    return zy11Var;
                                }
                            } catch (Throwable th) {
                                r2 = str;
                                th = th;
                                chargersDiscountsActivateInteractor$activatePromocode$1.L$0 = r2;
                                chargersDiscountsActivateInteractor$activatePromocode$1.L$1 = null;
                                chargersDiscountsActivateInteractor$activatePromocode$1.L$2 = null;
                                chargersDiscountsActivateInteractor$activatePromocode$1.L$3 = null;
                                chargersDiscountsActivateInteractor$activatePromocode$1.label = 5;
                                obj = this.b.a(th, chargersDiscountsActivateInteractor$activatePromocode$1);
                                if (obj != coroutineSingletons) {
                                    str2 = r2;
                                    cy9Var = (cy9) obj;
                                    ot9 ot9Var2 = new ot9(cy9Var);
                                    chargersDiscountsActivateInteractor$activatePromocode$1.L$0 = str2;
                                    chargersDiscountsActivateInteractor$activatePromocode$1.L$1 = null;
                                    chargersDiscountsActivateInteractor$activatePromocode$1.L$2 = null;
                                    chargersDiscountsActivateInteractor$activatePromocode$1.L$3 = cy9Var;
                                    chargersDiscountsActivateInteractor$activatePromocode$1.L$4 = null;
                                    chargersDiscountsActivateInteractor$activatePromocode$1.label = 6;
                                    xt9Var.a(ot9Var2, str2, chargersDiscountsActivateInteractor$activatePromocode$1);
                                    break;
                                }
                                return coroutineSingletons;
                            }
                            return coroutineSingletons;
                        case 2:
                            ?? r12 = (tls) chargersDiscountsActivateInteractor$activatePromocode$1.L$1;
                            String str5 = (String) chargersDiscountsActivateInteractor$activatePromocode$1.L$0;
                            b.b(obj);
                            cs8Var3 = r12;
                            str3 = str5;
                            iVar = ((ChargersDiscountsActivateResponseDto) ((fmt) obj).a).a;
                            if (iVar != null) {
                            }
                            return coroutineSingletons;
                        case 3:
                            iVar = (i) chargersDiscountsActivateInteractor$activatePromocode$1.L$2;
                            String str6 = (String) chargersDiscountsActivateInteractor$activatePromocode$1.L$0;
                            b.b(obj);
                            r2 = str6;
                            em9.g(em9Var, r2, iVar == null ? iVar.getA() : null, null, 4);
                            return zy11Var;
                        case 4:
                            iVar = (i) chargersDiscountsActivateInteractor$activatePromocode$1.L$2;
                            ?? r132 = (tls) chargersDiscountsActivateInteractor$activatePromocode$1.L$1;
                            String str7 = (String) chargersDiscountsActivateInteractor$activatePromocode$1.L$0;
                            b.b(obj);
                            str4 = str7;
                            cs8Var4 = r132;
                            cs8Var4.invoke(new ir9(iVar.b(), iVar.getA(), null));
                            r2 = str4;
                            em9.g(em9Var, r2, iVar == null ? iVar.getA() : null, null, 4);
                            return zy11Var;
                        case 5:
                            String str8 = (String) chargersDiscountsActivateInteractor$activatePromocode$1.L$0;
                            b.b(obj);
                            str2 = str8;
                            cy9Var = (cy9) obj;
                            ot9 ot9Var22 = new ot9(cy9Var);
                            chargersDiscountsActivateInteractor$activatePromocode$1.L$0 = str2;
                            chargersDiscountsActivateInteractor$activatePromocode$1.L$1 = null;
                            chargersDiscountsActivateInteractor$activatePromocode$1.L$2 = null;
                            chargersDiscountsActivateInteractor$activatePromocode$1.L$3 = cy9Var;
                            chargersDiscountsActivateInteractor$activatePromocode$1.L$4 = null;
                            chargersDiscountsActivateInteractor$activatePromocode$1.label = 6;
                            xt9Var.a(ot9Var22, str2, chargersDiscountsActivateInteractor$activatePromocode$1);
                            break;
                        case 6:
                            cy9Var = (cy9) chargersDiscountsActivateInteractor$activatePromocode$1.L$3;
                            str2 = (String) chargersDiscountsActivateInteractor$activatePromocode$1.L$0;
                            b.b(obj);
                            em9.g(em9Var, str2, null, cy9Var.a, 2);
                            return zy11Var;
                        default:
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                }
            }
            switch (r2) {
            }
        } catch (CancellationException e) {
            throw e;
        }
        chargersDiscountsActivateInteractor$activatePromocode$1 = new ChargersDiscountsActivateInteractor$activatePromocode$1(this, continuationImpl);
        Object obj2 = chargersDiscountsActivateInteractor$activatePromocode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r2 = chargersDiscountsActivateInteractor$activatePromocode$1.label;
        em9 em9Var2 = this.a;
        xt9 xt9Var2 = this.d;
        zy11 zy11Var2 = zy11.a;
    }
}
