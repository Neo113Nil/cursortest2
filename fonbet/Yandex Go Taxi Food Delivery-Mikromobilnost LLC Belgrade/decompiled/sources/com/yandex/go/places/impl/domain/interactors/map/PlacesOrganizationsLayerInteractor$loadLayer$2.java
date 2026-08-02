package com.yandex.go.places.impl.domain.interactors.map;

import com.yandex.go.places.impl.data.entities.network.organizations.layer.PlacesOrganizationsLayerResponse;
import defpackage.fg5;
import defpackage.kk80;
import defpackage.lg80;
import defpackage.mvg;
import defpackage.nk80;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uc4;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/mapkit/geometry/BoundingBox;", "<anonymous>", "(Ltse;)Lcom/yandex/mapkit/geometry/BoundingBox;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.domain.interactors.map.PlacesOrganizationsLayerInteractor$loadLayer$2", f = "PlacesOrganizationsLayerInteractor.kt", l = {32, 31}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesOrganizationsLayerInteractor$loadLayer$2 extends SuspendLambda implements wls {
    final /* synthetic */ uc4 $bbox;
    final /* synthetic */ boolean $isFavouritesSelected;
    final /* synthetic */ String $layersContext;
    final /* synthetic */ lg80 $organizationCardMode;
    final /* synthetic */ String $paginationContext;
    final /* synthetic */ Float $zoom;
    Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesOrganizationsLayerInteractor$loadLayer$2(e eVar, String str, uc4 uc4Var, Float f, boolean z, lg80 lg80Var, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$paginationContext = str;
        this.$bbox = uc4Var;
        this.$zoom = f;
        this.$isFavouritesSelected = z;
        this.$organizationCardMode = lg80Var;
        this.$layersContext = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesOrganizationsLayerInteractor$loadLayer$2(this.this$0, this.$paginationContext, this.$bbox, this.$zoom, this.$isFavouritesSelected, this.$organizationCardMode, this.$layersContext, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesOrganizationsLayerInteractor$loadLayer$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r15 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0030, code lost:
    
        if (r15 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.yandex.go.places.impl.data.repositories.map.layer.a aVar;
        PlacesOrganizationsLayerInteractor$loadLayer$2 placesOrganizationsLayerInteractor$loadLayer$2;
        PlacesOrganizationsLayerResponse placesOrganizationsLayerResponse;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        uc4 uc4Var = null;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            aVar = eVar.a;
            this.L$0 = aVar;
            this.label = 1;
            obj = e.a(eVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                placesOrganizationsLayerInteractor$loadLayer$2 = this;
                nk80 nk80Var = (nk80) obj;
                kk80 kk80Var = nk80Var instanceof kk80 ? (kk80) nk80Var : null;
                if (kk80Var != null && (placesOrganizationsLayerResponse = (PlacesOrganizationsLayerResponse) kk80Var.a) != null) {
                    uc4Var = placesOrganizationsLayerResponse.a;
                }
                placesOrganizationsLayerInteractor$loadLayer$2.this$0.d.getClass();
                return fg5.a(uc4Var);
            }
            aVar = (com.yandex.go.places.impl.data.repositories.map.layer.a) this.L$0;
            kotlin.b.b(obj);
        }
        com.yandex.go.places.impl.data.repositories.map.layer.a aVar2 = aVar;
        String str = this.$paginationContext;
        uc4 uc4Var2 = this.$bbox;
        Float f = this.$zoom;
        boolean z = this.$isFavouritesSelected;
        lg80 lg80Var = this.$organizationCardMode;
        String str2 = this.$layersContext;
        this.L$0 = null;
        this.label = 2;
        placesOrganizationsLayerInteractor$loadLayer$2 = this;
        obj = aVar2.a((zzs) obj, str, uc4Var2, f, z, lg80Var, str2, placesOrganizationsLayerInteractor$loadLayer$2);
    }
}
