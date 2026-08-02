package xsna;

import com.vk.api.generated.audioBooks.dto.AudioBooksItemPersonDto;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogButtonDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.catalog.dto.CatalogFooterDto;
import com.vk.api.generated.catalog.dto.CatalogHeaderDto;
import com.vk.api.generated.catalog.dto.CatalogSectionDto;
import com.vk.api.generated.catalog.dto.CatalogTextDto;
import com.vk.api.generated.channels.dto.ChannelsChannelDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.search.dto.SearchFilterItemBinaryDto;
import com.vk.api.generated.search.dto.SearchFilterItemDto;
import com.vk.api.generated.search.dto.SearchFilterItemSelectionDto;
import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogText;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.dto.music.audiobook.AudioBookPerson;
import com.vk.dto.search.SearchFilterItem;
import com.vk.dto.search.SearchQuickInnerFilterItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: CatalogCatalogMapper.kt */
/* loaded from: classes16.dex */
public final class e3a {
    /* JADX WARN: Removed duplicated region for block: B:103:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0339  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CatalogExtendedData a(CatalogCatalogResponseObjectDto catalogCatalogResponseObjectDto) {
        SearchFilterItem searchFilterItem;
        Boolean g;
        String f;
        String d;
        SearchFilterItemSelectionDto searchFilterItemSelectionDto;
        SearchFilterItemSelectionDto searchFilterItemSelectionDto2;
        String str;
        String d2;
        String str2;
        String d3;
        String str3;
        String d4;
        List<SearchFilterItemSelectionDto> e;
        Integer e2;
        Object obj;
        Object obj2;
        j5a j5aVar = new j5a();
        LinkedHashMap z = j5a.z(catalogCatalogResponseObjectDto.i2());
        LinkedHashMap F = j5a.F(catalogCatalogResponseObjectDto.K());
        LinkedHashMap v = j5a.v(catalogCatalogResponseObjectDto.U1(), catalogCatalogResponseObjectDto.G());
        HashMap h = j5a.h(catalogCatalogResponseObjectDto.B(), catalogCatalogResponseObjectDto.V1(), catalogCatalogResponseObjectDto.I2());
        LinkedHashMap r = j5a.r(catalogCatalogResponseObjectDto.V0());
        LinkedHashMap w = j5a.w(catalogCatalogResponseObjectDto.d0());
        LinkedHashMap p = j5a.p(catalogCatalogResponseObjectDto.N0());
        List<MarketMarketItemDto> x1 = catalogCatalogResponseObjectDto.x1();
        qw0 qw0Var = j5aVar.d;
        qw0Var.getClass();
        LinkedHashMap f2 = qw0.f(x1);
        LinkedHashMap n = j5a.n(catalogCatalogResponseObjectDto.K0());
        LinkedHashMap d5 = qw0.d(catalogCatalogResponseObjectDto.F0());
        LinkedHashMap s = j5a.s(catalogCatalogResponseObjectDto.D1());
        LinkedHashMap B = j5a.B(catalogCatalogResponseObjectDto.q2());
        LinkedHashMap e3 = j5a.e(catalogCatalogResponseObjectDto.n());
        LinkedHashMap f3 = j5a.f(catalogCatalogResponseObjectDto.o());
        LinkedHashMap t = j5aVar.t(catalogCatalogResponseObjectDto.L1());
        LinkedHashMap a = j5a.a(catalogCatalogResponseObjectDto.i());
        LinkedHashMap j = j5a.j(catalogCatalogResponseObjectDto.l0());
        LinkedHashMap q = j5aVar.q(catalogCatalogResponseObjectDto.U0());
        LinkedHashMap l = j5a.l(catalogCatalogResponseObjectDto.y0());
        LinkedHashMap x = j5a.x(catalogCatalogResponseObjectDto.W1());
        LinkedHashMap D = j5a.D(catalogCatalogResponseObjectDto.p());
        LinkedHashMap y = j5a.y(catalogCatalogResponseObjectDto.X1());
        LinkedHashMap k = j5a.k(catalogCatalogResponseObjectDto.v0());
        LinkedHashMap A = j5a.A(catalogCatalogResponseObjectDto.m2());
        LinkedHashMap b = j5a.b(catalogCatalogResponseObjectDto.j());
        List<AudioBooksItemPersonDto> k2 = catalogCatalogResponseObjectDto.k();
        if (k2 == null) {
            k2 = EmptyList.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AudioBooksItemPersonDto audioBooksItemPersonDto : k2) {
            String valueOf = String.valueOf(audioBooksItemPersonDto.getId());
            ne6 ne6Var = bl4.a;
            linkedHashMap.put(valueOf, (AudioBookPerson) j5g.Y(bl4.a(Collections.singletonList(audioBooksItemPersonDto))));
        }
        LinkedHashMap g2 = j5a.g(catalogCatalogResponseObjectDto.u());
        LinkedHashMap d6 = j5a.d(catalogCatalogResponseObjectDto.l());
        LinkedHashMap m = j5a.m(catalogCatalogResponseObjectDto.D0());
        LinkedHashMap o = j5a.o(catalogCatalogResponseObjectDto.H0());
        LinkedHashMap E = j5a.E(catalogCatalogResponseObjectDto.Q2(), catalogCatalogResponseObjectDto.E2());
        LinkedHashMap G = j5a.G(catalogCatalogResponseObjectDto.V2(), catalogCatalogResponseObjectDto.i2(), catalogCatalogResponseObjectDto.N0(), catalogCatalogResponseObjectDto.g());
        LinkedHashMap C = j5a.C(catalogCatalogResponseObjectDto.B2());
        LinkedHashMap u = j5aVar.u(catalogCatalogResponseObjectDto.N1());
        LinkedHashMap b2 = qw0Var.b(catalogCatalogResponseObjectDto.T());
        ArrayList a2 = qw0Var.a(catalogCatalogResponseObjectDto.d1());
        LinkedHashMap c = qw0Var.c(catalogCatalogResponseObjectDto.W());
        LinkedHashMap e4 = qw0Var.e(catalogCatalogResponseObjectDto.o1());
        List<CatalogTextDto> R2 = catalogCatalogResponseObjectDto.R2();
        if (R2 == null) {
            R2 = EmptyList.b;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = R2.iterator();
        while (it.hasNext()) {
            CatalogTextDto catalogTextDto = (CatalogTextDto) it.next();
            String valueOf2 = String.valueOf(catalogTextDto.getId());
            String id = catalogTextDto.getId();
            Iterator it2 = it;
            String str4 = id == null ? "" : id;
            String e5 = catalogTextDto.e();
            LinkedHashMap linkedHashMap3 = G;
            String str5 = e5 == null ? "" : e5;
            Integer d7 = catalogTextDto.d();
            linkedHashMap2.put(valueOf2, new CatalogText(str4, "", str5, d7 != null ? d7.intValue() : 0));
            it = it2;
            G = linkedHashMap3;
        }
        LinkedHashMap linkedHashMap4 = G;
        LinkedHashMap c2 = j5a.c(catalogCatalogResponseObjectDto.a0());
        List<ChannelsChannelDto> R = catalogCatalogResponseObjectDto.R();
        if (R == null) {
            R = EmptyList.b;
        }
        List<GroupsGroupFullDto> N0 = catalogCatalogResponseObjectDto.N0();
        if (N0 == null) {
            N0 = EmptyList.b;
        }
        LinkedHashMap i = j5a.i(R, N0);
        List<SearchFilterItemDto> y2 = catalogCatalogResponseObjectDto.y2();
        if (y2 == null) {
            y2 = EmptyList.b;
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        Iterator it3 = y2.iterator();
        while (it3.hasNext()) {
            SearchFilterItemDto searchFilterItemDto = (SearchFilterItemDto) it3.next();
            String id2 = searchFilterItemDto.getId();
            int i2 = sda.$EnumSwitchMapping$0[searchFilterItemDto.i().ordinal()];
            Iterator it4 = it3;
            if (i2 == 1) {
                String id3 = searchFilterItemDto.getId();
                String title = searchFilterItemDto.getTitle();
                String str6 = title == null ? "" : title;
                SearchFilterItemBinaryDto d8 = searchFilterItemDto.d();
                String str7 = (d8 == null || (d = d8.d()) == null) ? "" : d;
                String r2 = searchFilterItemDto.r();
                String str8 = r2 == null ? "" : r2;
                SearchFilterItemBinaryDto d9 = searchFilterItemDto.d();
                String str9 = (d9 == null || (f = d9.f()) == null) ? "" : f;
                SearchFilterItemBinaryDto d10 = searchFilterItemDto.d();
                Integer e6 = d10 != null ? d10.e() : null;
                SearchFilterItemBinaryDto d11 = searchFilterItemDto.d();
                boolean booleanValue = (d11 == null || (g = d11.g()) == null) ? false : g.booleanValue();
                String i3 = searchFilterItemDto.i().i();
                Boolean j2 = searchFilterItemDto.j();
                boolean booleanValue2 = j2 != null ? j2.booleanValue() : false;
                Boolean f4 = searchFilterItemDto.f();
                boolean booleanValue3 = f4 != null ? f4.booleanValue() : true;
                String g3 = searchFilterItemDto.g();
                searchFilterItem = new SearchFilterItem(id3, str6, str7, str8, str9, e6, booleanValue, false, i3, booleanValue2, booleanValue3, g3 == null ? "" : g3, EmptyList.b);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                List<SearchFilterItemSelectionDto> e7 = searchFilterItemDto.e();
                if (e7 != null) {
                    Iterator<T> it5 = e7.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it5.next();
                        if (((SearchFilterItemSelectionDto) obj2).i()) {
                            break;
                        }
                    }
                    searchFilterItemSelectionDto = (SearchFilterItemSelectionDto) obj2;
                } else {
                    searchFilterItemSelectionDto = null;
                }
                List<SearchFilterItemSelectionDto> e8 = searchFilterItemDto.e();
                if (e8 != null) {
                    Iterator<T> it6 = e8.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it6.next();
                        if (((SearchFilterItemSelectionDto) obj).I()) {
                            break;
                        }
                    }
                    searchFilterItemSelectionDto2 = (SearchFilterItemSelectionDto) obj;
                } else {
                    searchFilterItemSelectionDto2 = null;
                }
                String id4 = searchFilterItemDto.getId();
                String title2 = searchFilterItemDto.getTitle();
                String str10 = title2 == null ? "" : title2;
                if (searchFilterItemSelectionDto == null || (d2 = searchFilterItemSelectionDto.d()) == null) {
                    if (searchFilterItemSelectionDto2 != null) {
                        d2 = searchFilterItemSelectionDto2.d();
                    } else {
                        str = "";
                        if (searchFilterItemSelectionDto != null || (d3 = searchFilterItemSelectionDto.d()) == null) {
                            if (searchFilterItemSelectionDto2 == null) {
                                d3 = searchFilterItemSelectionDto2.d();
                            } else {
                                str2 = "";
                                if (searchFilterItemSelectionDto != null || (d4 = searchFilterItemSelectionDto.d()) == null) {
                                    if (searchFilterItemSelectionDto2 == null) {
                                        d4 = searchFilterItemSelectionDto2.d();
                                    } else {
                                        str3 = "";
                                        Integer e9 = (searchFilterItemSelectionDto != null || (e2 = searchFilterItemSelectionDto.e()) == null) ? searchFilterItemSelectionDto2 != null ? searchFilterItemSelectionDto2.e() : null : e2;
                                        boolean i4 = searchFilterItemSelectionDto == null ? searchFilterItemSelectionDto.i() : false;
                                        boolean I = searchFilterItemSelectionDto == null ? searchFilterItemSelectionDto.I() : false;
                                        String i5 = searchFilterItemDto.i().i();
                                        Boolean j3 = searchFilterItemDto.j();
                                        boolean booleanValue4 = j3 == null ? j3.booleanValue() : false;
                                        Boolean f5 = searchFilterItemDto.f();
                                        boolean booleanValue5 = f5 == null ? f5.booleanValue() : true;
                                        String g4 = searchFilterItemDto.g();
                                        String str11 = g4 != null ? "" : g4;
                                        e = searchFilterItemDto.e();
                                        if (e == null) {
                                            e = EmptyList.b;
                                        }
                                        List<SearchFilterItemSelectionDto> list = e;
                                        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                                        for (SearchFilterItemSelectionDto searchFilterItemSelectionDto3 : list) {
                                            String title3 = searchFilterItemSelectionDto3.getTitle();
                                            String d12 = searchFilterItemSelectionDto3.d();
                                            String r3 = searchFilterItemSelectionDto3.r();
                                            String str12 = r3 == null ? "" : r3;
                                            String f6 = searchFilterItemSelectionDto3.f();
                                            arrayList.add(new SearchQuickInnerFilterItem(title3, d12, str12, f6 == null ? "" : f6, searchFilterItemSelectionDto3.e(), searchFilterItemSelectionDto3.i(), searchFilterItemSelectionDto3.I(), SearchFilterItemDto.TypeDto.FILTER_SELECTION.i(), searchFilterItemSelectionDto3.g(), false, ""));
                                        }
                                        searchFilterItem = new SearchFilterItem(id4, str10, str, str2, str3, e9, i4, I, i5, booleanValue4, booleanValue5, str11, arrayList);
                                    }
                                }
                                str3 = d4;
                                if (searchFilterItemSelectionDto != null) {
                                }
                                if (searchFilterItemSelectionDto == null) {
                                }
                                if (searchFilterItemSelectionDto == null) {
                                }
                                String i52 = searchFilterItemDto.i().i();
                                Boolean j32 = searchFilterItemDto.j();
                                if (j32 == null) {
                                }
                                Boolean f52 = searchFilterItemDto.f();
                                if (f52 == null) {
                                }
                                String g42 = searchFilterItemDto.g();
                                if (g42 != null) {
                                }
                                e = searchFilterItemDto.e();
                                if (e == null) {
                                }
                                List<SearchFilterItemSelectionDto> list2 = e;
                                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                                while (r0.hasNext()) {
                                }
                                searchFilterItem = new SearchFilterItem(id4, str10, str, str2, str3, e9, i4, I, i52, booleanValue4, booleanValue5, str11, arrayList2);
                            }
                        }
                        str2 = d3;
                        if (searchFilterItemSelectionDto != null) {
                        }
                        if (searchFilterItemSelectionDto2 == null) {
                        }
                    }
                }
                str = d2;
                if (searchFilterItemSelectionDto != null) {
                }
                if (searchFilterItemSelectionDto2 == null) {
                }
            }
            linkedHashMap5.put(id2, searchFilterItem);
            it3 = it4;
        }
        return new CatalogExtendedData(z, p, s, linkedHashMap4, null, null, null, null, w, B, e3, f3, t, h, E, r, F, a, null, null, null, null, null, null, v, null, f2, d5, u, j, linkedHashMap2, null, q, null, l, x, c, b2, a2, D, e4, C, y, null, k, n, A, b, m, o, null, null, null, g2, null, linkedHashMap, d6, linkedHashMap5, c2, null, null, null, i, null, null, null, null, -2097413904, -1201928190, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
    public static hda b(CatalogCatalogResponseObjectDto catalogCatalogResponseObjectDto) {
        ?? r5;
        Object obj;
        CatalogSection catalogSection;
        CatalogSection catalogSection2;
        List list;
        List<CatalogButtonDto> d;
        CatalogFooterDto f;
        ArrayList arrayList;
        CatalogHeaderDto g;
        ArrayList arrayList2;
        List<CatalogSectionDto> j;
        CatalogExtendedData a = a(catalogCatalogResponseObjectDto);
        CatalogCatalogDto F = catalogCatalogResponseObjectDto.F();
        String e = F != null ? F.e() : null;
        CatalogCatalogDto F2 = catalogCatalogResponseObjectDto.F();
        if (F2 == null || (j = F2.j()) == null) {
            r5 = EmptyList.b;
        } else {
            List<CatalogSectionDto> list2 = j;
            r5 = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                CatalogSection q = up2.q((CatalogSectionDto) it.next());
                if (q == null) {
                    q = CatalogSection.p;
                }
                r5.add(q);
            }
        }
        List list3 = r5;
        Iterator it2 = list3.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (epx.f(((CatalogSection) obj).b, e)) {
                break;
            }
        }
        CatalogSection catalogSection3 = (CatalogSection) obj;
        CatalogCatalogDto F3 = catalogCatalogResponseObjectDto.F();
        if (F3 == null || (g = F3.g()) == null) {
            catalogSection = CatalogSection.p;
        } else {
            z1a z1aVar = new z1a();
            CatalogSection catalogSection4 = CatalogSection.p;
            List<CatalogBlockDto> d2 = g.d();
            if (d2 != null) {
                List<CatalogBlockDto> list4 = d2;
                ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
                Iterator it3 = list4.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(z1aVar.b((CatalogBlockDto) it3.next(), ""));
                }
                arrayList2 = new ArrayList(arrayList3);
            } else {
                arrayList2 = new ArrayList();
            }
            catalogSection = CatalogSection.zb(catalogSection4, null, null, null, arrayList2, 16255);
        }
        CatalogSection catalogSection5 = catalogSection;
        CatalogCatalogDto F4 = catalogCatalogResponseObjectDto.F();
        if (F4 == null || (f = F4.f()) == null) {
            catalogSection2 = CatalogSection.p;
        } else {
            z1a z1aVar2 = new z1a();
            CatalogSection catalogSection6 = CatalogSection.p;
            List<CatalogBlockDto> d3 = f.d();
            if (d3 != null) {
                List<CatalogBlockDto> list5 = d3;
                ArrayList arrayList4 = new ArrayList(c5g.u(list5, 10));
                Iterator it4 = list5.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(z1aVar2.b((CatalogBlockDto) it4.next(), ""));
                }
                arrayList = new ArrayList(arrayList4);
            } else {
                arrayList = new ArrayList();
            }
            catalogSection2 = CatalogSection.zb(catalogSection6, null, null, null, arrayList, 16255);
        }
        CatalogSection catalogSection7 = catalogSection2;
        CatalogCatalogDto F5 = catalogCatalogResponseObjectDto.F();
        String i = F5 != null ? F5.i() : null;
        t2a t2aVar = new t2a();
        CatalogCatalogDto F6 = catalogCatalogResponseObjectDto.F();
        if (F6 == null || (d = F6.d()) == null) {
            list = EmptyList.b;
        } else {
            list = new ArrayList();
            Iterator it5 = d.iterator();
            while (it5.hasNext()) {
                CatalogButton c = t2aVar.c((CatalogButtonDto) it5.next());
                if (c != null) {
                    list.add(c);
                }
            }
        }
        return new hda(new CatalogCatalog(list3, e == null ? "" : e, catalogSection5, catalogSection7, i, list, false, 64, null), a, catalogSection3 != null ? catalogSection3.e : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static hda c(CatalogCatalogResponseObjectDto catalogCatalogResponseObjectDto) {
        List<CatalogSectionDto> j;
        CatalogExtendedData a = a(catalogCatalogResponseObjectDto);
        CatalogCatalogDto F = catalogCatalogResponseObjectDto.F();
        CatalogSectionDto catalogSectionDto = null;
        String e = F != null ? F.e() : null;
        CatalogCatalogDto F2 = catalogCatalogResponseObjectDto.F();
        if (F2 != null && (j = F2.j()) != null) {
            Iterator<T> it = j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (epx.f(((CatalogSectionDto) next).getId(), e)) {
                    catalogSectionDto = next;
                    break;
                }
            }
            catalogSectionDto = catalogSectionDto;
        }
        CatalogSection q = up2.q(catalogSectionDto);
        if (q == null) {
            q = CatalogSection.p;
        }
        return new hda(q, a, q.e);
    }

    public static hda d(CatalogCatalogResponseObjectDto catalogCatalogResponseObjectDto) {
        List<CatalogSectionDto> j;
        CatalogExtendedData a = a(catalogCatalogResponseObjectDto);
        CatalogCatalogDto F = catalogCatalogResponseObjectDto.F();
        CatalogSection q = up2.q((F == null || (j = F.j()) == null) ? null : (CatalogSectionDto) j5g.A0(j));
        if (q == null) {
            q = CatalogSection.p;
        }
        return new hda(q, a, q.e);
    }
}
