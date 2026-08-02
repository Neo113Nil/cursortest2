package com.yandex.go.navigator.driving;

import com.yandex.mapkit.location.Location;
import defpackage.dvw;
import defpackage.jl40;
import defpackage.kol0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rsn;
import defpackage.s1r;
import defpackage.uxr;
import defpackage.vxr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/yandex/mapkit/location/Location;", "location", "Lrsn;", "", "cameraFollowUserEmitHolder", "Lzy11;", "<anonymous>", "(Lcom/yandex/mapkit/location/Location;Lrsn;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.driving.FollowModeInteractor$attach$1", f = "FollowModeInteractor.kt", l = {37, 43}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class FollowModeInteractor$attach$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ vxr this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowModeInteractor$attach$1(vxr vxrVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = vxrVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FollowModeInteractor$attach$1 followModeInteractor$attach$1 = new FollowModeInteractor$attach$1(this.this$0, (Continuation) obj3);
        followModeInteractor$attach$1.L$0 = (Location) obj;
        followModeInteractor$attach$1.L$1 = (rsn) obj2;
        return followModeInteractor$attach$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Location location = (Location) this.L$0;
        rsn rsnVar = (rsn) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            if (i == 2) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Object obj3 = rsnVar.a;
        Object obj4 = rsnVar.b;
        Boolean bool = Boolean.FALSE;
        if (!jl40.l(obj3, bool) || !((Boolean) obj4).booleanValue()) {
            vxr vxrVar = this.this$0;
            boolean booleanValue = ((Boolean) obj4).booleanValue();
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (booleanValue) {
                obj2 = vxrVar.a.e(location, new s1r(10, vxrVar), this);
            } else {
                vxrVar.d.l(bool);
                obj2 = zy11Var;
            }
            return obj2 == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        vxr vxrVar2 = this.this$0;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = vxrVar2;
        this.label = 1;
        kol0 kol0Var = new kol0(dvw.b(this));
        vxrVar2.a.a(true, true, null, new uxr(kol0Var));
        if (kol0Var.a() == coroutineSingletons) {
        }
    }
}
