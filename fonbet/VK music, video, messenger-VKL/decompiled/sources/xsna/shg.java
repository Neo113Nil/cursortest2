package xsna;

import android.os.Bundle;
import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.CatalogButtonAddFriends;
import com.vk.catalog2.common.dto.api.CatalogButtonFilters;
import com.vk.catalog2.common.dto.api.CatalogButtonFriendsCleanup;
import com.vk.catalog2.common.dto.api.CatalogButtonImportContacts;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenUrl;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Values;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.CatalogShowFiltersButton;
import com.vk.catalog2.common.dto.api.CatalogStateInfo;
import com.vk.catalog2.common.dto.api.CatalogText;
import com.vk.catalog2.common.dto.api.CatalogUserMeta;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.banner.Banner;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.block.CatalogBlockItemsData;
import com.vk.catalog2.common.dto.api.channel.CatalogChannel;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.market.CatalogMarketGroupInfo;
import com.vk.catalog2.common.dto.api.market.MarketInfo;
import com.vk.catalog2.common.dto.api.search.CatalogSearchSpellcheckResult;
import com.vk.catalog2.common.dto.api.style.CatalogSliderViewStyle;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.HeaderCatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.HorizontalButtonStackViewStyle;
import com.vk.catalog2.common.dto.api.style.LinkListViewStyle;
import com.vk.catalog2.common.dto.api.style.LinkSliderViewStyle;
import com.vk.catalog2.common.dto.api.style.MusicTrackCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.catalog2.common.dto.api.video.TopshelfItem;
import com.vk.catalog2.common.dto.api.video.musicvideo.VideoMusicStreamMixItem;
import com.vk.catalog2.common.dto.ui.UIBlockApp;
import com.vk.catalog2.common.dto.ui.UIBlockBadge;
import com.vk.catalog2.common.dto.ui.UIBlockBanner;
import com.vk.catalog2.common.dto.ui.UIBlockButtons;
import com.vk.catalog2.common.dto.ui.UIBlockChannel;
import com.vk.catalog2.common.dto.ui.UIBlockChips;
import com.vk.catalog2.common.dto.ui.UIBlockFilter2D;
import com.vk.catalog2.common.dto.ui.UIBlockGroupChat;
import com.vk.catalog2.common.dto.ui.UIBlockGroupsCollection;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.dto.ui.UIBlockMusicMixTopshelf;
import com.vk.catalog2.common.dto.ui.UIBlockPreview;
import com.vk.catalog2.common.dto.ui.UIBlockQuestionnaire;
import com.vk.catalog2.common.dto.ui.UIBlockSearchFilter;
import com.vk.catalog2.common.dto.ui.UIBlockSearchQuickFilter;
import com.vk.catalog2.common.dto.ui.UIBlockSeparator;
import com.vk.catalog2.common.dto.ui.UIBlockTopshelf;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionClearRecent;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenScreen;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSearchFilter;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSearchTab;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionResetSearchFilter;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionShowFilters;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSwitchSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockHideBlockButton;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketGroupInfoItem;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketInfo;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfilesList;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockSticker;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickerPack;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickerPackPreview;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickerPreview;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickersBonusBalance;
import com.vk.catalog2.common.dto.ui.subscriptions.UIBlockHorizontalButtonLarge;
import com.vk.catalog2.common.dto.ui.subscriptions.UIBlockHorizontalButtonSmall;
import com.vk.catalog2.feature.music.dto.ui.UIBlockLogout;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.catalog2.feature.music.dto.ui.actions.UIBlockActionLogout;
import com.vk.catalog2.feature.search.dto.ui.UIBlockGroupsMapPreview;
import com.vk.catalog2.feature.search.dto.ui.UIBlockSearchSpellcheck;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestions;
import com.vk.clips.internal.nps.api.model.QuestionsTexts;
import com.vk.clips.sdk.shared.questionnarie.QuestionRootLayoutDto;
import com.vk.clips.sdk.shared.questionnarie.QuestionnaireDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.articles.Article;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupCatalogItem;
import com.vk.dto.group.GroupChat;
import com.vk.dto.group.GroupCollection;
import com.vk.dto.group.GroupLikes;
import com.vk.dto.group.GroupsCategory;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.search.SearchFilterItem;
import com.vk.dto.search.SearchQuickFilterItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.StickerStockItemWithStickerId;
import com.vk.dto.stickers.StickersInfo;
import com.vk.dto.stickers.bonus.StickersBonusBalance;
import com.vk.dto.user.UserProfile;
import com.vk.stickers.views.sticker.StickerPackPreview;
import com.vk.stickers.views.sticker.StickerPackPreviewWithStickerId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.axo;
import xsna.exq;
import xsna.fsa0;
import xsna.hu;
import xsna.jnh0;
import xsna.lgq0;
import xsna.n670;
import xsna.tep;
import xsna.x8z;
import xsna.yi0;
import xsna.zsg;

/* compiled from: CommonBlockCatalogTransformer.kt */
/* loaded from: classes16.dex */
public final class shg implements xe7 {
    public final HashMap b = pn00.i(new Pair(CatalogDataType.DATA_TYPE_SEARCH_FILTERS, k.b), new Pair(CatalogDataType.DATA_TYPE_VIDEO_VIDEOS, v.b), new Pair(CatalogDataType.DATA_TYPE_VIDEO_CATALOG_VIDEOS, g0.b), new Pair(CatalogDataType.DATA_TYPE_VIDEO_TOPSHELF, r0.b), new Pair(CatalogDataType.DATA_TYPE_MUSIC_MIX_VIDEO_TOPSHELF, s0.b), new Pair(CatalogDataType.DATA_TYPE_ARTIST_VIDEOS, t0.b), new Pair(CatalogDataType.DATA_TYPE_FEEDBACKS, u0.b), new Pair(CatalogDataType.DATA_TYPE_VIDEO_ALBUMS, v0.b), new Pair(CatalogDataType.DATA_TYPE_MINIAPPS, w0.b), new Pair(CatalogDataType.DATA_TYPE_MINI_APPS_CONTENT, a.b), new Pair(CatalogDataType.DATA_TYPE_GAMES, b.b), new Pair(CatalogDataType.DATA_TYPE_SHORT_VIDEO_AUDIOS, c.b), new Pair(CatalogDataType.DATA_TYPE_GROUPS, d.b), new Pair(CatalogDataType.DATA_TYPE_ALL_GROUPS_OR_RECOMMENDATIONS, e.b), new Pair(CatalogDataType.DATA_TYPE_GROUPS_ITEMS, f.b), new Pair(CatalogDataType.DATA_TYPE_GROUPS_COLLECTION, g.b), new Pair(CatalogDataType.DATA_TYPE_GROUPS_CATEGORY_ITEMS, h.b), new Pair(CatalogDataType.DATA_TYPE_GROUPS_INVITES, i.b), new Pair(CatalogDataType.DATA_TYPE_STICKERS, j.b), new Pair(CatalogDataType.DATA_TYPE_STICKER_PACKS, l.b), new Pair(CatalogDataType.DATA_TYPE_STICKERS_BANNERS, m.b), new Pair(CatalogDataType.DATA_TYPE_STICKERS_INFO, n.b), new Pair(CatalogDataType.DATA_TYPE_CATALOG_USERS, o.b), new Pair(CatalogDataType.DATA_TYPE_AUDIO_SEARCH_RECENTS, new p(5, euh0.a, euh0.class, "transformSearchHistoryBlocks", "transformSearchHistoryBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 0)), new Pair(CatalogDataType.DATA_TYPE_SEARCH_SUGGESTION, q.b), new Pair(CatalogDataType.DATA_TYPE_MUSIC_SEARCH_SUGGESTION, r.b), new Pair(CatalogDataType.DATA_TYPE_TEXTS, s.b), new Pair(CatalogDataType.DATA_TYPE_GROUPS_CHATS, t.b), new Pair(CatalogDataType.DATA_TYPE_CATALOG_MARKET_ITEMS, u.b), new Pair(CatalogDataType.DATA_TYPE_CATALOG_GROUPS_INFO_ITEMS, w.b), new Pair(CatalogDataType.DATA_TYPE_CATALOG_NAVIGATION_TABS, x.b), new Pair(CatalogDataType.DATA_TYPE_MARKET_INFO, y.b), new Pair(CatalogDataType.DATA_TYPE_FRIENDS_LIKES, z.b), new Pair(CatalogDataType.DATA_TYPE_RECENT_BUSINESSES, a0.b), new Pair(CatalogDataType.DATA_TYPE_LONGREADS, b0.b), new Pair(CatalogDataType.DATA_TYPE_OWNERS, c0.b), new Pair(CatalogDataType.DATA_TYPE_SEARCH_AUTHORS, d0.b), new Pair(CatalogDataType.DATA_TYPE_SEARCH_ENTITY_ITEMS, e0.b), new Pair(CatalogDataType.DATA_TYPE_SEARCH_SPELLCHECKER, f0.b), new Pair(CatalogDataType.DATA_TYPE_NONE, h0.b), new Pair(CatalogDataType.DATA_TYPE_LINKS, i0.b), new Pair(CatalogDataType.DATA_TYPE_EMPTY, j0.b), new Pair(CatalogDataType.DATA_TYPE_ACTION, k0.b), new Pair(CatalogDataType.DATA_TYPE_PLACEHOLDER, l0.b), new Pair(CatalogDataType.DATA_TYPE_CATALOG_BANNERS, m0.b), new Pair(CatalogDataType.DATA_TYPE_GROUP_BANNERS, n0.b), new Pair(CatalogDataType.DATA_TYPE_CHANNELS, o0.b), new Pair(CatalogDataType.DATA_TYPE_SPORTS_MATCHES_CURRENT, p0.b), new Pair(CatalogDataType.DATA_TYPE_SPORTS_MATCHES_UPCOMING, q0.b));

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final a b = new a(5, pq20.class, "transformMiniAppContentBlocks", "transformMiniAppContentBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            CatalogBlock catalogBlock2 = catalogBlock;
            return rli0.A(rli0.t(new i5g(catalogBlock2.m.c), new jh3(catalogBlock2, catalogExtendedData, bi20Var, 4)));
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class a0 extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final a0 b = new a0(5, yi0.class, "transformRecentBusinessBlocks", "transformRecentBusinessBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            Object[] objArr;
            Object[] objArr2;
            Object[] objArr3;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            ArrayList Gb = catalogBlock.Gb(catalogExtendedData2);
            ArrayList arrayList = new ArrayList();
            Iterator it = Gb.iterator();
            while (true) {
                objArr3 = 0;
                objArr2 = 0;
                objArr = 0;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Group group = next instanceof Group ? (Group) next : null;
                if (group != null) {
                    arrayList.add(group);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Group group2 = (Group) it2.next();
                String valueOf = String.valueOf(group2.c.b);
                GroupLikes groupLikes = valueOf != null ? catalogExtendedData2.G.get(valueOf) : null;
                if (groupLikes == null) {
                    groupLikes = new GroupLikes(objArr == true ? 1 : 0, objArr2 == true ? 1 : 0, 3, objArr3 == true ? 1 : 0);
                }
                group2.T = groupLikes;
                arrayList2.add(exq.b(bi20Var2, group2, null, 60));
            }
            return arrayList2;
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final b b = new b(5, f9t.class, "transformGameBlocks", "transformGameBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            CatalogBlock catalogBlock2 = catalogBlock;
            return rli0.A(rli0.t(rli0.t(new i5g(catalogBlock2.Gb(catalogExtendedData)), new qm(26)), new yu1(10, catalogBlock2, bi20Var)));
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class b0 extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final b0 b = new b0(5, hg10.class, "transformLongreadBlocks", "transformLongreadBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            return rli0.A(new ulp0(rli0.k(new i5g(catalogBlock.Gb(catalogExtendedData)), Article.class), new gg10(bi20Var, 0)));
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final c b = new c(5, lmc.class, "transformShorVideoAudioBlocks", "transformShorVideoAudioBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            UIBlockMusicTrack g;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            CatalogViewType catalogViewType = bi20Var2.d;
            ArrayList Gb = catalogBlock.Gb(catalogExtendedData2);
            ArrayList arrayList = new ArrayList();
            Iterator it = Gb.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                MusicTrack musicTrack = next instanceof MusicTrack ? (MusicTrack) next : null;
                if (musicTrack != null) {
                    arrayList.add(musicTrack);
                }
            }
            if ((catalogViewType == CatalogViewType.TRIPLE_STACKED_SLIDER && arrayList.size() <= 3) || (catalogViewType == CatalogViewType.DOUBLE_STACKED_SLIDER && arrayList.size() <= 2)) {
                bi20Var2 = bi20.a(bi20Var2, null, CatalogViewType.SYNTHETIC_MUSIC_TRACK_LIST, null, null, null, null, 33554423);
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                MusicTrack musicTrack2 = (MusicTrack) it2.next();
                MusicTrackCatalogViewStyle musicTrackCatalogViewStyle = new MusicTrackCatalogViewStyle(bi20Var2.p.getString(CatalogCustomAttributes$Keys.STYLE.h()));
                if (musicTrackCatalogViewStyle.b == MusicTrackCatalogViewStyle.Style.FoundByLyrics) {
                    Object Ab = catalogExtendedData2.Ab(CatalogDataType.DATA_TYPE_TEXTS, musicTrack2.Fb());
                    CatalogText catalogText = Ab instanceof CatalogText ? (CatalogText) Ab : null;
                    g = lmc.g(bi20Var2, musicTrack2, musicTrackCatalogViewStyle, catalogText != null ? catalogText.d : null);
                } else {
                    g = lmc.g(bi20Var2, musicTrack2, musicTrackCatalogViewStyle, null);
                }
                arrayList2.add(g);
            }
            return rte0.E(arrayList2, bi20Var2);
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class c0 extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final c0 b = new c0(5, jnh0.class, "transformSearchAuthorBlocks", "transformSearchAuthorBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            CatalogBlock catalogBlock2 = catalogBlock;
            return rli0.A(rli0.t(new i5g(catalogBlock2.Gb(catalogExtendedData)), new jp5(22, catalogBlock2, bi20Var)));
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final d b = new d(5, exq.class, "transformGroupBlocks", "transformGroupBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            nq8 nq8Var2 = nq8Var;
            if (exq.a.$EnumSwitchMapping$0[catalogBlock2.i.b.ordinal()] != 1) {
                ArrayList Gb = catalogBlock2.Gb(catalogExtendedData2);
                ArrayList arrayList = new ArrayList();
                Iterator it = Gb.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Group group = next instanceof Group ? (Group) next : null;
                    if (group != null) {
                        arrayList.add(group);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(exq.b(bi20Var2, (Group) it2.next(), null, 60));
                }
                return arrayList2;
            }
            ArrayList a = nq8Var2.a(catalogExtendedData2, catalogBlock2.j, bi20Var2);
            ArrayList Gb2 = catalogBlock2.Gb(catalogExtendedData2);
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = Gb2.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                Group group2 = next2 instanceof Group ? (Group) next2 : null;
                if (group2 != null) {
                    arrayList3.add(group2);
                }
            }
            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                arrayList4.add(((Group) it4.next()).e);
            }
            return Collections.singletonList(new UIBlockPreview(bi20Var2.a, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, bi20Var2.f, bi20Var2.g, arrayList4, a));
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class d0 extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final d0 b = new d0(5, jnh0.class, "transformSearchAuthorBlocks", "transformSearchAuthorBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            CatalogBlock catalogBlock2 = catalogBlock;
            return rli0.A(rli0.t(new i5g(catalogBlock2.Gb(catalogExtendedData)), new jp5(22, catalogBlock2, bi20Var)));
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final e b = new e(5, zsg.class, "transformCommunityGroupBlocks", "transformCommunityGroupBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            if (zsg.a.$EnumSwitchMapping$0[catalogBlock2.i.b.ordinal()] != 1) {
                ArrayList Gb = catalogBlock2.Gb(catalogExtendedData2);
                ArrayList arrayList = new ArrayList();
                Iterator it = Gb.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Group group = next instanceof Group ? (Group) next : null;
                    if (group != null) {
                        arrayList.add(group);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(exq.b(bi20Var2, (Group) it2.next(), null, 60));
                }
                return arrayList2;
            }
            ArrayList Gb2 = catalogBlock2.Gb(catalogExtendedData2);
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = Gb2.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                Group group2 = next2 instanceof Group ? (Group) next2 : null;
                if (group2 != null) {
                    arrayList3.add(group2);
                }
            }
            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Group group3 = (Group) it4.next();
                Object zb = catalogBlock2.m.zb(group3.c);
                arrayList4.add(exq.b(bi20Var2, group3, zb instanceof GroupCatalogItem ? (GroupCatalogItem) zb : null, 56));
            }
            ArrayList arrayList5 = new ArrayList(arrayList4);
            fsa0.a(catalogBlock2, arrayList5, bi20Var2);
            return arrayList5;
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class e0 extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final e0 b = new e0(5, jnh0.class, "transformSearchEntityItemBlocks", "transformSearchEntityItemBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            return rli0.A(rli0.t(rli0.j(new i5g(catalogBlock.Gb(catalogExtendedData2)), knh0.b), new dlb(bi20Var, catalogExtendedData2, list, 10)));
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final f b = new f(5, zsg.class, "transformGroupItemBlocks", "transformGroupItemBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        /* JADX WARN: Removed duplicated region for block: B:80:0x017c A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0145 A[SYNTHETIC] */
        @Override // xsna.a0t
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            UIBlockGroupsMapPreview.PreviewGroupItem previewGroupItem;
            GroupLikes groupLikes;
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            nq8 nq8Var2 = nq8Var;
            CatalogBlockItemsData catalogBlockItemsData = catalogBlock2.m;
            CatalogLayout catalogLayout = catalogBlock2.i;
            int i = zsg.a.$EnumSwitchMapping$0[catalogLayout.b.ordinal()];
            if (i == 3) {
                ArrayList a = nq8Var2.a(catalogExtendedData2, catalogBlock2.j, bi20Var2);
                ArrayList Gb = catalogBlock2.Gb(catalogExtendedData2);
                ArrayList arrayList = new ArrayList();
                Iterator it = Gb.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Group group = next instanceof Group ? (Group) next : null;
                    if (group != null) {
                        arrayList.add(group);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Group) it2.next()).e);
                }
                return Collections.singletonList(new UIBlockPreview(bi20Var2.a, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, bi20Var2.f, bi20Var2.g, arrayList2, a));
            }
            if (i == 7) {
                List<String> list2 = catalogBlockItemsData.c;
                ArrayList arrayList3 = new ArrayList();
                for (String str : list2) {
                    Object zb = catalogBlockItemsData.zb(str);
                    GroupCatalogItem groupCatalogItem = zb instanceof GroupCatalogItem ? (GroupCatalogItem) zb : null;
                    if (groupCatalogItem != null) {
                        Object Ab = catalogExtendedData2.Ab(catalogBlock2.c, str);
                        Group group2 = Ab instanceof Group ? (Group) Ab : null;
                        if (group2 != null) {
                            previewGroupItem = new UIBlockGroupsMapPreview.PreviewGroupItem(group2, groupCatalogItem);
                            if (previewGroupItem == null) {
                                arrayList3.add(previewGroupItem);
                            }
                        }
                    }
                    previewGroupItem = null;
                    if (previewGroupItem == null) {
                    }
                }
                return Collections.singletonList(new UIBlockGroupsMapPreview(arrayList3, new com.vk.catalog2.common.dto.api.ui.a(bi20Var2.a, bi20Var2.b, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7680), catalogBlock2.k));
            }
            ArrayList Gb2 = catalogBlock2.Gb(catalogExtendedData2);
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = Gb2.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                Group group3 = next2 instanceof Group ? (Group) next2 : null;
                if (group3 != null) {
                    arrayList4.add(group3);
                }
            }
            int size = arrayList4.size();
            ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                Group group4 = (Group) it4.next();
                Object zb2 = catalogBlockItemsData.zb(group4.c);
                GroupCatalogItem groupCatalogItem2 = zb2 instanceof GroupCatalogItem ? (GroupCatalogItem) zb2 : null;
                if (groupCatalogItem2 != null && (groupLikes = groupCatalogItem2.f) != null) {
                    Iterator<UserId> it5 = groupLikes.f.iterator();
                    while (it5.hasNext()) {
                        UserProfile userProfile = catalogExtendedData2.Gb(it5.next()).a;
                        if (userProfile != null) {
                            groupLikes.e.add(userProfile);
                        }
                    }
                }
                CatalogViewType catalogViewType = bi20Var2.d;
                if (catalogViewType == CatalogViewType.TRIPLE_STACKED_SLIDER && size <= 3) {
                    catalogViewType = CatalogViewType.SYNTHETIC_GROUP_ITEM_BIG;
                }
                arrayList5.add(exq.a(bi20Var2, group4, groupCatalogItem2, catalogBlock2.q, catalogBlock2.r, catalogViewType));
            }
            ArrayList D = rte0.D(rte0.C(arrayList5, bi20Var2), bi20Var2);
            if (catalogLayout.b != CatalogViewType.DOUBLE_STACKED_LIST_MINIMALISTIC_CARD) {
                return D;
            }
            List<String> list3 = catalogBlockItemsData.j;
            ArrayList arrayList6 = new ArrayList(D);
            Iterator it6 = list3.iterator();
            int i2 = 0;
            while (it6.hasNext()) {
                Object next3 = it6.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    e43.t();
                    throw null;
                }
                CatalogDataType catalogDataType = CatalogDataType.DATA_TYPE_GROUPS_COLLECTION;
                Iterator it7 = it6;
                UIBlockGroupsCollection c = zsg.c(bi20Var2, catalogBlock2, catalogExtendedData2, (GroupCollection) catalogExtendedData2.Ab(catalogDataType, (String) next3), new com.vk.catalog2.common.dto.api.ui.a(bi20Var2.a, bi20Var2.b, CatalogViewType.DOUBLE_STACKED_LIST_MINIMALISTIC_CARD, catalogDataType, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7680));
                int i4 = c.I;
                if (i4 >= 0 && i4 <= size) {
                    arrayList6.add(i4 + i2, c);
                }
                it6 = it7;
                i2 = i3;
            }
            return arrayList6;
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class f0 extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlockSearchSpellcheck>> {
        public static final f0 b = new f0(5, jnh0.class, "transformSpellcheckResultBlock", "transformSpellcheckResultBlock(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlockSearchSpellcheck> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            CatalogBlock catalogBlock2 = catalogBlock;
            return rli0.A(new ulp0(rli0.k(new i5g(catalogBlock2.Gb(catalogExtendedData)), CatalogSearchSpellcheckResult.class), new ndg0(1, catalogBlock2, bi20Var)));
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final g b = new g(5, zsg.class, "transformGroupCollectionBlocks", "transformGroupCollectionBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            ArrayList Gb = catalogBlock2.Gb(catalogExtendedData2);
            ArrayList arrayList = new ArrayList();
            Iterator it = Gb.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                GroupCollection groupCollection = next instanceof GroupCollection ? (GroupCollection) next : null;
                if (groupCollection != null) {
                    arrayList.add(groupCollection);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(zsg.c(bi20Var2, catalogBlock2, catalogExtendedData2, (GroupCollection) it2.next(), bi20Var2.b()));
            }
            return arrayList2;
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class g0 extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final g0 b = new g0(5, x5s0.class, "transformVideoBlocks", "transformVideoBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            return x5s0.b(catalogExtendedData, catalogBlock, bi20Var);
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final h b = new h(5, zsg.class, "transformGroupCategoryItemBlocks", "transformGroupCategoryItemBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            nq8 nq8Var2 = nq8Var;
            if (zsg.a.$EnumSwitchMapping$0[catalogBlock2.i.b.ordinal()] == 2) {
                ArrayList Gb = catalogBlock2.Gb(catalogExtendedData2);
                ArrayList arrayList = new ArrayList();
                Iterator it = Gb.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    GroupsCategory groupsCategory = next instanceof GroupsCategory ? (GroupsCategory) next : null;
                    if (groupsCategory != null) {
                        arrayList.add(groupsCategory);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(zsg.b(bi20Var2, catalogBlock2, catalogExtendedData2, (GroupsCategory) it2.next(), nq8Var2));
                }
                return arrayList2;
            }
            ArrayList Gb2 = catalogBlock2.Gb(catalogExtendedData2);
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = Gb2.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                GroupsCategory groupsCategory2 = next2 instanceof GroupsCategory ? (GroupsCategory) next2 : null;
                if (groupsCategory2 != null) {
                    arrayList3.add(groupsCategory2);
                }
            }
            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                arrayList4.add(zsg.b(bi20Var2, catalogBlock2, catalogExtendedData2, (GroupsCategory) it4.next(), nq8Var2));
            }
            return arrayList4;
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class h0 extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final h0 b = new h0(5, n670.class, "transformNoneBlocks", "transformNoneBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            Object obj;
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            nq8 nq8Var2 = nq8Var;
            List<UIBlockAction> list2 = bi20Var2.l;
            CatalogLayout catalogLayout = catalogBlock2.i;
            switch (n670.a.$EnumSwitchMapping$0[catalogLayout.b.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    CatalogBadge catalogBadge = catalogBlock2.h;
                    Object obj2 = null;
                    UIBlockBadge a = catalogBadge != null ? n670.a(bi20Var2, catalogBadge) : null;
                    CatalogViewType catalogViewType = bi20Var2.d;
                    List<UIBlockAction> list3 = list2;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list3) {
                        if (obj3 instanceof UIBlockActionOpenUrl) {
                            arrayList.add(obj3);
                        }
                    }
                    UIBlockActionOpenUrl uIBlockActionOpenUrl = (UIBlockActionOpenUrl) j5g.a0(arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : list3) {
                        if (obj4 instanceof UIBlockActionOpenSection) {
                            arrayList2.add(obj4);
                        }
                    }
                    UIBlockActionOpenSection uIBlockActionOpenSection = (UIBlockActionOpenSection) j5g.a0(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj5 : list3) {
                        if (obj5 instanceof UIBlockActionSwitchSection) {
                            arrayList3.add(obj5);
                        }
                    }
                    UIBlockActionSwitchSection uIBlockActionSwitchSection = (UIBlockActionSwitchSection) j5g.a0(arrayList3);
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj6 : list3) {
                        if (obj6 instanceof UIBlockActionOpenSearchTab) {
                            arrayList4.add(obj6);
                        }
                    }
                    UIBlockActionOpenSearchTab uIBlockActionOpenSearchTab = (UIBlockActionOpenSearchTab) j5g.a0(arrayList4);
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj7 : list3) {
                        if (obj7 instanceof UIBlockActionClearRecent) {
                            arrayList5.add(obj7);
                        }
                    }
                    UIBlockActionClearRecent uIBlockActionClearRecent = (UIBlockActionClearRecent) j5g.a0(arrayList5);
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj8 : list3) {
                        if (obj8 instanceof UIBlockActionOpenScreen) {
                            arrayList6.add(obj8);
                        }
                    }
                    UIBlockActionOpenScreen uIBlockActionOpenScreen = (UIBlockActionOpenScreen) j5g.a0(arrayList6);
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj9 : list3) {
                        if (obj9 instanceof UIBlockHideBlockButton) {
                            arrayList7.add(obj9);
                        }
                    }
                    UIBlockHideBlockButton uIBlockHideBlockButton = (UIBlockHideBlockButton) j5g.a0(arrayList7);
                    Iterator<T> it = list3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            UIBlockAction uIBlockAction = (UIBlockAction) obj;
                            if (!(uIBlockAction instanceof UIBlockActionShowFilters) || uIBlockAction.d == CatalogViewType.SYNTHETIC_ACTION_FRIENDS_SORT_MODES) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    UIBlockAction uIBlockAction2 = (UIBlockAction) obj;
                    UIBlockActionShowFilters uIBlockActionShowFilters = uIBlockAction2 != null ? (UIBlockActionShowFilters) uIBlockAction2 : null;
                    Iterator<T> it2 = list3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            UIBlockAction uIBlockAction3 = (UIBlockAction) next;
                            if ((uIBlockAction3 instanceof UIBlockActionShowFilters) && uIBlockAction3.d == CatalogViewType.SYNTHETIC_ACTION_FRIENDS_SORT_MODES) {
                                obj2 = next;
                            }
                        }
                    }
                    UIBlockAction uIBlockAction4 = (UIBlockAction) obj2;
                    if (uIBlockActionClearRecent != null) {
                        int i = n670.a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                        catalogViewType = i != 1 ? i != 2 ? CatalogViewType.SYNTHETIC_HEADER_CLEAR_RECENTS : CatalogViewType.SYNTHETIC_HEADER_CLEAR_RECENTS_LARGE : CatalogViewType.SYNTHETIC_HEADER_CLEAR_RECENTS_COMPACT;
                    }
                    ArrayList o = e43.o(new UIBlockHeader(new com.vk.catalog2.common.dto.api.ui.a(bi20Var2.a, bi20Var2.b, catalogViewType, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, new HeaderCatalogViewStyle(bi20Var2.p.getString(CatalogCustomAttributes$Keys.STYLE.h())), (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7168), bi20Var2.f, bi20Var2.g, bi20Var2.h, new mwp0(a, uIBlockActionShowFilters, uIBlockActionOpenSection, uIBlockActionSwitchSection, uIBlockActionOpenSearchTab, uIBlockActionClearRecent, uIBlockActionOpenScreen, uIBlockActionOpenUrl, uIBlockHideBlockButton, null), bi20Var2.i, null, 64, null));
                    if (uIBlockAction4 != null) {
                        o.add(uIBlockAction4);
                    }
                    return o;
                case 5:
                case 6:
                    bi20 a2 = wh20.a(catalogBlock2, catalogExtendedData2, nq8Var2);
                    Object obj10 = a2.p.get(CatalogCustomAttributes$Keys.STYLE.h());
                    return Collections.singletonList(new UIBlockSeparator(epx.f(obj10, CatalogCustomAttributes$Values.THIN.h()) ? a2.c(CatalogViewType.SYNTHETIC_SEPARATOR_THIN) : epx.f(obj10, CatalogCustomAttributes$Values.ISLAND.h()) ? a2.c(CatalogViewType.SYNTHETIC_SEPARATOR_ISLAND) : epx.f(obj10, CatalogCustomAttributes$Values.TRANSPARENT.h()) ? a2.c(CatalogViewType.SYNTHETIC_SEPARATOR_TRANSPARENT) : epx.f(obj10, CatalogCustomAttributes$Values.ISLAND_TRANSPARENT.h()) ? a2.c(CatalogViewType.SYNTHETIC_SEPARATOR_ISLAND_TRANSPARENT) : epx.f(obj10, CatalogCustomAttributes$Values.OVERLAP.h()) ? a2.c(CatalogViewType.SYNTHETIC_SEPARATOR_OVERLAP) : a2.b(), catalogLayout.i));
                case 7:
                    return list2;
                default:
                    return EmptyList.b;
            }
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class i extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final i b = new i(5, zsg.class, "transformGroupInviteBlocks", "transformGroupInviteBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            bi20 bi20Var2 = bi20Var;
            ArrayList Gb = catalogBlock.Gb(catalogExtendedData);
            ArrayList arrayList = new ArrayList();
            Iterator it = Gb.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Group group = next instanceof Group ? (Group) next : null;
                if (group != null) {
                    arrayList.add(group);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(exq.b(bi20Var2, (Group) it2.next(), null, 60));
            }
            return arrayList2;
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class i0 extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final i0 b = new i0(5, x8z.class, "transformLinkBlocks", "transformLinkBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            Serializer.StreamParcelableAdapter uIBlockBanner;
            bi20 bi20Var2 = bi20Var;
            Bundle bundle = bi20Var2.p;
            CatalogViewType catalogViewType = bi20Var2.d;
            ArrayList Gb = catalogBlock.Gb(catalogExtendedData);
            ArrayList arrayList = new ArrayList();
            Iterator it = Gb.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                CatalogLink catalogLink = next instanceof CatalogLink ? (CatalogLink) next : null;
                if (catalogLink != null) {
                    arrayList.add(catalogLink);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                CatalogLink catalogLink2 = (CatalogLink) it2.next();
                int i = x8z.a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i == 1) {
                    uIBlockBanner = new UIBlockBanner(bi20Var2.a, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, catalogLink2.zb());
                } else if (i == 2) {
                    String string = bundle.getString(CatalogCustomAttributes$Keys.STYLE.h());
                    LinkListViewStyle.Style.Companion.getClass();
                    uIBlockBanner = new UIBlockLink(bi20Var2.a, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, bi20Var2.b, catalogLink2, new LinkListViewStyle(LinkListViewStyle.Style.a.a(string)), bi20Var2.u);
                } else if (i != 3) {
                    uIBlockBanner = new UIBlockLink(bi20Var2.a, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, bi20Var2.b, catalogLink2, null, bi20Var2.u);
                } else {
                    String string2 = bundle.getString(CatalogCustomAttributes$Keys.STYLE.h());
                    LinkSliderViewStyle.Style.Companion.getClass();
                    uIBlockBanner = new UIBlockLink(bi20Var2.a, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, bi20Var2.b, catalogLink2, new LinkSliderViewStyle(LinkSliderViewStyle.Style.a.a(string2)), bi20Var2.u);
                }
                arrayList2.add(uIBlockBanner);
            }
            int i2 = x8z.a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
            return (i2 == 4 || i2 == 5 || i2 == 6) ? bez.c(arrayList2, bi20Var2) : arrayList2;
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class j extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final j b = new j(5, l2l0.class, "transformStickerBlocks", "transformStickerBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            bi20 bi20Var2 = bi20Var;
            ArrayList Gb = catalogBlock.Gb(catalogExtendedData);
            if (!Gb.isEmpty()) {
                Iterator it = Gb.iterator();
                while (it.hasNext()) {
                    if (it.next() instanceof StickerPackPreviewWithStickerId) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = Gb.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            StickerPackPreviewWithStickerId stickerPackPreviewWithStickerId = next instanceof StickerPackPreviewWithStickerId ? (StickerPackPreviewWithStickerId) next : null;
                            if (stickerPackPreviewWithStickerId != null) {
                                arrayList.add(stickerPackPreviewWithStickerId);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(new UIBlockStickerPreview(bi20Var2.a, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, (StickerPackPreviewWithStickerId) it3.next()));
                        }
                        return arrayList2;
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = Gb.iterator();
            while (it4.hasNext()) {
                Object next2 = it4.next();
                StickerStockItemWithStickerId stickerStockItemWithStickerId = next2 instanceof StickerStockItemWithStickerId ? (StickerStockItemWithStickerId) next2 : null;
                if (stickerStockItemWithStickerId != null) {
                    arrayList3.add(stickerStockItemWithStickerId);
                }
            }
            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                arrayList4.add(new UIBlockSticker(bi20Var2.a, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, (StickerStockItemWithStickerId) it5.next()));
            }
            return arrayList4;
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class j0 extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final j0 b = new j0(5, tep.class, "transformEmptyBlocks", "transformEmptyBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            Object obj;
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            nq8 nq8Var2 = nq8Var;
            ArrayList<CatalogButton> arrayList = catalogBlock2.j;
            CatalogLayout catalogLayout = catalogBlock2.i;
            int i = tep.a.$EnumSwitchMapping$0[catalogLayout.b.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return EmptyList.b;
                }
                Iterator it = nq8Var2.a(catalogExtendedData2, arrayList, bi20Var2).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (obj instanceof UIBlockActionLogout) {
                        break;
                    }
                }
                UIBlockActionLogout uIBlockActionLogout = (UIBlockActionLogout) (obj instanceof UIBlockActionLogout ? obj : null);
                if (uIBlockActionLogout == null) {
                    return EmptyList.b;
                }
                return Collections.singletonList(new UIBlockLogout(bi20Var2.b(), catalogBlock2.b, uIBlockActionLogout, bi20Var2.p.getString(CatalogCustomAttributes$Keys.STYLE.h())));
            }
            String string = catalogLayout.h.getString(CatalogCustomAttributes$Keys.STYLE.h());
            HorizontalButtonStackViewStyle.Style.Companion.getClass();
            HorizontalButtonStackViewStyle horizontalButtonStackViewStyle = new HorizontalButtonStackViewStyle(HorizontalButtonStackViewStyle.Style.a.a(string));
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator<T> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add((CatalogButtonOpenUrl) ((CatalogButton) it2.next()));
            }
            int i2 = tep.a.$EnumSwitchMapping$1[horizontalButtonStackViewStyle.b.ordinal()];
            if (i2 == 1) {
                return e43.o(new UIBlockHorizontalButtonSmall(bi20Var2.a, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, arrayList2, bi20Var2.b, horizontalButtonStackViewStyle));
            }
            if (i2 == 2) {
                return e43.o(new UIBlockHorizontalButtonLarge(bi20Var2.a, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, arrayList2, bi20Var2.b, horizontalButtonStackViewStyle));
            }
            if (i2 == 3) {
                return EmptyList.b;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class k extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final k b = new k(5, jnh0.class, "transformSearchFilterBlocks", "transformSearchFilterBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            Object obj;
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            nq8 nq8Var2 = nq8Var;
            Object obj2 = null;
            if (jnh0.a.$EnumSwitchMapping$0[catalogBlock2.i.b.ordinal()] != 2) {
                ArrayList Gb = catalogBlock2.Gb(catalogExtendedData2);
                ArrayList arrayList = new ArrayList();
                Iterator it = Gb.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    SearchFilterItem searchFilterItem = next instanceof SearchFilterItem ? (SearchFilterItem) next : null;
                    if (searchFilterItem != null) {
                        arrayList.add(searchFilterItem);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    SearchFilterItem searchFilterItem2 = (SearchFilterItem) it2.next();
                    arrayList2.add(new UIBlockSearchFilter(bi20Var2.b(), searchFilterItem2.b, searchFilterItem2.c, searchFilterItem2.e, searchFilterItem2.d));
                }
                return arrayList2;
            }
            ArrayList a = nq8Var2.a(catalogExtendedData2, catalogBlock2.j, bi20Var2);
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = a.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
                if (((UIBlockAction) obj) instanceof UIBlockActionResetSearchFilter) {
                    break;
                }
            }
            UIBlockAction uIBlockAction = (UIBlockAction) obj;
            if (uIBlockAction != null) {
                arrayList3.add(uIBlockAction);
            }
            ArrayList Gb2 = catalogBlock2.Gb(catalogExtendedData2);
            ArrayList arrayList4 = new ArrayList();
            Iterator it4 = Gb2.iterator();
            while (it4.hasNext()) {
                Object next2 = it4.next();
                SearchFilterItem searchFilterItem3 = next2 instanceof SearchFilterItem ? (SearchFilterItem) next2 : null;
                if (searchFilterItem3 != null) {
                    arrayList4.add(searchFilterItem3);
                }
            }
            ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
            Iterator it5 = arrayList4.iterator();
            while (it5.hasNext()) {
                SearchFilterItem searchFilterItem4 = (SearchFilterItem) it5.next();
                Serializer.c<SearchQuickFilterItem> cVar = SearchQuickFilterItem.CREATOR;
                arrayList5.add(SearchQuickFilterItem.a.a(searchFilterItem4));
            }
            ArrayList arrayList6 = new ArrayList(c5g.u(arrayList5, 10));
            Iterator it6 = arrayList5.iterator();
            while (it6.hasNext()) {
                SearchQuickFilterItem searchQuickFilterItem = (SearchQuickFilterItem) it6.next();
                arrayList6.add(Boolean.valueOf(arrayList3.add(new UIBlockSearchQuickFilter(bi20Var2.b(), searchQuickFilterItem.b, searchQuickFilterItem, searchQuickFilterItem.e))));
            }
            Iterator it7 = a.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    break;
                }
                Object next3 = it7.next();
                if (((UIBlockAction) next3) instanceof UIBlockActionOpenSearchFilter) {
                    obj2 = next3;
                    break;
                }
            }
            UIBlockAction uIBlockAction2 = (UIBlockAction) obj2;
            if (uIBlockAction2 != null) {
                arrayList3.add(uIBlockAction2);
            }
            return arrayList3;
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class k0 extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final k0 b = new k0(5, hu.class, "transformActionBlocks", "transformActionBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            Object obj;
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            nq8 nq8Var2 = nq8Var;
            ArrayList<CatalogButton> arrayList = catalogBlock2.j;
            List<UIBlockAction> list2 = bi20Var2.l;
            int i = hu.a.$EnumSwitchMapping$0[catalogBlock2.i.b.ordinal()];
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (i != 1) {
                int i2 = 2;
                if (i == 2) {
                    return nq8Var2.a(catalogExtendedData2, arrayList, bi20Var2);
                }
                if (i != 3) {
                    if (i == 4) {
                        return Collections.singletonList(new UIBlockChips(bi20Var2.b(), bi20Var2.f, bi20Var2.g, nq8Var2.a(catalogExtendedData2, arrayList, bi20Var2)));
                    }
                    if (list2.size() == 1 && ((UIBlockAction) j5g.Y(list2)).d == CatalogViewType.SYNTHETIC_HEADER_CLEAR_TRACKS) {
                        return list2;
                    }
                    return Collections.singletonList(new UIBlockButtons(bi20Var2.a, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, list2, null));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    CatalogButton catalogButton = (CatalogButton) obj2;
                    if ((catalogButton instanceof CatalogButtonImportContacts) || (catalogButton instanceof CatalogButtonAddFriends) || (catalogButton instanceof CatalogButtonFriendsCleanup)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                if (arrayList2.isEmpty()) {
                    return arrayList3;
                }
                arrayList3.addAll(nq8Var2.a(catalogExtendedData2, arrayList2, bi20Var2));
                arrayList3.add(new UIBlockSeparator(new com.vk.catalog2.common.dto.api.ui.a(bi20Var2.a, bi20Var2.b, CatalogViewType.SEPARATOR, CatalogDataType.DATA_TYPE_NONE, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7680), objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0));
                return arrayList3;
            }
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((CatalogButton) it.next()) instanceof CatalogShowFiltersButton) {
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        Iterator<CatalogButton> it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            CatalogButton next = it2.next();
                            if (next instanceof CatalogButtonFilters) {
                                CatalogButtonFilters catalogButtonFilters = (CatalogButtonFilters) next;
                                List list3 = catalogButtonFilters.g;
                                if (list3 == null) {
                                    list3 = EmptyList.b;
                                }
                                arrayList5.addAll(hu.c(bi20Var2, list3, catalogButtonFilters.i, catalogBlock2.b, null, catalogButtonFilters.c, 16));
                            } else if (next instanceof CatalogShowFiltersButton) {
                                CatalogShowFiltersButton catalogShowFiltersButton = (CatalogShowFiltersButton) next;
                                List list4 = catalogShowFiltersButton.g;
                                if (list4 == null) {
                                    list4 = EmptyList.b;
                                }
                                arrayList4.addAll(hu.c(bi20Var2, list4, catalogShowFiltersButton.i, catalogBlock2.b, null, catalogShowFiltersButton.c, 16));
                            }
                        }
                        CatalogSliderViewStyle catalogSliderViewStyle = new CatalogSliderViewStyle(bi20Var2.p.getString(CatalogCustomAttributes$Keys.STYLE.h()));
                        String str = bi20Var2.a;
                        CatalogViewType catalogViewType = bi20Var2.d;
                        CatalogDataType catalogDataType = CatalogDataType.DATA_SYNTHETIC_SECTION;
                        String str2 = bi20Var2.k;
                        UserId userId = bi20Var2.e;
                        List<String> list5 = bi20Var2.j;
                        Set<UIBlockDragDropAction> set = bi20Var2.m;
                        UIBlockHint uIBlockHint = bi20Var2.o;
                        Iterator<T> it3 = list2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it3.next();
                            if (((UIBlockAction) obj).j != null) {
                                break;
                            }
                        }
                        UIBlockAction uIBlockAction = (UIBlockAction) obj;
                        return Collections.singletonList(new UIBlockFilter2D(str, catalogViewType, catalogDataType, str2, userId, list5, set, uIBlockHint, bez.b(bi20Var2, arrayList5, arrayList5, null, null, null, null, false, null, false, null, 524280), bez.b(bi20Var2, arrayList4, arrayList4, null, null, null, uIBlockAction != null ? uIBlockAction.j : null, false, null, false, null, 522232), catalogSliderViewStyle));
                    }
                }
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (obj3 instanceof CatalogButtonFilters) {
                    arrayList6.add(obj3);
                }
            }
            ArrayList arrayList7 = new ArrayList();
            Iterator it4 = arrayList6.iterator();
            while (it4.hasNext()) {
                CatalogButtonFilters catalogButtonFilters2 = (CatalogButtonFilters) it4.next();
                String str3 = catalogButtonFilters2.c;
                List list6 = catalogButtonFilters2.g;
                if (list6 == null) {
                    list6 = EmptyList.b;
                }
                g5g.y(hu.c(bi20Var2, list6, catalogButtonFilters2.i, catalogBlock2.b, null, str3, 16), arrayList7);
            }
            return arrayList7;
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class l extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final l b = new l(5, l2l0.class, "transformStickerPackBlocks", "transformStickerPackBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            CatalogViewType catalogViewType;
            bi20 bi20Var2 = bi20Var;
            ArrayList Gb = catalogBlock.Gb(catalogExtendedData);
            if (!Gb.isEmpty()) {
                Iterator it = Gb.iterator();
                while (it.hasNext()) {
                    if (it.next() instanceof StickerPackPreview) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = Gb.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            StickerPackPreview stickerPackPreview = next instanceof StickerPackPreview ? (StickerPackPreview) next : null;
                            if (stickerPackPreview != null) {
                                arrayList.add(stickerPackPreview);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                if (((StickerPackPreview) it3.next()).q != null && (!r15.isEmpty())) {
                                    catalogViewType = bi20Var2.d;
                                    break;
                                }
                            }
                        }
                        catalogViewType = CatalogViewType.LIST;
                        CatalogViewType catalogViewType2 = catalogViewType;
                        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            arrayList2.add(new UIBlockStickerPackPreview(bi20Var2.a, catalogViewType2, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, (StickerPackPreview) it4.next()));
                        }
                        return arrayList2;
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it5 = Gb.iterator();
            while (it5.hasNext()) {
                Object next2 = it5.next();
                StickerStockItem stickerStockItem = next2 instanceof StickerStockItem ? (StickerStockItem) next2 : null;
                if (stickerStockItem != null) {
                    arrayList3.add(stickerStockItem);
                }
            }
            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                arrayList4.add(new UIBlockStickerPack(bi20Var2.a, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, (StickerStockItem) it6.next()));
            }
            return arrayList4;
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class l0 extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final l0 b = new l0(5, fsa0.class, "transformPlaceholderBlocks", "transformPlaceholderBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00cd  */
        @Override // xsna.a0t
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            CatalogStateInfo catalogStateInfo;
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            nq8 nq8Var2 = nq8Var;
            switch (fsa0.a.$EnumSwitchMapping$1[catalogBlock2.i.b.ordinal()]) {
                case 1:
                    Iterator it = catalogBlock2.Gb(catalogExtendedData2).iterator();
                    do {
                        catalogStateInfo = null;
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (next instanceof CatalogStateInfo) {
                                catalogStateInfo = (CatalogStateInfo) next;
                            }
                        }
                        return catalogStateInfo != null ? EmptyList.b : Collections.singletonList(fsa0.c(bi20.a(bi20Var2, fsa0.b(catalogStateInfo), CatalogViewType.LIST, null, null, null, null, 33554419), catalogStateInfo, catalogExtendedData2, nq8Var2));
                    } while (catalogStateInfo == null);
                    if (catalogStateInfo != null) {
                    }
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    ArrayList Gb = catalogBlock2.Gb(catalogExtendedData2);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = Gb.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (next2 instanceof CatalogStateInfo) {
                            arrayList.add(next2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(fsa0.c(bi20Var2, (CatalogStateInfo) it3.next(), catalogExtendedData2, nq8Var2));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.addAll(arrayList2);
                    fsa0.a(catalogBlock2, arrayList3, bi20Var2);
                    return arrayList3;
                case 8:
                    ArrayList Gb2 = catalogBlock2.Gb(catalogExtendedData2);
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it4 = Gb2.iterator();
                    while (it4.hasNext()) {
                        Object next3 = it4.next();
                        if (next3 instanceof CatalogStateInfo) {
                            arrayList4.add(next3);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
                    Iterator it5 = arrayList4.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add(fsa0.c(bi20Var2, (CatalogStateInfo) it5.next(), catalogExtendedData2, nq8Var2));
                    }
                    return arrayList5;
                default:
                    return EmptyList.b;
            }
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class m extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final m b = new m(5, l2l0.class, "transformStickerBannerBlocks", "transformStickerBannerBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            bi20 bi20Var2 = bi20Var;
            ArrayList Gb = catalogBlock.Gb(catalogExtendedData);
            ArrayList arrayList = new ArrayList();
            Iterator it = Gb.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Banner banner = next instanceof Banner ? (Banner) next : null;
                if (banner != null) {
                    arrayList.add(banner);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new UIBlockBanner(bi20Var2.a, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, (Banner) it2.next()));
            }
            return arrayList2;
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class m0 extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final m0 b = new m0(5, j16.class, "transformBannerBlocks", "transformBannerBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            return j16.a(catalogBlock, catalogExtendedData, bi20Var, nq8Var);
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class n extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final n b = new n(5, l2l0.class, "transformStickerInfoBlocks", "transformStickerInfoBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            bi20 bi20Var2 = bi20Var;
            ArrayList Gb = catalogBlock.Gb(catalogExtendedData);
            ArrayList arrayList = new ArrayList();
            Iterator it = Gb.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                StickersInfo stickersInfo = next instanceof StickersInfo ? (StickersInfo) next : null;
                if (stickersInfo != null) {
                    arrayList.add(stickersInfo);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                StickersBonusBalance stickersBonusBalance = ((StickersInfo) it2.next()).c;
                if (stickersBonusBalance != null) {
                    arrayList2.add(stickersBonusBalance);
                }
            }
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new UIBlockStickersBonusBalance(bi20Var2.a, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, (StickersBonusBalance) it3.next()));
            }
            return arrayList3;
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class n0 extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final n0 b = new n0(5, j16.class, "transformBannerBlocks", "transformBannerBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            return j16.a(catalogBlock, catalogExtendedData, bi20Var, nq8Var);
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class o extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final o b = new o(5, lgq0.class, "transformUserBlocks", "transformUserBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            nq8 nq8Var2 = nq8Var;
            CatalogViewType catalogViewType = catalogBlock2.i.b;
            switch (lgq0.a.$EnumSwitchMapping$0[catalogViewType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    ArrayList Gb = catalogBlock2.Gb(catalogExtendedData2);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = Gb.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        CatalogUserMeta catalogUserMeta = next instanceof CatalogUserMeta ? (CatalogUserMeta) next : null;
                        if (catalogUserMeta != null) {
                            arrayList.add(catalogUserMeta);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        UIBlockProfile a = lgq0.a(catalogBlock2, (CatalogUserMeta) it2.next(), catalogExtendedData2, catalogViewType, nq8Var2);
                        if (a != null) {
                            arrayList2.add(a);
                        }
                    }
                    return rte0.C(arrayList2, bi20Var2);
                case 7:
                    ArrayList Gb2 = catalogBlock2.Gb(catalogExtendedData2);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = Gb2.iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        CatalogUserMeta catalogUserMeta2 = next2 instanceof CatalogUserMeta ? (CatalogUserMeta) next2 : null;
                        if (catalogUserMeta2 != null) {
                            arrayList3.add(catalogUserMeta2);
                        }
                    }
                    List H0 = j5g.H0(arrayList3, 3);
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it4 = H0.iterator();
                    while (it4.hasNext()) {
                        UIBlockProfile a2 = lgq0.a(catalogBlock2, (CatalogUserMeta) it4.next(), catalogExtendedData2, catalogViewType, nq8Var2);
                        if (a2 != null) {
                            arrayList4.add(a2);
                        }
                    }
                    return arrayList4;
                case 8:
                    ArrayList Gb3 = catalogBlock2.Gb(catalogExtendedData2);
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it5 = Gb3.iterator();
                    while (it5.hasNext()) {
                        Object next3 = it5.next();
                        if (next3 instanceof CatalogUserMeta) {
                            arrayList5.add(next3);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it6 = arrayList5.iterator();
                    while (it6.hasNext()) {
                        Object next4 = it6.next();
                        if (((CatalogUserMeta) next4).zb()) {
                            arrayList6.add(next4);
                        }
                    }
                    if (arrayList6.size() <= 2) {
                        ArrayList arrayList7 = new ArrayList();
                        Iterator it7 = arrayList6.iterator();
                        while (it7.hasNext()) {
                            UIBlockProfile a3 = lgq0.a(catalogBlock2, (CatalogUserMeta) it7.next(), catalogExtendedData2, CatalogViewType.LIST, nq8Var2);
                            if (a3 != null) {
                                arrayList7.add(a3);
                            }
                        }
                        return arrayList7;
                    }
                    if (arrayList6.size() <= 2) {
                        return EmptyList.b;
                    }
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it8 = arrayList6.iterator();
                    while (it8.hasNext()) {
                        Object next5 = it8.next();
                        if (((CatalogUserMeta) next5).Ab()) {
                            arrayList8.add(next5);
                        }
                    }
                    ArrayList arrayList9 = new ArrayList(lgq0.b(catalogBlock2, arrayList8, catalogExtendedData2, nq8Var2));
                    ArrayList arrayList10 = new ArrayList();
                    Iterator it9 = arrayList6.iterator();
                    while (it9.hasNext()) {
                        Object next6 = it9.next();
                        if (epx.f(((CatalogUserMeta) next6).i, "tomorrow")) {
                            arrayList10.add(next6);
                        }
                    }
                    arrayList9.addAll(lgq0.b(catalogBlock2, arrayList10, catalogExtendedData2, nq8Var2));
                    return arrayList9;
                case 9:
                    ArrayList Gb4 = catalogBlock2.Gb(catalogExtendedData2);
                    ArrayList arrayList11 = new ArrayList();
                    Iterator it10 = Gb4.iterator();
                    while (it10.hasNext()) {
                        Object next7 = it10.next();
                        CatalogUserMeta catalogUserMeta3 = next7 instanceof CatalogUserMeta ? (CatalogUserMeta) next7 : null;
                        if (catalogUserMeta3 != null) {
                            arrayList11.add(catalogUserMeta3);
                        }
                    }
                    ArrayList arrayList12 = new ArrayList();
                    Iterator it11 = arrayList11.iterator();
                    while (it11.hasNext()) {
                        UserProfile userProfile = catalogExtendedData2.Gb(((CatalogUserMeta) it11.next()).c).a;
                        if (userProfile != null) {
                            arrayList12.add(userProfile);
                        }
                    }
                    return Collections.singletonList(new UIBlockProfilesList(bi20Var2.a, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, arrayList11, arrayList12, catalogBlock2.k, catalogBlock2.h));
                default:
                    return EmptyList.b;
            }
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class o0 extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final o0 b = new o0(5, sua.class, "transformChannelsBlocks", "transformChannelsBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            CatalogBlock catalogBlock2 = catalogBlock;
            bi20 bi20Var2 = bi20Var;
            ArrayList Gb = catalogBlock2.Gb(catalogExtendedData);
            ArrayList arrayList = new ArrayList();
            Iterator it = Gb.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                CatalogChannel catalogChannel = next instanceof CatalogChannel ? (CatalogChannel) next : null;
                if (catalogChannel != null) {
                    arrayList.add(catalogChannel);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                CatalogChannel catalogChannel2 = (CatalogChannel) it2.next();
                String valueOf = String.valueOf(catalogChannel2.b);
                CatalogViewType catalogViewType = CatalogViewType.LIST;
                CatalogDataType catalogDataType = bi20Var2.c;
                UserId userId = bi20Var2.e;
                List<String> list2 = bi20Var2.j;
                Set<UIBlockDragDropAction> set = bi20Var2.m;
                UIBlockHint uIBlockHint = bi20Var2.o;
                bi20 bi20Var3 = bi20Var2;
                Iterator it3 = it2;
                String str = catalogBlock2.m.k.get(Long.valueOf(catalogChannel2.b));
                if (str == null) {
                    str = "";
                }
                arrayList2.add(new UIBlockChannel(valueOf, catalogViewType, catalogDataType, "", userId, list2, set, uIBlockHint, catalogChannel2, str, null));
                bi20Var2 = bi20Var3;
                it2 = it3;
            }
            return arrayList2;
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class p extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            ((euh0) this.receiver).getClass();
            return euh0.a(catalogExtendedData2, catalogBlock, bi20Var);
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class p0 extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final p0 b = new p0(5, jnh0.class, "transformSearchSportWidget", "transformSearchSportWidget(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            return jnh0.a(catalogExtendedData, catalogBlock, bi20Var);
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class q extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final q b = new q(5, jnh0.class, "transformSearchSuggestionBlocks", "transformSearchSuggestionBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            return jnh0.b(catalogExtendedData, catalogBlock, bi20Var);
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class q0 extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final q0 b = new q0(5, jnh0.class, "transformSearchSportWidget", "transformSearchSportWidget(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            return jnh0.a(catalogExtendedData, catalogBlock, bi20Var);
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class r extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final r b = new r(5, jnh0.class, "transformSearchSuggestionBlocks", "transformSearchSuggestionBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            return jnh0.b(catalogExtendedData, catalogBlock, bi20Var);
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class r0 extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final r0 b = new r0(5, x5s0.class, "transformTopshelfBlocks", "transformTopshelfBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:108:0x0206, code lost:
        
            if (r2.equals("sign_in_profile") == false) goto L186;
         */
        /* JADX WARN: Code restructure failed: missing block: B:109:0x0216, code lost:
        
            r2 = new com.vk.catalog2.common.dto.ui.UIBlockTopshelf.TopshelfTexts(r14, r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:110:0x021f, code lost:
        
            if (r0 == null) goto L110;
         */
        /* JADX WARN: Code restructure failed: missing block: B:111:0x0221, code lost:
        
            r14 = r0.g();
         */
        /* JADX WARN: Code restructure failed: missing block: B:112:0x0227, code lost:
        
            if (r0 == null) goto L113;
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x0229, code lost:
        
            r23 = r2;
            r2 = r0.d();
         */
        /* JADX WARN: Code restructure failed: missing block: B:114:0x0235, code lost:
        
            r13 = new com.vk.catalog2.common.dto.ui.UIBlockTopshelf.TopshelfImage(r14, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:115:0x023a, code lost:
        
            if (r0 == null) goto L117;
         */
        /* JADX WARN: Code restructure failed: missing block: B:116:0x023c, code lost:
        
            r14 = r0.d();
         */
        /* JADX WARN: Code restructure failed: missing block: B:117:0x0242, code lost:
        
            if (r0 == null) goto L120;
         */
        /* JADX WARN: Code restructure failed: missing block: B:118:0x0244, code lost:
        
            r18 = r4;
            r4 = r0.g();
         */
        /* JADX WARN: Code restructure failed: missing block: B:119:0x0250, code lost:
        
            r2 = new com.vk.catalog2.common.dto.ui.UIBlockTopshelf.TopshelfTrackCodes(r14, r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:120:0x0255, code lost:
        
            if (r19 == null) goto L124;
         */
        /* JADX WARN: Code restructure failed: missing block: B:121:0x0257, code lost:
        
            r14 = r19.h();
         */
        /* JADX WARN: Code restructure failed: missing block: B:122:0x025d, code lost:
        
            if (r19 == null) goto L127;
         */
        /* JADX WARN: Code restructure failed: missing block: B:123:0x025f, code lost:
        
            r22 = r2;
            r2 = r19.d();
         */
        /* JADX WARN: Code restructure failed: missing block: B:124:0x026b, code lost:
        
            if (r19 == null) goto L132;
         */
        /* JADX WARN: Code restructure failed: missing block: B:125:0x026d, code lost:
        
            r16 = r19.g();
         */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x0271, code lost:
        
            if (r16 == null) goto L132;
         */
        /* JADX WARN: Code restructure failed: missing block: B:127:0x0273, code lost:
        
            r20 = r5;
            r5 = xsna.j5g.O0(r16);
         */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x0281, code lost:
        
            r4 = new com.vk.catalog2.common.dto.ui.UIBlockTopshelf.TopshelfMeta(r14, r2, r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:129:0x0284, code lost:
        
            if (r20 == null) goto L136;
         */
        /* JADX WARN: Code restructure failed: missing block: B:130:0x0286, code lost:
        
            r25 = xsna.x5s0.a(r20);
         */
        /* JADX WARN: Code restructure failed: missing block: B:132:0x0291, code lost:
        
            if (r18 == null) goto L140;
         */
        /* JADX WARN: Code restructure failed: missing block: B:133:0x0293, code lost:
        
            r5 = r18.g();
         */
        /* JADX WARN: Code restructure failed: missing block: B:134:0x0299, code lost:
        
            if (r18 == null) goto L143;
         */
        /* JADX WARN: Code restructure failed: missing block: B:135:0x029b, code lost:
        
            r14 = r18.d();
         */
        /* JADX WARN: Code restructure failed: missing block: B:136:0x02a1, code lost:
        
            r0 = new com.vk.catalog2.common.dto.ui.UIBlockTopshelf.TopshelfKids(r3, new com.vk.catalog2.common.dto.ui.UIBlockTopshelf.a(r13, r22, r23, r4, r25, new com.vk.catalog2.common.dto.ui.UIBlockTopshelf.TopshelfTrailer(r5, r14)), r1.o);
         */
        /* JADX WARN: Code restructure failed: missing block: B:137:0x02a0, code lost:
        
            r14 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:138:0x0298, code lost:
        
            r5 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:139:0x028d, code lost:
        
            r25 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:140:0x027e, code lost:
        
            r20 = r5;
            r5 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:141:0x0268, code lost:
        
            r22 = r2;
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:142:0x025c, code lost:
        
            r14 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:143:0x024d, code lost:
        
            r18 = r4;
            r4 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:144:0x0241, code lost:
        
            r14 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:145:0x0232, code lost:
        
            r23 = r2;
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:146:0x0226, code lost:
        
            r14 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:148:0x0212, code lost:
        
            if (r2.equals("child_profile") == false) goto L186;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:53:0x035d  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0360 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r18v8, types: [com.vk.catalog2.common.dto.ui.UIBlockTopshelf$TopshelfPlaylist] */
        /* JADX WARN: Type inference failed for: r20v5, types: [com.vk.catalog2.common.dto.ui.UIBlockTopshelf$TopshelfVideo] */
        /* JADX WARN: Type inference failed for: r2v9, types: [com.vk.catalog2.common.dto.ui.UIBlockTopshelf$TopshelfNews] */
        @Override // xsna.a0t
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            UIBlockTopshelf.TopshelfKids topshelfKids;
            UIBlockTopshelf.TopshelfTexts topshelfTexts;
            List list2;
            List<String> g;
            TopshelfItem.TopshelfMeta topshelfMeta;
            String str;
            Long l;
            VideoFile videoFile;
            String str2;
            UIBlockTopshelf.TopshelfTrackCodes topshelfTrackCodes;
            String str3;
            UIBlockTopshelf.TopshelfTexts topshelfTexts2;
            List list3;
            List<String> g2;
            UIBlockTopshelf.TopshelfTexts topshelfTexts3;
            Long l2;
            String str4;
            String str5;
            UIBlockTopshelf.TopshelfTrackCodes topshelfTrackCodes2;
            String str6;
            VideoFile videoFile2;
            List list4;
            List<String> g3;
            CatalogBlock catalogBlock2 = catalogBlock;
            ArrayList Gb = catalogBlock2.Gb(catalogExtendedData);
            ArrayList arrayList = new ArrayList();
            Iterator it = Gb.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                TopshelfItem topshelfItem = next instanceof TopshelfItem ? (TopshelfItem) next : null;
                if (topshelfItem != null) {
                    arrayList.add(topshelfItem);
                }
            }
            String str7 = catalogBlock2.b;
            CatalogLayout catalogLayout = catalogBlock2.i;
            CatalogViewType catalogViewType = catalogLayout.b;
            CatalogDataType catalogDataType = catalogBlock2.c;
            String str8 = catalogBlock2.d;
            UserId userId = catalogLayout.c;
            List<String> list5 = catalogBlock2.l;
            EmptySet emptySet = EmptySet.b;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                TopshelfItem topshelfItem2 = (TopshelfItem) it2.next();
                String str9 = topshelfItem2.c;
                String str10 = topshelfItem2.b;
                TopshelfItem.TopshelfLiveInfo topshelfLiveInfo = topshelfItem2.i;
                String str11 = topshelfItem2.k;
                String str12 = topshelfItem2.j;
                TopshelfItem.TopshelfTrailer topshelfTrailer = topshelfItem2.l;
                Iterator it3 = it2;
                TopshelfItem.TopshelfTrackCodes topshelfTrackCodes3 = topshelfItem2.g;
                TopshelfItem.TopshelfImage topshelfImage = topshelfItem2.f;
                TopshelfItem.TopshelfMeta topshelfMeta2 = topshelfItem2.h;
                if (str9 != null) {
                    switch (str9.hashCode()) {
                        case -1804124500:
                            if (str9.equals("monotheme_news")) {
                                ClipVideoFile clipVideoFile = topshelfItem2.e;
                                UIBlockTopshelf.TopshelfTexts topshelfTexts4 = new UIBlockTopshelf.TopshelfTexts(str12, str11);
                                UIBlockTopshelf.TopshelfImage topshelfImage2 = new UIBlockTopshelf.TopshelfImage(topshelfImage != null ? topshelfImage.g() : null, topshelfImage != null ? topshelfImage.d() : null);
                                UIBlockTopshelf.TopshelfTrackCodes topshelfTrackCodes4 = new UIBlockTopshelf.TopshelfTrackCodes(topshelfTrackCodes3 != null ? topshelfTrackCodes3.d() : null, topshelfTrackCodes3 != null ? topshelfTrackCodes3.g() : null);
                                String h = topshelfMeta2 != null ? topshelfMeta2.h() : null;
                                String d = topshelfMeta2 != null ? topshelfMeta2.d() : null;
                                if (topshelfMeta2 == null || (g = topshelfMeta2.g()) == null) {
                                    topshelfTexts = topshelfTexts4;
                                    list2 = null;
                                } else {
                                    topshelfTexts = topshelfTexts4;
                                    list2 = j5g.O0(g);
                                }
                                topshelfKids = new UIBlockTopshelf.TopshelfNews(clipVideoFile, str10, new UIBlockTopshelf.a(topshelfImage2, topshelfTrackCodes4, topshelfTexts, new UIBlockTopshelf.TopshelfMeta(h, d, list2), topshelfLiveInfo != null ? x5s0.a(topshelfLiveInfo) : null, new UIBlockTopshelf.TopshelfTrailer(topshelfTrailer != null ? topshelfTrailer.g() : null, topshelfTrailer != null ? topshelfTrailer.d() : null)));
                                break;
                            }
                            break;
                        case -495367802:
                            topshelfMeta = topshelfMeta2;
                            break;
                        case -384255919:
                            topshelfMeta = topshelfMeta2;
                            break;
                        case 112202875:
                            if (str9.equals("video")) {
                                String str13 = topshelfItem2.b;
                                VideoFile videoFile3 = topshelfItem2.d;
                                UIBlockTopshelf.TopshelfTexts topshelfTexts5 = new UIBlockTopshelf.TopshelfTexts(str12, str11);
                                String g4 = topshelfImage != null ? topshelfImage.g() : null;
                                if (topshelfImage != null) {
                                    str = str13;
                                    l = topshelfImage.d();
                                } else {
                                    str = str13;
                                    l = null;
                                }
                                UIBlockTopshelf.TopshelfImage topshelfImage3 = new UIBlockTopshelf.TopshelfImage(g4, l);
                                String d2 = topshelfTrackCodes3 != null ? topshelfTrackCodes3.d() : null;
                                if (topshelfTrackCodes3 != null) {
                                    videoFile = videoFile3;
                                    str2 = topshelfTrackCodes3.g();
                                } else {
                                    videoFile = videoFile3;
                                    str2 = null;
                                }
                                UIBlockTopshelf.TopshelfTrackCodes topshelfTrackCodes5 = new UIBlockTopshelf.TopshelfTrackCodes(d2, str2);
                                String h2 = topshelfMeta2 != null ? topshelfMeta2.h() : null;
                                if (topshelfMeta2 != null) {
                                    topshelfTrackCodes = topshelfTrackCodes5;
                                    str3 = topshelfMeta2.d();
                                } else {
                                    topshelfTrackCodes = topshelfTrackCodes5;
                                    str3 = null;
                                }
                                if (topshelfMeta2 == null || (g2 = topshelfMeta2.g()) == null) {
                                    topshelfTexts2 = topshelfTexts5;
                                    list3 = null;
                                } else {
                                    topshelfTexts2 = topshelfTexts5;
                                    list3 = j5g.O0(g2);
                                }
                                topshelfKids = new UIBlockTopshelf.TopshelfVideo(str, videoFile, new UIBlockTopshelf.a(topshelfImage3, topshelfTrackCodes, topshelfTexts2, new UIBlockTopshelf.TopshelfMeta(h2, str3, list3), topshelfLiveInfo != null ? x5s0.a(topshelfLiveInfo) : null, new UIBlockTopshelf.TopshelfTrailer(topshelfTrailer != null ? topshelfTrailer.g() : null, topshelfTrailer != null ? topshelfTrailer.d() : null)), topshelfItem2.m, topshelfItem2.n);
                                break;
                            }
                            break;
                        case 1879474642:
                            if (str9.equals("playlist")) {
                                String str14 = topshelfItem2.b;
                                VideoFile videoFile4 = topshelfItem2.d;
                                UIBlockTopshelf.TopshelfTexts topshelfTexts6 = new UIBlockTopshelf.TopshelfTexts(str12, str11);
                                String g5 = topshelfImage != null ? topshelfImage.g() : null;
                                if (topshelfImage != null) {
                                    topshelfTexts3 = topshelfTexts6;
                                    l2 = topshelfImage.d();
                                } else {
                                    topshelfTexts3 = topshelfTexts6;
                                    l2 = null;
                                }
                                UIBlockTopshelf.TopshelfImage topshelfImage4 = new UIBlockTopshelf.TopshelfImage(g5, l2);
                                String d3 = topshelfTrackCodes3 != null ? topshelfTrackCodes3.d() : null;
                                if (topshelfTrackCodes3 != null) {
                                    str4 = str14;
                                    str5 = topshelfTrackCodes3.g();
                                } else {
                                    str4 = str14;
                                    str5 = null;
                                }
                                UIBlockTopshelf.TopshelfTrackCodes topshelfTrackCodes6 = new UIBlockTopshelf.TopshelfTrackCodes(d3, str5);
                                String h3 = topshelfMeta2 != null ? topshelfMeta2.h() : null;
                                if (topshelfMeta2 != null) {
                                    topshelfTrackCodes2 = topshelfTrackCodes6;
                                    str6 = topshelfMeta2.d();
                                } else {
                                    topshelfTrackCodes2 = topshelfTrackCodes6;
                                    str6 = null;
                                }
                                if (topshelfMeta2 == null || (g3 = topshelfMeta2.g()) == null) {
                                    videoFile2 = videoFile4;
                                    list4 = null;
                                } else {
                                    videoFile2 = videoFile4;
                                    list4 = j5g.O0(g3);
                                }
                                topshelfKids = new UIBlockTopshelf.TopshelfPlaylist(str4, videoFile2, new UIBlockTopshelf.a(topshelfImage4, topshelfTrackCodes2, topshelfTexts3, new UIBlockTopshelf.TopshelfMeta(h3, str6, list4), topshelfLiveInfo != null ? x5s0.a(topshelfLiveInfo) : null, new UIBlockTopshelf.TopshelfTrailer(topshelfTrailer != null ? topshelfTrailer.g() : null, topshelfTrailer != null ? topshelfTrailer.d() : null)), topshelfItem2.m, topshelfItem2.n);
                                break;
                            }
                            break;
                    }
                    if (topshelfKids == null) {
                        arrayList2.add(topshelfKids);
                    }
                    it2 = it3;
                }
                topshelfKids = null;
                if (topshelfKids == null) {
                }
                it2 = it3;
            }
            return Collections.singletonList(new UIBlockTopshelf(str7, catalogViewType, catalogDataType, str8, userId, list5, emptySet, null, null, arrayList2, 256, null));
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class s extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final s b = new s(5, fco0.class, "transformTextBlocks", "transformTextBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            return rli0.A(new ulp0(rli0.k(new i5g(catalogBlock.Gb(catalogExtendedData)), CatalogText.class), new gg10(bi20Var, 1)));
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class s0 extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final s0 b = new s0(5, x5s0.class, "transformMusicMixTopshelfBlocks", "transformMusicMixTopshelfBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            CatalogBlock catalogBlock2 = catalogBlock;
            ArrayList Gb = catalogBlock2.Gb(catalogExtendedData);
            ArrayList arrayList = new ArrayList();
            Iterator it = Gb.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                VideoMusicStreamMixItem videoMusicStreamMixItem = next instanceof VideoMusicStreamMixItem ? (VideoMusicStreamMixItem) next : null;
                if (videoMusicStreamMixItem != null) {
                    arrayList.add(videoMusicStreamMixItem);
                }
            }
            String str = catalogBlock2.b;
            CatalogLayout catalogLayout = catalogBlock2.i;
            CatalogViewType catalogViewType = catalogLayout.b;
            CatalogDataType catalogDataType = catalogBlock2.c;
            String str2 = catalogBlock2.d;
            UserId userId = catalogLayout.c;
            List<String> list2 = catalogBlock2.l;
            EmptySet emptySet = EmptySet.b;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                VideoMusicStreamMixItem videoMusicStreamMixItem2 = (VideoMusicStreamMixItem) it2.next();
                String str3 = videoMusicStreamMixItem2.b;
                String str4 = videoMusicStreamMixItem2.c;
                String str5 = videoMusicStreamMixItem2.d;
                String str6 = videoMusicStreamMixItem2.e;
                String str7 = videoMusicStreamMixItem2.f;
                List list3 = videoMusicStreamMixItem2.g;
                if (list3 == null) {
                    list3 = EmptyList.b;
                }
                arrayList2.add(new UIBlockMusicMixTopshelf.Item(str3, str4, str5, str6, str7, list3));
            }
            return Collections.singletonList(new UIBlockMusicMixTopshelf(str, catalogViewType, catalogDataType, str2, userId, list2, emptySet, null, null, arrayList2, 256, null));
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class t extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final t b = new t(5, zsg.class, "transformGroupChatBlocks", "transformGroupChatBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            Object obj;
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            nq8 nq8Var2 = nq8Var;
            int i = zsg.a.$EnumSwitchMapping$0[catalogBlock2.i.b.ordinal()];
            if (i != 1) {
                if (i == 3) {
                    Iterator it = nq8Var2.a(catalogExtendedData2, catalogBlock2.j, bi20Var2).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((UIBlockAction) obj) instanceof UIBlockActionOpenSection) {
                            break;
                        }
                    }
                    UIBlockActionOpenSection uIBlockActionOpenSection = obj instanceof UIBlockActionOpenSection ? (UIBlockActionOpenSection) obj : null;
                    if (uIBlockActionOpenSection == null) {
                        return EmptyList.b;
                    }
                    ArrayList Gb = catalogBlock2.Gb(catalogExtendedData2);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = Gb.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        GroupChat groupChat = next instanceof GroupChat ? (GroupChat) next : null;
                        if (groupChat != null) {
                            arrayList.add(groupChat);
                        }
                    }
                    List H0 = j5g.H0(arrayList, 3);
                    ArrayList arrayList2 = new ArrayList(c5g.u(H0, 10));
                    Iterator it3 = H0.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((GroupChat) it3.next()).d);
                    }
                    return Collections.singletonList(new UIBlockPreview(bi20Var2.a, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, bi20Var2.f, bi20Var2.g, arrayList2, Collections.singletonList(uIBlockActionOpenSection)));
                }
                if (i != 4 && i != 5 && i != 6) {
                    return EmptyList.b;
                }
            }
            ArrayList Gb2 = catalogBlock2.Gb(catalogExtendedData2);
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = Gb2.iterator();
            while (it4.hasNext()) {
                Object next2 = it4.next();
                GroupChat groupChat2 = next2 instanceof GroupChat ? (GroupChat) next2 : null;
                if (groupChat2 != null) {
                    arrayList3.add(groupChat2);
                }
            }
            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                arrayList4.add(new UIBlockGroupChat(bi20Var2.a, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, (GroupChat) it5.next()));
            }
            return arrayList4;
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class t0 extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final t0 b = new t0(5, x5s0.class, "transformVideoBlocks", "transformVideoBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            return x5s0.b(catalogExtendedData, catalogBlock, bi20Var);
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class u extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final u b = new u(5, axo.class, "transformMarketItemBlocks", "transformMarketItemBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            CatalogLayout catalogLayout = catalogBlock2.i;
            int i = axo.a.$EnumSwitchMapping$0[catalogLayout.b.ordinal()];
            List<? extends UIBlock> A = (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 9) ? rli0.A(new ulp0(rli0.j(new i5g(catalogBlock2.Gb(catalogExtendedData2)), bxo.c), new gq0(catalogExtendedData2, bi20Var2, catalogBlock2, 5))) : EmptyList.b;
            return catalogLayout.b.j() ? rte0.D(A, bi20Var2) : A;
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class u0 extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final u0 b = new u0(5, x5s0.class, "transformFeedbackBlocks", "transformFeedbackBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            bi20 bi20Var2 = bi20Var;
            ArrayList Gb = catalogBlock.Gb(catalogExtendedData);
            ArrayList arrayList = new ArrayList();
            Iterator it = Gb.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                QuestionnaireDto questionnaireDto = next instanceof QuestionnaireDto ? (QuestionnaireDto) next : null;
                if (questionnaireDto != null) {
                    arrayList.add(questionnaireDto);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                QuestionnaireDto questionnaireDto2 = (QuestionnaireDto) it2.next();
                InternalNpsQuestions a = rjx.a(questionnaireDto2);
                QuestionRootLayoutDto questionRootLayoutDto = questionnaireDto2.d;
                arrayList2.add(new UIBlockQuestionnaire(bi20Var2.a, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, a, questionRootLayoutDto != null ? new QuestionsTexts(questionRootLayoutDto.b, questionRootLayoutDto.c, questionRootLayoutDto.d, questionRootLayoutDto.e) : null));
            }
            return arrayList2;
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class v extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final v b = new v(5, x5s0.class, "transformVideoBlocks", "transformVideoBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            return x5s0.b(catalogExtendedData, catalogBlock, bi20Var);
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class v0 extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final v0 b = new v0(5, x5s0.class, "transformVideoAlbumBlocks", "transformVideoAlbumBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        @Override // xsna.a0t
        public final java.util.List<? extends com.vk.catalog2.common.dto.api.ui.UIBlock> invoke(com.vk.catalog2.common.dto.api.block.CatalogBlock r26, com.vk.catalog2.common.dto.api.CatalogExtendedData r27, xsna.bi20 r28, java.util.List<? extends com.vk.catalog2.common.dto.api.block.CatalogBlock> r29, xsna.nq8 r30) {
            /*
                Method dump skipped, instructions count: 411
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: xsna.shg.v0.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class w extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final w b = new w(5, axo.class, "transformGroupInfoItemBlocks", "transformGroupInfoItemBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            int i = axo.a.$EnumSwitchMapping$0[catalogBlock2.i.b.ordinal()];
            if (i != 1 && i != 3 && i != 5 && i != 6) {
                return EmptyList.b;
            }
            ArrayList Gb = catalogBlock2.Gb(catalogExtendedData2);
            ArrayList arrayList = new ArrayList();
            Iterator it = Gb.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof CatalogMarketGroupInfo) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (catalogExtendedData2.Ab(CatalogDataType.DATA_TYPE_GROUPS, ((CatalogMarketGroupInfo) next2).c.b) != null) {
                    arrayList2.add(next2);
                }
            }
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                CatalogMarketGroupInfo catalogMarketGroupInfo = (CatalogMarketGroupInfo) it3.next();
                com.vk.catalog2.common.dto.api.ui.a b2 = bi20Var2.b();
                Group group = (Group) catalogExtendedData2.Ab(CatalogDataType.DATA_TYPE_GROUPS, catalogMarketGroupInfo.c.b);
                List<CatalogLink> list2 = catalogMarketGroupInfo.e;
                ArrayList arrayList4 = new ArrayList();
                Iterator<T> it4 = list2.iterator();
                while (it4.hasNext()) {
                    Good good = (Good) catalogExtendedData2.Ab(CatalogDataType.DATA_TYPE_CATALOG_MARKET_ITEMS, ((CatalogLink) it4.next()).b);
                    if (good != null) {
                        arrayList4.add(good);
                    }
                }
                arrayList3.add(new UIBlockMarketGroupInfoItem(b2, catalogMarketGroupInfo, group, arrayList4, catalogBlock2.k));
            }
            return arrayList3;
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class w0 extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final w0 b = new w0(5, pq20.class, "transformMiniAppBlocks", "transformMiniAppBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            bi20 bi20Var2 = bi20Var;
            ArrayList Gb = catalogBlock.Gb(catalogExtendedData);
            ArrayList arrayList = new ArrayList();
            Iterator it = Gb.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                ApiApplication apiApplication = next instanceof ApiApplication ? (ApiApplication) next : null;
                if (apiApplication != null) {
                    arrayList.add(apiApplication);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new UIBlockApp(bi20Var2.a, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, (ApiApplication) it2.next(), null));
            }
            return arrayList2;
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class x extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final x b = new x(5, axo.class, "transformNavigationTabBlocks", "transformNavigationTabBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            int i = axo.a.$EnumSwitchMapping$0[catalogBlock2.i.b.ordinal()];
            return (i == 2 || i == 3) ? axo.a(bi20Var2, catalogBlock2, catalogExtendedData2, false) : i != 4 ? EmptyList.b : axo.a(bi20Var2, catalogBlock2, catalogExtendedData2, true);
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class y extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final y b = new y(5, axo.class, "transformMarketInfoBlocks", "transformMarketInfoBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            if (axo.a.$EnumSwitchMapping$0[catalogBlock.i.b.ordinal()] != 1) {
                return EmptyList.b;
            }
            Map<String, MarketInfo> map = catalogExtendedData2.P;
            ArrayList arrayList = new ArrayList(map.size());
            Iterator<Map.Entry<String, MarketInfo>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(new UIBlockMarketInfo(bi20Var2.b(), it.next().getValue()));
            }
            return arrayList;
        }
    }

    /* compiled from: CommonBlockCatalogTransformer.kt */
    public static final /* synthetic */ class z extends FunctionReferenceImpl implements a0t<CatalogBlock, CatalogExtendedData, bi20, List<? extends CatalogBlock>, nq8, List<? extends UIBlock>> {
        public static final z b = new z(5, yi0.class, "transformGroupFriendLikesBlocks", "transformGroupFriendLikesBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Ljava/util/List;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.a0t
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List<? extends CatalogBlock> list, nq8 nq8Var) {
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            if (yi0.a.$EnumSwitchMapping$0[catalogBlock2.i.b.ordinal()] != 1) {
                return EmptyList.b;
            }
            ArrayList Gb = catalogBlock2.Gb(catalogExtendedData2);
            ArrayList arrayList = new ArrayList();
            Iterator it = Gb.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                GroupLikes groupLikes = next instanceof GroupLikes ? (GroupLikes) next : null;
                if (groupLikes != null) {
                    arrayList.add(groupLikes);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                GroupLikes groupLikes2 = (GroupLikes) it2.next();
                Iterator<UserId> it3 = groupLikes2.f.iterator();
                while (it3.hasNext()) {
                    UserProfile userProfile = catalogExtendedData2.Gb(it3.next()).a;
                    if (userProfile != null) {
                        groupLikes2.e.add(userProfile);
                    }
                }
                Group group = catalogExtendedData2.Gb(fkq0.e(groupLikes2.b)).b;
                if (group != null) {
                    group.T = groupLikes2;
                }
                arrayList2.add(group);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                Group group2 = (Group) it4.next();
                if (group2 != null) {
                    arrayList3.add(group2);
                }
            }
            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                arrayList4.add(exq.b(bi20Var2, (Group) it5.next(), null, 60));
            }
            return arrayList4;
        }
    }

    @Override // xsna.xe7
    public final List f(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List list, oq8 oq8Var) {
        a0t a0tVar = (a0t) this.b.get(catalogBlock.c);
        if (a0tVar != null) {
            return (List) a0tVar.invoke(catalogBlock, catalogExtendedData, bi20Var, list, oq8Var);
        }
        return null;
    }
}
