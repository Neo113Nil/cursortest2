package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.ProfileType;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogSliderViewStyle;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.HeaderCatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.HorizontalButtonStackViewStyle;
import com.vk.catalog2.common.dto.api.style.OpenSectionViewStyle;
import com.vk.catalog2.common.dto.api.style.PlaceholderCatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.VerticalVideoCatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.VideoAlbumCatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.VideoCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockFilter2D;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.holders.ActionFollowVh;
import com.vk.catalog2.common.ui.holders.CatalogMviVh;
import com.vk.catalog2.common.ui.holders.EmptyVh;
import com.vk.catalog2.common.ui.holders.LinkVh;
import com.vk.catalog2.common.ui.holders.SeparatorVh;
import com.vk.catalog2.common.ui.holders.ShimmerVh;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.button.HorizontalButtonLargeVh;
import com.vk.catalog2.common.ui.holders.button.HorizontalButtonSmallVh;
import com.vk.catalog2.common.ui.holders.group.GroupFilterVh;
import com.vk.catalog2.common.ui.holders.header.TopBarVh;
import com.vk.catalog2.common.ui.holders.placeholder.OnboardingBannerVh;
import com.vk.catalog2.common.ui.holders.placeholder.SinglelinePlaceholderVh;
import com.vk.catalog2.common.ui.holders.placeholder.UiBlockOnboardingBannerVh;
import com.vk.catalog2.common.ui.holders.video.KidsEmptyFilterPlaceholderVh;
import com.vk.catalog2.common.ui.holders.video.KidsModePlaceholderVh;
import com.vk.catalog2.common.ui.holders.video.KidsModeVh;
import com.vk.catalog2.common.ui.holders.video.PromoBannerVh;
import com.vk.catalog2.common.ui.holders.video.VideoActionCreateAlbumVh;
import com.vk.catalog2.common.ui.holders.video.VideoGoToAuthorItemHeaderButtonVh;
import com.vk.catalog2.common.ui.holders.video.VideoItemListSettings;
import com.vk.catalog2.common.ui.holders.video.VideoOnboardingVh;
import com.vk.catalog2.common.ui.holders.video.VideoProfileHorizontallScrollItemWithHighlightVh;
import com.vk.catalog2.common.ui.holders.video.group_filter.GroupFilterTileVh;
import com.vk.catalog2.common.ui.holders.vkui.LinkHorizontalListItemVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.catalog2.common.ui.mvp.holder.ComposeHeaderShowAllVh;
import com.vk.catalog2.common.ui.mvp.holder.HeaderIconShowAllBadgeVh;
import com.vk.catalog2.common.ui.mvp.holder.HeaderShowAllHighlightVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ClipsFloorsVh;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalListShowAllVh;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalListShowFiltersVh;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalNonScrollableListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalScrollableListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.catalog2.common.ui.mvp.holder.placeholder.PlaceholderVh;
import com.vk.catalog2.common.ui.mvp.holder.placeholder.VkPlaceholderVh;
import com.vk.catalog2.common.ui.mvp.holder.placeholder.VkPlaceholderVideoGrowthVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchAuthorCellVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchAuthorsListVh;
import com.vk.catalog2.common.ui.mvp.holder.search.section_navigator_vh.SectionNavigationLinksViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.video.ChildProfileVh;
import com.vk.catalog2.common.ui.mvp.holder.video.SubcategoryFilterVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoAlbumVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemAutoPlayVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemGridTabletHideVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemHideVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListSmallVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListTabletVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemNoAutoPlayVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemSliderTabletHideVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemSliderVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoProfileHorizontalScrollItemVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoToClipsBannerVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoToClipsPlaceholderVh;
import com.vk.catalog2.common.ui.mvp.holder.video.assistant.AiAssistantBannerVh;
import com.vk.catalog2.common.ui.mvp.holder.video.assistant.AiAssistantCardVh;
import com.vk.catalog2.common.ui.mvp.holder.video.category.VideoCategoryVh;
import com.vk.catalog2.common.ui.mvp.holder.video.mvi.VideoCatalogMviVh;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.SearchPlaylistViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.video.showcase.GenreActionViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.video.showcase.GenreActionsViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.video.showcase.ShowcaseVideoAutoPlayViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.video.showcase.VideoFlatActionViewHolder;
import com.vk.catalog2.common.ui.mvp.video.VideoCatalogAlbumBottomSheet;
import com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.VideoCatalogAlbumBottomSheetRedesign;
import com.vk.catalog2.video.VideoCatalogId;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.libvideo.videobottomsheet.api.a;
import com.vk.lists.c;
import com.vk.toggle.b;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.akj0;
import xsna.fet0;
import xsna.h7u0;
import xsna.u4a;
import xsna.vha;
import xsna.x2a;
import xsna.z6s0;
import xsna.z6s0.a;
import xsna.zjj0;

/* compiled from: VideoCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public class b9s0 extends com.vk.catalog2.common.ui.mvp.configuration.a {
    public final a D;
    public final String E;
    public final VideoCatalogId F;
    public final boolean G;
    public final boolean H;
    public final Object I;
    public final boolean J;
    public final Object K;
    public final boolean L;
    public final wot0 M;
    public final vou N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final bpn0 V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final Object a0;
    public final Object b0;
    public final bpn0 c0;
    public final Object d0;
    public final bpn0 e0;
    public VideoFile f0;
    public String g0;
    public String h0;
    public gzs<FullSourceJoinApi> i0;
    public b3k0 j0;
    public final boolean k0;
    public final jas0 l0;
    public final bpn0 m0;
    public final Object n0;
    public final bpn0 o0;
    public final bpn0 p0;
    public final bpn0 q0;
    public final bpn0 r0;
    public final VideoAutoPlayDelayType s0;

    /* compiled from: VideoCatalogConfiguration.kt */
    public static final class a {
        public final gzs<zia> a;
        public final ine b;
        public final y8s0 c;
        public final jsf0 d;
        public final sos0 e;

        public a() {
            throw null;
        }

        public a(gzs gzsVar, jsf0 jsf0Var, sos0 sos0Var, int i) {
            ine ineVar = new ine();
            y8s0 y8s0Var = new y8s0();
            jsf0Var = (i & 128) != 0 ? null : jsf0Var;
            sos0Var = (i & 256) != 0 ? null : sos0Var;
            this.a = gzsVar;
            this.b = ineVar;
            this.c = y8s0Var;
            this.d = jsf0Var;
            this.e = sos0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 961)) * 31)) * 923521;
            jsf0 jsf0Var = this.d;
            int hashCode2 = (hashCode + (jsf0Var == null ? 0 : jsf0Var.hashCode())) * 31;
            sos0 sos0Var = this.e;
            return hashCode2 + (sos0Var != null ? sos0Var.hashCode() : 0);
        }

        public final String toString() {
            return "Deps(viewStyleResolverProvider=" + this.a + ", performanceReporter=null, clipsOnClickListener=" + this.b + ", cacheKeyBuilder=" + this.c + ", kidsModeClickListener=null, childProfileCallbacks=null, videoCatalogLoader=null, relatedMusicInVideoInteractor=" + this.d + ", videoGrowthStatsTracker=" + this.e + ')';
        }
    }

    /* compiled from: VideoCatalogConfiguration.kt */
    public static final class b extends hig {
        public final u4a c;

        public b(q3a q3aVar, SearchStatInfoProvider searchStatInfoProvider, u4a u4aVar) {
            super(q3aVar, searchStatInfoProvider);
            this.c = u4aVar;
        }

        public static s6s0 d(b bVar, UIBlockVideo uIBlockVideo) {
            u4a u4aVar = bVar.c;
            com.vk.libvideo.videobottomsheet.api.a aVar = u4aVar.b.P;
            if (aVar == null) {
                aVar = new h9s0((bpn0) null, (bpn0) null, 6);
            }
            a.c cVar = new a.c(uIBlockVideo.N, uIBlockVideo.M, uIBlockVideo.g, uIBlockVideo.f, uIBlockVideo.H, uIBlockVideo.K);
            u6s0 b = aVar.b();
            VideoFile videoFile = uIBlockVideo.B;
            u4a.a aVar2 = u4aVar.b;
            aVar2.getClass();
            return b.a(new a.InterfaceC1255a.C1256a(videoFile, cVar, null, true), new i6s0(aVar2.f, uIBlockVideo), new c9s0(1, xg5.a(), cpu.class, "isCurrentUserOrGroupAdmin", "isCurrentUserOrGroupAdmin(Lcom/vk/dto/common/id/UserId;)Z", 0));
        }

        @Override // xsna.hig
        public final void a(Context context, UIBlock uIBlock, wnk wnkVar) {
            VideoShareComponent value;
            ImageSize Cb;
            if (wnkVar instanceof fet0) {
                fet0 fet0Var = (fet0) wnkVar;
                if ((fet0Var instanceof fet0.b) || (fet0Var instanceof fet0.c) || (fet0Var instanceof fet0.d)) {
                    return;
                }
                boolean z = fet0Var instanceof fet0.a;
                u4a u4aVar = this.c;
                com.vk.video.ui.share.api.b bVar = null;
                if (!z) {
                    if (!(fet0Var instanceof fet0.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Activity b = gnj.b(context);
                    if (b == null) {
                        return;
                    }
                    UIBlockVideo uIBlockVideo = uIBlock instanceof UIBlockVideo ? (UIBlockVideo) uIBlock : null;
                    if (uIBlockVideo == null) {
                        return;
                    }
                    com.vk.libvideo.videobottomsheet.api.a aVar = u4aVar.b.P;
                    if (aVar == null) {
                        aVar = new h9s0((bpn0) null, (bpn0) null, 6);
                    }
                    z6s0.a aVar2 = aVar.a().new a(uIBlockVideo.N, uIBlockVideo.M);
                    if (fxc0.B().J().X1()) {
                        new w6s0(d(this, uIBlockVideo), aVar2).e(b);
                        return;
                    } else {
                        new e6s0(b, d(this, uIBlockVideo), aVar2).c();
                        return;
                    }
                }
                Activity b2 = gnj.b(context);
                if (b2 == null) {
                    return;
                }
                int a = e3m.a(R.dimen.catalog_video_album_owner_avatar_small_size, context);
                fet0.a aVar3 = (fet0.a) wnkVar;
                VideoAlbum Ab = VideoAlbum.Ab(aVar3.b, false, null, 262143);
                Image image = aVar3.c;
                String str = (image == null || (Cb = image.Cb(a, false, true)) == null) ? null : Cb.d.d;
                u4a.a aVar4 = u4aVar.b;
                u4a.a aVar5 = u4aVar.b;
                w8s0 w8s0Var = new w8s0(aVar4.f, uIBlock);
                Lazy<VideoShareComponent> lazy = aVar4.S;
                if (lazy != null && (value = lazy.getValue()) != null) {
                    bVar = value.S();
                }
                com.vk.video.ui.share.api.b bVar2 = bVar;
                boolean z2 = o25.a().c0() == ProfileType.RELATED;
                if (fxc0.B().J().c1()) {
                    String str2 = uIBlock.f;
                    aVar5.getClass();
                    new VideoCatalogAlbumBottomSheetRedesign(new VideoCatalogAlbumBottomSheetRedesign.a(Ab, z2, str2, str, w8s0Var, null, bVar2)).c(b2);
                } else {
                    String str3 = uIBlock.f;
                    VideoCatalogAlbumBottomSheet.b bVar3 = new VideoCatalogAlbumBottomSheet.b(str);
                    aVar5.getClass();
                    VideoCatalogAlbumBottomSheet.a.a.a(b2, Ab, bVar3, bVar2, str3, w8s0Var, null, z2);
                }
            }
        }
    }

    /* compiled from: VideoCatalogConfiguration.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;

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
                iArr2[CatalogViewType.SLIDER_WITH_VERTICAL_VIDEOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CatalogViewType.SLIDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CatalogViewType.AI_ASSISTANT_ENTRYPOINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CatalogViewType.HORIZONTAL_BUTTONS_STACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CatalogViewType.LIST_WITH_NOTIFICATION_STATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CatalogViewType.LIST_WITH_RETURN_STATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CatalogViewType.LIST.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CatalogViewType.HEADER.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CatalogViewType.HEADER_LARGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_HIDE.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_SEPARATOR_TRANSPARENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[CatalogViewType.PLACEHOLDER.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[CatalogViewType.BANNER.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[CatalogViewType.PLACEHOLDER_SMALL.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[CatalogViewType.PLACEHOLDER_BIG.ordinal()] = 15;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[CatalogViewType.PLACEHOLDER_VIDEO_EMPTY_SHORT_VIDEO.ordinal()] = 16;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[CatalogViewType.HELP_HINT_BANNER.ordinal()] = 17;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[CatalogViewType.ASSISTANT_BANNER.ordinal()] = 18;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[CatalogViewType.SUPERAPP_TRAFFIC_GROUP_BANNER.ordinal()] = 19;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[CatalogViewType.FLOOR_CLIPS.ordinal()] = 20;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[CatalogViewType.SEARCH_FLOOR_CLIPS.ordinal()] = 21;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[CatalogViewType.CAROUSEL_CLIPS.ordinal()] = 22;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[CatalogViewType.CAROUSEL_CLIPS_WITH_SUBSCRIPTIONS.ordinal()] = 23;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[CatalogViewType.SEARCH_CAROUSEL_CLIPS.ordinal()] = 24;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[CatalogViewType.CHIPS.ordinal()] = 25;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_ACTION_CREATE_ALBUM.ordinal()] = 26;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[CatalogViewType.VIDEO_CHANGE_PROFILE.ordinal()] = 27;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[CatalogViewType.VIDEO_OWNER_GROUPS.ordinal()] = 28;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[CatalogViewType.VIDEO_BECOME_AUTHOR.ordinal()] = 29;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[CatalogViewType.VIDEO_AUTHOR_CABINET.ordinal()] = 30;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[CatalogViewType.VIDEO_CHILD_MODE.ordinal()] = 31;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[CatalogViewType.BUTTONS_HORIZONTAL_WITH_SCROLL.ordinal()] = 32;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_ACTION_FOLLOW.ordinal()] = 33;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[CatalogViewType.SHOWCASE_LIST.ordinal()] = 34;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr2[CatalogViewType.HORIZONTAL_SHOWCASE_STACK.ordinal()] = 35;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_SUBNAVIGATION_CONTAINER.ordinal()] = 36;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr2[CatalogViewType.SUBNAVIGATION_BAR.ordinal()] = 37;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION.ordinal()] = 38;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_PLACEHOLDER.ordinal()] = 39;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr2[CatalogViewType.VIDEO_GO_TO_AUTHOR.ordinal()] = 40;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr2[CatalogViewType.LARGE_LIST.ordinal()] = 41;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr2[CatalogViewType.LARGE_LIST_INFINITE.ordinal()] = 42;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1.ordinal()] = 43;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5.ordinal()] = 44;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_FIT.ordinal()] = 45;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1_NO_AUTOPLAY.ordinal()] = 46;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5_NO_AUTOPLAY.ordinal()] = 47;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_LARGE_LIST_NO_AUTOPLAY.ordinal()] = 48;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_INTERACTIVE.ordinal()] = 49;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr2[CatalogViewType.STACKED_LIST.ordinal()] = 50;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr2[CatalogViewType.VIDEO_SLIDER.ordinal()] = 51;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_STACKED_HIDE.ordinal()] = 52;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_SLIDER_HIDE.ordinal()] = 53;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr2[CatalogViewType.VIDEO_TABS_ALBUM_LIST.ordinal()] = 54;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr2[CatalogViewType.SLIDER_VERTICAL_VIDEOS_NO_AUTOPLAY.ordinal()] = 55;
            } catch (NoSuchFieldError unused58) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CatalogDataType.values().length];
            try {
                iArr3[CatalogDataType.DATA_SYNTHETIC_SHOW_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_PLACEHOLDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr3[CatalogDataType.DATA_SYNTHETIC_SECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_ACTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_GROUPS_ITEMS.ordinal()] = 5;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr3[CatalogDataType.DATA_SYNTHETIC_LOADING.ordinal()] = 6;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_CATALOG_BANNERS_ROUNDED_SMALL_IMAGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_LINKS.ordinal()] = 8;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_OWNERS.ordinal()] = 9;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_SEARCH_AUTHORS.ordinal()] = 10;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 11;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_AI_ASSISTANTS.ordinal()] = 12;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_LIVE_CATEGORY.ordinal()] = 13;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_EMPTY.ordinal()] = 14;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_VIDEO_ALBUMS.ordinal()] = 15;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_VIDEO_VIDEOS.ordinal()] = 16;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_VIDEO_CATALOG_VIDEOS.ordinal()] = 17;
            } catch (NoSuchFieldError unused75) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[HorizontalButtonStackViewStyle.Style.values().length];
            try {
                iArr4[HorizontalButtonStackViewStyle.Style.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr4[HorizontalButtonStackViewStyle.Style.LargeWithIcon.ordinal()] = 2;
            } catch (NoSuchFieldError unused77) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[PlaceholderCatalogViewStyle.Style.values().length];
            try {
                iArr5[PlaceholderCatalogViewStyle.Style.Flat.ordinal()] = 1;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr5[PlaceholderCatalogViewStyle.Style.WithButton.ordinal()] = 2;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr5[PlaceholderCatalogViewStyle.Style.MagicWand.ordinal()] = 3;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr5[PlaceholderCatalogViewStyle.Style.KidsFilter.ordinal()] = 4;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr5[PlaceholderCatalogViewStyle.Style.Fit.ordinal()] = 5;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr5[PlaceholderCatalogViewStyle.Style.SingleLine.ordinal()] = 6;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr5[PlaceholderCatalogViewStyle.Style.VKVideoBanner.ordinal()] = 7;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr5[PlaceholderCatalogViewStyle.Style.VkVideoMusicBanner.ordinal()] = 8;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr5[PlaceholderCatalogViewStyle.Style.VkVideoKidsBanner.ordinal()] = 9;
            } catch (NoSuchFieldError unused86) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[CatalogSliderViewStyle.Style.values().length];
            try {
                iArr6[CatalogSliderViewStyle.Style.Inline.ordinal()] = 1;
            } catch (NoSuchFieldError unused87) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[OpenSectionViewStyle.ButtonStyle.values().length];
            try {
                iArr7[OpenSectionViewStyle.ButtonStyle.FLAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr7[OpenSectionViewStyle.ButtonStyle.SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr7[OpenSectionViewStyle.ButtonStyle.SearchNavigationLinks.ordinal()] = 3;
            } catch (NoSuchFieldError unused90) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[VideoAlbumCatalogViewStyle.Style.values().length];
            try {
                iArr8[VideoAlbumCatalogViewStyle.Style.PlaylistShowcase.ordinal()] = 1;
            } catch (NoSuchFieldError unused91) {
            }
            $EnumSwitchMapping$7 = iArr8;
        }
    }

    /* compiled from: VideoCatalogConfiguration.kt */
    public static final class d extends z160 {
        @Override // xsna.vha
        public final c2q0 o(RecyclerView recyclerView) {
            return new vha.a(this, recyclerView, null, new q5u0(0.8f, 0.8f), 4);
        }
    }

    /* compiled from: VideoCatalogConfiguration.kt */
    public static final class e extends u96 {
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(null);
            this.d = str;
        }

        @Override // xsna.u96, xsna.gda
        public final io.reactivex.rxjava3.core.q b() {
            return rsg0.T(new rh10());
        }

        @Override // xsna.gda
        public final io.reactivex.rxjava3.core.q d(String str, String str2, String str3, boolean z, Integer num) {
            if (str == null) {
                str = this.d;
            }
            b9s0 b9s0Var = b9s0.this;
            return znk0.P(b9s0Var.D(str, str2, z), b9s0Var.j0, asu0.a.d());
        }
    }

    /* compiled from: VideoCatalogConfiguration.kt */
    public static final class f implements PaginatedGridListVh.c {
        @Override // com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh.c
        public final int a(int i, boolean z) {
            return z ? 4 : 60;
        }
    }

    /* compiled from: VideoCatalogConfiguration.kt */
    public static final class g implements PaginatedGridListVh.d {
        @Override // com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh.d
        public final int a(UIBlock uIBlock, int i, boolean z) {
            CatalogDataType catalogDataType = uIBlock.e;
            CatalogViewType catalogViewType = uIBlock.d;
            if (catalogViewType == CatalogViewType.DOUBLE_STACKED_LIST) {
                return 30;
            }
            return (catalogDataType == CatalogDataType.DATA_TYPE_MOVIES && catalogViewType == CatalogViewType.VERTICAL_GRID) ? z ? 10 : 20 : i;
        }
    }

    /* compiled from: VideoCatalogConfiguration.kt */
    public static final class h implements sha {
        @Override // xsna.sha
        public final androidx.appcompat.app.d a(Context context, gzs<s3q0> gzsVar) {
            int i = h7u0.p;
            h7u0.a c = h7u0.b.c(context);
            c.g0(R.string.video_catalog_clear_view_history_dialog_title);
            c.U(R.string.video_catalog_clear_view_history_dialog_message);
            c.c0(R.string.video_catalog_clear_view_history_dialog_confirm, new oyb0(1, gzsVar));
            c.W(R.string.video_catalog_clear_view_history_dialog_cancel, null);
            return c.create();
        }
    }

    /* compiled from: VideoCatalogConfiguration.kt */
    public static final class i implements PaginatedGridListVh.c {
        @Override // com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh.c
        public final int a(int i, boolean z) {
            return 60;
        }
    }

    /* compiled from: VideoCatalogConfiguration.kt */
    public static final class j implements PaginatedGridListVh.d {

        /* compiled from: VideoCatalogConfiguration.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[CatalogDataType.values().length];
                try {
                    iArr[CatalogDataType.DATA_TYPE_VIDEO_ALBUMS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CatalogDataType.DATA_TYPE_LIVE_CATEGORY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CatalogDataType.DATA_TYPE_VIDEO_VIDEOS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CatalogDataType.DATA_TYPE_VIDEO_CATALOG_VIDEOS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CatalogDataType.DATA_SYNTHETIC_LOADING.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[CatalogViewType.values().length];
                try {
                    iArr2[CatalogViewType.DOUBLE_STACKED_LIST.ordinal()] = 1;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[CatalogViewType.LARGE_LIST.ordinal()] = 2;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[CatalogViewType.LARGE_LIST_INFINITE.ordinal()] = 3;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_FIT.ordinal()] = 4;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1.ordinal()] = 5;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5.ordinal()] = 6;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1_NO_AUTOPLAY.ordinal()] = 7;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5_NO_AUTOPLAY.ordinal()] = 8;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_LARGE_LIST_NO_AUTOPLAY.ordinal()] = 9;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_INTERACTIVE.ordinal()] = 10;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr2[CatalogViewType.STACKED_LIST.ordinal()] = 11;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr2[CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_STACKED_HIDE.ordinal()] = 12;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr2[CatalogViewType.SYNTHETIC_PLACEHOLDER.ordinal()] = 13;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr2[CatalogViewType.VERTICAL_GRID.ordinal()] = 14;
                } catch (NoSuchFieldError unused19) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh.d
        public final int a(UIBlock uIBlock, int i, boolean z) {
            CatalogViewType catalogViewType = uIBlock.d;
            CatalogDataType catalogDataType = uIBlock.e;
            switch (a.$EnumSwitchMapping$1[catalogViewType.ordinal()]) {
                case 1:
                    int i2 = a.$EnumSwitchMapping$0[catalogDataType.ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        if (z) {
                        }
                    } else if (i2 == 3) {
                        if (z) {
                        }
                    }
                    break;
                case 11:
                    int i3 = a.$EnumSwitchMapping$0[catalogDataType.ordinal()];
                    if (i3 == 3 || i3 == 4) {
                        if (z) {
                        }
                    }
                    break;
                case 12:
                    int i4 = a.$EnumSwitchMapping$0[catalogDataType.ordinal()];
                    if (i4 == 3 || i4 == 4) {
                        if (z) {
                        }
                    }
                    break;
                case 13:
                    if (a.$EnumSwitchMapping$0[catalogDataType.ordinal()] == 5) {
                        if (z) {
                        }
                    }
                    break;
                case 14:
                    if (catalogDataType == CatalogDataType.DATA_TYPE_MOVIES) {
                    }
                    break;
            }
            return 60;
        }
    }

    public /* synthetic */ b9s0(UserId userId, String str, a aVar) {
        this(userId, null, str, aVar, null, null);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public static TopBarVh D0(b9s0 b9s0Var, boolean z, u4a u4aVar, eda edaVar, h hVar, wrl0 wrl0Var, yyq0 yyq0Var, int i2) {
        ?? r1 = b9s0Var.P;
        wrl0 wrl0Var2 = (i2 & 16) != 0 ? null : wrl0Var;
        yyq0 yyq0Var2 = (i2 & 32) != 0 ? null : yyq0Var;
        int i3 = (((Boolean) r1.getValue()).booleanValue() && z) ? R.layout.catalog_toolbar_redesign_tablet : z ? R.layout.catalog_toolbar_tablet : ((Boolean) r1.getValue()).booleanValue() ? R.layout.catalog_toolbar_redesign : R.layout.catalog_toolbar;
        if (((Boolean) r1.getValue()).booleanValue()) {
            u4a.a aVar = u4aVar.b;
            return new ToolbarRedesignVh(aVar.b, aVar.e, null, i3, false, edaVar, yyq0Var2, hVar, wrl0Var2, null, null, 8167284);
        }
        u4a.a aVar2 = u4aVar.b;
        return new ToolbarVh(aVar2.b, aVar2.e, null, i3, false, null, edaVar, yyq0Var2, hVar, wrl0Var2, null, 3972980);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public vha A(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        return catalogConfiguration$Companion$ContainerType == CatalogConfiguration$Companion$ContainerType.VERTICAL ? new d(new onh0(), u4aVar.b.I, 4) : new s4a();
    }

    public final io.reactivex.rxjava3.internal.operators.observable.m1 A0() {
        return rsg0.y0(B0(this.b), null, null, 3);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final androidx.recyclerview.widget.o0 B(CatalogViewType catalogViewType) {
        if (c.$EnumSwitchMapping$1[catalogViewType.ordinal()] == 1) {
            return null;
        }
        return super.B(catalogViewType);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    public rsg0<hda> B0(UserId userId) {
        if (!BuildInfo.q()) {
            return new w6a(N(), userId, this.h0, this.E, this.g0);
        }
        String str = this.h0;
        boolean z = false;
        boolean B = str != null ? brm0.B(str, ezv0.a, false) : false;
        wba N = N();
        String str2 = this.h0;
        String str3 = this.g0;
        if (B) {
            ((u9t0) this.S.getValue()).getClass();
            z = true;
        }
        return new y6a(N, this.F, userId, str2, this.E, str3, z, 1796);
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, kotlin.Lazy] */
    public final SearchAuthorsListVh C0(u4a u4aVar, boolean z) {
        u4a.a aVar = u4aVar.b;
        return new SearchAuthorsListVh(aVar.f, aVar.e, aVar.m, aVar.o, aVar.s, aVar.b, BuildInfo.q(), u4aVar.b.K, (o0r0) this.X.getValue(), fxc0.B(), z);
    }

    public final PaginatedGridListVh E0(u4a u4aVar, tba tbaVar, d9s0 d9s0Var) {
        c.h hVar = new c.h((c.m) tbaVar);
        hVar.n = u4aVar.b.h;
        return new PaginatedGridListVh(this, hVar, tbaVar, u4aVar, G0(u4aVar), H0(u4aVar), null, true, 0, new PaginatedGridListVh.a(d9s0Var == null ? new z3v(true) : d9s0Var, null, this.N, false, 53), (VideoGrowthComponent) ((k7m) m7m.f(this)).a(fpf0.a(VideoGrowthComponent.class)), 832);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public RecyclerView.n F(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        if (u4aVar.b.c && this.L) {
            int i2 = c.$EnumSwitchMapping$0[catalogConfiguration$Companion$ContainerType.ordinal()];
            if (i2 == 1) {
                return new kas0(false);
            }
            if (i2 == 2) {
                return new fas0();
            }
            if (i2 == 3) {
                return new eas0(false);
            }
            throw new NoWhenBranchMatchedException();
        }
        int i3 = c.$EnumSwitchMapping$0[catalogConfiguration$Companion$ContainerType.ordinal()];
        if (i3 == 1) {
            return new kas0(false);
        }
        if (i3 == 2) {
            return new i9s0();
        }
        if (i3 == 3) {
            return super.F(catalogConfiguration$Companion$ContainerType, u4aVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final BridgeComponent F0() {
        return (BridgeComponent) this.U.getValue();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final Boolean G(lca lcaVar, tca tcaVar) {
        UIBlock uIBlock = tcaVar.n;
        return (uIBlock != null ? uIBlock.d : null) == CatalogViewType.LIST ? Boolean.TRUE : super.G(lcaVar, tcaVar);
    }

    public PaginatedGridListVh.c G0(u4a u4aVar) {
        return (u4aVar.b.c && this.L) ? (i) this.r0.getValue() : (f) this.p0.getValue();
    }

    public PaginatedGridListVh.d H0(u4a u4aVar) {
        return (u4aVar.b.c && this.L) ? (j) this.q0.getValue() : (g) this.o0.getValue();
    }

    public ias0 I0() {
        return this.l0;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final boolean J() {
        return this.k0;
    }

    /* JADX WARN: Type inference failed for: r9v18, types: [java.lang.Object, kotlin.Lazy] */
    public final CatalogViewHolder J0(CatalogDataType catalogDataType, CatalogViewType catalogViewType, VideoAlbumCatalogViewStyle videoAlbumCatalogViewStyle, u4a u4aVar) {
        if (catalogDataType == CatalogDataType.DATA_TYPE_VIDEO_ALBUMS) {
            int i2 = c.$EnumSwitchMapping$1[catalogViewType.ordinal()];
            bpn0 bpn0Var = this.c0;
            if (i2 == 2) {
                if (u4aVar.b.c || !fxc0.B().J().I()) {
                    return new VideoAlbumVh(R.layout.catalog_video_search_playlist_single_row_small_slider_item, R.dimen.video_catalog_playlist_item_width, u4aVar, null, 120);
                }
                u4a.a aVar = u4aVar.b;
                return new CatalogMviVh(aVar.f, aVar.e, aVar.m, CatalogBlockVariant.AlbumsSlider, (com.vk.catalog.mvi.legacy.api.a) bpn0Var.getValue());
            }
            if (i2 == 41) {
                VideoAlbumCatalogViewStyle.Style style = videoAlbumCatalogViewStyle != null ? videoAlbumCatalogViewStyle.b : null;
                if ((style == null ? -1 : c.$EnumSwitchMapping$7[style.ordinal()]) == 1) {
                    return new SearchPlaylistViewHolder(u4aVar);
                }
            } else if (i2 == 54 && ((Boolean) this.d0.getValue()).booleanValue()) {
                u4a.a aVar2 = u4aVar.b;
                b5a b5aVar = aVar2.f;
                q3a q3aVar = aVar2.e;
                com.vk.catalog.mvi.legacy.api.a aVar3 = (com.vk.catalog.mvi.legacy.api.a) bpn0Var.getValue();
                CatalogBlockVariant catalogBlockVariant = CatalogBlockVariant.AlbumsTabsList;
                u4a.a aVar4 = u4aVar.b;
                return new CatalogMviVh(b5aVar, q3aVar, catalogBlockVariant, aVar3, new b(aVar4.e, aVar4.m, u4aVar));
            }
        }
        return null;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final jda K(u4a u4aVar) {
        return new zxs0(I0(), this.M, this.b);
    }

    public final CatalogViewHolder K0(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, u4a u4aVar, boolean z) {
        if (catalogDataType != CatalogDataType.DATA_TYPE_VIDEO_VIDEOS && catalogDataType != CatalogDataType.DATA_TYPE_VIDEO_CATALOG_VIDEOS) {
            return null;
        }
        VideoCatalogViewStyle videoCatalogViewStyle = catalogViewStyle instanceof VideoCatalogViewStyle ? (VideoCatalogViewStyle) catalogViewStyle : null;
        VideoCatalogViewStyle.Style style = videoCatalogViewStyle != null ? videoCatalogViewStyle.b : null;
        int i2 = c.$EnumSwitchMapping$1[catalogViewType.ordinal()];
        bpn0 bpn0Var = this.c0;
        a aVar = this.D;
        if (i2 == 41) {
            if (fxc0.B().J().G1()) {
                CatalogBlockVariant catalogBlockVariant = CatalogBlockVariant.VideosLargeList;
                com.vk.catalog.mvi.legacy.api.a aVar2 = (com.vk.catalog.mvi.legacy.api.a) bpn0Var.getValue();
                u4a.a aVar3 = u4aVar.b;
                b bVar = new b(aVar3.e, aVar3.m, u4aVar);
                com.vk.video.focus.api.a aVar4 = (com.vk.video.focus.api.a) this.e0.getValue();
                aVar.getClass();
                return new VideoCatalogMviVh(u4aVar, catalogBlockVariant, aVar2, bVar, aVar4);
            }
            u4a.a aVar5 = u4aVar.b;
            k7a k7aVar = aVar5.j;
            VideoItemListSettings f2 = VideoItemListSettings.a.f(VideoItemListSettings.i);
            b5a b5aVar = aVar5.f;
            SearchStatInfoProvider searchStatInfoProvider = aVar5.m;
            aVar.getClass();
            return new VideoItemAutoPlayVh(new VideoItemListLargeVh(k7aVar, f2, b5aVar, searchStatInfoProvider, null, u4aVar.b, aVar.d, 464), aVar5.f, aVar5.m, z, false, SubtitlesConfigurationMode.FROM_PERSISTENT_STORAGE, null, false, 464);
        }
        if (i2 == 20 || i2 == 22 || i2 == 24 || i2 == 21 || i2 == 23) {
            VideoItemListLargeVh z0 = z0(catalogViewType, catalogViewStyle, u4aVar);
            u4a.a aVar6 = u4aVar.b;
            return this.J ? new VideoItemAutoPlayVh(z0, aVar6.f, aVar6.m, z, false, SubtitlesConfigurationMode.ALWAYS_DISABLED, aVar.b, false, 384) : new VideoItemNoAutoPlayVh(z0, aVar6.f, aVar6.m, z, aVar.b, false, 224);
        }
        if (i2 == 1) {
            VideoItemListLargeVh z02 = z0(catalogViewType, catalogViewStyle, u4aVar);
            u4a.a aVar7 = u4aVar.b;
            return new VideoItemNoAutoPlayVh(z02, aVar7.f, aVar7.m, z, aVar.b, false, 224);
        }
        if (i2 == 55) {
            u4a.a aVar8 = u4aVar.b;
            VideoItemListLargeVh videoItemListLargeVh = new VideoItemListLargeVh(aVar8.j, VideoItemListSettings.m, aVar8.f, aVar8.m, null, aVar8, null, 1520);
            u4a.a aVar9 = u4aVar.b;
            return new VideoItemNoAutoPlayVh(videoItemListLargeVh, aVar9.f, aVar9.m, z, aVar.b, false, 224);
        }
        if (i2 == 40) {
            return fxc0.B().J().L() ? new VideoGoToAuthorItemHeaderButtonVh(R.layout.catalog2_action_goto_author, F0().F()) : L0(catalogViewType, u4aVar, z);
        }
        if (i2 != 2 || style != VideoCatalogViewStyle.Style.None || !fxc0.B().J().V1()) {
            return L0(catalogViewType, u4aVar, z);
        }
        u4a.a aVar10 = u4aVar.b;
        b5a b5aVar2 = aVar10.f;
        q3a q3aVar = aVar10.e;
        CatalogBlockVariant catalogBlockVariant2 = CatalogBlockVariant.VideosSlider;
        com.vk.catalog.mvi.legacy.api.a aVar11 = (com.vk.catalog.mvi.legacy.api.a) bpn0Var.getValue();
        u4a.a aVar12 = u4aVar.b;
        return new CatalogMviVh(b5aVar2, q3aVar, catalogBlockVariant2, aVar11, new b(aVar12.e, aVar12.m, u4aVar));
    }

    public final VideoItemVh L0(CatalogViewType catalogViewType, u4a u4aVar, boolean z) {
        int i2 = c.$EnumSwitchMapping$1[catalogViewType.ordinal()];
        a aVar = this.D;
        switch (i2) {
            case 43:
                u4a.a aVar2 = u4aVar.b;
                u4a.a aVar3 = u4aVar.b;
                return new VideoItemAutoPlayVh(new VideoItemListLargeVh(aVar2.j, VideoItemListSettings.a.f(VideoItemListSettings.j), aVar3.f, aVar3.m, null, aVar3, aVar.d, 496), aVar3.f, aVar3.m, z, false, SubtitlesConfigurationMode.FROM_PERSISTENT_STORAGE, null, false, 464);
            case 44:
                u4a.a aVar4 = u4aVar.b;
                u4a.a aVar5 = u4aVar.b;
                return new VideoItemAutoPlayVh(new VideoItemListLargeVh(aVar4.j, VideoItemListSettings.a.f(VideoItemListSettings.k), aVar5.f, aVar5.m, null, aVar5, aVar.d, 496), aVar5.f, aVar5.m, z, false, SubtitlesConfigurationMode.FROM_PERSISTENT_STORAGE, null, false, 464);
            case 45:
                u4a.a aVar6 = u4aVar.b;
                k7a k7aVar = aVar6.j;
                VideoItemListSettings f2 = VideoItemListSettings.a.f(VideoItemListSettings.i);
                b5a b5aVar = aVar6.f;
                SearchStatInfoProvider searchStatInfoProvider = aVar6.m;
                aVar.getClass();
                return new VideoItemAutoPlayVh(new VideoItemListLargeVh(k7aVar, f2, b5aVar, searchStatInfoProvider, VideoItemListLargeVh.a.b.a, u4aVar.b, null, 1360), aVar6.f, aVar6.m, z, false, SubtitlesConfigurationMode.FROM_PERSISTENT_STORAGE, null, false, 464);
            case 46:
                u4a.a aVar7 = u4aVar.b;
                u4a.a aVar8 = u4aVar.b;
                return new VideoItemNoAutoPlayVh(new VideoItemListLargeVh(aVar7.j, VideoItemListSettings.a.f(VideoItemListSettings.j), aVar8.f, aVar8.m, null, aVar8, null, 1520), aVar8.f, aVar8.m, z, null, true, 144);
            case 47:
                u4a.a aVar9 = u4aVar.b;
                u4a.a aVar10 = u4aVar.b;
                return new VideoItemNoAutoPlayVh(new VideoItemListLargeVh(aVar9.j, VideoItemListSettings.a.f(VideoItemListSettings.k), aVar10.f, aVar10.m, null, aVar10, null, 1520), aVar10.f, aVar10.m, z, null, true, 144);
            case 48:
                u4a.a aVar11 = u4aVar.b;
                u4a.a aVar12 = u4aVar.b;
                return new VideoItemNoAutoPlayVh(new VideoItemListLargeVh(aVar11.j, VideoItemListSettings.a.f(VideoItemListSettings.i), aVar12.f, aVar12.m, null, aVar12, null, 1520), aVar12.f, aVar12.m, z, null, true, 144);
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r1 != com.vk.catalog2.video.VideoCatalogId.SUBSCRIPTIONS) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
    
        if ((r4 instanceof xsna.ozh0) == false) goto L17;
     */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final db80 M(CatalogConfiguration.AutoPlayEntryPoint autoPlayEntryPoint) {
        boolean G = fxc0.B().J().G();
        if (fxc0.B().J().Q1()) {
            if (BuildInfo.q()) {
                if (autoPlayEntryPoint != CatalogConfiguration.AutoPlayEntryPoint.Search) {
                    VideoCatalogId videoCatalogId = VideoCatalogId.HOME;
                    VideoCatalogId videoCatalogId2 = this.F;
                    if (videoCatalogId2 != videoCatalogId) {
                    }
                    return new uah0(0.5f, G ? 0.5f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 9);
                }
            } else if (BuildInfo.s()) {
            }
        }
        return G ? new ddh0(4) : V();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final wba N() {
        this.D.getClass();
        return new wba();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final boolean O(UserId userId) {
        this.D.getClass();
        return false;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final boolean P() {
        return true;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final g3a S(u4a u4aVar, String str) {
        e740 e740Var;
        x2a eVar;
        Long z;
        VideoFeatures videoFeatures = VideoFeatures.CATALOG_CACHE_P;
        videoFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        boolean a2 = bVar.a(videoFeatures);
        b.d j2 = bVar.j(videoFeatures.getKey(), false);
        JSONObject g2 = j2 != null ? j2.g() : null;
        if (a2) {
            e740Var = new e740((g2 == null || (z = f370.z(g2, "expiration_time")) == null) ? -1L : z.longValue(), asu0.a.d());
        } else {
            e740Var = null;
        }
        if (a2) {
            Integer x = g2 != null ? f370.x(g2, "strategy_type") : null;
            eVar = (x != null && x.intValue() == 1) ? new x2a.a() : (x != null && x.intValue() == 2) ? new x2a.b(false) : new x2a.e();
        } else {
            eVar = new x2a.e();
        }
        return new g3a(this, u4aVar, K(u4aVar), eVar, null, null, e740Var, u4aVar.b.H, null, null, 31920);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final void T(RecyclerView recyclerView) {
        super.T(recyclerView);
        recyclerView.getRecycledViewPool().setMaxRecycledViews(((mca) this.T.getValue()).a(CatalogDataType.DATA_TYPE_VIDEO_VIDEOS, CatalogViewType.LIST, null, false), 10);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public ayn0 W(RecyclerView recyclerView) {
        return this.L ? new ayn0(recyclerView, null, 24) : super.W(recyclerView);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public CatalogPaginatedListViewHolder f0(UIBlock uIBlock, u4a u4aVar, tba<hda> tbaVar, boolean z) {
        return E0(u4aVar, tbaVar, null);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return this.s0;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public tba<hda> h0(UIBlock uIBlock, String str, u4a u4aVar) {
        List<String> list;
        u4a.a aVar = u4aVar.b;
        e eVar = new e(str);
        boolean z = uIBlock instanceof UIBlockList;
        UIBlockList uIBlockList = z ? (UIBlockList) uIBlock : null;
        boolean z2 = uIBlockList == null;
        boolean z3 = (uIBlockList == null || (list = uIBlockList.h) == null) ? false : !list.isEmpty();
        boolean z4 = aVar.c;
        zda zdaVar = aVar.H;
        boolean z5 = this.L;
        if (z4 && z5 && uIBlockList != null) {
            bit0 bit0Var = bit0.a;
            bit0Var.getClass();
            if ((bit0.b(uIBlockList) ? uIBlockList : null) != null) {
                uIBlockList = bit0Var.a(uIBlockList);
            }
        }
        if (aVar.c && z5) {
            zdaVar = new x3a(e43.l(zdaVar, new cit0(u4aVar)));
        }
        return new kea(eVar, K(u4aVar), u4aVar, a0(u4aVar), z3, uIBlockList, str, z2, null, uIBlock instanceof UIBlockFilter2D ? true : z ? k5a.b(uIBlock, new l140(25)) : false ? new aia(N(), aVar.e, K(u4aVar), g()) : b0(u4aVar), zdaVar, null, null, false, null, 125696);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final gda l(String str) {
        return new e(str);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final y1a n(u4a u4aVar) {
        u4a.a aVar = u4aVar.b;
        return new y1a(aVar.e, new whu0(this), K(u4aVar), new ly8(aVar.H, new mcv()));
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final sha p0() {
        return new h();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final Bundle r() {
        Bundle r = super.r();
        r.putString("key_url", this.h0);
        return r;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final qca s() {
        return (qca) this.m0.getValue();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final String t() {
        return (String) this.D.c.invoke(this.b, this.h0, this.E, this.F, this.g0, this.c);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x006a. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v100, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v128, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v60, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v65, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        String str;
        String str2;
        int i2;
        CatalogViewHolder composeHeaderShowAllVh;
        CatalogViewHolder J0;
        CatalogViewHolder catalogViewHolder;
        CatalogViewHolder J02;
        CatalogViewStyle catalogViewStyle2;
        u4a u4aVar2;
        boolean z;
        boolean z2;
        VideoCatalogViewStyle.Style style;
        CatalogViewHolder K0;
        CatalogDataType catalogDataType2;
        CatalogDataType catalogDataType3;
        u4a u4aVar3 = u4aVar;
        u4a.a aVar = u4aVar3.b;
        int[] iArr = c.$EnumSwitchMapping$2;
        int i3 = iArr[catalogDataType.ordinal()];
        ?? r6 = this.Z;
        a aVar2 = this.D;
        boolean z3 = this.L;
        switch (i3) {
            case 1:
                if (uIBlock == null || (str = uIBlock.b) == null) {
                    str = "";
                }
                tba<hda> h0 = h0(null, str, u4aVar3);
                com.vk.video.ui.discovery.minimizable.related_videos.j jVar = new com.vk.video.ui.discovery.minimizable.related_videos.j(uIBlock, this, u4aVar3, 13);
                uba ubaVar = new uba(h0);
                CatalogPaginatedListViewHolder catalogPaginatedListViewHolder = (CatalogPaginatedListViewHolder) jVar.invoke(ubaVar);
                ubaVar.h = catalogPaginatedListViewHolder;
                return catalogPaginatedListViewHolder;
            case 2:
                PlaceholderCatalogViewStyle placeholderCatalogViewStyle = catalogViewStyle instanceof PlaceholderCatalogViewStyle ? (PlaceholderCatalogViewStyle) catalogViewStyle : null;
                switch (c.$EnumSwitchMapping$1[catalogViewType.ordinal()]) {
                    case 12:
                        PlaceholderCatalogViewStyle.Style style2 = placeholderCatalogViewStyle != null ? placeholderCatalogViewStyle.b : null;
                        int i4 = style2 != null ? c.$EnumSwitchMapping$4[style2.ordinal()] : -1;
                        if (i4 == 1) {
                            ro5 ro5Var = (ro5) this.R.getValue();
                            aVar.getClass();
                            aVar2.getClass();
                            return new KidsModeVh(ro5Var);
                        }
                        if (i4 == 2) {
                            aVar2.getClass();
                            return new ChildProfileVh(aVar.w, aVar.b, aVar.f, F0().t().b());
                        }
                        if (i4 != 3) {
                            return i4 != 4 ? i4 != 5 ? new PlaceholderVh(aVar.w, false, false, null, null, R.layout.catalog2_video_placeholder_full_screen, null, 0, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE) : new PlaceholderVh(aVar.w, false, false, null, null, R.layout.catalog2_video_placeholder_full_screen, null, 0, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE) : new KidsEmptyFilterPlaceholderVh(aVar.e);
                        }
                        aVar2.getClass();
                        return new KidsModePlaceholderVh();
                    case 13:
                        if (BuildInfo.q() && (str2 = this.h0) != null && brm0.B(str2, ezv0.a, false)) {
                            return new PromoBannerVh(aVar.e, new mll0(u4aVar, 11));
                        }
                        PlaceholderCatalogViewStyle.Style style3 = placeholderCatalogViewStyle != null ? placeholderCatalogViewStyle.b : null;
                        int i5 = style3 != null ? c.$EnumSwitchMapping$4[style3.ordinal()] : -1;
                        return (i5 == 7 || i5 == 8 || i5 == 9) ? new UiBlockOnboardingBannerVh(aVar.e, style3) : new EmptyVh(false);
                    case 14:
                        PlaceholderCatalogViewStyle.Style style4 = placeholderCatalogViewStyle != null ? placeholderCatalogViewStyle.b : null;
                        return (style4 != null ? c.$EnumSwitchMapping$4[style4.ordinal()] : -1) == 6 ? new SinglelinePlaceholderVh() : fxc0.B().J().d1() ? new VkPlaceholderVh(aVar.w) : new PlaceholderVh(aVar.w, false, false, null, null, 0, null, 0, 254);
                    case 15:
                        return new PlaceholderVh(aVar.w, false, false, null, null, R.layout.global_search_catalog_placeholder_view, null, 0, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE);
                    case 16:
                        return new VideoToClipsPlaceholderVh(aVar.w);
                    case 17:
                        BridgeComponent F0 = F0();
                        return new OnboardingBannerVh(HintId.INFO_CJM_MONETIZATION_BANNER, aVar.e, F0.t(), F0.p());
                    case 18:
                        return new AiAssistantBannerVh((nc1) r6.getValue());
                    case 19:
                        return new VkPlaceholderVideoGrowthVh(u4aVar.c.a, aVar2.e);
                    default:
                        return super.w(catalogDataType, catalogViewType, placeholderCatalogViewStyle, uIBlock, u4aVar);
                }
            case 3:
                int i6 = c.$EnumSwitchMapping$1[catalogViewType.ordinal()];
                if (i6 == 2) {
                    y1a n = n(u4aVar3);
                    CatalogSliderViewStyle catalogSliderViewStyle = catalogViewStyle instanceof CatalogSliderViewStyle ? (CatalogSliderViewStyle) catalogViewStyle : null;
                    CatalogSliderViewStyle.Style style5 = catalogSliderViewStyle != null ? catalogSliderViewStyle.b : null;
                    return (style5 != null ? c.$EnumSwitchMapping$5[style5.ordinal()] : -1) == 1 ? new HorizontalListShowFiltersVh(this, new c.h((c.m) n), n, u4aVar3) : new HorizontalListShowAllVh(this, new c.h((c.m) n), n, u4aVar3, n0());
                }
                switch (i6) {
                    case 20:
                    case 21:
                        y1a n2 = n(u4aVar3);
                        return new ClipsFloorsVh(this, new c.h((c.m) n2), n2, u4aVar3, null, A(CatalogConfiguration$Companion$ContainerType.HORIZONTAL, u4aVar3));
                    case 22:
                    case 23:
                    case 24:
                        return o(uIBlock, u4aVar3, catalogViewStyle);
                    default:
                        return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                }
            case 4:
                switch (c.$EnumSwitchMapping$1[catalogViewType.ordinal()]) {
                    case 25:
                        return new VideoOnboardingVh(aVar.e);
                    case 26:
                        return (z3 && aVar.c) ? new VideoActionCreateAlbumVh(this.b, 2) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                    case 27:
                        return new VideoProfileHorizontallScrollItemWithHighlightVh(catalogViewType, aVar.f, aVar.e);
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        return new VideoProfileHorizontalScrollItemVh(catalogViewType, F0().t());
                    case 32:
                        return new HorizontalScrollableListVh(this, u4aVar3, cn70.b(4), Integer.valueOf(cn70.b(8)), 16);
                    case 33:
                        return new ActionFollowVh(aVar.e, aVar.j, aVar.f, aVar.m, new nof0(6), this.i0);
                    case 34:
                        return new GenreActionsViewHolder(this, u4aVar3, n0());
                    case 35:
                        return new HorizontalNonScrollableListVh(this, u4aVar, 0, Integer.valueOf(cn70.b(12)), cn70.b(aVar.c ? 32 : 16), 4);
                    case 36:
                        return new HorizontalNonScrollableListVh(this, u4aVar3, 0, Integer.valueOf(cn70.b(8)), cn70.b(0), 4);
                    case 37:
                        return new SubcategoryFilterVh(new wtm0(aVar.e, aVar.f, b0(u4aVar3), 8));
                    case 38:
                        OpenSectionViewStyle openSectionViewStyle = catalogViewStyle instanceof OpenSectionViewStyle ? (OpenSectionViewStyle) catalogViewStyle : null;
                        OpenSectionViewStyle.ButtonStyle buttonStyle = openSectionViewStyle != null ? openSectionViewStyle.b : null;
                        int i7 = buttonStyle != null ? c.$EnumSwitchMapping$6[buttonStyle.ordinal()] : -1;
                        return i7 != 1 ? i7 != 2 ? i7 != 3 ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : new SectionNavigationLinksViewHolder(this, aVar.b, aVar.e, aVar.f, aVar.m) : new GenreActionViewHolder(this, u4aVar3, n0()) : new VideoFlatActionViewHolder(this, u4aVar3, n0());
                    default:
                        return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                }
            case 5:
                if (c.$EnumSwitchMapping$1[catalogViewType.ordinal()] != 2) {
                    return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                }
                if (((Boolean) this.I.getValue()).booleanValue()) {
                    return new GroupFilterTileVh(aVar.m, aVar.e, aVar.f);
                }
                boolean z4 = this.H;
                if (z4) {
                    i2 = R.layout.catalog_link_slider_item_with_live_badge;
                } else {
                    if (z4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R.layout.catalog_link_slider_item;
                }
                return new GroupFilterVh(i2, aVar.d, aVar.f, aVar.e, aVar.m);
            case 6:
                int i8 = c.$EnumSwitchMapping$1[catalogViewType.ordinal()];
                if (i8 == 39) {
                    return new ShimmerVh((aVar.c && z3) ? R.layout.catalog_video_card_shimmer_tablet_redesign : R.layout.catalog_video_card_shimmer, 14, false, null);
                }
                if (i8 != 40) {
                    return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                }
                if (fxc0.B().J().L()) {
                    return new ShimmerVh((aVar.c && z3) ? R.layout.catalog2_action_goto_author_shimmer_tablet : R.layout.catalog2_action_goto_author_shimmer, 14, false, null);
                }
                return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
            case 7:
                return new VideoToClipsBannerVh(aVar.e, aVar.f, aVar.w);
            case 8:
                return c.$EnumSwitchMapping$1[catalogViewType.ordinal()] == 2 ? (aVar.c && z3) ? new LinkVh(aVar.f, R.layout.catalog_link_slider_big_icon_item, R.dimen.catalog_link_small_list_content_item_fixed_size, aVar.j, aVar.m, new LinkVh.a(true, null), 27296) : new LinkHorizontalListItemVh(aVar.f, LinkHorizontalListItemVh.Size.Small, aVar.j, aVar.m, true, 0, false, false, 8160) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
            case 9:
            case 10:
                int i9 = c.$EnumSwitchMapping$1[catalogViewType.ordinal()];
                ?? r2 = this.K;
                return (i9 == 5 && ((Boolean) r2.getValue()).booleanValue()) ? C0(u4aVar3, false) : (i9 == 6 && ((Boolean) r2.getValue()).booleanValue()) ? C0(u4aVar3, true) : (i9 == 7 && fxc0.B().J().a1()) ? new SearchAuthorCellVh(aVar.f, aVar.e, aVar.m, aVar.o, aVar.s, aVar.b, aVar.K) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
            case 11:
                switch (c.$EnumSwitchMapping$1[catalogViewType.ordinal()]) {
                    case 8:
                        HeaderCatalogViewStyle headerCatalogViewStyle = catalogViewStyle instanceof HeaderCatalogViewStyle ? (HeaderCatalogViewStyle) catalogViewStyle : null;
                        if ((headerCatalogViewStyle != null ? headerCatalogViewStyle.b : null) != HeaderCatalogViewStyle.Style.Highlight || !fxc0.B().J().t1()) {
                            composeHeaderShowAllVh = new ComposeHeaderShowAllVh(this, aVar.b, b0(u4aVar3), aVar.f, aVar.w, aVar.m, null, ((Boolean) this.Q.getValue()).booleanValue(), aVar.e, 64);
                            break;
                        } else {
                            composeHeaderShowAllVh = new HeaderShowAllHighlightVh(this, aVar.b, b0(u4aVar3), aVar.f, aVar.w, (aVar.c && z3) ? R.layout.catalog_header_show_all_tablet_highlighted : R.layout.catalog_header_show_all_highlighted, aVar.m, aVar.e, F0().t().b());
                            break;
                        }
                        break;
                    case 9:
                        composeHeaderShowAllVh = new HeaderIconShowAllBadgeVh(this, aVar.b, b0(u4aVar3), aVar.f, aVar.w, aVar.m, true, R.layout.catalog_search_header_large);
                        break;
                    case 10:
                        composeHeaderShowAllVh = new VideoItemHideVh(aVar.f, aVar.m);
                        break;
                    case 11:
                        composeHeaderShowAllVh = new SeparatorVh(R.layout.catalog_separator_transparent, null, R.attr.vk_ui_transparent, 2);
                        break;
                    default:
                        composeHeaderShowAllVh = null;
                        break;
                }
                return composeHeaderShowAllVh == null ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : composeHeaderShowAllVh;
            case 12:
                return c.$EnumSwitchMapping$1[catalogViewType.ordinal()] == 3 ? new AiAssistantCardVh((nc1) r6.getValue(), (mc1) this.a0.getValue(), (lc1) this.b0.getValue(), aVar.e, (b25) this.Y.getValue(), fxc0.B().J()) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
            case 13:
                return new VideoCategoryVh();
            case 14:
                if (c.$EnumSwitchMapping$1[catalogViewType.ordinal()] != 4) {
                    return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                }
                if (!((Boolean) this.O.getValue()).booleanValue()) {
                    return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                }
                boolean z5 = aVar.c;
                HorizontalButtonStackViewStyle horizontalButtonStackViewStyle = catalogViewStyle instanceof HorizontalButtonStackViewStyle ? (HorizontalButtonStackViewStyle) catalogViewStyle : null;
                HorizontalButtonStackViewStyle.Style style6 = horizontalButtonStackViewStyle != null ? horizontalButtonStackViewStyle.b : null;
                int i10 = style6 != null ? c.$EnumSwitchMapping$3[style6.ordinal()] : -1;
                ?? r3 = this.W;
                return i10 != 1 ? i10 != 2 ? new EmptyVh(false) : new HorizontalButtonLargeVh((qdz) r3.getValue(), z5) : new HorizontalButtonSmallVh((qdz) r3.getValue());
            default:
                CatalogConfiguration catalogConfiguration = aVar.s;
                SearchStatInfoProvider searchStatInfoProvider = aVar.m;
                b5a b5aVar = aVar.f;
                boolean z6 = aVar.c;
                boolean f2 = epx.f(catalogConfiguration.q(), UserId.d);
                k7a k7aVar = aVar.j;
                boolean z7 = z6 && z3;
                switch (iArr[catalogDataType.ordinal()]) {
                    case 15:
                        VideoAlbumCatalogViewStyle videoAlbumCatalogViewStyle = catalogViewStyle instanceof VideoAlbumCatalogViewStyle ? (VideoAlbumCatalogViewStyle) catalogViewStyle : null;
                        if (z7) {
                            Float valueOf = Float.valueOf(12.0f);
                            if (catalogDataType == CatalogDataType.DATA_TYPE_VIDEO_ALBUMS) {
                                int i11 = c.$EnumSwitchMapping$1[catalogViewType.ordinal()];
                                if (i11 == 2) {
                                    J0 = new VideoAlbumVh(R.layout.catalog_video_playlist_list_item_tablet_slider, R.dimen.catalog_video_playlist_list_item_tablet_slider_width, u4aVar, valueOf, 56);
                                } else if (i11 == 7) {
                                    J0 = new VideoAlbumVh(R.layout.catalog2_video_playlist_item_tablet, R.dimen.video_catalog_album_small_content_item_width, u4aVar, Float.valueOf(8.0f), 56);
                                } else if (i11 != 41) {
                                    J02 = J0(catalogDataType, catalogViewType, videoAlbumCatalogViewStyle, u4aVar3);
                                    catalogViewHolder = J02;
                                    break;
                                } else {
                                    J0 = new VideoAlbumVh(R.layout.catalog_video_playlist_list_item_tablet, R.dimen.video_catalog_playlist_list_item_tablet_width, u4aVar, valueOf, 56);
                                }
                            }
                            catalogViewHolder = null;
                            break;
                        } else {
                            J0 = J0(catalogDataType, catalogViewType, videoAlbumCatalogViewStyle, u4aVar3);
                        }
                        catalogViewHolder = J0;
                        break;
                    case 16:
                    case 17:
                        if (z7) {
                            CatalogDataType catalogDataType4 = CatalogDataType.DATA_TYPE_VIDEO_VIDEOS;
                            if (catalogDataType == catalogDataType4 || catalogDataType == CatalogDataType.DATA_TYPE_VIDEO_CATALOG_VIDEOS) {
                                int[] iArr2 = c.$EnumSwitchMapping$1;
                                int i12 = iArr2[catalogViewType.ordinal()];
                                bpn0 bpn0Var = this.V;
                                if (i12 == 2) {
                                    catalogViewStyle2 = catalogViewStyle;
                                    u4aVar2 = u4aVar3;
                                    VideoCatalogViewStyle videoCatalogViewStyle = catalogViewStyle2 instanceof VideoCatalogViewStyle ? (VideoCatalogViewStyle) catalogViewStyle2 : null;
                                    if (videoCatalogViewStyle == null || !((style = videoCatalogViewStyle.b) == VideoCatalogViewStyle.Style.Showcase || style == VideoCatalogViewStyle.Style.ShowcaseWithDescription)) {
                                        if ((videoCatalogViewStyle != null ? videoCatalogViewStyle.b : null) == VideoCatalogViewStyle.Style.None && fxc0.B().J().V1()) {
                                            catalogViewHolder = new CatalogMviVh(aVar.f, aVar.e, CatalogBlockVariant.VideosSlider, (com.vk.catalog.mvi.legacy.api.a) this.c0.getValue(), new b(aVar.e, searchStatInfoProvider, u4aVar2));
                                            break;
                                        } else {
                                            if (videoCatalogViewStyle == null || videoCatalogViewStyle.b != VideoCatalogViewStyle.Style.AuthorVideos) {
                                                z = false;
                                                z2 = false;
                                            } else {
                                                z = false;
                                                z2 = true;
                                            }
                                            catalogViewHolder = new VideoItemNoAutoPlayVh(new VideoItemSliderVh(R.layout.catalog_video_slider_medium_tablet_item_with_avatar, R.dimen.catalog_video_slider_medium_tablet_item_with_avatar, u4aVar2, null, null, null, null, null, !z2, z2, true, (z6 && z3) ? true : z, z2 ? Integer.valueOf(R.dimen.catalog_search_video_slider_item_preview_corner_radius) : null, (hdt0) bpn0Var.getValue(), 10744), aVar.f, aVar.m, f2, null, false, PsExtractor.VIDEO_STREAM_MASK);
                                        }
                                    } else {
                                        catalogViewHolder = new VideoItemAutoPlayVh(new ShowcaseVideoAutoPlayViewHolder(new zjj0.a(videoCatalogViewStyle.Cb()), akj0.b.a, false, aVar.f, aVar.m, aVar, 12), aVar.f, aVar.m, f2, true, SubtitlesConfigurationMode.FROM_PERSISTENT_STORAGE, null, false, 448);
                                    }
                                } else if (i12 == 7) {
                                    catalogViewStyle2 = catalogViewStyle;
                                    u4aVar2 = u4aVar;
                                    catalogViewHolder = new VideoItemNoAutoPlayVh(new VideoItemListSmallVh(R.layout.catalog_video_small_item_tablet, u4aVar, aVar.m, true, null, true, (hdt0) bpn0Var.getValue(), null, 11000), aVar.f, aVar.m, f2, null, false, 176);
                                    break;
                                } else {
                                    switch (i12) {
                                        case 40:
                                            if (!fxc0.B().J().L()) {
                                                K0 = K0(catalogDataType, catalogViewType, catalogViewStyle, u4aVar3, f2);
                                                catalogViewHolder = K0;
                                                break;
                                            } else {
                                                J02 = new VideoGoToAuthorItemHeaderButtonVh(R.layout.catalog2_action_goto_author_tablet, F0().F());
                                                break;
                                            }
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
                                            catalogDataType2 = catalogDataType;
                                            catalogViewHolder = new VideoItemNoAutoPlayVh(new VideoItemListTabletVh(b5aVar, searchStatInfoProvider), aVar.f, aVar.m, f2, null, true, 144);
                                            break;
                                        case 50:
                                            catalogDataType2 = catalogDataType;
                                            k7a k7aVar2 = aVar.j;
                                            VideoItemListSettings videoItemListSettings = VideoItemListSettings.s;
                                            b5a b5aVar2 = aVar.f;
                                            SearchStatInfoProvider searchStatInfoProvider2 = aVar.m;
                                            aVar2.getClass();
                                            catalogViewHolder = new VideoItemNoAutoPlayVh(new VideoItemListLargeVh(k7aVar2, videoItemListSettings, b5aVar2, searchStatInfoProvider2, null, u4aVar3.b, null, 1488), aVar.f, aVar.m, f2, null, true, 144);
                                            break;
                                        case 51:
                                            catalogDataType2 = catalogDataType;
                                            u4aVar3 = u4aVar;
                                            catalogViewHolder = new VideoItemNoAutoPlayVh(new VideoItemSliderVh(R.layout.catalog_video_slider_medium_tablet_item_with_avatar, R.dimen.catalog_video_slider_medium_tablet_item_with_avatar, u4aVar, null, null, null, null, null, false, false, true, true, null, (hdt0) bpn0Var.getValue(), 43000), aVar.f, aVar.m, f2, null, false, PsExtractor.VIDEO_STREAM_MASK);
                                            break;
                                        case 52:
                                        case 53:
                                            catalogDataType3 = catalogDataType;
                                            if (catalogDataType3 == catalogDataType4 || catalogDataType3 == CatalogDataType.DATA_TYPE_VIDEO_CATALOG_VIDEOS) {
                                                int i13 = iArr2[catalogViewType.ordinal()];
                                                if (i13 == 52) {
                                                    K0 = new VideoItemGridTabletHideVh(b5aVar, VideoItemListSettings.s, k7aVar, searchStatInfoProvider);
                                                } else if (i13 == 53) {
                                                    K0 = new VideoItemSliderTabletHideVh(b5aVar, k7aVar, searchStatInfoProvider);
                                                }
                                                catalogViewHolder = K0;
                                                break;
                                            }
                                            break;
                                        default:
                                            catalogDataType3 = catalogDataType;
                                            K0 = K0(catalogDataType3, catalogViewType, catalogViewStyle, u4aVar3, f2);
                                            catalogViewHolder = K0;
                                            break;
                                    }
                                }
                            } else {
                                catalogDataType3 = catalogDataType;
                            }
                            catalogViewHolder = null;
                            break;
                        } else {
                            J02 = K0(catalogDataType, catalogViewType, catalogViewStyle, u4aVar3, f2);
                        }
                        catalogViewHolder = J02;
                        break;
                    default:
                        catalogViewHolder = null;
                        break;
                }
                return catalogViewHolder == null ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : catalogViewHolder;
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> x(UserId userId, String str) {
        this.D.getClass();
        rsg0<hda> B0 = B0(userId);
        iss0 iss0Var = iss0.a;
        String str2 = this.h0;
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(B0, null, null, 3);
        iss0Var.getClass();
        return znk0.P(new io.reactivex.rxjava3.internal.operators.observable.c0(iss0.a(str2, y0).U(new pi40(new qyi0(this, 17), 17)), new nvm0(new gyo0(this, 4), 7), io.reactivex.rxjava3.internal.functions.a.c).C(new vyb(this, 4)), this.j0, asu0.a.d());
    }

    public final VideoItemListLargeVh z0(CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, u4a u4aVar) {
        VideoItemListSettings a2;
        boolean z = catalogViewType == CatalogViewType.FLOOR_CLIPS || catalogViewType == CatalogViewType.SEARCH_FLOOR_CLIPS;
        VerticalVideoCatalogViewStyle verticalVideoCatalogViewStyle = catalogViewStyle instanceof VerticalVideoCatalogViewStyle ? (VerticalVideoCatalogViewStyle) catalogViewStyle : null;
        k7a k7aVar = u4aVar.b.j;
        if (z) {
            VideoItemListSettings videoItemListSettings = VideoItemListSettings.i;
            int i2 = Resources.getSystem().getDisplayMetrics().widthPixels;
            VideoItemListSettings videoItemListSettings2 = VideoItemListSettings.q;
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            HashSet hashSet = iah0.a;
            Pair pair = fnj.b(context) ? new Pair(32, 16) : new Pair(12, 12);
            int b2 = i2 - ((hbh0.b(((Number) pair.g()).intValue(), context) * (VideoItemListSettings.a.a(context) - 1)) + (hbh0.b(((Number) pair.d()).intValue(), context) * 2));
            Context context2 = e43.a;
            a2 = VideoItemListSettings.a(videoItemListSettings2, b2 / VideoItemListSettings.a.a(context2 != null ? context2 : null), -2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, VideoItemListSettings.a.e(verticalVideoCatalogViewStyle), 4);
        } else {
            a2 = this.G ? VideoItemListSettings.r : VideoItemListSettings.a(VideoItemListSettings.q, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, VideoItemListSettings.a.e(verticalVideoCatalogViewStyle), 7);
        }
        VideoItemListSettings videoItemListSettings3 = a2;
        u4a.a aVar = u4aVar.b;
        return new VideoItemListLargeVh(k7aVar, videoItemListSettings3, aVar.f, aVar.m, null, aVar, null, 1264);
    }

    public b9s0(UserId userId, String str, String str2, a aVar, String str3, VideoCatalogId videoCatalogId) {
        super(userId, str);
        this.D = aVar;
        this.E = str3;
        this.F = videoCatalogId;
        VideoFeatures videoFeatures = VideoFeatures.LIKEABLE_CLIPS_IN_CATALOG;
        videoFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        this.G = bVar.a(videoFeatures);
        VideoFeatures videoFeatures2 = VideoFeatures.LIVE_BADGE_IN_SUBS;
        videoFeatures2.getClass();
        this.H = bVar.a(videoFeatures2);
        daz dazVar = new daz(25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.I = msy.a(lazyThreadSafetyMode, dazVar);
        VideoFeatures videoFeatures3 = VideoFeatures.CLIPS_AUTOPLAY_IN_CATALOG;
        videoFeatures3.getClass();
        this.J = bVar.a(videoFeatures3);
        this.K = msy.a(lazyThreadSafetyMode, new gzr0(1));
        this.L = fxc0.B().J().x0();
        wot0 wot0Var = new wot0();
        this.M = wot0Var;
        this.N = new vou();
        this.O = msy.a(lazyThreadSafetyMode, new ufm0(7));
        this.P = msy.a(lazyThreadSafetyMode, new uh80(10));
        this.Q = msy.a(lazyThreadSafetyMode, new vqe0(9));
        this.R = msy.a(lazyThreadSafetyMode, new ghn0(this, 5));
        this.S = msy.a(lazyThreadSafetyMode, new ejf0(this, 15));
        this.T = msy.a(lazyThreadSafetyMode, new fyd0(this, 16));
        this.U = msy.a(lazyThreadSafetyMode, new yqd0(this, 15));
        this.V = new bpn0(new uyq0(this, 1));
        this.W = msy.a(lazyThreadSafetyMode, new ipq0(this, 3));
        this.X = msy.a(lazyThreadSafetyMode, new b6f0(this, 15));
        this.Y = msy.a(lazyThreadSafetyMode, new kld0(this, 22));
        this.Z = msy.a(lazyThreadSafetyMode, new i6m0(this, 10));
        this.a0 = msy.a(lazyThreadSafetyMode, new nid0(this, 20));
        this.b0 = msy.a(lazyThreadSafetyMode, new x1e0(this, 22));
        this.c0 = new bpn0(new jcf0(this, 16));
        this.d0 = msy.a(lazyThreadSafetyMode, new yo80(10));
        this.e0 = new bpn0(new hvr0(this, 2));
        this.h0 = str2;
        this.k0 = true;
        this.l0 = new jas0(wot0Var, userId);
        this.m0 = new bpn0(new akd0(this, 17));
        this.n0 = msy.a(lazyThreadSafetyMode, new s7c0(13));
        this.o0 = new bpn0(new o2a0(15));
        this.p0 = new bpn0(new jkg0(8));
        this.q0 = new bpn0(new u3c0(5));
        this.r0 = new bpn0(new c2c0(16));
        this.s0 = VideoAutoPlayDelayType.CATALOG;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b9s0(Bundle bundle, a aVar) {
        this(r2, r3, r4, aVar, r6, r9 instanceof VideoCatalogId ? (VideoCatalogId) r9 : null);
        String str;
        UserId userId = (UserId) bundle.getParcelable("owner_id");
        UserId userId2 = userId == null ? UserId.d : userId;
        String string = bundle.getString("ref");
        String string2 = bundle.getString("key_url");
        String string3 = bundle.getString("track_code");
        if (string3 == null) {
            SearchStatsLoggingInfo searchStatsLoggingInfo = (SearchStatsLoggingInfo) bundle.getParcelable("search_stats_logging_info");
            if (searchStatsLoggingInfo != null) {
                string3 = searchStatsLoggingInfo.f;
            } else {
                str = null;
                Serializable serializable = bundle.getSerializable("video_catalog_id");
            }
        }
        str = string3;
        Serializable serializable2 = bundle.getSerializable("video_catalog_id");
    }
}
