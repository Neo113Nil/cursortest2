package com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors;

import defpackage.ny61;
import defpackage.smf0;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class b {
    public final com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c a;
    public final smf0 b;
    public final d c;

    public b(com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c cVar, smf0 smf0Var, d dVar) {
        this.a = cVar;
        this.b = smf0Var;
        this.c = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (r6.c.c(r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (((com.yandex.go.promocodes.base.impl.promo_codes.data.datasources.c) r6.a.e.get()).b(r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, List list, ContinuationImpl continuationImpl) {
        PromoCodeDeactivationInteractor$deactivate$1 promoCodeDeactivationInteractor$deactivate$1;
        int i;
        if (continuationImpl instanceof PromoCodeDeactivationInteractor$deactivate$1) {
            promoCodeDeactivationInteractor$deactivate$1 = (PromoCodeDeactivationInteractor$deactivate$1) continuationImpl;
            int i2 = promoCodeDeactivationInteractor$deactivate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoCodeDeactivationInteractor$deactivate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promoCodeDeactivationInteractor$deactivate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoCodeDeactivationInteractor$deactivate$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    promoCodeDeactivationInteractor$deactivate$1.L$0 = str;
                    promoCodeDeactivationInteractor$deactivate$1.L$1 = list;
                    promoCodeDeactivationInteractor$deactivate$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) promoCodeDeactivationInteractor$deactivate$1.L$0;
                        kotlin.b.b(obj);
                        smf0 smf0Var = this.b;
                        String l = smf0Var.a.l("selected_promo", null);
                        if (l == null) {
                            l = "";
                        }
                        if (l.equals(str)) {
                            smf0Var.a.a();
                        }
                        return zy11.a;
                    }
                    list = (List) promoCodeDeactivationInteractor$deactivate$1.L$1;
                    str = (String) promoCodeDeactivationInteractor$deactivate$1.L$0;
                    kotlin.b.b(obj);
                }
                promoCodeDeactivationInteractor$deactivate$1.L$0 = str;
                promoCodeDeactivationInteractor$deactivate$1.L$1 = null;
                promoCodeDeactivationInteractor$deactivate$1.label = 2;
            }
        }
        promoCodeDeactivationInteractor$deactivate$1 = new PromoCodeDeactivationInteractor$deactivate$1(this, continuationImpl);
        Object obj2 = promoCodeDeactivationInteractor$deactivate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoCodeDeactivationInteractor$deactivate$1.label;
        if (i != 0) {
        }
        promoCodeDeactivationInteractor$deactivate$1.L$0 = str;
        promoCodeDeactivationInteractor$deactivate$1.L$1 = null;
        promoCodeDeactivationInteractor$deactivate$1.label = 2;
    }
}
