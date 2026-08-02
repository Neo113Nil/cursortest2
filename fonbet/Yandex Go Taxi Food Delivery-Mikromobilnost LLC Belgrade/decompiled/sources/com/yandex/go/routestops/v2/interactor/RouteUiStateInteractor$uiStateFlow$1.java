package com.yandex.go.routestops.v2.interactor;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.bfl0;
import defpackage.bms;
import defpackage.bpl0;
import defpackage.dfl0;
import defpackage.dok0;
import defpackage.ffl0;
import defpackage.ju2;
import defpackage.mvg;
import defpackage.mzi0;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tk91;
import defpackage.u2b1;
import defpackage.x81;
import defpackage.xna1;
import defpackage.yel0;
import defpackage.zel0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lx81;", "source", "", "destinations", "", "maxStopsCount", "Ldfl0;", "<anonymous>", "(Lx81;Ljava/util/List;I)Ldfl0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.routestops.v2.interactor.RouteUiStateInteractor$uiStateFlow$1", f = "RouteUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RouteUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ffl0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteUiStateInteractor$uiStateFlow$1(ffl0 ffl0Var, Continuation continuation) {
        super(4, continuation);
        this.this$0 = ffl0Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj3).intValue();
        RouteUiStateInteractor$uiStateFlow$1 routeUiStateInteractor$uiStateFlow$1 = new RouteUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj4);
        routeUiStateInteractor$uiStateFlow$1.L$0 = (x81) obj;
        routeUiStateInteractor$uiStateFlow$1.L$1 = (List) obj2;
        routeUiStateInteractor$uiStateFlow$1.I$0 = intValue;
        return routeUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yel0 yel0Var;
        x81 x81Var = (x81) this.L$0;
        List list = (List) this.L$1;
        int i = this.I$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (x81Var == null) {
            return null;
        }
        this.this$0.getClass();
        byte b = 0;
        int i2 = 25;
        bpl0 a = com.yandex.go.design.compose.list.a.a(Collections.singletonList(ffl0.a(x81Var, false, "source", 0)), new dok0(b, i2), new zel0(0));
        this.this$0.getClass();
        boolean z = list.size() > 1;
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        int i3 = 0;
        for (Object obj2 : list2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                scc.m();
                throw null;
            }
            arrayList.add(ffl0.a((x81) obj2, z, "destination", i4));
            i3 = i4;
        }
        bpl0 a2 = com.yandex.go.design.compose.list.a.a(arrayList, new dok0(b, i2), new zel0(0));
        ffl0 ffl0Var = this.this$0;
        if (list.size() < i) {
            yel0Var = new yel0((String) ffl0Var.d.getValue());
        } else {
            ffl0Var.getClass();
            yel0Var = null;
        }
        return new dfl0(a, a2, yel0Var, new bfl0(new ju2(u2b1.a(), null), new ju2(tk91.c(), AppColor$Palette.Line), new ju2(xna1.a(), null)), (mzi0) this.this$0.e.getValue(), (String) this.this$0.f.getValue());
    }
}
