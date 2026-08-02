package com.yandex.go.support.domain;

import android.app.Activity;
import defpackage.a2b;
import defpackage.bqc;
import defpackage.fqc;
import defpackage.gn10;
import defpackage.h15;
import defpackage.h3y;
import defpackage.h600;
import defpackage.hxx;
import defpackage.m950;
import defpackage.mdh;
import defpackage.nsv0;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.psv0;
import defpackage.sib1;
import defpackage.siw0;
import defpackage.sjh;
import defpackage.tiw0;
import defpackage.tje;
import defpackage.uyj;
import defpackage.v770;
import defpackage.yvf0;
import defpackage.z1b;
import defpackage.zoy0;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes8.dex */
public final class a extends a2b {
    public final Activity b;
    public final h15 c;
    public final com.yandex.go.lifecycle.a d;
    public final yvf0 e;
    public final yvf0 f;
    public final tiw0 g;
    public final h3y h;

    public a(Activity activity, h15 h15Var, com.yandex.go.lifecycle.a aVar, yvf0 yvf0Var, yvf0 yvf0Var2, tiw0 tiw0Var, h3y h3yVar) {
        this.b = activity;
        this.c = h15Var;
        this.d = aVar;
        this.e = yvf0Var;
        this.f = yvf0Var2;
        this.g = tiw0Var;
        this.h = h3yVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (z1b) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, z1b z1bVar, ContinuationImpl continuationImpl) {
        SupportDeeplinkHandler$handleDeeplink$1 supportDeeplinkHandler$handleDeeplink$1;
        int i;
        nsv0 c;
        String a;
        oep0 oep0Var2;
        nsv0 nsv0Var;
        UiWebViewConfig a2;
        oep0 oep0Var3;
        siw0 siw0Var;
        UiWebViewConfig uiWebViewConfig;
        if (continuationImpl instanceof SupportDeeplinkHandler$handleDeeplink$1) {
            supportDeeplinkHandler$handleDeeplink$1 = (SupportDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = supportDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                supportDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = supportDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = supportDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    b.b(obj);
                    c = sib1.c(z1bVar.c(), z1bVar.b());
                    a = z1bVar.a();
                    if (a == null) {
                        if (c != null) {
                            String value = c.b().getValue();
                            supportDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                            supportDeeplinkHandler$handleDeeplink$1.L$1 = z1bVar;
                            supportDeeplinkHandler$handleDeeplink$1.L$2 = null;
                            supportDeeplinkHandler$handleDeeplink$1.L$3 = null;
                            supportDeeplinkHandler$handleDeeplink$1.L$4 = c;
                            supportDeeplinkHandler$handleDeeplink$1.L$5 = null;
                            supportDeeplinkHandler$handleDeeplink$1.label = 1;
                            tiw0 tiw0Var = this.g;
                            tiw0Var.a.getClass();
                            sjh sjhVar = uyj.a;
                            Object k0 = tje.k0(mdh.b, new SupportChatDataInteractor$getBotGuidByServiceName$2(tiw0Var, value, null), supportDeeplinkHandler$handleDeeplink$1);
                            if (k0 != coroutineSingletons) {
                                oep0Var2 = oep0Var;
                                nsv0Var = c;
                                obj = k0;
                            }
                            return coroutineSingletons;
                        }
                        a = null;
                    }
                    if (c == null && a == null) {
                        ((pep0) oep0Var).f((m950) this.e.get(), new psv0(c.b(), c.a()), hxx.a);
                    } else {
                        a2 = ((gn10) this.h.get()).a(null, true);
                        if (a2 != null) {
                            String d = z1bVar.d();
                            fqc fqcVar = bqc.e;
                            if (d != null) {
                                try {
                                    fqcVar = zoy0.r(d, null);
                                } catch (IllegalArgumentException unused) {
                                }
                            }
                            siw0 siw0Var2 = new siw0(fqcVar, a);
                            supportDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                            supportDeeplinkHandler$handleDeeplink$1.L$1 = null;
                            supportDeeplinkHandler$handleDeeplink$1.L$2 = null;
                            supportDeeplinkHandler$handleDeeplink$1.L$3 = null;
                            supportDeeplinkHandler$handleDeeplink$1.L$4 = null;
                            supportDeeplinkHandler$handleDeeplink$1.L$5 = null;
                            supportDeeplinkHandler$handleDeeplink$1.L$6 = a2;
                            supportDeeplinkHandler$handleDeeplink$1.L$7 = null;
                            supportDeeplinkHandler$handleDeeplink$1.L$8 = siw0Var2;
                            supportDeeplinkHandler$handleDeeplink$1.label = 2;
                            if (this.d.a(supportDeeplinkHandler$handleDeeplink$1) != coroutineSingletons) {
                                oep0Var3 = oep0Var;
                                siw0Var = siw0Var2;
                                uiWebViewConfig = a2;
                                ((pep0) oep0Var3).f((m950) this.f.get(), new h600(uiWebViewConfig, siw0Var), hxx.a);
                            }
                            return coroutineSingletons;
                        }
                        this.c.a(this.b);
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    siw0Var = (siw0) supportDeeplinkHandler$handleDeeplink$1.L$8;
                    uiWebViewConfig = (UiWebViewConfig) supportDeeplinkHandler$handleDeeplink$1.L$6;
                    oep0Var3 = (oep0) supportDeeplinkHandler$handleDeeplink$1.L$0;
                    b.b(obj);
                    ((pep0) oep0Var3).f((m950) this.f.get(), new h600(uiWebViewConfig, siw0Var), hxx.a);
                    return zy11.a;
                }
                nsv0Var = (nsv0) supportDeeplinkHandler$handleDeeplink$1.L$4;
                z1bVar = (z1b) supportDeeplinkHandler$handleDeeplink$1.L$1;
                oep0Var2 = (oep0) supportDeeplinkHandler$handleDeeplink$1.L$0;
                b.b(obj);
                String str = (String) obj;
                c = nsv0Var;
                oep0Var = oep0Var2;
                a = str;
                if (c == null) {
                }
                a2 = ((gn10) this.h.get()).a(null, true);
                if (a2 != null) {
                }
            }
        }
        supportDeeplinkHandler$handleDeeplink$1 = new SupportDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj2 = supportDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = supportDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        String str2 = (String) obj2;
        c = nsv0Var;
        oep0Var = oep0Var2;
        a = str2;
        if (c == null) {
        }
        a2 = ((gn10) this.h.get()).a(null, true);
        if (a2 != null) {
        }
    }
}
