package com.yandex.passport.internal.impl;

import android.content.Context;
import com.yandex.passport.api.exception.PassportAccountNotAuthorizedException;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.entities.VpnStatus;
import com.yandex.passport.internal.methods.n2;
import com.yandex.passport.internal.methods.requester.CommonRequesterKt$requestMethodOnDefault$2;
import com.yandex.passport.internal.ui.challenge.vpn.VpnChallengeActivity;
import com.yandex.passport.internal.ui.sloth.ebs.BiometricVerificationActivity;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesActivity;
import com.yandex.passport.internal.ui.sloth.webauthn.RegisterWebAuthNActivity;
import defpackage.ffx;
import defpackage.jl40;
import defpackage.lfx;
import defpackage.lid0;
import defpackage.m50;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.scs;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.v40;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class o implements com.yandex.passport.api.g {
    public final tse a;
    public final f b;
    public final n0 c;
    public final n0 d;
    public final n0 e;
    public final n0 f;
    public final n0 g;
    public final n0 h;
    public final n0 i;
    public final n0 j;
    public final n0 k;
    public final n0 l;
    public final n0 m;
    public final n0 n;
    public final com.yandex.passport.internal.autologin.ui.j o;
    public final m50 p;
    public final m50 q;
    public final m50 r;
    public final m50 s;

    /* JADX WARN: Multi-variable type inference failed */
    public o(r rVar, g gVar, v40 v40Var, tse tseVar, i iVar, f fVar, Context context) {
        this.a = tseVar;
        this.b = fVar;
        n0 c = ffx.c(1, 0, null, 6);
        n0 c2 = ffx.c(1, 0, null, 6);
        n0 c3 = ffx.c(1, 0, null, 6);
        n0 c4 = ffx.c(1, 0, null, 6);
        n0 c5 = ffx.c(1, 0, null, 6);
        n0 c6 = ffx.c(1, 0, null, 6);
        n0 c7 = ffx.c(1, 0, null, 6);
        n0 c8 = ffx.c(1, 0, null, 6);
        this.c = c8;
        n0 c9 = ffx.c(1, 0, null, 6);
        n0 c10 = ffx.c(0, 0, null, 7);
        this.d = ffx.c(1, 0, null, 6);
        this.e = ffx.c(1, 0, null, 6);
        this.f = ffx.c(1, 0, null, 6);
        this.g = ffx.c(1, 0, null, 6);
        n0 c11 = ffx.c(1, 0, null, 6);
        n0 c12 = ffx.c(1, 0, null, 6);
        n0 c13 = ffx.c(1, 0, null, 6);
        this.h = ffx.c(1, 0, null, 6);
        this.i = ffx.c(1, 0, null, 6);
        this.j = ffx.c(1, 0, null, 6);
        this.k = ffx.c(0, 0, null, 7);
        this.l = ffx.c(1, 0, null, 6);
        this.m = ffx.c(0, 0, null, 7);
        this.n = ffx.c(0, 0, null, 7);
        com.yandex.passport.api.e eVar = rVar.a;
        v40Var.registerForActivityResult(new com.yandex.passport.internal.autologin.ui.h(eVar, 2), new n(c6, this, c, 0));
        this.o = new com.yandex.passport.internal.autologin.ui.j(context, this, iVar, fVar, gVar, v40Var, tseVar, c8, new KPassportUiApiImpl$autologinPerformer$1(this, null));
        int i = 11;
        v40Var.registerForActivityResult(new com.yandex.passport.internal.autologin.ui.h(eVar, i), new n(c7, this, c2, 1));
        this.p = v40Var.registerForActivityResult(new q(eVar, rVar), new m(c9, this));
        v40Var.registerForActivityResult(new com.yandex.passport.internal.autologin.ui.h(eVar, 6, false), new m(c10, this));
        int i2 = 1;
        v40Var.registerForActivityResult(new scs(i2), new k(0 == true ? 1 : 0, this));
        int i3 = 8;
        v40Var.registerForActivityResult(new com.yandex.passport.internal.autologin.ui.h(eVar, i3, 0 == true ? 1 : 0), new k(i3, this));
        int i4 = 9;
        v40Var.registerForActivityResult(new lid0(i2, rVar), new k(i4, this));
        int i5 = 10;
        v40Var.registerForActivityResult(new t(), new k(i5, this));
        int i6 = 4;
        v40Var.registerForActivityResult(new com.yandex.passport.internal.autologin.ui.h(eVar, i6), new n(c6, this, c5, 2));
        int i7 = 3;
        v40Var.registerForActivityResult(new com.yandex.passport.internal.autologin.ui.h(eVar, 1), new n(c6, this, c4, i7));
        v40Var.registerForActivityResult(new com.yandex.passport.internal.autologin.ui.h(eVar, rVar), new m(c11, this));
        v40Var.registerForActivityResult(new com.yandex.passport.internal.autologin.ui.h(eVar, i7), new n(c6, this, c3, i6));
        int i8 = 5;
        v40Var.registerForActivityResult(new com.yandex.passport.internal.autologin.ui.h(eVar, i8), new n(c13, this, c12, i8));
        int i9 = 12;
        v40Var.registerForActivityResult(new com.yandex.passport.internal.autologin.ui.h(eVar, i9), new k(i, this));
        v40Var.registerForActivityResult(new com.yandex.passport.internal.autologin.ui.h(eVar, i4), new k(i9, this));
        v40Var.registerForActivityResult(new com.yandex.passport.internal.autologin.ui.h(eVar, i5), new k(1, this));
        this.q = v40Var.registerForActivityResult(new v(), new k(2, this));
        v40Var.registerForActivityResult(new u(eVar), new k(i7, this));
        v40Var.registerForActivityResult(new com.yandex.passport.internal.ui.sloth.plusdevices.c(), new k(i6, this));
        v40Var.registerForActivityResult(new ManagingPlusDevicesActivity.a(), new k(i8, this));
        this.r = v40Var.registerForActivityResult(new BiometricVerificationActivity.a(), new k(6, this));
        this.s = v40Var.registerForActivityResult(new VpnChallengeActivity.a(), new l());
        v40Var.registerForActivityResult(new RegisterWebAuthNActivity.a(), new k(7, this));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|(1:(1:(5:10|11|(4:13|(1:15)|16|(1:18)(2:22|(2:26|27)))(2:28|(1:30))|19|20)(2:31|32))(4:33|34|35|36))(4:50|(4:53|54|(1:56)|46)|52|44)|37|38|(2:40|(1:42))|44))|59|6|(0)(0)|37|38|(0)|44) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b6, code lost:
    
        if (r12 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079 A[Catch: all -> 0x008c, TryCatch #2 {all -> 0x008c, blocks: (B:38:0x006d, B:40:0x0079, B:42:0x0083), top: B:37:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, ContinuationImpl continuationImpl) {
        KPassportUiApiImpl$showVpnBlockerIfNeeded$1 kPassportUiApiImpl$showVpnBlockerIfNeeded$1;
        int i;
        boolean z2;
        Throwable a;
        if (continuationImpl instanceof KPassportUiApiImpl$showVpnBlockerIfNeeded$1) {
            kPassportUiApiImpl$showVpnBlockerIfNeeded$1 = (KPassportUiApiImpl$showVpnBlockerIfNeeded$1) continuationImpl;
            int i2 = kPassportUiApiImpl$showVpnBlockerIfNeeded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kPassportUiApiImpl$showVpnBlockerIfNeeded$1.label = i2 - Integer.MIN_VALUE;
                Object obj = kPassportUiApiImpl$showVpnBlockerIfNeeded$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kPassportUiApiImpl$showVpnBlockerIfNeeded$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (z) {
                        try {
                            sjh sjhVar = uyj.a;
                            CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$2 = new CommonRequesterKt$requestMethodOnDefault$2(this.b.e, new n2(false), new lfx[0], null);
                            kPassportUiApiImpl$showVpnBlockerIfNeeded$1.L$0 = this;
                            kPassportUiApiImpl$showVpnBlockerIfNeeded$1.Z$0 = false;
                            kPassportUiApiImpl$showVpnBlockerIfNeeded$1.label = 1;
                            obj = tje.k0(sjhVar, commonRequesterKt$requestMethodOnDefault$2, kPassportUiApiImpl$showVpnBlockerIfNeeded$1);
                            if (obj != coroutineSingletons) {
                                z2 = false;
                            }
                        } catch (Throwable unused) {
                        }
                        return coroutineSingletons;
                    }
                    z2 = false;
                    com.yandex.passport.internal.methods.requester.f fVar = this.b.e;
                    com.yandex.passport.internal.methods.n0 n0Var = new com.yandex.passport.internal.methods.n0(z2);
                    lfx[] lfxVarArr = {qoi0.a(PassportAccountNotFoundException.class), qoi0.a(PassportAccountNotAuthorizedException.class)};
                    sjh sjhVar2 = uyj.a;
                    CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$22 = new CommonRequesterKt$requestMethodOnDefault$2(fVar, n0Var, lfxVarArr, null);
                    kPassportUiApiImpl$showVpnBlockerIfNeeded$1.L$0 = this;
                    kPassportUiApiImpl$showVpnBlockerIfNeeded$1.label = 2;
                    obj = tje.k0(sjhVar2, commonRequesterKt$requestMethodOnDefault$22, kPassportUiApiImpl$showVpnBlockerIfNeeded$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (o) kPassportUiApiImpl$showVpnBlockerIfNeeded$1.L$0;
                        kotlin.b.b(obj);
                        Object value = ((Result) obj).getValue();
                        Throwable a2 = Result.a(value);
                        if (a2 == null) {
                            VpnStatus vpnStatus = (VpnStatus) value;
                            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "showVpnBlockerIfNeeded: " + vpnStatus, 8);
                            }
                            if (vpnStatus instanceof VpnStatus.Blocked) {
                                this.s.a(((VpnStatus.Blocked) vpnStatus).getUrl());
                            } else if (!jl40.l(vpnStatus, VpnStatus.Allowed.INSTANCE) && !jl40.l(vpnStatus, VpnStatus.Pending.INSTANCE)) {
                                w511.b();
                                return null;
                            }
                        } else {
                            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "showVpnBlockerIfNeeded failed", a2);
                            }
                        }
                        return zy11.a;
                    }
                    boolean z3 = kPassportUiApiImpl$showVpnBlockerIfNeeded$1.Z$0;
                    o oVar = (o) kPassportUiApiImpl$showVpnBlockerIfNeeded$1.L$0;
                    try {
                        kotlin.b.b(obj);
                        z2 = z3;
                        this = oVar;
                    } catch (Throwable unused2) {
                        z2 = z3;
                        this = oVar;
                    }
                }
                a = Result.a(((Result) obj).getValue());
                if (a != null) {
                    com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "resetUserDisable failed", a);
                    }
                }
                com.yandex.passport.internal.methods.requester.f fVar2 = this.b.e;
                com.yandex.passport.internal.methods.n0 n0Var2 = new com.yandex.passport.internal.methods.n0(z2);
                lfx[] lfxVarArr2 = {qoi0.a(PassportAccountNotFoundException.class), qoi0.a(PassportAccountNotAuthorizedException.class)};
                sjh sjhVar22 = uyj.a;
                CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$222 = new CommonRequesterKt$requestMethodOnDefault$2(fVar2, n0Var2, lfxVarArr2, null);
                kPassportUiApiImpl$showVpnBlockerIfNeeded$1.L$0 = this;
                kPassportUiApiImpl$showVpnBlockerIfNeeded$1.label = 2;
                obj = tje.k0(sjhVar22, commonRequesterKt$requestMethodOnDefault$222, kPassportUiApiImpl$showVpnBlockerIfNeeded$1);
            }
        }
        kPassportUiApiImpl$showVpnBlockerIfNeeded$1 = new KPassportUiApiImpl$showVpnBlockerIfNeeded$1(this, continuationImpl);
        Object obj2 = kPassportUiApiImpl$showVpnBlockerIfNeeded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportUiApiImpl$showVpnBlockerIfNeeded$1.label;
        if (i != 0) {
        }
        a = Result.a(((Result) obj2).getValue());
        if (a != null) {
        }
        com.yandex.passport.internal.methods.requester.f fVar22 = this.b.e;
        com.yandex.passport.internal.methods.n0 n0Var22 = new com.yandex.passport.internal.methods.n0(z2);
        lfx[] lfxVarArr22 = {qoi0.a(PassportAccountNotFoundException.class), qoi0.a(PassportAccountNotAuthorizedException.class)};
        sjh sjhVar222 = uyj.a;
        CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$2222 = new CommonRequesterKt$requestMethodOnDefault$2(fVar22, n0Var22, lfxVarArr22, null);
        kPassportUiApiImpl$showVpnBlockerIfNeeded$1.L$0 = this;
        kPassportUiApiImpl$showVpnBlockerIfNeeded$1.label = 2;
        obj2 = tje.k0(sjhVar222, commonRequesterKt$requestMethodOnDefault$2222, kPassportUiApiImpl$showVpnBlockerIfNeeded$1);
    }
}
