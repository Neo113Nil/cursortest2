package com.yandex.go.wallet.deeplink;

import android.content.Context;
import com.yandex.go.mainscreen.superapp.api.sidepager.MainSidePagerSidePage;
import defpackage.a841;
import defpackage.cd00;
import defpackage.dd00;
import defpackage.g931;
import defpackage.jxx;
import defpackage.l3w0;
import defpackage.m950;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.ofa0;
import defpackage.pep0;
import defpackage.qke;
import defpackage.v770;
import defpackage.vc00;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class a extends a841 {
    public final yvf0 b;
    public final ofa0 c;

    public a(g931 g931Var, ofa0 ofa0Var) {
        this.b = g931Var;
        this.c = ofa0Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, ContinuationImpl continuationImpl) {
        WalletDeeplinkHandler$handleDeeplink$1 walletDeeplinkHandler$handleDeeplink$1;
        int i;
        boolean booleanValue;
        if (continuationImpl instanceof WalletDeeplinkHandler$handleDeeplink$1) {
            walletDeeplinkHandler$handleDeeplink$1 = (WalletDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = walletDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walletDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = walletDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walletDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    b.b(obj);
                    walletDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    walletDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    walletDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    walletDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    walletDeeplinkHandler$handleDeeplink$1.label = 1;
                    ofa0 ofa0Var = this.c;
                    if (((dd00) ((cd00) ofa0Var.b)).b.a.getValue() != MainSidePagerSidePage.WALLET) {
                        obj = Boolean.FALSE;
                    } else if (!((l3w0) ofa0Var.w).a()) {
                        obj = Boolean.FALSE;
                    } else if (((vc00) ofa0Var.c).c(true)) {
                        qke.w((Context) ofa0Var.a, HapticController$Effect.CLICK_MEDIUM, false, true);
                        obj = Boolean.TRUE;
                    } else {
                        obj = Boolean.FALSE;
                    }
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oep0Var = (oep0) walletDeeplinkHandler$handleDeeplink$1.L$0;
                    b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                zy11 zy11Var = zy11.a;
                if (!booleanValue) {
                    return zy11Var;
                }
                m950 m950Var = (m950) this.b.get();
                jxx jxxVar = new jxx(true);
                oep0Var.getClass();
                ((pep0) oep0Var).f(m950Var, zy11Var, jxxVar);
                return zy11Var;
            }
        }
        walletDeeplinkHandler$handleDeeplink$1 = new WalletDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj2 = walletDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walletDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        zy11 zy11Var2 = zy11.a;
        if (!booleanValue) {
        }
    }
}
