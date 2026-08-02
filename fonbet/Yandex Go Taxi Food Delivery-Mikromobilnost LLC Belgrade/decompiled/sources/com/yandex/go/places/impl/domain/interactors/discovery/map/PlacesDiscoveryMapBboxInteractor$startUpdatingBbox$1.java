package com.yandex.go.places.impl.domain.interactors.discovery.map;

import android.graphics.Rect;
import com.yandex.mapkit.map.VisibleRegion;
import defpackage.ah00;
import defpackage.gh00;
import defpackage.jl40;
import defpackage.jtj;
import defpackage.ktj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r6c0;
import defpackage.uc4;
import defpackage.xtj;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.taxi.map_common.map.TaxiMapView;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr6c0;", "camera", "Lxtj;", ConfigConstants.CONFIG, "Lkotlin/Pair;", "Luc4;", "", "<anonymous>", "(Lr6c0;Lxtj;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.domain.interactors.discovery.map.PlacesDiscoveryMapBboxInteractor$startUpdatingBbox$1", f = "PlacesDiscoveryMapBboxInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesDiscoveryMapBboxInteractor$startUpdatingBbox$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesDiscoveryMapBboxInteractor$startUpdatingBbox$1(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlacesDiscoveryMapBboxInteractor$startUpdatingBbox$1 placesDiscoveryMapBboxInteractor$startUpdatingBbox$1 = new PlacesDiscoveryMapBboxInteractor$startUpdatingBbox$1(this.this$0, (Continuation) obj3);
        placesDiscoveryMapBboxInteractor$startUpdatingBbox$1.L$0 = (r6c0) obj;
        placesDiscoveryMapBboxInteractor$startUpdatingBbox$1.L$1 = (xtj) obj2;
        return placesDiscoveryMapBboxInteractor$startUpdatingBbox$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gh00 gh00Var;
        TaxiMapView h;
        r6c0 r6c0Var = (r6c0) this.L$0;
        xtj xtjVar = (xtj) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = this.this$0;
        VisibleRegion visibleRegion = r6c0Var.a;
        float f = r6c0Var.b;
        ah00 ah00Var = aVar.a;
        jtj jtjVar = aVar.e;
        uc4 D = ru.yandex.taxi.map.utils.a.D(visibleRegion);
        if (!jl40.l(xtjVar, xtj.d) && (h = (gh00Var = (gh00) ah00Var).h()) != null) {
            Rect g = gh00Var.g();
            if (g.width() > 0 && g.height() > 0) {
                float f2 = aVar.d.getResources().getDisplayMetrics().density;
                ktj ktjVar = new ktj(g.left, g.top, g.right, g.bottom);
                xtj.a aVar2 = xtjVar.c;
                jtj.a aVar3 = new jtj.a(aVar2.a * f2, aVar2.b * f2, aVar2.c * f2, aVar2.d * f2);
                jtjVar.getClass();
                ktj a = jtj.a(ktjVar, ktjVar, aVar3, null, null);
                if (aVar3.a() || !jl40.l(a, ktjVar)) {
                    xtj.a aVar4 = xtjVar.a;
                    jtj.a aVar5 = new jtj.a(aVar4.a * f2, aVar4.b * f2, aVar4.c * f2, aVar4.d * f2);
                    Float f3 = xtjVar.b;
                    Float valueOf = Float.valueOf(f);
                    jtjVar.getClass();
                    uc4 a2 = jtj.a(a, ktjVar, aVar5, f3, valueOf).a(h);
                    if (a2 != null || (a2 = a.a(h)) != null) {
                        D = a2;
                    }
                }
            }
        }
        return new Pair(D, new Float(f));
    }
}
