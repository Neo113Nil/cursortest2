package com.yandex.go.flex.common.router.web_view;

import android.content.Context;
import defpackage.ag41;
import defpackage.anr;
import defpackage.cne0;
import defpackage.cu41;
import defpackage.dnr;
import defpackage.enr;
import defpackage.ff41;
import defpackage.fn21;
import defpackage.fnr;
import defpackage.gf41;
import defpackage.h55;
import defpackage.i3y;
import defpackage.j5z;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.p7r0;
import defpackage.scg;
import defpackage.tje;
import defpackage.umr;
import defpackage.vaj;
import defpackage.xes0;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.deeplinks.f;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes12.dex */
public final class b extends h55 {
    public final Context D;
    public final gf41 E;
    public final ru.yandex.taxi.am.token.a F;
    public final fn21 G;
    public final j5z H;
    public final anr I;
    public final xes0 J;
    public final o K;
    public final p7r0 L;
    public final umr M;
    public final f N;
    public final vaj O;
    public final i3y P;
    public SimpleSpinnerModalView Q;

    public b(Context context, gf41 gf41Var, ru.yandex.taxi.am.token.a aVar, fn21 fn21Var, j5z j5zVar, anr anrVar, xes0 xes0Var, o oVar, p7r0 p7r0Var, umr umrVar, f fVar, vaj vajVar) {
        super(null);
        this.D = context;
        this.E = gf41Var;
        this.F = aVar;
        this.G = fn21Var;
        this.H = j5zVar;
        this.I = anrVar;
        this.J = xes0Var;
        this.K = oVar;
        this.L = p7r0Var;
        this.M = umrVar;
        this.N = fVar;
        this.O = vajVar;
        this.P = kotlin.a.b(LazyThreadSafetyMode.NONE, new dnr(0, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(b bVar, enr enrVar, ContinuationImpl continuationImpl) {
        FlexWebViewRouter$refreshToken$1 flexWebViewRouter$refreshToken$1;
        int i;
        Object d;
        bVar.getClass();
        if (continuationImpl instanceof FlexWebViewRouter$refreshToken$1) {
            flexWebViewRouter$refreshToken$1 = (FlexWebViewRouter$refreshToken$1) continuationImpl;
            int i2 = flexWebViewRouter$refreshToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flexWebViewRouter$refreshToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = flexWebViewRouter$refreshToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flexWebViewRouter$refreshToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ((ag41) ((scg) bVar.R()).a()).c(cu41.b);
                    ru.yandex.taxi.am.token.a aVar = bVar.F;
                    flexWebViewRouter$refreshToken$1.L$0 = enrVar;
                    flexWebViewRouter$refreshToken$1.label = 1;
                    d = aVar.d(false, flexWebViewRouter$refreshToken$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    enrVar = (enr) flexWebViewRouter$refreshToken$1.L$0;
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                }
                if (!(d instanceof Result.Failure)) {
                    ag41 ag41Var = (ag41) ((scg) bVar.R()).a();
                    ag41Var.c(cu41.c);
                    ag41Var.a(bVar.Q(enrVar.a, enrVar.b, (fnr) bVar.n()));
                }
                if (Result.a(d) != null) {
                    ((ag41) ((scg) bVar.R()).a()).c(cu41.d);
                }
                return zy11.a;
            }
        }
        flexWebViewRouter$refreshToken$1 = new FlexWebViewRouter$refreshToken$1(bVar, continuationImpl);
        Object obj2 = flexWebViewRouter$refreshToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flexWebViewRouter$refreshToken$1.label;
        if (i != 0) {
        }
        if (!(d instanceof Result.Failure)) {
        }
        if (Result.a(d) != null) {
        }
        return zy11.a;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        SimpleSpinnerModalView simpleSpinnerModalView = this.Q;
        if (simpleSpinnerModalView != null) {
            simpleSpinnerModalView.dismiss();
        }
        this.Q = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new FlexWebViewRouter$onLaunch$1(this, (fnr) obj, null), 3);
    }

    public final UiWebViewConfig Q(String str, FlexWebApi flexWebApi, fnr fnrVar) {
        String c = this.F.c();
        CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
        aVar.b = str;
        aVar.c = c;
        aVar.h = true;
        aVar.f = true;
        aVar.k = flexWebApi;
        aVar.b("Accept-Language", this.H.d());
        aVar.b("Authorization", kp50.h(c));
        String Hg = ((h) this.G).Hg();
        if (Hg == null) {
            Hg = "";
        }
        aVar.b("X-YaTaxi-UserId", Hg);
        String l = ((cne0) ((h) this.O).b).l(MetaDataField.DEVICE_ID_FIELD, null);
        aVar.b("X-Taxi-DeviceId", l != null ? l : "");
        aVar.b("X-Timestamp", String.valueOf(System.currentTimeMillis()));
        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
        uiWebViewConfig.setShouldShowToolbar(false);
        uiWebViewConfig.setBackStackAware(true);
        uiWebViewConfig.setSignalForLoaded(UiWebViewConfig.SignalForLoaded.External.INSTANCE);
        uiWebViewConfig.setModalViewMode(new UiWebViewConfig.Slideable(false, null, !fnrVar.e, false, 10, null));
        uiWebViewConfig.setAnimateOnAppearing(true);
        uiWebViewConfig.setCanDrag(false);
        uiWebViewConfig.setArrowHidden(true);
        return uiWebViewConfig;
    }

    public final ff41 R() {
        return (ff41) this.P.getValue();
    }
}
