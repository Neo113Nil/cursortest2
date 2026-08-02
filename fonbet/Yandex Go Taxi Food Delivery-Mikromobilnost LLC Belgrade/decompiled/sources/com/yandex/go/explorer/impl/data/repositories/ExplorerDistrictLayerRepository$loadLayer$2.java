package com.yandex.go.explorer.impl.data.repositories;

import com.yandex.go.explorer.impl.data.api.ExplorerInternalApi;
import com.yandex.go.explorer.impl.data.models.CoordinateDto;
import com.yandex.go.explorer.impl.data.models.RegionCoverageRequestParams;
import com.yandex.go.explorer.impl.data.models.RegionCoverageResponse;
import com.yandex.mapkit.geometry.Point;
import defpackage.cmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.puo;
import defpackage.tse;
import defpackage.tuo;
import defpackage.uc4;
import defpackage.uuo;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lvuo;", "Louo;", "<anonymous>", "(Ltse;)Lvuo;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.explorer.impl.data.repositories.ExplorerDistrictLayerRepository$loadLayer$2", f = "ExplorerDistrictLayerRepository.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ExplorerDistrictLayerRepository$loadLayer$2 extends SuspendLambda implements wls {
    final /* synthetic */ uc4 $bbox;
    final /* synthetic */ Point $point;
    final /* synthetic */ float $zoom;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExplorerDistrictLayerRepository$loadLayer$2(uc4 uc4Var, float f, Point point, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$bbox = uc4Var;
        this.$zoom = f;
        this.$point = point;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExplorerDistrictLayerRepository$loadLayer$2(this.$bbox, this.$zoom, this.$point, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExplorerDistrictLayerRepository$loadLayer$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                uc4 uc4Var = this.$bbox;
                float f = this.$zoom;
                Point point = this.$point;
                b bVar2 = this.this$0;
                cmt<RegionCoverageResponse> c = ((ExplorerInternalApi) bVar2.a.a.getValue()).c(new RegionCoverageRequestParams(uc4Var, (int) f, new CoordinateDto(point.getLatitude(), point.getLongitude())));
                this.L$0 = bVar2;
                this.L$1 = null;
                this.label = 1;
                obj = ru.yandex.taxi.network.api.a.d(c, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                bVar = bVar2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar = (b) this.L$0;
                kotlin.b.b(obj);
            }
            bVar.c.getClass();
            return new tuo(puo.a((RegionCoverageResponse) obj));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new uuo(th);
        }
    }
}
