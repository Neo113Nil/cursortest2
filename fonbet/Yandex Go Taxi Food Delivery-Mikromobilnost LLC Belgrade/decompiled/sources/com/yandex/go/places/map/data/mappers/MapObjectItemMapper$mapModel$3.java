package com.yandex.go.places.map.data.mappers;

import com.yandex.go.places.models.data.entities.network.map.MapObjectItemDto$OrganizationPreviewPinDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectItemDto$SocialPinDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectItemDto$UniversalPinDto;
import com.yandex.go.places.models.data.entities.network.map.d;
import com.yandex.go.places.models.data.entities.network.map.e;
import com.yandex.go.places.models.data.mappers.f;
import defpackage.evu0;
import defpackage.hbc0;
import defpackage.jl40;
import defpackage.kn00;
import defpackage.me11;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lkn00;", "<anonymous>", "(Ltse;)Lkn00;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.map.data.mappers.MapObjectItemMapper$mapModel$3", f = "MapObjectItemMapper.kt", l = {HProv.PP_CIPHEROID, HProv.PP_RESERVED1, HProv.PP_BIO_STATISTICA_LEN, HProv.PP_REBOOT}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MapObjectItemMapper$mapModel$3 extends SuspendLambda implements wls {
    final /* synthetic */ e $dto;
    final /* synthetic */ hbc0 $pinImages;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectItemMapper$mapModel$3(hbc0 hbc0Var, a aVar, e eVar, Continuation continuation) {
        super(2, continuation);
        this.$dto = eVar;
        this.this$0 = aVar;
        this.$pinImages = hbc0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        e eVar = this.$dto;
        MapObjectItemMapper$mapModel$3 mapObjectItemMapper$mapModel$3 = new MapObjectItemMapper$mapModel$3(this.$pinImages, this.this$0, eVar, continuation);
        mapObjectItemMapper$mapModel$3.L$0 = obj;
        return mapObjectItemMapper$mapModel$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapObjectItemMapper$mapModel$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        if (r9 == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
    
        if (r9 == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c9, code lost:
    
        if (r9 == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006f, code lost:
    
        if (r9 == r0) goto L41;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            if (!evu0.J(this.$dto.getA()) && !jl40.l(this.$dto.getB(), zzs.f)) {
                f fVar = this.this$0.g;
                List d = this.$dto.getD();
                this.L$0 = tseVar;
                this.label = 1;
                obj = fVar.a(d, null, this);
            }
            return null;
        }
        if (i != 1) {
            if (i == 2) {
                b.b(obj);
                return (kn00) obj;
            }
            if (i == 3) {
                b.b(obj);
                return (kn00) obj;
            }
            if (i != 4) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            return (kn00) obj;
        }
        b.b(obj);
        me11 me11Var = (me11) obj;
        e eVar = this.$dto;
        if (eVar instanceof MapObjectItemDto$OrganizationPreviewPinDto) {
            hbc0 hbc0Var = this.$pinImages;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            obj = a.a(this.this$0, tseVar, (MapObjectItemDto$OrganizationPreviewPinDto) eVar, hbc0Var, me11Var, this);
        } else if (eVar instanceof MapObjectItemDto$SocialPinDto) {
            hbc0 hbc0Var2 = this.$pinImages;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            obj = a.c(this.this$0, tseVar, (MapObjectItemDto$SocialPinDto) eVar, hbc0Var2, me11Var, this);
        } else {
            if (!(eVar instanceof MapObjectItemDto$UniversalPinDto)) {
                if (!jl40.l(eVar, d.INSTANCE)) {
                    w511.b();
                    return null;
                }
                return null;
            }
            hbc0 hbc0Var3 = this.$pinImages;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 4;
            obj = a.g(this.this$0, tseVar, (MapObjectItemDto$UniversalPinDto) eVar, hbc0Var3, me11Var, this);
        }
        return coroutineSingletons;
    }
}
