package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.catalog.dto.CatalogBlockItemsDto;
import com.vk.api.generated.catalog.dto.CatalogSectionResponseObjectDto;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.EmptyVh;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.video.VideoItemListSettings;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.catalog2.common.ui.mvp.configuration.a;
import com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemAutoPlayVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.catalog2.common.ui.mvp.holder.video.category.VideoCategoryRootVh;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.lists.c;
import com.vk.toggle.features.MusicFeatures;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b9s0;
import xsna.u4a;

/* compiled from: VideoVkLiveCategoryCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class est0 extends com.vk.catalog2.common.ui.mvp.configuration.a {
    public final String D;
    public final b9s0.a E;
    public List<? extends VideoFile> F;
    public final boolean G;
    public final xga H;
    public final e3a I;
    public final e2a J;
    public VideoCategoryRootVh.b K;
    public final afa L;
    public final bpn0 M;
    public final bpn0 N;
    public final bpn0 O;
    public final bpn0 P;

    /* compiled from: VideoVkLiveCategoryCatalogConfiguration.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CatalogConfiguration$Companion$ContainerType.values().length];
            try {
                iArr[CatalogConfiguration$Companion$ContainerType.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogConfiguration$Companion$ContainerType.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogConfiguration$Companion$ContainerType.GRID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogViewType.values().length];
            try {
                iArr2[CatalogViewType.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CatalogViewType.SEPARATOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CatalogViewType.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CatalogViewType.TITLE_SUBTITLE_AVATAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CatalogViewType.LIST.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CatalogViewType.STACKED_LIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CatalogViewType.INVISIBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CatalogDataType.values().length];
            try {
                iArr3[CatalogDataType.DATA_TYPE_VIDEO_VIDEOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_ARTIST_VIDEOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_LIVE_CATEGORY.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_TEXTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* compiled from: VideoVkLiveCategoryCatalogConfiguration.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<CatalogBlockItemsDto, hda> {
        @Override // xsna.izs
        public final hda invoke(CatalogBlockItemsDto catalogBlockItemsDto) {
            return ((e2a) this.receiver).a(catalogBlockItemsDto);
        }
    }

    /* compiled from: VideoVkLiveCategoryCatalogConfiguration.kt */
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
    public est0(Bundle bundle, b9s0.a aVar) {
        super(r1, r2);
        Parcelable parcelable;
        Object parcelable2;
        String string = bundle.getString("category_id");
        string = string == null ? "" : string;
        UserId userId = UserId.d;
        String string2 = bundle.getString("ref");
        if (bundle.getString("track_code") == null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = bundle.getParcelable("search_stats_logging_info", SearchStatsLoggingInfo.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = bundle.getParcelable("search_stats_logging_info");
                parcelable = (SearchStatsLoggingInfo) (parcelable3 instanceof SearchStatsLoggingInfo ? parcelable3 : null);
            }
        }
        this.D = string;
        this.E = aVar;
        this.F = EmptyList.b;
        this.G = fxc0.B().J().x0();
        this.H = new xga();
        this.I = new e3a();
        this.J = new e2a();
        this.L = new afa();
        this.M = new bpn0(new iud0(11));
        this.N = new bpn0(new zpt0(1));
        this.O = new bpn0(new z0h0(13));
        this.P = new bpn0(new qbe0(11));
    }

    public static LinkedHashMap z0(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : catalogBlock.m.c) {
            Object Ab = catalogExtendedData.Ab(CatalogDataType.DATA_TYPE_VIDEO_VIDEOS, str);
            if (Ab instanceof VideoFile) {
                linkedHashMap.put(str, Ab);
            }
        }
        return linkedHashMap;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> D(String str, String str2, boolean z) {
        dz2 x = yfb.x(wga.d(this.H, str, null, str2, null, null, null, 32762));
        ahn.D(x);
        io.reactivex.rxjava3.internal.operators.observable.j1 U = rsg0.T(x).U(new l960(new c(1, this.L, afa.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogSectionResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 14));
        t520 t520Var = new t520(new qm90(14, this, str2), 28);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return U.E(t520Var, lVar, kVar, kVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final RecyclerView.n F(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        if (u4aVar.b.c && this.G) {
            int i = a.$EnumSwitchMapping$0[catalogConfiguration$Companion$ContainerType.ordinal()];
            if (i == 1) {
                return new kas0(false);
            }
            if (i == 2) {
                return new fas0();
            }
            if (i == 3) {
                return new eas0(false);
            }
            throw new NoWhenBranchMatchedException();
        }
        int i2 = a.$EnumSwitchMapping$0[catalogConfiguration$Companion$ContainerType.ordinal()];
        if (i2 == 1) {
            return new kas0(false);
        }
        if (i2 == 2) {
            return new i9s0();
        }
        if (i2 == 3) {
            return super.F(catalogConfiguration$Companion$ContainerType, u4aVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final CatalogPaginatedListViewHolder f0(UIBlock uIBlock, u4a u4aVar, tba<hda> tbaVar, boolean z) {
        c.h hVar = new c.h((c.m) tbaVar);
        u4a.a aVar = u4aVar.b;
        hVar.n = aVar.h;
        boolean z2 = aVar.c;
        boolean z3 = this.G;
        return new PaginatedGridListVh(this, hVar, tbaVar, u4aVar, (z2 && z3) ? (hst0) this.N.getValue() : (fst0) this.P.getValue(), (z2 && z3) ? (ist0) this.M.getValue() : (gst0) this.O.getValue(), null, false, 0, null, null, 3904);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final tba<hda> h0(UIBlock uIBlock, String str, u4a u4aVar) {
        a.c cVar = new a.c(str);
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        return new kea(cVar, K(u4aVar), u4aVar, a0(u4aVar), true, uIBlockList, str, uIBlockList == null, null, b0(u4aVar), null, null, null, false, new jd4(u4aVar, 18), 64256);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final io.reactivex.rxjava3.core.q<hda> j(String str, String str2, String str3) {
        if (MusicFeatures.AUTOGEN_GET_BLOCK_ITEMS.h()) {
            dz2 x = yfb.x(wga.f(this.H, str == null ? "" : str, str2, null, null, null, null, str3, IronSourceError.ERROR_CODE_INIT_FAILED));
            ahn.D(x);
            return rsg0.y0(x, null, null, 3).U(new qu50(new b(1, this.J, e2a.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogBlockItemsDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 19));
        }
        a6a a6aVar = new a6a(new wba(), str == null ? "" : str, str2, null, str3, null, 88);
        ahn.D(a6aVar);
        return rsg0.y0(a6aVar, null, null, 3);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        CatalogViewHolder videoItemAutoPlayVh;
        u4a.a aVar = u4aVar.b;
        boolean z = aVar.c && this.G;
        int i = a.$EnumSwitchMapping$2[catalogDataType.ordinal()];
        if (i == 1 || i == 2) {
            b9s0.a aVar2 = this.E;
            if (z) {
                int i2 = a.$EnumSwitchMapping$1[catalogViewType.ordinal()];
                if (i2 == 5 || i2 == 6) {
                    k7a k7aVar = aVar.j;
                    VideoItemListSettings videoItemListSettings = VideoItemListSettings.s;
                    b5a b5aVar = aVar.f;
                    SearchStatInfoProvider searchStatInfoProvider = aVar.m;
                    aVar2.getClass();
                    videoItemAutoPlayVh = new VideoItemAutoPlayVh(new VideoItemListLargeVh(k7aVar, videoItemListSettings, b5aVar, searchStatInfoProvider, null, u4aVar.b, null, 1488), aVar.f, aVar.m, false, false, SubtitlesConfigurationMode.ALWAYS_DISABLED, null, false, 472);
                } else {
                    videoItemAutoPlayVh = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                }
            } else {
                int i3 = a.$EnumSwitchMapping$1[catalogViewType.ordinal()];
                if (i3 == 5 || i3 == 6) {
                    k7a k7aVar2 = aVar.j;
                    VideoItemListSettings f = VideoItemListSettings.a.f(VideoItemListSettings.i);
                    b5a b5aVar2 = aVar.f;
                    SearchStatInfoProvider searchStatInfoProvider2 = aVar.m;
                    aVar2.getClass();
                    videoItemAutoPlayVh = new VideoItemAutoPlayVh(new VideoItemListLargeVh(k7aVar2, f, b5aVar2, searchStatInfoProvider2, null, u4aVar.b, null, 1488), aVar.f, aVar.m, false, false, SubtitlesConfigurationMode.ALWAYS_DISABLED, null, false, 472);
                } else {
                    videoItemAutoPlayVh = i3 != 7 ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : new EmptyVh(false);
                }
            }
        } else if (i == 3) {
            int i4 = a.$EnumSwitchMapping$1[catalogViewType.ordinal()];
            videoItemAutoPlayVh = i4 != 1 ? i4 != 2 ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : new EmptyVh(false) : new EmptyVh(false);
        } else if (i != 4) {
            videoItemAutoPlayVh = i != 5 ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
        } else {
            int i5 = a.$EnumSwitchMapping$1[catalogViewType.ordinal()];
            videoItemAutoPlayVh = i5 != 1 ? i5 != 3 ? i5 != 4 ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : new EmptyVh(false) : new EmptyVh(false) : new EmptyVh(false);
        }
        VideoCategoryRootVh.b bVar = this.K;
        if (bVar != null) {
            bVar.invoke(videoItemAutoPlayVh, aVar);
        }
        return videoItemAutoPlayVh;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> x(UserId userId, String str) {
        this.H.getClass();
        tfx tfxVar = new tfx("catalog.getVkLiveVideosByCategory", new as(9), new p11(8));
        tfx.o(tfxVar, "category_id", this.D, 0, 0, 12);
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
        }
        tfxVar.j("need_blocks", true);
        dz2 x = yfb.x(tfxVar);
        ahn.D(x);
        return rsg0.y0(x, null, null, 3).U(new pu50(new hfm0(this, 19), 18));
    }
}
