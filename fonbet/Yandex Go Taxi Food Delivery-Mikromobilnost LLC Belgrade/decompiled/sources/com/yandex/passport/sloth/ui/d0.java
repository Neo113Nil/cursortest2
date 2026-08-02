package com.yandex.passport.sloth.ui;

import android.app.Activity;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.Lifecycle;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.tasks.zzw;
import com.whatsapp.otp.android.sdk.enums.WhatsAppClientType;
import com.yandex.passport.common.core.FrontendUrlType;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.sloth.SlothMetricaEvent$PhoneNumberHintState;
import com.yandex.passport.sloth.ui.SlothJsApi;
import com.yandex.passport.sloth.ui.webview.WebViewController;
import defpackage.a4b1;
import defpackage.bvf0;
import defpackage.dtx0;
import defpackage.eja1;
import defpackage.ffx;
import defpackage.g8e;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k50;
import defpackage.ny61;
import defpackage.pey;
import defpackage.rs11;
import defpackage.s50;
import defpackage.sls;
import defpackage.st41;
import defpackage.tje;
import defpackage.u40;
import defpackage.w511;
import defpackage.zw41;
import defpackage.zy11;
import java.io.Serializable;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class d0 extends com.lightside.slab.a implements pey {
    public final Activity E;
    public final t0 F;
    public final SlothJsApi G;
    public final com.yandex.passport.sloth.ui.string.a H;
    public final g2 I;
    public final com.yandex.passport.sloth.ui.dependencies.d J;
    public final com.yandex.passport.internal.ui.challenge.vpn.o K;
    public final com.yandex.passport.sloth.ui.webview.o L;
    public final c1 M;
    public final r N;
    public final com.yandex.passport.common.common.a O;
    public final com.yandex.passport.sloth.ui.dependencies.p P;
    public final st41 Q;
    public final com.yandex.passport.sloth.dependencies.h R;
    public final i3y S = kotlin.a.a(new x(this, 2));
    public final kotlinx.coroutines.flow.n0 T = ffx.c(0, 0, null, 7);
    public final i3y U = kotlin.a.a(new x(this, 3));
    public final s50 V = (s50) registerForActivityResult(new k50(), new u40() { // from class: com.yandex.passport.sloth.ui.z
        @Override // defpackage.u40
        public final void a(Object obj) {
            d0 d0Var = d0.this;
            c1 c1Var = d0Var.M;
            try {
                tje.N(d0Var, null, null, new SlothSlab$phoneNumberHintIntentResultLauncher$1$1(d0Var, a4b1.a(d0Var.E).e(((ActivityResult) obj).getData()), null), 3);
                c1Var.a(new com.yandex.passport.sloth.n0(SlothMetricaEvent$PhoneNumberHintState.SUCCESS, (String) null));
            } catch (Exception e) {
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.WARN, null, "Phone Number Hint launcher failed", e);
                }
                c1Var.a(new com.yandex.passport.sloth.n0(SlothMetricaEvent$PhoneNumberHintState.FAILED, e.getMessage()));
                tje.N(d0Var, null, null, new SlothSlab$phoneNumberHintIntentResultLauncher$1$3(d0Var, null), 3);
            }
        }
    });

    public d0(Activity activity, t0 t0Var, SlothJsApi slothJsApi, com.yandex.passport.sloth.ui.string.a aVar, g2 g2Var, com.yandex.passport.sloth.ui.dependencies.d dVar, com.yandex.passport.internal.ui.challenge.vpn.o oVar, com.yandex.passport.sloth.ui.webview.o oVar2, c1 c1Var, r rVar, com.yandex.passport.common.common.a aVar2, com.yandex.passport.sloth.ui.dependencies.p pVar, st41 st41Var, com.yandex.passport.sloth.dependencies.h hVar) {
        this.E = activity;
        this.F = t0Var;
        this.G = slothJsApi;
        this.H = aVar;
        this.I = g2Var;
        this.J = dVar;
        this.K = oVar;
        this.L = oVar2;
        this.M = c1Var;
        this.N = rVar;
        this.O = aVar2;
        this.P = pVar;
        this.Q = st41Var;
        this.R = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(final d0 d0Var, b1 b1Var, com.yandex.passport.sloth.u uVar, Continuation continuation) {
        SlothSlab$processEvent$1 slothSlab$processEvent$1;
        int i;
        c1 c1Var = d0Var.M;
        Activity activity = d0Var.E;
        if (continuation instanceof SlothSlab$processEvent$1) {
            slothSlab$processEvent$1 = (SlothSlab$processEvent$1) continuation;
            int i2 = slothSlab$processEvent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothSlab$processEvent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slothSlab$processEvent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothSlab$processEvent$1.label;
                int i3 = 2;
                int i4 = 1;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (jl40.l(uVar, com.yandex.passport.sloth.s.a)) {
                        new com.yandex.passport.internal.util.h(((com.yandex.passport.internal.ui.sloth.g) d0Var.J).a).b(activity);
                        return zy11Var;
                    }
                    if (uVar instanceof com.yandex.passport.sloth.n) {
                        d0Var.p().blockOnLoadingState(((com.yandex.passport.sloth.n) uVar).a);
                        return zy11Var;
                    }
                    if (uVar instanceof com.yandex.passport.sloth.t) {
                        com.yandex.passport.sloth.t tVar = (com.yandex.passport.sloth.t) uVar;
                        slothSlab$processEvent$1.label = 1;
                        GetPhoneNumberHintIntentRequest.builder().getClass();
                        GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest = new GetPhoneNumberHintIntentRequest(0);
                        tje.N(bvf0.a(slothSlab$processEvent$1.get_context()), null, null, new SlothSlab$showPhoneNumber$$inlined$collectOn$1(d0Var.T, null, tVar), 3);
                        try {
                            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Phone Number Hint started", 8);
                            }
                            c1Var.a(new com.yandex.passport.sloth.n0(SlothMetricaEvent$PhoneNumberHintState.STARTED, (String) null));
                            zzw f = a4b1.a(activity).f(getPhoneNumberHintIntentRequest);
                            f fVar = new f(i4, new e(i3, d0Var));
                            f.getClass();
                            f.g(dtx0.a, fVar);
                            f.d(new g(i4, d0Var, tVar));
                        } catch (Exception e) {
                            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.b(LogLevel.WARN, null, "Phone Number Hint failed", e);
                            }
                            c1Var.a(new com.yandex.passport.sloth.n0(SlothMetricaEvent$PhoneNumberHintState.FAILED, e.getMessage()));
                            tVar.a.invoke(null);
                        }
                        if (zy11Var == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return zy11Var;
                    }
                    if (uVar instanceof com.yandex.passport.sloth.o) {
                        com.yandex.passport.sloth.o oVar = (com.yandex.passport.sloth.o) uVar;
                        if (!oVar.b) {
                            x0 x0Var = new x0(true);
                            slothSlab$processEvent$1.label = 3;
                            if (((com.yandex.passport.sloth.b1) b1Var).f(x0Var, slothSlab$processEvent$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (oVar.a) {
                                t0 t0Var = d0Var.F;
                                final com.yandex.passport.sloth.b1 b1Var2 = (com.yandex.passport.sloth.b1) b1Var;
                                b1Var2.c();
                                t0Var.e(new sls() { // from class: com.yandex.passport.sloth.ui.a0
                                    @Override // defpackage.sls
                                    public final Object invoke() {
                                        tje.N(d0.this, null, null, new SlothSlab$processEvent$2$1(b1Var2, null), 3);
                                        return zy11.a;
                                    }
                                });
                                return zy11Var;
                            }
                            x0 x0Var2 = new x0(false);
                            slothSlab$processEvent$1.label = 2;
                            if (((com.yandex.passport.sloth.b1) b1Var).f(x0Var2, slothSlab$processEvent$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else if (uVar instanceof com.yandex.passport.sloth.q) {
                        if (((com.yandex.passport.sloth.q) uVar).a) {
                            d0Var.p().onJsApiReady();
                            return zy11Var;
                        }
                    } else {
                        if (!(uVar instanceof com.yandex.passport.sloth.p)) {
                            if (uVar instanceof com.yandex.passport.sloth.r) {
                                return zy11Var;
                            }
                            w511.b();
                            return null;
                        }
                        com.yandex.passport.sloth.p pVar = (com.yandex.passport.sloth.p) uVar;
                        com.yandex.passport.sloth.b1 b1Var3 = (com.yandex.passport.sloth.b1) b1Var;
                        if ((b1Var3.a instanceof com.yandex.passport.sloth.data.r) && !pVar.c) {
                            Map z = g8e.z("url", pVar.a);
                            b1 b1Var4 = c1Var.a;
                            if (b1Var4 != null) {
                                com.yandex.passport.internal.sloth.m mVar = (com.yandex.passport.internal.sloth.m) ((com.yandex.passport.sloth.b1) b1Var4).b.B.a;
                                if (mVar.a()) {
                                    mVar.a.a("pay.processing_open_browser_without_redirect", z);
                                }
                            } else {
                                com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "interactor is not ready", 8);
                                }
                            }
                        }
                        com.yandex.passport.sloth.data.c0 c0Var = b1Var3.a;
                        slothSlab$processEvent$1.L$0 = d0Var;
                        slothSlab$processEvent$1.L$1 = uVar;
                        slothSlab$processEvent$1.label = 4;
                        if (d0Var.q(pVar, c0Var, slothSlab$processEvent$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (((com.yandex.passport.sloth.p) uVar).c) {
                        }
                    }
                } else {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    if (i == 3) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uVar = (com.yandex.passport.sloth.u) slothSlab$processEvent$1.L$1;
                    d0Var = (d0) slothSlab$processEvent$1.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                    if (((com.yandex.passport.sloth.p) uVar).c) {
                        d0Var.I.a(SlothUiWish.CANCEL);
                    }
                }
                return zy11Var;
            }
        }
        slothSlab$processEvent$1 = new SlothSlab$processEvent$1(d0Var, continuation);
        Object obj2 = slothSlab$processEvent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothSlab$processEvent$1.label;
        int i32 = 2;
        int i42 = 1;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        return zy11Var2;
    }

    @Override // defpackage.ins0
    public final void g() {
        super.g();
        o().g(Lifecycle.Event.ON_CREATE);
    }

    @Override // defpackage.pey
    public final Lifecycle getLifecycle() {
        return o();
    }

    @Override // defpackage.ins0
    public final void h() {
        super.h();
        o().g(Lifecycle.Event.ON_DESTROY);
    }

    @Override // defpackage.nt11
    public final rs11 l() {
        return this.F.a;
    }

    public final androidx.lifecycle.t o() {
        return (androidx.lifecycle.t) this.S.getValue();
    }

    @Override // defpackage.ins0, defpackage.lns0
    public final void onPause() {
        super.onPause();
        o().g(Lifecycle.Event.ON_PAUSE);
    }

    @Override // defpackage.ins0, defpackage.lns0
    public final void onResume() {
        super.onResume();
        o().g(Lifecycle.Event.ON_RESUME);
    }

    @Override // defpackage.ins0, defpackage.lns0
    public final void onStart() {
        super.onStart();
        o().g(Lifecycle.Event.ON_START);
    }

    @Override // defpackage.ins0, defpackage.lns0
    public final void onStop() {
        super.onStop();
        o().g(Lifecycle.Event.ON_STOP);
    }

    public final WebViewController p() {
        return (WebViewController) this.U.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable q(com.yandex.passport.sloth.p pVar, com.yandex.passport.sloth.data.c0 c0Var, ContinuationImpl continuationImpl) {
        SlothSlab$openExternalUrl$1 slothSlab$openExternalUrl$1;
        int i;
        Uid uid;
        String str;
        Object d;
        com.yandex.passport.sloth.p pVar2;
        Serializable d2;
        Throwable a;
        if (continuationImpl instanceof SlothSlab$openExternalUrl$1) {
            slothSlab$openExternalUrl$1 = (SlothSlab$openExternalUrl$1) continuationImpl;
            int i2 = slothSlab$openExternalUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothSlab$openExternalUrl$1.label = i2 - Integer.MIN_VALUE;
                SlothSlab$openExternalUrl$1 slothSlab$openExternalUrl$12 = slothSlab$openExternalUrl$1;
                Object obj = slothSlab$openExternalUrl$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothSlab$openExternalUrl$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    uid = c0Var instanceof com.yandex.passport.sloth.data.f ? ((com.yandex.passport.sloth.data.f) c0Var).getUid() : null;
                    FrontendUrlType frontendUrlType = ((c0Var instanceof com.yandex.passport.sloth.data.i) || (c0Var instanceof com.yandex.passport.sloth.data.q)) ? FrontendUrlType.ID : FrontendUrlType.PASSPORT;
                    if (!pVar.b || uid == null) {
                        str = pVar.a;
                        Uri uri = com.yandex.passport.common.browser.c.a;
                        Activity activity = this.E;
                        c1 c1Var = this.M;
                        d2 = com.yandex.passport.common.browser.c.d(activity, str);
                        if (!(d2 instanceof Result.Failure)) {
                            c1Var.a(new com.yandex.passport.sloth.n0(pVar, true, (String) d2, uid != null ? new Long(uid.getValue()) : null));
                        }
                        if (Result.a(d2) == null) {
                            return d2;
                        }
                        c1Var.a(new com.yandex.passport.sloth.n0(pVar, false, null, uid != null ? new Long(uid.getValue()) : null));
                        return d2;
                    }
                    String str2 = pVar.a;
                    slothSlab$openExternalUrl$12.L$0 = this;
                    slothSlab$openExternalUrl$12.L$1 = pVar;
                    slothSlab$openExternalUrl$12.L$2 = pVar;
                    slothSlab$openExternalUrl$12.L$3 = uid;
                    slothSlab$openExternalUrl$12.label = 1;
                    d = ((com.yandex.passport.internal.sloth.o) this.R).d(uid, null, str2, frontendUrlType, slothSlab$openExternalUrl$12);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    pVar2 = pVar;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Uid uid2 = (Uid) slothSlab$openExternalUrl$12.L$3;
                    pVar = (com.yandex.passport.sloth.p) slothSlab$openExternalUrl$12.L$2;
                    pVar2 = (com.yandex.passport.sloth.p) slothSlab$openExternalUrl$12.L$1;
                    d0 d0Var = (d0) slothSlab$openExternalUrl$12.L$0;
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                    uid = uid2;
                    this = d0Var;
                }
                a = Result.a(d);
                if (a != null) {
                    this.M.a(new com.yandex.passport.sloth.n0(String.valueOf(a.getMessage()), new Pair("uid", String.valueOf(uid.getValue())), new Pair("place", "getAuthorizationUrl in openExternalUrl")));
                }
                if (d instanceof Result.Failure) {
                    d = null;
                }
                com.yandex.passport.common.url.b bVar = (com.yandex.passport.common.url.b) d;
                str = bVar == null ? bVar.a : null;
                if (str == null) {
                    str = pVar.a;
                }
                pVar = pVar2;
                Uri uri2 = com.yandex.passport.common.browser.c.a;
                Activity activity2 = this.E;
                c1 c1Var2 = this.M;
                d2 = com.yandex.passport.common.browser.c.d(activity2, str);
                if (!(d2 instanceof Result.Failure)) {
                }
                if (Result.a(d2) == null) {
                }
            }
        }
        slothSlab$openExternalUrl$1 = new SlothSlab$openExternalUrl$1(this, continuationImpl);
        SlothSlab$openExternalUrl$1 slothSlab$openExternalUrl$122 = slothSlab$openExternalUrl$1;
        Object obj2 = slothSlab$openExternalUrl$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothSlab$openExternalUrl$122.label;
        if (i != 0) {
        }
        a = Result.a(d);
        if (a != null) {
        }
        if (d instanceof Result.Failure) {
        }
        com.yandex.passport.common.url.b bVar2 = (com.yandex.passport.common.url.b) d;
        if (bVar2 == null) {
        }
        if (str == null) {
        }
        pVar = pVar2;
        Uri uri22 = com.yandex.passport.common.browser.c.a;
        Activity activity22 = this.E;
        c1 c1Var22 = this.M;
        d2 = com.yandex.passport.common.browser.c.d(activity22, str);
        if (!(d2 instanceof Result.Failure)) {
        }
        if (Result.a(d2) == null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|1|(2:3|(14:5|6|7|(1:(1:10)(2:42|43))(2:44|(1:46)(1:47))|11|12|13|14|15|16|17|18|(1:(2:21|(1:23))(2:26|27))(2:28|(1:30))|24))|48|6|7|(0)(0)|11|12|13|14|15|16|17|18|(0)(0)|24|(1:(1:35))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010d, code lost:
    
        r0.getPackageManager().getPackageInfo(com.whatsapp.otp.android.sdk.enums.WhatsAppClientType.BUSINESS.a(), 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011a, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x016c, code lost:
    
        r2.a(new com.yandex.passport.sloth.n0("send_otp_intent_to_whats_app", new kotlin.Pair("error_message", java.lang.String.valueOf(r0.getMessage()))));
        r1 = com.yandex.passport.common.logger.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x018d, code lost:
    
        if (com.yandex.passport.common.logger.a.a.isEnabled() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x018f, code lost:
    
        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.LogLevel.DEBUG, null, "Failed sendOtpIntentToWhatsApp", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0147 A[Catch: Exception -> 0x013d, TryCatch #1 {Exception -> 0x013d, blocks: (B:13:0x00f7, B:16:0x00ff, B:21:0x0121, B:23:0x0135, B:26:0x013f, B:27:0x0146, B:28:0x0147, B:30:0x0164, B:32:0x010b, B:34:0x010d), top: B:12:0x00f7, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @Override // com.lightside.slab.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(u0 u0Var, ContinuationImpl continuationImpl) {
        SlothSlab$performBind$1 slothSlab$performBind$1;
        int i;
        d0 d0Var;
        boolean z;
        if (continuationImpl instanceof SlothSlab$performBind$1) {
            slothSlab$performBind$1 = (SlothSlab$performBind$1) continuationImpl;
            int i2 = slothSlab$performBind$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothSlab$performBind$1.label = i2 - Integer.MIN_VALUE;
                SlothSlab$performBind$1 slothSlab$performBind$12 = slothSlab$performBind$1;
                Object obj = slothSlab$performBind$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothSlab$performBind$12.label;
                zy11 zy11Var = zy11.a;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b1 b1Var = u0Var.a;
                    this.M.a = b1Var;
                    tje.N(eja1.s(this), null, null, new SlothSlab$networkStatusObserver$$inlined$collectOn$1(((com.yandex.passport.internal.sloth.l) this.N).a, null, this), 3);
                    WebViewController p = p();
                    p.setVariant(((com.yandex.passport.sloth.b1) b1Var).a);
                    p.onInterceptUrl(new y(b1Var, this));
                    p.onInterceptRequest(new e(i3, b1Var));
                    p.onError(new y(this, b1Var));
                    p.onCancel(new SlothSlab$performBind$2$4(0, this, d0.class, "closeSloth", "closeSloth()V", 0));
                    com.yandex.passport.sloth.b1 b1Var2 = (com.yandex.passport.sloth.b1) b1Var;
                    tje.N(bvf0.a(slothSlab$performBind$12.get_context()), null, null, new SlothSlab$performBind$$inlined$collectOn$1(b1Var2.b(), null, this, b1Var), 3);
                    tje.N(bvf0.a(slothSlab$performBind$12.get_context()), null, null, new SlothSlab$performBind$$inlined$collectOn$2(b1Var2.b.c.b, null, this), 3);
                    WebViewController p2 = p();
                    slothSlab$performBind$12.L$0 = this;
                    slothSlab$performBind$12.label = 1;
                    this.G.getClass();
                    p2.addJavascriptInterface(new SlothJsApi.WebAmJsInterface(bvf0.a(slothSlab$performBind$12.get_context()), b1Var, p2), "nativeAMAndroid");
                    if (zy11Var == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    d0Var = this;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d0Var = (d0) slothSlab$performBind$12.L$0;
                    kotlin.b.b(obj);
                }
                t0 t0Var = d0Var.F;
                c1 c1Var = d0Var.M;
                t0Var.d = new x(d0Var, 1);
                Activity activity = d0Var.E;
                zw41 zw41Var = new zw41();
                activity.getPackageManager().getPackageInfo(WhatsAppClientType.CONSUMER.a(), 0);
                z = true;
                if (z) {
                    c1Var.a(new com.yandex.passport.sloth.n0("send_otp_intent_to_whats_app", new Pair("error_message", "whatsapp_is_not_installed")));
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Failed sendOtpIntentToWhatsApp: WhatsApp is not installed", 8);
                    }
                } else {
                    if (activity == null) {
                        throw new NullPointerException("Context cannot be null");
                    }
                    zw41Var.a(activity, WhatsAppClientType.CONSUMER);
                    zw41Var.a(activity, WhatsAppClientType.BUSINESS);
                    com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Success sendOtpIntentToWhatsApp", 8);
                    }
                }
                return zy11Var;
            }
        }
        slothSlab$performBind$1 = new SlothSlab$performBind$1(this, continuationImpl);
        SlothSlab$performBind$1 slothSlab$performBind$122 = slothSlab$performBind$1;
        Object obj2 = slothSlab$performBind$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothSlab$performBind$122.label;
        zy11 zy11Var2 = zy11.a;
        int i32 = 1;
        if (i != 0) {
        }
        t0 t0Var2 = d0Var.F;
        c1 c1Var2 = d0Var.M;
        t0Var2.d = new x(d0Var, 1);
        Activity activity2 = d0Var.E;
        zw41 zw41Var2 = new zw41();
        activity2.getPackageManager().getPackageInfo(WhatsAppClientType.CONSUMER.a(), 0);
        z = true;
        if (z) {
        }
        return zy11Var2;
    }
}
