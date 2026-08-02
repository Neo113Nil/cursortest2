package xsna;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.LinkVh;
import com.vk.catalog2.common.ui.holders.SeparatorVh;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.video.VideoItemListSettings;
import com.vk.catalog2.common.ui.holders.vkui.LinkHorizontalListItemVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.catalog2.common.ui.mvp.holder.ComposeHeaderIconShowAllBadgeVh;
import com.vk.catalog2.common.ui.mvp.holder.HeaderIconShowAllBadgeVh;
import com.vk.catalog2.common.ui.mvp.holder.HeaderShowAllVh;
import com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ShowAllListVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemAutoPlayVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemNoAutoPlayVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemSliderVh;
import com.vk.catalog2.feature.news.holders.FeedVh;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.lists.c;
import com.vk.toggle.features.SearchFeatures;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.u4a;

/* compiled from: SearchAllCatalogConfiguration.kt */
/* loaded from: classes5.dex */
public class smh0 extends com.vk.catalog2.common.ui.mvp.configuration.a implements z3a {
    public final bpn0 D;
    public final Object E;
    public final bpn0 F;
    public final k140 G;
    public final Object H;
    public final bpn0 I;
    public final Object J;
    public final bpn0 K;
    public final bpn0 L;

    /* compiled from: SearchAllCatalogConfiguration.kt */
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
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogViewType.values().length];
            try {
                iArr2[CatalogViewType.SLIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CatalogViewType.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CatalogViewType.SLIDER_WITH_VERTICAL_VIDEOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CatalogViewType.LARGE_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1_NO_AUTOPLAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5_NO_AUTOPLAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_LARGE_LIST_NO_AUTOPLAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_FIT.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[CatalogViewType.HEADER_COMPACT.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[CatalogViewType.HEADER_LARGE.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_SEPARATOR_ISLAND.ordinal()] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[CatalogViewType.PLACEHOLDER_SMALL.ordinal()] = 14;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CatalogDataType.values().length];
            try {
                iArr3[CatalogDataType.DATA_SYNTHETIC_SHOW_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_VIDEO_VIDEOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_LINKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_CATALOG_USERS.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_GROUPS.ordinal()] = 5;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_GROUPS_ITEMS.ordinal()] = 6;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_PLACEHOLDER.ordinal()] = 7;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_SEARCH_WALL_ITEMS.ordinal()] = 8;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_SEARCH_NEWSFEED.ordinal()] = 9;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 10;
            } catch (NoSuchFieldError unused26) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* compiled from: SearchAllCatalogConfiguration.kt */
    public static final class b implements PaginatedGridListVh.c {
        @Override // com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh.c
        public final int a(int i, boolean z) {
            return 2;
        }
    }

    /* compiled from: SearchAllCatalogConfiguration.kt */
    public static final class c implements PaginatedGridListVh.d {
        @Override // com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh.d
        public final int a(UIBlock uIBlock, int i, boolean z) {
            if (uIBlock.d == CatalogViewType.DOUBLE_STACKED_LIST) {
                return 1;
            }
            return i;
        }
    }

    public smh0(UserId userId, String str) {
        super(userId, str);
        this.D = new bpn0(new zf20(this, 29));
        hj60 hj60Var = new hj60(this, 22);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.E = msy.a(lazyThreadSafetyMode, hj60Var);
        this.F = new bpn0(new t970(6));
        this.G = new k140(new uh40(this, 24));
        this.H = msy.a(lazyThreadSafetyMode, new x1c0(4));
        this.I = new bpn0(new ia90(6));
        this.J = msy.a(lazyThreadSafetyMode, new nh(28));
        this.K = new bpn0(new xk70(7));
        this.L = new bpn0(new rjg0(1));
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public vha A(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        return this.G.d(catalogConfiguration$Companion$ContainerType, u4aVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public RecyclerView.n F(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        int i = a.$EnumSwitchMapping$0[catalogConfiguration$Companion$ContainerType.ordinal()];
        return i != 1 ? i != 2 ? super.F(catalogConfiguration$Companion$ContainerType, u4aVar) : new tmh0() : new vmh0(false);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final jda K(u4a u4aVar) {
        dha dhaVar = u4aVar.b.I;
        u4a.b bVar = u4aVar.c;
        return new fz8(new wfb0(rl3.y0(new kda[]{new psh0(dhaVar, bVar.f), new fd40()})), bVar.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.z3a
    public final kxq b(lca lcaVar) {
        ((lxq) this.H.getValue()).getClass();
        return new kxq(lcaVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final CatalogPaginatedListViewHolder f0(UIBlock uIBlock, u4a u4aVar, tba<hda> tbaVar, boolean z) {
        c.h hVar = new c.h((c.m) tbaVar);
        hVar.n = u4aVar.b.h;
        b bVar = (b) this.K.getValue();
        c cVar = (c) this.L.getValue();
        SearchFeatures searchFeatures = SearchFeatures.SEARCH_INSIDE_COMMUNITY;
        searchFeatures.getClass();
        return new PaginatedGridListVh(this, hVar, tbaVar, u4aVar, bVar, cVar, null, true, 0, new PaginatedGridListVh.a(null, null, null, com.vk.toggle.b.A.a(searchFeatures), 31), null, 2880);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final y1a n(u4a u4aVar) {
        u4a.a aVar = u4aVar.b;
        return new y1a(aVar.e, new whu0(this), K(u4aVar), new ly8(aVar.H, new mcv()));
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        String str;
        CatalogViewHolder videoItemNoAutoPlayVh;
        CatalogViewHolder headerShowAllVh;
        u4a.a aVar = u4aVar.b;
        u4a.a aVar2 = u4aVar.b;
        CatalogConfiguration catalogConfiguration = aVar.s;
        SearchStatInfoProvider searchStatInfoProvider = aVar.m;
        b5a b5aVar = aVar.f;
        boolean f = epx.f(catalogConfiguration.q(), UserId.d);
        int i = a.$EnumSwitchMapping$2[catalogDataType.ordinal()];
        ?? r6 = this.J;
        CatalogViewHolder catalogViewHolder = null;
        switch (i) {
            case 1:
                if (!((Boolean) this.I.getValue()).booleanValue()) {
                    break;
                } else {
                    if (uIBlock == null || (str = uIBlock.b) == null) {
                        str = "";
                    }
                    uba ubaVar = new uba(h0(null, str, u4aVar));
                    CatalogPaginatedListViewHolder g0 = com.vk.catalog2.common.ui.mvp.configuration.a.g0(this, uIBlock, u4aVar, ubaVar, 8);
                    ShowAllListVh showAllListVh = new ShowAllListVh(u4aVar, new VkTopBarVh(aVar2.b, aVar2.e, new i7p0(new vv20(g0, 22), null, null, null, 14), null, null, b0(u4aVar), null, null, 3704), g0, false, false, false, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
                    ubaVar.h = showAllListVh;
                    break;
                }
                break;
            case 2:
                int[] iArr = a.$EnumSwitchMapping$1;
                int i2 = iArr[catalogViewType.ordinal()];
                if (i2 != 1) {
                    if (i2 == 3) {
                        videoItemNoAutoPlayVh = new VideoItemNoAutoPlayVh(new VideoItemListLargeVh(aVar.j, VideoItemListSettings.l, aVar.f, aVar.m, null, null, null, 2032), aVar.f, aVar.m, f, u4aVar.c.a, false, 224);
                    } else if (i2 != 4) {
                        switch (iArr[catalogViewType.ordinal()]) {
                            case 5:
                                videoItemNoAutoPlayVh = new VideoItemNoAutoPlayVh(new VideoItemListLargeVh(aVar.j, VideoItemListSettings.a.f(VideoItemListSettings.j), aVar.f, aVar.m, null, null, null, 2032), aVar.f, aVar.m, f, null, true, 144);
                                break;
                            case 6:
                                videoItemNoAutoPlayVh = new VideoItemNoAutoPlayVh(new VideoItemListLargeVh(aVar.j, VideoItemListSettings.a.f(VideoItemListSettings.k), aVar.f, aVar.m, null, null, null, 2032), aVar.f, aVar.m, f, null, true, 144);
                                break;
                            case 7:
                                videoItemNoAutoPlayVh = new VideoItemNoAutoPlayVh(new VideoItemListLargeVh(aVar.j, VideoItemListSettings.a.f(VideoItemListSettings.i), aVar.f, aVar.m, null, null, null, 2032), aVar.f, aVar.m, f, null, true, 144);
                                break;
                            case 8:
                                videoItemNoAutoPlayVh = new VideoItemAutoPlayVh(new VideoItemListLargeVh(aVar.j, VideoItemListSettings.a.f(VideoItemListSettings.j), aVar.f, aVar.m, null, null, null, 2032), aVar.f, aVar.m, f, false, SubtitlesConfigurationMode.FROM_PERSISTENT_STORAGE, null, false, 464);
                                break;
                            case 9:
                                videoItemNoAutoPlayVh = new VideoItemAutoPlayVh(new VideoItemListLargeVh(aVar.j, VideoItemListSettings.a.f(VideoItemListSettings.k), aVar.f, aVar.m, null, null, null, 2032), aVar.f, aVar.m, f, false, SubtitlesConfigurationMode.FROM_PERSISTENT_STORAGE, null, false, 464);
                                break;
                            case 10:
                                videoItemNoAutoPlayVh = new VideoItemAutoPlayVh(new VideoItemListLargeVh(aVar.j, VideoItemListSettings.a.f(VideoItemListSettings.i), aVar.f, aVar.m, VideoItemListLargeVh.a.b.a, null, null, 1904), aVar.f, aVar.m, f, false, SubtitlesConfigurationMode.FROM_PERSISTENT_STORAGE, null, false, 464);
                                break;
                        }
                    } else {
                        videoItemNoAutoPlayVh = new VideoItemAutoPlayVh(new VideoItemListLargeVh(aVar.j, VideoItemListSettings.a.f(VideoItemListSettings.i), aVar.f, aVar.m, null, null, null, 2032), aVar.f, aVar.m, f, false, SubtitlesConfigurationMode.FROM_PERSISTENT_STORAGE, null, false, 464);
                    }
                    catalogViewHolder = videoItemNoAutoPlayVh;
                } else {
                    catalogViewHolder = new VideoItemNoAutoPlayVh(new VideoItemSliderVh(R.layout.catalog_video_slider_small_item, R.dimen.video_catalog_small_slider_content_item_width, u4aVar, null, null, null, null, null, false, false, false, false, null, (hdt0) this.D.getValue(), 65016), aVar.f, aVar.m, f, null, false, PsExtractor.VIDEO_STREAM_MASK);
                }
                if (catalogViewHolder == null) {
                    break;
                }
                break;
            case 3:
                int i3 = a.$EnumSwitchMapping$1[catalogViewType.ordinal()];
                if (i3 == 1) {
                    catalogViewHolder = new LinkHorizontalListItemVh(aVar.f, LinkHorizontalListItemVh.Size.Small, aVar.j, aVar.m, true, 2, false, true, 5920);
                } else if (i3 == 2) {
                    catalogViewHolder = new LinkVh(aVar.f, R.layout.catalog_link_promo_list_item, R.dimen.catalog_link_small_content_item_width, aVar.j, aVar.m, null, 24256);
                }
                if (catalogViewHolder == null) {
                    break;
                }
                break;
            case 4:
                int i4 = a.$EnumSwitchMapping$1[catalogViewType.ordinal()];
                if (i4 == 1) {
                    break;
                } else if (i4 == 2) {
                    break;
                } else {
                    break;
                }
            case 5:
            case 6:
                if (a.$EnumSwitchMapping$1[catalogViewType.ordinal()] != 2) {
                    break;
                } else {
                    break;
                }
            case 7:
                if (a.$EnumSwitchMapping$1[catalogViewType.ordinal()] != 14) {
                    break;
                } else {
                    break;
                }
            case 8:
            case 9:
                FeedVh a2 = ((qxq) r6.getValue()).a(catalogViewType, catalogViewStyle, aVar.I);
                if (a2 == null) {
                    break;
                }
                break;
            case 10:
                int i5 = a.$EnumSwitchMapping$1[catalogViewType.ordinal()];
                bpn0 bpn0Var = this.F;
                switch (i5) {
                    case 11:
                        if (!((Boolean) bpn0Var.getValue()).booleanValue()) {
                            headerShowAllVh = new HeaderShowAllVh(this, aVar.b, b0(u4aVar), aVar.f, aVar.w, R.layout.catalog_search_header_suggestion, aVar.m);
                            break;
                        } else {
                            headerShowAllVh = new ComposeHeaderIconShowAllBadgeVh(this, aVar.b, b0(u4aVar), aVar.f, aVar.w, aVar.m, null, 384);
                            break;
                        }
                    case 12:
                        if (!((Boolean) bpn0Var.getValue()).booleanValue()) {
                            headerShowAllVh = new HeaderIconShowAllBadgeVh(this, aVar.b, b0(u4aVar), aVar.f, aVar.w, aVar.m, true, R.layout.catalog_search_header_large);
                            break;
                        } else {
                            headerShowAllVh = new ComposeHeaderIconShowAllBadgeVh(this, aVar.b, b0(u4aVar), aVar.f, aVar.w, aVar.m, null, 384);
                            break;
                        }
                    case 13:
                        ((qxq) r6.getValue()).getClass();
                        headerShowAllVh = new SeparatorVh(R.layout.catalog_separator_island_transparent, null, R.attr.vk_ui_transparent, 2);
                        break;
                }
                catalogViewHolder = headerShowAllVh;
                if (catalogViewHolder == null) {
                    break;
                }
                break;
        }
        return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> x(UserId userId, String str) {
        return io.reactivex.rxjava3.internal.operators.observable.g0.b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public smh0(Bundle bundle) {
        this(r0 == null ? UserId.d : r0, bundle.getString("ref"));
        UserId userId = (UserId) bundle.getParcelable("owner_id");
    }
}
