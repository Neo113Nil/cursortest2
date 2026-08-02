package com.yandex.go.explorer.impl.ui.map;

import com.yandex.mapkit.geometry.Point;
import defpackage.gh00;
import defpackage.guo;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ouo;
import defpackage.qto;
import defpackage.rto;
import defpackage.suo;
import defpackage.tse;
import defpackage.uc4;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.explorer.impl.ui.map.ExplorerPresenter$onMapTapped$1", f = "ExplorerPresenter.kt", l = {62}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ExplorerPresenter$onMapTapped$1 extends SuspendLambda implements wls {
    final /* synthetic */ Point $point;
    float F$0;
    Object L$0;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExplorerPresenter$onMapTapped$1(l lVar, Point point, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$point = point;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExplorerPresenter$onMapTapped$1(this.this$0, this.$point, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExplorerPresenter$onMapTapped$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qto qtoVar;
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            uc4 D = ru.yandex.taxi.map.utils.a.D(((gh00) this.this$0.z).e.f());
            float j = ((gh00) this.this$0.z).j();
            com.yandex.go.explorer.impl.domain.interactors.a aVar = this.this$0.y;
            Point point = this.$point;
            this.L$0 = null;
            this.F$0 = j;
            this.label = 1;
            obj = aVar.a(D, j, point, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ouo ouoVar = (ouo) obj;
        suo suoVar = (ouoVar == null || (list = ouoVar.a) == null) ? null : (suo) kotlin.collections.a.R(list);
        rto rtoVar = this.this$0.y.b;
        if (suoVar != null) {
            rtoVar.getClass();
            qtoVar = new qto(suoVar.b, suoVar.c, true, null);
        } else {
            qtoVar = null;
        }
        rtoVar.a.l(qtoVar);
        ((guo) this.this$0.Dg()).n3(suoVar != null ? suoVar.d : null);
        return zy11.a;
    }
}
