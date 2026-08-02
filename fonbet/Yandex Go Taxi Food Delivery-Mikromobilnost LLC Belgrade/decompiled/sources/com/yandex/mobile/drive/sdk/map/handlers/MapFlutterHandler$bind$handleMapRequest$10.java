package com.yandex.mobile.drive.sdk.map.handlers;

import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapLoadStatistics;
import com.yandex.mapkit.map.MapWindow;
import defpackage.dvw;
import defpackage.j1;
import defpackage.j18;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ri00;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)J"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mobile.drive.sdk.map.handlers.MapFlutterHandler$bind$handleMapRequest$10", f = "MapFlutterHandler.kt", l = {211}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class MapFlutterHandler$bind$handleMapRequest$10 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapFlutterHandler$bind$handleMapRequest$10(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapFlutterHandler$bind$handleMapRequest$10(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapFlutterHandler$bind$handleMapRequest$10) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Map map = ((MapWindow) this.this$0.a.c).getMap();
            this.label = 1;
            j18 j18Var = new j18(1, dvw.b(this));
            j18Var.u();
            map.setMapLoadedListener(new ri00(j18Var));
            j18Var.w(new j1(16, map));
            obj = j18Var.s();
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return new Long(((MapLoadStatistics) obj).getFullyLoaded());
    }
}
