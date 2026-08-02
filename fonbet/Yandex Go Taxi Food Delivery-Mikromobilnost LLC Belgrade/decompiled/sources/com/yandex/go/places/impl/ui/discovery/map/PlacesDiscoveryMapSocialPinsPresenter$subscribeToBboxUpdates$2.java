package com.yandex.go.places.impl.ui.discovery.map;

import com.yandex.go.places.impl.domain.entities.FavoritesState;
import com.yandex.go.places.impl.domain.interactors.map.e;
import com.yandex.mapkit.geometry.BoundingBox;
import defpackage.lg80;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.uc4;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007*\u001c\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00010\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lvpr;", "Lkotlin/Triple;", "Lcom/yandex/mapkit/geometry/BoundingBox;", "Luc4;", "", "", "<destruct>", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Triple;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.discovery.map.PlacesDiscoveryMapSocialPinsPresenter$subscribeToBboxUpdates$2", f = "PlacesDiscoveryMapSocialPinsPresenter.kt", l = {197, 205, 213}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesDiscoveryMapSocialPinsPresenter$subscribeToBboxUpdates$2 extends SuspendLambda implements zls {
    float F$0;
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesDiscoveryMapSocialPinsPresenter$subscribeToBboxUpdates$2(d dVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlacesDiscoveryMapSocialPinsPresenter$subscribeToBboxUpdates$2 placesDiscoveryMapSocialPinsPresenter$subscribeToBboxUpdates$2 = new PlacesDiscoveryMapSocialPinsPresenter$subscribeToBboxUpdates$2(this.this$0, (Continuation) obj3);
        placesDiscoveryMapSocialPinsPresenter$subscribeToBboxUpdates$2.L$0 = (vpr) obj;
        placesDiscoveryMapSocialPinsPresenter$subscribeToBboxUpdates$2.L$1 = (Triple) obj2;
        return placesDiscoveryMapSocialPinsPresenter$subscribeToBboxUpdates$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        uc4 uc4Var;
        float floatValue;
        boolean booleanValue;
        FavoritesState favoritesState;
        int i;
        int i2;
        d dVar;
        e eVar;
        boolean z;
        Object b;
        uc4 uc4Var2;
        float f;
        boolean z2;
        vpr vprVar = (vpr) this.L$0;
        Triple triple = (Triple) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        zy11 zy11Var = zy11.a;
        if (i3 == 0) {
            kotlin.b.b(obj);
            uc4Var = (uc4) triple.getFirst();
            floatValue = ((Number) triple.getSecond()).floatValue();
            booleanValue = ((Boolean) triple.getThird()).booleanValue();
            favoritesState = booleanValue ? FavoritesState.SELECTED : FavoritesState.NOT_SELECTED;
            d dVar2 = this.this$0;
            i = dVar2.j0 != favoritesState ? 1 : 0;
            if (i != 0) {
                dVar2.j0 = favoritesState;
                this.L$0 = vprVar;
                this.L$1 = null;
                this.L$2 = uc4Var;
                this.L$3 = favoritesState;
                this.F$0 = floatValue;
                this.Z$0 = booleanValue;
                this.I$0 = i;
                this.label = 1;
                if (d.Mg(dVar2, this) != coroutineSingletons) {
                    i2 = i;
                }
            }
            boolean z3 = booleanValue;
            float f2 = floatValue;
            uc4 uc4Var3 = uc4Var;
            dVar = this.this$0;
            if (!dVar.i0) {
                dVar.i0 = false;
                return zy11Var;
            }
            e eVar2 = dVar.M;
            Float f3 = new Float(f2);
            if (favoritesState == FavoritesState.SELECTED) {
                eVar = eVar2;
                z = true;
            } else {
                eVar = eVar2;
                z = false;
            }
            d dVar3 = this.this$0;
            e eVar3 = eVar;
            lg80 lg80Var = dVar3.B;
            String str = dVar3.A;
            this.L$0 = vprVar;
            this.L$1 = null;
            this.L$2 = uc4Var3;
            this.L$3 = null;
            this.F$0 = f2;
            this.Z$0 = z3;
            this.I$0 = i;
            this.label = 2;
            b = eVar3.b(uc4Var3, f3, z, lg80Var, str, this);
            if (b != coroutineSingletons) {
                uc4Var2 = uc4Var3;
                f = f2;
                z2 = z3;
                Triple triple2 = new Triple((BoundingBox) b, uc4Var2, Boolean.valueOf(i == 0));
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.F$0 = f;
                this.Z$0 = z2;
                this.I$0 = i;
                this.label = 3;
                if (vprVar.emit(triple2, this) != coroutineSingletons) {
                }
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            int i4 = this.I$0;
            z2 = this.Z$0;
            f = this.F$0;
            uc4Var2 = (uc4) this.L$2;
            kotlin.b.b(obj);
            i = i4;
            b = obj;
            Triple triple22 = new Triple((BoundingBox) b, uc4Var2, Boolean.valueOf(i == 0));
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.F$0 = f;
            this.Z$0 = z2;
            this.I$0 = i;
            this.label = 3;
            return vprVar.emit(triple22, this) != coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        i2 = this.I$0;
        booleanValue = this.Z$0;
        floatValue = this.F$0;
        favoritesState = (FavoritesState) this.L$3;
        uc4Var = (uc4) this.L$2;
        kotlin.b.b(obj);
        i = i2;
        boolean z32 = booleanValue;
        float f22 = floatValue;
        uc4 uc4Var32 = uc4Var;
        dVar = this.this$0;
        if (!dVar.i0) {
        }
    }
}
