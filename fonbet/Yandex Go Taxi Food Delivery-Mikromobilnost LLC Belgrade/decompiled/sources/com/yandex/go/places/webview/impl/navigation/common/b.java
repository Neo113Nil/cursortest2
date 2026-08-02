package com.yandex.go.places.webview.impl.navigation.common;

import com.yandex.go.places.webview.impl.navigation.PlacesWebJsApi;
import defpackage.ag41;
import defpackage.cu41;
import defpackage.f02;
import defpackage.ff41;
import defpackage.fn21;
import defpackage.gf41;
import defpackage.h55;
import defpackage.hf41;
import defpackage.i3y;
import defpackage.j5z;
import defpackage.kp50;
import defpackage.ngc0;
import defpackage.ny61;
import defpackage.scg;
import defpackage.tje;
import defpackage.ugc0;
import defpackage.xes0;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.AuthType;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes13.dex */
public abstract class b extends h55 {
    public boolean D;
    public SimpleSpinnerModalView E;
    public final i3y F;

    public b() {
        super(null);
        this.F = kotlin.a.b(LazyThreadSafetyMode.NONE, new f02(29, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(b bVar, hf41 hf41Var, ContinuationImpl continuationImpl) {
        BasePlacesWebRouter$refreshToken$1 basePlacesWebRouter$refreshToken$1;
        int i;
        Object d;
        bVar.getClass();
        if (continuationImpl instanceof BasePlacesWebRouter$refreshToken$1) {
            basePlacesWebRouter$refreshToken$1 = (BasePlacesWebRouter$refreshToken$1) continuationImpl;
            int i2 = basePlacesWebRouter$refreshToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                basePlacesWebRouter$refreshToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = basePlacesWebRouter$refreshToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = basePlacesWebRouter$refreshToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ((ag41) ((scg) bVar.X()).a()).c(cu41.b);
                    ru.yandex.taxi.am.token.a R = bVar.R();
                    basePlacesWebRouter$refreshToken$1.L$0 = hf41Var;
                    basePlacesWebRouter$refreshToken$1.label = 1;
                    d = R.d(false, basePlacesWebRouter$refreshToken$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hf41Var = (hf41) basePlacesWebRouter$refreshToken$1.L$0;
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                }
                if (!(d instanceof Result.Failure)) {
                    ag41 ag41Var = (ag41) ((scg) bVar.X()).a();
                    ag41Var.c(cu41.c);
                    ag41Var.a(bVar.Q(hf41Var.a, hf41Var.b, hf41Var.c));
                }
                if (Result.a(d) != null) {
                    ((ag41) ((scg) bVar.X()).a()).c(cu41.d);
                }
                return zy11.a;
            }
        }
        basePlacesWebRouter$refreshToken$1 = new BasePlacesWebRouter$refreshToken$1(bVar, continuationImpl);
        Object obj2 = basePlacesWebRouter$refreshToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = basePlacesWebRouter$refreshToken$1.label;
        if (i != 0) {
        }
        if (!(d instanceof Result.Failure)) {
        }
        if (Result.a(d) != null) {
        }
        return zy11.a;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new BasePlacesWebRouter$onLaunch$1(this, (ugc0) obj, null), 3);
        this.D = false;
    }

    public final UiWebViewConfig Q(String str, AuthType authType, PlacesWebJsApi placesWebJsApi) {
        String c = R().c();
        CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
        aVar.h = true;
        aVar.k = placesWebJsApi;
        aVar.b("Accept-Language", T().d());
        aVar.b = str;
        if (authType == AuthType.OAUTH) {
            aVar.c = c;
            aVar.b("Authorization", kp50.h(c));
            String Hg = ((h) V()).Hg();
            if (Hg == null) {
                Hg = "";
            }
            aVar.b("X-YaTaxi-UserId", Hg);
        }
        ugc0 ugc0Var = (ugc0) this.x;
        boolean z = ugc0Var != null ? ugc0Var.c : true;
        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
        uiWebViewConfig.setShouldShowToolbar(false);
        uiWebViewConfig.setBackStackAware(true);
        uiWebViewConfig.setSignalForLoaded(UiWebViewConfig.SignalForLoaded.External.INSTANCE);
        uiWebViewConfig.setModalViewMode(z ? UiWebViewConfig.Fullscreen.INSTANCE : new UiWebViewConfig.Slideable(false, null, false, false, 14, null));
        uiWebViewConfig.setAnimateOnAppearing(true);
        uiWebViewConfig.setCanDrag(false);
        uiWebViewConfig.setArrowHidden(true);
        return uiWebViewConfig;
    }

    public abstract ru.yandex.taxi.am.token.a R();

    public abstract o S();

    public abstract j5z T();

    public abstract xes0 U();

    public abstract fn21 V();

    public abstract ngc0 W();

    public final ff41 X() {
        return (ff41) this.F.getValue();
    }

    public abstract gf41 Y();

    @Override // defpackage.h55
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void I(ugc0 ugc0Var) {
        SimpleSpinnerModalView simpleSpinnerModalView = this.E;
        if (simpleSpinnerModalView != null) {
            simpleSpinnerModalView.dismiss();
        }
        this.E = null;
    }

    public abstract void a0(hf41 hf41Var, a aVar);
}
