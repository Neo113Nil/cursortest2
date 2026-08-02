package com.yandex.go.order.external.unifiedpolling;

import com.yandex.go.order.external.unifiedpolling.dto.EatsOrderDto;
import com.yandex.go.order.external.unifiedpolling.dto.card.EatsOrderCardDto;
import com.yandex.go.order.external.unifiedpolling.dto.card.header.EatsOrderCardHeaderDto;
import com.yandex.go.order.external.unifiedpolling.dto.card.status_timeline.EatsOrderCardTimelineDto;
import com.yandex.go.order.external.unifiedpolling.dto.card.status_timeline.EatsOrderCardTimelineItemDto;
import com.yandex.go.order.external.unifiedpolling.dto.courier.EatsOrderCourierDto;
import com.yandex.go.order.external.unifiedpolling.dto.courier.EatsOrderCourierPlacemarkDto;
import com.yandex.go.order.external.unifiedpolling.dto.details.EatsOrderDetailsDto;
import com.yandex.go.order.external.unifiedpolling.dto.place.EatsOrderPlaceDto;
import com.yandex.go.order.external.unifiedpolling.dto.status.EatsOrderStatusDto;
import com.yandex.go.superapp.tracking.models.dto.ImageDto$Tag;
import com.yandex.go.superapp.tracking.models.dto.ImageDto$Url;
import defpackage.cwq0;
import defpackage.dfn;
import defpackage.efn;
import defpackage.ffn;
import defpackage.gfn;
import defpackage.h1p;
import defpackage.h3y;
import defpackage.jl40;
import defpackage.m7x0;
import defpackage.nfn;
import defpackage.ny61;
import defpackage.oen;
import defpackage.p53;
import defpackage.pen;
import defpackage.pfn;
import defpackage.r9v;
import defpackage.ren;
import defpackage.scc;
import defpackage.szv0;
import defpackage.tcc;
import defpackage.ten;
import defpackage.ul51;
import defpackage.uwq0;
import defpackage.v3x;
import defpackage.v6z;
import defpackage.ven;
import defpackage.w511;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.zzs;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.json.b;
import ru.yandex.taxi.eats_orders.domain.entities.order.status.EatsOrderStatus;
import ru.yandex.taxi.experiments.superapp.j;

/* loaded from: classes8.dex */
public final class a {
    public final wnt a;
    public final h3y b;
    public final h3y c;

    public a(wnt wntVar, h3y h3yVar, h3y h3yVar2) {
        this.a = wntVar;
        this.b = h3yVar;
        this.c = h3yVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(b bVar, ContinuationImpl continuationImpl) {
        UnifiedPollingEatsOrdersMapperImpl$map$1 unifiedPollingEatsOrdersMapperImpl$map$1;
        int i;
        if (continuationImpl instanceof UnifiedPollingEatsOrdersMapperImpl$map$1) {
            unifiedPollingEatsOrdersMapperImpl$map$1 = (UnifiedPollingEatsOrdersMapperImpl$map$1) continuationImpl;
            int i2 = unifiedPollingEatsOrdersMapperImpl$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                unifiedPollingEatsOrdersMapperImpl$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj = unifiedPollingEatsOrdersMapperImpl$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = unifiedPollingEatsOrdersMapperImpl$map$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = (j) this.c.get();
                    unifiedPollingEatsOrdersMapperImpl$map$1.L$0 = bVar;
                    unifiedPollingEatsOrdersMapperImpl$map$1.label = 1;
                    ((ul51) jVar.a).getClass();
                    obj = jVar.b.b(unifiedPollingEatsOrdersMapperImpl$map$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar = (b) unifiedPollingEatsOrdersMapperImpl$map$1.L$0;
                    kotlin.b.b(obj);
                }
                return (Serializable) b(bVar, (szv0) obj);
            }
        }
        unifiedPollingEatsOrdersMapperImpl$map$1 = new UnifiedPollingEatsOrdersMapperImpl$map$1(this, continuationImpl);
        Object obj2 = unifiedPollingEatsOrdersMapperImpl$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = unifiedPollingEatsOrdersMapperImpl$map$1.label;
        if (i != 0) {
        }
        return (Serializable) b(bVar, (szv0) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List b(b bVar, szv0 szv0Var) {
        Object failure;
        String valueOf;
        int i;
        EatsOrderStatus eatsOrderStatus;
        Iterator it;
        String str;
        String a;
        String str2;
        EmptyList emptyList;
        String str3;
        String str4;
        EatsOrderCardDto eatsOrderCardDto;
        ten tenVar;
        EatsOrderCardTimelineDto b;
        nfn nfnVar;
        List list;
        Iterator it2;
        ren renVar;
        String a2;
        v6z b2;
        ven venVar;
        String a3;
        String b3;
        float f;
        float[] c;
        Boolean d;
        Number valueOf2;
        a aVar = this;
        int i2 = 0;
        try {
            failure = (List) ((xnt) aVar.a).d(bVar, new p53(EatsOrderDto.Companion.serializer(), 0));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a4 = Result.a(failure);
        EmptyList emptyList2 = EmptyList.a;
        if (a4 != null) {
            v3x.a.h("EatsOrdersMapper", "failed to parse orders", a4);
            return emptyList2;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it3 = ((List) failure).iterator();
        while (it3.hasNext()) {
            EatsOrderDto eatsOrderDto = (EatsOrderDto) it3.next();
            String str5 = eatsOrderDto.l;
            if (str5 == null) {
                v3x.a.getClass();
                it = it3;
                i = i2;
                emptyList = emptyList2;
                renVar = null;
            } else {
                uwq0 a5 = szv0Var.a(str5);
                efn efnVar = (efn) aVar.b.get();
                String str6 = a5 != null ? a5.l : null;
                String str7 = a5 != null ? a5.t : null;
                String str8 = a5 != null ? a5.u : null;
                efnVar.getClass();
                EatsOrderCardDto eatsOrderCardDto2 = eatsOrderDto.p;
                EatsOrderCourierDto eatsOrderCourierDto = eatsOrderDto.h;
                EatsOrderDetailsDto eatsOrderDetailsDto = eatsOrderDto.f;
                if (eatsOrderDetailsDto == null || (valueOf = eatsOrderDetailsDto.getA()) == null) {
                    valueOf = String.valueOf(System.currentTimeMillis());
                }
                efnVar.e.getClass();
                h1p a6 = cwq0.a(str5);
                EatsOrderStatusDto eatsOrderStatusDto = eatsOrderDto.a;
                i = i2;
                int i3 = eatsOrderStatusDto == null ? -1 : dfn.a[eatsOrderStatusDto.ordinal()];
                if (i3 == -1) {
                    eatsOrderStatus = EatsOrderStatus.CANCEL;
                } else if (i3 == 1) {
                    eatsOrderStatus = EatsOrderStatus.CREATED;
                } else if (i3 == 2) {
                    eatsOrderStatus = EatsOrderStatus.COOKING;
                } else if (i3 == 3) {
                    eatsOrderStatus = EatsOrderStatus.DELIVERING;
                } else if (i3 == 4) {
                    eatsOrderStatus = EatsOrderStatus.DELIVERED;
                } else {
                    if (i3 != 5) {
                        w511.b();
                        return null;
                    }
                    eatsOrderStatus = EatsOrderStatus.CANCEL;
                }
                EatsOrderStatus eatsOrderStatus2 = eatsOrderStatus;
                String str9 = eatsOrderDto.b;
                String str10 = eatsOrderDto.k;
                String str11 = eatsOrderDto.c;
                it = it3;
                String str12 = eatsOrderDto.d;
                String str13 = eatsOrderDto.m;
                String str14 = eatsOrderDto.n;
                r9v r9vVar = eatsOrderDto.o;
                if (r9vVar instanceof ImageDto$Tag) {
                    a = ((m7x0) efnVar.a).a(((ImageDto$Tag) r9vVar).getA());
                } else if (r9vVar instanceof ImageDto$Url) {
                    a = ((ImageDto$Url) r9vVar).getA();
                } else {
                    if (r9vVar != null) {
                        w511.b();
                        return null;
                    }
                    str = null;
                    efnVar.b.getClass();
                    if (eatsOrderCourierDto != null || (b2 = eatsOrderCourierDto.getB()) == null) {
                        str2 = str9;
                        emptyList = emptyList2;
                        str3 = str10;
                        str4 = str11;
                        eatsOrderCardDto = eatsOrderCardDto2;
                        tenVar = null;
                    } else {
                        zzs zzsVar = new zzs(b2.getA(), b2.getB(), 0, null, null, 28);
                        EatsOrderCourierPlacemarkDto d2 = eatsOrderCourierDto.getD();
                        if (d2 == null || (a3 = d2.getA()) == null || a3.length() == 0 || (b3 = d2.getB()) == null || b3.length() == 0) {
                            str2 = str9;
                            emptyList = emptyList2;
                            str3 = str10;
                            str4 = str11;
                            eatsOrderCardDto = eatsOrderCardDto2;
                            venVar = null;
                        } else {
                            str2 = str9;
                            emptyList = emptyList2;
                            String b4 = d2.getB();
                            str3 = str10;
                            float[] c2 = d2.getC();
                            float f2 = 0.5f;
                            str4 = str11;
                            if (c2 != null) {
                                Float valueOf3 = c2.length > 0 ? Float.valueOf(c2[i]) : null;
                                if (valueOf3 != null) {
                                    f = valueOf3.floatValue();
                                    c = d2.getC();
                                    if (c != null) {
                                        Float valueOf4 = 1 < c.length ? Float.valueOf(c[1]) : null;
                                        if (valueOf4 != null) {
                                            f2 = valueOf4.floatValue();
                                        }
                                    }
                                    float f3 = f2;
                                    d = d2.getD();
                                    eatsOrderCardDto = eatsOrderCardDto2;
                                    if (!jl40.l(d, Boolean.TRUE)) {
                                        valueOf2 = eatsOrderCourierDto.getC();
                                        if (valueOf2 == null) {
                                            valueOf2 = Float.valueOf(-9999.0f);
                                        }
                                    } else if (jl40.l(d, Boolean.FALSE)) {
                                        valueOf2 = Integer.valueOf(i);
                                    } else {
                                        Integer c3 = eatsOrderCourierDto.getC();
                                        valueOf2 = Integer.valueOf(c3 != null ? c3.intValue() : i);
                                    }
                                    venVar = new ven(b4, f, f3, valueOf2.floatValue());
                                }
                            }
                            f = 0.5f;
                            c = d2.getC();
                            if (c != null) {
                            }
                            float f32 = f2;
                            d = d2.getD();
                            eatsOrderCardDto = eatsOrderCardDto2;
                            if (!jl40.l(d, Boolean.TRUE)) {
                            }
                            venVar = new ven(b4, f, f32, valueOf2.floatValue());
                        }
                        tenVar = new ten(valueOf, zzsVar, str6, venVar);
                    }
                    EatsOrderPlaceDto eatsOrderPlaceDto = eatsOrderDto.g;
                    v6z b5 = eatsOrderPlaceDto == null ? eatsOrderPlaceDto.getB() : null;
                    zzs zzsVar2 = b5 == null ? new zzs(b5.getA(), b5.getB(), 0, null, null, 28) : null;
                    v6z c4 = eatsOrderDetailsDto == null ? eatsOrderDetailsDto.getC() : null;
                    zzs zzsVar3 = c4 == null ? new zzs(c4.getA(), c4.getB(), 0, null, null, 28) : null;
                    Integer num = eatsOrderDto.e;
                    efnVar.c.getClass();
                    b = eatsOrderCardDto.getB();
                    if (b.getD().isEmpty()) {
                        String b6 = b.getB();
                        List d3 = b.getD();
                        ArrayList arrayList2 = new ArrayList(tcc.n(d3, 10));
                        int i4 = i;
                        for (Object obj : d3) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                scc.m();
                                throw null;
                            }
                            EatsOrderCardTimelineItemDto eatsOrderCardTimelineItemDto = (EatsOrderCardTimelineItemDto) obj;
                            arrayList2.add(new pfn(eatsOrderCardTimelineItemDto.getA(), (i4 < b.getA() ? 1 : i) != 0 ? eatsOrderCardTimelineItemDto.getB() : b.getC()));
                            i4 = i5;
                        }
                        nfnVar = new nfn(b.getA(), b6, arrayList2);
                    } else {
                        nfnVar = null;
                    }
                    gfn gfnVar = efnVar.d;
                    EatsOrderCardHeaderDto a7 = eatsOrderCardDto.getA();
                    gfnVar.getClass();
                    ffn ffnVar = a7.getC().length() != 0 ? null : new ffn(a7.getC(), a7.getD(), a7.getB(), a7.getA().getA());
                    pen a8 = efn.a(eatsOrderDto.q);
                    list = eatsOrderDto.r;
                    if (list == null) {
                        list = emptyList;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        pen a9 = efn.a((EatsOrderDto.Button) it2.next());
                        if (a9 != null) {
                            arrayList3.add(a9);
                        }
                    }
                    EatsOrderDto.Action action = eatsOrderDto.s;
                    renVar = new ren(valueOf, a6, eatsOrderStatus2, str2, str3, str4, str12, str13, str14, str, tenVar, zzsVar2, str7, zzsVar3, str8, num, nfnVar, ffnVar, a8, arrayList3, (action != null || (a2 = action.getA()) == null) ? null : new oen(a2));
                }
                str = a;
                efnVar.b.getClass();
                if (eatsOrderCourierDto != null) {
                }
                str2 = str9;
                emptyList = emptyList2;
                str3 = str10;
                str4 = str11;
                eatsOrderCardDto = eatsOrderCardDto2;
                tenVar = null;
                EatsOrderPlaceDto eatsOrderPlaceDto2 = eatsOrderDto.g;
                if (eatsOrderPlaceDto2 == null) {
                }
                if (b5 == null) {
                }
                if (eatsOrderDetailsDto == null) {
                }
                if (c4 == null) {
                }
                Integer num2 = eatsOrderDto.e;
                efnVar.c.getClass();
                b = eatsOrderCardDto.getB();
                if (b.getD().isEmpty()) {
                }
                gfn gfnVar2 = efnVar.d;
                EatsOrderCardHeaderDto a72 = eatsOrderCardDto.getA();
                gfnVar2.getClass();
                if (a72.getC().length() != 0) {
                }
                pen a82 = efn.a(eatsOrderDto.q);
                list = eatsOrderDto.r;
                if (list == null) {
                }
                ArrayList arrayList32 = new ArrayList();
                it2 = list.iterator();
                while (it2.hasNext()) {
                }
                EatsOrderDto.Action action2 = eatsOrderDto.s;
                renVar = new ren(valueOf, a6, eatsOrderStatus2, str2, str3, str4, str12, str13, str14, str, tenVar, zzsVar2, str7, zzsVar3, str8, num2, nfnVar, ffnVar, a82, arrayList32, (action2 != null || (a2 = action2.getA()) == null) ? null : new oen(a2));
            }
            if (renVar != null) {
                arrayList.add(renVar);
            }
            aVar = this;
            i2 = i;
            it3 = it;
            emptyList2 = emptyList;
        }
        return arrayList;
    }
}
