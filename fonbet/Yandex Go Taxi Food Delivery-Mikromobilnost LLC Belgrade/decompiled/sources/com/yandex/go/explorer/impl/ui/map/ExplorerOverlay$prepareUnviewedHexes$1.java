package com.yandex.go.explorer.impl.ui.map;

import com.uber.h3core.util.LatLng;
import com.yandex.mapkit.geometry.LinearRing;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polygon;
import defpackage.bb1;
import defpackage.el00;
import defpackage.mvg;
import defpackage.n3e0;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.xm00;
import defpackage.xto;
import defpackage.yga1;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.explorer.impl.ui.map.ExplorerOverlay$prepareUnviewedHexes$1", f = "ExplorerOverlay.kt", l = {295}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ExplorerOverlay$prepareUnviewedHexes$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<Long> $hexIds;
    final /* synthetic */ xm00 $layer;
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExplorerOverlay$prepareUnviewedHexes$1(List list, c cVar, xm00 xm00Var, Continuation continuation) {
        super(2, continuation);
        this.$hexIds = list;
        this.this$0 = cVar;
        this.$layer = xm00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExplorerOverlay$prepareUnviewedHexes$1(this.$hexIds, this.this$0, this.$layer, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExplorerOverlay$prepareUnviewedHexes$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x010c -> B:6:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0104 -> B:5:0x0106). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        xm00 xm00Var;
        int i;
        Iterator it;
        c cVar;
        Polygon polygon;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            List<Long> list = this.$hexIds;
            c cVar2 = this.this$0;
            xm00Var = this.$layer;
            i = 0;
            it = list.iterator();
            cVar = cVar2;
            if (!it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = this.I$0;
            it = (Iterator) this.L$3;
            xm00Var = (xm00) this.L$2;
            c cVar3 = (c) this.L$1;
            kotlin.b.b(obj);
            c cVar4 = cVar3;
            i = i3;
            cVar = cVar4;
            if (!it.hasNext()) {
                Object next = it.next();
                int i4 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                long longValue = ((Number) next).longValue();
                ArrayList a = xto.c().a(longValue);
                ArrayList arrayList = new ArrayList(tcc.n(a, 10));
                for (Iterator it2 = a.iterator(); it2.hasNext(); it2 = it2) {
                    LatLng latLng = (LatLng) it2.next();
                    arrayList.add(new Point(latLng.a, latLng.b));
                    i = i;
                }
                int i5 = i;
                if (arrayList.size() >= 3) {
                    LinearRing h = ru.yandex.taxi.map_common.map.k.h(xto.a(arrayList));
                    if (h != null) {
                        EmptyList emptyList = EmptyList.a;
                        if (el00.a) {
                            polygon = new Polygon(h, emptyList);
                            if (polygon != null) {
                                float f = cVar.Q.a;
                                xm00Var.getClass();
                                n3e0 n3e0Var = new n3e0(polygon);
                                n3e0Var.b(xm00Var);
                                n3e0Var.r(yga1.b(f, cVar.O));
                                n3e0Var.u(yga1.b(f, cVar.P));
                                n3e0Var.p(2.0f);
                                cVar.C.add(n3e0Var);
                            }
                            i = i4;
                            if (!it.hasNext()) {
                                return zy11.a;
                            }
                        }
                    }
                    polygon = null;
                    if (polygon != null) {
                    }
                    i = i4;
                    if (!it.hasNext()) {
                    }
                }
                if (i4 % 10 == 0) {
                    this.L$0 = null;
                    this.L$1 = cVar;
                    this.L$2 = xm00Var;
                    this.L$3 = it;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.I$0 = i4;
                    this.J$0 = longValue;
                    this.I$1 = i5;
                    this.label = 1;
                    if (bb1.l0(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    cVar3 = cVar;
                    i3 = i4;
                    c cVar42 = cVar3;
                    i = i3;
                    cVar = cVar42;
                    if (!it.hasNext()) {
                    }
                }
                i = i4;
                if (!it.hasNext()) {
                }
            }
        }
    }
}
