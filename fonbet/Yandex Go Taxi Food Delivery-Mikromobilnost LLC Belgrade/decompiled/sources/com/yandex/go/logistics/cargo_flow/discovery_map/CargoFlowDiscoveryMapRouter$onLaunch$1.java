package com.yandex.go.logistics.cargo_flow.discovery_map;

import android.content.Context;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import defpackage.a3v;
import defpackage.ah00;
import defpackage.bwb;
import defpackage.byx;
import defpackage.c430;
import defpackage.cyx;
import defpackage.gh00;
import defpackage.gzx;
import defpackage.ju8;
import defpackage.lcw;
import defpackage.ltj;
import defpackage.lu8;
import defpackage.mu8;
import defpackage.mvg;
import defpackage.nu8;
import defpackage.ny61;
import defpackage.po21;
import defpackage.qoi0;
import defpackage.t91;
import defpackage.tje;
import defpackage.tse;
import defpackage.un0;
import defpackage.utj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n;
import ru.yandex.taxi.layers.presentation.optimalview.c;
import ru.yandex.taxi.preorder.source.userposition.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.logistics.cargo_flow.discovery_map.CargoFlowDiscoveryMapRouter$onLaunch$1", f = "CargoFlowDiscoveryMapRouter.kt", l = {74}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CargoFlowDiscoveryMapRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ mu8 $payload;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CargoFlowDiscoveryMapRouter$onLaunch$1(a aVar, mu8 mu8Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = mu8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CargoFlowDiscoveryMapRouter$onLaunch$1 cargoFlowDiscoveryMapRouter$onLaunch$1 = new CargoFlowDiscoveryMapRouter$onLaunch$1(this.this$0, this.$payload, continuation);
        cargoFlowDiscoveryMapRouter$onLaunch$1.L$0 = obj;
        return cargoFlowDiscoveryMapRouter$onLaunch$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CargoFlowDiscoveryMapRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CargoFlowDiscoveryMapModalView cargoFlowDiscoveryMapModalView;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            mu8 mu8Var = this.$payload;
            aVar.getClass();
            bwb bwbVar = mu8Var.a;
            ltj ltjVar = new ltj(new nu8(aVar), new utj(bwbVar.a, bwbVar.b, bwbVar.c, bwbVar.d));
            lu8 lu8Var = aVar.E;
            ju8 ju8Var = new ju8(i2, aVar);
            t91 t91Var = lu8Var.a;
            CargoFlowDiscoveryMapModalView cargoFlowDiscoveryMapModalView2 = new CargoFlowDiscoveryMapModalView((Context) t91Var.a.get(), (tse) t91Var.b.get(), ltjVar, ju8Var, (a3v) t91Var.c.get(), (ah00) t91Var.d.get(), (po21) t91Var.e.get());
            a aVar2 = this.this$0;
            aVar2.S = cargoFlowDiscoveryMapModalView2;
            aVar2.D.s(cargoFlowDiscoveryMapModalView2, true);
            this.this$0.F.b8(qoi0.a(tseVar.getClass()));
            ru.yandex.taxi.layers.b bVar = this.this$0.N;
            this.L$0 = null;
            this.L$1 = cargoFlowDiscoveryMapModalView2;
            this.label = 1;
            if (bVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            cargoFlowDiscoveryMapModalView = cargoFlowDiscoveryMapModalView2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cargoFlowDiscoveryMapModalView = (CargoFlowDiscoveryMapModalView) this.L$1;
            b.b(obj);
        }
        lcw lcwVar = this.this$0.R;
        zy11 zy11Var = zy11.a;
        if (lcwVar != null) {
            c cVar = (c) lcwVar.get();
            a aVar3 = this.this$0;
            String str = this.$payload.b;
            ((gh00) ((ah00) aVar3.H.get())).L(null);
            cyx cyxVar = (cyx) aVar3.G.get();
            Screen screen = Screen.DISCOVERY;
            Mode mode = Mode.DELIVERY_INTERCITY;
            cyxVar.b(new byx(screen, new c430(mode, (kotlinx.serialization.json.b) null, (un0) null)));
            cVar.E = mode;
            cVar.D = true;
            cVar.Ng(str);
            cVar.Lg(cargoFlowDiscoveryMapModalView);
            ((gzx) this.this$0.I.get()).attach();
            a aVar4 = this.this$0;
            tje.N(aVar4.o(), null, null, new CargoFlowDiscoveryMapRouter$listenLocation$$inlined$collectLatestIn$1(new n(((e) aVar4.J).n(), new CargoFlowDiscoveryMapRouter$listenLocation$1(aVar4, null)), null, aVar4), 3);
            tje.N(aVar4.o(), null, null, new CargoFlowDiscoveryMapRouter$listenLocation$$inlined$collectLatestIn$2(aVar4.K.a(), null, aVar4), 3);
        }
        return zy11Var;
    }
}
