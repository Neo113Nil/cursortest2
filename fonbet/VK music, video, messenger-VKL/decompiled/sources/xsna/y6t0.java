package xsna;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogSliderViewStyle;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.PlaceholderCatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.VideoCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.CatalogMviVh;
import com.vk.catalog2.common.ui.holders.SeparatorVh;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.video.VideoItemListSettings;
import com.vk.catalog2.common.ui.holders.video.VideoProfileActionCreateAlbumVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.catalog2.common.ui.mvp.holder.HeaderShowAllVh;
import com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ProfileShowFiltersVh;
import com.vk.catalog2.common.ui.mvp.holder.placeholder.VideoProfilePlaceholderVh;
import com.vk.catalog2.common.ui.mvp.holder.video.ClipDraftsBlockVh;
import com.vk.catalog2.common.ui.mvp.holder.video.ProfileBlockFilterVh;
import com.vk.catalog2.common.ui.mvp.holder.video.ShortVideoListItemVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoAlbumVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemAutoPlayVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListSmallVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListTabletVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemNoAutoPlayVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemSliderVh;
import com.vk.catalog2.video.VideoCatalogId;
import com.vk.core.apps.BuildInfo;
import com.vk.donut.video.model.presentation.cardsize.DonutVideoCardSource;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.lists.c;
import com.vk.toggle.Features;
import com.vk.video.profile.presentation.catalog.holders.VideoProfileCatalogContentVh;
import com.vk.video.profile.presentation.catalog.pager.VideoLargeSliderHorizontalPagerVh;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.b9s0;
import xsna.eda;
import xsna.u4a;

/* compiled from: VideoProfileCatalogConfiguration.kt */
/* loaded from: classes6.dex */
public final class y6t0 extends b9s0 {
    public final ao8 A0;
    public final bpn0 B0;
    public final bpn0 C0;
    public final b9s0.a t0;
    public VideoProfileCatalogContentVh.a u0;
    public final bpn0 v0;
    public final bpn0 w0;
    public final bpn0 x0;
    public final bpn0 y0;
    public final boolean z0;

    /* compiled from: VideoProfileCatalogConfiguration.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogConfiguration$Companion$ContainerType.values().length];
            try {
                iArr[CatalogConfiguration$Companion$ContainerType.GRID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogConfiguration$Companion$ContainerType.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogViewType.values().length];
            try {
                iArr2[CatalogViewType.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_SEPARATOR_ISLAND_TRANSPARENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CatalogViewType.SEPARATOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CatalogViewType.LARGE_SLIDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CatalogViewType.SLIDER.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CatalogViewType.STACKED_LIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CatalogViewType.SHORT_VIDEO_LIST.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CatalogViewType.SLIDER_VERTICAL_VIDEOS_NO_AUTOPLAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CatalogViewType.LIST.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: VideoProfileCatalogConfiguration.kt */
    public static final class b implements zda {
        public final /* synthetic */ yfa b;
        public boolean c;
        public final /* synthetic */ u4a d;
        public final /* synthetic */ Ref$ObjectRef<kea> e;

        public b(u4a u4aVar, Ref$ObjectRef<kea> ref$ObjectRef) {
            this.d = u4aVar;
            this.e = ref$ObjectRef;
            this.b = u4aVar.b.H;
        }

        @Override // xsna.zda
        public final void H(UIBlockCatalog uIBlockCatalog) {
            this.b.H(uIBlockCatalog);
        }

        @Override // xsna.zda
        public final void I(Throwable th) {
            this.b.getClass();
        }

        @Override // xsna.zda
        public final void k(UIBlock uIBlock) {
            kea keaVar;
            this.d.b.H.k(uIBlock);
            if (uIBlock instanceof UIBlockList) {
                boolean isEmpty = ((UIBlockList) uIBlock).y.isEmpty();
                if (this.c && isEmpty && (keaVar = this.e.element) != null) {
                    keaVar.o();
                }
                this.c = !isEmpty;
            }
        }
    }

    /* compiled from: VideoProfileCatalogConfiguration.kt */
    public static final class c implements PaginatedGridListVh.c {
        public final /* synthetic */ u4a a;
        public final /* synthetic */ y6t0 b;

        public c(u4a u4aVar, y6t0 y6t0Var) {
            this.a = u4aVar;
            this.b = y6t0Var;
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh.c
        public final int a(int i, boolean z) {
            return (this.a.b.c && this.b.L) ? 60 : 6;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y6t0(Bundle bundle, b9s0.a aVar) {
        super(r2, r3, r4, aVar, r0, VideoCatalogId.PROFILE);
        UserId userId = (UserId) bundle.getParcelable("owner_id");
        UserId userId2 = userId == null ? UserId.d : userId;
        String string = bundle.getString("ref");
        String string2 = bundle.getString("key_url");
        String string3 = bundle.getString("track_code");
        if (string3 == null) {
            SearchStatsLoggingInfo searchStatsLoggingInfo = (SearchStatsLoggingInfo) bundle.getParcelable("search_stats_logging_info");
            string3 = searchStatsLoggingInfo != null ? searchStatsLoggingInfo.f : null;
        }
        this.t0 = aVar;
        this.v0 = new bpn0(new qkd0(this, 26));
        this.w0 = new bpn0(new hbj0(this, 22));
        this.x0 = new bpn0(new pwh0(this, 24));
        this.y0 = new bpn0(new v5n0(this, 16));
        this.z0 = fxc0.B().J().D1();
        this.A0 = new ao8(21);
        this.B0 = new bpn0(new t970(20));
        this.C0 = new bpn0(new j1t0(2));
    }

    @Override // xsna.b9s0
    public final rsg0<hda> B0(UserId userId) {
        if (!BuildInfo.q()) {
            return new w6a(N(), userId, this.h0, this.E, this.g0);
        }
        return new y6a(N(), this.F, userId, this.h0, this.E, this.g0, false, 1412);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> D(String str, String str2, boolean z) {
        return rsg0.y0(new r6a(N(), str, str2, z, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK), null, null, 3);
    }

    @Override // xsna.b9s0, com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final RecyclerView.n F(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        return (u4aVar.b.c && this.L) ? a.$EnumSwitchMapping$0[catalogConfiguration$Companion$ContainerType.ordinal()] == 1 ? new eas0(true) : super.F(catalogConfiguration$Companion$ContainerType, u4aVar) : super.F(catalogConfiguration$Companion$ContainerType, u4aVar);
    }

    @Override // xsna.b9s0
    public final PaginatedGridListVh.c G0(u4a u4aVar) {
        return new c(u4aVar, this);
    }

    @Override // xsna.b9s0
    public final PaginatedGridListVh.d H0(u4a u4aVar) {
        return (u4aVar.b.c && this.L) ? (a7t0) this.B0.getValue() : (z6t0) this.C0.getValue();
    }

    @Override // xsna.b9s0
    public final ias0 I0() {
        return this.A0;
    }

    public final CatalogViewHolder M0(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        VideoCatalogId videoCatalogId = this.F;
        VideoCatalogId videoCatalogId2 = VideoCatalogId.PROFILE;
        boolean z = false;
        UserId userId = this.b;
        boolean z2 = videoCatalogId == videoCatalogId2 && fkq0.b(userId);
        boolean f = epx.f(userId, UserId.d);
        if (catalogViewType != CatalogViewType.LIST) {
            return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
        }
        u4a.a aVar = u4aVar.b;
        boolean z3 = aVar.c;
        boolean z4 = this.L;
        int i = (z3 && z4) ? R.layout.catalog_video_small_item_tablet : R.layout.catalog_video_small_item;
        SearchStatInfoProvider searchStatInfoProvider = aVar.m;
        if (z3 && z4) {
            z = true;
        }
        VideoItemListSmallVh videoItemListSmallVh = new VideoItemListSmallVh(i, u4aVar, searchStatInfoProvider, true, "PROFILE", z, (hdt0) this.v0.getValue(), null, 8440);
        u4a.a aVar2 = u4aVar.b;
        return new VideoItemNoAutoPlayVh(videoItemListSmallVh, aVar2.f, aVar2.m, f, null, z2, 144);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final int R() {
        return fxc0.B().J().Q() ? 20 : 5;
    }

    @Override // xsna.b9s0, com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final ayn0 W(RecyclerView recyclerView) {
        return this.L ? new ayn0(recyclerView, null, 24) : super.W(recyclerView);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final vd7 a0(u4a u4aVar) {
        return new g7t0(u4aVar.b.e);
    }

    @Override // xsna.b9s0, com.vk.catalog2.common.ui.mvp.configuration.a
    public final CatalogPaginatedListViewHolder f0(UIBlock uIBlock, u4a u4aVar, tba<hda> tbaVar, boolean z) {
        c.h hVar = new c.h((c.m) tbaVar);
        hVar.n = u4aVar.b.h;
        return new PaginatedGridListVh(this, hVar, tbaVar, u4aVar, new c(u4aVar, this), H0(u4aVar), null, true, 0, null, null, 3904);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final eda.a g() {
        return new x6t0(0);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [T, xsna.kea, xsna.tba<xsna.hda>] */
    @Override // xsna.b9s0, com.vk.catalog2.common.ui.mvp.configuration.a
    public final tba<hda> h0(UIBlock uIBlock, String str, u4a u4aVar) {
        b9s0.e eVar = new b9s0.e(str);
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        boolean z = uIBlockList == null;
        UserId userId = this.b;
        boolean z2 = uIBlockList == null || uIBlockList.y.size() == 0 || (fkq0.b(userId) && xg5.a().e(userId));
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? keaVar = new kea(eVar, K(u4aVar), u4aVar, a0(u4aVar), z2, uIBlockList, str, z, null, b0(u4aVar), new b(u4aVar, ref$ObjectRef), null, null, false, null, 125696);
        ref$ObjectRef.element = keaVar;
        return keaVar;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final int v() {
        return fxc0.B().J().Q() ? 12 : 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0389  */
    @Override // xsna.b9s0, com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        u4a.a aVar;
        CatalogViewHolder videoAlbumVh;
        CatalogViewHolder videoItemNoAutoPlayVh;
        CatalogViewHolder videoLargeSliderHorizontalPagerVh;
        VideoProfileCatalogContentVh.a aVar2;
        y6t0 y6t0Var = this;
        u4a.a aVar3 = u4aVar.b;
        if (catalogViewType != CatalogViewType.PLACEHOLDER) {
            CatalogDataType catalogDataType2 = CatalogDataType.DATA_SYNTHETIC_SECTION;
            if (catalogDataType == catalogDataType2 && catalogViewType == CatalogViewType.SLIDER) {
                CatalogSliderViewStyle catalogSliderViewStyle = catalogViewStyle instanceof CatalogSliderViewStyle ? (CatalogSliderViewStyle) catalogViewStyle : null;
                if ((catalogSliderViewStyle != null ? catalogSliderViewStyle.b : null) == CatalogSliderViewStyle.Style.Inline) {
                    y1a n = y6t0Var.n(u4aVar);
                    videoLargeSliderHorizontalPagerVh = new ProfileShowFiltersVh(y6t0Var, new c.h((c.m) n), n, u4aVar);
                    videoAlbumVh = videoLargeSliderHorizontalPagerVh;
                } else {
                    videoAlbumVh = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                }
            } else if (catalogDataType == catalogDataType2 && catalogViewType == CatalogViewType.LARGE_SLIDER) {
                y1a n2 = y6t0Var.n(u4aVar);
                videoLargeSliderHorizontalPagerVh = new VideoLargeSliderHorizontalPagerVh(y6t0Var, new c.h((c.m) n2), n2, u4aVar);
                videoAlbumVh = videoLargeSliderHorizontalPagerVh;
            } else if (catalogDataType == CatalogDataType.DATA_TYPE_ACTION && catalogViewType == CatalogViewType.SLIDER) {
                videoAlbumVh = new ProfileBlockFilterVh(new wtm0(aVar3.e, aVar3.f, y6t0Var.b0(u4aVar), new nwd0()));
            } else {
                Features.Type type = Features.Type.FEATURE_VIDEO_PROFILE_HOME_UI;
                type.getClass();
                if (com.vk.toggle.b.A.a(type)) {
                    CatalogDataType catalogDataType3 = CatalogDataType.DATA_TYPE_NONE;
                    bpn0 bpn0Var = y6t0Var.w0;
                    boolean z = false;
                    boolean z2 = y6t0Var.L;
                    if (catalogDataType == catalogDataType3) {
                        int i = a.$EnumSwitchMapping$1[catalogViewType.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                videoAlbumVh = new SeparatorVh((aVar3.c && z2) ? R.layout.catalog_separator_island_transparent_tablet : R.layout.catalog_separator_island_transparent, null, R.attr.vk_ui_transparent, 2);
                            } else if (i != 3) {
                                videoAlbumVh = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                            } else {
                                videoAlbumVh = new SeparatorVh((aVar3.c && z2) ? R.layout.catalog_separator_tablet_profile : R.layout.catalog_separator, null, 0, 6);
                            }
                        } else if (y6t0Var.z0) {
                            videoItemNoAutoPlayVh = new CatalogMviVh(aVar3.f, aVar3.e, aVar3.m, CatalogBlockVariant.Header, (com.vk.catalog.mvi.legacy.api.a) bpn0Var.getValue());
                            aVar = aVar3;
                        } else {
                            videoAlbumVh = new HeaderShowAllVh(y6t0Var, aVar3.b, y6t0Var.b0(u4aVar), aVar3.f, aVar3.w, (aVar3.c && z2) ? R.layout.catalog_header_show_all_primary_tablet_profile : R.layout.catalog_header_show_all_primary, aVar3.m);
                        }
                    } else {
                        CatalogDataType catalogDataType4 = CatalogDataType.DATA_TYPE_VIDEO_VIDEOS;
                        UserId userId = y6t0Var.b;
                        if (catalogDataType == catalogDataType4) {
                            int i2 = a.$EnumSwitchMapping$1[catalogViewType.ordinal()];
                            bpn0 bpn0Var2 = y6t0Var.v0;
                            b9s0.a aVar4 = y6t0Var.t0;
                            switch (i2) {
                                case 4:
                                    aVar = aVar3;
                                    VideoCatalogViewStyle videoCatalogViewStyle = catalogViewStyle instanceof VideoCatalogViewStyle ? (VideoCatalogViewStyle) catalogViewStyle : null;
                                    if (videoCatalogViewStyle != null && videoCatalogViewStyle.b == VideoCatalogViewStyle.Style.VideoPage) {
                                        boolean z3 = aVar.c;
                                        CatalogConfiguration catalogConfiguration = aVar.s;
                                        if (!z3) {
                                            k7a k7aVar = aVar.j;
                                            VideoItemListSettings f = VideoItemListSettings.a.f(VideoItemListSettings.i);
                                            b5a b5aVar = aVar.f;
                                            SearchStatInfoProvider searchStatInfoProvider = aVar.m;
                                            aVar4.getClass();
                                            videoAlbumVh = new VideoItemAutoPlayVh(new VideoItemListLargeVh(k7aVar, f, b5aVar, searchStatInfoProvider, null, u4aVar.b, aVar4.d, 464), aVar.f, aVar.m, epx.f(catalogConfiguration.q(), UserId.d), false, SubtitlesConfigurationMode.FROM_PERSISTENT_STORAGE, null, false, 464);
                                            break;
                                        } else {
                                            videoAlbumVh = new VideoItemNoAutoPlayVh(new VideoItemListTabletVh(aVar.f, aVar.m), aVar.f, aVar.m, epx.f(catalogConfiguration.q(), UserId.d), null, true, 144);
                                            break;
                                        }
                                    } else {
                                        videoAlbumVh = M0(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                                        break;
                                    }
                                    break;
                                case 5:
                                    int i3 = (z2 && aVar3.c) ? R.layout.catalog_video_slider_tablet_item : R.layout.catalog_video_slider_tiny_item;
                                    boolean b2 = fkq0.b(userId);
                                    if (aVar3.c && z2) {
                                        z = true;
                                    }
                                    boolean z4 = z;
                                    aVar = aVar3;
                                    videoItemNoAutoPlayVh = new VideoItemNoAutoPlayVh(new VideoItemSliderVh(i3, R.dimen.video_catalog_tiny_slider_content_item_width, u4aVar, null, null, null, null, null, false, true, b2, z4, null, (hdt0) bpn0Var2.getValue(), 35832), aVar.f, aVar.m, false, null, fkq0.b(userId), 152);
                                    y6t0Var = this;
                                    break;
                                case 6:
                                    boolean z5 = aVar3.c;
                                    aVar = aVar3;
                                    y6t0Var = y6t0Var;
                                    videoAlbumVh = new VideoItemNoAutoPlayVh(new VideoItemListSmallVh((z5 && z2) ? R.layout.catalog_video_medium_item_tablet : R.layout.catalog_video_small_item, u4aVar, aVar3.m, true, "PROFILE", z5 && z2, (hdt0) bpn0Var2.getValue(), (aVar3.c && z2) ? DonutVideoCardSource.LARGE_CARD : DonutVideoCardSource.SMALL_CARD, 248), aVar3.f, aVar3.m, epx.f(aVar3.s.q(), UserId.d), null, true, 144);
                                    break;
                                case 7:
                                    videoAlbumVh = new VideoItemNoAutoPlayVh(new ShortVideoListItemVh(aVar3.f, aVar3.m, (qwe) y6t0Var.x0.getValue(), (xlc) y6t0Var.y0.getValue(), aVar4.b), aVar3.f, aVar3.m, false, aVar4.b, false, 232);
                                    aVar = aVar3;
                                    y6t0Var = y6t0Var;
                                    break;
                                case 8:
                                    videoAlbumVh = new VideoItemNoAutoPlayVh(new VideoItemListLargeVh(aVar3.j, VideoItemListSettings.m, aVar3.f, aVar3.m, null, null, null, 1776), aVar3.f, aVar3.m, epx.f(aVar3.s.q(), UserId.d), null, false, PsExtractor.VIDEO_STREAM_MASK);
                                    aVar = aVar3;
                                    y6t0Var = y6t0Var;
                                    break;
                                default:
                                    videoAlbumVh = M0(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                                    aVar = aVar3;
                                    y6t0Var = y6t0Var;
                                    break;
                            }
                        } else {
                            aVar = aVar3;
                            if (catalogDataType == CatalogDataType.DATA_TYPE_ARTIST_VIDEOS) {
                                videoAlbumVh = M0(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                            } else {
                                boolean z6 = aVar.c;
                                videoAlbumVh = (z6 && z2 && catalogDataType == CatalogDataType.DATA_TYPE_VIDEO_ALBUMS) ? a.$EnumSwitchMapping$1[catalogViewType.ordinal()] == 9 ? new VideoAlbumVh(R.layout.catalog2_video_playlist_item_tablet, R.dimen.video_catalog_album_small_content_item_width, u4aVar, Float.valueOf(8.0f), 56) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : catalogViewType == CatalogViewType.SYNTHETIC_ACTION_CREATE_ALBUM ? new VideoProfileActionCreateAlbumVh(userId, z6) : (catalogDataType == CatalogDataType.PUBLISH_LOADING_VIDEOS || catalogDataType == CatalogDataType.DELAYED_LOADING_VIDEOS) ? new CatalogMviVh(aVar.f, aVar.e, aVar.m, CatalogBlockVariant.UploadPublishedList, (com.vk.catalog.mvi.legacy.api.a) bpn0Var.getValue()) : catalogDataType == CatalogDataType.DATA_TYPE_CLIP_DRAFTS ? new ClipDraftsBlockVh(aVar.e) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                            }
                        }
                        y6t0Var = this;
                    }
                    videoAlbumVh = videoItemNoAutoPlayVh;
                } else {
                    videoAlbumVh = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                }
            }
            aVar2 = y6t0Var.u0;
            if (aVar2 != null) {
                aVar2.invoke(videoAlbumVh, aVar);
            }
            return videoAlbumVh;
        }
        PlaceholderCatalogViewStyle placeholderCatalogViewStyle = catalogViewStyle instanceof PlaceholderCatalogViewStyle ? (PlaceholderCatalogViewStyle) catalogViewStyle : null;
        videoAlbumVh = (placeholderCatalogViewStyle != null ? placeholderCatalogViewStyle.b : null) == PlaceholderCatalogViewStyle.Style.MagicWand ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : !aVar3.c ? new VideoProfilePlaceholderVh(aVar3.w, aVar3.b, fxc0.B().E()) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
        aVar = aVar3;
        aVar2 = y6t0Var.u0;
        if (aVar2 != null) {
        }
        return videoAlbumVh;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final y7a z(lca lcaVar, CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType) {
        return a.$EnumSwitchMapping$0[catalogConfiguration$Companion$ContainerType.ordinal()] == 2 ? new y7b0(lcaVar, 3) : super.z(lcaVar, catalogConfiguration$Companion$ContainerType);
    }
}
