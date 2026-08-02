package com.yandex.go.scooters.offer_on_camera;

import com.yandex.go.scooters.offers.v2.g;
import defpackage.dpb;
import defpackage.h55;
import defpackage.i7n0;
import defpackage.m950;
import defpackage.ny61;
import defpackage.opo0;
import defpackage.r8c0;
import defpackage.tje;
import defpackage.v3o0;
import defpackage.v41;
import defpackage.xpo0;
import defpackage.yvf0;
import defpackage.zro0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;
import ru.yandex.taxi.scooters.data.q;

/* loaded from: classes13.dex */
public final class b extends h55 {
    public final yvf0 D;
    public final yvf0 E;
    public final MapNotificationsMuteRepository F;
    public final com.yandex.go.scooters.offer_on_camera.domain.a G;
    public final yvf0 H;
    public final xpo0 I;
    public final q J;
    public final i7n0 K;
    public g L;

    public b(yvf0 yvf0Var, yvf0 yvf0Var2, MapNotificationsMuteRepository mapNotificationsMuteRepository, com.yandex.go.scooters.offer_on_camera.domain.a aVar, yvf0 yvf0Var3, xpo0 xpo0Var, q qVar, i7n0 i7n0Var) {
        super(null);
        this.D = yvf0Var;
        this.E = yvf0Var2;
        this.F = mapNotificationsMuteRepository;
        this.G = aVar;
        this.H = yvf0Var3;
        this.I = xpo0Var;
        this.J = qVar;
        this.K = i7n0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(b bVar, v3o0 v3o0Var, ContinuationImpl continuationImpl) {
        ScootersOfferOnCameraRouter$onAttachSuspend$1 scootersOfferOnCameraRouter$onAttachSuspend$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object i2;
        v3o0 v3o0Var2;
        CharSequence charSequence;
        Object h;
        v3o0 v3o0Var3;
        q qVar = bVar.J;
        if (continuationImpl instanceof ScootersOfferOnCameraRouter$onAttachSuspend$1) {
            scootersOfferOnCameraRouter$onAttachSuspend$1 = (ScootersOfferOnCameraRouter$onAttachSuspend$1) continuationImpl;
            int i3 = scootersOfferOnCameraRouter$onAttachSuspend$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scootersOfferOnCameraRouter$onAttachSuspend$1.label = i3 - Integer.MIN_VALUE;
                ScootersOfferOnCameraRouter$onAttachSuspend$1 scootersOfferOnCameraRouter$onAttachSuspend$12 = scootersOfferOnCameraRouter$onAttachSuspend$1;
                Object obj = scootersOfferOnCameraRouter$onAttachSuspend$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOfferOnCameraRouter$onAttachSuspend$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersOfferOnCameraRouter$onAttachSuspend$12.L$0 = v3o0Var;
                    scootersOfferOnCameraRouter$onAttachSuspend$12.label = 1;
                    i2 = qVar.i(scootersOfferOnCameraRouter$onAttachSuspend$12);
                    if (i2 != coroutineSingletons) {
                        v3o0Var2 = v3o0Var;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    CharSequence charSequence2 = (CharSequence) scootersOfferOnCameraRouter$onAttachSuspend$12.L$1;
                    v3o0 v3o0Var4 = (v3o0) scootersOfferOnCameraRouter$onAttachSuspend$12.L$0;
                    kotlin.b.b(obj);
                    charSequence = charSequence2;
                    v3o0Var3 = v3o0Var4;
                    bVar.A((m950) bVar.H.get(), new zro0(null), new a(new r8c0(bVar, v3o0Var3, charSequence, (CharSequence) obj, 6), new ScootersOfferOnCameraRouter$onAttachSuspend$3(0, bVar, b.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0)));
                    scootersOfferOnCameraRouter$onAttachSuspend$12.L$0 = null;
                    scootersOfferOnCameraRouter$onAttachSuspend$12.L$1 = null;
                    scootersOfferOnCameraRouter$onAttachSuspend$12.L$2 = null;
                    scootersOfferOnCameraRouter$onAttachSuspend$12.label = 3;
                    Object collect = bVar.G.b(v3o0Var3.b).collect(new v41(23, bVar), scootersOfferOnCameraRouter$onAttachSuspend$12);
                    return collect != coroutineSingletons ? coroutineSingletons : collect;
                }
                v3o0 v3o0Var5 = (v3o0) scootersOfferOnCameraRouter$onAttachSuspend$12.L$0;
                kotlin.b.b(obj);
                i2 = obj;
                v3o0Var2 = v3o0Var5;
                charSequence = (CharSequence) i2;
                scootersOfferOnCameraRouter$onAttachSuspend$12.L$0 = v3o0Var2;
                scootersOfferOnCameraRouter$onAttachSuspend$12.L$1 = charSequence;
                scootersOfferOnCameraRouter$onAttachSuspend$12.label = 2;
                h = qVar.h(scootersOfferOnCameraRouter$onAttachSuspend$12);
                if (h != coroutineSingletons) {
                    v3o0Var3 = v3o0Var2;
                    obj = h;
                    bVar.A((m950) bVar.H.get(), new zro0(null), new a(new r8c0(bVar, v3o0Var3, charSequence, (CharSequence) obj, 6), new ScootersOfferOnCameraRouter$onAttachSuspend$3(0, bVar, b.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0)));
                    scootersOfferOnCameraRouter$onAttachSuspend$12.L$0 = null;
                    scootersOfferOnCameraRouter$onAttachSuspend$12.L$1 = null;
                    scootersOfferOnCameraRouter$onAttachSuspend$12.L$2 = null;
                    scootersOfferOnCameraRouter$onAttachSuspend$12.label = 3;
                    Object collect2 = bVar.G.b(v3o0Var3.b).collect(new v41(23, bVar), scootersOfferOnCameraRouter$onAttachSuspend$12);
                    if (collect2 != coroutineSingletons) {
                    }
                }
            }
        }
        scootersOfferOnCameraRouter$onAttachSuspend$1 = new ScootersOfferOnCameraRouter$onAttachSuspend$1(bVar, continuationImpl);
        ScootersOfferOnCameraRouter$onAttachSuspend$1 scootersOfferOnCameraRouter$onAttachSuspend$122 = scootersOfferOnCameraRouter$onAttachSuspend$1;
        Object obj2 = scootersOfferOnCameraRouter$onAttachSuspend$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOfferOnCameraRouter$onAttachSuspend$122.label;
        if (i != 0) {
        }
        charSequence = (CharSequence) i2;
        scootersOfferOnCameraRouter$onAttachSuspend$122.L$0 = v3o0Var2;
        scootersOfferOnCameraRouter$onAttachSuspend$122.L$1 = charSequence;
        scootersOfferOnCameraRouter$onAttachSuspend$122.label = 2;
        h = qVar.h(scootersOfferOnCameraRouter$onAttachSuspend$122);
        if (h != coroutineSingletons) {
        }
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        this.F.a();
        tje.N(o(), null, CoroutineStart.UNDISPATCHED, new ScootersOfferOnCameraRouter$onAttach$1(this, (v3o0) obj, null), 1);
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        j(dpb.a);
        this.L = null;
        com.yandex.go.scooters.offer_on_camera.domain.a aVar = this.G;
        aVar.f.b = false;
        aVar.b.Fg(opo0.a);
        this.F.b();
    }
}
