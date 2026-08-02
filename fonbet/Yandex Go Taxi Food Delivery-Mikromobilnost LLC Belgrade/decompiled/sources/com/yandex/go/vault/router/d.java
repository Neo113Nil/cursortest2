package com.yandex.go.vault.router;

import android.app.Activity;
import android.view.View;
import com.yandex.go.vault.data.VaultStoreApi;
import com.yandex.go.vault.flexsdk.descriptors.widget.actions.VaultStoreErrorScreenPayload;
import defpackage.a201;
import defpackage.b64;
import defpackage.el11;
import defpackage.fn21;
import defpackage.jcg;
import defpackage.k751;
import defpackage.kp50;
import defpackage.lg21;
import defpackage.mdh;
import defpackage.n751;
import defpackage.ny61;
import defpackage.op31;
import defpackage.q5z;
import defpackage.sag;
import defpackage.sjh;
import defpackage.t1w;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v331;
import defpackage.vf41;
import defpackage.vuu0;
import defpackage.w030;
import defpackage.w331;
import defpackage.wnt;
import defpackage.wpy0;
import defpackage.z231;
import java.util.WeakHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes14.dex */
public final class d extends com.yandex.go.navigation.modals.coroutines.a {
    public final Activity F;
    public final w030 G;
    public final com.yandex.go.vault.ui.a H;
    public final vf41 I;
    public final ru.yandex.taxi.am.token.a J;
    public final fn21 K;
    public final tt2 L;
    public final v331 M;
    public final z231 N;
    public final lg21 O;
    public final boolean P;

    public d(Activity activity, w030 w030Var, com.yandex.go.vault.ui.a aVar, vf41 vf41Var, ru.yandex.taxi.am.token.a aVar2, fn21 fn21Var, tt2 tt2Var, v331 v331Var, z231 z231Var, lg21 lg21Var) {
        super(null);
        this.F = activity;
        this.G = w030Var;
        this.H = aVar;
        this.I = vf41Var;
        this.J = aVar2;
        this.K = fn21Var;
        this.L = tt2Var;
        this.M = v331Var;
        this.N = z231Var;
        this.O = lg21Var;
        this.P = true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.G;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return this.P;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T(String str, w331 w331Var, ContinuationImpl continuationImpl) {
        VaultStoreRouter$createConfig$1 vaultStoreRouter$createConfig$1;
        int i;
        String str2;
        w331 w331Var2;
        String Hg;
        n751 a;
        t1w t1wVar;
        if (continuationImpl instanceof VaultStoreRouter$createConfig$1) {
            vaultStoreRouter$createConfig$1 = (VaultStoreRouter$createConfig$1) continuationImpl;
            int i2 = vaultStoreRouter$createConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vaultStoreRouter$createConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = vaultStoreRouter$createConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vaultStoreRouter$createConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.L.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    VaultStoreRouter$createConfig$oAuthToken$1 vaultStoreRouter$createConfig$oAuthToken$1 = new VaultStoreRouter$createConfig$oAuthToken$1(this, null);
                    vaultStoreRouter$createConfig$1.L$0 = str;
                    vaultStoreRouter$createConfig$1.L$1 = w331Var;
                    vaultStoreRouter$createConfig$1.label = 1;
                    obj = tje.k0(mdhVar, vaultStoreRouter$createConfig$oAuthToken$1, vaultStoreRouter$createConfig$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = str;
                    w331Var2 = w331Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w331Var2 = (w331) vaultStoreRouter$createConfig$1.L$1;
                    str2 = (String) vaultStoreRouter$createConfig$1.L$0;
                    kotlin.b.b(obj);
                }
                String str3 = (String) obj;
                wpy0 wpy0Var = new wpy0(21, this);
                a201 a201Var = this.M.a;
                VaultStoreApi vaultStoreApi = new VaultStoreApi(wpy0Var, (tt2) ((sag) a201Var.b).get(), (wnt) ((jcg) a201Var.c).get());
                CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
                aVar.b = str2;
                aVar.c = str3;
                aVar.b("X-YaTaxi-Authorization", kp50.h(str3));
                Hg = ((h) this.K).Hg();
                if (Hg == null) {
                    Hg = "";
                }
                aVar.b("X-YaTaxi-UserId", Hg);
                aVar.e = false;
                aVar.h = true;
                aVar.f = true;
                aVar.k = vaultStoreApi;
                View decorView = this.F.getWindow().getDecorView();
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                a = op31.a(decorView);
                if (a != null) {
                    k751 k751Var = a.a;
                    if (k751Var.q(2)) {
                        t1wVar = new t1w((k751Var.g(2).d / 2) + 8);
                        StringBuilder s = b64.s(t1wVar.a, t1wVar.c, "\n        document.documentElement.style.setProperty('--android-safe-area-inset-left', '", "px');\n        document.documentElement.style.setProperty('--android-safe-area-inset-right', '", "px');\n        document.documentElement.style.setProperty('--android-safe-area-inset-bottom', '");
                        s.append(t1wVar.g);
                        s.append("px');\n        document.documentElement.style.setProperty('--android-safe-area-inset-top', '");
                        s.append(t1wVar.b);
                        s.append("px');\n    ");
                        aVar.n.add(vuu0.c(s.toString()));
                        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
                        uiWebViewConfig.setShouldShowCloseButton(false);
                        uiWebViewConfig.setShouldShowToolbar(false);
                        uiWebViewConfig.setArrowHidden(false);
                        uiWebViewConfig.setBackStackAware(false);
                        uiWebViewConfig.setHasTitleFromWeb(true);
                        uiWebViewConfig.setSignalForLoaded(UiWebViewConfig.SignalForLoaded.OnCommitVisible.INSTANCE);
                        uiWebViewConfig.setCanDrag(false);
                        uiWebViewConfig.setModalViewMode(new UiWebViewConfig.Slideable(false, null, true, true, 2, null));
                        uiWebViewConfig.setAnimateOnAppearing(true);
                        uiWebViewConfig.setModalViewCornerRadius(new Float(32.0f));
                        uiWebViewConfig.setBackgroundColor(q5z.S(w331Var2.b.h));
                        return uiWebViewConfig;
                    }
                }
                t1wVar = new t1w(8);
                StringBuilder s2 = b64.s(t1wVar.a, t1wVar.c, "\n        document.documentElement.style.setProperty('--android-safe-area-inset-left', '", "px');\n        document.documentElement.style.setProperty('--android-safe-area-inset-right', '", "px');\n        document.documentElement.style.setProperty('--android-safe-area-inset-bottom', '");
                s2.append(t1wVar.g);
                s2.append("px');\n        document.documentElement.style.setProperty('--android-safe-area-inset-top', '");
                s2.append(t1wVar.b);
                s2.append("px');\n    ");
                aVar.n.add(vuu0.c(s2.toString()));
                UiWebViewConfig uiWebViewConfig2 = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
                uiWebViewConfig2.setShouldShowCloseButton(false);
                uiWebViewConfig2.setShouldShowToolbar(false);
                uiWebViewConfig2.setArrowHidden(false);
                uiWebViewConfig2.setBackStackAware(false);
                uiWebViewConfig2.setHasTitleFromWeb(true);
                uiWebViewConfig2.setSignalForLoaded(UiWebViewConfig.SignalForLoaded.OnCommitVisible.INSTANCE);
                uiWebViewConfig2.setCanDrag(false);
                uiWebViewConfig2.setModalViewMode(new UiWebViewConfig.Slideable(false, null, true, true, 2, null));
                uiWebViewConfig2.setAnimateOnAppearing(true);
                uiWebViewConfig2.setModalViewCornerRadius(new Float(32.0f));
                uiWebViewConfig2.setBackgroundColor(q5z.S(w331Var2.b.h));
                return uiWebViewConfig2;
            }
        }
        vaultStoreRouter$createConfig$1 = new VaultStoreRouter$createConfig$1(this, continuationImpl);
        Object obj2 = vaultStoreRouter$createConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vaultStoreRouter$createConfig$1.label;
        if (i != 0) {
        }
        String str32 = (String) obj2;
        wpy0 wpy0Var2 = new wpy0(21, this);
        a201 a201Var2 = this.M.a;
        VaultStoreApi vaultStoreApi2 = new VaultStoreApi(wpy0Var2, (tt2) ((sag) a201Var2.b).get(), (wnt) ((jcg) a201Var2.c).get());
        CoreWebViewConfig.a aVar2 = new CoreWebViewConfig.a();
        aVar2.b = str2;
        aVar2.c = str32;
        aVar2.b("X-YaTaxi-Authorization", kp50.h(str32));
        Hg = ((h) this.K).Hg();
        if (Hg == null) {
        }
        aVar2.b("X-YaTaxi-UserId", Hg);
        aVar2.e = false;
        aVar2.h = true;
        aVar2.f = true;
        aVar2.k = vaultStoreApi2;
        View decorView2 = this.F.getWindow().getDecorView();
        WeakHashMap weakHashMap2 = androidx.core.view.b.a;
        a = op31.a(decorView2);
        if (a != null) {
        }
        t1wVar = new t1w(8);
        StringBuilder s22 = b64.s(t1wVar.a, t1wVar.c, "\n        document.documentElement.style.setProperty('--android-safe-area-inset-left', '", "px');\n        document.documentElement.style.setProperty('--android-safe-area-inset-right', '", "px');\n        document.documentElement.style.setProperty('--android-safe-area-inset-bottom', '");
        s22.append(t1wVar.g);
        s22.append("px');\n        document.documentElement.style.setProperty('--android-safe-area-inset-top', '");
        s22.append(t1wVar.b);
        s22.append("px');\n    ");
        aVar2.n.add(vuu0.c(s22.toString()));
        UiWebViewConfig uiWebViewConfig22 = new UiWebViewConfig(aVar2.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
        uiWebViewConfig22.setShouldShowCloseButton(false);
        uiWebViewConfig22.setShouldShowToolbar(false);
        uiWebViewConfig22.setArrowHidden(false);
        uiWebViewConfig22.setBackStackAware(false);
        uiWebViewConfig22.setHasTitleFromWeb(true);
        uiWebViewConfig22.setSignalForLoaded(UiWebViewConfig.SignalForLoaded.OnCommitVisible.INSTANCE);
        uiWebViewConfig22.setCanDrag(false);
        uiWebViewConfig22.setModalViewMode(new UiWebViewConfig.Slideable(false, null, true, true, 2, null));
        uiWebViewConfig22.setAnimateOnAppearing(true);
        uiWebViewConfig22.setModalViewCornerRadius(new Float(32.0f));
        uiWebViewConfig22.setBackgroundColor(q5z.S(w331Var2.b.h));
        return uiWebViewConfig22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (r9.H.b(r11, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.go.navigation.modals.coroutines.a
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(w331 w331Var, ContinuationImpl continuationImpl) {
        VaultStoreRouter$provideModalView$1 vaultStoreRouter$provideModalView$1;
        Object obj;
        Object obj2;
        int i;
        vf41 vf41Var;
        if (continuationImpl instanceof VaultStoreRouter$provideModalView$1) {
            vaultStoreRouter$provideModalView$1 = (VaultStoreRouter$provideModalView$1) continuationImpl;
            int i2 = vaultStoreRouter$provideModalView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vaultStoreRouter$provideModalView$1.label = i2 - Integer.MIN_VALUE;
                obj = vaultStoreRouter$provideModalView$1.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vaultStoreRouter$provideModalView$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    VaultStoreErrorScreenPayload vaultStoreErrorScreenPayload = w331Var.b;
                    vaultStoreRouter$provideModalView$1.L$0 = w331Var;
                    vaultStoreRouter$provideModalView$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vf41 vf41Var2 = (vf41) vaultStoreRouter$provideModalView$1.L$1;
                        kotlin.b.b(obj);
                        vf41Var = vf41Var2;
                        return vf41.a(vf41Var, (UiWebViewConfig) obj, new el11(8, this), null, this.H, 188);
                    }
                    w331Var = (w331) vaultStoreRouter$provideModalView$1.L$0;
                    kotlin.b.b(obj);
                }
                String str = w331Var.a;
                vaultStoreRouter$provideModalView$1.L$0 = null;
                vf41 vf41Var3 = this.I;
                vaultStoreRouter$provideModalView$1.L$1 = vf41Var3;
                vaultStoreRouter$provideModalView$1.label = 2;
                obj = T(str, w331Var, vaultStoreRouter$provideModalView$1);
                if (obj != obj2) {
                    vf41Var = vf41Var3;
                    return vf41.a(vf41Var, (UiWebViewConfig) obj, new el11(8, this), null, this.H, 188);
                }
                return obj2;
            }
        }
        vaultStoreRouter$provideModalView$1 = new VaultStoreRouter$provideModalView$1(this, continuationImpl);
        obj = vaultStoreRouter$provideModalView$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vaultStoreRouter$provideModalView$1.label;
        if (i != 0) {
        }
        String str2 = w331Var.a;
        vaultStoreRouter$provideModalView$1.L$0 = null;
        vf41 vf41Var32 = this.I;
        vaultStoreRouter$provideModalView$1.L$1 = vf41Var32;
        vaultStoreRouter$provideModalView$1.label = 2;
        obj = T(str2, w331Var, vaultStoreRouter$provideModalView$1);
        if (obj != obj2) {
        }
        return obj2;
    }
}
