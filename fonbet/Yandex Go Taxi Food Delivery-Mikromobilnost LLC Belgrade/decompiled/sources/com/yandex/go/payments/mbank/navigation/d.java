package com.yandex.go.payments.mbank.navigation;

import com.yandex.go.payments.paymentlist.domain.i;
import defpackage.h3y;
import defpackage.h55;
import defpackage.hf0;
import defpackage.if0;
import defpackage.jf0;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.tje;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes13.dex */
public final class d extends h55 {
    public final h3y D;
    public final po21 E;
    public final h3y F;
    public final h3y G;
    public final hf0 H;

    public d(h3y h3yVar, po21 po21Var, h3y h3yVar2, h3y h3yVar3, hf0 hf0Var) {
        super(null);
        this.D = h3yVar;
        this.E = po21Var;
        this.F = h3yVar2;
        this.G = h3yVar3;
        this.H = hf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(d dVar, String str, String str2, ContinuationImpl continuationImpl) {
        AddMBankAccountStackRouter$createPayload$1 addMBankAccountStackRouter$createPayload$1;
        int i;
        dVar.getClass();
        if (continuationImpl instanceof AddMBankAccountStackRouter$createPayload$1) {
            addMBankAccountStackRouter$createPayload$1 = (AddMBankAccountStackRouter$createPayload$1) continuationImpl;
            int i2 = addMBankAccountStackRouter$createPayload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addMBankAccountStackRouter$createPayload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addMBankAccountStackRouter$createPayload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addMBankAccountStackRouter$createPayload$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    po21 po21Var = dVar.E;
                    addMBankAccountStackRouter$createPayload$1.L$0 = str;
                    addMBankAccountStackRouter$createPayload$1.L$1 = str2;
                    addMBankAccountStackRouter$createPayload$1.label = 1;
                    obj = ((e) po21Var).h(addMBankAccountStackRouter$createPayload$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) addMBankAccountStackRouter$createPayload$1.L$1;
                    str = (String) addMBankAccountStackRouter$createPayload$1.L$0;
                    kotlin.b.b(obj);
                }
                return new if0(((mo21) obj).a(), ((i) dVar.G.get()).d(), str, str2);
            }
        }
        addMBankAccountStackRouter$createPayload$1 = new AddMBankAccountStackRouter$createPayload$1(dVar, continuationImpl);
        Object obj2 = addMBankAccountStackRouter$createPayload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addMBankAccountStackRouter$createPayload$1.label;
        if (i != 0) {
        }
        return new if0(((mo21) obj2).a(), ((i) dVar.G.get()).d(), str, str2);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new AddMBankAccountStackRouter$onLaunch$1(this, (jf0) obj, null), 3);
    }
}
