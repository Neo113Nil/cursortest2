package xsna;

import com.vk.api.generated.catalog.dto.CatalogSectionResponseObjectDto;
import com.vk.api.generated.channels.dto.ChannelsChannelDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.video.dto.VideoVkliveCategoryDto;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.dto.video.LiveCategory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: CatalogSectionResponseMapper.kt */
/* loaded from: classes16.dex */
public final class afa {
    public final j5a a = new j5a();

    public final hda a(CatalogSectionResponseObjectDto catalogSectionResponseObjectDto) {
        j5a j5aVar = this.a;
        j5aVar.getClass();
        LinkedHashMap z = j5a.z(catalogSectionResponseObjectDto.X1());
        LinkedHashMap F = j5a.F(catalogSectionResponseObjectDto.G());
        LinkedHashMap v = j5a.v(catalogSectionResponseObjectDto.R1(), catalogSectionResponseObjectDto.F());
        HashMap h = j5a.h(catalogSectionResponseObjectDto.B(), catalogSectionResponseObjectDto.U1(), catalogSectionResponseObjectDto.I2());
        LinkedHashMap r = j5a.r(catalogSectionResponseObjectDto.U0());
        LinkedHashMap w = j5a.w(catalogSectionResponseObjectDto.d0());
        LinkedHashMap p = j5a.p(catalogSectionResponseObjectDto.K0());
        qw0 qw0Var = j5aVar.d;
        List<MarketMarketItemDto> t1 = catalogSectionResponseObjectDto.t1();
        qw0Var.getClass();
        LinkedHashMap f = qw0.f(t1);
        LinkedHashMap n = j5a.n(catalogSectionResponseObjectDto.H0());
        LinkedHashMap d = qw0.d(catalogSectionResponseObjectDto.D0());
        LinkedHashMap s = j5a.s(catalogSectionResponseObjectDto.B1());
        LinkedHashMap B = j5a.B(catalogSectionResponseObjectDto.o2());
        LinkedHashMap e = j5a.e(catalogSectionResponseObjectDto.n());
        LinkedHashMap f2 = j5a.f(catalogSectionResponseObjectDto.o());
        LinkedHashMap t = j5aVar.t(catalogSectionResponseObjectDto.E1());
        LinkedHashMap a = j5a.a(catalogSectionResponseObjectDto.i());
        LinkedHashMap j = j5a.j(catalogSectionResponseObjectDto.a0());
        LinkedHashMap q = j5aVar.q(catalogSectionResponseObjectDto.S0());
        LinkedHashMap l = j5a.l(catalogSectionResponseObjectDto.w0());
        LinkedHashMap x = j5a.x(catalogSectionResponseObjectDto.V1());
        LinkedHashMap D = j5a.D(catalogSectionResponseObjectDto.p());
        LinkedHashMap y = j5a.y(catalogSectionResponseObjectDto.W1());
        LinkedHashMap k = j5a.k(catalogSectionResponseObjectDto.l0());
        LinkedHashMap A = j5a.A(catalogSectionResponseObjectDto.l2());
        LinkedHashMap b = j5a.b(catalogSectionResponseObjectDto.j());
        LinkedHashMap g = j5a.g(catalogSectionResponseObjectDto.u());
        LinkedHashMap d2 = j5a.d(catalogSectionResponseObjectDto.l());
        LinkedHashMap m = j5a.m(catalogSectionResponseObjectDto.y0());
        LinkedHashMap o = j5a.o(catalogSectionResponseObjectDto.F0());
        LinkedHashMap E = j5a.E(catalogSectionResponseObjectDto.Q2(), catalogSectionResponseObjectDto.B2());
        LinkedHashMap G = j5a.G(catalogSectionResponseObjectDto.V2(), catalogSectionResponseObjectDto.X1(), catalogSectionResponseObjectDto.K0(), catalogSectionResponseObjectDto.g());
        LinkedHashMap C = j5a.C(catalogSectionResponseObjectDto.y2());
        LinkedHashMap u = j5aVar.u(catalogSectionResponseObjectDto.L1());
        LinkedHashMap b2 = qw0Var.b(catalogSectionResponseObjectDto.R());
        ArrayList a2 = qw0Var.a(catalogSectionResponseObjectDto.b1());
        LinkedHashMap c = qw0Var.c(catalogSectionResponseObjectDto.T());
        LinkedHashMap e2 = qw0Var.e(catalogSectionResponseObjectDto.n1());
        LinkedHashMap c2 = j5a.c(catalogSectionResponseObjectDto.Z());
        List<VideoVkliveCategoryDto> W2 = catalogSectionResponseObjectDto.W2();
        if (W2 == null) {
            W2 = EmptyList.b;
        }
        List<VideoVkliveCategoryDto> list = W2;
        int e3 = on00.e(c5g.u(list, 10));
        if (e3 < 16) {
            e3 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e3);
        for (VideoVkliveCategoryDto videoVkliveCategoryDto : list) {
            String id = videoVkliveCategoryDto.getId();
            String id2 = videoVkliveCategoryDto.getId();
            String title = videoVkliveCategoryDto.getTitle();
            String d3 = videoVkliveCategoryDto.d();
            String type = videoVkliveCategoryDto.getType();
            Integer e4 = videoVkliveCategoryDto.e();
            Pair pair = new Pair(id, new LiveCategory(id2, title, d3, type, e4 != null ? e4.intValue() : 0));
            linkedHashMap.put(pair.i(), pair.j());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        List<ChannelsChannelDto> M = catalogSectionResponseObjectDto.M();
        if (M == null) {
            M = EmptyList.b;
        }
        List<GroupsGroupFullDto> K0 = catalogSectionResponseObjectDto.K0();
        if (K0 == null) {
            K0 = EmptyList.b;
        }
        CatalogExtendedData catalogExtendedData = new CatalogExtendedData(z, p, s, G, null, null, null, null, w, B, e, f2, t, h, E, r, F, a, null, null, null, null, null, null, v, null, f, d, u, j, null, null, q, null, l, x, c, b2, a2, D, e2, C, y, null, k, n, A, b, m, o, null, null, null, g, null, null, d2, null, c2, linkedHashMap2, null, null, j5a.i(M, K0), null, null, null, null, -1023672080, -1294202878, 7, null);
        CatalogSection q2 = up2.q(catalogSectionResponseObjectDto.E2());
        if (q2 == null) {
            q2 = CatalogSection.p;
        }
        return new hda(q2, catalogExtendedData, q2.e);
    }
}
