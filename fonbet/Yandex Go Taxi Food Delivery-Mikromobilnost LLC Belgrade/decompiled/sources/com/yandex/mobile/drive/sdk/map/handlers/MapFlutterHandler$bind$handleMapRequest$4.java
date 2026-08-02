package com.yandex.mobile.drive.sdk.map.handlers;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.Map;
import defpackage.d2r0;
import defpackage.dvw;
import defpackage.gr00;
import defpackage.i4n;
import defpackage.jq7;
import defpackage.kol0;
import defpackage.mvg;
import defpackage.mx0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zvs;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/Object;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mobile.drive.sdk.map.handlers.MapFlutterHandler$bind$handleMapRequest$4", f = "MapFlutterHandler.kt", l = {120}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class MapFlutterHandler$bind$handleMapRequest$4 extends SuspendLambda implements wls {
    final /* synthetic */ gr00 $request;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapFlutterHandler$bind$handleMapRequest$4(a aVar, gr00 gr00Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$request = gr00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapFlutterHandler$bind$handleMapRequest$4(this.this$0, this.$request, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapFlutterHandler$bind$handleMapRequest$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            return obj;
        }
        b.b(obj);
        a aVar = this.this$0;
        gr00 gr00Var = this.$request;
        this.L$0 = aVar;
        this.L$1 = gr00Var;
        this.label = 1;
        kol0 kol0Var = new kol0(dvw.b(this));
        i4n i4nVar = aVar.a;
        d2r0 d2r0Var = (d2r0) gr00Var;
        Point point = d2r0Var.a;
        float f = d2r0Var.b;
        float f2 = d2r0Var.d;
        float f3 = d2r0Var.c;
        boolean z = d2r0Var.e;
        int i2 = 2;
        zvs zvsVar = new zvs(kol0Var, 2);
        Map map = ((com.yandex.mobile.drive.sdk.map.b) i4nVar.i).c;
        if (z) {
            map.move(new CameraPosition(point, f, f3, f2), jq7.a, new mx0(i2, zvsVar));
        } else {
            map.move(new CameraPosition(point, f, f3, f2));
            zvsVar.invoke(Boolean.TRUE);
        }
        Object a = kol0Var.a();
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
