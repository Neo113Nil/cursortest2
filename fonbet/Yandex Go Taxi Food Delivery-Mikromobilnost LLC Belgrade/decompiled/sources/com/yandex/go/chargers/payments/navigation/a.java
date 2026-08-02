package com.yandex.go.chargers.payments.navigation;

import com.yandex.go.payments.api.model.PaymentsScreen;
import defpackage.azz;
import defpackage.h0a0;
import defpackage.h55;
import defpackage.m6a0;
import defpackage.m950;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.tje;
import defpackage.tla;
import defpackage.zla;
import defpackage.zzs;
import java.util.Collections;
import kotlin.b;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes12.dex */
public final class a extends h55 implements m950 {
    public final po21 D;
    public final tla E;
    public final com.yandex.go.chargers.payments.data.a F;

    public a(po21 po21Var, tla tlaVar, com.yandex.go.chargers.payments.data.a aVar) {
        super(null);
        this.D = po21Var;
        this.E = tlaVar;
        this.F = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(a aVar, zla zlaVar, ContinuationImpl continuationImpl) {
        ChargersPaymentSelectionRouterImpl$createPayload$1 chargersPaymentSelectionRouterImpl$createPayload$1;
        int i;
        zla zlaVar2;
        aVar.getClass();
        if (continuationImpl instanceof ChargersPaymentSelectionRouterImpl$createPayload$1) {
            chargersPaymentSelectionRouterImpl$createPayload$1 = (ChargersPaymentSelectionRouterImpl$createPayload$1) continuationImpl;
            int i2 = chargersPaymentSelectionRouterImpl$createPayload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPaymentSelectionRouterImpl$createPayload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPaymentSelectionRouterImpl$createPayload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPaymentSelectionRouterImpl$createPayload$1.label;
                if (i != 0) {
                    b.b(obj);
                    zlaVar.getClass();
                    po21 po21Var = aVar.D;
                    chargersPaymentSelectionRouterImpl$createPayload$1.L$0 = zlaVar;
                    chargersPaymentSelectionRouterImpl$createPayload$1.label = 1;
                    obj = ((e) po21Var).h(chargersPaymentSelectionRouterImpl$createPayload$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    zlaVar2 = zlaVar;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zlaVar2 = (zla) chargersPaymentSelectionRouterImpl$createPayload$1.L$0;
                    b.b(obj);
                }
                zzs a = ((mo21) obj).a();
                zlaVar2.getClass();
                m6a0 d = aVar.F.d();
                PaymentsScreen paymentsScreen = PaymentsScreen.CHARGERS;
                h0a0 h0a0Var = new h0a0(a, null);
                boolean z = zlaVar2.a;
                return new azz(paymentsScreen, "no_feature", h0a0Var, d, z, true, null, false, false, null, null, null, null, !z ? EmptySet.a : Collections.singleton(PaymentMethod$Type.PERSONAL_WALLET), null, null, null, null, 507776);
            }
        }
        chargersPaymentSelectionRouterImpl$createPayload$1 = new ChargersPaymentSelectionRouterImpl$createPayload$1(aVar, continuationImpl);
        Object obj2 = chargersPaymentSelectionRouterImpl$createPayload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPaymentSelectionRouterImpl$createPayload$1.label;
        if (i != 0) {
        }
        zzs a2 = ((mo21) obj2).a();
        zlaVar2.getClass();
        m6a0 d2 = aVar.F.d();
        PaymentsScreen paymentsScreen2 = PaymentsScreen.CHARGERS;
        h0a0 h0a0Var2 = new h0a0(a2, null);
        boolean z2 = zlaVar2.a;
        return new azz(paymentsScreen2, "no_feature", h0a0Var2, d2, z2, true, null, false, false, null, null, null, null, !z2 ? EmptySet.a : Collections.singleton(PaymentMethod$Type.PERSONAL_WALLET), null, null, null, null, 507776);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, CoroutineStart.UNDISPATCHED, new ChargersPaymentSelectionRouterImpl$onLaunch$1(this, (zla) obj, null), 1);
    }
}
