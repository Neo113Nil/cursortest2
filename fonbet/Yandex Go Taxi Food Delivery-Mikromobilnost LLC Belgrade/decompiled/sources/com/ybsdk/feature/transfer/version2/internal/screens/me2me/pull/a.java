package com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull;

import com.adjust.sdk.Constants;
import com.ybsdk.core.navigation.cicerone.Screen;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.di.modules.features.t;
import com.ybsdk.feature.transfer.version2.api.TransferTwoFactorScreenProvider$Request;
import defpackage.c910;
import defpackage.ds31;
import defpackage.e100;
import defpackage.g8e;
import defpackage.h791;
import defpackage.hm01;
import defpackage.hu01;
import defpackage.j3h;
import defpackage.km01;
import defpackage.l0p;
import defpackage.mvy;
import defpackage.ny61;
import defpackage.ou01;
import defpackage.pz40;
import defpackage.qbg;
import defpackage.rm01;
import defpackage.s2u0;
import defpackage.s8j0;
import defpackage.ssa1;
import defpackage.t8j0;
import defpackage.tc01;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.tu01;
import defpackage.u8j0;
import defpackage.u910;
import defpackage.uc5;
import defpackage.us3;
import defpackage.uza;
import defpackage.w511;
import defpackage.y5e;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final tfl0 B;
    public final hu01 C;
    public final TransferMe2MeConfirmPullScreenParams D;
    public final rm01 E;
    public final j3h F;
    public final us3 G;
    public u8j0 H;
    public final com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.domain.a I;

    public a(tfl0 tfl0Var, hu01 hu01Var, TransferMe2MeConfirmPullScreenParams transferMe2MeConfirmPullScreenParams, rm01 rm01Var, j3h j3hVar, us3 us3Var, u910 u910Var) {
        super(new tc01(10), new s2u0(21));
        this.B = tfl0Var;
        this.C = hu01Var;
        this.D = transferMe2MeConfirmPullScreenParams;
        this.E = rm01Var;
        this.F = j3hVar;
        this.G = us3Var;
        e100 e100Var = u910Var.a;
        this.I = new com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.domain.a((com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.data.a) ((mvy) e100Var.b).get(), (com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.data.a) ((mvy) e100Var.c).get(), this, (t) ((qbg) e100Var.w).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(a aVar, String str, TransferTwoFactorScreenProvider$Request transferTwoFactorScreenProvider$Request, ContinuationImpl continuationImpl) {
        TransferMe2MeConfirmPullViewModel$openTwoFactorScreen$1 transferMe2MeConfirmPullViewModel$openTwoFactorScreen$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof TransferMe2MeConfirmPullViewModel$openTwoFactorScreen$1) {
            transferMe2MeConfirmPullViewModel$openTwoFactorScreen$1 = (TransferMe2MeConfirmPullViewModel$openTwoFactorScreen$1) continuationImpl;
            int i2 = transferMe2MeConfirmPullViewModel$openTwoFactorScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferMe2MeConfirmPullViewModel$openTwoFactorScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferMe2MeConfirmPullViewModel$openTwoFactorScreen$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferMe2MeConfirmPullViewModel$openTwoFactorScreen$1.label;
                if (i != 0) {
                    b.b(obj);
                    hu01 hu01Var = aVar.C;
                    Text.Empty empty = Text.Empty.INSTANCE;
                    transferMe2MeConfirmPullViewModel$openTwoFactorScreen$1.label = 1;
                    obj = ((tu01) hu01Var).b(null, null, str, transferTwoFactorScreenProvider$Request, null);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                aVar.B.h((Screen) obj);
                return zy11.a;
            }
        }
        transferMe2MeConfirmPullViewModel$openTwoFactorScreen$1 = new TransferMe2MeConfirmPullViewModel$openTwoFactorScreen$1(aVar, continuationImpl);
        Object obj3 = transferMe2MeConfirmPullViewModel$openTwoFactorScreen$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferMe2MeConfirmPullViewModel$openTwoFactorScreen$1.label;
        if (i != 0) {
        }
        aVar.B.h((Screen) obj3);
        return zy11.a;
    }

    public final void c0(String str) {
        this.G.a.I.a.a("me2me_pull_debit.auto_pull_screen.confirm.initiated", null);
        tje.N(ds31.a(this), null, null, new TransferMe2MeConfirmPullViewModel$executeAutoPullConfirm$1(this, str, null), 3);
    }

    public final void d0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new t8j0()));
        String partnerId = this.D.getPartnerId();
        l0p l0pVar = this.G.a.I;
        String b = ssa1.b(partnerId);
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        byte[] bArr = y5e.W;
        byte[] bArr2 = new byte[7];
        for (int i = 0; i < 7; i++) {
            bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
        }
        linkedHashMap.put(new String(bArr2, uza.a), b);
        l0pVar.a.a("me2me_pull_debit.auto_pull_screen.open", linkedHashMap);
        tje.N(ds31.a(this), null, null, new TransferMe2MeConfirmPullViewModel$loadData$2(this, null), 3);
    }

    public final void e0() {
        String supportUrl;
        Object X = X();
        s8j0 s8j0Var = X instanceof s8j0 ? (s8j0) X : null;
        Object obj = s8j0Var != null ? s8j0Var.a : null;
        FailDataException failDataException = obj instanceof FailDataException ? (FailDataException) obj : null;
        if (failDataException == null || (supportUrl = failDataException.getSupportUrl()) == null) {
            return;
        }
        ((ou01) this.E).a(supportUrl);
    }

    public final void f0() {
        this.G.a.I.a.a("me2me_pull_debit.auto_pull_screen.closed", null);
        this.B.e();
    }

    public final void g0(String str) {
        ou01 ou01Var = (ou01) this.E;
        h791.f(ou01Var.a, str, ((com.ybsdk.feature.webview.internal.a) ou01Var.b).f(str));
        this.G.a.I.a.a("me2me_pull_debit.auto_pull_screen.legal.click", null);
    }

    public final void h0() {
        c910 c910Var;
        c910 c910Var2;
        km01 km01Var = (km01) ((u8j0) X()).a();
        Status status = km01Var != null ? km01Var.d : null;
        int i = status == null ? -1 : hm01.a[status.ordinal()];
        j3h j3hVar = this.F;
        us3 us3Var = this.G;
        if (i != -1) {
            if (i == 1) {
                km01 km01Var2 = (km01) ((u8j0) X()).a();
                String action = (km01Var2 == null || (c910Var2 = km01Var2.c) == null) ? null : c910Var2.c.e.getAction();
                if (action == null) {
                    this.B.e();
                    return;
                } else {
                    h791.e(j3hVar, action, false, null, 14);
                    us3Var.a.I.a.a("me2me_pull_debit.auto_pull_screen.navigate_deeplink", g8e.w(1, Constants.DEEPLINK, action));
                    return;
                }
            }
            if (i != 2 && i != 3) {
                w511.b();
                return;
            }
        }
        km01 km01Var3 = (km01) ((u8j0) X()).a();
        String action2 = (km01Var3 == null || (c910Var = km01Var3.c) == null) ? null : c910Var.b.e.getAction();
        if (action2 == null) {
            c0(null);
        } else {
            h791.e(j3hVar, action2, false, null, 14);
            us3Var.a.I.a.a("me2me_pull_debit.auto_pull_screen.navigate_deeplink", g8e.w(1, Constants.DEEPLINK, action2));
        }
    }

    public final void i0() {
        if (this.H == null) {
            d0();
        } else {
            c0(null);
        }
    }

    public final void j0() {
        km01 km01Var = (km01) ((u8j0) X()).a();
        if ((km01Var != null ? km01Var.e : null) == null) {
            d0();
        }
    }
}
