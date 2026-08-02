package com.yandex.go.rida.bids.interactor;

import defpackage.f5k0;
import defpackage.ny61;
import defpackage.pp5;
import defpackage.zo1;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class b {
    public final pp5 a;
    public final com.yandex.go.rida.bids.data.a b;
    public final f5k0 c;

    public b(pp5 pp5Var, com.yandex.go.rida.bids.data.a aVar, f5k0 f5k0Var) {
        this.a = pp5Var;
        this.b = aVar;
        this.c = f5k0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, ContinuationImpl continuationImpl) {
        BidsAutoAcceptClickInteractor$changeAutoAccept$1 bidsAutoAcceptClickInteractor$changeAutoAccept$1;
        int i;
        f5k0 f5k0Var;
        boolean z2;
        Boolean bool;
        if (continuationImpl instanceof BidsAutoAcceptClickInteractor$changeAutoAccept$1) {
            bidsAutoAcceptClickInteractor$changeAutoAccept$1 = (BidsAutoAcceptClickInteractor$changeAutoAccept$1) continuationImpl;
            int i2 = bidsAutoAcceptClickInteractor$changeAutoAccept$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bidsAutoAcceptClickInteractor$changeAutoAccept$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bidsAutoAcceptClickInteractor$changeAutoAccept$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bidsAutoAcceptClickInteractor$changeAutoAccept$1.label;
                f5k0Var = this.c;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean booleanValue = ((Boolean) f5k0Var.c.a.getValue()).booleanValue();
                    if (booleanValue != z && !((Boolean) kotlinx.coroutines.flow.e.d(this.a.d).a.getValue()).booleanValue()) {
                        zo1 zo1Var = new zo1(this, z, 4);
                        bidsAutoAcceptClickInteractor$changeAutoAccept$1.Z$0 = z;
                        bidsAutoAcceptClickInteractor$changeAutoAccept$1.Z$1 = booleanValue;
                        bidsAutoAcceptClickInteractor$changeAutoAccept$1.label = 1;
                        Object b = this.b.b(z, zo1Var, bidsAutoAcceptClickInteractor$changeAutoAccept$1);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj = b;
                        z2 = booleanValue;
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = bidsAutoAcceptClickInteractor$changeAutoAccept$1.Z$1;
                kotlin.b.b(obj);
                bool = (Boolean) obj;
                if (bool != null && !bool.booleanValue()) {
                    f5k0Var.a(z2);
                }
                return zy11Var;
            }
        }
        bidsAutoAcceptClickInteractor$changeAutoAccept$1 = new BidsAutoAcceptClickInteractor$changeAutoAccept$1(this, continuationImpl);
        Object obj2 = bidsAutoAcceptClickInteractor$changeAutoAccept$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bidsAutoAcceptClickInteractor$changeAutoAccept$1.label;
        f5k0Var = this.c;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        bool = (Boolean) obj2;
        if (bool != null) {
            f5k0Var.a(z2);
        }
        return zy11Var2;
    }
}
