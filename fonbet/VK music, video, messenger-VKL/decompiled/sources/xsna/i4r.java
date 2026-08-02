package xsna;

import com.vk.api.clips.ClipsProfileList;
import com.vk.api.generated.catalog.dto.CatalogGetBlockItemsEntryPointDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosPlaylistAliasDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetResponseDto;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.recom.ShortVideoMyTargetMapperTracker;
import com.vk.clips.sdk.shared.decoration.ClipsDecorationPaginationKey;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.lgj0;
import xsna.mke;
import xsna.q9d;
import xsna.vmc;
import xsna.wih0;

/* compiled from: FeedRepository.kt */
/* loaded from: classes17.dex */
public final class i4r extends mjh0 {
    public final v6e d;
    public final oie e;
    public final zof f;
    public final kpe g;
    public final ShortVideoMyTargetMapperTracker h;
    public final uqd i;
    public final bpn0 j;

    /* compiled from: FeedRepository.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<ShortVideoGetResponseDto, ClipVideoFile> {
        @Override // xsna.izs
        public final ClipVideoFile invoke(ShortVideoGetResponseDto shortVideoGetResponseDto) {
            ((fgj0) this.receiver).getClass();
            return fgj0.a(shortVideoGetResponseDto);
        }
    }

    public i4r(v6e v6eVar, oie oieVar, zof zofVar, kpe kpeVar, ime imeVar, uqd uqdVar) {
        super(v6eVar, oieVar, zofVar, new k6k(uqdVar, 10));
        this.d = v6eVar;
        this.e = oieVar;
        this.f = zofVar;
        this.g = kpeVar;
        this.h = imeVar;
        this.i = uqdVar;
        this.j = new bpn0(new com.vk.movika.sdk.base.logic.interactor.g(15));
    }

    @Override // xsna.t8e
    public final io.reactivex.rxjava3.core.x<qih0> a(mke mkeVar, PaginationKey paginationKey) {
        return h(mkeVar, paginationKey, null, EmptyList.b);
    }

    @Override // xsna.t8e
    public final io.reactivex.rxjava3.core.x<Set<Integer>> b(Set<ekz> set) {
        if (set.isEmpty()) {
            return io.reactivex.rxjava3.core.x.k(EmptySet.b);
        }
        Set<ekz> set2 = set;
        ArrayList arrayList = new ArrayList(c5g.u(set2, 10));
        for (ekz ekzVar : set2) {
            UserId userId = ekzVar.a;
            arrayList.add(r11.b(new StringBuilder(), userId.b, '_', ekzVar.b));
        }
        tfx tfxVar = new tfx("video.getLiveStatus", new qjk0(7), new rjk0(7));
        tfxVar.i("video_ids", arrayList);
        dz2 x = yfb.x(tfxVar);
        x.p = true;
        return rsg0.W(x, 5).o(EmptyList.b).l(new e7(new nyq(1), 24));
    }

    @Override // xsna.t8e
    public final io.reactivex.rxjava3.core.k<vw50> c() {
        kwc kwcVar = this.d.a;
        if (kwcVar == null) {
            return io.reactivex.rxjava3.internal.operators.maybe.i.b.k(io.reactivex.rxjava3.schedulers.a.a());
        }
        List<SdkVideoFile> list = kwcVar.a;
        if (list.isEmpty()) {
            return io.reactivex.rxjava3.internal.operators.maybe.i.b;
        }
        List<SdkVideoFile> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new wih0.a((SdkVideoFile) it.next(), null));
        }
        return io.reactivex.rxjava3.core.k.i(new vw50(arrayList, kwcVar.b));
    }

    @Override // xsna.mjh0
    public final io.reactivex.rxjava3.internal.operators.single.y e(xy2 xy2Var) {
        dz2 x = yfb.x(xy2Var);
        if (!o25.a().b()) {
            x.d = true;
            x.c = true;
        }
        return rsg0.W(x, 5).l(new p11(new d4r(0), 14));
    }

    public final int f(PaginationKey paginationKey) {
        zof zofVar = this.f;
        y6e O = zofVar.O();
        b6e g0 = zofVar.g0();
        if (paginationKey instanceof PaginationKey.Initial) {
            return O.a ? O.b : g0.a;
        }
        if ((paginationKey instanceof PaginationKey.LoadedFull) || (paginationKey instanceof PaginationKey.Next) || (paginationKey instanceof PaginationKey.NextPageWithDecoration)) {
            return g0.a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final io.reactivex.rxjava3.internal.operators.single.y g(mke.b bVar, PaginationKey paginationKey, boolean z) {
        String str = bVar.a;
        Integer valueOf = Integer.valueOf(f(paginationKey));
        vmc vmcVar = new vmc(new vmc.a(z));
        xga xgaVar = new xga();
        PaginationKey.Next next = paginationKey instanceof PaginationKey.Next ? (PaginationKey.Next) paginationKey : null;
        dz2 x = yfb.x(wga.f(xgaVar, str, next != null ? next.b : null, valueOf, null, CatalogGetBlockItemsEntryPointDto.CLIPS_PLAYER, null, null, 864));
        ahn.D(x);
        return rsg0.W(x, 5).l(new nm3(new wmc(vmcVar), 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final io.reactivex.rxjava3.internal.operators.single.y h(mke mkeVar, PaginationKey paginationKey, zv8 zv8Var, List list) {
        Pair pair;
        Integer num;
        Integer num2;
        JSONArray jSONArray;
        String a2;
        zv8 zv8Var2 = zv8Var;
        if (zv8Var2 != null) {
            if (zv8Var2.b <= 0) {
                zv8Var2 = null;
            }
            if (zv8Var2 != null) {
                pair = new Pair(Integer.valueOf(zv8Var2.a), Integer.valueOf(zv8Var2.b));
                num = (Integer) pair.d();
                num2 = (Integer) pair.g();
                boolean z = !(mkeVar instanceof mke.j) || (mkeVar instanceof mke.a) || (mkeVar instanceof mke.m) || (mkeVar instanceof mke.d) || (mkeVar instanceof mke.i) || (mkeVar instanceof mke.q);
                if (this.f.o() || z) {
                    return rsg0.W(new faf(this.c, paginationKey, mkeVar, f(paginationKey), num2, num, ((Boolean) this.j.getValue()).booleanValue()), 5).l(new wr(new c2(28), 17));
                }
                if (list.isEmpty()) {
                    jSONArray = null;
                } else {
                    jSONArray = new JSONArray();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((o8e) it.next()).e5());
                    }
                }
                if (((Boolean) this.j.getValue()).booleanValue()) {
                    a2 = this.i.a();
                } else {
                    JSONObject jSONObject = new JSONObject(this.i.a());
                    jSONObject.remove("is_whitelist_enabled");
                    a2 = jSONObject.toString();
                }
                String str = a2;
                ngj0 ngj0Var = new ngj0();
                Integer valueOf = Integer.valueOf(f(paginationKey));
                PaginationKey.Next next = paginationKey instanceof PaginationKey.Next ? (PaginationKey.Next) paginationKey : null;
                String str2 = next != null ? next.b : null;
                String str3 = this.c;
                boolean z2 = mkeVar instanceof mke.y;
                String str4 = z2 ? ((mke.y) mkeVar).b : mkeVar instanceof mke.x ? ((mke.x) mkeVar).b : null;
                List<String> list2 = wfj0.a;
                mke.g gVar = mkeVar instanceof mke.g ? (mke.g) mkeVar : null;
                List<String> a3 = gVar != null ? gVar.a() : null;
                mke.y yVar = z2 ? (mke.y) mkeVar : null;
                dz2 x = yfb.x(lgj0.a.i(ngj0Var, valueOf, str2, str3, str4, list2, num2, str, num, a3, yVar != null ? yVar.d : null, jSONArray != null ? jSONArray.toString() : null, 9856));
                if (!o25.a().b()) {
                    x.d = true;
                    x.c = true;
                }
                return rsg0.W(x, 5).l(new c7(new eqq(this, 2), 29));
            }
        }
        pair = new Pair(null, null);
        num = (Integer) pair.d();
        num2 = (Integer) pair.g();
        if (mkeVar instanceof mke.j) {
        }
        if (this.f.o()) {
        }
        return rsg0.W(new faf(this.c, paginationKey, mkeVar, f(paginationKey), num2, num, ((Boolean) this.j.getValue()).booleanValue()), 5).l(new wr(new c2(28), 17));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y i(UserId userId, PaginationKey paginationKey) {
        int f = f(paginationKey);
        ngj0 ngj0Var = new ngj0();
        ShortVideoGetOwnerVideosPlaylistAliasDto shortVideoGetOwnerVideosPlaylistAliasDto = ShortVideoGetOwnerVideosPlaylistAliasDto.CO_OWNER_PENDING;
        return rsg0.W(yfb.x(lgj0.a.g(ngj0Var, userId, Integer.valueOf(f), paginationKey.zb(), fmd.a, null, null, null, shortVideoGetOwnerVideosPlaylistAliasDto, null, null, 65392)), 7).l(new zj0(new vr0(12), 6));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y j(ClipsDecorationPaginationKey clipsDecorationPaginationKey, boolean z) {
        return this.g.a(clipsDecorationPaginationKey, this.f.g0().a, z).l(new ca6(new f4r(z, 0), 16));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y k(mke.h hVar, PaginationKey paginationKey) {
        dz2 x = yfb.x(new l3e(hVar.a, paginationKey, f(paginationKey)).a);
        x.n = true;
        return rsg0.W(x, 7).l(new yh1(new com.vk.movika.sdk.base.observable.s(17), 8));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y l(PaginationKey paginationKey) {
        return rsg0.W(new o8d(paginationKey, f(paginationKey)), 5).l(new w11(new x8m(8), 17));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y m(PaginationKey paginationKey) {
        String zb = paginationKey.zb();
        int f = f(paginationKey);
        ske skeVar = new ske("newsfeed.getRecommendedLiveVideos");
        skeVar.K("source_ids", "friends,groups,pages,following");
        skeVar.K("extended", "1");
        skeVar.K("feed_type", "top");
        skeVar.C(f, "count");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stream_type", "mobile");
        skeVar.K("live_filters", jSONObject.toString());
        skeVar.K("start_from", zb);
        skeVar.K("fields", e7d.t);
        ahn.D(skeVar);
        return rsg0.W(skeVar, 5).l(new et(new tb4(24), 17));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y n(mke.n nVar, PaginationKey paginationKey) {
        String str = nVar.a;
        j8d j8dVar = new j8d();
        PaginationKey.Next next = paginationKey instanceof PaginationKey.Next ? (PaginationKey.Next) paginationKey : null;
        String str2 = next != null ? next.b : null;
        tfx tfxVar = new tfx("shortVideo.getTemplateVideos", new xga0(1), new ly80(2));
        tfx.o(tfxVar, "audio_raw_id", str, 0, 0, 12);
        if (str2 != null) {
            tfx.o(tfxVar, "start_from", str2, 0, 0, 12);
        }
        dz2 x = yfb.x(tfxVar);
        ahn.D(x);
        return rsg0.W(x, 5).l(new s7(new ee8(1, j8dVar, j8d.class, "map", "map(Lcom/vk/api/generated/shortVideo/dto/ShortVideoGetTemplateVideosResponseDto;)Lcom/vk/clips/sdk/shared/api/feed/data/SdkClipListResponse;", 0, 2), 6));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y o(mke.o oVar) {
        String str = oVar.a;
        i8d i8dVar = new i8d();
        List singletonList = Collections.singletonList(str);
        List<String> list = wfj0.b;
        if ((58 & 4) != 0) {
            list = null;
        }
        return rsg0.W(yfb.y(lgj0.a.c(singletonList, list), new ug8(fgj0.a, 2)), 5).l(new bl(new ie8(1, i8dVar, i8d.class, "map", "map(Lcom/vk/dto/common/VideoFile;)Lcom/vk/clips/sdk/shared/api/feed/data/SdkClipListResponse;", 0, 2), 12));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y p(PaginationKey paginationKey) {
        int f = f(paginationKey);
        PaginationKey.Next next = paginationKey instanceof PaginationKey.Next ? (PaginationKey.Next) paginationKey : null;
        String str = next != null ? next.b : null;
        List c0 = drm0.c0(e7d.t, new String[]{StringUtils.COMMA}, 0, 6);
        vfx vfxVar = new vfx("shortVideo.getSubscriptionsShortVideos", new com.vk.movika.sdk.android.defaultplayer.interactive.c(27), new ar(28));
        vfxVar.f(f, 1, 100, "count");
        if (str != null) {
            vfx.m(vfxVar, "page_anchor", str, 0, 12);
        }
        vfxVar.i("fields", c0);
        return rsg0.W(yfb.x(vfxVar), 5).l(new e10(new l8k(7), 27));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y q(PaginationKey paginationKey) {
        dz2 x = yfb.x(mgj0.a(new ngj0(), null, paginationKey.zb(), Integer.valueOf(f(paginationKey)), null, 120));
        x.n = true;
        return rsg0.W(x, 7).l(new vj0(new kz0(11), 10));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y r(mke.r rVar, boolean z, PaginationKey paginationKey) {
        return new q9d.b(rVar, f(paginationKey), z, paginationKey).b();
    }

    public final io.reactivex.rxjava3.core.x<qih0> s(mke.s sVar, PaginationKey paginationKey) {
        return rsg0.W(new ClipsProfileList(sVar.a, paginationKey, f(paginationKey), ClipsProfileList.OwnerListFilter.PUBLISHED), 5).l(new ur(new b4r(0), 18));
    }

    public final io.reactivex.rxjava3.internal.operators.single.r t(mke.t tVar, PaginationKey paginationKey) {
        UserId userId = tVar.a;
        int f = f(paginationKey);
        nns0 nns0Var = new nns0("video.getOwnerLives");
        nns0Var.F(userId, "owner_id");
        nns0Var.C(f, "count");
        PaginationKey.Next next = paginationKey instanceof PaginationKey.Next ? (PaginationKey.Next) paginationKey : null;
        if (next != null) {
            nns0Var.K("start_from", next.b);
        }
        nns0Var.K("platform", "mobile");
        nns0Var.K("status", SignalingProtocol.KEY_ACTIVE);
        ahn.D(nns0Var);
        return new io.reactivex.rxjava3.internal.operators.single.r(rsg0.W(nns0Var, 5), new ft0(new ci7(this, 22), 22));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y u(mke.u uVar, PaginationKey paginationKey) {
        String str = uVar.a;
        Integer valueOf = Integer.valueOf(f(paginationKey));
        vmc vmcVar = new vmc(new vmc.a(false));
        xga xgaVar = new xga();
        PaginationKey.Next next = paginationKey instanceof PaginationKey.Next ? (PaginationKey.Next) paginationKey : null;
        dz2 x = yfb.x(wga.f(xgaVar, str, next != null ? next.b : null, valueOf, null, CatalogGetBlockItemsEntryPointDto.CLIPS_PLAYER, null, null, 864));
        ahn.D(x);
        return rsg0.W(x, 5).l(new nm3(new wmc(vmcVar), 3));
    }

    public final io.reactivex.rxjava3.core.x<SdkVideoFile> v(SdkVideoFile sdkVideoFile) {
        UserId I0 = sdkVideoFile.I0();
        return w(r11.b(new StringBuilder(), I0.b, '_', sdkVideoFile.o0()));
    }

    public final io.reactivex.rxjava3.core.x<SdkVideoFile> w(String str) {
        List singletonList = Collections.singletonList(str);
        List<String> list = wfj0.b;
        if ((58 & 4) != 0) {
            list = null;
        }
        return rsg0.W(yfb.y(lgj0.a.c(singletonList, list), new a(1, fgj0.a, fgj0.class, "map", "map(Lcom/vk/api/generated/shortVideo/dto/ShortVideoGetResponseDto;)Lcom/vk/dto/common/ClipVideoFile;", 0)), 7).l(new io.reactivex.rxjava3.processors.b(new c4r(0), 16));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y x(mke.z zVar, PaginationKey paginationKey) {
        String str = zVar.a;
        dz2 x = yfb.x(mgj0.a(new ngj0(), zVar.b, paginationKey.zb(), Integer.valueOf(f(paginationKey)), str, 88));
        x.n = true;
        return rsg0.W(x, 7).l(new ju1(new x4(20), 14));
    }
}
