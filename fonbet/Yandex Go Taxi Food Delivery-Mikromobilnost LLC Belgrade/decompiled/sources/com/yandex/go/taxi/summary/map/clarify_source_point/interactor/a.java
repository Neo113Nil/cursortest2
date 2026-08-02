package com.yandex.go.taxi.summary.map.clarify_source_point.interactor;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.taxi.summary.map.clarify_source_point.experiments.ClarifyPointsOnMapExperiment;
import com.yandex.go.taxi.summary.map.clarify_source_point.experiments.PinIconDto;
import com.yandex.go.taxi.summary.map.clarify_source_point.experiments.PinStateDto;
import defpackage.d0c0;
import defpackage.d6z;
import defpackage.evu0;
import defpackage.g0c0;
import defpackage.jbh;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.qqo;
import defpackage.rqo;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.map.RouteOverlayIconHolder$special$$inlined$map$1$2$1;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class a {
    public static final /* synthetic */ int d = 0;
    public final tt2 a;
    public final e b;
    public final qqo c;

    static {
        com.yandex.go.taxi.summary.map.clarify_source_point.experiments.a aVar = ClarifyPointsOnMapExperiment.Companion;
    }

    public a(rqo rqoVar, tt2 tt2Var, e eVar) {
        this.a = tt2Var;
        this.b = eVar;
        this.c = ((jbh) rqoVar).c(new ClarifyPointsOnMapExperiment(254));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ClarifyPointsOnMapExperiment clarifyPointsOnMapExperiment, PinStateDto pinStateDto, ContinuationImpl continuationImpl) {
        ClarifyPointsOnMapInteractorImpl$mapPinState$1 clarifyPointsOnMapInteractorImpl$mapPinState$1;
        int i;
        String str;
        String str2;
        boolean z;
        String str3;
        boolean z2;
        aVar.getClass();
        if (continuationImpl instanceof ClarifyPointsOnMapInteractorImpl$mapPinState$1) {
            clarifyPointsOnMapInteractorImpl$mapPinState$1 = (ClarifyPointsOnMapInteractorImpl$mapPinState$1) continuationImpl;
            int i2 = clarifyPointsOnMapInteractorImpl$mapPinState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                clarifyPointsOnMapInteractorImpl$mapPinState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = clarifyPointsOnMapInteractorImpl$mapPinState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = clarifyPointsOnMapInteractorImpl$mapPinState$1.label;
                if (i != 0) {
                    b.b(obj);
                    String str4 = pinStateDto != null ? pinStateDto.a : null;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String Y = d6z.Y(clarifyPointsOnMapExperiment, str4);
                    if (evu0.J(Y)) {
                        Y = null;
                    }
                    if (pinStateDto == null || Y == null) {
                        return null;
                    }
                    String str5 = pinStateDto.b;
                    String Y2 = d6z.Y(clarifyPointsOnMapExperiment, str5 != null ? str5 : "");
                    boolean z3 = pinStateDto.c;
                    String str6 = pinStateDto.e;
                    boolean z4 = pinStateDto.d;
                    PinIconDto pinIconDto = pinStateDto.f;
                    clarifyPointsOnMapInteractorImpl$mapPinState$1.L$0 = null;
                    clarifyPointsOnMapInteractorImpl$mapPinState$1.L$1 = null;
                    clarifyPointsOnMapInteractorImpl$mapPinState$1.L$2 = null;
                    clarifyPointsOnMapInteractorImpl$mapPinState$1.L$3 = Y;
                    clarifyPointsOnMapInteractorImpl$mapPinState$1.L$4 = Y2;
                    clarifyPointsOnMapInteractorImpl$mapPinState$1.L$5 = str6;
                    clarifyPointsOnMapInteractorImpl$mapPinState$1.Z$0 = z3;
                    clarifyPointsOnMapInteractorImpl$mapPinState$1.Z$1 = z4;
                    clarifyPointsOnMapInteractorImpl$mapPinState$1.label = 1;
                    Object c = aVar.c(pinIconDto, clarifyPointsOnMapInteractorImpl$mapPinState$1);
                    if (c == obj2) {
                        return obj2;
                    }
                    str = Y2;
                    str2 = Y;
                    z = z3;
                    str3 = str6;
                    z2 = z4;
                    obj = c;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z5 = clarifyPointsOnMapInteractorImpl$mapPinState$1.Z$1;
                    boolean z6 = clarifyPointsOnMapInteractorImpl$mapPinState$1.Z$0;
                    String str7 = (String) clarifyPointsOnMapInteractorImpl$mapPinState$1.L$5;
                    String str8 = (String) clarifyPointsOnMapInteractorImpl$mapPinState$1.L$4;
                    String str9 = (String) clarifyPointsOnMapInteractorImpl$mapPinState$1.L$3;
                    b.b(obj);
                    z2 = z5;
                    z = z6;
                    str3 = str7;
                    str = str8;
                    str2 = str9;
                }
                return new g0c0(str2, str, str3, z, z2, (d0c0) obj);
            }
        }
        clarifyPointsOnMapInteractorImpl$mapPinState$1 = new ClarifyPointsOnMapInteractorImpl$mapPinState$1(aVar, continuationImpl);
        Object obj3 = clarifyPointsOnMapInteractorImpl$mapPinState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = clarifyPointsOnMapInteractorImpl$mapPinState$1.label;
        if (i != 0) {
        }
        return new g0c0(str2, str, str3, z, z2, (d0c0) obj3);
    }

    public final Object b(String str, RouteOverlayIconHolder$special$$inlined$map$1$2$1 routeOverlayIconHolder$special$$inlined$map$1$2$1) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new ClarifyPointsOnMapInteractorImpl$config$2(this, str, null), routeOverlayIconHolder$special$$inlined$map$1$2$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(PinIconDto pinIconDto, ContinuationImpl continuationImpl) {
        ClarifyPointsOnMapInteractorImpl$mapIcon$1 clarifyPointsOnMapInteractorImpl$mapIcon$1;
        int i;
        BitmapDrawable bitmapDrawable;
        if (continuationImpl instanceof ClarifyPointsOnMapInteractorImpl$mapIcon$1) {
            clarifyPointsOnMapInteractorImpl$mapIcon$1 = (ClarifyPointsOnMapInteractorImpl$mapIcon$1) continuationImpl;
            int i2 = clarifyPointsOnMapInteractorImpl$mapIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                clarifyPointsOnMapInteractorImpl$mapIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = clarifyPointsOnMapInteractorImpl$mapIcon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = clarifyPointsOnMapInteractorImpl$mapIcon$1.label;
                e eVar = this.b;
                if (i != 0) {
                    b.b(obj);
                    if (pinIconDto != null) {
                        String str = pinIconDto.a;
                        if (!evu0.J(str)) {
                            clarifyPointsOnMapInteractorImpl$mapIcon$1.L$0 = pinIconDto;
                            clarifyPointsOnMapInteractorImpl$mapIcon$1.label = 1;
                            obj = e.f(eVar, str, null, clarifyPointsOnMapInteractorImpl$mapIcon$1, 6);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pinIconDto = (PinIconDto) clarifyPointsOnMapInteractorImpl$mapIcon$1.L$0;
                b.b(obj);
                bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable != null) {
                    return new d0c0(bitmapDrawable, eVar.d(pinIconDto.b), eVar.v(pinIconDto.c));
                }
                return null;
            }
        }
        clarifyPointsOnMapInteractorImpl$mapIcon$1 = new ClarifyPointsOnMapInteractorImpl$mapIcon$1(this, continuationImpl);
        Object obj2 = clarifyPointsOnMapInteractorImpl$mapIcon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = clarifyPointsOnMapInteractorImpl$mapIcon$1.label;
        e eVar2 = this.b;
        if (i != 0) {
        }
        bitmapDrawable = (BitmapDrawable) obj2;
        if (bitmapDrawable != null) {
        }
        return null;
    }
}
