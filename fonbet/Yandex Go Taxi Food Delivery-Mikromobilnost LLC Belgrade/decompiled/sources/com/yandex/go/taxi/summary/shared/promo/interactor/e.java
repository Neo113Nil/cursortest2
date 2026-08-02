package com.yandex.go.taxi.summary.shared.promo.interactor;

import defpackage.ck60;
import defpackage.gsc;
import defpackage.kb5;
import defpackage.llx0;
import defpackage.mlx0;
import defpackage.ny61;
import defpackage.qd6;
import defpackage.sls;
import defpackage.vpr;
import defpackage.zy11;
import java.util.HashSet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes14.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ kb5 b;
    public final /* synthetic */ llx0 c;

    public e(vpr vprVar, kb5 kb5Var, llx0 llx0Var) {
        this.a = vprVar;
        this.b = kb5Var;
        this.c = llx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$2$1 tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$2$1;
        int i;
        qd6 qd6Var;
        if (continuation instanceof TariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$2$1) {
            tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$2$1 = (TariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$2$1) continuation;
            int i2 = tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$2$1.label;
                final int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    final mlx0 mlx0Var = (mlx0) obj;
                    if (mlx0Var != null) {
                        final llx0 llx0Var = this.c;
                        llx0Var.getClass();
                        String str = mlx0Var.a;
                        String str2 = mlx0Var.b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        final int i4 = 0;
                        qd6Var = new qd6(null, null, null, str, str2, ck60.b, new sls() { // from class: klx0
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i5 = i4;
                                zy11 zy11Var = zy11.a;
                                mlx0 mlx0Var2 = mlx0Var;
                                llx0 llx0Var2 = llx0Var;
                                switch (i5) {
                                    case 0:
                                        String str3 = mlx0Var2.c;
                                        jlx0 jlx0Var = llx0Var2.a;
                                        HashSet hashSet = jlx0Var.c;
                                        if (!hashSet.contains(str3)) {
                                            jlx0Var.a.h(null, null, str3, null, null);
                                            hashSet.add(str3);
                                            break;
                                        }
                                        break;
                                    default:
                                        String str4 = mlx0Var2.c;
                                        llx0Var2.a.a.i(null, null, str4, null, null);
                                        c4r0.e(llx0Var2.c, SelectionOrigin.REDIRECT, str4, null, 12);
                                        break;
                                }
                                return zy11Var;
                            }
                        }, null, 0L, new sls() { // from class: klx0
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i5 = i3;
                                zy11 zy11Var = zy11.a;
                                mlx0 mlx0Var2 = mlx0Var;
                                llx0 llx0Var2 = llx0Var;
                                switch (i5) {
                                    case 0:
                                        String str3 = mlx0Var2.c;
                                        jlx0 jlx0Var = llx0Var2.a;
                                        HashSet hashSet = jlx0Var.c;
                                        if (!hashSet.contains(str3)) {
                                            jlx0Var.a.h(null, null, str3, null, null);
                                            hashSet.add(str3);
                                            break;
                                        }
                                        break;
                                    default:
                                        String str4 = mlx0Var2.c;
                                        llx0Var2.a.a.i(null, null, str4, null, null);
                                        c4r0.e(llx0Var2.c, SelectionOrigin.REDIRECT, str4, null, 12);
                                        break;
                                }
                                return zy11Var;
                            }
                        }, null, null, 6951);
                    } else {
                        qd6Var = null;
                    }
                    gsc gscVar = new gsc(this.b, qd6Var);
                    tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$2$1.L$0 = null;
                    tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$2$1.L$1 = null;
                    tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$2$1.L$2 = null;
                    tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$2$1.L$3 = null;
                    tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$2$1.label = 1;
                    if (this.a.emit(gscVar, tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$2$1 = new TariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$2$1(this, continuation);
        Object obj22 = tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffPromoNotificationInteractor$notificationFlow$$inlined$map$3$2$1.label;
        final int i32 = 1;
        if (i != 0) {
        }
        return zy11.a;
    }
}
