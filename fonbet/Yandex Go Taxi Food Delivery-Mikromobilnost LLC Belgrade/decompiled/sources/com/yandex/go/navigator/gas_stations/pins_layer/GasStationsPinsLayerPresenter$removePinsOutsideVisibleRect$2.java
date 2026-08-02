package com.yandex.go.navigator.gas_stations.pins_layer;

import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import defpackage.gh00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.tyw;
import defpackage.uts;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.gas_stations.pins_layer.GasStationsPinsLayerPresenter$removePinsOutsideVisibleRect$2", f = "GasStationsPinsLayerPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class GasStationsPinsLayerPresenter$removePinsOutsideVisibleRect$2 extends SuspendLambda implements wls {
    final /* synthetic */ Set<String> $removedPinIds;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GasStationsPinsLayerPresenter$removePinsOutsideVisibleRect$2(h hVar, Set set, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$removedPinIds = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GasStationsPinsLayerPresenter$removePinsOutsideVisibleRect$2(this.this$0, this.$removedPinIds, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        GasStationsPinsLayerPresenter$removePinsOutsideVisibleRect$2 gasStationsPinsLayerPresenter$removePinsOutsideVisibleRect$2 = (GasStationsPinsLayerPresenter$removePinsOutsideVisibleRect$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        gasStationsPinsLayerPresenter$removePinsOutsideVisibleRect$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Iterator it = this.this$0.N.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            tyw tywVar = this.this$0.K;
            ScreenPoint e = ((gh00) tywVar.a).e.e(((uts) entry.getValue()).d);
            if (!(e == null ? false : ru.yandex.taxi.map.utils.a.q(e, (ScreenRect) tywVar.c.getValue()))) {
                this.$removedPinIds.add(entry.getKey());
                it.remove();
            }
        }
        return zy11.a;
    }
}
