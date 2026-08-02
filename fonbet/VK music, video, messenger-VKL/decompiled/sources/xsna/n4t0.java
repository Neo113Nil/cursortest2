package xsna;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.catalog.dto.CatalogBlockItemsDto;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.style.CatalogActionFilterStyle;
import com.vk.catalog2.common.dto.api.style.CatalogSliderViewStyle;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.HeaderCatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.PlaceholderCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.video.CatalogGetVideoPlaylist;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.EmptyVh;
import com.vk.catalog2.common.ui.holders.SeparatorVh;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.catalog2.common.ui.mvp.configuration.a;
import com.vk.catalog2.common.ui.mvp.holder.HeaderShowAllVh;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalStickyListVh;
import com.vk.catalog2.common.ui.mvp.holder.placeholder.ComposePlaceholderVh;
import com.vk.catalog2.common.ui.mvp.holder.video.HeaderPlaylistVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListSmallVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemNoAutoPlayVh;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.seasons.VideoSeasonFilterVh;
import com.vk.catalog2.common.ui.mvp.holder.video.seasons.VideoSeasonsHorizontalVh;
import com.vk.catalog2.common.ui.mvp.video.VideoPlaylistPlaceHolder;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.video.VideoAlbum;
import com.vk.dto.video.VideoOwner;
import com.vk.dto.video.VideoSeason;
import com.vk.libvideo.api.di.VideoPlaylistReversionComponent;
import com.vk.lists.c;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.gl.tf.Tensorflow;
import xsna.u4a;

/* compiled from: VideoPlaylistCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class n4t0 extends com.vk.catalog2.common.ui.mvp.configuration.a {
    public final int D;
    public final String E;
    public final String F;
    public final xga G;
    public final e2a H;
    public List<? extends VideoFile> I;
    public VideoFile J;
    public VideoAlbum K;
    public String L;
    public final boolean M;
    public final Object N;
    public final bpn0 O;
    public VideoPlaylistRootVh.c P;

    /* compiled from: VideoPlaylistCatalogConfiguration.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[CatalogConfiguration$Companion$ContainerType.values().length];
            try {
                iArr[CatalogConfiguration$Companion$ContainerType.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogViewType.values().length];
            try {
                iArr2[CatalogViewType.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[CatalogViewType.SEPARATOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CatalogViewType.SLIDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CatalogViewType.LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CatalogViewType.INVISIBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CatalogViewType.PLACEHOLDER.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CatalogViewType.PLACEHOLDER_BIG.ordinal()] = 7;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CatalogDataType.values().length];
            try {
                iArr3[CatalogDataType.DATA_TYPE_PLACEHOLDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_VIDEO_VIDEOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_ARTIST_VIDEOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_TEXTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_ACTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[PlaceholderCatalogViewStyle.Style.values().length];
            try {
                iArr4[PlaceholderCatalogViewStyle.Style.Elongate.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[CatalogSliderViewStyle.Style.values().length];
            try {
                iArr5[CatalogSliderViewStyle.Style.GraySticky.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[CatalogActionFilterStyle.Style.values().length];
            try {
                iArr6[CatalogActionFilterStyle.Style.GRAY_STICKY.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$5 = iArr6;
        }
    }

    /* compiled from: VideoPlaylistCatalogConfiguration.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<CatalogBlockItemsDto, hda> {
        @Override // xsna.izs
        public final hda invoke(CatalogBlockItemsDto catalogBlockItemsDto) {
            return ((e2a) this.receiver).a(catalogBlockItemsDto);
        }
    }

    /* compiled from: VideoPlaylistCatalogConfiguration.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements wzs<Pair<? extends hda, ? extends VideoOwner>, Optional<VideoAlbum>, Pair<? extends Pair<? extends hda, ? extends VideoOwner>, ? extends Optional<VideoAlbum>>> {
        public static final c b = new c(2, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 0);

        @Override // xsna.wzs
        public final Pair<? extends Pair<? extends hda, ? extends VideoOwner>, ? extends Optional<VideoAlbum>> invoke(Pair<? extends hda, ? extends VideoOwner> pair, Optional<VideoAlbum> optional) {
            return new Pair<>(pair, optional);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n4t0(Bundle bundle) {
        super(r1, r2);
        int i = bundle.getInt("album_id");
        UserId userId = (UserId) bundle.getParcelable("owner_id");
        String string = bundle.getString("ref");
        String string2 = bundle.getString("key_url");
        String string3 = bundle.getString("track_code");
        if (string3 == null) {
            SearchStatsLoggingInfo searchStatsLoggingInfo = (SearchStatsLoggingInfo) bundle.getParcelable("search_stats_logging_info");
            string3 = searchStatsLoggingInfo != null ? searchStatsLoggingInfo.f : null;
        }
        this.D = i;
        this.E = string2;
        this.F = string3;
        this.G = new xga();
        this.H = new e2a();
        this.I = EmptyList.b;
        this.M = fxc0.B().J().x0();
        this.N = msy.a(LazyThreadSafetyMode.NONE, new oqh0(this, 18));
        this.O = new bpn0(new ghn0(this, 14));
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
    public final vha A(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        return catalogConfiguration$Companion$ContainerType == CatalogConfiguration$Companion$ContainerType.VERTICAL ? new z160(new onh0(), u4aVar.b.I, 4) : super.A(catalogConfiguration$Companion$ContainerType, u4aVar);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> D(String str, String str2, boolean z) {
        r6a r6aVar = new r6a(new wba(), str, str2, z, null, Boolean.valueOf(((VideoPlaylistReversionComponent) this.N.getValue()).L0(this.D, this.b.b)), null, null, Tensorflow.FRAME_WIDTH);
        ahn.D(r6aVar);
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(r6aVar, null, null, 3);
        dfr0 dfr0Var = new dfr0(new m4t0(0, this, str2), 2);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(dfr0Var, lVar, kVar, kVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final RecyclerView.n F(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        return (u4aVar.b.c && this.M) ? a.$EnumSwitchMapping$0[catalogConfiguration$Companion$ContainerType.ordinal()] == 1 ? new kas0(true) : super.F(catalogConfiguration$Companion$ContainerType, u4aVar) : super.F(catalogConfiguration$Companion$ContainerType, u4aVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final boolean Q(UIBlock uIBlock) {
        CatalogViewStyle catalogViewStyle = uIBlock != null ? uIBlock.l : null;
        return (catalogViewStyle instanceof CatalogSliderViewStyle) && ((CatalogSliderViewStyle) catalogViewStyle).b == CatalogSliderViewStyle.Style.GraySticky;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final CatalogPaginatedListViewHolder f0(UIBlock uIBlock, u4a u4aVar, tba<hda> tbaVar, boolean z) {
        ArrayList<UIBlock> arrayList;
        if (!fxc0.B().J().C1()) {
            return super.f0(uIBlock, u4aVar, tbaVar, true);
        }
        if (!Q(uIBlock)) {
            if ((uIBlock instanceof UIBlockList) && ((arrayList = ((UIBlockList) uIBlock).y) == null || !arrayList.isEmpty())) {
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (Q((UIBlock) it.next())) {
                    }
                }
            }
            return super.f0(uIBlock, u4aVar, tbaVar, true);
        }
        c.h hVar = new c.h((c.m) tbaVar);
        hVar.n = u4aVar.b.h;
        return new VerticalStickyListVh(this, hVar, tbaVar, u4aVar, null, true, false, R.layout.catalog_list_vertical_sticky, A(CatalogConfiguration$Companion$ContainerType.VERTICAL, u4aVar), new VerticalListVh.a(null, null, null, 63));
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final tba<hda> h0(UIBlock uIBlock, String str, u4a u4aVar) {
        a.c cVar = new a.c(str);
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        return new kea(cVar, K(u4aVar), u4aVar, a0(u4aVar), uIBlockList == null || uIBlockList.y.size() == 0, uIBlockList, str, uIBlockList == null, null, b0(u4aVar), null, null, null, false, new a86(u4aVar, 17), 64256);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final io.reactivex.rxjava3.core.q<hda> j(String str, String str2, String str3) {
        if (MusicFeatures.AUTOGEN_GET_BLOCK_ITEMS.h()) {
            dz2 x = yfb.x(wga.f(this.G, str == null ? "" : str, str2, null, null, null, null, str3, IronSourceError.ERROR_CODE_INIT_FAILED));
            ahn.D(x);
            return rsg0.y0(x, null, null, 3).U(new p5w(new b(1, this.H, e2a.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogBlockItemsDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 23));
        }
        a6a a6aVar = new a6a(new wba(), str == null ? "" : str, str2, null, str3, null, 88);
        ahn.D(a6aVar);
        return rsg0.y0(a6aVar, null, null, 3);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final HorizontalListVh o(UIBlock uIBlock, u4a u4aVar, CatalogViewStyle catalogViewStyle) {
        if (!fxc0.B().J().C1()) {
            return super.o(uIBlock, u4aVar, catalogViewStyle);
        }
        if (!(catalogViewStyle instanceof CatalogSliderViewStyle)) {
            return super.o(uIBlock, u4aVar, catalogViewStyle);
        }
        if (a.$EnumSwitchMapping$4[((CatalogSliderViewStyle) catalogViewStyle).b.ordinal()] != 1) {
            return super.o(uIBlock, u4aVar, catalogViewStyle);
        }
        y1a n = n(u4aVar);
        return new VideoSeasonsHorizontalVh(this, new c.h((c.m) n), n, u4aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [xsna.eda] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.vk.catalog2.common.dto.api.style.PlaceholderCatalogViewStyle$Style] */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        n4t0 n4t0Var;
        VideoPlaylistPlaceHolder videoPlaylistPlaceHolder;
        CatalogViewHolder composePlaceholderVh;
        VideoAlbum videoAlbum;
        List<VideoSeason> list;
        VideoAlbum videoAlbum2;
        List<VideoSeason> list2;
        u4a.a aVar = u4aVar.b;
        u4a.a aVar2 = u4aVar.b;
        int i = a.$EnumSwitchMapping$2[catalogDataType.ordinal()];
        boolean z = this.M;
        r8 = null;
        r8 = null;
        r8 = null;
        SeparatorVh.a aVar3 = null;
        boolean z2 = true;
        switch (i) {
            case 1:
                n4t0Var = this;
                int i2 = a.$EnumSwitchMapping$1[catalogViewType.ordinal()];
                if (i2 == 6) {
                    PlaceholderCatalogViewStyle placeholderCatalogViewStyle = catalogViewStyle instanceof PlaceholderCatalogViewStyle ? (PlaceholderCatalogViewStyle) catalogViewStyle : null;
                    r8 = placeholderCatalogViewStyle != null ? placeholderCatalogViewStyle.b : 0;
                    if ((r8 == 0 ? -1 : a.$EnumSwitchMapping$3[r8.ordinal()]) == 1) {
                        composePlaceholderVh = new ComposePlaceholderVh(aVar.w);
                        break;
                    } else {
                        com.vk.catalog2.common.ui.mvp.util.a aVar4 = aVar.w;
                        nda ndaVar = aVar.b;
                        VideoAlbum videoAlbum3 = n4t0Var.K;
                        if (videoAlbum3 == null) {
                            videoAlbum3 = new VideoAlbum(n4t0Var.D, n4t0Var.b, n4t0Var.L, null, 0, 0, null, false, null, false, false, 0, null, null, false, null, null, null, 262136, null);
                        }
                        videoPlaylistPlaceHolder = new VideoPlaylistPlaceHolder(videoAlbum3, aVar4, ndaVar, aVar2);
                        composePlaceholderVh = videoPlaylistPlaceHolder;
                    }
                } else if (i2 == 7) {
                    com.vk.catalog2.common.ui.mvp.util.a aVar5 = aVar.w;
                    nda ndaVar2 = aVar.b;
                    VideoAlbum videoAlbum4 = n4t0Var.K;
                    if (videoAlbum4 == null) {
                        videoAlbum4 = new VideoAlbum(n4t0Var.D, n4t0Var.b, n4t0Var.L, null, 0, 0, null, false, null, false, false, 0, null, null, false, null, null, null, 262136, null);
                    }
                    videoPlaylistPlaceHolder = new VideoPlaylistPlaceHolder(videoAlbum4, aVar5, ndaVar2, aVar2);
                    composePlaceholderVh = videoPlaylistPlaceHolder;
                    break;
                } else {
                    composePlaceholderVh = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                    break;
                }
            case 2:
            case 3:
                n4t0Var = this;
                int i3 = a.$EnumSwitchMapping$1[catalogViewType.ordinal()];
                if (i3 == 4) {
                    boolean z3 = aVar.c;
                    composePlaceholderVh = new VideoItemNoAutoPlayVh(new VideoItemListSmallVh((z3 && z) ? R.layout.catalog_video_small_item_tablet : R.layout.catalog_video_small_item, u4aVar, aVar.m, fxc0.B().J().i(), "PLAYLIST", z3 && z, (hdt0) n4t0Var.O.getValue(), null, 8440), aVar.f, aVar.m, false, u4aVar.c.a, true, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
                    break;
                } else if (i3 == 5) {
                    composePlaceholderVh = new EmptyVh(false);
                    break;
                } else {
                    composePlaceholderVh = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                    break;
                }
            case 4:
                int i4 = a.$EnumSwitchMapping$1[catalogViewType.ordinal()];
                if (i4 == 1) {
                    HeaderCatalogViewStyle headerCatalogViewStyle = catalogViewStyle instanceof HeaderCatalogViewStyle ? (HeaderCatalogViewStyle) catalogViewStyle : null;
                    if (fxc0.B().J().i1()) {
                        if ((headerCatalogViewStyle != null ? headerCatalogViewStyle.b : null) == HeaderCatalogViewStyle.Style.Flat) {
                            nda ndaVar3 = aVar.b;
                            eda b0 = b0(u4aVar);
                            int i5 = R.layout.catalog_header_show_all;
                            b5a b5aVar = aVar.f;
                            if (aVar.c && z) {
                                i5 = R.layout.catalog_header_show_all_tablet;
                            }
                            composePlaceholderVh = new HeaderShowAllVh(this, ndaVar3, b0, b5aVar, aVar.w, i5, aVar.m);
                        }
                    }
                    int i6 = R.layout.catalog_header_show_all;
                    if (fxc0.B().J().k()) {
                        b5a b5aVar2 = aVar.f;
                        ejf0 ejf0Var = new ejf0(this, 22);
                        fyd0 fyd0Var = new fyd0(this, 23);
                        if (fxc0.B().J().C1() && (videoAlbum = this.K) != null && (list = videoAlbum.q) != null) {
                            z2 = list.isEmpty();
                        }
                        composePlaceholderVh = new HeaderPlaylistVh(b5aVar2, ejf0Var, fyd0Var, z2);
                    } else {
                        nda ndaVar4 = aVar.b;
                        eda b02 = b0(u4aVar);
                        b5a b5aVar3 = aVar.f;
                        if (aVar.c && z) {
                            i6 = R.layout.catalog_header_show_all_tablet;
                        }
                        composePlaceholderVh = new HeaderShowAllVh(this, ndaVar4, b02, b5aVar3, aVar.w, i6, aVar.m);
                    }
                } else if (i4 != 2) {
                    composePlaceholderVh = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                } else {
                    int i7 = (aVar.c && z) ? R.layout.catalog_separator_tablet : R.layout.catalog_separator_compact;
                    if (fxc0.B().J().C1() && (videoAlbum2 = this.K) != null && (list2 = videoAlbum2.q) != null && (!list2.isEmpty())) {
                        aVar3 = new SeparatorVh.a(Integer.valueOf(iah0.a(4)));
                    }
                    composePlaceholderVh = new SeparatorVh(i7, aVar3, 0, 4);
                }
                n4t0Var = this;
                break;
            case 5:
                composePlaceholderVh = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                n4t0Var = this;
                break;
            case 6:
                composePlaceholderVh = a.$EnumSwitchMapping$1[catalogViewType.ordinal()] == 3 ? !fxc0.B().J().C1() ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : catalogViewStyle instanceof CatalogActionFilterStyle ? a.$EnumSwitchMapping$5[((CatalogActionFilterStyle) catalogViewStyle).b.ordinal()] == 1 ? new VideoSeasonFilterVh(new wtm0(aVar.e, aVar.f, (eda) r8, 12)) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                n4t0Var = this;
                break;
            default:
                composePlaceholderVh = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                n4t0Var = this;
                break;
        }
        VideoPlaylistRootVh.c cVar = n4t0Var.P;
        if (cVar != null) {
            cVar.invoke(composePlaceholderVh, aVar);
        }
        return composePlaceholderVh;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> x(UserId userId, String str) {
        iss0 iss0Var = iss0.a;
        wba wbaVar = new wba();
        VideoPlaylistReversionComponent videoPlaylistReversionComponent = (VideoPlaylistReversionComponent) this.N.getValue();
        long j = userId.b;
        int i = this.D;
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new CatalogGetVideoPlaylist(wbaVar, this.D, userId, this.F, videoPlaylistReversionComponent.L0(i, j)), null, null, 3);
        iss0Var.getClass();
        return io.reactivex.rxjava3.core.q.I0(iss0.a(this.E, y0), new io.reactivex.rxjava3.internal.operators.observable.p1(rsg0.y0(new z0r0(userId, i, (String) null), null, null, 3).U(new ly80(new z7w(28), 10)), new i3u(new yml0(9), 19)), new yzt(c.b, 21)).U(new pi40(new xvl0(this, 14), 19));
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final y7a z(lca lcaVar, CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType) {
        return a.$EnumSwitchMapping$0[catalogConfiguration$Companion$ContainerType.ordinal()] == 1 ? new o4t0(lcaVar, 3) : super.z(lcaVar, catalogConfiguration$Companion$ContainerType);
    }
}
