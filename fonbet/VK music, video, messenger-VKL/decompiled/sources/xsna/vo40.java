package xsna;

import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogBlockReplacementDto;
import com.vk.api.generated.catalog.dto.CatalogBlockReplacementsDto;
import com.vk.api.generated.catalog.dto.CatalogReplaceBlocksDto;
import com.vk.api.generated.channels.dto.ChannelsChannelDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacement;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacementResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MusicMyAudiosCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class vo40 extends FunctionReferenceImpl implements izs<CatalogReplaceBlocksDto, CatalogReplacementResponse> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    @Override // xsna.izs
    public final CatalogReplacementResponse invoke(CatalogReplaceBlocksDto catalogReplaceBlocksDto) {
        ?? r4;
        List<CatalogBlockReplacementDto> e;
        ?? r8;
        CatalogReplaceBlocksDto catalogReplaceBlocksDto2 = catalogReplaceBlocksDto;
        ada adaVar = (ada) this.receiver;
        j5a j5aVar = adaVar.a;
        j5aVar.getClass();
        LinkedHashMap z = j5a.z(catalogReplaceBlocksDto2.X1());
        LinkedHashMap F = j5a.F(catalogReplaceBlocksDto2.G());
        LinkedHashMap v = j5a.v(catalogReplaceBlocksDto2.R1(), catalogReplaceBlocksDto2.F());
        HashMap h = j5a.h(catalogReplaceBlocksDto2.B(), catalogReplaceBlocksDto2.U1(), catalogReplaceBlocksDto2.I2());
        LinkedHashMap r = j5a.r(catalogReplaceBlocksDto2.U0());
        LinkedHashMap w = j5a.w(catalogReplaceBlocksDto2.d0());
        LinkedHashMap p = j5a.p(catalogReplaceBlocksDto2.K0());
        qw0 qw0Var = j5aVar.d;
        List<MarketMarketItemDto> t1 = catalogReplaceBlocksDto2.t1();
        qw0Var.getClass();
        LinkedHashMap f = qw0.f(t1);
        LinkedHashMap n = j5a.n(catalogReplaceBlocksDto2.H0());
        LinkedHashMap d = qw0.d(catalogReplaceBlocksDto2.D0());
        LinkedHashMap s = j5a.s(catalogReplaceBlocksDto2.B1());
        LinkedHashMap B = j5a.B(catalogReplaceBlocksDto2.o2());
        LinkedHashMap e2 = j5a.e(catalogReplaceBlocksDto2.n());
        LinkedHashMap f2 = j5a.f(catalogReplaceBlocksDto2.o());
        LinkedHashMap t = j5aVar.t(catalogReplaceBlocksDto2.E1());
        LinkedHashMap a = j5a.a(catalogReplaceBlocksDto2.i());
        LinkedHashMap j = j5a.j(catalogReplaceBlocksDto2.a0());
        LinkedHashMap q = j5aVar.q(catalogReplaceBlocksDto2.S0());
        LinkedHashMap l = j5a.l(catalogReplaceBlocksDto2.w0());
        LinkedHashMap x = j5a.x(catalogReplaceBlocksDto2.V1());
        LinkedHashMap D = j5a.D(catalogReplaceBlocksDto2.p());
        LinkedHashMap y = j5a.y(catalogReplaceBlocksDto2.W1());
        LinkedHashMap k = j5a.k(catalogReplaceBlocksDto2.l0());
        LinkedHashMap A = j5a.A(catalogReplaceBlocksDto2.l2());
        LinkedHashMap b = j5a.b(catalogReplaceBlocksDto2.j());
        LinkedHashMap g = j5a.g(catalogReplaceBlocksDto2.u());
        LinkedHashMap d2 = j5a.d(catalogReplaceBlocksDto2.l());
        LinkedHashMap m = j5a.m(catalogReplaceBlocksDto2.y0());
        LinkedHashMap o = j5a.o(catalogReplaceBlocksDto2.F0());
        LinkedHashMap E = j5a.E(catalogReplaceBlocksDto2.Q2(), catalogReplaceBlocksDto2.E2());
        LinkedHashMap G = j5a.G(catalogReplaceBlocksDto2.V2(), catalogReplaceBlocksDto2.X1(), catalogReplaceBlocksDto2.K0(), catalogReplaceBlocksDto2.g());
        LinkedHashMap C = j5a.C(catalogReplaceBlocksDto2.B2());
        LinkedHashMap u = j5aVar.u(catalogReplaceBlocksDto2.L1());
        LinkedHashMap b2 = qw0Var.b(catalogReplaceBlocksDto2.R());
        ArrayList a2 = qw0Var.a(catalogReplaceBlocksDto2.b1());
        LinkedHashMap c = qw0Var.c(catalogReplaceBlocksDto2.T());
        LinkedHashMap e3 = qw0Var.e(catalogReplaceBlocksDto2.n1());
        LinkedHashMap c2 = j5a.c(catalogReplaceBlocksDto2.Z());
        List<ChannelsChannelDto> M = catalogReplaceBlocksDto2.M();
        if (M == null) {
            M = EmptyList.b;
        }
        List<GroupsGroupFullDto> K0 = catalogReplaceBlocksDto2.K0();
        if (K0 == null) {
            K0 = EmptyList.b;
        }
        CatalogExtendedData catalogExtendedData = new CatalogExtendedData(z, p, s, G, null, null, null, null, w, B, e2, f2, t, h, E, r, F, a, null, null, null, null, null, null, v, null, f, d, u, j, null, null, q, null, l, x, c, b2, a2, D, e3, C, y, null, k, n, A, b, m, o, null, null, null, g, null, null, d2, null, c2, null, null, null, j5a.i(M, K0), null, null, null, null, -1023672080, -1159985150, 7, null);
        CatalogBlockReplacementsDto q2 = catalogReplaceBlocksDto2.q2();
        if (q2 == null || (e = q2.e()) == null) {
            r4 = EmptyList.b;
        } else {
            List<CatalogBlockReplacementDto> list = e;
            r4 = new ArrayList(c5g.u(list, 10));
            for (CatalogBlockReplacementDto catalogBlockReplacementDto : list) {
                List<String> d3 = catalogBlockReplacementDto.d();
                if (d3 == null) {
                    d3 = EmptyList.b;
                }
                List<CatalogBlockDto> e4 = catalogBlockReplacementDto.e();
                if (e4 != null) {
                    r8 = new ArrayList();
                    Iterator it = e4.iterator();
                    while (it.hasNext()) {
                        r8.add(adaVar.b.b((CatalogBlockDto) it.next(), ""));
                    }
                } else {
                    r8 = EmptyList.b;
                }
                r4.add(new CatalogReplacement(d3, r8));
            }
        }
        CatalogBlockReplacementsDto q22 = catalogReplaceBlocksDto2.q2();
        return new CatalogReplacementResponse(r4, catalogExtendedData, q22 != null ? q22.d() : null);
    }
}
