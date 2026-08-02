package com.ybsdk.feature.card.internal.presentation.cardterm;

import android.net.Uri;
import com.ybsdk.feature.card.api.CardsSettingsTermParameter;
import com.ybsdk.feature.card.internal.repositories.d;
import defpackage.ds31;
import defpackage.h791;
import defpackage.j3h;
import defpackage.msb1;
import defpackage.ny61;
import defpackage.oo8;
import defpackage.pz40;
import defpackage.qo8;
import defpackage.ro8;
import defpackage.sr4;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.uc5;
import defpackage.v0h;
import defpackage.v7l;
import defpackage.we8;
import defpackage.x4c;
import defpackage.yo8;
import defpackage.zy11;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final CardsSettingsTermParameter B;
    public final d C;
    public final sr4 D;
    public final tfl0 E;

    public a(CardsSettingsTermParameter cardsSettingsTermParameter, d dVar, sr4 sr4Var, tfl0 tfl0Var, yo8 yo8Var) {
        super(new we8(8), yo8Var);
        this.B = cardsSettingsTermParameter;
        this.C = dVar;
        this.D = sr4Var;
        this.E = tfl0Var;
        tje.N(ds31.a(this), null, null, new CardSettingsTermViewModel$2(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(a aVar, ContinuationImpl continuationImpl) {
        CardSettingsTermViewModel$request$1 cardSettingsTermViewModel$request$1;
        int i;
        r0 r0Var;
        Object value;
        Object a;
        Throwable a2;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        aVar.getClass();
        if (continuationImpl instanceof CardSettingsTermViewModel$request$1) {
            cardSettingsTermViewModel$request$1 = (CardSettingsTermViewModel$request$1) continuationImpl;
            int i2 = cardSettingsTermViewModel$request$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardSettingsTermViewModel$request$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardSettingsTermViewModel$request$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardSettingsTermViewModel$request$1.label;
                if (i != 0) {
                    b.b(obj);
                    pz40 Y = aVar.Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, ro8.a((ro8) value, msb1.B, 0, 2)));
                    d dVar = aVar.C;
                    String initialScreenId = aVar.B.getInitialScreenId();
                    cardSettingsTermViewModel$request$1.label = 1;
                    a = dVar.a(initialScreenId, cardSettingsTermViewModel$request$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    a = ((Result) obj).getValue();
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    v7l v7lVar = (v7l) a;
                    pz40 Y2 = aVar.Y();
                    do {
                        r0Var3 = (r0) Y2;
                        value3 = r0Var3.getValue();
                    } while (!r0Var3.k(value3, ro8.a((ro8) value3, new qo8(v7lVar.c), 0, 2)));
                } else {
                    x4c.g("Failed load card settings term", a2, null, null, 12);
                    pz40 Y3 = aVar.Y();
                    do {
                        r0Var2 = (r0) Y3;
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, ro8.a((ro8) value2, new oo8(a2), 0, 2)));
                }
                return zy11.a;
            }
        }
        cardSettingsTermViewModel$request$1 = new CardSettingsTermViewModel$request$1(aVar, continuationImpl);
        Object obj2 = cardSettingsTermViewModel$request$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardSettingsTermViewModel$request$1.label;
        if (i != 0) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
        return zy11.a;
    }

    public final void c0(int i) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, ro8.a((ro8) value, null, i, 1)));
    }

    public final void d0() {
        this.E.e();
    }

    public final void e0() {
        tje.N(ds31.a(this), null, null, new CardSettingsTermViewModel$reloadData$1(this, null), 3);
    }

    public final boolean f0(Uri uri) {
        return h791.e((j3h) this.D.b, uri.toString(), false, null, 14) instanceof v0h;
    }
}
