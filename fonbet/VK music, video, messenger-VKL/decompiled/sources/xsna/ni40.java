package xsna;

import android.os.Bundle;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.catalog.dto.CatalogSectionResponseObjectDto;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.EmptyVh;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.configuration.a;
import com.vk.catalog2.feature.music.holders.MusicItemsShimmers;
import com.vk.catalog2.feature.music.holders.MusicTextShimmer;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import com.vk.catalog2.feature.music.ui.holder.MusicFullscreenPlaceholderVh;
import com.vk.catalog2.feature.music.ui.holder.MusicHistoryRemoveAllVh;
import com.vk.catalog2.feature.music.ui.holder.MusicVerticalListVh;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.lists.c;
import com.vkontakte.android.R;
import java.util.Collections;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.k840;
import xsna.u4a;
import xsna.x2a;

/* compiled from: MusicDownloadsHistoryCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class ni40 extends com.vk.catalog2.common.ui.mvp.configuration.a {
    public final String D;
    public final String E;
    public final xga F;
    public final bpn0 G;
    public final e3a H;
    public final afa I;
    public final x2a.b<hda> J;
    public final Object K;
    public final Object L;

    /* compiled from: MusicDownloadsHistoryCatalogConfiguration.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_HEADER_CLEAR_TRACKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_MUSIC_OFFLINE_TRACKS_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogViewType.BUTTONS_HORIZONTAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_TYPE_MUSIC_TRACKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CatalogDataType.DATA_SYNTHETIC_LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_PLACEHOLDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: MusicDownloadsHistoryCatalogConfiguration.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<CatalogCatalogResponseObjectDto, hda> {
        @Override // xsna.izs
        public final hda invoke(CatalogCatalogResponseObjectDto catalogCatalogResponseObjectDto) {
            ((e3a) this.receiver).getClass();
            return e3a.b(catalogCatalogResponseObjectDto);
        }
    }

    /* compiled from: MusicDownloadsHistoryCatalogConfiguration.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<CatalogSectionResponseObjectDto, hda> {
        @Override // xsna.izs
        public final hda invoke(CatalogSectionResponseObjectDto catalogSectionResponseObjectDto) {
            return ((afa) this.receiver).a(catalogSectionResponseObjectDto);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ni40(Bundle bundle) {
        super(UserId.d, r0);
        String string = bundle.getString("ref");
        String string2 = bundle.getString("key_url");
        this.D = string;
        this.E = string2;
        this.F = new xga();
        this.G = new bpn0(new d1(26));
        this.H = new e3a();
        this.I = new afa();
        this.J = new x2a.b<>(false);
        rkt rktVar = new rkt(this, 12);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.K = msy.a(lazyThreadSafetyMode, rktVar);
        this.L = msy.a(lazyThreadSafetyMode, new nuv(this, 13));
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> D(String str, String str2, boolean z) {
        return ((q9a) this.G.getValue()).b(rsg0.y0(yfb.x(wga.d(this.F, str, null, str2, Boolean.valueOf(z), null, this.D, 30586)), null, null, 3).U(new y34(new c(1, this.I, afa.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogSectionResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 27)));
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final g3a S(u4a u4aVar, String str) {
        return new g3a(this, u4aVar, K(u4aVar), this.J, str != null ? new u550(str, Collections.singletonList(CatalogViewType.SEPARATOR), CatalogViewType.i(), false) : null, null, null, null, null, null, 32736);
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final CatalogPaginatedListViewHolder f0(UIBlock uIBlock, u4a u4aVar, tba<hda> tbaVar, boolean z) {
        return !k840.a.i.b() ? new MusicVerticalListVh(u4aVar.b.w, (p2k0) this.L.getValue(), this, new c.h((c.m) tbaVar), tbaVar, u4aVar) : super.f0(uIBlock, u4aVar, tbaVar, true);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final String getRef() {
        return this.D;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final tba<hda> h0(UIBlock uIBlock, String str, u4a u4aVar) {
        String str2;
        a.c cVar = new a.c(str);
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        if (uIBlockList != null && (str2 = uIBlockList.b) != null) {
            w950.p((w950) this.K.getValue(), str2, null, null, 6);
        }
        return new qd40(cVar, (fz8) K(u4aVar), u4aVar, a0(u4aVar), uIBlockList == null || uIBlockList.y.isEmpty(), uIBlockList, str, false, b0(u4aVar), this.J, new u550(str, Collections.singletonList(CatalogViewType.SEPARATOR), CatalogViewType.i(), false), 117632);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final Bundle r() {
        Bundle r = super.r();
        r.putString("key_url", this.E);
        return r;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        u4a.a aVar = u4aVar.b;
        int i = a.$EnumSwitchMapping$1[catalogDataType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 2 ? new MusicHistoryRemoveAllVh(aVar.e) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
            }
            if (i != 3) {
                return i != 4 ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 3 ? new MusicFullscreenPlaceholderVh(aVar.w, aVar.b, null, 22) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
            }
            int i2 = a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
            return i2 != 4 ? i2 != 5 ? new EmptyVh(false) : new MusicTextShimmer(R.style.VkUiTypography_FootnoteCaps) : new MusicItemsShimmers(new MusicItemsShimmers.a.b(), MusicItemsShimmers.ContentType.TRACKS, false);
        }
        if (a.$EnumSwitchMapping$0[catalogViewType.ordinal()] != 1) {
            return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
        }
        u2b0 u2b0Var = aVar.i;
        t5a<MusicTrack> t5aVar = u4aVar.c.d;
        b5a b5aVar = aVar.f;
        SearchStatInfoProvider searchStatInfoProvider = aVar.m;
        q3a q3aVar = aVar.e;
        Object obj = aVar.b;
        return new MusicTrackCellVh(u2b0Var, 0, t5aVar, b5aVar, searchStatInfoProvider, q3aVar, obj instanceof sq40 ? (sq40) obj : null, false, 30434);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> x(UserId userId, String str) {
        return ((q9a) this.G.getValue()).b(rsg0.T(yfb.x(wga.o(this.F, str, this.E, 24))).U(new v34(new b(1, this.H, e3a.class, "mapToCatalog", "mapToCatalog(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 15)));
    }
}
