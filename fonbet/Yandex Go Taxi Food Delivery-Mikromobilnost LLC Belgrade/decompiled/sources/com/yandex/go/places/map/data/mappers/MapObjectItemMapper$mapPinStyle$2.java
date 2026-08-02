package com.yandex.go.places.map.data.mappers;

import com.yandex.go.places.models.data.entities.network.ImageDto;
import com.yandex.go.places.models.data.entities.network.c0;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$PinWarDefaultPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$SocialDefaultPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$SupermapUniversalLSelectedPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$SupermapUniversalMFallbackSelectedPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$UniversalLPinOrganizationStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$UniversalLPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$UniversalMPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$UniversalSPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$UniversalSelectedPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.t;
import com.yandex.go.places.models.data.entities.network.map.u;
import defpackage.ao00;
import defpackage.fo00;
import defpackage.hbc0;
import defpackage.io00;
import defpackage.ixy0;
import defpackage.je10;
import defpackage.jl40;
import defpackage.jo00;
import defpackage.k7v;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o52;
import defpackage.on00;
import defpackage.pn00;
import defpackage.tse;
import defpackage.ufu;
import defpackage.un00;
import defpackage.w511;
import defpackage.wls;
import defpackage.wn00;
import defpackage.yn00;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lfo00;", "<anonymous>", "(Ltse;)Lfo00;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.map.data.mappers.MapObjectItemMapper$mapPinStyle$2", f = "MapObjectItemMapper.kt", l = {198, 201, 202, 203, 204, 205, 206, 207, 210, 228}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MapObjectItemMapper$mapPinStyle$2 extends SuspendLambda implements wls {
    final /* synthetic */ u $dto;
    final /* synthetic */ boolean $isFavorite;
    final /* synthetic */ hbc0 $pinImages;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectItemMapper$mapPinStyle$2(u uVar, a aVar, hbc0 hbc0Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$dto = uVar;
        this.this$0 = aVar;
        this.$pinImages = hbc0Var;
        this.$isFavorite = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MapObjectItemMapper$mapPinStyle$2 mapObjectItemMapper$mapPinStyle$2 = new MapObjectItemMapper$mapPinStyle$2(this.$dto, this.this$0, this.$pinImages, this.$isFavorite, continuation);
        mapObjectItemMapper$mapPinStyle$2.L$0 = obj;
        return mapObjectItemMapper$mapPinStyle$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapObjectItemMapper$mapPinStyle$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x006e, code lost:
    
        if (r15 == r0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e6, code lost:
    
        if (r15 == r0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0104, code lost:
    
        if (r15 == r0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0131, code lost:
    
        if (r15 == r0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015e, code lost:
    
        if (r15 == r0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0176, code lost:
    
        if (r15 == r0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0194, code lost:
    
        if (r15 == r0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b3, code lost:
    
        if (r15 == r0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e7, code lost:
    
        if (r15 == r0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x023f, code lost:
    
        if (r15 == r0) goto L103;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object l;
        Object m;
        Object d;
        Object e;
        Object i;
        Object p;
        Object p2;
        Object f;
        Object h;
        Object b;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                b.b(obj);
                Object obj2 = this.$dto;
                if (!(obj2 instanceof MapObjectPinStyleDto$PinWarDefaultPinStyleDto)) {
                    if (obj2 instanceof MapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto) {
                        a aVar = this.this$0;
                        MapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto mapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto = (MapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto) obj2;
                        ixy0 b2 = aVar.d.b(mapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto.b);
                        if (b2 != null) {
                            float[] fArr = mapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto.a;
                            return new un00(b2, fArr != null ? new o52(fArr[0], fArr[1]) : null, ((ufu) aVar.f).b(mapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto.c));
                        }
                    } else if (obj2 instanceof MapObjectPinStyleDto$SocialDefaultPinStyleDto) {
                        je10 je10Var = this.this$0.e;
                        c0 c0Var = (c0) kotlin.collections.a.R(((MapObjectPinStyleDto$SocialDefaultPinStyleDto) obj2).a);
                        je10Var.getClass();
                        k7v a = je10.a(c0Var);
                        if (a != null) {
                            return new wn00(new ixy0(a, null));
                        }
                    } else if (obj2 instanceof MapObjectPinStyleDto$UniversalSPinStyleDto) {
                        hbc0 hbc0Var = this.$pinImages;
                        boolean z = this.$isFavorite;
                        this.L$0 = null;
                        this.label = 2;
                        h = a.h(this.this$0, tseVar, (MapObjectPinStyleDto$UniversalSPinStyleDto) obj2, hbc0Var, z, this);
                        break;
                    } else if (obj2 instanceof MapObjectPinStyleDto$UniversalMPinStyleDto) {
                        hbc0 hbc0Var2 = this.$pinImages;
                        boolean z2 = this.$isFavorite;
                        this.L$0 = null;
                        this.label = 3;
                        f = a.f(this.this$0, tseVar, (MapObjectPinStyleDto$UniversalMPinStyleDto) obj2, hbc0Var2, z2, this);
                        break;
                    } else if (obj2 instanceof MapObjectPinStyleDto$UniversalLPinOrganizationStyleDto) {
                        a aVar2 = this.this$0;
                        MapObjectPinStyleDto$UniversalLPinOrganizationStyleDto mapObjectPinStyleDto$UniversalLPinOrganizationStyleDto = (MapObjectPinStyleDto$UniversalLPinOrganizationStyleDto) obj2;
                        hbc0 hbc0Var3 = this.$pinImages;
                        boolean z3 = this.$isFavorite;
                        this.L$0 = null;
                        this.label = 4;
                        aVar2.getClass();
                        p2 = aVar2.p(tseVar, mapObjectPinStyleDto$UniversalLPinOrganizationStyleDto.a, mapObjectPinStyleDto$UniversalLPinOrganizationStyleDto.b, mapObjectPinStyleDto$UniversalLPinOrganizationStyleDto.c, mapObjectPinStyleDto$UniversalLPinOrganizationStyleDto.d, true, z3, hbc0Var3, this);
                        break;
                    } else if (obj2 instanceof MapObjectPinStyleDto$UniversalLPinStyleDto) {
                        a aVar3 = this.this$0;
                        MapObjectPinStyleDto$UniversalLPinStyleDto mapObjectPinStyleDto$UniversalLPinStyleDto = (MapObjectPinStyleDto$UniversalLPinStyleDto) obj2;
                        hbc0 hbc0Var4 = this.$pinImages;
                        boolean z4 = this.$isFavorite;
                        this.L$0 = null;
                        this.label = 5;
                        aVar3.getClass();
                        p = aVar3.p(tseVar, mapObjectPinStyleDto$UniversalLPinStyleDto.a, mapObjectPinStyleDto$UniversalLPinStyleDto.b, mapObjectPinStyleDto$UniversalLPinStyleDto.c, mapObjectPinStyleDto$UniversalLPinStyleDto.d, false, z4, hbc0Var4, this);
                        break;
                    } else if (obj2 instanceof MapObjectPinStyleDto$UniversalSelectedPinStyleDto) {
                        this.L$0 = null;
                        this.label = 6;
                        i = a.i(this.this$0, tseVar, (MapObjectPinStyleDto$UniversalSelectedPinStyleDto) obj2, this);
                        break;
                    } else if (obj2 instanceof jo00) {
                        boolean z5 = this.$isFavorite;
                        this.L$0 = null;
                        this.label = 7;
                        e = a.e(this.this$0, tseVar, this.$pinImages, (jo00) obj2, z5, this);
                        break;
                    } else if (obj2 instanceof io00) {
                        boolean z6 = this.$isFavorite;
                        this.L$0 = null;
                        this.label = 8;
                        d = a.d(this.this$0, tseVar, this.$pinImages, (io00) obj2, z6, this);
                        break;
                    } else if (obj2 instanceof MapObjectPinStyleDto$SupermapUniversalMFallbackSelectedPinStyleDto) {
                        a aVar4 = this.this$0;
                        hbc0 hbc0Var5 = this.$pinImages;
                        ImageDto imageDto = ((MapObjectPinStyleDto$SupermapUniversalMFallbackSelectedPinStyleDto) obj2).a;
                        boolean z7 = this.$isFavorite;
                        int j = aVar4.j();
                        int j2 = this.this$0.j();
                        int j3 = this.this$0.j();
                        this.L$0 = null;
                        this.label = 9;
                        m = aVar4.m(tseVar, hbc0Var5, imageDto, null, null, null, z7, j, j2, j3, true, this);
                        break;
                    } else if (obj2 instanceof MapObjectPinStyleDto$SupermapUniversalLSelectedPinStyleDto) {
                        a aVar5 = this.this$0;
                        hbc0 hbc0Var6 = this.$pinImages;
                        MapObjectPinStyleDto$SupermapUniversalLSelectedPinStyleDto mapObjectPinStyleDto$SupermapUniversalLSelectedPinStyleDto = (MapObjectPinStyleDto$SupermapUniversalLSelectedPinStyleDto) obj2;
                        ImageDto imageDto2 = mapObjectPinStyleDto$SupermapUniversalLSelectedPinStyleDto.a;
                        List list = mapObjectPinStyleDto$SupermapUniversalLSelectedPinStyleDto.b;
                        boolean z8 = this.$isFavorite;
                        int intValue = ((Number) aVar5.t.getValue()).intValue();
                        int intValue2 = ((Number) this.this$0.u.getValue()).intValue();
                        int intValue3 = ((Number) this.this$0.v.getValue()).intValue();
                        this.L$0 = null;
                        this.label = 10;
                        l = aVar5.l(tseVar, hbc0Var6, imageDto2, list, null, null, z8, intValue, intValue2, intValue3, this);
                        break;
                    } else if (!jl40.l(obj2, t.INSTANCE)) {
                        w511.b();
                        return null;
                    }
                    return null;
                }
                this.L$0 = null;
                this.label = 1;
                b = a.b(this.this$0, tseVar, (MapObjectPinStyleDto$PinWarDefaultPinStyleDto) obj2, this);
                break;
                return coroutineSingletons;
            case 1:
                b.b(obj);
                b = obj;
                return (fo00) b;
            case 2:
                b.b(obj);
                h = obj;
                return (fo00) h;
            case 3:
                b.b(obj);
                f = obj;
                return (fo00) f;
            case 4:
                b.b(obj);
                p2 = obj;
                return (fo00) p2;
            case 5:
                b.b(obj);
                p = obj;
                return (fo00) p;
            case 6:
                b.b(obj);
                i = obj;
                return (fo00) i;
            case 7:
                b.b(obj);
                e = obj;
                return (fo00) e;
            case 8:
                b.b(obj);
                d = obj;
                return (fo00) d;
            case 9:
                b.b(obj);
                m = obj;
                pn00 pn00Var = (pn00) m;
                if (pn00Var != null) {
                    return new ao00(pn00Var.b);
                }
                return null;
            case 10:
                b.b(obj);
                l = obj;
                on00 on00Var = (on00) l;
                if (on00Var != null) {
                    return new yn00(on00Var.b, on00Var.c);
                }
                return null;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
