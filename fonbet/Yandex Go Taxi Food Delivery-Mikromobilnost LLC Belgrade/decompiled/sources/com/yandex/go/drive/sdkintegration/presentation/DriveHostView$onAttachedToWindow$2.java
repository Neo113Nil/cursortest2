package com.yandex.go.drive.sdkintegration.presentation;

import com.yandex.mapkit.directions.carparks.CarparksLayer;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mobile.drive.sdk.map.MapMobileSdkPlugin;
import defpackage.ah00;
import defpackage.bfm;
import defpackage.bxl;
import defpackage.dvw;
import defpackage.em00;
import defpackage.gh00;
import defpackage.j18;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rz8;
import defpackage.si3;
import defpackage.tl00;
import defpackage.tse;
import defpackage.u8y;
import defpackage.v8y;
import defpackage.wls;
import defpackage.zvi;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.map_common.map.TaxiMapView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.drive.sdkintegration.presentation.DriveHostView$onAttachedToWindow$2", f = "DriveHostView.kt", l = {367, 197}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class DriveHostView$onAttachedToWindow$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ DriveHostView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DriveHostView$onAttachedToWindow$2(DriveHostView driveHostView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = driveHostView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DriveHostView$onAttachedToWindow$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DriveHostView$onAttachedToWindow$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        if (r9 == r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ah00 ah00Var;
        TaxiMapView h;
        ah00 ah00Var2;
        rz8 rz8Var;
        Object a;
        TaxiMapView taxiMapView;
        MapWindow mapWindow;
        u8y u8yVar;
        tl00 tl00Var;
        List list;
        List list2;
        u8y u8yVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ah00Var = this.this$0.mapController;
            h = ((gh00) ah00Var).h();
            if (h == null) {
                DriveHostView driveHostView = this.this$0;
                this.L$0 = driveHostView;
                this.label = 1;
                j18 j18Var = new j18(1, dvw.b(this));
                j18Var.u();
                ah00Var2 = driveHostView.mapController;
                ((gh00) ah00Var2).q(new si3(j18Var, 3));
                obj = j18Var.s();
            }
            rz8Var = this.this$0.carParksLayerHolder;
            this.L$0 = h;
            this.label = 2;
            a = rz8Var.a(this);
            if (a != coroutineSingletons) {
                TaxiMapView taxiMapView2 = h;
                obj = a;
                taxiMapView = taxiMapView2;
                zvi zviVar = new zvi(19, (CarparksLayer) obj);
                bfm.i.getClass();
                bxl bxlVar = new bxl(7, taxiMapView);
                em00 em00Var = MapMobileSdkPlugin.Companion;
                mapWindow = taxiMapView.getMapWindow();
                zvi zviVar2 = new zvi(20, taxiMapView);
                em00Var.getClass();
                u8yVar = MapMobileSdkPlugin.lease;
                if (jl40.l(u8yVar != null ? u8yVar.a : null, mapWindow)) {
                }
                return zy11.a;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            taxiMapView = (TaxiMapView) this.L$0;
            b.b(obj);
            zvi zviVar3 = new zvi(19, (CarparksLayer) obj);
            bfm.i.getClass();
            bxl bxlVar2 = new bxl(7, taxiMapView);
            em00 em00Var2 = MapMobileSdkPlugin.Companion;
            mapWindow = taxiMapView.getMapWindow();
            zvi zviVar22 = new zvi(20, taxiMapView);
            em00Var2.getClass();
            u8yVar = MapMobileSdkPlugin.lease;
            if (jl40.l(u8yVar != null ? u8yVar.a : null, mapWindow)) {
                u8y u8yVar3 = new u8y(mapWindow, zviVar3, bxlVar2, zviVar22);
                MapMobileSdkPlugin.lease = u8yVar3;
                tl00Var = MapMobileSdkPlugin.pendingLeaseGranter;
                if (tl00Var != null) {
                    list = MapMobileSdkPlugin.pendingRequests;
                    if (!list.isEmpty()) {
                        list2 = MapMobileSdkPlugin.pendingRequests;
                        em00.b(em00.c(tl00Var, u8yVar3, ((v8y) a.P(list2)).a, false));
                    }
                }
            } else {
                u8yVar2 = MapMobileSdkPlugin.lease;
                if (u8yVar2 != null) {
                    u8yVar2.f++;
                }
            }
            return zy11.a;
        }
        b.b(obj);
        h = (TaxiMapView) obj;
        rz8Var = this.this$0.carParksLayerHolder;
        this.L$0 = h;
        this.label = 2;
        a = rz8Var.a(this);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
