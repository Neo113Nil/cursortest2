package com.yandex.go.payments.cards.pci_dss.data;

import com.yandex.go.payments.cards.domain.model.UserCardProfileParams;
import com.yandex.go.payments.cards.pci_dss.data.model.PciDssCardData;
import com.yandex.go.payments.domain.q0;
import defpackage.b90;
import defpackage.erw;
import defpackage.i3y;
import defpackage.jse;
import defpackage.ka0;
import defpackage.l9z;
import defpackage.ny61;
import defpackage.rk6;
import defpackage.tje;
import defpackage.tt2;
import defpackage.tx90;
import defpackage.uyj;
import defpackage.wnt;
import defpackage.zrt;
import defpackage.zzs;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final wnt a;
    public final l9z b;
    public final q0 c;
    public final i3y d;
    public final jse e;

    public a(tt2 tt2Var, zrt zrtVar, wnt wntVar, l9z l9zVar, q0 q0Var) {
        this.a = wntVar;
        this.b = l9zVar;
        this.c = q0Var;
        this.d = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rk6(19, zrtVar));
        tt2Var.getClass();
        this.e = uyj.a.P(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(erw erwVar, ContinuationImpl continuationImpl) {
        CardDataEncryptionInteractor$createAsyncIfNeed$1 cardDataEncryptionInteractor$createAsyncIfNeed$1;
        int i;
        Object obj;
        PciDssCardData pciDssCardData;
        if (continuationImpl instanceof CardDataEncryptionInteractor$createAsyncIfNeed$1) {
            cardDataEncryptionInteractor$createAsyncIfNeed$1 = (CardDataEncryptionInteractor$createAsyncIfNeed$1) continuationImpl;
            int i2 = cardDataEncryptionInteractor$createAsyncIfNeed$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardDataEncryptionInteractor$createAsyncIfNeed$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = cardDataEncryptionInteractor$createAsyncIfNeed$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardDataEncryptionInteractor$createAsyncIfNeed$1.label;
                if (i != 0) {
                    b.b(obj2);
                    PciDssCardData pciDssCardData2 = ((b90) erwVar).d;
                    if (pciDssCardData2 == null) {
                        return null;
                    }
                    ka0 ka0Var = ((b90) erwVar).a.a;
                    zzs zzsVar = ka0Var.c;
                    Integer num = ka0Var.b;
                    String str = ka0Var.d;
                    if (str == null) {
                        str = this.b.a();
                    }
                    UserCardProfileParams userCardProfileParams = new UserCardProfileParams(zzsVar, num, str);
                    cardDataEncryptionInteractor$createAsyncIfNeed$1.L$0 = null;
                    cardDataEncryptionInteractor$createAsyncIfNeed$1.L$1 = pciDssCardData2;
                    cardDataEncryptionInteractor$createAsyncIfNeed$1.label = 1;
                    Object a = this.c.a(userCardProfileParams, cardDataEncryptionInteractor$createAsyncIfNeed$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        pciDssCardData = pciDssCardData2;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                    return obj2;
                }
                pciDssCardData = (PciDssCardData) cardDataEncryptionInteractor$createAsyncIfNeed$1.L$1;
                b.b(obj2);
                obj = ((Result) obj2).getValue();
                if (Result.a(obj) == null) {
                    ny61.r("Profile must be non null");
                    return null;
                }
                CardDataEncryptionInteractor$createAsyncIfNeed$2 cardDataEncryptionInteractor$createAsyncIfNeed$2 = new CardDataEncryptionInteractor$createAsyncIfNeed$2(this, pciDssCardData, (tx90) obj, null);
                cardDataEncryptionInteractor$createAsyncIfNeed$1.L$0 = null;
                cardDataEncryptionInteractor$createAsyncIfNeed$1.L$1 = null;
                cardDataEncryptionInteractor$createAsyncIfNeed$1.L$2 = null;
                cardDataEncryptionInteractor$createAsyncIfNeed$1.label = 2;
                Object k0 = tje.k0(this.e, cardDataEncryptionInteractor$createAsyncIfNeed$2, cardDataEncryptionInteractor$createAsyncIfNeed$1);
                return k0 == coroutineSingletons ? coroutineSingletons : k0;
            }
        }
        cardDataEncryptionInteractor$createAsyncIfNeed$1 = new CardDataEncryptionInteractor$createAsyncIfNeed$1(this, continuationImpl);
        Object obj22 = cardDataEncryptionInteractor$createAsyncIfNeed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardDataEncryptionInteractor$createAsyncIfNeed$1.label;
        if (i != 0) {
        }
        if (Result.a(obj) == null) {
        }
    }
}
