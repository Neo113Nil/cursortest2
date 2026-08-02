package xsna;

import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogBlockItemsDto;
import com.vk.api.generated.catalog.dto.CatalogBlockReplacementDto;
import com.vk.api.generated.catalog.dto.CatalogBlockReplacementsDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.catalog.dto.CatalogReplaceBlocksDto;
import com.vk.api.generated.catalog.dto.CatalogSectionDto;
import com.vk.api.generated.catalog.dto.CatalogSectionResponseObjectDto;
import com.vk.catalog.mvi.domain.CatalogExtraDo;
import com.vk.catalog.mvi.domain.CatalogListenEvent$BlockUpdate;
import com.vk.catalog.mvi.domain.CatalogListenEvent$SectionUpdate;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog.mvi.section.domain.CatalogBlockDo;
import com.vk.catalog.mvi.section.domain.CatalogBlockReplacementDo;
import com.vk.catalog.mvi.section.domain.CatalogBlockReplacementListDo;
import com.vk.catalog.mvi.section.domain.CatalogSectionDo;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: CatalogDtoMapperImpl.kt */
/* loaded from: classes16.dex */
public final class q4a implements o4a {
    public final Map<CatalogBlockVariant, f2a<?>> a;

    /* JADX WARN: Multi-variable type inference failed */
    public q4a(Map<CatalogBlockVariant, ? extends f2a<?>> map) {
        this.a = map;
    }

    @Override // xsna.o4a
    public final List<CatalogSectionDo> a(CatalogCatalogResponseObjectDto catalogCatalogResponseObjectDto) {
        List<CatalogSectionDto> j;
        CatalogExtraResponseObjectDto catalogExtraResponseObjectDto = new CatalogExtraResponseObjectDto(catalogCatalogResponseObjectDto.u(), catalogCatalogResponseObjectDto.i2(), catalogCatalogResponseObjectDto.N0(), catalogCatalogResponseObjectDto.C(), catalogCatalogResponseObjectDto.g3(), catalogCatalogResponseObjectDto.Q2(), catalogCatalogResponseObjectDto.V2(), catalogCatalogResponseObjectDto.M(), catalogCatalogResponseObjectDto.g(), catalogCatalogResponseObjectDto.V0(), catalogCatalogResponseObjectDto.D(), catalogCatalogResponseObjectDto.L1(), catalogCatalogResponseObjectDto.f(), catalogCatalogResponseObjectDto.e(), catalogCatalogResponseObjectDto.B(), catalogCatalogResponseObjectDto.I2(), catalogCatalogResponseObjectDto.q2(), catalogCatalogResponseObjectDto.m2(), catalogCatalogResponseObjectDto.U1(), catalogCatalogResponseObjectDto.T2(), catalogCatalogResponseObjectDto.d0(), catalogCatalogResponseObjectDto.O2(), catalogCatalogResponseObjectDto.N2(), catalogCatalogResponseObjectDto.J2(), catalogCatalogResponseObjectDto.L2(), catalogCatalogResponseObjectDto.K(), catalogCatalogResponseObjectDto.M2(), catalogCatalogResponseObjectDto.i(), catalogCatalogResponseObjectDto.n(), catalogCatalogResponseObjectDto.o(), catalogCatalogResponseObjectDto.p(), catalogCatalogResponseObjectDto.l0(), catalogCatalogResponseObjectDto.P0(), catalogCatalogResponseObjectDto.G2(), catalogCatalogResponseObjectDto.G(), catalogCatalogResponseObjectDto.W(), catalogCatalogResponseObjectDto.Z(), catalogCatalogResponseObjectDto.T(), catalogCatalogResponseObjectDto.d1(), catalogCatalogResponseObjectDto.l2(), catalogCatalogResponseObjectDto.x1(), catalogCatalogResponseObjectDto.F0(), catalogCatalogResponseObjectDto.N1(), catalogCatalogResponseObjectDto.y1(), catalogCatalogResponseObjectDto.t1(), catalogCatalogResponseObjectDto.s1(), catalogCatalogResponseObjectDto.n1(), catalogCatalogResponseObjectDto.d(), catalogCatalogResponseObjectDto.R2(), catalogCatalogResponseObjectDto.b1(), catalogCatalogResponseObjectDto.V1(), catalogCatalogResponseObjectDto.W1(), catalogCatalogResponseObjectDto.X1(), catalogCatalogResponseObjectDto.v0(), catalogCatalogResponseObjectDto.l(), catalogCatalogResponseObjectDto.j(), catalogCatalogResponseObjectDto.k(), catalogCatalogResponseObjectDto.y0(), catalogCatalogResponseObjectDto.U0(), catalogCatalogResponseObjectDto.S0(), catalogCatalogResponseObjectDto.D1(), catalogCatalogResponseObjectDto.D0(), catalogCatalogResponseObjectDto.E2(), catalogCatalogResponseObjectDto.y2(), catalogCatalogResponseObjectDto.R1(), catalogCatalogResponseObjectDto.K0(), catalogCatalogResponseObjectDto.H0(), catalogCatalogResponseObjectDto.o2(), catalogCatalogResponseObjectDto.B1(), catalogCatalogResponseObjectDto.z1(), catalogCatalogResponseObjectDto.B2(), catalogCatalogResponseObjectDto.o1(), catalogCatalogResponseObjectDto.r2(), catalogCatalogResponseObjectDto.w0(), catalogCatalogResponseObjectDto.f3(), catalogCatalogResponseObjectDto.W2(), catalogCatalogResponseObjectDto.E1());
        CatalogCatalogDto F = catalogCatalogResponseObjectDto.F();
        if (F == null || (j = F.j()) == null) {
            return EmptyList.b;
        }
        List<CatalogSectionDto> list = j;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(e(catalogExtraResponseObjectDto, (CatalogSectionDto) it.next()));
        }
        return arrayList;
    }

    @Override // xsna.o4a
    public final CatalogSectionDo b(CatalogSectionResponseObjectDto catalogSectionResponseObjectDto) {
        return e(new CatalogExtraResponseObjectDto(catalogSectionResponseObjectDto.u(), catalogSectionResponseObjectDto.X1(), catalogSectionResponseObjectDto.K0(), catalogSectionResponseObjectDto.C(), catalogSectionResponseObjectDto.g3(), catalogSectionResponseObjectDto.Q2(), catalogSectionResponseObjectDto.V2(), catalogSectionResponseObjectDto.K(), catalogSectionResponseObjectDto.g(), catalogSectionResponseObjectDto.U0(), catalogSectionResponseObjectDto.D(), catalogSectionResponseObjectDto.E1(), catalogSectionResponseObjectDto.f(), catalogSectionResponseObjectDto.e(), catalogSectionResponseObjectDto.B(), catalogSectionResponseObjectDto.I2(), catalogSectionResponseObjectDto.o2(), catalogSectionResponseObjectDto.l2(), catalogSectionResponseObjectDto.R1(), catalogSectionResponseObjectDto.T2(), catalogSectionResponseObjectDto.d0(), catalogSectionResponseObjectDto.O2(), catalogSectionResponseObjectDto.N2(), catalogSectionResponseObjectDto.J2(), catalogSectionResponseObjectDto.L2(), catalogSectionResponseObjectDto.G(), catalogSectionResponseObjectDto.M2(), catalogSectionResponseObjectDto.i(), catalogSectionResponseObjectDto.n(), catalogSectionResponseObjectDto.o(), catalogSectionResponseObjectDto.p(), catalogSectionResponseObjectDto.a0(), catalogSectionResponseObjectDto.N0(), catalogSectionResponseObjectDto.G2(), catalogSectionResponseObjectDto.F(), catalogSectionResponseObjectDto.T(), catalogSectionResponseObjectDto.W(), catalogSectionResponseObjectDto.R(), catalogSectionResponseObjectDto.b1(), catalogSectionResponseObjectDto.i2(), catalogSectionResponseObjectDto.t1(), catalogSectionResponseObjectDto.D0(), catalogSectionResponseObjectDto.L1(), catalogSectionResponseObjectDto.x1(), catalogSectionResponseObjectDto.s1(), catalogSectionResponseObjectDto.o1(), catalogSectionResponseObjectDto.d1(), catalogSectionResponseObjectDto.d(), catalogSectionResponseObjectDto.R2(), catalogSectionResponseObjectDto.V0(), catalogSectionResponseObjectDto.U1(), catalogSectionResponseObjectDto.V1(), catalogSectionResponseObjectDto.W1(), catalogSectionResponseObjectDto.l0(), catalogSectionResponseObjectDto.l(), catalogSectionResponseObjectDto.j(), catalogSectionResponseObjectDto.k(), catalogSectionResponseObjectDto.w0(), catalogSectionResponseObjectDto.S0(), catalogSectionResponseObjectDto.P0(), catalogSectionResponseObjectDto.B1(), catalogSectionResponseObjectDto.y0(), catalogSectionResponseObjectDto.B2(), catalogSectionResponseObjectDto.r2(), catalogSectionResponseObjectDto.N1(), catalogSectionResponseObjectDto.H0(), catalogSectionResponseObjectDto.F0(), catalogSectionResponseObjectDto.m2(), catalogSectionResponseObjectDto.z1(), catalogSectionResponseObjectDto.y1(), catalogSectionResponseObjectDto.y2(), catalogSectionResponseObjectDto.n1(), catalogSectionResponseObjectDto.q2(), catalogSectionResponseObjectDto.v0(), catalogSectionResponseObjectDto.f3(), catalogSectionResponseObjectDto.W2(), catalogSectionResponseObjectDto.D1()), catalogSectionResponseObjectDto.E2());
    }

    public final CatalogBlockDo c(CatalogBlockItemsDto catalogBlockItemsDto) {
        CatalogExtraResponseObjectDto catalogExtraResponseObjectDto = new CatalogExtraResponseObjectDto(catalogBlockItemsDto.u(), catalogBlockItemsDto.i2(), catalogBlockItemsDto.N0(), catalogBlockItemsDto.C(), catalogBlockItemsDto.g3(), catalogBlockItemsDto.Q2(), catalogBlockItemsDto.V2(), catalogBlockItemsDto.M(), catalogBlockItemsDto.g(), catalogBlockItemsDto.V0(), catalogBlockItemsDto.D(), catalogBlockItemsDto.L1(), catalogBlockItemsDto.f(), catalogBlockItemsDto.e(), catalogBlockItemsDto.B(), catalogBlockItemsDto.I2(), catalogBlockItemsDto.q2(), catalogBlockItemsDto.m2(), catalogBlockItemsDto.U1(), catalogBlockItemsDto.T2(), catalogBlockItemsDto.d0(), catalogBlockItemsDto.O2(), catalogBlockItemsDto.N2(), catalogBlockItemsDto.J2(), catalogBlockItemsDto.L2(), catalogBlockItemsDto.K(), catalogBlockItemsDto.M2(), catalogBlockItemsDto.i(), catalogBlockItemsDto.n(), catalogBlockItemsDto.o(), catalogBlockItemsDto.p(), catalogBlockItemsDto.l0(), catalogBlockItemsDto.P0(), catalogBlockItemsDto.G2(), catalogBlockItemsDto.G(), catalogBlockItemsDto.W(), catalogBlockItemsDto.Z(), catalogBlockItemsDto.T(), catalogBlockItemsDto.d1(), catalogBlockItemsDto.l2(), catalogBlockItemsDto.x1(), catalogBlockItemsDto.F0(), catalogBlockItemsDto.N1(), catalogBlockItemsDto.y1(), catalogBlockItemsDto.t1(), catalogBlockItemsDto.s1(), catalogBlockItemsDto.n1(), catalogBlockItemsDto.d(), catalogBlockItemsDto.R2(), catalogBlockItemsDto.b1(), catalogBlockItemsDto.V1(), catalogBlockItemsDto.W1(), catalogBlockItemsDto.X1(), catalogBlockItemsDto.v0(), catalogBlockItemsDto.l(), catalogBlockItemsDto.j(), catalogBlockItemsDto.k(), catalogBlockItemsDto.y0(), catalogBlockItemsDto.U0(), catalogBlockItemsDto.S0(), catalogBlockItemsDto.D1(), catalogBlockItemsDto.D0(), catalogBlockItemsDto.E2(), catalogBlockItemsDto.y2(), catalogBlockItemsDto.R1(), catalogBlockItemsDto.K0(), catalogBlockItemsDto.H0(), catalogBlockItemsDto.o2(), catalogBlockItemsDto.B1(), catalogBlockItemsDto.z1(), catalogBlockItemsDto.B2(), catalogBlockItemsDto.o1(), catalogBlockItemsDto.r2(), catalogBlockItemsDto.w0(), catalogBlockItemsDto.f3(), catalogBlockItemsDto.W2(), catalogBlockItemsDto.E1());
        CatalogBlockDto F = catalogBlockItemsDto.F();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        return new CatalogBlockDo(f(F, catalogExtraResponseObjectDto, linkedHashMap, linkedHashSet), new CatalogExtraDo(F != null ? F.V1() : null, linkedHashMap, linkedHashSet));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CatalogBlockReplacementListDo d(CatalogReplaceBlocksDto catalogReplaceBlocksDto) {
        EmptyList emptyList;
        List<CatalogBlockReplacementDto> e;
        List list;
        CatalogExtraResponseObjectDto catalogExtraResponseObjectDto = new CatalogExtraResponseObjectDto(catalogReplaceBlocksDto.u(), catalogReplaceBlocksDto.X1(), catalogReplaceBlocksDto.K0(), catalogReplaceBlocksDto.C(), catalogReplaceBlocksDto.g3(), catalogReplaceBlocksDto.Q2(), catalogReplaceBlocksDto.V2(), catalogReplaceBlocksDto.K(), catalogReplaceBlocksDto.g(), catalogReplaceBlocksDto.U0(), catalogReplaceBlocksDto.D(), catalogReplaceBlocksDto.E1(), catalogReplaceBlocksDto.f(), catalogReplaceBlocksDto.e(), catalogReplaceBlocksDto.B(), catalogReplaceBlocksDto.I2(), catalogReplaceBlocksDto.o2(), catalogReplaceBlocksDto.l2(), catalogReplaceBlocksDto.R1(), catalogReplaceBlocksDto.T2(), catalogReplaceBlocksDto.d0(), catalogReplaceBlocksDto.O2(), catalogReplaceBlocksDto.N2(), catalogReplaceBlocksDto.J2(), catalogReplaceBlocksDto.L2(), catalogReplaceBlocksDto.G(), catalogReplaceBlocksDto.M2(), catalogReplaceBlocksDto.i(), catalogReplaceBlocksDto.n(), catalogReplaceBlocksDto.o(), catalogReplaceBlocksDto.p(), catalogReplaceBlocksDto.a0(), catalogReplaceBlocksDto.N0(), catalogReplaceBlocksDto.G2(), catalogReplaceBlocksDto.F(), catalogReplaceBlocksDto.T(), catalogReplaceBlocksDto.W(), catalogReplaceBlocksDto.R(), catalogReplaceBlocksDto.b1(), catalogReplaceBlocksDto.i2(), catalogReplaceBlocksDto.t1(), catalogReplaceBlocksDto.D0(), catalogReplaceBlocksDto.L1(), catalogReplaceBlocksDto.x1(), catalogReplaceBlocksDto.s1(), catalogReplaceBlocksDto.o1(), catalogReplaceBlocksDto.d1(), catalogReplaceBlocksDto.d(), catalogReplaceBlocksDto.R2(), catalogReplaceBlocksDto.V0(), catalogReplaceBlocksDto.U1(), catalogReplaceBlocksDto.V1(), catalogReplaceBlocksDto.W1(), catalogReplaceBlocksDto.l0(), catalogReplaceBlocksDto.l(), catalogReplaceBlocksDto.j(), catalogReplaceBlocksDto.k(), catalogReplaceBlocksDto.w0(), catalogReplaceBlocksDto.S0(), catalogReplaceBlocksDto.P0(), catalogReplaceBlocksDto.B1(), catalogReplaceBlocksDto.y0(), catalogReplaceBlocksDto.E2(), catalogReplaceBlocksDto.y2(), catalogReplaceBlocksDto.N1(), catalogReplaceBlocksDto.H0(), catalogReplaceBlocksDto.F0(), catalogReplaceBlocksDto.m2(), catalogReplaceBlocksDto.z1(), catalogReplaceBlocksDto.y1(), catalogReplaceBlocksDto.B2(), catalogReplaceBlocksDto.n1(), catalogReplaceBlocksDto.r2(), catalogReplaceBlocksDto.v0(), catalogReplaceBlocksDto.f3(), catalogReplaceBlocksDto.W2(), catalogReplaceBlocksDto.D1());
        CatalogBlockReplacementsDto q2 = catalogReplaceBlocksDto.q2();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (q2 == null || (e = q2.e()) == null) {
            emptyList = EmptyList.b;
        } else {
            List<CatalogBlockReplacementDto> list2 = e;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            for (CatalogBlockReplacementDto catalogBlockReplacementDto : list2) {
                List<String> d = catalogBlockReplacementDto.d();
                if (d == null) {
                    d = EmptyList.b;
                }
                List<CatalogBlockDto> e2 = catalogBlockReplacementDto.e();
                if (e2 != null) {
                    List<CatalogBlockDto> list3 = e2;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(f((CatalogBlockDto) it.next(), catalogExtraResponseObjectDto, linkedHashMap, linkedHashSet));
                    }
                    list = c5g.v(arrayList2);
                } else {
                    list = EmptyList.b;
                }
                arrayList.add(new CatalogBlockReplacementDo(d, list));
            }
            emptyList = arrayList;
        }
        return new CatalogBlockReplacementListDo(emptyList, new CatalogExtraDo(q2 != null ? q2.d() : null, linkedHashMap, linkedHashSet));
    }

    public final CatalogSectionDo e(CatalogExtraResponseObjectDto catalogExtraResponseObjectDto, CatalogSectionDto catalogSectionDto) {
        List list;
        List<CatalogBlockDto> g;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (catalogSectionDto == null || (g = catalogSectionDto.g()) == null) {
            list = EmptyList.b;
        } else {
            List<CatalogBlockDto> list2 = g;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(f((CatalogBlockDto) it.next(), catalogExtraResponseObjectDto, linkedHashMap, linkedHashSet));
            }
            list = c5g.v(arrayList);
        }
        String id = catalogSectionDto != null ? catalogSectionDto.getId() : null;
        if (id == null) {
            id = "";
        }
        return new CatalogSectionDo(id, list, new CatalogExtraDo(catalogSectionDto != null ? catalogSectionDto.l() : null, linkedHashMap, linkedHashSet));
    }

    public final List f(CatalogBlockDto catalogBlockDto, CatalogExtraResponseObjectDto catalogExtraResponseObjectDto, LinkedHashMap linkedHashMap, LinkedHashSet linkedHashSet) {
        List a;
        Object obj;
        Object obj2;
        if (catalogBlockDto == null) {
            return EmptyList.b;
        }
        CatalogBlockVariant.Companion.getClass();
        CatalogBlockVariant a2 = CatalogBlockVariant.a.a(catalogBlockDto);
        a2.getClass();
        if (a2 == CatalogBlockVariant.UnknownBlock) {
            L.k(new pu(catalogBlockDto, 15));
        }
        f2a<?> f2aVar = this.a.get(a2);
        if (f2aVar == null) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.e, new Object[]{"CatalogDtoMapper has no registered mapper for " + a2});
            }
        }
        Pair pair = new Pair(f2aVar, a2);
        f2a f2aVar2 = (f2a) pair.d();
        CatalogBlockVariant catalogBlockVariant = (CatalogBlockVariant) pair.g();
        List<String> s1 = catalogBlockDto.s1();
        if (s1 != null) {
            for (String str : s1) {
                CatalogListenEvent$SectionUpdate.Companion.getClass();
                Iterator<E> it = CatalogListenEvent$SectionUpdate.i().iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (epx.f(((CatalogListenEvent$SectionUpdate) obj2).h(), str)) {
                        break;
                    }
                }
                CatalogListenEvent$SectionUpdate catalogListenEvent$SectionUpdate = (CatalogListenEvent$SectionUpdate) obj2;
                if (catalogListenEvent$SectionUpdate != null) {
                    linkedHashSet.add(catalogListenEvent$SectionUpdate);
                }
                CatalogListenEvent$BlockUpdate.Companion.getClass();
                Iterator<E> it2 = CatalogListenEvent$BlockUpdate.i().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (epx.f(((CatalogListenEvent$BlockUpdate) next).h(), str)) {
                        obj = next;
                        break;
                    }
                }
                CatalogListenEvent$BlockUpdate catalogListenEvent$BlockUpdate = (CatalogListenEvent$BlockUpdate) obj;
                if (catalogListenEvent$BlockUpdate != null) {
                    Object obj3 = linkedHashMap.get(catalogListenEvent$BlockUpdate);
                    if (obj3 == null) {
                        obj3 = new LinkedHashSet();
                        linkedHashMap.put(catalogListenEvent$BlockUpdate, obj3);
                    }
                    ((Set) obj3).add(catalogBlockDto.getId());
                }
            }
        }
        return (f2aVar2 == null || (a = f2aVar2.a(catalogExtraResponseObjectDto, catalogBlockDto, catalogBlockVariant)) == null) ? EmptyList.b : a;
    }
}
