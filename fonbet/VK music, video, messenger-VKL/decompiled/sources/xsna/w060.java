package xsna;

import android.os.Bundle;
import androidx.car.app.hardware.common.CarZone;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.BuildConfig;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.catalog.dto.CatalogBlockMetaDto;
import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.CatalogButtonAddFriend;
import com.vk.catalog2.common.dto.api.CatalogButtonAddFriends;
import com.vk.catalog2.common.dto.api.CatalogButtonAddVideos;
import com.vk.catalog2.common.dto.api.CatalogButtonAllFilters;
import com.vk.catalog2.common.dto.api.CatalogButtonClearDownloadsHistory;
import com.vk.catalog2.common.dto.api.CatalogButtonClearRecent;
import com.vk.catalog2.common.dto.api.CatalogButtonClearSection;
import com.vk.catalog2.common.dto.api.CatalogButtonCloseNotification;
import com.vk.catalog2.common.dto.api.CatalogButtonCreateGroup;
import com.vk.catalog2.common.dto.api.CatalogButtonCreatePlaylist;
import com.vk.catalog2.common.dto.api.CatalogButtonCreateVideoAlbum;
import com.vk.catalog2.common.dto.api.CatalogButtonDownloadAll;
import com.vk.catalog2.common.dto.api.CatalogButtonDragAndRemove;
import com.vk.catalog2.common.dto.api.CatalogButtonEnterEditMode;
import com.vk.catalog2.common.dto.api.CatalogButtonExpandBlock;
import com.vk.catalog2.common.dto.api.CatalogButtonFilters;
import com.vk.catalog2.common.dto.api.CatalogButtonFollowUser;
import com.vk.catalog2.common.dto.api.CatalogButtonFriendsCleanup;
import com.vk.catalog2.common.dto.api.CatalogButtonGoToAuthor;
import com.vk.catalog2.common.dto.api.CatalogButtonGoToOwner;
import com.vk.catalog2.common.dto.api.CatalogButtonHideBlock;
import com.vk.catalog2.common.dto.api.CatalogButtonImportContacts;
import com.vk.catalog2.common.dto.api.CatalogButtonLogin;
import com.vk.catalog2.common.dto.api.CatalogButtonLogout;
import com.vk.catalog2.common.dto.api.CatalogButtonMakeCall;
import com.vk.catalog2.common.dto.api.CatalogButtonMarketEditAlbum;
import com.vk.catalog2.common.dto.api.CatalogButtonMarketOptions;
import com.vk.catalog2.common.dto.api.CatalogButtonMusicFollowOwner;
import com.vk.catalog2.common.dto.api.CatalogButtonMusicSubscription;
import com.vk.catalog2.common.dto.api.CatalogButtonMusicUnfollowOwner;
import com.vk.catalog2.common.dto.api.CatalogButtonMyAudiosSectionOptions;
import com.vk.catalog2.common.dto.api.CatalogButtonOnboarding;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenChallenge;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenDialog;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenGroupsAdvertisement;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenInfoPopup;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenModal;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenQoeSurvey;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenQr;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenScreen;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenScreenLarge;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenSearchFilters;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenSearchTab;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenSection;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenUrl;
import com.vk.catalog2.common.dto.api.CatalogButtonPlayAudio;
import com.vk.catalog2.common.dto.api.CatalogButtonPlayAudioFromBlock;
import com.vk.catalog2.common.dto.api.CatalogButtonPlayMix;
import com.vk.catalog2.common.dto.api.CatalogButtonPlayVideosFromBlock;
import com.vk.catalog2.common.dto.api.CatalogButtonProfileAuthorCabinetVideo;
import com.vk.catalog2.common.dto.api.CatalogButtonProfileBecomeAuthorVideo;
import com.vk.catalog2.common.dto.api.CatalogButtonProfileChangeProfileVideo;
import com.vk.catalog2.common.dto.api.CatalogButtonProfileChildModeVideo;
import com.vk.catalog2.common.dto.api.CatalogButtonProfileOwnerGroupsVideo;
import com.vk.catalog2.common.dto.api.CatalogButtonRemoveFriend;
import com.vk.catalog2.common.dto.api.CatalogButtonReorder;
import com.vk.catalog2.common.dto.api.CatalogButtonResetFilters;
import com.vk.catalog2.common.dto.api.CatalogButtonSaveAsPlaylist;
import com.vk.catalog2.common.dto.api.CatalogButtonSearchMode;
import com.vk.catalog2.common.dto.api.CatalogButtonStartLiveStream;
import com.vk.catalog2.common.dto.api.CatalogButtonSwitchAccount;
import com.vk.catalog2.common.dto.api.CatalogButtonSwitchSection;
import com.vk.catalog2.common.dto.api.CatalogButtonToggleAlbumShuffle;
import com.vk.catalog2.common.dto.api.CatalogButtonToggleAlbumSubscription;
import com.vk.catalog2.common.dto.api.CatalogButtonToggleSubscriptionCurator;
import com.vk.catalog2.common.dto.api.CatalogButtonUnfollowArtist;
import com.vk.catalog2.common.dto.api.CatalogButtonUnfollowCurator;
import com.vk.catalog2.common.dto.api.CatalogButtonUpdateNonActiveGroups;
import com.vk.catalog2.common.dto.api.CatalogButtonUploadVideo;
import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Values;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.CatalogShowFiltersButton;
import com.vk.catalog2.common.dto.api.CatalogStateInfo;
import com.vk.catalog2.common.dto.api.CatalogText;
import com.vk.catalog2.common.dto.api.CatalogUserMeta;
import com.vk.catalog2.common.dto.api.CatalogVideo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.ShowAllInfo;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.banner.Banner;
import com.vk.catalog2.common.dto.api.banner.CatalogBannerImageMode;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.block.CatalogBlockAnchorInfo;
import com.vk.catalog2.common.dto.api.block.CatalogBlockItemsData;
import com.vk.catalog2.common.dto.api.block.CatalogBlockStatInfo;
import com.vk.catalog2.common.dto.api.hint.CatalogHint;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.common.dto.api.layout.LayoutSize;
import com.vk.catalog2.common.dto.api.layout.TopTitle;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.market.CatalogClassifiedYoulaCity;
import com.vk.catalog2.common.dto.api.market.CatalogMarketCategory;
import com.vk.catalog2.common.dto.api.market.CatalogMarketCategoryMappings;
import com.vk.catalog2.common.dto.api.market.CatalogMarketGroupInfo;
import com.vk.catalog2.common.dto.api.market.CatalogNavigationTab;
import com.vk.catalog2.common.dto.api.market.MarketInfo;
import com.vk.catalog2.common.dto.api.music.ArtistsIdsList;
import com.vk.catalog2.common.dto.api.music.AudioStreamMixTitles;
import com.vk.catalog2.common.dto.api.music.CatalogAudioContentCard;
import com.vk.catalog2.common.dto.api.music.CatalogAudioStreamMix;
import com.vk.catalog2.common.dto.api.music.CatalogConcertItem;
import com.vk.catalog2.common.dto.api.music.MusicOwner;
import com.vk.catalog2.common.dto.api.music.MusicSignalInfo;
import com.vk.catalog2.common.dto.api.music.RadioStation;
import com.vk.catalog2.common.dto.api.poll.UxPollData;
import com.vk.catalog2.common.dto.api.search.CatalogSearchEntityAnswer;
import com.vk.catalog2.common.dto.api.search.CatalogSearchSpellcheckResult;
import com.vk.catalog2.common.dto.api.section.CatalogAdBanner;
import com.vk.catalog2.common.dto.api.section.CatalogHeaderStyle;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.common.dto.api.section.CatalogSectionStyle;
import com.vk.catalog2.common.dto.api.style.CatalogActionFilterStyle;
import com.vk.catalog2.common.dto.api.style.CatalogSliderViewStyle;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.CategoriesListViewStyle;
import com.vk.catalog2.common.dto.api.style.ConcertSliderViewStyle;
import com.vk.catalog2.common.dto.api.style.DoubleListViewStyle;
import com.vk.catalog2.common.dto.api.style.FiltersViewStyle;
import com.vk.catalog2.common.dto.api.style.HeaderCatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.HorizontalButtonStackViewStyle;
import com.vk.catalog2.common.dto.api.style.LinkListViewStyle;
import com.vk.catalog2.common.dto.api.style.LinkSliderViewStyle;
import com.vk.catalog2.common.dto.api.style.MusicRecommendedPlaylistViewStyle;
import com.vk.catalog2.common.dto.api.style.MusicTrackCatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.OpenSectionViewStyle;
import com.vk.catalog2.common.dto.api.style.PlaceholderCatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.PodcastSliderViewStyle;
import com.vk.catalog2.common.dto.api.style.SavePlaylistViewStyle;
import com.vk.catalog2.common.dto.api.style.SearchModeActionStyle;
import com.vk.catalog2.common.dto.api.style.TopshelfViewStyle;
import com.vk.catalog2.common.dto.api.style.VerticalVideoCatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.VideoAlbumCatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.VideoCatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.VkMixInteractiveViewStyle;
import com.vk.catalog2.common.dto.api.style.VkMixViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockActionDnDEdit;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockActionDnDReorder;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.catalog2.common.dto.api.video.CatalogAiAssistantItem;
import com.vk.catalog2.common.dto.api.video.CatalogMovieItem;
import com.vk.catalog2.common.dto.api.video.CatalogPinnedVideoInfo;
import com.vk.catalog2.common.dto.api.video.ShowcaseListItem;
import com.vk.catalog2.common.dto.api.video.TopshelfItem;
import com.vk.catalog2.common.dto.api.video.musicvideo.VideoMusicStreamMixItem;
import com.vk.catalog2.common.dto.style.CatalogTabStyle;
import com.vk.catalog2.common.dto.ui.UIBlockApp;
import com.vk.catalog2.common.dto.ui.UIBlockArtistBio;
import com.vk.catalog2.common.dto.ui.UIBlockBadge;
import com.vk.catalog2.common.dto.ui.UIBlockBanner;
import com.vk.catalog2.common.dto.ui.UIBlockButtons;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockChips;
import com.vk.catalog2.common.dto.ui.UIBlockFilter2D;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.dto.ui.UIBlockGroupChat;
import com.vk.catalog2.common.dto.ui.UIBlockGroupsCategory;
import com.vk.catalog2.common.dto.ui.UIBlockGroupsCollection;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockMusicMixTopshelf;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.UIBlockPreview;
import com.vk.catalog2.common.dto.ui.UIBlockQuestionnaire;
import com.vk.catalog2.common.dto.ui.UIBlockSearchFilter;
import com.vk.catalog2.common.dto.ui.UIBlockSearchQuickFilter;
import com.vk.catalog2.common.dto.ui.UIBlockSeparator;
import com.vk.catalog2.common.dto.ui.UIBlockShimmer;
import com.vk.catalog2.common.dto.ui.UIBlockStaticLinksBanner;
import com.vk.catalog2.common.dto.ui.UIBlockTitleSubtitleAvatar;
import com.vk.catalog2.common.dto.ui.UIBlockTopshelf;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.catalog2.common.dto.ui.UIBlockVideoCategory;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionAddVideos;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionClearRecent;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionClearSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionCuratorSubscription;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionEnterEditMode;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionExpandBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFollow;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionGoToAuthor;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionGoToOwner;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionIconButton;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionMarketEditAlbum;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionMarketOptions;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOnboarding;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenAllSearchFilters;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenChallenge;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenInfoPopup;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenQoeSurvey;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenScreen;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenScreenLarge;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSearchFilter;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSearchTab;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudio;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayVideosFromBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionProfileVideoButton;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionResetSearchFilter;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSaveAsPlaylistFromBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSearchMode;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionShowFilters;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSwitchSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionTextButton;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionToggleAlbumShuffle;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionToggleAlbumSubscription;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionUpdateNonActiveGroups;
import com.vk.catalog2.common.dto.ui.actions.UIBlockDownloadAll;
import com.vk.catalog2.common.dto.ui.actions.UIBlockHideBlockButton;
import com.vk.catalog2.common.dto.ui.actions.UIBlockMusicFollowOwnerButton;
import com.vk.catalog2.common.dto.ui.actions.UIBlockMusicUnfollowOwnerButton;
import com.vk.catalog2.common.dto.ui.actions.UIBlockPlayMixAction;
import com.vk.catalog2.common.dto.ui.actions.UIBlockUnfollowArtistButton;
import com.vk.catalog2.common.dto.ui.actions.UiBlockActionUploadVideoButton;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketGroupInfoItem;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketInfo;
import com.vk.catalog2.common.dto.ui.market.UIBlockNavigationTab;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfilesList;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockSticker;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickerPack;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickerPackPreview;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickerPreview;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickersBonusBalance;
import com.vk.catalog2.common.dto.ui.subscriptions.UIBlockHorizontalButtonLarge;
import com.vk.catalog2.common.dto.ui.subscriptions.UIBlockHorizontalButtonSmall;
import com.vk.catalog2.feature.music.dto.ui.UIBlockAudioContentCard;
import com.vk.catalog2.feature.music.dto.ui.UIBlockConcert;
import com.vk.catalog2.feature.music.dto.ui.UIBlockLegalNotice;
import com.vk.catalog2.feature.music.dto.ui.UIBlockLogout;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicAggregatedUpdate;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicArtist;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicCurator;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylistUpdate;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicSpecial;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.catalog2.feature.music.dto.ui.UIBlockOfflineSyncPlaceholder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockPodcastItem;
import com.vk.catalog2.feature.music.dto.ui.UIBlockRadioStation;
import com.vk.catalog2.feature.music.dto.ui.UiBlockInteractiveVkMix;
import com.vk.catalog2.feature.music.dto.ui.UiBlockMusicVkMixStyle;
import com.vk.catalog2.feature.music.dto.ui.UiBlockSimpleVkMix;
import com.vk.catalog2.feature.music.dto.ui.actions.UIBlockActionLogout;
import com.vk.catalog2.feature.music.dto.ui.actions.UIBlockActionSwitchAccount;
import com.vk.catalog2.feature.music.dto.ui.actions.UIBlockClearDownloadsHistory;
import com.vk.catalog2.feature.music.dto.ui.actions.UIBlockMyAudiosSectionOptions;
import com.vk.catalog2.feature.search.dto.ui.UIBlockGroupsMapPreview;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestions;
import com.vk.clips.internal.nps.api.model.QuestionsTexts;
import com.vk.clips.sdk.shared.questionnarie.QuestionRootLayoutDto;
import com.vk.clips.sdk.shared.questionnarie.QuestionnaireDto;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.ads.AdBlockItem;
import com.vk.dto.articles.Article;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupCatalogItem;
import com.vk.dto.group.GroupChat;
import com.vk.dto.group.GroupCollection;
import com.vk.dto.group.GroupLikes;
import com.vk.dto.group.GroupsCategory;
import com.vk.dto.group.GroupsEntityCatalogItem;
import com.vk.dto.market.catalog.CatalogMarketCategoryContext;
import com.vk.dto.market.catalog.CatalogMarketFilter;
import com.vk.dto.music.Artist;
import com.vk.dto.music.AudioFollowingsUpdateInfo;
import com.vk.dto.music.AudioFollowingsUpdateItem;
import com.vk.dto.music.Curator;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistLink;
import com.vk.dto.music.PlaylistOwner;
import com.vk.dto.music.PlaylistRecommendationData;
import com.vk.dto.music.RecommendedPlaylist;
import com.vk.dto.music.SearchSuggestion;
import com.vk.dto.music.Thumb;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookPerson;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.podcast.ExtendedPodcast;
import com.vk.dto.podcast.FriendsLikedEpisode;
import com.vk.dto.podcast.OfflinePodcast;
import com.vk.dto.podcast.Podcast;
import com.vk.dto.podcast.PodcastSliderItem;
import com.vk.dto.search.SearchFilterItem;
import com.vk.dto.search.SearchQuickFilterItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.StickerStockItemWithStickerId;
import com.vk.dto.stickers.StickersInfo;
import com.vk.dto.stickers.bonus.StickersBonusBalance;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.LiveCategory;
import com.vk.dto.video.VideoAlbum;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.libvideo.author.VideoPinType;
import com.vk.stickers.views.sticker.StickerPackPreview;
import com.vk.stickers.views.sticker.StickerPackPreviewWithStickerId;
import com.vk.toggle.features.CatalogFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.k840;

/* compiled from: NestedListTransformer.kt */
/* loaded from: classes16.dex */
public class w060 implements jda {
    public final b25 b;
    public final boolean c;
    public final Object d;

    /* compiled from: NestedListTransformer.kt */
    public static final class a {
        public static final CatalogStateInfo a(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData) {
            ArrayList Gb = catalogBlock.Gb(catalogExtendedData);
            ArrayList arrayList = new ArrayList();
            Iterator it = Gb.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                CatalogStateInfo catalogStateInfo = next instanceof CatalogStateInfo ? (CatalogStateInfo) next : null;
                if (catalogStateInfo != null) {
                    arrayList.add(catalogStateInfo);
                }
            }
            return (CatalogStateInfo) j5g.a0(arrayList);
        }

        public static final Pair b(ArrayList arrayList) {
            ArrayList arrayList2 = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                UIBlockAction uIBlockAction = (UIBlockAction) it.next();
                if (uIBlockAction instanceof UIBlockDragDropAction) {
                    linkedHashSet.add(uIBlockAction);
                } else {
                    arrayList2.add(uIBlockAction);
                }
            }
            return new Pair(arrayList2, linkedHashSet);
        }
    }

    /* compiled from: NestedListTransformer.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.TITLE_SUBTITLE_AVATAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogViewType.SLIDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogViewType.CATEGORIES_LIST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogViewType.PODCAST_FAVORITES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CatalogViewType.PODCAST_CATEGORY_GENRE_BUTTONS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CatalogViewType.CATEGORIES_GRID.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CatalogViewType.ENTITY_DOUBLE_GRID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CatalogViewType.DOUBLE_LIST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CatalogViewType.DYNAMIC_GRID.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CatalogViewType.KIDS_COLLECTION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CatalogViewType.KIDS_CATALOG.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CatalogViewType.PREVIEW.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[CatalogViewType.MAP_PREVIEW.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[CatalogViewType.LARGE_SLIDER.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[CatalogViewType.FRIENDS_ACTION_LIST_ITEM.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[CatalogViewType.FRIENDS_BUTTON_LIST_WIDE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[CatalogViewType.CHIPS.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[CatalogViewType.SUBNAVIGATION_BAR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[CatalogViewType.CROP_SLIDER.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[CatalogViewType.SUBSECTION_TABS.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[CatalogViewType.BUTTONS_HORIZONTAL.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[CatalogViewType.NOTIFICATION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[CatalogViewType.HELP_HINT_BANNER.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER_BIG.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER_SMALL.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER_IMAGE_WARNING.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER_ILLEGAL_QUERY.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_OFFLINE_MUSIC_STATUS_PLACEHOLDER.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_OFFLINE_MUSIC_SUBSCRIPTION_SMALL.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_OFFLINE_MUSIC_SUBSCRIPTION_BIG.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_OFFLINE_PODCASTS_SECTION_PLACEHOLDER.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_OFFLINE_AUDIO_BOOKS_SECTION_PLACEHOLDER.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_OFFLINE_MAIN_TRACKS_SECTION_PLACEHOLDER.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER_VIDEO_EMPTY_SHORT_VIDEO.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[CatalogViewType.MUSIC_PLACEHOLDER_OFFLINE_SYNC.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[CatalogViewType.ASSISTANT_BANNER.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[CatalogViewType.SUPERAPP_TRAFFIC_GROUP_BANNER.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[CatalogViewType.LARGE_LIST.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[CatalogViewType.LARGE_SLIDER_INFINITE.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[CatalogViewType.LARGE_LIST_INFINITE.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[CatalogViewType.SLIDER_INFINITE.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[CatalogViewType.SNIPPETS_BANNER.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[CatalogViewType.SMALL_LIST.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[CatalogViewType.SMALL_SLIDER.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[CatalogViewType.CATALOG_BANNER.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[CatalogViewType.SLIDER_CARD.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[CatalogViewType.SLIDER_CARD_INFINITE.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[CatalogViewType.PROMO_BANNERS_SLIDER_INFINITE.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[CatalogViewType.PROMO_BANNERS_SLIDER.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[CatalogViewType.PODCAST_BANNERS_SLIDER.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[CatalogViewType.PODCAST_BANNERS_SLIDER_INFINITE.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[CatalogViewType.HEADER.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[CatalogViewType.HEADER_COMPACT.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[CatalogViewType.HEADER_EXTENDED.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[CatalogViewType.HEADER_LARGE.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[CatalogViewType.SEPARATOR.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[CatalogViewType.SEPARATOR_COMPACT.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[CatalogViewType.BUTTON.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[CatalogViewType.AUDIO_STREAM_MIX.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[CatalogViewType.AUDIO_STREAM_MIX_INTERACTIVE.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[CatalogViewType.HORIZONTAL_BUTTONS_STACK.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[CatalogViewType.MUSIC_MAIN_NAVIGATION.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_LOGOUT.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[CatalogViewType.LIST_MYFOLLOWERS.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_SEARCH_LIST.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[CatalogViewType.HORIZONTAL_LIST_FRIEND_SUGGESTS.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[CatalogViewType.FRIENDS_UNREAD_REQUEST.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[CatalogViewType.LIST_FRIENDS_REQUESTS.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[CatalogViewType.LIST_FRIENDS_REQUESTS_OUT.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[CatalogViewType.LIST_FRIENDS_SUGGEST.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[CatalogViewType.FRIENDS_BIRTHDAYS_LIST.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[CatalogViewType.FRIENDS_REQUEST.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[CatalogViewType.TRIPLE_STACKED_SLIDER.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[CatalogViewType.DOUBLE_STACKED_SLIDER.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[CatalogViewType.TRIPLE_STACKED_SLIDER_PICKER.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[CatalogViewType.STACKED_LIST.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[CatalogViewType.DOUBLE_STACKED_LIST.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[CatalogViewType.ARTIST_MERCH_SLIDER.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[CatalogViewType.ICONS_SLIDER.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[CatalogViewType.MY_SHELF_PLAYABLE_ITEM.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_TYPE_SEARCH_FILTERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_VIDEO_VIDEOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_VIDEO_CATALOG_VIDEOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_ARTIST_VIDEOS.ordinal()] = 4;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_VIDEO_TOPSHELF.ordinal()] = 5;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_MUSIC_MIX_VIDEO_TOPSHELF.ordinal()] = 6;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_FEEDBACKS.ordinal()] = 7;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_VIDEO_ALBUMS.ordinal()] = 8;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_LIVE_CATEGORY.ordinal()] = 9;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_LINKS.ordinal()] = 10;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_MINIAPPS.ordinal()] = 11;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_GAMES.ordinal()] = 12;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_MUSIC_TRACKS.ordinal()] = 13;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_SHORT_VIDEO_AUDIOS.ordinal()] = 14;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_MUSIC_PLAYLISTS.ordinal()] = 15;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_MUSIC_RECOMMENDED_PLAYLISTS.ordinal()] = 16;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_AUDIO_CONTENT_CARDS.ordinal()] = 17;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_ARTIST.ordinal()] = 18;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CURATOR.ordinal()] = 19;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_AUDIO_FOLLOWINGS_UPDATE_INFO.ordinal()] = 20;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_AUDIO_FOLLOWINGS_UPDATE_ITEM.ordinal()] = 21;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_GROUPS.ordinal()] = 22;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_ALL_GROUPS_OR_RECOMMENDATIONS.ordinal()] = 23;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_GROUPS_ITEMS.ordinal()] = 24;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_GROUPS_COLLECTION.ordinal()] = 25;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_GROUPS_CATEGORY_ITEMS.ordinal()] = 26;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_GROUPS_INVITES.ordinal()] = 27;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_STICKERS.ordinal()] = 28;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_STICKER_PACKS.ordinal()] = 29;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_STICKERS_BANNERS.ordinal()] = 30;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_STICKERS_INFO.ordinal()] = 31;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_ACTION.ordinal()] = 32;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_PLACEHOLDER.ordinal()] = 33;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_BANNERS.ordinal()] = 34;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_GROUP_BANNERS.ordinal()] = 35;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 36;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_AUDIO_STREAM_MIXES.ordinal()] = 37;
            } catch (NoSuchFieldError unused120) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_EMPTY.ordinal()] = 38;
            } catch (NoSuchFieldError unused121) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_USERS.ordinal()] = 39;
            } catch (NoSuchFieldError unused122) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_AUDIO_SEARCH_RECENTS.ordinal()] = 40;
            } catch (NoSuchFieldError unused123) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_MUSIC_SEARCH_SUGGESTION.ordinal()] = 41;
            } catch (NoSuchFieldError unused124) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_SEARCH_SUGGESTION.ordinal()] = 42;
            } catch (NoSuchFieldError unused125) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_TEXTS.ordinal()] = 43;
            } catch (NoSuchFieldError unused126) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_MUSIC_SPECIAL.ordinal()] = 44;
            } catch (NoSuchFieldError unused127) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_GROUPS_CHATS.ordinal()] = 45;
            } catch (NoSuchFieldError unused128) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_MARKET_ITEMS.ordinal()] = 46;
            } catch (NoSuchFieldError unused129) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_GROUPS_INFO_ITEMS.ordinal()] = 47;
            } catch (NoSuchFieldError unused130) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_NAVIGATION_TABS.ordinal()] = 48;
            } catch (NoSuchFieldError unused131) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_MARKET_INFO.ordinal()] = 49;
            } catch (NoSuchFieldError unused132) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_FRIENDS_LIKES.ordinal()] = 50;
            } catch (NoSuchFieldError unused133) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_RECENT_BUSINESSES.ordinal()] = 51;
            } catch (NoSuchFieldError unused134) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_LONGREADS.ordinal()] = 52;
            } catch (NoSuchFieldError unused135) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_PODCASTS.ordinal()] = 53;
            } catch (NoSuchFieldError unused136) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_OFFLINE_PODCASTS.ordinal()] = 54;
            } catch (NoSuchFieldError unused137) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_PODCAST_EPISODES.ordinal()] = 55;
            } catch (NoSuchFieldError unused138) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_PODCAST_SLIDER_ITEMS.ordinal()] = 56;
            } catch (NoSuchFieldError unused139) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_EXTENDED_PODCASTS.ordinal()] = 57;
            } catch (NoSuchFieldError unused140) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_FRIENDS_LIKE_EPISODE.ordinal()] = 58;
            } catch (NoSuchFieldError unused141) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_MUSIC_OWNERS.ordinal()] = 59;
            } catch (NoSuchFieldError unused142) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_OWNERS.ordinal()] = 60;
            } catch (NoSuchFieldError unused143) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_SEARCH_AUTHORS.ordinal()] = 61;
            } catch (NoSuchFieldError unused144) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_AUDIO_SIGNAL_COMMON_INFO.ordinal()] = 62;
            } catch (NoSuchFieldError unused145) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_SEARCH_SPELLCHECKER.ordinal()] = 63;
            } catch (NoSuchFieldError unused146) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_RADIO_STATIONS.ordinal()] = 64;
            } catch (NoSuchFieldError unused147) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_AUDIOBOOKS.ordinal()] = 65;
            } catch (NoSuchFieldError unused148) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_AUDIOBOOKS_PERSONS.ordinal()] = 66;
            } catch (NoSuchFieldError unused149) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_MINI_APPS_CONTENT.ordinal()] = 67;
            } catch (NoSuchFieldError unused150) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_SEARCH_ENTITY_ITEMS.ordinal()] = 68;
            } catch (NoSuchFieldError unused151) {
            }
            try {
                iArr2[CatalogDataType.DATA_SYNTHETIC_LOADING.ordinal()] = 69;
            } catch (NoSuchFieldError unused152) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CONCERTS.ordinal()] = 70;
            } catch (NoSuchFieldError unused153) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_AD_BLOCKS.ordinal()] = 71;
            } catch (NoSuchFieldError unused154) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_AD_BLOCKS.ordinal()] = 72;
            } catch (NoSuchFieldError unused155) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_AI_ASSISTANTS.ordinal()] = 73;
            } catch (NoSuchFieldError unused156) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_MOVIES.ordinal()] = 74;
            } catch (NoSuchFieldError unused157) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CatalogSearchEntityAnswer.EntityType.values().length];
            try {
                iArr3[CatalogSearchEntityAnswer.EntityType.Person.ordinal()] = 1;
            } catch (NoSuchFieldError unused158) {
            }
            try {
                iArr3[CatalogSearchEntityAnswer.EntityType.VideoPlaylist.ordinal()] = 2;
            } catch (NoSuchFieldError unused159) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[CatalogBannerImageMode.values().length];
            try {
                iArr4[CatalogBannerImageMode.SQUARE_BIG.ordinal()] = 1;
            } catch (NoSuchFieldError unused160) {
            }
            try {
                iArr4[CatalogBannerImageMode.ROUND_BIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused161) {
            }
            try {
                iArr4[CatalogBannerImageMode.SQUARE_SMALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused162) {
            }
            try {
                iArr4[CatalogBannerImageMode.ROUND_SMALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused163) {
            }
            try {
                iArr4[CatalogBannerImageMode.FULL_BACKGROUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused164) {
            }
            try {
                iArr4[CatalogBannerImageMode.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused165) {
            }
            try {
                iArr4[CatalogBannerImageMode.ROUNDED_SMALL_IMAGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused166) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[HorizontalButtonStackViewStyle.Style.values().length];
            try {
                iArr5[HorizontalButtonStackViewStyle.Style.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused167) {
            }
            try {
                iArr5[HorizontalButtonStackViewStyle.Style.LargeWithIcon.ordinal()] = 2;
            } catch (NoSuchFieldError unused168) {
            }
            try {
                iArr5[HorizontalButtonStackViewStyle.Style.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused169) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[CatalogAudioContentCard.EntityType.values().length];
            try {
                iArr6[CatalogAudioContentCard.EntityType.PODCASTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused170) {
            }
            try {
                iArr6[CatalogAudioContentCard.EntityType.AUDIOBOOKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused171) {
            }
            $EnumSwitchMapping$5 = iArr6;
        }
    }

    /* compiled from: _Sequences.kt */
    public static final class c implements izs<Object, Boolean> {
        public static final c b = new c();

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof Good);
        }
    }

    /* compiled from: _Sequences.kt */
    public static final class d implements izs<Object, Boolean> {
        public static final d b = new d();

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof MusicTrack);
        }
    }

    /* compiled from: _Sequences.kt */
    public static final class e implements izs<Object, Boolean> {
        public static final e b = new e();

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof AudioBook);
        }
    }

    /* compiled from: _Sequences.kt */
    public static final class f implements izs<Object, Boolean> {
        public static final f b = new f();

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof AudioBook);
        }
    }

    /* compiled from: _Sequences.kt */
    public static final class g implements izs<Object, Boolean> {
        public static final g b = new g();

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof AudioBookPerson);
        }
    }

    /* compiled from: _Sequences.kt */
    public static final class h implements izs<Object, Boolean> {
        public static final h b = new h();

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof CatalogSearchEntityAnswer);
        }
    }

    /* compiled from: _Sequences.kt */
    public static final class i implements izs<Object, Boolean> {
        public static final i b = new i();

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof AdBlockItem);
        }
    }

    /* compiled from: _Sequences.kt */
    public static final class j implements izs<Object, Boolean> {
        public static final j b = new j();

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof AdBlockItem);
        }
    }

    /* compiled from: _Sequences.kt */
    public static final class k implements izs<Object, Boolean> {
        public static final k b = new k();

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof CatalogAiAssistantItem);
        }
    }

    /* compiled from: _Sequences.kt */
    public static final class l implements izs<Object, Boolean> {
        public static final l b = new l();

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof CatalogMovieItem);
        }
    }

    /* compiled from: NestedListTransformer.kt */
    public static final /* synthetic */ class m extends PropertyReference1Impl {
        public static final m b = new m(PodcastSliderItem.class, DatabaseHelper.ITEM_COLUMN_NAME, "getItem()Lcom/vk/dto/music/MusicTrack;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((PodcastSliderItem) obj).d;
        }
    }

    public w060(b25 b25Var) {
        this.b = b25Var;
        this.c = com.vk.toggle.d.I();
        this.d = msy.a(LazyThreadSafetyMode.NONE, new fn4(25));
    }

    public static UIBlockBadge A(bi20 bi20Var, CatalogBadge catalogBadge) {
        return new UIBlockBadge(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, catalogBadge);
    }

    public static List A0(bi20 bi20Var, CatalogBlock catalogBlock) {
        String string = catalogBlock.i.h.getString(CatalogCustomAttributes$Keys.STYLE.h());
        HorizontalButtonStackViewStyle.Style.Companion.getClass();
        HorizontalButtonStackViewStyle horizontalButtonStackViewStyle = new HorizontalButtonStackViewStyle(HorizontalButtonStackViewStyle.Style.a.a(string));
        ArrayList<CatalogButton> arrayList = catalogBlock.j;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((CatalogButtonOpenUrl) ((CatalogButton) it.next()));
        }
        int i2 = b.$EnumSwitchMapping$4[horizontalButtonStackViewStyle.b.ordinal()];
        if (i2 == 1) {
            return e43.o(new UIBlockHorizontalButtonSmall(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, arrayList2, bi20Var.b, horizontalButtonStackViewStyle));
        }
        if (i2 == 2) {
            return e43.o(new UIBlockHorizontalButtonLarge(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, arrayList2, bi20Var.b, horizontalButtonStackViewStyle));
        }
        if (i2 == 3) {
            return EmptyList.b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static UIBlockList B0(w060 w060Var, bi20 bi20Var, List list, List list2, UIBlockBadge uIBlockBadge, CatalogViewType catalogViewType, CatalogDataType catalogDataType, UIBlockHint uIBlockHint, boolean z, CatalogTabStyle.Gradient gradient, boolean z2, CatalogViewStyle catalogViewStyle, CatalogAdBanner catalogAdBanner, int i2) {
        UIBlockBadge uIBlockBadge2 = (i2 & 8) != 0 ? null : uIBlockBadge;
        String str = bi20Var.a;
        CatalogViewType catalogViewType2 = (i2 & 32) != 0 ? bi20Var.d : catalogViewType;
        CatalogDataType catalogDataType2 = (i2 & 64) != 0 ? bi20Var.c : catalogDataType;
        String str2 = bi20Var.k;
        UserId userId = bi20Var.e;
        List<String> list3 = bi20Var.j;
        Set<UIBlockDragDropAction> set = bi20Var.m;
        UIBlockHint uIBlockHint2 = (i2 & 2048) != 0 ? bi20Var.o : uIBlockHint;
        String str3 = bi20Var.q;
        String str4 = bi20Var.f;
        String str5 = bi20Var.n;
        boolean z3 = (32768 & i2) != 0 ? false : z;
        CatalogTabStyle.Gradient gradient2 = (65536 & i2) != 0 ? null : gradient;
        boolean z4 = (131072 & i2) != 0 ? false : z2;
        CatalogViewStyle catalogViewStyle2 = (262144 & i2) != 0 ? null : catalogViewStyle;
        CatalogAdBanner catalogAdBanner2 = (i2 & 524288) != 0 ? null : catalogAdBanner;
        List list4 = list2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list4) {
            String str6 = str5;
            if (obj instanceof UIBlockActionShowFilters) {
                arrayList.add(obj);
            }
            str5 = str6;
        }
        String str7 = str5;
        UIBlockActionShowFilters uIBlockActionShowFilters = (UIBlockActionShowFilters) j5g.a0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list4) {
            UIBlockActionShowFilters uIBlockActionShowFilters2 = uIBlockActionShowFilters;
            List list5 = list4;
            if (obj2 instanceof UIBlockActionEnterEditMode) {
                arrayList2.add(obj2);
            }
            uIBlockActionShowFilters = uIBlockActionShowFilters2;
            list4 = list5;
        }
        UIBlockActionShowFilters uIBlockActionShowFilters3 = uIBlockActionShowFilters;
        List list6 = list4;
        UIBlockActionEnterEditMode uIBlockActionEnterEditMode = (UIBlockActionEnterEditMode) j5g.a0(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list6) {
            if (obj3 instanceof UIBlockActionGoToOwner) {
                arrayList3.add(obj3);
            }
        }
        UIBlockActionGoToOwner uIBlockActionGoToOwner = (UIBlockActionGoToOwner) j5g.a0(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list6) {
            if (obj4 instanceof UIBlockActionClearSection) {
                arrayList4.add(obj4);
            }
        }
        UIBlockActionClearSection uIBlockActionClearSection = (UIBlockActionClearSection) j5g.a0(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : list6) {
            if (obj5 instanceof UIBlockDownloadAll) {
                arrayList5.add(obj5);
            }
        }
        UIBlockDownloadAll uIBlockDownloadAll = (UIBlockDownloadAll) j5g.a0(arrayList5);
        List list7 = list2;
        ArrayList arrayList6 = new ArrayList();
        Iterator it = list7.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            List list8 = list7;
            Iterator it2 = it;
            if (((UIBlockAction) next).d == CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION) {
                arrayList6.add(next);
            }
            list7 = list8;
            it = it2;
        }
        List list9 = list7;
        ArrayList arrayList7 = new ArrayList();
        Iterator it3 = arrayList6.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (next2 instanceof UIBlockActionOpenSection) {
                arrayList7.add(next2);
            }
        }
        UIBlockActionOpenSection uIBlockActionOpenSection = (UIBlockActionOpenSection) j5g.a0(arrayList7);
        ArrayList arrayList8 = new ArrayList();
        Iterator it4 = list9.iterator();
        while (it4.hasNext()) {
            Object next3 = it4.next();
            Iterator it5 = it4;
            if (((UIBlockAction) next3).d == CatalogViewType.SYNTHETIC_ACTION_OPEN_URL) {
                arrayList8.add(next3);
            }
            it4 = it5;
        }
        ArrayList arrayList9 = new ArrayList();
        Iterator it6 = arrayList8.iterator();
        while (it6.hasNext()) {
            Object next4 = it6.next();
            if (next4 instanceof UIBlockActionOpenUrl) {
                arrayList9.add(next4);
            }
        }
        UIBlockActionOpenUrl uIBlockActionOpenUrl = (UIBlockActionOpenUrl) j5g.a0(arrayList9);
        ArrayList arrayList10 = new ArrayList();
        for (Object obj6 : list6) {
            if (obj6 instanceof UIBlockActionSearchMode) {
                arrayList10.add(obj6);
            }
        }
        UIBlockActionSearchMode uIBlockActionSearchMode = (UIBlockActionSearchMode) j5g.a0(arrayList10);
        ArrayList arrayList11 = new ArrayList();
        for (Object obj7 : list6) {
            if (obj7 instanceof UIBlockActionOpenSearchFilter) {
                arrayList11.add(obj7);
            }
        }
        UIBlockActionOpenSearchFilter uIBlockActionOpenSearchFilter = (UIBlockActionOpenSearchFilter) j5g.a0(arrayList11);
        return new UIBlockList(str, catalogViewType2, catalogDataType2, str2, userId, list3, set, uIBlockHint2, str3, str4, list, str7, uIBlockActionShowFilters3, uIBlockActionEnterEditMode, uIBlockActionGoToOwner, uIBlockActionSearchMode, uIBlockActionClearSection, uIBlockActionOpenSection, uIBlockActionOpenUrl, uIBlockBadge2, z3, gradient2, z4, bi20Var.t, catalogViewStyle2, uIBlockActionOpenSearchFilter != null ? uIBlockActionOpenSearchFilter.z : true, bi20Var.b, bi20Var.u, catalogAdBanner2 != null ? Integer.valueOf(catalogAdBanner2.b) : null, uIBlockDownloadAll);
    }

    public static UIBlockActionProfileVideoButton C(bi20 bi20Var, CatalogViewType catalogViewType, UserId userId, String str, String str2) {
        return new UIBlockActionProfileVideoButton(new com.vk.catalog2.common.dto.api.ui.a(bi20Var.a, bi20Var.b, catalogViewType, bi20Var.c, bi20Var.k, userId, bi20Var.j, bi20Var.m, bi20Var.o, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7680), str2, str, bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h()));
    }

    public static List C0(ArrayList arrayList, CatalogBlock catalogBlock) {
        String str = catalogBlock.b;
        CatalogLayout catalogLayout = catalogBlock.i;
        CatalogViewType catalogViewType = catalogLayout.b;
        CatalogDataType catalogDataType = catalogBlock.c;
        String str2 = catalogBlock.d;
        UserId userId = catalogLayout.c;
        List<String> list = catalogBlock.l;
        EmptySet emptySet = EmptySet.b;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            VideoMusicStreamMixItem videoMusicStreamMixItem = (VideoMusicStreamMixItem) it.next();
            String str3 = videoMusicStreamMixItem.b;
            String str4 = videoMusicStreamMixItem.c;
            String str5 = videoMusicStreamMixItem.d;
            String str6 = videoMusicStreamMixItem.e;
            String str7 = videoMusicStreamMixItem.f;
            List list2 = videoMusicStreamMixItem.g;
            if (list2 == null) {
                list2 = EmptyList.b;
            }
            arrayList2.add(new UIBlockMusicMixTopshelf.Item(str3, str4, str5, str6, str7, list2));
        }
        return Collections.singletonList(new UIBlockMusicMixTopshelf(str, catalogViewType, catalogDataType, str2, userId, list, emptySet, null, null, arrayList2, 256, null));
    }

    public static UIBlockLink D(bi20 bi20Var, CatalogLink catalogLink) {
        Object obj;
        String string = bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h());
        CategoriesListViewStyle.Style.Companion.getClass();
        Iterator<E> it = CategoriesListViewStyle.Style.h().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((CategoriesListViewStyle.Style) obj).i(), string)) {
                break;
            }
        }
        CategoriesListViewStyle.Style style = (CategoriesListViewStyle.Style) obj;
        if (style == null) {
            style = CategoriesListViewStyle.Style.None;
        }
        return new UIBlockLink(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, bi20Var.b, catalogLink, new CategoriesListViewStyle(style), bi20Var.u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x02bf, code lost:
    
        if (r2.equals("sign_in_profile") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02d1, code lost:
    
        r2 = new com.vk.catalog2.common.dto.ui.UIBlockTopshelf.TopshelfTexts(r15, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02da, code lost:
    
        if (r0 == null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02dc, code lost:
    
        r14 = r0.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02e3, code lost:
    
        if (r0 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02e5, code lost:
    
        r15 = r0.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02ec, code lost:
    
        r3 = new com.vk.catalog2.common.dto.ui.UIBlockTopshelf.TopshelfImage(r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02f1, code lost:
    
        if (r0 == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02f3, code lost:
    
        r15 = r0.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02fa, code lost:
    
        if (r0 == null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02fc, code lost:
    
        r23 = r2;
        r2 = r0.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0309, code lost:
    
        r14 = new com.vk.catalog2.common.dto.ui.UIBlockTopshelf.TopshelfTrackCodes(r15, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x030e, code lost:
    
        if (r0 == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0310, code lost:
    
        r15 = r0.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0317, code lost:
    
        if (r0 == null) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0319, code lost:
    
        r21 = r3;
        r3 = r0.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0326, code lost:
    
        r2 = new com.vk.catalog2.common.dto.ui.UIBlockTopshelf.TopshelfTrailer(r15, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x032b, code lost:
    
        if (r19 == null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x032d, code lost:
    
        r15 = r19.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0334, code lost:
    
        if (r19 == null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0336, code lost:
    
        r26 = r2;
        r2 = r19.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0343, code lost:
    
        if (r19 == null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0345, code lost:
    
        r16 = r19.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0349, code lost:
    
        if (r16 == null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x034b, code lost:
    
        r18 = r4;
        r4 = xsna.j5g.O0(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x035a, code lost:
    
        r3 = new com.vk.catalog2.common.dto.ui.UIBlockTopshelf.TopshelfMeta(r15, r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x035d, code lost:
    
        if (r13 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x035f, code lost:
    
        r17 = J0(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0363, code lost:
    
        r0 = new com.vk.catalog2.common.dto.ui.UIBlockTopshelf.TopshelfKids(r10, new com.vk.catalog2.common.dto.ui.UIBlockTopshelf.a(r21, r14, r23, r3, r17, r26), r1.o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0356, code lost:
    
        r18 = r4;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x033f, code lost:
    
        r26 = r2;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0332, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0322, code lost:
    
        r21 = r3;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0315, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0305, code lost:
    
        r23 = r2;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02f8, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02ea, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02e1, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02cd, code lost:
    
        if (r2.equals("child_profile") == false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0428 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r18v10, types: [com.vk.catalog2.common.dto.ui.UIBlockTopshelf$TopshelfPlaylist] */
    /* JADX WARN: Type inference failed for: r20v2, types: [com.vk.catalog2.common.dto.ui.UIBlockTopshelf$TopshelfLive] */
    /* JADX WARN: Type inference failed for: r20v4, types: [com.vk.catalog2.common.dto.ui.UIBlockTopshelf$TopshelfVideo] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.vk.catalog2.common.dto.ui.UIBlockTopshelf$TopshelfNews] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List E0(CatalogBlock catalogBlock, ArrayList arrayList, bi20 bi20Var) {
        String str;
        CatalogViewType catalogViewType;
        UIBlockTopshelf.TopshelfKids topshelfKids;
        UIBlockTopshelf.TopshelfTexts topshelfTexts;
        List list;
        List<String> g2;
        TopshelfItem.TopshelfMeta topshelfMeta;
        String str2;
        String str3;
        VideoFile videoFile;
        String str4;
        UIBlockTopshelf.TopshelfTexts topshelfTexts2;
        List list2;
        List<String> g3;
        UIBlockTopshelf.TopshelfKids topshelfKids2;
        String str5;
        String str6;
        VideoFile videoFile2;
        String str7;
        UIBlockTopshelf.TopshelfTexts topshelfTexts3;
        List list3;
        List<String> g4;
        UIBlockTopshelf.TopshelfTexts topshelfTexts4;
        Long l2;
        String str8;
        String str9;
        UIBlockTopshelf.TopshelfTrackCodes topshelfTrackCodes;
        String str10;
        List list4;
        List<String> g5;
        String string = bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h());
        TopshelfViewStyle.Style.Companion.getClass();
        TopshelfViewStyle topshelfViewStyle = new TopshelfViewStyle(TopshelfViewStyle.Style.a.a(string));
        String str11 = catalogBlock.b;
        CatalogLayout catalogLayout = catalogBlock.i;
        CatalogViewType catalogViewType2 = catalogLayout.b;
        CatalogDataType catalogDataType = catalogBlock.c;
        String str12 = catalogBlock.d;
        UserId userId = catalogLayout.c;
        List<String> list5 = catalogBlock.l;
        EmptySet emptySet = EmptySet.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TopshelfItem topshelfItem = (TopshelfItem) it.next();
            String str13 = topshelfItem.c;
            String str14 = topshelfItem.b;
            TopshelfItem.TopshelfLiveInfo topshelfLiveInfo = topshelfItem.i;
            String str15 = topshelfItem.k;
            String str16 = topshelfItem.j;
            Iterator it2 = it;
            TopshelfItem.TopshelfTrailer topshelfTrailer = topshelfItem.l;
            TopshelfItem.TopshelfTrackCodes topshelfTrackCodes2 = topshelfItem.g;
            TopshelfItem.TopshelfImage topshelfImage = topshelfItem.f;
            TopshelfItem.TopshelfMeta topshelfMeta2 = topshelfItem.h;
            UIBlockTopshelf.TopshelfLiveInfo topshelfLiveInfo2 = null;
            if (str13 != null) {
                switch (str13.hashCode()) {
                    case -1804124500:
                        str = str11;
                        catalogViewType = catalogViewType2;
                        if (str13.equals("monotheme_news")) {
                            ClipVideoFile clipVideoFile = topshelfItem.e;
                            UIBlockTopshelf.TopshelfTexts topshelfTexts5 = new UIBlockTopshelf.TopshelfTexts(str16, str15);
                            UIBlockTopshelf.TopshelfImage topshelfImage2 = new UIBlockTopshelf.TopshelfImage(topshelfImage != null ? topshelfImage.g() : null, topshelfImage != null ? topshelfImage.d() : null);
                            UIBlockTopshelf.TopshelfTrackCodes topshelfTrackCodes3 = new UIBlockTopshelf.TopshelfTrackCodes(topshelfTrackCodes2 != null ? topshelfTrackCodes2.d() : null, topshelfTrackCodes2 != null ? topshelfTrackCodes2.g() : null);
                            String h2 = topshelfMeta2 != null ? topshelfMeta2.h() : null;
                            String d2 = topshelfMeta2 != null ? topshelfMeta2.d() : null;
                            if (topshelfMeta2 == null || (g2 = topshelfMeta2.g()) == null) {
                                topshelfTexts = topshelfTexts5;
                                list = null;
                            } else {
                                topshelfTexts = topshelfTexts5;
                                list = j5g.O0(g2);
                            }
                            topshelfKids = new UIBlockTopshelf.TopshelfNews(clipVideoFile, str14, new UIBlockTopshelf.a(topshelfImage2, topshelfTrackCodes3, topshelfTexts, new UIBlockTopshelf.TopshelfMeta(h2, d2, list), topshelfLiveInfo != null ? J0(topshelfLiveInfo) : null, new UIBlockTopshelf.TopshelfTrailer(topshelfTrailer != null ? topshelfTrailer.g() : null, topshelfTrailer != null ? topshelfTrailer.d() : null)));
                            break;
                        }
                        topshelfKids = null;
                        break;
                    case -495367802:
                        topshelfMeta = topshelfMeta2;
                        str = str11;
                        break;
                    case -384255919:
                        topshelfMeta = topshelfMeta2;
                        str = str11;
                        break;
                    case 3322092:
                        str = str11;
                        if (str13.equals("live")) {
                            String str17 = topshelfItem.b;
                            VideoFile videoFile3 = topshelfItem.d;
                            UIBlockTopshelf.TopshelfTexts topshelfTexts6 = new UIBlockTopshelf.TopshelfTexts(str16, str15);
                            UIBlockTopshelf.TopshelfImage topshelfImage3 = new UIBlockTopshelf.TopshelfImage(topshelfImage != null ? topshelfImage.g() : null, topshelfImage != null ? topshelfImage.d() : null);
                            String d3 = topshelfTrackCodes2 != null ? topshelfTrackCodes2.d() : null;
                            if (topshelfTrackCodes2 != null) {
                                str2 = str17;
                                str3 = topshelfTrackCodes2.g();
                            } else {
                                str2 = str17;
                                str3 = null;
                            }
                            UIBlockTopshelf.TopshelfTrackCodes topshelfTrackCodes4 = new UIBlockTopshelf.TopshelfTrackCodes(d3, str3);
                            String h3 = topshelfMeta2 != null ? topshelfMeta2.h() : null;
                            if (topshelfMeta2 != null) {
                                videoFile = videoFile3;
                                str4 = topshelfMeta2.d();
                            } else {
                                videoFile = videoFile3;
                                str4 = null;
                            }
                            if (topshelfMeta2 == null || (g3 = topshelfMeta2.g()) == null) {
                                topshelfTexts2 = topshelfTexts6;
                                list2 = null;
                            } else {
                                topshelfTexts2 = topshelfTexts6;
                                list2 = j5g.O0(g3);
                            }
                            topshelfKids2 = new UIBlockTopshelf.TopshelfLive(str2, videoFile, new UIBlockTopshelf.a(topshelfImage3, topshelfTrackCodes4, topshelfTexts2, new UIBlockTopshelf.TopshelfMeta(h3, str4, list2), topshelfLiveInfo != null ? J0(topshelfLiveInfo) : null, new UIBlockTopshelf.TopshelfTrailer(topshelfTrailer != null ? topshelfTrailer.g() : null, topshelfTrailer != null ? topshelfTrailer.d() : null)), topshelfItem.m, topshelfItem.n);
                            catalogViewType = catalogViewType2;
                            topshelfKids = topshelfKids2;
                            break;
                        }
                        catalogViewType = catalogViewType2;
                        topshelfKids = null;
                        break;
                    case 112202875:
                        str = str11;
                        if (str13.equals("video")) {
                            String str18 = topshelfItem.b;
                            VideoFile videoFile4 = topshelfItem.d;
                            UIBlockTopshelf.TopshelfTexts topshelfTexts7 = new UIBlockTopshelf.TopshelfTexts(str16, str15);
                            UIBlockTopshelf.TopshelfImage topshelfImage4 = new UIBlockTopshelf.TopshelfImage(topshelfImage != null ? topshelfImage.g() : null, topshelfImage != null ? topshelfImage.d() : null);
                            String d4 = topshelfTrackCodes2 != null ? topshelfTrackCodes2.d() : null;
                            if (topshelfTrackCodes2 != null) {
                                str5 = str18;
                                str6 = topshelfTrackCodes2.g();
                            } else {
                                str5 = str18;
                                str6 = null;
                            }
                            UIBlockTopshelf.TopshelfTrackCodes topshelfTrackCodes5 = new UIBlockTopshelf.TopshelfTrackCodes(d4, str6);
                            String h4 = topshelfMeta2 != null ? topshelfMeta2.h() : null;
                            if (topshelfMeta2 != null) {
                                videoFile2 = videoFile4;
                                str7 = topshelfMeta2.d();
                            } else {
                                videoFile2 = videoFile4;
                                str7 = null;
                            }
                            if (topshelfMeta2 == null || (g4 = topshelfMeta2.g()) == null) {
                                topshelfTexts3 = topshelfTexts7;
                                list3 = null;
                            } else {
                                topshelfTexts3 = topshelfTexts7;
                                list3 = j5g.O0(g4);
                            }
                            topshelfKids2 = new UIBlockTopshelf.TopshelfVideo(str5, videoFile2, new UIBlockTopshelf.a(topshelfImage4, topshelfTrackCodes5, topshelfTexts3, new UIBlockTopshelf.TopshelfMeta(h4, str7, list3), topshelfLiveInfo != null ? J0(topshelfLiveInfo) : null, new UIBlockTopshelf.TopshelfTrailer(topshelfTrailer != null ? topshelfTrailer.g() : null, topshelfTrailer != null ? topshelfTrailer.d() : null)), topshelfItem.m, topshelfItem.n);
                            catalogViewType = catalogViewType2;
                            topshelfKids = topshelfKids2;
                            break;
                        }
                        catalogViewType = catalogViewType2;
                        topshelfKids = null;
                        break;
                    case 1879474642:
                        if (str13.equals("playlist")) {
                            String str19 = topshelfItem.b;
                            VideoFile videoFile5 = topshelfItem.d;
                            UIBlockTopshelf.TopshelfTexts topshelfTexts8 = new UIBlockTopshelf.TopshelfTexts(str16, str15);
                            String g6 = topshelfImage != null ? topshelfImage.g() : null;
                            if (topshelfImage != null) {
                                topshelfTexts4 = topshelfTexts8;
                                l2 = topshelfImage.d();
                            } else {
                                topshelfTexts4 = topshelfTexts8;
                                l2 = null;
                            }
                            UIBlockTopshelf.TopshelfImage topshelfImage5 = new UIBlockTopshelf.TopshelfImage(g6, l2);
                            String d5 = topshelfTrackCodes2 != null ? topshelfTrackCodes2.d() : null;
                            if (topshelfTrackCodes2 != null) {
                                str8 = str19;
                                str9 = topshelfTrackCodes2.g();
                            } else {
                                str8 = str19;
                                str9 = null;
                            }
                            UIBlockTopshelf.TopshelfTrackCodes topshelfTrackCodes6 = new UIBlockTopshelf.TopshelfTrackCodes(d5, str9);
                            String h5 = topshelfMeta2 != null ? topshelfMeta2.h() : null;
                            if (topshelfMeta2 != null) {
                                topshelfTrackCodes = topshelfTrackCodes6;
                                str10 = topshelfMeta2.d();
                            } else {
                                topshelfTrackCodes = topshelfTrackCodes6;
                                str10 = null;
                            }
                            if (topshelfMeta2 == null || (g5 = topshelfMeta2.g()) == null) {
                                str = str11;
                                list4 = null;
                            } else {
                                str = str11;
                                list4 = j5g.O0(g5);
                            }
                            topshelfKids = new UIBlockTopshelf.TopshelfPlaylist(str8, videoFile5, new UIBlockTopshelf.a(topshelfImage5, topshelfTrackCodes, topshelfTexts4, new UIBlockTopshelf.TopshelfMeta(h5, str10, list4), topshelfLiveInfo != null ? J0(topshelfLiveInfo) : null, new UIBlockTopshelf.TopshelfTrailer(topshelfTrailer != null ? topshelfTrailer.g() : null, topshelfTrailer != null ? topshelfTrailer.d() : null)), topshelfItem.m, topshelfItem.n);
                            catalogViewType = catalogViewType2;
                            break;
                        }
                        break;
                    default:
                        str = str11;
                        catalogViewType = catalogViewType2;
                        topshelfKids = null;
                        break;
                }
                if (topshelfKids == null) {
                    arrayList2.add(topshelfKids);
                }
                it = it2;
                catalogViewType2 = catalogViewType;
                str11 = str;
            }
            str = str11;
            catalogViewType = catalogViewType2;
            topshelfKids = null;
            if (topshelfKids == null) {
            }
            it = it2;
            catalogViewType2 = catalogViewType;
            str11 = str;
        }
        return Collections.singletonList(new UIBlockTopshelf(str11, catalogViewType2, catalogDataType, str12, userId, list5, emptySet, null, topshelfViewStyle, arrayList2));
    }

    public static UIBlockGroup F(bi20 bi20Var, Group group, GroupCatalogItem groupCatalogItem, String str, String str2, CatalogViewType catalogViewType) {
        String string = bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h());
        VideoCatalogViewStyle videoCatalogViewStyle = string != null ? new VideoCatalogViewStyle(string) : null;
        return new UIBlockGroup(bi20Var.a, catalogViewType, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, group, groupCatalogItem, false, null, str, str2, videoCatalogViewStyle != null ? videoCatalogViewStyle : null, 2048, null);
    }

    public static UIBlockGroup G(bi20 bi20Var, Group group, GroupCatalogItem groupCatalogItem, int i2) {
        if ((i2 & 4) != 0) {
            groupCatalogItem = null;
        }
        return F(bi20Var, group, groupCatalogItem, null, BuildConfig.FLAVOR, bi20Var.d);
    }

    public static List G0(bi20 bi20Var, CatalogBlock catalogBlock, ArrayList arrayList, CatalogExtendedData catalogExtendedData) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UserProfile userProfile = catalogExtendedData.Gb(((CatalogUserMeta) it.next()).c).a;
            if (userProfile != null) {
                arrayList2.add(userProfile);
            }
        }
        return Collections.singletonList(new UIBlockProfilesList(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, arrayList, arrayList2, catalogBlock.k, catalogBlock.h));
    }

    public static UIBlockGroupChat H(bi20 bi20Var, GroupChat groupChat) {
        return new UIBlockGroupChat(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, groupChat);
    }

    public static UIBlockPlaceholder I(bi20 bi20Var, CatalogStateInfo catalogStateInfo) {
        return new UIBlockPlaceholder(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, catalogStateInfo.b, catalogStateInfo.c, catalogStateInfo.d, catalogStateInfo.e, catalogStateInfo.f, catalogStateInfo.m, null, EmptyList.b, catalogStateInfo.i, catalogStateInfo.l, catalogStateInfo.n, catalogStateInfo.o, catalogStateInfo.p, catalogStateInfo.q, null, bi20Var.u, null, null, 50331648, null);
    }

    public static UIBlockQuestionnaire I0(bi20 bi20Var, QuestionnaireDto questionnaireDto) {
        InternalNpsQuestions a2 = rjx.a(questionnaireDto);
        QuestionRootLayoutDto questionRootLayoutDto = questionnaireDto.d;
        return new UIBlockQuestionnaire(bi20Var.a, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, a2, questionRootLayoutDto != null ? new QuestionsTexts(questionRootLayoutDto.b, questionRootLayoutDto.c, questionRootLayoutDto.d, questionRootLayoutDto.e) : null);
    }

    public static UIBlockTopshelf.TopshelfLiveInfo J0(TopshelfItem.TopshelfLiveInfo topshelfLiveInfo) {
        ArrayList arrayList;
        List<TopshelfItem.TopshelfLiveInfo.Icon> d2;
        String d3;
        String h2;
        List<TopshelfItem.TopshelfLiveInfo.Info> d4 = topshelfLiveInfo.d();
        ArrayList arrayList2 = null;
        if (d4 != null) {
            List<TopshelfItem.TopshelfLiveInfo.Info> list = d4;
            ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
            for (TopshelfItem.TopshelfLiveInfo.Info info : list) {
                if (info == null || (d2 = info.d()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    for (TopshelfItem.TopshelfLiveInfo.Icon icon : d2) {
                        arrayList.add(new UIBlockTopshelf.TopshelfLiveInfo.Icon(icon != null ? icon.g() : null, (icon == null || (h2 = icon.h()) == null) ? null : arm0.m(10, h2), (icon == null || (d3 = icon.d()) == null) ? null : arm0.m(10, d3)));
                    }
                }
                arrayList3.add(new UIBlockTopshelf.TopshelfLiveInfo.Info(info != null ? info.g() : null, arrayList));
            }
            arrayList2 = arrayList3;
        }
        return new UIBlockTopshelf.TopshelfLiveInfo(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0119 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static UIBlockVideo K0(bi20 bi20Var, VideoFile videoFile, CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData) {
        CatalogViewStyle verticalVideoCatalogViewStyle;
        CatalogViewStyle catalogViewStyle;
        CatalogViewType catalogViewType;
        Iterator<T> it;
        Object obj;
        List<String> list;
        Iterator<T> it2;
        Object obj2;
        UserId userId;
        String P;
        CatalogViewType catalogViewType2 = bi20Var.d;
        boolean d8 = videoFile.d8();
        Bundle bundle = bi20Var.p;
        CatalogCustomAttributes$Keys catalogCustomAttributes$Keys = CatalogCustomAttributes$Keys.STYLE;
        String string = bundle.getString(catalogCustomAttributes$Keys.h());
        if (catalogViewType2 == CatalogViewType.SLIDER_WITH_VERTICAL_VIDEOS) {
            verticalVideoCatalogViewStyle = new VerticalVideoCatalogViewStyle(string);
        } else if (catalogViewType2 == CatalogViewType.FLOOR_CLIPS || catalogViewType2 == CatalogViewType.CAROUSEL_CLIPS || catalogViewType2 == CatalogViewType.CAROUSEL_CLIPS_WITH_SUBSCRIPTIONS || catalogViewType2 == CatalogViewType.SEARCH_FLOOR_CLIPS || catalogViewType2 == CatalogViewType.SEARCH_CAROUSEL_CLIPS) {
            verticalVideoCatalogViewStyle = new VerticalVideoCatalogViewStyle(catalogBlock.i.h.getString(catalogCustomAttributes$Keys.h()));
        } else {
            if (catalogViewType2 != CatalogViewType.SLIDER && !fxc0.B().J().F1()) {
                catalogViewStyle = null;
                catalogViewType = CatalogViewType.LARGE_LIST;
                if (catalogViewType2 != catalogViewType) {
                    float E0 = videoFile.E0();
                    if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= E0 && E0 <= 0.9f) {
                        catalogViewType2 = d8 ? CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5 : CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5_NO_AUTOPLAY;
                    } else if (0.9f <= E0 && E0 <= 1.1f) {
                        catalogViewType2 = d8 ? CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1 : CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1_NO_AUTOPLAY;
                    } else if (!d8) {
                        catalogViewType2 = CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_LARGE_LIST_NO_AUTOPLAY;
                    }
                    if (epx.f(bundle.getString(catalogCustomAttributes$Keys.h()), CatalogCustomAttributes$Values.FIT.h()) && !e43.l(catalogViewType, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_LARGE_LIST_NO_AUTOPLAY).contains(catalogViewType2)) {
                        catalogViewType2 = CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_FIT;
                    }
                    if (videoFile.W9()) {
                        catalogViewType2 = CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_INTERACTIVE;
                    }
                } else if (catalogViewType2 == CatalogViewType.VIDEO_SLIDER && videoFile.W9()) {
                    catalogViewType2 = CatalogViewType.SYNTHETIC_VIDEO_SLIDER_INTERACTIVE;
                }
                CatalogViewType catalogViewType3 = catalogViewType2;
                UIBlockVideo.ItemViewContentDescription itemViewContentDescription = (videoFile.C2() || (P = videoFile.P()) == null) ? null : new UIBlockVideo.ItemViewContentDescription(R.string.catalog_accessibility_clip_author, (List<String>) Collections.singletonList(P));
                List<CatalogPinnedVideoInfo> list2 = catalogBlock.v;
                String str = catalogBlock.g;
                it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((CatalogPinnedVideoInfo) obj).b, videoFile.a1())) {
                        break;
                    }
                }
                CatalogPinnedVideoInfo catalogPinnedVideoInfo = (CatalogPinnedVideoInfo) obj;
                VideoPinType videoPinType = catalogPinnedVideoInfo == null ? catalogPinnedVideoInfo.c : null;
                String str2 = bi20Var.a;
                CatalogDataType catalogDataType = bi20Var.c;
                String x8 = videoFile.x8();
                UserId userId2 = bi20Var.e;
                List<String> list3 = bi20Var.j;
                Set<UIBlockDragDropAction> set = bi20Var.m;
                UIBlockHint uIBlockHint = bi20Var.o;
                String a2 = cqm0.a(bi20Var.f);
                String str3 = bi20Var.n;
                boolean z = str == null && drm0.D(str, "history", false);
                boolean j0 = videoFile.j0();
                boolean z2 = str == null && drm0.D(str, "my/liked", false);
                String str4 = str != null ? "" : str;
                boolean z3 = str == null && drm0.D(str, "my/bookmarks", false);
                boolean f2 = epx.f(catalogBlock.i.h.getString(TtmlNode.TAG_STYLE), "with_episodes");
                CatalogVideo catalogVideo = catalogExtendedData.f.get(videoFile.a1());
                list = catalogVideo == null ? catalogVideo.b : null;
                if (list == null) {
                    list = EmptyList.b;
                }
                List<String> list4 = list;
                ShowcaseListItem showcaseListItem = catalogExtendedData.h.get(videoFile.a1());
                List<CatalogBlockAnchorInfo> list5 = bi20Var.x;
                it2 = catalogExtendedData.p0.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    UxPollData uxPollData = (UxPollData) obj2;
                    Long l2 = uxPollData.c;
                    long o0 = videoFile.o0();
                    if (l2 != null && l2.longValue() == o0) {
                        Long l3 = uxPollData.b;
                        Owner s = videoFile.s();
                        if (epx.f(l3, (s == null || (userId = s.b) == null) ? null : Long.valueOf(userId.b))) {
                            break;
                        }
                    }
                }
                UxPollData uxPollData2 = (UxPollData) obj2;
                return new UIBlockVideo(str2, catalogViewType3, catalogDataType, x8, userId2, list3, set, uIBlockHint, new UIBlockVideo.a(a2, videoFile, str3, z, j0, z2, str4, itemViewContentDescription, z3, f2, list4, showcaseListItem, list5, videoPinType, uxPollData2 == null ? new UIBlockVideo.DynamicPollData(uxPollData2.d) : null), catalogViewStyle);
            }
            verticalVideoCatalogViewStyle = new VideoCatalogViewStyle(string);
        }
        catalogViewStyle = verticalVideoCatalogViewStyle;
        catalogViewType = CatalogViewType.LARGE_LIST;
        if (catalogViewType2 != catalogViewType) {
        }
        CatalogViewType catalogViewType32 = catalogViewType2;
        if (videoFile.C2()) {
        }
        List<CatalogPinnedVideoInfo> list22 = catalogBlock.v;
        String str5 = catalogBlock.g;
        it = list22.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        CatalogPinnedVideoInfo catalogPinnedVideoInfo2 = (CatalogPinnedVideoInfo) obj;
        if (catalogPinnedVideoInfo2 == null) {
        }
        String str22 = bi20Var.a;
        CatalogDataType catalogDataType2 = bi20Var.c;
        String x82 = videoFile.x8();
        UserId userId22 = bi20Var.e;
        List<String> list32 = bi20Var.j;
        Set<UIBlockDragDropAction> set2 = bi20Var.m;
        UIBlockHint uIBlockHint2 = bi20Var.o;
        String a22 = cqm0.a(bi20Var.f);
        String str32 = bi20Var.n;
        if (str5 == null) {
        }
        boolean j02 = videoFile.j0();
        if (str5 == null) {
        }
        if (str5 != null) {
        }
        if (str5 == null) {
        }
        boolean f22 = epx.f(catalogBlock.i.h.getString(TtmlNode.TAG_STYLE), "with_episodes");
        CatalogVideo catalogVideo2 = catalogExtendedData.f.get(videoFile.a1());
        if (catalogVideo2 == null) {
        }
        if (list == null) {
        }
        List<String> list42 = list;
        ShowcaseListItem showcaseListItem2 = catalogExtendedData.h.get(videoFile.a1());
        List<CatalogBlockAnchorInfo> list52 = bi20Var.x;
        it2 = catalogExtendedData.p0.iterator();
        while (true) {
            if (it2.hasNext()) {
            }
        }
        UxPollData uxPollData22 = (UxPollData) obj2;
        return new UIBlockVideo(str22, catalogViewType32, catalogDataType2, x82, userId22, list32, set2, uIBlockHint2, new UIBlockVideo.a(a22, videoFile, str32, z, j02, z2, str4, itemViewContentDescription, z3, f22, list42, showcaseListItem2, list52, videoPinType, uxPollData22 == null ? new UIBlockVideo.DynamicPollData(uxPollData22.d) : null), catalogViewStyle);
    }

    public static UIBlockBanner M(bi20 bi20Var, CatalogLink catalogLink) {
        return new UIBlockBanner(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, catalogLink.zb());
    }

    public static UiBlockSimpleVkMix M0(bi20 bi20Var, CatalogAudioStreamMix catalogAudioStreamMix) {
        String string = bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h());
        VkMixViewStyle.Style.Companion.getClass();
        com.vk.catalog2.common.dto.api.ui.a aVar = new com.vk.catalog2.common.dto.api.ui.a(bi20Var.a, bi20Var.b, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, new VkMixViewStyle(VkMixViewStyle.Style.a.a(string)), bi20Var.r, (CatalogLaunchOrigin) null, 5120);
        String str = catalogAudioStreamMix.b;
        boolean z = catalogAudioStreamMix.h;
        String str2 = catalogAudioStreamMix.c;
        AudioStreamMixTitles audioStreamMixTitles = catalogAudioStreamMix.f;
        String str3 = catalogAudioStreamMix.d;
        String str4 = catalogAudioStreamMix.g;
        UiBlockMusicVkMixStyle.Companion.getClass();
        return new UiBlockSimpleVkMix(aVar, str, z, str2, audioStreamMixTitles, str3, str4, UiBlockMusicVkMixStyle.a.a(string));
    }

    public static UIBlockLink N(bi20 bi20Var, CatalogLink catalogLink) {
        return new UIBlockLink(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, bi20Var.b, catalogLink, null, bi20Var.u);
    }

    public static UIBlockLink O(bi20 bi20Var, CatalogLink catalogLink) {
        String string = bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h());
        LinkListViewStyle.Style.Companion.getClass();
        return new UIBlockLink(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, bi20Var.b, catalogLink, new LinkListViewStyle(LinkListViewStyle.Style.a.a(string)), bi20Var.u);
    }

    public static UIBlockLink P(bi20 bi20Var, CatalogLink catalogLink) {
        LinkSliderViewStyle.Style.a aVar = LinkSliderViewStyle.Style.Companion;
        String string = bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h());
        aVar.getClass();
        return new UIBlockLink(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, bi20Var.b, catalogLink, new LinkSliderViewStyle(LinkSliderViewStyle.Style.a.a(string)), bi20Var.u);
    }

    public static ArrayList P0(CatalogExtendedData catalogExtendedData, CatalogBlock catalogBlock, bi20 bi20Var) {
        UserId userId;
        List<String> list;
        ArrayList Gb = catalogBlock.Gb(catalogExtendedData);
        ArrayList arrayList = new ArrayList();
        Iterator it = Gb.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Playlist playlist = next instanceof Playlist ? (Playlist) next : null;
            if (playlist != null) {
                arrayList.add(playlist);
            }
        }
        Map<String, ArtistsIdsList> map = catalogBlock.m.m;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Playlist playlist2 = (Playlist) it2.next();
            PlaylistLink playlistLink = playlist2.f;
            if (playlistLink == null || (userId = playlistLink.c) == null) {
                userId = playlist2.c;
            }
            rba Gb2 = catalogExtendedData.Gb(fkq0.a(userId));
            UserProfile userProfile = Gb2.a;
            Group group = Gb2.b;
            ArtistsIdsList artistsIdsList = map.get(playlist2.Ib());
            ArrayList Bb = (artistsIdsList == null || (list = artistsIdsList.b) == null) ? null : catalogExtendedData.Bb(list);
            playlist2.q = userProfile != null ? new PlaylistOwner(userProfile) : group != null ? new PlaylistOwner(group) : null;
            arrayList2.add(new UIBlockMusicPlaylist(bi20Var.b(), playlist2, null, null, null, null, false, arrayList.size() == 1, null, Bb, 380, null));
        }
        return arrayList2;
    }

    public static UIBlockVideoCategory Q(bi20 bi20Var, LiveCategory liveCategory) {
        return new UIBlockVideoCategory(new com.vk.catalog2.common.dto.api.ui.a(bi20Var.a, bi20Var.b, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7680), liveCategory, null, 4, null);
    }

    public static UIBlockGroupsMapPreview R(CatalogBlock catalogBlock, ArrayList arrayList, bi20 bi20Var) {
        return new UIBlockGroupsMapPreview(arrayList, new com.vk.catalog2.common.dto.api.ui.a(bi20Var.a, bi20Var.b, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7680), catalogBlock.k);
    }

    public static ArrayList S(CatalogExtendedData catalogExtendedData, CatalogBlock catalogBlock, bi20 bi20Var) {
        ArrayList Gb = catalogBlock.Gb(catalogExtendedData);
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
            if (catalogExtendedData.Ab(CatalogDataType.DATA_TYPE_GROUPS, ((CatalogMarketGroupInfo) next2).c.b) != null) {
                arrayList2.add(next2);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            CatalogMarketGroupInfo catalogMarketGroupInfo = (CatalogMarketGroupInfo) it3.next();
            com.vk.catalog2.common.dto.api.ui.a b2 = bi20Var.b();
            Group group = (Group) catalogExtendedData.Ab(CatalogDataType.DATA_TYPE_GROUPS, catalogMarketGroupInfo.c.b);
            List<CatalogLink> list = catalogMarketGroupInfo.e;
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                Good good = (Good) catalogExtendedData.Ab(CatalogDataType.DATA_TYPE_CATALOG_MARKET_ITEMS, ((CatalogLink) it4.next()).b);
                if (good != null) {
                    arrayList4.add(good);
                }
            }
            arrayList3.add(new UIBlockMarketGroupInfoItem(b2, catalogMarketGroupInfo, group, arrayList4, catalogBlock.k));
        }
        return arrayList3;
    }

    public static /* synthetic */ List T0(w060 w060Var, CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, List list) {
        return w060Var.S0(catalogBlock, catalogExtendedData, list, null);
    }

    public static UIBlockMusicAggregatedUpdate U(bi20 bi20Var, AudioFollowingsUpdateInfo audioFollowingsUpdateInfo, UIBlockAction uIBlockAction) {
        return new UIBlockMusicAggregatedUpdate(bi20Var.b(), audioFollowingsUpdateInfo, uIBlockAction);
    }

    public static UIBlockMusicArtist V(bi20 bi20Var, Artist artist, UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock, String str) {
        ArrayList arrayList = new ArrayList(bi20Var.j);
        arrayList.add("artist_subscribe");
        arrayList.add("artist_unsubscribe");
        return new UIBlockMusicArtist(new com.vk.catalog2.common.dto.api.ui.a(bi20Var.a, bi20Var.b, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, arrayList, bi20Var.m, (UIBlockHint) null, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, bi20Var.u, 3840), bi20Var.o, artist, uIBlockActionPlayAudiosFromBlock, str);
    }

    public static UIBlockMusicCurator W(bi20 bi20Var, Curator curator, UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock) {
        return new UIBlockMusicCurator(new com.vk.catalog2.common.dto.api.ui.a(bi20Var.a, bi20Var.b, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, (UIBlockHint) null, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7936), bi20Var.o, curator, uIBlockActionPlayAudiosFromBlock);
    }

    public static UIBlockMusicPlaylistUpdate X(bi20 bi20Var, AudioFollowingsUpdateItem audioFollowingsUpdateItem) {
        return new UIBlockMusicPlaylistUpdate(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, audioFollowingsUpdateItem);
    }

    public static UIBlockMusicPlaylist Y(bi20 bi20Var, Playlist playlist, RecommendedPlaylist recommendedPlaylist) {
        return new UIBlockMusicPlaylist(com.vk.catalog2.common.dto.api.ui.a.a(bi20Var.b(), null, null, null, null, null, new MusicRecommendedPlaylistViewStyle(bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h())), 7679), playlist, recommendedPlaylist.d, recommendedPlaylist.e, recommendedPlaylist.h, recommendedPlaylist.i, recommendedPlaylist.j, false, recommendedPlaylist.k, null, 640, null);
    }

    public static UIBlockMusicSpecial Z(bi20 bi20Var, List list, UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock, UIBlockActionOpenSection uIBlockActionOpenSection) {
        return new UIBlockMusicSpecial(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, list, bi20Var.f, bi20Var.g, uIBlockActionPlayAudiosFromBlock, uIBlockActionOpenSection);
    }

    public static UIBlockMusicTrack a0(bi20 bi20Var, MusicTrack musicTrack, MusicTrackCatalogViewStyle musicTrackCatalogViewStyle, String str) {
        com.vk.catalog2.common.dto.api.ui.a a2 = com.vk.catalog2.common.dto.api.ui.a.a(bi20Var.b(), null, null, null, null, null, musicTrackCatalogViewStyle, 7679);
        String str2 = bi20Var.n;
        if (str == null) {
            str = "";
        }
        return new UIBlockMusicTrack(a2, musicTrack, str2, str, null, bi20Var.s, bi20Var.y, null, 144, null);
    }

    public static /* synthetic */ UIBlockMusicTrack b0(bi20 bi20Var, MusicTrack musicTrack, MusicTrackCatalogViewStyle musicTrackCatalogViewStyle, int i2) {
        if ((i2 & 4) != 0) {
            musicTrackCatalogViewStyle = null;
        }
        return a0(bi20Var, musicTrack, musicTrackCatalogViewStyle, null);
    }

    public static List c0(bi20 bi20Var, CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, boolean z) {
        ArrayList arrayList;
        String str;
        List<CatalogMarketCategoryContext> list;
        List<CatalogMarketCategoryMappings> list2 = catalogExtendedData.N;
        ArrayList Gb = catalogBlock.Gb(catalogExtendedData);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = Gb.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof CatalogNavigationTab) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (true) {
            CatalogClassifiedYoulaCity catalogClassifiedYoulaCity = null;
            if (!it2.hasNext()) {
                break;
            }
            CatalogNavigationTab catalogNavigationTab = (CatalogNavigationTab) it2.next();
            CatalogMarketFilter catalogMarketFilter = catalogNavigationTab.k;
            if (catalogMarketFilter == null || (list = catalogMarketFilter.g) == null) {
                arrayList = new ArrayList();
            } else {
                ArrayList arrayList4 = new ArrayList();
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    Integer num = ((CatalogMarketCategoryContext) it3.next()).c;
                    if (num != null) {
                        arrayList4.add(num);
                    }
                }
                arrayList = new ArrayList(arrayList4);
            }
            Integer num2 = catalogNavigationTab.i;
            if (num2 != null) {
                arrayList.add(Integer.valueOf(num2.intValue()));
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                int intValue = ((Number) it4.next()).intValue();
                CatalogMarketCategory catalogMarketCategory = catalogExtendedData.M.get(String.valueOf(intValue));
                Pair pair = catalogMarketCategory != null ? new Pair(Integer.valueOf(intValue), catalogMarketCategory) : null;
                if (pair != null) {
                    arrayList5.add(pair);
                }
            }
            Map s = pn00.s(arrayList5);
            CatalogMarketFilter catalogMarketFilter2 = catalogNavigationTab.k;
            if (catalogMarketFilter2 != null && (str = catalogMarketFilter2.f) != null) {
                catalogClassifiedYoulaCity = catalogExtendedData.L.get(str);
            }
            arrayList3.add(new UIBlockNavigationTab(!z ? bi20Var.b() : bi20Var.c(CatalogViewType.BUTTON), catalogNavigationTab, s, list2, catalogClassifiedYoulaCity));
        }
        return !z ? arrayList3 : Collections.singletonList(l0(bi20Var, arrayList3, null, 12));
    }

    public static /* synthetic */ List d0(CatalogExtendedData catalogExtendedData, CatalogBlock catalogBlock, bi20 bi20Var) {
        return c0(bi20Var, catalogBlock, catalogExtendedData, false);
    }

    public static UIBlockOfflineSyncPlaceholder e0(bi20 bi20Var, CatalogStateInfo catalogStateInfo) {
        return new UIBlockOfflineSyncPlaceholder(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, catalogStateInfo.b, catalogStateInfo.c, catalogStateInfo.f, catalogStateInfo.l, new PlaceholderCatalogViewStyle(bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h())), bi20Var.u);
    }

    public static UIBlockPlaceholder f0(bi20 bi20Var) {
        PlaceholderCatalogViewStyle placeholderCatalogViewStyle = new PlaceholderCatalogViewStyle(bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h()));
        String str = bi20Var.a;
        CatalogViewType catalogViewType = bi20Var.d;
        CatalogDataType catalogDataType = bi20Var.c;
        String str2 = bi20Var.k;
        UserId userId = bi20Var.e;
        List<String> list = bi20Var.j;
        Set<UIBlockDragDropAction> set = bi20Var.m;
        UIBlockHint uIBlockHint = bi20Var.o;
        String str3 = bi20Var.f;
        return new UIBlockPlaceholder(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, str, str3, null, null, str3, bi20Var.g, null, bi20Var.l, null, null, null, null, null, null, placeholderCatalogViewStyle, bi20Var.u, bi20Var.w, null, 33554432, null);
    }

    public static CatalogDataType g(CatalogStateInfo catalogStateInfo) {
        CatalogBannerImageMode catalogBannerImageMode = catalogStateInfo.i;
        switch (catalogBannerImageMode == null ? -1 : b.$EnumSwitchMapping$3[catalogBannerImageMode.ordinal()]) {
            case -1:
            case 5:
            case 6:
                return CatalogDataType.DATA_TYPE_CATALOG_BANNERS_CENTER_ALIGNED;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return CatalogDataType.DATA_TYPE_CATALOG_BANNERS_ALIGNED_TO_IMAGE;
            case 2:
            case 3:
            case 4:
                return CatalogDataType.DATA_TYPE_CATALOG_BANNERS_TOP_ALIGNED;
            case 7:
                return CatalogDataType.DATA_TYPE_CATALOG_BANNERS_ROUNDED_SMALL_IMAGE;
        }
    }

    public static UIBlockPodcastItem h0(bi20 bi20Var, Podcast podcast, PodcastSliderViewStyle podcastSliderViewStyle) {
        return new UIBlockPodcastItem(new com.vk.catalog2.common.dto.api.ui.a(bi20Var.a, bi20Var.b, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, podcastSliderViewStyle, (CatalogOnboardingInfo) null, bi20Var.u, 3072), podcast);
    }

    public static VideoFile i(VideoFile videoFile, CatalogBlockStatInfo.CatalogItemStatInfo catalogItemStatInfo) {
        if (catalogItemStatInfo == null) {
            return videoFile;
        }
        VideoFileOld copy = videoFile.copy();
        copy.W = catalogItemStatInfo.b;
        return copy;
    }

    public static UIBlockPreview i0(bi20 bi20Var, ArrayList arrayList, List list) {
        return new UIBlockPreview(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, bi20Var.f, bi20Var.g, arrayList, list);
    }

    public static ArrayList j(CatalogExtendedData catalogExtendedData, List list, bi20 bi20Var) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GroupCatalogItem groupCatalogItem = (GroupCatalogItem) it.next();
                Object Ab = catalogExtendedData.Ab(CatalogDataType.DATA_TYPE_GROUPS, String.valueOf(groupCatalogItem.b));
                Group group = Ab instanceof Group ? (Group) Ab : null;
                if (group != null) {
                    arrayList.add(G(bi20Var, group, groupCatalogItem, 56));
                }
            }
        }
        return arrayList;
    }

    public static void k(VideoFile videoFile, CatalogExtendedData catalogExtendedData) {
        UserId[] userIdArr;
        VideoNotificationsStatus videoNotificationsStatus;
        String str;
        UserId userId;
        List<Artist> list;
        Artist artist;
        Long l2;
        boolean Y0 = fxc0.B().J().Y0();
        Owner owner = null;
        if (Y0) {
            MusicVideoFile musicVideoFile = videoFile instanceof MusicVideoFile ? (MusicVideoFile) videoFile : null;
            if (musicVideoFile == null || (list = musicVideoFile.B1) == null || (artist = (Artist) j5g.a0(list)) == null || (l2 = artist.l) == null) {
                userId = UserId.d;
            } else {
                long longValue = l2.longValue();
                gzs<s3q0> gzsVar = fkq0.a;
                userId = new UserId(longValue);
            }
            userIdArr = new UserId[]{videoFile.getUid(), videoFile.I0(), userId};
        } else {
            userIdArr = new UserId[]{videoFile.getUid(), videoFile.I0()};
        }
        rba Gb = catalogExtendedData.Gb((UserId[]) Arrays.copyOf(userIdArr, userIdArr.length));
        UserProfile userProfile = Gb.a;
        Group group = Gb.b;
        if (group != null && (str = group.k0) != null) {
            VideoNotificationsStatus[] values = VideoNotificationsStatus.values();
            int length = values.length;
            for (int i2 = 0; i2 < length; i2++) {
                videoNotificationsStatus = values[i2];
                if (epx.f(videoNotificationsStatus.i(), str)) {
                    break;
                }
            }
        }
        videoNotificationsStatus = null;
        if (videoNotificationsStatus != null) {
            videoFile.J6(videoNotificationsStatus);
        }
        if (!(videoFile instanceof MusicVideoFile) || Y0) {
            if (userProfile != null) {
                owner = userProfile.l0();
            } else if (group != null) {
                owner = tsj.a(group);
            }
            videoFile.f1(owner);
        }
    }

    public static UIBlockSeparator k0(bi20 bi20Var, CatalogBlock catalogBlock) {
        Object obj = bi20Var.p.get(CatalogCustomAttributes$Keys.STYLE.h());
        return new UIBlockSeparator(epx.f(obj, CatalogCustomAttributes$Values.THIN.h()) ? bi20Var.c(CatalogViewType.SYNTHETIC_SEPARATOR_THIN) : epx.f(obj, CatalogCustomAttributes$Values.ISLAND.h()) ? bi20Var.c(CatalogViewType.SYNTHETIC_SEPARATOR_ISLAND) : epx.f(obj, CatalogCustomAttributes$Values.TRANSPARENT.h()) ? bi20Var.c(CatalogViewType.SYNTHETIC_SEPARATOR_TRANSPARENT) : epx.f(obj, CatalogCustomAttributes$Values.ISLAND_TRANSPARENT.h()) ? bi20Var.c(CatalogViewType.SYNTHETIC_SEPARATOR_ISLAND_TRANSPARENT) : epx.f(obj, CatalogCustomAttributes$Values.OVERLAP.h()) ? bi20Var.c(CatalogViewType.SYNTHETIC_SEPARATOR_OVERLAP) : bi20Var.b(), catalogBlock.i.i);
    }

    public static List l(ArrayList arrayList, CatalogExtendedData catalogExtendedData, CatalogBlock catalogBlock, bi20 bi20Var, int i2) {
        if (catalogBlock.i.b != CatalogViewType.DOUBLE_STACKED_LIST_MINIMALISTIC_CARD) {
            return arrayList;
        }
        List<String> list = catalogBlock.m.j;
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                e43.t();
                throw null;
            }
            CatalogDataType catalogDataType = CatalogDataType.DATA_TYPE_GROUPS_COLLECTION;
            Iterator it2 = it;
            UIBlockGroupsCollection w0 = w0(bi20Var, catalogBlock, catalogExtendedData, (GroupCollection) catalogExtendedData.Ab(catalogDataType, (String) next), new com.vk.catalog2.common.dto.api.ui.a(bi20Var.a, bi20Var.b, CatalogViewType.DOUBLE_STACKED_LIST_MINIMALISTIC_CARD, catalogDataType, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7680));
            int i5 = w0.I;
            if (i5 >= 0 && i5 <= i2) {
                arrayList2.add(i5 + i3, w0);
            }
            it = it2;
            i3 = i4;
        }
        return arrayList2;
    }

    public static UIBlockButtons l0(bi20 bi20Var, List list, CatalogViewType catalogViewType, int i2) {
        if ((i2 & 4) != 0) {
            catalogViewType = bi20Var.d;
        }
        return new UIBlockButtons(bi20Var.a, catalogViewType, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, list, null);
    }

    public static List m(ArrayList arrayList, bi20 bi20Var) {
        List<UIBlockAction> list = bi20Var.l;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof UIBlockActionExpandBlock) {
                arrayList2.add(obj);
            }
        }
        UIBlockActionExpandBlock uIBlockActionExpandBlock = (UIBlockActionExpandBlock) j5g.a0(arrayList2);
        if (uIBlockActionExpandBlock == null) {
            return arrayList;
        }
        int i2 = uIBlockActionExpandBlock.B;
        if (!bi20Var.d.n() || i2 >= arrayList.size()) {
            return arrayList;
        }
        List H0 = j5g.H0(arrayList, i2);
        return j5g.u0(Collections.singletonList(uIBlockActionExpandBlock.Rb(j5g.S(arrayList, i2))), H0);
    }

    public static UIBlockBanner m0(bi20 bi20Var, Banner banner) {
        return new UIBlockBanner(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, banner);
    }

    public static ArrayList n(List list, bi20 bi20Var) {
        List list2 = list;
        List<UIBlockAction> list3 = bi20Var.l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list3) {
            UIBlockAction uIBlockAction = (UIBlockAction) obj;
            if ((uIBlockAction instanceof UIBlockActionOpenSection) && uIBlockAction.d.m()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((UIBlockActionOpenSection) ((UIBlockAction) it.next())).Rb(CatalogDataType.DATA_TYPE_ACTION));
        }
        return j5g.u0(arrayList2, list2);
    }

    public static UIBlockSticker n0(bi20 bi20Var, StickerStockItemWithStickerId stickerStockItemWithStickerId) {
        return new UIBlockSticker(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, stickerStockItemWithStickerId);
    }

    public static ArrayList o(ArrayList arrayList, bi20 bi20Var) {
        List<UIBlockAction> list = bi20Var.l;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            UIBlockAction uIBlockAction = (UIBlockAction) obj;
            if ((uIBlockAction instanceof UIBlockActionOpenUrl) && uIBlockAction.d == CatalogViewType.SYNTHETIC_ACTION_OPEN_URL_BOTTOM) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((UIBlockActionOpenUrl) ((UIBlockAction) it.next())).Sb(CatalogDataType.DATA_TYPE_ACTION, CatalogViewType.SYNTHETIC_ACTION_OPEN_URL));
        }
        return j5g.u0(arrayList3, arrayList);
    }

    public static UIBlockStickerPreview o0(bi20 bi20Var, StickerPackPreviewWithStickerId stickerPackPreviewWithStickerId) {
        return new UIBlockStickerPreview(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, stickerPackPreviewWithStickerId);
    }

    public static ArrayList p(ArrayList arrayList, bi20 bi20Var) {
        List<UIBlockAction> list = bi20Var.l;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            UIBlockAction uIBlockAction = (UIBlockAction) obj;
            if ((uIBlockAction instanceof UIBlockActionOpenUrl) && uIBlockAction.d == CatalogViewType.SYNTHETIC_ACTION_OPEN_URL_SLIDER) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            UIBlockActionOpenUrl uIBlockActionOpenUrl = (UIBlockActionOpenUrl) ((UIBlockAction) it.next());
            CatalogDataType catalogDataType = CatalogDataType.DATA_TYPE_ACTION;
            Serializer.c<UIBlockActionOpenUrl> cVar = UIBlockActionOpenUrl.CREATOR;
            arrayList3.add(uIBlockActionOpenUrl.Sb(catalogDataType, null));
        }
        return j5g.u0(arrayList3, arrayList);
    }

    public static UIBlockStickerPack p0(bi20 bi20Var, StickerStockItem stickerStockItem) {
        return new UIBlockStickerPack(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, stickerStockItem);
    }

    public static ArrayList q(CatalogViewType catalogViewType, String str, String str2, String str3, List list, bi20 bi20Var) {
        bi20 bi20Var2 = bi20Var;
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            String str4 = bi20Var2.a + '_' + i2;
            CatalogDataType catalogDataType = bi20Var2.c;
            String str5 = bi20Var2.k;
            UserId userId = bi20Var2.e;
            List<String> list3 = bi20Var2.j;
            Set<UIBlockDragDropAction> set = bi20Var2.m;
            UIBlockHint uIBlockHint = bi20Var2.o;
            String str6 = bi20Var2.b;
            CatalogActionFilterStyle.Style.a aVar = CatalogActionFilterStyle.Style.Companion;
            String string = bi20Var2.p.getString(CatalogCustomAttributes$Keys.STYLE.h());
            aVar.getClass();
            arrayList.add(new UIBlockActionFilter(str4, catalogViewType, catalogDataType, str5, userId, list3, set, uIBlockHint, str2, (CatalogFilterData) obj, str3, str6, new CatalogActionFilterStyle(CatalogActionFilterStyle.Style.a.a(string)), str));
            bi20Var2 = bi20Var;
            i2 = i3;
        }
        return arrayList;
    }

    public static UIBlockStickerPackPreview q0(bi20 bi20Var, StickerPackPreview stickerPackPreview) {
        return new UIBlockStickerPackPreview(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, stickerPackPreview);
    }

    public static ArrayList r(w060 w060Var, bi20 bi20Var, CatalogButtonFilters catalogButtonFilters, String str, CatalogViewType catalogViewType, String str2, int i2) {
        CatalogViewType catalogViewType2 = (i2 & 8) != 0 ? bi20Var.d : catalogViewType;
        String str3 = (i2 & 16) != 0 ? null : str2;
        String str4 = catalogButtonFilters.c;
        List list = catalogButtonFilters.g;
        if (list == null) {
            list = EmptyList.b;
        } else if (str3 != null && drm0.D(str3, "/sport", false)) {
            ArrayList arrayList = new ArrayList(list);
            arrayList.add(new CatalogFilterData(new String(), new String(), "info_circle", false, null, null, null, null, CatalogFilterData.FromType.CUSTOM, 224, null));
            list = arrayList;
        }
        return q(catalogViewType2, str4, catalogButtonFilters.i, str, list, bi20Var);
    }

    public static UIBlockStickersBonusBalance r0(bi20 bi20Var, StickersBonusBalance stickersBonusBalance) {
        return new UIBlockStickersBonusBalance(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, stickersBonusBalance);
    }

    public static UIBlockActionOpenUrl s(bi20 bi20Var, CatalogViewType catalogViewType, String str, ActionOpenUrl actionOpenUrl, String str2, String str3, String str4, String str5, String str6) {
        return new UIBlockActionOpenUrl(com.vk.catalog2.common.dto.api.ui.a.a(bi20Var.c(catalogViewType), null, null, null, null, UserId.d, null, 8159), str2, str6 == null ? bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h()) : str6, str, actionOpenUrl, str4, str3, str5);
    }

    public static UIBlockActionTextButton u(bi20 bi20Var, CatalogViewType catalogViewType, UserId userId, String str, String str2) {
        return new UIBlockActionTextButton(new com.vk.catalog2.common.dto.api.ui.a(bi20Var.a, bi20Var.b, catalogViewType, bi20Var.c, bi20Var.k, userId, bi20Var.j, bi20Var.m, bi20Var.o, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7680), str2, str, bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h()));
    }

    public static UIBlockPlayMixAction u0(bi20 bi20Var, CatalogViewType catalogViewType, CatalogButtonPlayMix catalogButtonPlayMix) {
        return new UIBlockPlayMixAction(com.vk.catalog2.common.dto.api.ui.a.a(bi20Var.c(catalogViewType), null, null, null, null, UserId.d, null, 8159), catalogButtonPlayMix.h, catalogButtonPlayMix.i, catalogButtonPlayMix.j, catalogButtonPlayMix.k, catalogButtonPlayMix.o, new UIBlockPlayMixAction.a(catalogButtonPlayMix.l, catalogButtonPlayMix.m, catalogButtonPlayMix.f, catalogButtonPlayMix.g, bi20Var.i), bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h()));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static UIBlockVideoAlbum v(bi20 bi20Var, VideoAlbum videoAlbum, rba rbaVar, Map map) {
        String str;
        String str2;
        Image image;
        Image image2;
        VerifyInfo verifyInfo;
        VerifyInfo verifyInfo2;
        com.vk.catalog2.common.dto.api.ui.a aVar = new com.vk.catalog2.common.dto.api.ui.a(bi20Var.a, bi20Var.b, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, new VideoAlbumCatalogViewStyle(bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h())), (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7168);
        List<UIBlockAction> list = bi20Var.l;
        boolean containsKey = map.containsKey(videoAlbum.zb());
        UserProfile userProfile = rbaVar.a;
        Group group = rbaVar.b;
        if (userProfile == null || (str2 = userProfile.e) == null) {
            if (group == null) {
                str = null;
                if (userProfile != null || (image2 = userProfile.O) == null) {
                    if (group != null) {
                        image = null;
                        if (userProfile != null || (verifyInfo2 = userProfile.B) == null) {
                            verifyInfo = group != null ? group.y : null;
                        } else {
                            verifyInfo = verifyInfo2;
                        }
                        return new UIBlockVideoAlbum(aVar, videoAlbum, list, containsKey, str, image, verifyInfo, group == null ? group.n0 : userProfile != null ? userProfile.Y : false);
                    }
                    image2 = group.g;
                }
                image = image2;
                if (userProfile != null) {
                }
                verifyInfo = group != null ? group.y : null;
                return new UIBlockVideoAlbum(aVar, videoAlbum, list, containsKey, str, image, verifyInfo, group == null ? group.n0 : userProfile != null ? userProfile.Y : false);
            }
            str2 = group.d;
        }
        str = str2;
        if (userProfile != null) {
        }
        if (group != null) {
        }
    }

    public static UIBlockApp w(bi20 bi20Var, ApiApplication apiApplication) {
        return new UIBlockApp(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, apiApplication, null);
    }

    public static UIBlockGroupsCollection w0(bi20 bi20Var, CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, GroupCollection groupCollection, com.vk.catalog2.common.dto.api.ui.a aVar) {
        Object zb = catalogBlock.m.zb(groupCollection.b);
        GroupsEntityCatalogItem groupsEntityCatalogItem = zb instanceof GroupsEntityCatalogItem ? (GroupsEntityCatalogItem) zb : null;
        if (groupsEntityCatalogItem != null) {
            return new UIBlockGroupsCollection(bi20Var.b(), groupCollection, j(catalogExtendedData, groupsEntityCatalogItem.c, bi20Var));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = groupCollection.i.iterator();
        while (it.hasNext()) {
            Object zb2 = catalogBlock.m.zb(Long.valueOf(((Number) it.next()).longValue()));
            GroupCatalogItem groupCatalogItem = zb2 instanceof GroupCatalogItem ? (GroupCatalogItem) zb2 : null;
            Object Ab = groupCatalogItem != null ? catalogExtendedData.Ab(CatalogDataType.DATA_TYPE_GROUPS, String.valueOf(groupCatalogItem.b)) : null;
            Group group = Ab instanceof Group ? (Group) Ab : null;
            if (group != null) {
                arrayList.add(G(bi20Var, group, groupCatalogItem, 56));
            }
        }
        return new UIBlockGroupsCollection(aVar, groupCollection, arrayList);
    }

    public static UIBlockArtistBio x(bi20 bi20Var, Artist artist) {
        ArrayList arrayList = new ArrayList(bi20Var.j);
        arrayList.add("artist_subscribe");
        arrayList.add("artist_unsubscribe");
        return new UIBlockArtistBio(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, arrayList, bi20Var.m, artist, bi20Var.u, null, null, null, 3584, null);
    }

    public static /* synthetic */ UIBlockGroupsCollection x0(bi20 bi20Var, CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, GroupCollection groupCollection) {
        return w0(bi20Var, catalogBlock, catalogExtendedData, groupCollection, bi20Var.b());
    }

    public static UIBlockPlaceholder y(bi20 bi20Var, CatalogStateInfo catalogStateInfo) {
        return new UIBlockPlaceholder(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, catalogStateInfo.b, catalogStateInfo.c, catalogStateInfo.d, catalogStateInfo.e, catalogStateInfo.f, catalogStateInfo.m, null, EmptyList.b, catalogStateInfo.i, catalogStateInfo.l, catalogStateInfo.n, catalogStateInfo.o, catalogStateInfo.p, catalogStateInfo.q, null, bi20Var.u, null, null, 50331648, null);
    }

    public static UIBlockAudioContentCard z(bi20 bi20Var, CatalogAudioContentCard catalogAudioContentCard, CatalogExtendedData catalogExtendedData) {
        List<UIBlockAction> list = bi20Var.l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof UIBlockActionOpenUrl) {
                arrayList.add(obj);
            }
        }
        UIBlockActionOpenUrl uIBlockActionOpenUrl = (UIBlockActionOpenUrl) j5g.a0(arrayList);
        CatalogAudioContentCard.EntityType entityType = catalogAudioContentCard.b;
        int i2 = entityType == null ? -1 : b.$EnumSwitchMapping$5[entityType.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                Podcast podcast = catalogExtendedData.R.get(catalogAudioContentCard.Ab());
                if (podcast != null) {
                    return new UIBlockAudioContentCard.PodcastCard(catalogAudioContentCard, uIBlockActionOpenUrl, podcast, bi20Var.b());
                }
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                AudioBook audioBook = catalogExtendedData.W.get(catalogAudioContentCard.c);
                if (audioBook != null) {
                    com.vk.catalog2.common.dto.api.ui.a b2 = bi20Var.b();
                    qh4 a2 = k840.a.a();
                    bpn0 bpn0Var = o25.a;
                    a2.B(((b25) (bpn0Var != null ? bpn0Var : null).getValue()).c(), audioBook);
                    return new UIBlockAudioContentCard.AudioBookCard(catalogAudioContentCard, uIBlockActionOpenUrl, audioBook, b2);
                }
            }
        }
        return null;
    }

    public final UIBlockList B(List list, bi20 bi20Var) {
        return B0(this, bi20Var, list, EmptyList.b, null, null, bi20Var.c, null, false, null, false, null, null, 1048504);
    }

    public final ArrayList D0(CatalogExtendedData catalogExtendedData, CatalogBlock catalogBlock, bi20 bi20Var) {
        Object obj;
        Object obj2 = null;
        if (b.$EnumSwitchMapping$0[catalogBlock.i.b.ordinal()] != 4) {
            ArrayList Gb = catalogBlock.Gb(catalogExtendedData);
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
                arrayList2.add(new UIBlockSearchFilter(bi20Var.b(), searchFilterItem2.b, searchFilterItem2.c, searchFilterItem2.e, searchFilterItem2.d));
            }
            return arrayList2;
        }
        ArrayList O0 = O0(catalogExtendedData, catalogBlock.j, bi20Var);
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = O0.iterator();
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
        ArrayList Gb2 = catalogBlock.Gb(catalogExtendedData);
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
            arrayList6.add(Boolean.valueOf(arrayList3.add(new UIBlockSearchQuickFilter(bi20Var.b(), searchQuickFilterItem.b, searchQuickFilterItem, searchQuickFilterItem.e))));
        }
        Iterator it7 = O0.iterator();
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

    public final UIBlockChips E(bi20 bi20Var, ArrayList arrayList, CatalogExtendedData catalogExtendedData) {
        return new UIBlockChips(bi20Var.b(), bi20Var.f, bi20Var.g, O0(catalogExtendedData, arrayList, bi20Var));
    }

    public final List F0(ArrayList arrayList, bi20 bi20Var) {
        String string = bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h());
        DoubleListViewStyle.Style.Companion.getClass();
        return Collections.singletonList(B0(this, bi20Var, arrayList, EmptyList.b, null, null, null, null, false, null, false, new DoubleListViewStyle(DoubleListViewStyle.Style.a.a(string)), null, 786424));
    }

    public final List H0(CatalogExtendedData catalogExtendedData, CatalogBlock catalogBlock, bi20 bi20Var) {
        Object obj;
        Iterator it = O0(catalogExtendedData, catalogBlock.j, bi20Var).iterator();
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
        return Collections.singletonList(new UIBlockLogout(bi20Var.b(), catalogBlock.b, uIBlockActionLogout, bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h())));
    }

    public final UIBlockHint J(bi20 bi20Var, CatalogHint catalogHint, CatalogExtendedData catalogExtendedData) {
        return new UIBlockHint(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, EmptySet.b, catalogHint.b, catalogHint.c, catalogHint.d, catalogHint.e, catalogHint.f, O0(catalogExtendedData, catalogHint.g, bi20Var), catalogHint.h);
    }

    public final UIBlock K(List list, bi20 bi20Var) {
        CatalogViewType catalogViewType = bi20Var.d;
        CatalogDataType catalogDataType = bi20Var.c;
        if (catalogDataType == CatalogDataType.DATA_TYPE_GROUPS_CATEGORY_ITEMS && catalogViewType == CatalogViewType.TRIPLE_STACKED_SLIDER) {
            return B0(this, bi20Var, list, EmptyList.b, null, CatalogViewType.SYNTHETIC_STAGGERED_TRIPLE_STACKED_SLIDER, CatalogDataType.DATA_SYNTHETIC_SECTION, null, false, null, false, null, null, 1048472);
        }
        boolean z = false;
        boolean z2 = catalogDataType == CatalogDataType.DATA_TYPE_ACTION && catalogViewType == CatalogViewType.SLIDER;
        if (z2 && ((j5g.a0(list) instanceof UIBlockFilter2D) || (j5g.a0(list) instanceof UIBlockButtons))) {
            return (UIBlock) j5g.Y(list);
        }
        List<UIBlock> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (UIBlock uIBlock : list2) {
                if (!(uIBlock instanceof UIBlockActionOpenSection) || uIBlock.d != CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION_CHIP) {
                    break;
                }
            }
        }
        z = true;
        if (z2 && z) {
            return B0(this, bi20Var, list, EmptyList.b, null, null, CatalogDataType.DATA_SYNTHETIC_SECTION, null, false, null, false, null, null, 1048504);
        }
        List<UIBlockAction> list3 = bi20Var.l;
        CatalogDataType catalogDataType2 = CatalogDataType.DATA_SYNTHETIC_SECTION;
        String string = bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h());
        CatalogSliderViewStyle catalogSliderViewStyle = null;
        if (string != null && fxc0.B().J().C1()) {
            catalogSliderViewStyle = new CatalogSliderViewStyle(string);
        }
        return B0(this, bi20Var, list, list3, null, null, catalogDataType2, null, false, null, false, catalogSliderViewStyle, null, 786360);
    }

    public final List L(CatalogExtendedData catalogExtendedData, CatalogBlock catalogBlock, bi20 bi20Var) {
        String str = (String) j5g.a0(catalogBlock.m.j);
        if (str == null) {
            str = "";
        }
        CatalogStateInfo catalogStateInfo = (CatalogStateInfo) catalogExtendedData.Fb().get(str);
        UIBlockPlaceholder g0 = catalogStateInfo != null ? g0(bi20Var, catalogStateInfo, catalogExtendedData) : null;
        ArrayList Gb = catalogBlock.Gb(catalogExtendedData);
        VkMixInteractiveViewStyle.Style style = catalogBlock.m.c.size() == 1 ? VkMixInteractiveViewStyle.Style.STATIC : VkMixInteractiveViewStyle.Style.Default;
        ArrayList arrayList = new ArrayList();
        Iterator it = Gb.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            CatalogAudioStreamMix catalogAudioStreamMix = next instanceof CatalogAudioStreamMix ? (CatalogAudioStreamMix) next : null;
            if (catalogAudioStreamMix != null) {
                arrayList.add(catalogAudioStreamMix);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            CatalogAudioStreamMix catalogAudioStreamMix2 = (CatalogAudioStreamMix) it2.next();
            arrayList2.add(new UiBlockInteractiveVkMix(com.vk.catalog2.common.dto.api.ui.a.a(bi20Var.b(), null, null, null, null, null, new VkMixInteractiveViewStyle(style), 7679), catalogAudioStreamMix2.b, catalogAudioStreamMix2.f, catalogAudioStreamMix2.g, catalogAudioStreamMix2.e, catalogAudioStreamMix2.h, g0));
        }
        return Collections.singletonList(B0(this, bi20Var, arrayList2, EmptyList.b, null, null, null, null, false, null, false, new VkMixInteractiveViewStyle(style), null, 786424));
    }

    public final UIBlockTitleSubtitleAvatar L0(VideoAlbum videoAlbum, rba rbaVar, bi20 bi20Var) {
        Group group = rbaVar.b;
        UserProfile userProfile = rbaVar.a;
        com.vk.catalog2.common.dto.api.ui.a aVar = new com.vk.catalog2.common.dto.api.ui.a(bi20Var.a, bi20Var.b, bi20Var.d, bi20Var.c, bi20Var.k, videoAlbum.c, bi20Var.j, bi20Var.m, bi20Var.o, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7680);
        String str = videoAlbum.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        Integer valueOf = Integer.valueOf(videoAlbum.m);
        Image image = null;
        if (!epx.f(videoAlbum.c, this.b.c())) {
            if (userProfile != null) {
                image = userProfile.O;
            } else if (group != null) {
                image = group.g;
            }
        }
        return new UIBlockTitleSubtitleAvatar(aVar, new UIBlockTitleSubtitleAvatar.a(str2, null, null, valueOf, image, videoAlbum.Gb(), videoAlbum.zb(), group != null ? group.n0 : userProfile != null ? userProfile.Y : false, videoAlbum.n));
    }

    public List<UIBlock> N0(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, boolean z) {
        List<UIBlock> S0 = S0(catalogBlock, catalogExtendedData, EmptyList.b, null);
        return (z && catalogBlock.i.b.j()) ? Collections.singletonList(K(S0, e(catalogBlock, catalogExtendedData))) : S0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:0x04d6, code lost:
    
        if (r0.equals("select_sorting") == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x04e0, code lost:
    
        r8 = com.vk.catalog2.common.dto.api.CatalogDataType.DATA_TYPE_ACTION;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x04dd, code lost:
    
        if (r0.equals("friends_sort_modes") == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x05fd, code lost:
    
        if (r6 == null) goto L239;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0d12  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0d15 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList O0(CatalogExtendedData catalogExtendedData, List list, bi20 bi20Var) {
        bi20 bi20Var2;
        UIBlockHint uIBlockHint;
        Iterator it;
        Serializer.StreamParcelableAdapter uIBlockActionOpenInfoPopup;
        Serializer.StreamParcelableAdapter uIBlockActionOpenQoeSurvey;
        Serializer.StreamParcelableAdapter uIBlockActionGoToAuthor;
        Serializer.StreamParcelableAdapter uIBlockActionIconButton;
        UserId userId;
        UserId userId2;
        Serializer.StreamParcelableAdapter uIBlockActionShowFilters;
        ArrayList arrayList;
        ImageSize imageSize;
        ArrayList arrayList2;
        CatalogHint Cb;
        w060 w060Var = this;
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            CatalogButton catalogButton = (CatalogButton) it2.next();
            String zb = catalogButton.zb();
            if (zb == null || (Cb = catalogExtendedData.Cb(zb)) == null) {
                bi20Var2 = bi20Var;
                uIBlockHint = null;
            } else {
                bi20Var2 = bi20Var;
                uIBlockHint = w060Var.J(bi20Var2, Cb, catalogExtendedData);
            }
            bi20 a2 = bi20.a(bi20Var2, null, null, null, null, uIBlockHint, null, 33538047);
            Bundle bundle = a2.p;
            CatalogViewType catalogViewType = a2.d;
            CatalogDataType catalogDataType = a2.c;
            UserId userId3 = a2.e;
            if (catalogButton instanceof CatalogButtonLogin) {
                CatalogButtonLogin catalogButtonLogin = (CatalogButtonLogin) catalogButton;
                uIBlockActionOpenInfoPopup = u(a2, CatalogViewType.SYNTHETIC_ACTION_LOGIN, UserId.d, catalogButtonLogin.e, catalogButtonLogin.f);
            } else if (catalogButton instanceof CatalogButtonLogout) {
                CatalogButtonLogout catalogButtonLogout = (CatalogButtonLogout) catalogButton;
                uIBlockActionOpenInfoPopup = new UIBlockActionLogout(a2.b(), catalogButtonLogout.g, catalogButtonLogout.e);
            } else {
                if (catalogButton instanceof CatalogButtonUploadVideo) {
                    CatalogButtonUploadVideo catalogButtonUploadVideo = (CatalogButtonUploadVideo) catalogButton;
                    it = it2;
                    uIBlockActionOpenInfoPopup = new UiBlockActionUploadVideoButton(new com.vk.catalog2.common.dto.api.ui.a(a2.a, a2.b, epx.f(catalogButtonUploadVideo.c, "upload_clip") ? CatalogViewType.SYNTHETIC_ACTION_UPLOAD_CLIP : CatalogViewType.SYNTHETIC_ACTION_UPLOAD_VIDEO, a2.c, a2.k, catalogButtonUploadVideo.f, a2.j, a2.m, a2.o, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7680), catalogButtonUploadVideo.g, catalogButtonUploadVideo.e, catalogButtonUploadVideo.h, bundle.getString(CatalogCustomAttributes$Keys.STYLE.h()));
                } else {
                    it = it2;
                    if (catalogButton instanceof CatalogButtonCreateVideoAlbum) {
                        CatalogButtonCreateVideoAlbum catalogButtonCreateVideoAlbum = (CatalogButtonCreateVideoAlbum) catalogButton;
                        uIBlockActionOpenInfoPopup = u(a2, CatalogViewType.SYNTHETIC_ACTION_CREATE_ALBUM, catalogButtonCreateVideoAlbum.f, catalogButtonCreateVideoAlbum.e, catalogButtonCreateVideoAlbum.g);
                    } else {
                        if (catalogButton instanceof CatalogButtonPlayAudioFromBlock) {
                            CatalogButtonPlayAudioFromBlock catalogButtonPlayAudioFromBlock = (CatalogButtonPlayAudioFromBlock) catalogButton;
                            CatalogViewType catalogViewType2 = catalogButtonPlayAudioFromBlock.h ? CatalogViewType.SYNTHETIC_ACTION_PLAY_SHUFFLED_AUDIO_FROM_BLOCK : CatalogViewType.SYNTHETIC_ACTION_PLAY_AUDIO_FROM_BLOCK;
                            String str = catalogButtonPlayAudioFromBlock.f;
                            if (str != null) {
                                boolean z = catalogViewType2 == CatalogViewType.SYNTHETIC_ACTION_PLAY_SHUFFLED_AUDIO_FROM_BLOCK;
                                List<String> list2 = catalogButtonPlayAudioFromBlock.g;
                                if (list2 != null) {
                                    ArrayList arrayList4 = new ArrayList();
                                    Iterator<T> it3 = list2.iterator();
                                    while (it3.hasNext()) {
                                        Object Ab = catalogExtendedData.Ab(CatalogDataType.DATA_TYPE_MUSIC_TRACKS, (String) it3.next());
                                        MusicTrack musicTrack = Ab instanceof MusicTrack ? (MusicTrack) Ab : null;
                                        if (musicTrack != null) {
                                            arrayList4.add(musicTrack);
                                        }
                                    }
                                    arrayList2 = arrayList4;
                                } else {
                                    arrayList2 = null;
                                }
                                uIBlockActionOpenQoeSurvey = new UIBlockActionPlayAudiosFromBlock(a2.a, catalogViewType2, CatalogDataType.DATA_TYPE_ACTION, a2.k, a2.e, a2.j, a2.m, a2.o, catalogButtonPlayAudioFromBlock.i, str, catalogButtonPlayAudioFromBlock.e, z, arrayList2, a2.s, a2.u);
                                uIBlockActionOpenInfoPopup = uIBlockActionOpenQoeSurvey;
                            }
                            uIBlockActionOpenInfoPopup = null;
                        } else {
                            if (catalogButton instanceof CatalogButtonSaveAsPlaylist) {
                                CatalogViewType catalogViewType3 = CatalogViewType.SYNTHETIC_ACTION_SAVE_AS_PLAYLIST;
                                CatalogButtonSaveAsPlaylist catalogButtonSaveAsPlaylist = (CatalogButtonSaveAsPlaylist) catalogButton;
                                String str2 = catalogButtonSaveAsPlaylist.f;
                                if (str2 != null) {
                                    uIBlockActionOpenQoeSurvey = new UIBlockActionSaveAsPlaylistFromBlock(com.vk.catalog2.common.dto.api.ui.a.a(a2.b(), null, null, null, null, null, (w060Var.c && epx.f(catalogButtonSaveAsPlaylist.c, "my_music_filter_save_as_playlist")) ? new SavePlaylistViewStyle(SavePlaylistViewStyle.Style.MyMusic) : null, 7679), catalogViewType3, catalogButtonSaveAsPlaylist.i, str2, catalogButtonSaveAsPlaylist.e, catalogButtonSaveAsPlaylist.h, catalogButtonSaveAsPlaylist.j);
                                }
                                uIBlockActionOpenInfoPopup = null;
                            } else if (catalogButton instanceof CatalogButtonCreatePlaylist) {
                                CatalogButtonCreatePlaylist catalogButtonCreatePlaylist = (CatalogButtonCreatePlaylist) catalogButton;
                                uIBlockActionOpenInfoPopup = u(a2, CatalogViewType.SYNTHETIC_ACTION_CREATE_PLAYLIST, catalogButtonCreatePlaylist.f, catalogButtonCreatePlaylist.e, catalogButtonCreatePlaylist.g);
                            } else {
                                if (catalogButton instanceof CatalogButtonOpenQr) {
                                    uIBlockActionOpenInfoPopup = u(a2, CatalogViewType.SYNTHETIC_ACTION_SCAN_QR, UserId.d, "", ((CatalogButtonOpenQr) catalogButton).e);
                                } else if (catalogButton instanceof CatalogButtonOpenGroupsAdvertisement) {
                                    CatalogButtonOpenGroupsAdvertisement catalogButtonOpenGroupsAdvertisement = (CatalogButtonOpenGroupsAdvertisement) catalogButton;
                                    uIBlockActionOpenInfoPopup = s(a2, CatalogViewType.SYNTHETIC_ACTION_ADV_URL, catalogButtonOpenGroupsAdvertisement.e, catalogButtonOpenGroupsAdvertisement.g, catalogButtonOpenGroupsAdvertisement.h, catalogButtonOpenGroupsAdvertisement.i, null, null, null);
                                } else if (catalogButton instanceof CatalogButtonOpenUrl) {
                                    CatalogButtonOpenUrl catalogButtonOpenUrl = (CatalogButtonOpenUrl) catalogButton;
                                    String str3 = catalogButtonOpenUrl.c;
                                    uIBlockActionOpenInfoPopup = s(a2, epx.f(str3, "open_url_slider_cell") ? CatalogViewType.SYNTHETIC_ACTION_OPEN_URL_SLIDER : epx.f(str3, "open_url_bottom_button") ? CatalogViewType.SYNTHETIC_ACTION_OPEN_URL_BOTTOM : CatalogViewType.SYNTHETIC_ACTION_OPEN_URL, catalogButtonOpenUrl.e, catalogButtonOpenUrl.f, catalogButtonOpenUrl.g, catalogButtonOpenUrl.i, catalogButtonOpenUrl.h, catalogButtonOpenUrl.j, catalogButtonOpenUrl.k);
                                } else if (catalogButton instanceof CatalogButtonAddFriend) {
                                    CatalogButtonAddFriend catalogButtonAddFriend = (CatalogButtonAddFriend) catalogButton;
                                    uIBlockActionOpenInfoPopup = u(a2, CatalogViewType.SYNTHETIC_ACTION_ADD_FRIEND, UserId.d, catalogButtonAddFriend.e, catalogButtonAddFriend.f);
                                } else if (catalogButton instanceof CatalogButtonRemoveFriend) {
                                    uIBlockActionOpenInfoPopup = u(a2, CatalogViewType.SYNTHETIC_ACTION_REMOVE_FRIEND, UserId.d, "", ((CatalogButtonRemoveFriend) catalogButton).g);
                                } else if (catalogButton instanceof CatalogButtonAddFriends) {
                                    uIBlockActionOpenInfoPopup = u(a2, CatalogViewType.SYNTHETIC_ACTION_ADD_FRIENDS, UserId.d, "", ((CatalogButtonAddFriends) catalogButton).e);
                                } else if (catalogButton instanceof CatalogButtonFriendsCleanup) {
                                    uIBlockActionOpenInfoPopup = u(a2, CatalogViewType.SYNTHETIC_ACTION_FRIENDS_CLEANUP, UserId.d, "", ((CatalogButtonFriendsCleanup) catalogButton).e);
                                } else if (catalogButton instanceof CatalogButtonImportContacts) {
                                    CatalogViewType catalogViewType4 = CatalogViewType.SYNTHETIC_ACTION_IMPORT_CONTACTS;
                                    UserId userId4 = UserId.d;
                                    CatalogButtonImportContacts catalogButtonImportContacts = (CatalogButtonImportContacts) catalogButton;
                                    String str4 = catalogButtonImportContacts.e;
                                    uIBlockActionOpenInfoPopup = u(a2, catalogViewType4, userId4, str4 != null ? str4 : "", catalogButtonImportContacts.f);
                                } else if (catalogButton instanceof CatalogButtonCreateGroup) {
                                    CatalogButtonCreateGroup catalogButtonCreateGroup = (CatalogButtonCreateGroup) catalogButton;
                                    uIBlockActionOpenInfoPopup = u(a2, CatalogViewType.SYNTHETIC_ACTION_CREATE_GROUP, catalogButtonCreateGroup.f, catalogButtonCreateGroup.e, catalogButtonCreateGroup.g);
                                } else if (catalogButton instanceof CatalogButtonOpenScreen) {
                                    CatalogButtonOpenScreen catalogButtonOpenScreen = (CatalogButtonOpenScreen) catalogButton;
                                    uIBlockActionOpenQoeSurvey = new UIBlockActionOpenScreen(a2.a, CatalogViewType.SYNTHETIC_ACTION_OPEN_SCREEN, a2.c, a2.k, UserId.d, a2.j, a2.m, a2.o, catalogButtonOpenScreen.g, catalogButtonOpenScreen.e, catalogButtonOpenScreen.f, catalogButtonOpenScreen.h);
                                } else if (catalogButton instanceof CatalogButtonOpenScreenLarge) {
                                    CatalogButtonOpenScreenLarge catalogButtonOpenScreenLarge = (CatalogButtonOpenScreenLarge) catalogButton;
                                    uIBlockActionOpenQoeSurvey = new UIBlockActionOpenScreenLarge(a2.a, CatalogViewType.SYNTHETIC_ACTION_OPEN_SCREEN_LARGE, a2.c, a2.k, UserId.d, a2.j, a2.m, a2.o, catalogButtonOpenScreenLarge.g, catalogButtonOpenScreenLarge.e, catalogButtonOpenScreenLarge.f);
                                } else if (catalogButton instanceof CatalogButtonClearRecent) {
                                    CatalogButtonClearRecent catalogButtonClearRecent = (CatalogButtonClearRecent) catalogButton;
                                    uIBlockActionOpenQoeSurvey = new UIBlockActionClearRecent(a2.a, CatalogViewType.SYNTHETIC_HEADER_CLEAR_RECENTS, a2.c, a2.k, a2.e, a2.j, a2.m, a2.o, catalogButtonClearRecent.g, catalogButtonClearRecent.f, catalogButtonClearRecent.h);
                                } else if (catalogButton instanceof CatalogButtonOpenSearchTab) {
                                    CatalogButtonOpenSearchTab catalogButtonOpenSearchTab = (CatalogButtonOpenSearchTab) catalogButton;
                                    uIBlockActionOpenInfoPopup = new UIBlockActionOpenSearchTab(a2.c(CatalogViewType.SYNTHETIC_ACTION_OPEN_TAB), catalogButtonOpenSearchTab.i, catalogButtonOpenSearchTab.e, catalogButtonOpenSearchTab.f, bundle.getString(CatalogCustomAttributes$Keys.STYLE.h()), catalogButtonOpenSearchTab.g, catalogButtonOpenSearchTab.h);
                                } else {
                                    if (catalogButton instanceof CatalogButtonOpenSection) {
                                        CatalogButtonOpenSection catalogButtonOpenSection = (CatalogButtonOpenSection) catalogButton;
                                        String str5 = catalogButtonOpenSection.c;
                                        CatalogDataType catalogDataType2 = CatalogDataType.DATA_TYPE_CATALOG_MARKET_ITEMS;
                                        CatalogViewType catalogViewType5 = (catalogDataType == catalogDataType2 && epx.f(str5, "open_section")) ? CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION_SLIDER_MARKET_ITEMS : !epx.f(str5, "open_section_slider_cell") ? CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION : catalogDataType == catalogDataType2 ? CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION_SLIDER_MARKET_ITEMS : (catalogDataType == CatalogDataType.DATA_TYPE_VIDEO_VIDEOS && catalogViewType == CatalogViewType.SLIDER) ? CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION_SLIDER_VIDEOS : CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION_SLIDER_DEFAULT;
                                        if (epx.f(str5, "open_section_slider_cell")) {
                                            catalogDataType = CatalogDataType.DATA_TYPE_ACTION;
                                        }
                                        CatalogDataType catalogDataType3 = catalogDataType;
                                        String str6 = catalogButtonOpenSection.l;
                                        if (str6 == null) {
                                            str6 = bundle.getString(CatalogCustomAttributes$Keys.STYLE.h());
                                        }
                                        String str7 = str6;
                                        com.vk.catalog2.common.dto.api.ui.a c2 = a2.c(catalogViewType5);
                                        String str8 = a2.b;
                                        OpenSectionViewStyle.ButtonStyle.Companion.getClass();
                                        OpenSectionViewStyle.ButtonStyle a3 = OpenSectionViewStyle.ButtonStyle.a.a(str7);
                                        OpenSectionViewStyle.ButtonIcon.a aVar = OpenSectionViewStyle.ButtonIcon.Companion;
                                        String str9 = catalogButtonOpenSection.i;
                                        aVar.getClass();
                                        uIBlockActionShowFilters = new UIBlockActionOpenSection(com.vk.catalog2.common.dto.api.ui.a.a(c2, null, str8, null, catalogDataType3, null, new OpenSectionViewStyle(a3, OpenSectionViewStyle.ButtonIcon.a.a(str9)), 7669), catalogButtonOpenSection.h, catalogButtonOpenSection.e, catalogButtonOpenSection.f, str7, catalogButtonOpenSection.g, catalogButtonOpenSection.i, catalogButtonOpenSection.k, catalogButtonOpenSection.j, catalogButtonOpenSection.m);
                                    } else if (catalogButton instanceof CatalogButtonSwitchSection) {
                                        CatalogButtonSwitchSection catalogButtonSwitchSection = (CatalogButtonSwitchSection) catalogButton;
                                        String str10 = a2.a;
                                        CatalogViewType catalogViewType6 = CatalogViewType.SYNTHETIC_ACTION_SWITCH_SECTION;
                                        CatalogDataType catalogDataType4 = a2.c;
                                        String str11 = a2.k;
                                        UserId userId5 = a2.e;
                                        List<String> list3 = a2.j;
                                        Set<UIBlockDragDropAction> set = a2.m;
                                        UIBlockHint uIBlockHint2 = a2.o;
                                        String str12 = catalogButtonSwitchSection.h;
                                        String str13 = catalogButtonSwitchSection.e;
                                        String str14 = catalogButtonSwitchSection.f;
                                        String str15 = catalogButtonSwitchSection.g;
                                        String str16 = catalogButtonSwitchSection.i;
                                        String str17 = catalogButtonSwitchSection.k;
                                        Image image = catalogButtonSwitchSection.j;
                                        uIBlockActionOpenQoeSurvey = new UIBlockActionSwitchSection(str10, catalogViewType6, catalogDataType4, str11, userId5, list3, set, uIBlockHint2, str12, str13, str14, str15, str16, str17, (image == null || (arrayList = image.b) == null || (imageSize = (ImageSize) j5g.a0(arrayList)) == null) ? null : imageSize.d.d, catalogButtonSwitchSection.l, catalogButtonSwitchSection.m, catalogButtonSwitchSection.n);
                                    } else if (catalogButton instanceof CatalogButtonFilters) {
                                        CatalogButtonFilters catalogButtonFilters = (CatalogButtonFilters) catalogButton;
                                        String str18 = catalogButtonFilters.c;
                                        List list4 = catalogButtonFilters.g;
                                        int hashCode = str18.hashCode();
                                        if (hashCode != 233034297) {
                                            if (hashCode != 1221293377) {
                                                if (hashCode == 1466733249 && str18.equals("groups_my_groups_tabs")) {
                                                    catalogDataType = CatalogDataType.DATA_TYPE_ACTION;
                                                }
                                            }
                                            CatalogDataType catalogDataType5 = catalogDataType;
                                            int hashCode2 = str18.hashCode();
                                            if (hashCode2 != 233034297) {
                                                if (hashCode2 != 1221293377) {
                                                    if (hashCode2 == 1466733249 && str18.equals("groups_my_groups_tabs")) {
                                                        catalogViewType = (list4 == null ? EmptyList.b : list4).size() >= 3 ? CatalogViewType.BUTTONS_HORIZONTAL_WITH_SCROLL : CatalogViewType.BUTTONS_HORIZONTAL;
                                                    }
                                                } else if (str18.equals("select_sorting")) {
                                                    catalogViewType = CatalogViewType.SYNTHETIC_ACTION_SELECT_SORTING;
                                                }
                                            } else if (str18.equals("friends_sort_modes")) {
                                                catalogViewType = CatalogViewType.SYNTHETIC_ACTION_FRIENDS_SORT_MODES;
                                            }
                                            com.vk.catalog2.common.dto.api.ui.a a4 = com.vk.catalog2.common.dto.api.ui.a.a(a2.b(), null, null, catalogViewType, catalogDataType5, null, null, 8179);
                                            String str19 = catalogButtonFilters.i;
                                            String str20 = catalogButtonFilters.e;
                                            if (list4 == null) {
                                                list4 = EmptyList.b;
                                            }
                                            List list5 = list4;
                                            String str21 = catalogButtonFilters.h;
                                            uIBlockActionShowFilters = new UIBlockActionShowFilters(a4, str19, str20, list5, str21 == null ? "" : str21, catalogButtonFilters.f);
                                        }
                                    } else if (catalogButton instanceof CatalogShowFiltersButton) {
                                        CatalogShowFiltersButton catalogShowFiltersButton = (CatalogShowFiltersButton) catalogButton;
                                        com.vk.catalog2.common.dto.api.ui.a b2 = a2.b();
                                        String str22 = catalogShowFiltersButton.e;
                                        List list6 = catalogShowFiltersButton.g;
                                        if (list6 == null) {
                                            list6 = EmptyList.b;
                                        }
                                        List list7 = list6;
                                        String str23 = catalogShowFiltersButton.f;
                                        uIBlockActionOpenQoeSurvey = new UIBlockActionShowFilters(b2, null, str22, list7, str23 == null ? "" : str23, null, 32, null);
                                    } else if (catalogButton instanceof CatalogButtonCloseNotification) {
                                        uIBlockActionOpenInfoPopup = u(a2, CatalogViewType.SYNTHETIC_ACTION_CLOSE_BANNER, UserId.d, "", ((CatalogButtonCloseNotification) catalogButton).e);
                                    } else if (catalogButton instanceof CatalogButtonMusicSubscription) {
                                        CatalogButtonMusicSubscription catalogButtonMusicSubscription = (CatalogButtonMusicSubscription) catalogButton;
                                        uIBlockActionOpenInfoPopup = new UIBlockActionTextButton(new com.vk.catalog2.common.dto.api.ui.a(a2.a, a2.b, CatalogViewType.SYNTHETIC_OFFLINE_MUSIC_SUBSCRIPTION_BTN, a2.c, a2.k, UserId.d, a2.j, a2.m, a2.o, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7680), null, catalogButtonMusicSubscription.e, catalogButtonMusicSubscription.f);
                                    } else {
                                        if (catalogButton instanceof CatalogButtonFollowUser) {
                                            CatalogButtonFollowUser catalogButtonFollowUser = (CatalogButtonFollowUser) catalogButton;
                                            rba Gb = catalogExtendedData.Gb(catalogButtonFollowUser.e);
                                            UserProfile userProfile = Gb.a;
                                            Group group = Gb.b;
                                            String str24 = catalogButtonFollowUser.f;
                                            String str25 = catalogButtonFollowUser.g;
                                            if (userProfile == null || (userId2 = userProfile.c) == null) {
                                                userId2 = group != null ? group.c : null;
                                            }
                                            userId3 = userId2;
                                            if (group != null && fkq0.d(userId3)) {
                                                userId3 = fkq0.e(userId3);
                                            }
                                            uIBlockActionIconButton = new UIBlockActionFollow(a2.a, CatalogViewType.SYNTHETIC_ACTION_FOLLOW, a2.c, a2.k, userId3, a2.j, a2.m, a2.o, str24, group, userProfile, str25);
                                        } else if (catalogButton instanceof CatalogButtonGoToOwner) {
                                            CatalogButtonGoToOwner catalogButtonGoToOwner = (CatalogButtonGoToOwner) catalogButton;
                                            rba Gb2 = catalogExtendedData.Gb(catalogButtonGoToOwner.e);
                                            UserProfile userProfile2 = Gb2.a;
                                            Group group2 = Gb2.b;
                                            String str26 = catalogButtonGoToOwner.f;
                                            if (userProfile2 == null || (userId = userProfile2.c) == null) {
                                                UserId userId6 = group2 != null ? group2.c : null;
                                                if (userId6 != null) {
                                                    userId3 = userId6;
                                                }
                                            } else {
                                                userId3 = userId;
                                            }
                                            if (group2 != null && fkq0.d(userId3)) {
                                                userId3 = fkq0.e(userId3);
                                            }
                                            uIBlockActionIconButton = new UIBlockActionGoToOwner(a2.a, CatalogViewType.SYNTHETIC_ACTION_GO_TO_OWNER, a2.c, a2.k, userId3, a2.j, a2.m, a2.o, str26, userProfile2, group2);
                                        } else if (catalogButton instanceof CatalogButtonEnterEditMode) {
                                            CatalogButtonEnterEditMode catalogButtonEnterEditMode = (CatalogButtonEnterEditMode) catalogButton;
                                            uIBlockActionOpenInfoPopup = new UIBlockActionEnterEditMode(a2.b(), catalogButtonEnterEditMode.f, catalogButtonEnterEditMode.e);
                                        } else if (catalogButton instanceof CatalogButtonUnfollowArtist) {
                                            CatalogButtonUnfollowArtist catalogButtonUnfollowArtist = (CatalogButtonUnfollowArtist) catalogButton;
                                            uIBlockActionOpenQoeSurvey = new UIBlockUnfollowArtistButton(a2.a, CatalogViewType.SYNTHETIC_ACTION_UNFOLLOW_ARTIST, a2.c, a2.k, userId3, a2.j, a2.m, a2.o, catalogButtonUnfollowArtist.g, catalogButtonUnfollowArtist.e, catalogButtonUnfollowArtist.f);
                                        } else if (catalogButton instanceof CatalogButtonUnfollowCurator) {
                                            CatalogButtonUnfollowCurator catalogButtonUnfollowCurator = (CatalogButtonUnfollowCurator) catalogButton;
                                            uIBlockActionIconButton = new UIBlockActionCuratorSubscription(a2.c(CatalogViewType.SYNTHETIC_ACTION_UNFOLLOW_CURATOR), catalogButtonUnfollowCurator.g, catalogButtonUnfollowCurator.e, catalogButtonUnfollowCurator.f, true);
                                        } else if (catalogButton instanceof CatalogButtonToggleSubscriptionCurator) {
                                            CatalogButtonToggleSubscriptionCurator catalogButtonToggleSubscriptionCurator = (CatalogButtonToggleSubscriptionCurator) catalogButton;
                                            uIBlockActionIconButton = new UIBlockActionCuratorSubscription(a2.c(CatalogViewType.SYNTHETIC_ACTION_TOGGLE_SUBSCRIPTION_CURATOR), catalogButtonToggleSubscriptionCurator.g, "", catalogButtonToggleSubscriptionCurator.e, catalogButtonToggleSubscriptionCurator.f);
                                        } else if (catalogButton instanceof CatalogButtonMyAudiosSectionOptions) {
                                            uIBlockActionIconButton = new UIBlockMyAudiosSectionOptions(a2.a, CatalogViewType.SYNTHETIC_ACTION_MY_AUDIOS_SECTION_OPTIONS, CatalogDataType.DATA_TYPE_ACTION, a2.k, a2.e, a2.j, a2.o);
                                        } else if (catalogButton instanceof CatalogButtonDownloadAll) {
                                            uIBlockActionIconButton = new UIBlockDownloadAll(a2.a, CatalogViewType.SYNTHETIC_ACTION_MY_AUDIOS_SECTION_OPTIONS, CatalogDataType.DATA_TYPE_ACTION, a2.k, a2.e, a2.j, a2.o);
                                        } else {
                                            if (catalogButton instanceof CatalogButtonClearDownloadsHistory) {
                                                uIBlockActionGoToAuthor = new UIBlockClearDownloadsHistory(a2.a, CatalogViewType.SYNTHETIC_HEADER_CLEAR_TRACKS, CatalogDataType.DATA_TYPE_ACTION, a2.k, a2.e, a2.j, a2.o, ((CatalogButtonClearDownloadsHistory) catalogButton).f);
                                            } else if (catalogButton instanceof CatalogButtonDragAndRemove) {
                                                uIBlockActionIconButton = new UIBlockActionDnDEdit(a2.a, CatalogViewType.SYNTHETIC_DND_ACTION_EDIT, CatalogDataType.DATA_TYPE_DND_ACTION, a2.k, a2.e, a2.j, a2.o);
                                            } else if (catalogButton instanceof CatalogButtonReorder) {
                                                uIBlockActionIconButton = new UIBlockActionDnDReorder(a2.a, CatalogViewType.SYNTHETIC_DND_ACTION_REORDER, CatalogDataType.DATA_TYPE_DND_ACTION, a2.k, a2.e, a2.j, a2.o);
                                            } else if (catalogButton instanceof CatalogButtonOpenDialog) {
                                                CatalogButtonOpenDialog catalogButtonOpenDialog = (CatalogButtonOpenDialog) catalogButton;
                                                uIBlockActionIconButton = new UIBlockActionIconButton(a2.a, CatalogViewType.SYNTHETIC_ACTION_OPEN_DIALOG, a2.c, a2.k, a2.e, a2.j, a2.m, a2.o, catalogButtonOpenDialog.f, catalogButtonOpenDialog.g, catalogButtonOpenDialog.e);
                                            } else if (catalogButton instanceof CatalogButtonSearchMode) {
                                                CatalogButtonSearchMode catalogButtonSearchMode = (CatalogButtonSearchMode) catalogButton;
                                                String str27 = catalogButtonSearchMode.g;
                                                if (str27 == null) {
                                                    str27 = a2.b;
                                                }
                                                uIBlockActionGoToAuthor = new UIBlockActionSearchMode(a2.d(catalogButtonSearchMode.j, str27), catalogButtonSearchMode.h, catalogButtonSearchMode.f, catalogButtonSearchMode.i, new SearchModeActionStyle(catalogButtonSearchMode.k));
                                            } else if (catalogButton instanceof CatalogButtonMakeCall) {
                                                CatalogButtonMakeCall catalogButtonMakeCall = (CatalogButtonMakeCall) catalogButton;
                                                uIBlockActionIconButton = new UIBlockActionIconButton(a2.a, CatalogViewType.SYNTHETIC_ACTION_MAKE_CALL, a2.c, a2.k, a2.e, a2.j, a2.m, a2.o, catalogButtonMakeCall.f, catalogButtonMakeCall.g, catalogButtonMakeCall.e);
                                            } else if (catalogButton instanceof CatalogButtonPlayVideosFromBlock) {
                                                CatalogButtonPlayVideosFromBlock catalogButtonPlayVideosFromBlock = (CatalogButtonPlayVideosFromBlock) catalogButton;
                                                uIBlockActionGoToAuthor = new UIBlockActionPlayVideosFromBlock(a2.b(), catalogButtonPlayVideosFromBlock.h, catalogButtonPlayVideosFromBlock.e, catalogButtonPlayVideosFromBlock.g, catalogButtonPlayVideosFromBlock.f, null, 32, null);
                                            } else if (catalogButton instanceof CatalogButtonToggleAlbumSubscription) {
                                                Serializer.c<VideoAlbum> cVar = VideoAlbum.CREATOR;
                                                CatalogButtonToggleAlbumSubscription catalogButtonToggleAlbumSubscription = (CatalogButtonToggleAlbumSubscription) catalogButton;
                                                Object Ab2 = catalogExtendedData.Ab(CatalogDataType.DATA_TYPE_VIDEO_ALBUMS, VideoAlbum.a.a(catalogButtonToggleAlbumSubscription.g, userId3));
                                                uIBlockActionOpenQoeSurvey = new UIBlockActionToggleAlbumSubscription(a2.a, CatalogViewType.SYNTHETIC_ACTION_TOGGLE_PLAYLIST_SUBSCRIPTION, a2.c, a2.k, a2.e, a2.j, a2.m, a2.o, catalogButtonToggleAlbumSubscription.f, catalogButtonToggleAlbumSubscription.e, Ab2 instanceof VideoAlbum ? (VideoAlbum) Ab2 : null);
                                            } else if (catalogButton instanceof CatalogButtonAddVideos) {
                                                Serializer.c<VideoAlbum> cVar2 = VideoAlbum.CREATOR;
                                                CatalogButtonAddVideos catalogButtonAddVideos = (CatalogButtonAddVideos) catalogButton;
                                                Object Ab3 = catalogExtendedData.Ab(CatalogDataType.DATA_TYPE_VIDEO_ALBUMS, VideoAlbum.a.a(catalogButtonAddVideos.g, userId3));
                                                uIBlockActionOpenQoeSurvey = new UIBlockActionAddVideos(a2.a, CatalogViewType.SYNTHETIC_ACTION_ADD_VIDEOS, a2.c, a2.k, a2.e, a2.j, a2.m, a2.o, catalogButtonAddVideos.f, catalogButtonAddVideos.e, Ab3 instanceof VideoAlbum ? (VideoAlbum) Ab3 : null);
                                            } else if (catalogButton instanceof CatalogButtonToggleAlbumShuffle) {
                                                uIBlockActionGoToAuthor = new UIBlockActionToggleAlbumShuffle(a2.a, CatalogViewType.SYNTHETIC_ACTION_TOGGLE_ALBUM_SHUFFLE, a2.c, a2.k, a2.e, a2.j, a2.m, a2.o, ((CatalogButtonToggleAlbumShuffle) catalogButton).e);
                                            } else if (catalogButton instanceof CatalogButtonClearSection) {
                                                CatalogButtonClearSection catalogButtonClearSection = (CatalogButtonClearSection) catalogButton;
                                                uIBlockActionOpenQoeSurvey = new UIBlockActionClearSection(a2.a, a2.d, a2.c, a2.k, a2.e, a2.j, a2.m, a2.o, catalogButtonClearSection.e, catalogButtonClearSection.f);
                                            } else if (catalogButton instanceof CatalogButtonMusicFollowOwner) {
                                                CatalogButtonMusicFollowOwner catalogButtonMusicFollowOwner = (CatalogButtonMusicFollowOwner) catalogButton;
                                                uIBlockActionGoToAuthor = new UIBlockMusicFollowOwnerButton(new com.vk.catalog2.common.dto.api.ui.a(a2.a, a2.b, CatalogViewType.SYNTHETIC_ACTION_MUSIC_FOLLOW_OWNER, a2.c, a2.k, userId3, a2.j, a2.m, (UIBlockHint) null, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7936), a2.o, catalogButtonMusicFollowOwner.g, catalogButtonMusicFollowOwner.e, catalogButtonMusicFollowOwner.f);
                                            } else if (catalogButton instanceof CatalogButtonMusicUnfollowOwner) {
                                                CatalogButtonMusicUnfollowOwner catalogButtonMusicUnfollowOwner = (CatalogButtonMusicUnfollowOwner) catalogButton;
                                                uIBlockActionGoToAuthor = new UIBlockMusicUnfollowOwnerButton(new com.vk.catalog2.common.dto.api.ui.a(a2.a, a2.b, CatalogViewType.SYNTHETIC_ACTION_UNFOLLOW_OWNER, a2.c, a2.k, userId3, a2.j, a2.m, (UIBlockHint) null, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7936), a2.o, catalogButtonMusicUnfollowOwner.g, catalogButtonMusicUnfollowOwner.f, catalogButtonMusicUnfollowOwner.e);
                                            } else if (catalogButton instanceof CatalogButtonHideBlock) {
                                                CatalogButtonHideBlock catalogButtonHideBlock = (CatalogButtonHideBlock) catalogButton;
                                                uIBlockActionGoToAuthor = new UIBlockHideBlockButton(a2.b(), null, catalogButtonHideBlock.g, catalogButtonHideBlock.f, catalogButtonHideBlock.h, catalogButtonHideBlock.e, catalogButtonHideBlock.i);
                                            } else if (catalogButton instanceof CatalogButtonOnboarding) {
                                                CatalogButtonOnboarding catalogButtonOnboarding = (CatalogButtonOnboarding) catalogButton;
                                                com.vk.catalog2.common.dto.api.ui.a b3 = a2.b();
                                                String str28 = catalogButtonOnboarding.h;
                                                String str29 = catalogButtonOnboarding.e;
                                                String str30 = catalogButtonOnboarding.f;
                                                List list8 = catalogButtonOnboarding.g;
                                                if (list8 == null) {
                                                    list8 = EmptyList.b;
                                                }
                                                uIBlockActionGoToAuthor = new UIBlockActionOnboarding(b3, str28, str29, str30, list8);
                                            } else if (catalogButton instanceof CatalogButtonOpenChallenge) {
                                                CatalogButtonOpenChallenge catalogButtonOpenChallenge = (CatalogButtonOpenChallenge) catalogButton;
                                                uIBlockActionOpenInfoPopup = new UIBlockActionOpenChallenge(a2.b(), catalogButtonOpenChallenge.g, catalogButtonOpenChallenge.f);
                                            } else if (catalogButton instanceof CatalogButtonPlayAudio) {
                                                CatalogDataType catalogDataType6 = CatalogDataType.DATA_TYPE_MUSIC_TRACKS;
                                                CatalogButtonPlayAudio catalogButtonPlayAudio = (CatalogButtonPlayAudio) catalogButton;
                                                StringBuilder sb = new StringBuilder();
                                                sb.append(catalogButtonPlayAudio.g);
                                                sb.append('_');
                                                sb.append(catalogButtonPlayAudio.f);
                                                Object Ab4 = catalogExtendedData.Ab(catalogDataType6, sb.toString());
                                                uIBlockActionOpenInfoPopup = new UIBlockActionPlayAudio(a2.b(), catalogButtonPlayAudio.h, Ab4 instanceof MusicTrack ? (MusicTrack) Ab4 : null);
                                            } else if (catalogButton instanceof CatalogButtonPlayMix) {
                                                CatalogButtonPlayMix catalogButtonPlayMix = (CatalogButtonPlayMix) catalogButton;
                                                String str31 = catalogButtonPlayMix.n;
                                                CatalogViewType catalogViewType7 = CatalogViewType.SYNTHETIC_ACTION_ARTIST_MIX;
                                                if (!epx.f(str31, catalogViewType7.getId())) {
                                                    catalogViewType7 = CatalogViewType.SYNTHETIC_ACTION_ARTIST_MIX_BLURRED;
                                                    if (!epx.f(str31, catalogViewType7.getId())) {
                                                        catalogViewType7 = CatalogViewType.SYNTHETIC_ACTION_PLAY_MIX;
                                                    }
                                                }
                                                uIBlockActionOpenInfoPopup = u0(a2, catalogViewType7, catalogButtonPlayMix);
                                            } else if (catalogButton instanceof CatalogButtonStartLiveStream) {
                                                CatalogButtonStartLiveStream catalogButtonStartLiveStream = (CatalogButtonStartLiveStream) catalogButton;
                                                uIBlockActionOpenInfoPopup = u(a2, CatalogViewType.SYNTHETIC_ACTION_START_LIVE_STREAM, userId3, catalogButtonStartLiveStream.e, catalogButtonStartLiveStream.f);
                                            } else if (catalogButton instanceof CatalogButtonUpdateNonActiveGroups) {
                                                CatalogButtonUpdateNonActiveGroups catalogButtonUpdateNonActiveGroups = (CatalogButtonUpdateNonActiveGroups) catalogButton;
                                                uIBlockActionOpenInfoPopup = new UIBlockActionUpdateNonActiveGroups(com.vk.catalog2.common.dto.api.ui.a.a(a2.c(CatalogViewType.EMPTY), null, null, null, null, UserId.d, null, 8159), catalogButtonUpdateNonActiveGroups.e, catalogButtonUpdateNonActiveGroups.f, catalogButtonUpdateNonActiveGroups.g);
                                            } else if (catalogButton instanceof CatalogButtonMarketOptions) {
                                                CatalogButtonMarketOptions catalogButtonMarketOptions = (CatalogButtonMarketOptions) catalogButton;
                                                uIBlockActionOpenInfoPopup = new UIBlockActionMarketOptions(com.vk.catalog2.common.dto.api.ui.a.a(a2.b(), null, null, null, null, catalogButtonMarketOptions.e, null, 8159), catalogButtonMarketOptions.f, catalogButtonMarketOptions.g);
                                            } else if (catalogButton instanceof CatalogButtonExpandBlock) {
                                                CatalogButtonExpandBlock catalogButtonExpandBlock = (CatalogButtonExpandBlock) catalogButton;
                                                com.vk.catalog2.common.dto.api.ui.a a5 = com.vk.catalog2.common.dto.api.ui.a.a(a2.c(CatalogViewType.SYNTHETIC_ACTION_EXPAND_BLOCK), null, null, null, CatalogDataType.DATA_TYPE_ACTION, null, null, 8183);
                                                String str32 = catalogButtonExpandBlock.f;
                                                String a6 = cqm0.a(catalogButtonExpandBlock.e);
                                                if (a6 == null) {
                                                    a6 = a2.a;
                                                }
                                                uIBlockActionGoToAuthor = new UIBlockActionExpandBlock(a5, str32, a6, catalogButtonExpandBlock.g, catalogButtonExpandBlock.h, null, 32, null);
                                            } else if (catalogButton instanceof CatalogButtonMarketEditAlbum) {
                                                CatalogButtonMarketEditAlbum catalogButtonMarketEditAlbum = (CatalogButtonMarketEditAlbum) catalogButton;
                                                com.vk.catalog2.common.dto.api.ui.a a7 = com.vk.catalog2.common.dto.api.ui.a.a(a2.b(), null, null, CatalogViewType.SYNTHETIC_ACTION_MARKET_EDIT_ALBUM, null, a2.e, null, 8155);
                                                String str33 = catalogButtonMarketEditAlbum.e;
                                                uIBlockActionOpenInfoPopup = new UIBlockActionMarketEditAlbum(a7, str33 != null ? str33 : "", catalogButtonMarketEditAlbum.f);
                                            } else if (catalogButton instanceof CatalogButtonOpenModal) {
                                                CatalogViewType catalogViewType8 = CatalogViewType.SYNTHETIC_ACTION_OPEN_MODAL;
                                                String str34 = ((CatalogButtonOpenModal) catalogButton).e;
                                                uIBlockActionOpenInfoPopup = u(a2, catalogViewType8, userId3, str34 != null ? str34 : "", null);
                                            } else {
                                                if (catalogButton instanceof CatalogButtonProfileOwnerGroupsVideo) {
                                                    CatalogButtonProfileOwnerGroupsVideo catalogButtonProfileOwnerGroupsVideo = (CatalogButtonProfileOwnerGroupsVideo) catalogButton;
                                                    uIBlockActionOpenInfoPopup = C(a2, CatalogViewType.VIDEO_OWNER_GROUPS, catalogButtonProfileOwnerGroupsVideo.f, catalogButtonProfileOwnerGroupsVideo.e, catalogButtonProfileOwnerGroupsVideo.g);
                                                } else if (catalogButton instanceof CatalogButtonProfileBecomeAuthorVideo) {
                                                    CatalogButtonProfileBecomeAuthorVideo catalogButtonProfileBecomeAuthorVideo = (CatalogButtonProfileBecomeAuthorVideo) catalogButton;
                                                    uIBlockActionOpenInfoPopup = C(a2, CatalogViewType.VIDEO_BECOME_AUTHOR, catalogButtonProfileBecomeAuthorVideo.f, catalogButtonProfileBecomeAuthorVideo.e, catalogButtonProfileBecomeAuthorVideo.g);
                                                } else if (catalogButton instanceof CatalogButtonProfileAuthorCabinetVideo) {
                                                    CatalogButtonProfileAuthorCabinetVideo catalogButtonProfileAuthorCabinetVideo = (CatalogButtonProfileAuthorCabinetVideo) catalogButton;
                                                    uIBlockActionOpenInfoPopup = C(a2, CatalogViewType.VIDEO_AUTHOR_CABINET, catalogButtonProfileAuthorCabinetVideo.f, catalogButtonProfileAuthorCabinetVideo.e, catalogButtonProfileAuthorCabinetVideo.g);
                                                } else if (catalogButton instanceof CatalogButtonProfileChangeProfileVideo) {
                                                    CatalogButtonProfileChangeProfileVideo catalogButtonProfileChangeProfileVideo = (CatalogButtonProfileChangeProfileVideo) catalogButton;
                                                    uIBlockActionOpenInfoPopup = C(a2, CatalogViewType.VIDEO_CHANGE_PROFILE, catalogButtonProfileChangeProfileVideo.f, catalogButtonProfileChangeProfileVideo.e, catalogButtonProfileChangeProfileVideo.g);
                                                } else if (catalogButton instanceof CatalogButtonProfileChildModeVideo) {
                                                    CatalogButtonProfileChildModeVideo catalogButtonProfileChildModeVideo = (CatalogButtonProfileChildModeVideo) catalogButton;
                                                    uIBlockActionOpenInfoPopup = C(a2, CatalogViewType.VIDEO_CHILD_MODE, catalogButtonProfileChildModeVideo.f, catalogButtonProfileChildModeVideo.e, catalogButtonProfileChildModeVideo.g);
                                                } else if (catalogButton instanceof CatalogButtonSwitchAccount) {
                                                    CatalogButtonSwitchAccount catalogButtonSwitchAccount = (CatalogButtonSwitchAccount) catalogButton;
                                                    uIBlockActionOpenQoeSurvey = new UIBlockActionSwitchAccount(a2.a, CatalogViewType.SYNTHETIC_ACTION_SWITCH_ACCOUNT, a2.c, a2.k, a2.e, a2.j, a2.m, a2.o, catalogButtonSwitchAccount.f, catalogButtonSwitchAccount.e);
                                                } else if (catalogButton instanceof CatalogButtonGoToAuthor) {
                                                    CatalogButtonGoToAuthor catalogButtonGoToAuthor = (CatalogButtonGoToAuthor) catalogButton;
                                                    Object Ab5 = catalogExtendedData.Ab(CatalogDataType.DATA_TYPE_GROUPS_ITEMS, String.valueOf(fkq0.e(catalogButtonGoToAuthor.f).b));
                                                    uIBlockActionGoToAuthor = new UIBlockActionGoToAuthor(new com.vk.catalog2.common.dto.api.ui.a(a2.a, a2.b, a2.d, a2.c, a2.k, catalogButtonGoToAuthor.f, a2.j, a2.m, a2.o, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7680), catalogButtonGoToAuthor.g, catalogButtonGoToAuthor.e, Ab5 instanceof Group ? (Group) Ab5 : null);
                                                } else if (catalogButton instanceof CatalogButtonOpenSearchFilters) {
                                                    CatalogButtonOpenSearchFilters catalogButtonOpenSearchFilters = (CatalogButtonOpenSearchFilters) catalogButton;
                                                    uIBlockActionOpenInfoPopup = new UIBlockActionOpenSearchFilter(a2.b(), catalogButtonOpenSearchFilters.d, catalogButtonOpenSearchFilters.e);
                                                } else if (catalogButton instanceof CatalogButtonResetFilters) {
                                                    com.vk.catalog2.common.dto.api.ui.a b4 = a2.b();
                                                    CatalogButtonResetFilters catalogButtonResetFilters = (CatalogButtonResetFilters) catalogButton;
                                                    Boolean bool = catalogButtonResetFilters.f;
                                                    boolean booleanValue = bool != null ? bool.booleanValue() : true;
                                                    String str35 = catalogButtonResetFilters.e;
                                                    uIBlockActionOpenInfoPopup = new UIBlockActionResetSearchFilter(b4, booleanValue, str35 != null ? str35 : "");
                                                } else if (catalogButton instanceof CatalogButtonAllFilters) {
                                                    com.vk.catalog2.common.dto.api.ui.a b5 = a2.b();
                                                    Boolean bool2 = ((CatalogButtonAllFilters) catalogButton).g;
                                                    uIBlockActionOpenInfoPopup = new UIBlockActionOpenAllSearchFilters(b5, bool2 != null ? bool2.booleanValue() : true);
                                                } else if (catalogButton instanceof CatalogButtonOpenQoeSurvey) {
                                                    CatalogButtonOpenQoeSurvey catalogButtonOpenQoeSurvey = (CatalogButtonOpenQoeSurvey) catalogButton;
                                                    uIBlockActionOpenQoeSurvey = new UIBlockActionOpenQoeSurvey(a2.a, CatalogViewType.SYNTHETIC_ACTION_OPEN_QOE_SURVEY, a2.c, a2.k, a2.e, a2.j, a2.m, a2.o, catalogButtonOpenQoeSurvey.e, catalogButtonOpenQoeSurvey.f);
                                                } else {
                                                    if (!(catalogButton instanceof CatalogButtonOpenInfoPopup)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    CatalogButtonOpenInfoPopup catalogButtonOpenInfoPopup = (CatalogButtonOpenInfoPopup) catalogButton;
                                                    uIBlockActionOpenInfoPopup = new UIBlockActionOpenInfoPopup(a2.c(CatalogViewType.SYNTHETIC_ACTION_OPEN_INFO_POPUP), catalogButtonOpenInfoPopup.d, catalogButtonOpenInfoPopup.e, catalogButtonOpenInfoPopup.f, catalogButtonOpenInfoPopup.g, catalogButtonOpenInfoPopup.h, bundle.getString(CatalogCustomAttributes$Keys.STYLE.h()));
                                                }
                                            }
                                            uIBlockActionOpenInfoPopup = uIBlockActionGoToAuthor;
                                        }
                                        uIBlockActionOpenInfoPopup = uIBlockActionIconButton;
                                    }
                                    uIBlockActionOpenInfoPopup = uIBlockActionShowFilters;
                                }
                            }
                            uIBlockActionOpenInfoPopup = uIBlockActionOpenQoeSurvey;
                        }
                    }
                }
                if (uIBlockActionOpenInfoPopup == null) {
                    arrayList3.add(uIBlockActionOpenInfoPopup);
                }
                w060Var = this;
                it2 = it;
            }
            it = it2;
            if (uIBlockActionOpenInfoPopup == null) {
            }
            w060Var = this;
            it2 = it;
        }
        return arrayList3;
    }

    public UIBlock Q0(CatalogSection catalogSection, CatalogExtendedData catalogExtendedData) {
        CatalogTabStyle.Gradient gradient;
        UIBlockBadge uIBlockBadge;
        CatalogHeaderStyle.TitleGradient titleGradient;
        CatalogSectionStyle catalogSectionStyle = catalogSection.l;
        ArrayList arrayList = new ArrayList();
        List<CatalogBlock> list = catalogSection.i;
        for (final CatalogBlock catalogBlock : list) {
            final List<UIBlock> S0 = S0(catalogBlock, catalogExtendedData, list, catalogSection.f);
            final bi20 e2 = e(catalogBlock, catalogExtendedData);
            final CatalogViewType catalogViewType = catalogBlock.i.b;
            final ArrayList arrayList2 = arrayList;
            new gzs() { // from class: xsna.v060
                @Override // xsna.gzs
                public final Object invoke() {
                    CatalogDataType catalogDataType = catalogBlock.c;
                    CatalogViewType catalogViewType2 = CatalogViewType.this;
                    boolean j2 = catalogViewType2.j();
                    List list2 = S0;
                    ArrayList arrayList3 = arrayList2;
                    w060 w060Var = this;
                    bi20 bi20Var = e2;
                    if (j2 && !list2.isEmpty()) {
                        return Boolean.valueOf(arrayList3.add(w060Var.K(list2, bi20Var)));
                    }
                    if (catalogViewType2.n()) {
                        return Boolean.valueOf(arrayList3.addAll(list2));
                    }
                    if (catalogViewType2 == CatalogViewType.FEATURED_LIST && catalogDataType == CatalogDataType.DATA_TYPE_LINKS && !list2.isEmpty()) {
                        return Boolean.valueOf(arrayList3.add(new UIBlockStaticLinksBanner(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, list2)));
                    }
                    CatalogViewType catalogViewType3 = CatalogViewType.BANNER;
                    if (catalogViewType2 == catalogViewType3 && catalogDataType == CatalogDataType.DATA_TYPE_LINKS && !list2.isEmpty()) {
                        return Boolean.valueOf(arrayList3.add(w060Var.B(list2, bi20Var)));
                    }
                    if (catalogDataType == CatalogDataType.DATA_TYPE_STICKERS_BANNERS && !list2.isEmpty()) {
                        return Boolean.valueOf(arrayList3.add(w060Var.B(list2, bi20Var)));
                    }
                    if (catalogDataType == CatalogDataType.DATA_TYPE_STICKERS_INFO && !list2.isEmpty()) {
                        return Boolean.valueOf(arrayList3.add(w060.B0(w060Var, bi20Var, list2, EmptyList.b, null, null, bi20Var.c, null, false, null, false, null, null, 1048504)));
                    }
                    CatalogDataType catalogDataType2 = CatalogDataType.DATA_TYPE_CATALOG_BANNERS;
                    if (catalogDataType == catalogDataType2 && catalogViewType2 == catalogViewType3 && !list2.isEmpty()) {
                        Object Y = j5g.Y(list2);
                        UIBlockPlaceholder uIBlockPlaceholder = Y instanceof UIBlockPlaceholder ? (UIBlockPlaceholder) Y : null;
                        if ((uIBlockPlaceholder != null ? uIBlockPlaceholder.H : null) == CatalogBannerImageMode.SQUARE_BIG) {
                            return Boolean.valueOf(arrayList3.add(w060Var.B(list2, bi20Var)));
                        }
                    }
                    if (catalogDataType == catalogDataType2 && catalogViewType2 == CatalogViewType.SNIPPETS_BANNER && !list2.isEmpty()) {
                        return Boolean.valueOf(arrayList3.add(j5g.Y(list2)));
                    }
                    if (catalogDataType == CatalogDataType.DATA_TYPE_AUDIO_STREAM_MIXES && catalogViewType2 == CatalogViewType.AUDIO_STREAM_MIX && !list2.isEmpty()) {
                        return Boolean.valueOf(arrayList3.add(j5g.Y(list2)));
                    }
                    int i2 = -1;
                    if (catalogDataType == CatalogDataType.DATA_TYPE_LINKS && catalogViewType2 == CatalogViewType.PLAYLIST_SMALL && !list2.isEmpty()) {
                        ListIterator listIterator = arrayList3.listIterator(arrayList3.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                break;
                            }
                            if (((UIBlock) listIterator.previous()).d.l()) {
                                i2 = listIterator.nextIndex();
                                break;
                            }
                        }
                        if (i2 == e43.h(arrayList3)) {
                            g5g.J(arrayList3);
                        }
                        return s3q0.a;
                    }
                    if (catalogDataType != CatalogDataType.DATA_TYPE_GROUPS_ITEMS || catalogViewType2 != CatalogViewType.MAP_PREVIEW) {
                        return Boolean.valueOf(arrayList3.addAll(list2));
                    }
                    ListIterator listIterator2 = arrayList3.listIterator(arrayList3.size());
                    while (true) {
                        if (!listIterator2.hasPrevious()) {
                            break;
                        }
                        if (!((UIBlock) listIterator2.previous()).d.l()) {
                            i2 = listIterator2.nextIndex();
                            break;
                        }
                    }
                    Object b0 = j5g.b0(i2, arrayList3);
                    UIBlockHeader uIBlockHeader = b0 instanceof UIBlockHeader ? (UIBlockHeader) b0 : null;
                    if (uIBlockHeader != null) {
                        arrayList3.set(i2, new UIBlockHeader(com.vk.catalog2.common.dto.api.ui.a.a(sua.l(uIBlockHeader), null, null, CatalogViewType.SYNTHETIC_SEARCH_MAP_HEADER, null, null, null, 8187), uIBlockHeader.y, uIBlockHeader.z, uIBlockHeader.B, new mwp0(uIBlockHeader.C, uIBlockHeader.D, uIBlockHeader.E, uIBlockHeader.F, uIBlockHeader.G, uIBlockHeader.H, uIBlockHeader.I, uIBlockHeader.J, uIBlockHeader.K, uIBlockHeader.L), uIBlockHeader.A, null, 64, null));
                    }
                    return Boolean.valueOf(arrayList3.addAll(list2));
                }
            }.invoke();
            arrayList = arrayList2;
        }
        ArrayList arrayList3 = arrayList;
        bi20 f2 = f(catalogSection, CatalogDataType.DATA_SYNTHETIC_SECTION, CatalogViewType.LIST, catalogExtendedData, UserId.d);
        CatalogBadge catalogBadge = catalogSection.g;
        if (catalogBadge != null) {
            uIBlockBadge = A(f2, catalogBadge);
            gradient = null;
        } else {
            gradient = null;
            uIBlockBadge = null;
        }
        List<UIBlockAction> list2 = f2.l;
        boolean z = catalogSectionStyle != null ? catalogSectionStyle.b : false;
        CatalogHeaderStyle catalogHeaderStyle = catalogSection.m;
        if (catalogHeaderStyle != null && (titleGradient = catalogHeaderStyle.b) != null) {
            gradient = new CatalogTabStyle.Gradient(titleGradient.b, titleGradient.c, titleGradient.d, titleGradient.e);
        }
        return B0(this, f2, arrayList3, list2, uIBlockBadge, null, null, null, z, gradient, catalogSectionStyle != null ? catalogSectionStyle.c : false, null, catalogSection.n, 294896);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        if (r4 != null) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList R0(bi20 bi20Var, ArrayList arrayList, CatalogExtendedData catalogExtendedData) {
        Object obj;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            CatalogButton catalogButton = (CatalogButton) obj2;
            if ((catalogButton instanceof CatalogButtonImportContacts) || (catalogButton instanceof CatalogButtonAddFriends) || (catalogButton instanceof CatalogButtonFriendsCleanup)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (!arrayList2.isEmpty()) {
            arrayList3.addAll(O0(catalogExtendedData, arrayList2, bi20Var));
            CatalogFeatures catalogFeatures = CatalogFeatures.COM_FRIENDS;
            catalogFeatures.getClass();
            LayoutSize layoutSize = null;
            Object[] objArr = 0;
            if (com.vk.toggle.b.A.a(catalogFeatures) && arrayList.size() == 1) {
                ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    if (((CatalogButton) obj) instanceof CatalogButtonImportContacts) {
                        break;
                    }
                }
            }
            arrayList3.add(new UIBlockSeparator(new com.vk.catalog2.common.dto.api.ui.a(bi20Var.a, bi20Var.b, CatalogViewType.SEPARATOR, CatalogDataType.DATA_TYPE_NONE, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7680), layoutSize, 2, objArr == true ? 1 : 0));
            return arrayList3;
        }
        return arrayList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1173:0x15ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1177:0x157a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1404:0x1903  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0756 A[RETURN] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String, java.util.Map, org.json.JSONObject, xsna.zcl] */
    /* JADX WARN: Type inference failed for: r13v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<UIBlock> S0(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, List<CatalogBlock> list, String str) {
        UIBlockMusicTrack b0;
        UserId userId;
        Object obj;
        boolean z;
        Serializer.StreamParcelableAdapter V;
        Object obj2;
        Object obj3;
        UIBlockGroupsMapPreview.PreviewGroupItem previewGroupItem;
        GroupLikes zb;
        Object obj4;
        Object obj5;
        Object obj6;
        List T;
        bi20 e2 = e(catalogBlock, catalogExtendedData);
        CatalogBlockItemsData catalogBlockItemsData = catalogBlock.m;
        Bundle bundle = e2.p;
        CatalogDataType catalogDataType = catalogBlock.c;
        int i2 = 6;
        int i3 = 0;
        int i4 = 4;
        int i5 = 3;
        int i6 = 10;
        ConcertSliderViewStyle concertSliderViewStyle = null;
        switch (b.$EnumSwitchMapping$1[catalogDataType.ordinal()]) {
            case 1:
                return D0(catalogExtendedData, catalogBlock, e2);
            case 2:
            case 3:
            case 4:
                ArrayList Gb = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList = new ArrayList();
                Iterator it = Gb.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    VideoFile videoFile = next instanceof VideoFile ? (VideoFile) next : null;
                    if (videoFile != null) {
                        arrayList.add(videoFile);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    VideoFile videoFile2 = (VideoFile) it2.next();
                    k(videoFile2, catalogExtendedData);
                    arrayList2.add(videoFile2);
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    VideoFile videoFile3 = (VideoFile) it3.next();
                    String a1 = videoFile3.a1();
                    CatalogBlockStatInfo catalogBlockStatInfo = catalogBlock.s;
                    arrayList3.add(i(videoFile3, catalogBlockStatInfo != null ? catalogBlockStatInfo.b.get(a1) : null));
                }
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(K0(e2, (VideoFile) it4.next(), catalogBlock, catalogExtendedData));
                }
                return m(o(p(n(arrayList4, e2), e2), e2), e2);
            case 5:
                ArrayList Gb2 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList5 = new ArrayList();
                Iterator it5 = Gb2.iterator();
                while (it5.hasNext()) {
                    Object next2 = it5.next();
                    TopshelfItem topshelfItem = next2 instanceof TopshelfItem ? (TopshelfItem) next2 : null;
                    if (topshelfItem != null) {
                        arrayList5.add(topshelfItem);
                    }
                }
                return E0(catalogBlock, arrayList5, e2);
            case 6:
                ArrayList Gb3 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList6 = new ArrayList();
                Iterator it6 = Gb3.iterator();
                while (it6.hasNext()) {
                    Object next3 = it6.next();
                    VideoMusicStreamMixItem videoMusicStreamMixItem = next3 instanceof VideoMusicStreamMixItem ? (VideoMusicStreamMixItem) next3 : null;
                    if (videoMusicStreamMixItem != null) {
                        arrayList6.add(videoMusicStreamMixItem);
                    }
                }
                return C0(arrayList6, catalogBlock);
            case 7:
                ArrayList Gb4 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList7 = new ArrayList();
                Iterator it7 = Gb4.iterator();
                while (it7.hasNext()) {
                    Object next4 = it7.next();
                    QuestionnaireDto questionnaireDto = next4 instanceof QuestionnaireDto ? (QuestionnaireDto) next4 : null;
                    if (questionnaireDto != null) {
                        arrayList7.add(questionnaireDto);
                    }
                }
                ArrayList arrayList8 = new ArrayList(c5g.u(arrayList7, 10));
                Iterator it8 = arrayList7.iterator();
                while (it8.hasNext()) {
                    arrayList8.add(I0(e2, (QuestionnaireDto) it8.next()));
                }
                return arrayList8;
            case 8:
                if (b.$EnumSwitchMapping$0[catalogBlock.Kb().ordinal()] == 1) {
                    Object a0 = j5g.a0(catalogBlock.Gb(catalogExtendedData));
                    r13 = a0 instanceof VideoAlbum ? (VideoAlbum) a0 : 0;
                    if (r13 == 0) {
                        return e43.f();
                    }
                    rba Gb5 = catalogExtendedData.Gb(r13.q());
                    return (Gb5.a == null && Gb5.b == null) ? e43.f() : e43.k(L0(r13, Gb5, e2));
                }
                ArrayList Gb6 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList9 = new ArrayList();
                Iterator it9 = Gb6.iterator();
                while (it9.hasNext()) {
                    Object next5 = it9.next();
                    VideoAlbum videoAlbum = next5 instanceof VideoAlbum ? (VideoAlbum) next5 : null;
                    if (videoAlbum != null) {
                        arrayList9.add(videoAlbum);
                    }
                }
                ArrayList arrayList10 = new ArrayList(c5g.u(arrayList9, 10));
                Iterator it10 = arrayList9.iterator();
                while (it10.hasNext()) {
                    VideoAlbum videoAlbum2 = (VideoAlbum) it10.next();
                    arrayList10.add(v(e2, videoAlbum2, catalogExtendedData.Gb(videoAlbum2.q()), catalogBlock.Eb()));
                }
                return arrayList10;
            case 9:
                ArrayList Gb7 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList11 = new ArrayList();
                Iterator it11 = Gb7.iterator();
                while (it11.hasNext()) {
                    Object next6 = it11.next();
                    LiveCategory liveCategory = next6 instanceof LiveCategory ? (LiveCategory) next6 : null;
                    if (liveCategory != null) {
                        arrayList11.add(liveCategory);
                    }
                }
                ArrayList arrayList12 = new ArrayList(c5g.u(arrayList11, 10));
                Iterator it12 = arrayList11.iterator();
                while (it12.hasNext()) {
                    arrayList12.add(Q(e2, (LiveCategory) it12.next()));
                }
                return arrayList12;
            case 10:
                ArrayList Gb8 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList13 = new ArrayList();
                Iterator it13 = Gb8.iterator();
                while (it13.hasNext()) {
                    Object next7 = it13.next();
                    CatalogLink catalogLink = next7 instanceof CatalogLink ? (CatalogLink) next7 : null;
                    if (catalogLink != null) {
                        arrayList13.add(catalogLink);
                    }
                }
                ArrayList arrayList14 = new ArrayList(c5g.u(arrayList13, 10));
                Iterator it14 = arrayList13.iterator();
                while (it14.hasNext()) {
                    CatalogLink catalogLink2 = (CatalogLink) it14.next();
                    int i7 = b.$EnumSwitchMapping$0[e2.g().ordinal()];
                    arrayList14.add(i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? N(e2, catalogLink2) : D(e2, catalogLink2) : P(e2, catalogLink2) : O(e2, catalogLink2) : M(e2, catalogLink2));
                }
                switch (b.$EnumSwitchMapping$0[e2.g().ordinal()]) {
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        return F0(arrayList14, e2);
                    case 11:
                    case 12:
                    case 13:
                        return e43.k(B0(this, e2, arrayList14, e43.f(), null, null, null, null, false, null, false, null, null, 1048568));
                    default:
                        return arrayList14;
                }
            case 11:
                ArrayList Gb9 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList15 = new ArrayList();
                Iterator it15 = Gb9.iterator();
                while (it15.hasNext()) {
                    Object next8 = it15.next();
                    ApiApplication apiApplication = next8 instanceof ApiApplication ? (ApiApplication) next8 : null;
                    if (apiApplication != null) {
                        arrayList15.add(apiApplication);
                    }
                }
                ArrayList arrayList16 = new ArrayList(c5g.u(arrayList15, 10));
                Iterator it16 = arrayList15.iterator();
                while (it16.hasNext()) {
                    arrayList16.add(w(e2, (ApiApplication) it16.next()));
                }
                return arrayList16;
            case 12:
                return rli0.A(rli0.t(rli0.t(j5g.N(catalogBlock.Gb(catalogExtendedData)), new qcw(9)), new x4c(catalogBlock, this, e2, i2)));
            case 13:
            case 14:
                ArrayList Gb10 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList17 = new ArrayList();
                Iterator it17 = Gb10.iterator();
                while (it17.hasNext()) {
                    Object next9 = it17.next();
                    MusicTrack musicTrack = next9 instanceof MusicTrack ? (MusicTrack) next9 : null;
                    if (musicTrack != null) {
                        arrayList17.add(musicTrack);
                    }
                }
                bi20 a2 = (e2.g() == CatalogViewType.TRIPLE_STACKED_SLIDER && arrayList17.size() <= 3) || (e2.g() == CatalogViewType.DOUBLE_STACKED_SLIDER && arrayList17.size() <= 2) ? bi20.a(e2, null, CatalogViewType.SYNTHETIC_MUSIC_TRACK_LIST, null, null, null, null, 33554423) : e2;
                MusicTrackCatalogViewStyle musicTrackCatalogViewStyle = new MusicTrackCatalogViewStyle(a2.p.getString(CatalogCustomAttributes$Keys.STYLE.h()));
                ArrayList arrayList18 = new ArrayList(c5g.u(arrayList17, 10));
                Iterator it18 = arrayList17.iterator();
                while (it18.hasNext()) {
                    MusicTrack musicTrack2 = (MusicTrack) it18.next();
                    if (musicTrackCatalogViewStyle.b == MusicTrackCatalogViewStyle.Style.FoundByLyrics) {
                        Object Ab = catalogExtendedData.Ab(CatalogDataType.DATA_TYPE_TEXTS, musicTrack2.Fb());
                        CatalogText catalogText = Ab instanceof CatalogText ? (CatalogText) Ab : null;
                        b0 = a0(a2, musicTrack2, musicTrackCatalogViewStyle, catalogText != null ? catalogText.getText() : null);
                    } else {
                        b0 = b0(a2, musicTrack2, musicTrackCatalogViewStyle, 8);
                    }
                    arrayList18.add(b0);
                }
                return p(arrayList18, a2);
            case 15:
                return P0(catalogExtendedData, catalogBlock, e2);
            case 16:
                ArrayList Gb11 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList19 = new ArrayList();
                Iterator it19 = Gb11.iterator();
                while (it19.hasNext()) {
                    Object next10 = it19.next();
                    PlaylistRecommendationData playlistRecommendationData = next10 instanceof PlaylistRecommendationData ? (PlaylistRecommendationData) next10 : null;
                    if (playlistRecommendationData != null) {
                        arrayList19.add(playlistRecommendationData);
                    }
                }
                ArrayList arrayList20 = new ArrayList(c5g.u(arrayList19, 10));
                Iterator it20 = arrayList19.iterator();
                while (it20.hasNext()) {
                    PlaylistRecommendationData playlistRecommendationData2 = (PlaylistRecommendationData) it20.next();
                    Playlist zb2 = playlistRecommendationData2.zb();
                    RecommendedPlaylist Ab2 = playlistRecommendationData2.Ab();
                    PlaylistLink playlistLink = zb2.f;
                    if (playlistLink == null || (userId = playlistLink.q()) == null) {
                        userId = zb2.c;
                    }
                    rba Gb12 = catalogExtendedData.Gb(fkq0.a(userId));
                    UserProfile a3 = Gb12.a();
                    Group b2 = Gb12.b();
                    zb2.q = a3 != null ? new PlaylistOwner(a3) : b2 != null ? new PlaylistOwner(b2) : null;
                    List<String> list2 = Ab2.g;
                    ArrayList arrayList21 = new ArrayList();
                    Iterator<T> it21 = list2.iterator();
                    while (it21.hasNext()) {
                        Object Ab3 = catalogExtendedData.Ab(CatalogDataType.DATA_TYPE_MUSIC_TRACKS, (String) it21.next());
                        MusicTrack musicTrack3 = Ab3 instanceof MusicTrack ? (MusicTrack) Ab3 : null;
                        if (musicTrack3 != null) {
                            arrayList21.add(musicTrack3);
                        }
                    }
                    zb2.y = arrayList21;
                    arrayList20.add(Y(e2, zb2, Ab2));
                }
                return arrayList20;
            case 17:
                ArrayList Gb13 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList22 = new ArrayList();
                Iterator it22 = Gb13.iterator();
                while (it22.hasNext()) {
                    Object next11 = it22.next();
                    CatalogAudioContentCard catalogAudioContentCard = next11 instanceof CatalogAudioContentCard ? (CatalogAudioContentCard) next11 : null;
                    if (catalogAudioContentCard != null) {
                        arrayList22.add(catalogAudioContentCard);
                    }
                }
                ArrayList arrayList23 = new ArrayList();
                Iterator it23 = arrayList22.iterator();
                while (it23.hasNext()) {
                    UIBlockAudioContentCard z2 = z(e2, (CatalogAudioContentCard) it23.next(), catalogExtendedData);
                    if (z2 != null) {
                        arrayList23.add(z2);
                    }
                }
                return arrayList23;
            case 18:
                ArrayList Gb14 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList24 = new ArrayList();
                Iterator it24 = Gb14.iterator();
                while (it24.hasNext()) {
                    Object next12 = it24.next();
                    Artist artist = next12 instanceof Artist ? (Artist) next12 : null;
                    if (artist != null) {
                        arrayList24.add(artist);
                    }
                }
                ArrayList arrayList25 = new ArrayList(c5g.u(arrayList24, 10));
                Iterator it25 = arrayList24.iterator();
                while (it25.hasNext()) {
                    Artist artist2 = (Artist) it25.next();
                    if (e2.g() == CatalogViewType.BIOGRAPHY_LAYOUT) {
                        V = x(e2, artist2);
                    } else {
                        Iterator<T> it26 = e2.e().iterator();
                        while (true) {
                            if (it26.hasNext()) {
                                obj = it26.next();
                                if (((UIBlockAction) obj) instanceof UIBlockActionPlayAudiosFromBlock) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock = (UIBlockActionPlayAudiosFromBlock) obj;
                        String str2 = (String) j5g.a0(catalogBlock.Ib());
                        if (str2 != null) {
                            Object Ab4 = catalogExtendedData.Ab(CatalogDataType.DATA_TYPE_GROUPS, str2);
                            Group group = Ab4 instanceof Group ? (Group) Ab4 : null;
                            if (group != null) {
                                z = group.j;
                                if (z) {
                                    str2 = null;
                                }
                                V = V(e2, artist2, uIBlockActionPlayAudiosFromBlock, str2);
                            }
                        }
                        z = false;
                        if (z) {
                        }
                        V = V(e2, artist2, uIBlockActionPlayAudiosFromBlock, str2);
                    }
                    arrayList25.add(V);
                }
                return arrayList25;
            case 19:
                ArrayList Gb15 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList26 = new ArrayList();
                Iterator it27 = Gb15.iterator();
                while (it27.hasNext()) {
                    Object next13 = it27.next();
                    Curator curator = next13 instanceof Curator ? (Curator) next13 : null;
                    if (curator != null) {
                        arrayList26.add(curator);
                    }
                }
                ArrayList arrayList27 = new ArrayList(c5g.u(arrayList26, 10));
                Iterator it28 = arrayList26.iterator();
                while (it28.hasNext()) {
                    Curator curator2 = (Curator) it28.next();
                    Iterator<T> it29 = e2.e().iterator();
                    while (true) {
                        if (it29.hasNext()) {
                            obj2 = it29.next();
                            if (((UIBlockAction) obj2) instanceof UIBlockActionPlayAudiosFromBlock) {
                                break;
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    arrayList27.add(W(e2, curator2, (UIBlockActionPlayAudiosFromBlock) obj2));
                }
                return arrayList27;
            case 20:
                Iterator it30 = catalogBlock.Gb(catalogExtendedData).iterator();
                while (true) {
                    if (it30.hasNext()) {
                        obj3 = it30.next();
                        if (obj3 instanceof AudioFollowingsUpdateInfo) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                AudioFollowingsUpdateInfo audioFollowingsUpdateInfo = obj3 instanceof AudioFollowingsUpdateInfo ? (AudioFollowingsUpdateInfo) obj3 : null;
                return audioFollowingsUpdateInfo == null ? e43.f() : e43.k(U(e2, audioFollowingsUpdateInfo, (UIBlockAction) j5g.a0(O0(catalogExtendedData, catalogBlock.Bb(), e2))));
            case 21:
                ArrayList Gb16 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList28 = new ArrayList();
                Iterator it31 = Gb16.iterator();
                while (it31.hasNext()) {
                    Object next14 = it31.next();
                    AudioFollowingsUpdateItem audioFollowingsUpdateItem = next14 instanceof AudioFollowingsUpdateItem ? (AudioFollowingsUpdateItem) next14 : null;
                    if (audioFollowingsUpdateItem != null) {
                        arrayList28.add(audioFollowingsUpdateItem);
                    }
                }
                ArrayList arrayList29 = new ArrayList(c5g.u(arrayList28, 10));
                Iterator it32 = arrayList28.iterator();
                while (it32.hasNext()) {
                    arrayList29.add(X(e2, (AudioFollowingsUpdateItem) it32.next()));
                }
                return arrayList29;
            case 22:
                if (b.$EnumSwitchMapping$0[catalogBlock.Kb().ordinal()] != 14) {
                    ArrayList Gb17 = catalogBlock.Gb(catalogExtendedData);
                    ArrayList arrayList30 = new ArrayList();
                    Iterator it33 = Gb17.iterator();
                    while (it33.hasNext()) {
                        Object next15 = it33.next();
                        Group group2 = next15 instanceof Group ? (Group) next15 : null;
                        if (group2 != null) {
                            arrayList30.add(group2);
                        }
                    }
                    ArrayList arrayList31 = new ArrayList(c5g.u(arrayList30, 10));
                    Iterator it34 = arrayList30.iterator();
                    while (it34.hasNext()) {
                        arrayList31.add(G(e2, (Group) it34.next(), null, 60));
                    }
                    return arrayList31;
                }
                ArrayList O0 = O0(catalogExtendedData, catalogBlock.Bb(), e2);
                ArrayList Gb18 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList32 = new ArrayList();
                Iterator it35 = Gb18.iterator();
                while (it35.hasNext()) {
                    Object next16 = it35.next();
                    Group group3 = next16 instanceof Group ? (Group) next16 : null;
                    if (group3 != null) {
                        arrayList32.add(group3);
                    }
                }
                ArrayList arrayList33 = new ArrayList(c5g.u(arrayList32, 10));
                Iterator it36 = arrayList32.iterator();
                while (it36.hasNext()) {
                    arrayList33.add(((Group) it36.next()).e);
                }
                return e43.k(i0(e2, arrayList33, O0));
            case 23:
                if (b.$EnumSwitchMapping$0[catalogBlock.Kb().ordinal()] != 3) {
                    ArrayList Gb19 = catalogBlock.Gb(catalogExtendedData);
                    ArrayList arrayList34 = new ArrayList();
                    Iterator it37 = Gb19.iterator();
                    while (it37.hasNext()) {
                        Object next17 = it37.next();
                        Group group4 = next17 instanceof Group ? (Group) next17 : null;
                        if (group4 != null) {
                            arrayList34.add(group4);
                        }
                    }
                    ArrayList arrayList35 = new ArrayList(c5g.u(arrayList34, 10));
                    Iterator it38 = arrayList34.iterator();
                    while (it38.hasNext()) {
                        arrayList35.add(G(e2, (Group) it38.next(), null, 60));
                    }
                    return arrayList35;
                }
                ArrayList Gb20 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList36 = new ArrayList();
                Iterator it39 = Gb20.iterator();
                while (it39.hasNext()) {
                    Object next18 = it39.next();
                    Group group5 = next18 instanceof Group ? (Group) next18 : null;
                    if (group5 != null) {
                        arrayList36.add(group5);
                    }
                }
                ArrayList arrayList37 = new ArrayList(c5g.u(arrayList36, 10));
                Iterator it40 = arrayList36.iterator();
                while (it40.hasNext()) {
                    Group group6 = (Group) it40.next();
                    Object zb3 = catalogBlockItemsData.zb(group6.c);
                    arrayList37.add(G(e2, group6, zb3 instanceof GroupCatalogItem ? (GroupCatalogItem) zb3 : null, 56));
                }
                ArrayList arrayList38 = new ArrayList(arrayList37);
                c(catalogBlock, arrayList38, e2);
                return arrayList38;
            case 24:
                bi20 bi20Var = e2;
                int i8 = b.$EnumSwitchMapping$0[catalogBlock.Kb().ordinal()];
                if (i8 == 14) {
                    ArrayList O02 = O0(catalogExtendedData, catalogBlock.Bb(), bi20Var);
                    ArrayList Gb21 = catalogBlock.Gb(catalogExtendedData);
                    ArrayList arrayList39 = new ArrayList();
                    Iterator it41 = Gb21.iterator();
                    while (it41.hasNext()) {
                        Object next19 = it41.next();
                        Group group7 = next19 instanceof Group ? (Group) next19 : null;
                        if (group7 != null) {
                            arrayList39.add(group7);
                        }
                    }
                    ArrayList arrayList40 = new ArrayList(c5g.u(arrayList39, 10));
                    Iterator it42 = arrayList39.iterator();
                    while (it42.hasNext()) {
                        arrayList40.add(((Group) it42.next()).e);
                    }
                    return e43.k(i0(bi20Var, arrayList40, O02));
                }
                if (i8 == 15) {
                    List<String> list3 = catalogBlockItemsData.c;
                    ArrayList arrayList41 = new ArrayList();
                    for (String str3 : list3) {
                        Object zb4 = catalogBlockItemsData.zb(str3);
                        GroupCatalogItem groupCatalogItem = zb4 instanceof GroupCatalogItem ? (GroupCatalogItem) zb4 : null;
                        if (groupCatalogItem != null) {
                            Object Ab5 = catalogExtendedData.Ab(catalogDataType, str3);
                            Group group8 = Ab5 instanceof Group ? (Group) Ab5 : null;
                            if (group8 != null) {
                                previewGroupItem = new UIBlockGroupsMapPreview.PreviewGroupItem(group8, groupCatalogItem);
                                if (previewGroupItem == null) {
                                    arrayList41.add(previewGroupItem);
                                }
                            }
                        }
                        previewGroupItem = null;
                        if (previewGroupItem == null) {
                        }
                    }
                    return e43.k(R(catalogBlock, arrayList41, bi20Var));
                }
                ArrayList Gb22 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList42 = new ArrayList();
                Iterator it43 = Gb22.iterator();
                while (it43.hasNext()) {
                    Object next20 = it43.next();
                    Group group9 = next20 instanceof Group ? (Group) next20 : null;
                    if (group9 != null) {
                        arrayList42.add(group9);
                    }
                }
                int size = arrayList42.size();
                ArrayList arrayList43 = new ArrayList(c5g.u(arrayList42, 10));
                Iterator it44 = arrayList42.iterator();
                while (it44.hasNext()) {
                    Group group10 = (Group) it44.next();
                    Object zb5 = catalogBlockItemsData.zb(group10.c);
                    GroupCatalogItem groupCatalogItem2 = zb5 instanceof GroupCatalogItem ? (GroupCatalogItem) zb5 : null;
                    if (groupCatalogItem2 != null && (zb = groupCatalogItem2.zb()) != null) {
                        Iterator<UserId> it45 = zb.f.iterator();
                        while (it45.hasNext()) {
                            UserProfile userProfile = catalogExtendedData.Gb(it45.next()).a;
                            if (userProfile != null) {
                                zb.e.add(userProfile);
                                s3q0 s3q0Var = s3q0.a;
                            }
                        }
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                    CatalogViewType g2 = bi20Var.g();
                    if (g2 == CatalogViewType.TRIPLE_STACKED_SLIDER && size <= 3) {
                        g2 = CatalogViewType.SYNTHETIC_GROUP_ITEM_BIG;
                    }
                    bi20 bi20Var2 = bi20Var;
                    arrayList43.add(F(bi20Var2, group10, groupCatalogItem2, catalogBlock.Ab(), catalogBlock.Jb(), g2));
                    bi20Var = bi20Var2;
                }
                bi20 bi20Var3 = bi20Var;
                return l(n(m(arrayList43, bi20Var3), bi20Var3), catalogExtendedData, catalogBlock, bi20Var3, size);
            case 25:
                ArrayList Gb23 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList44 = new ArrayList();
                Iterator it46 = Gb23.iterator();
                while (it46.hasNext()) {
                    Object next21 = it46.next();
                    GroupCollection groupCollection = next21 instanceof GroupCollection ? (GroupCollection) next21 : null;
                    if (groupCollection != null) {
                        arrayList44.add(groupCollection);
                    }
                }
                ArrayList arrayList45 = new ArrayList(c5g.u(arrayList44, 10));
                Iterator it47 = arrayList44.iterator();
                while (it47.hasNext()) {
                    arrayList45.add(x0(e2, catalogBlock, catalogExtendedData, (GroupCollection) it47.next()));
                }
                return arrayList45;
            case 26:
                CatalogBlock catalogBlock2 = catalogBlock;
                CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
                if (b.$EnumSwitchMapping$0[catalogBlock2.Kb().ordinal()] != 16) {
                    ArrayList Gb24 = catalogBlock.Gb(catalogExtendedData);
                    ArrayList arrayList46 = new ArrayList();
                    Iterator it48 = Gb24.iterator();
                    while (it48.hasNext()) {
                        Object next22 = it48.next();
                        GroupsCategory groupsCategory = next22 instanceof GroupsCategory ? (GroupsCategory) next22 : null;
                        if (groupsCategory != null) {
                            arrayList46.add(groupsCategory);
                        }
                    }
                    ArrayList arrayList47 = new ArrayList(c5g.u(arrayList46, 10));
                    Iterator it49 = arrayList46.iterator();
                    while (it49.hasNext()) {
                        arrayList47.add(v0(e2, catalogBlock, catalogExtendedData, (GroupsCategory) it49.next(), false));
                    }
                    return arrayList47;
                }
                ArrayList Gb25 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList48 = new ArrayList();
                Iterator it50 = Gb25.iterator();
                while (it50.hasNext()) {
                    Object next23 = it50.next();
                    GroupsCategory groupsCategory2 = next23 instanceof GroupsCategory ? (GroupsCategory) next23 : null;
                    if (groupsCategory2 != null) {
                        arrayList48.add(groupsCategory2);
                    }
                }
                ArrayList arrayList49 = new ArrayList(c5g.u(arrayList48, 10));
                Iterator it51 = arrayList48.iterator();
                while (it51.hasNext()) {
                    arrayList49.add(v0(e2, catalogBlock2, catalogExtendedData2, (GroupsCategory) it51.next(), true));
                    catalogBlock2 = catalogBlock;
                    catalogExtendedData2 = catalogExtendedData;
                }
                return arrayList49;
            case 27:
                ArrayList Gb26 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList50 = new ArrayList();
                Iterator it52 = Gb26.iterator();
                while (it52.hasNext()) {
                    Object next24 = it52.next();
                    Group group11 = next24 instanceof Group ? (Group) next24 : null;
                    if (group11 != null) {
                        arrayList50.add(group11);
                    }
                }
                ArrayList arrayList51 = new ArrayList(c5g.u(arrayList50, 10));
                Iterator it53 = arrayList50.iterator();
                while (it53.hasNext()) {
                    arrayList51.add(G(e2, (Group) it53.next(), null, 60));
                }
                return arrayList51;
            case 28:
                ArrayList Gb27 = catalogBlock.Gb(catalogExtendedData);
                if (!Gb27.isEmpty()) {
                    Iterator it54 = Gb27.iterator();
                    while (it54.hasNext()) {
                        if (it54.next() instanceof StickerPackPreviewWithStickerId) {
                            ArrayList arrayList52 = new ArrayList();
                            Iterator it55 = Gb27.iterator();
                            while (it55.hasNext()) {
                                Object next25 = it55.next();
                                StickerPackPreviewWithStickerId stickerPackPreviewWithStickerId = next25 instanceof StickerPackPreviewWithStickerId ? (StickerPackPreviewWithStickerId) next25 : null;
                                if (stickerPackPreviewWithStickerId != null) {
                                    arrayList52.add(stickerPackPreviewWithStickerId);
                                }
                            }
                            ArrayList arrayList53 = new ArrayList(c5g.u(arrayList52, 10));
                            Iterator it56 = arrayList52.iterator();
                            while (it56.hasNext()) {
                                arrayList53.add(o0(e2, (StickerPackPreviewWithStickerId) it56.next()));
                            }
                            return arrayList53;
                        }
                    }
                }
                ArrayList arrayList54 = new ArrayList();
                Iterator it57 = Gb27.iterator();
                while (it57.hasNext()) {
                    Object next26 = it57.next();
                    StickerStockItemWithStickerId stickerStockItemWithStickerId = next26 instanceof StickerStockItemWithStickerId ? (StickerStockItemWithStickerId) next26 : null;
                    if (stickerStockItemWithStickerId != null) {
                        arrayList54.add(stickerStockItemWithStickerId);
                    }
                }
                ArrayList arrayList55 = new ArrayList(c5g.u(arrayList54, 10));
                Iterator it58 = arrayList54.iterator();
                while (it58.hasNext()) {
                    arrayList55.add(n0(e2, (StickerStockItemWithStickerId) it58.next()));
                }
                return arrayList55;
            case 29:
                ArrayList Gb28 = catalogBlock.Gb(catalogExtendedData);
                if (!Gb28.isEmpty()) {
                    Iterator it59 = Gb28.iterator();
                    while (it59.hasNext()) {
                        if (it59.next() instanceof StickerPackPreview) {
                            ArrayList arrayList56 = new ArrayList();
                            Iterator it60 = Gb28.iterator();
                            while (it60.hasNext()) {
                                Object next27 = it60.next();
                                StickerPackPreview stickerPackPreview = next27 instanceof StickerPackPreview ? (StickerPackPreview) next27 : null;
                                if (stickerPackPreview != null) {
                                    arrayList56.add(stickerPackPreview);
                                }
                            }
                            ArrayList arrayList57 = new ArrayList(c5g.u(arrayList56, 10));
                            Iterator it61 = arrayList56.iterator();
                            while (it61.hasNext()) {
                                arrayList57.add(q0(e2, (StickerPackPreview) it61.next()));
                            }
                            return arrayList57;
                        }
                    }
                }
                ArrayList arrayList58 = new ArrayList();
                Iterator it62 = Gb28.iterator();
                while (it62.hasNext()) {
                    Object next28 = it62.next();
                    StickerStockItem stickerStockItem = next28 instanceof StickerStockItem ? (StickerStockItem) next28 : null;
                    if (stickerStockItem != null) {
                        arrayList58.add(stickerStockItem);
                    }
                }
                ArrayList arrayList59 = new ArrayList(c5g.u(arrayList58, 10));
                Iterator it63 = arrayList58.iterator();
                while (it63.hasNext()) {
                    arrayList59.add(p0(e2, (StickerStockItem) it63.next()));
                }
                return arrayList59;
            case 30:
                ArrayList Gb29 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList60 = new ArrayList();
                Iterator it64 = Gb29.iterator();
                while (it64.hasNext()) {
                    Object next29 = it64.next();
                    Banner banner = next29 instanceof Banner ? (Banner) next29 : null;
                    if (banner != null) {
                        arrayList60.add(banner);
                    }
                }
                ArrayList arrayList61 = new ArrayList(c5g.u(arrayList60, 10));
                Iterator it65 = arrayList60.iterator();
                while (it65.hasNext()) {
                    arrayList61.add(m0(e2, (Banner) it65.next()));
                }
                return arrayList61;
            case 31:
                ArrayList Gb30 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList62 = new ArrayList();
                Iterator it66 = Gb30.iterator();
                while (it66.hasNext()) {
                    Object next30 = it66.next();
                    StickersInfo stickersInfo = next30 instanceof StickersInfo ? (StickersInfo) next30 : null;
                    if (stickersInfo != null) {
                        arrayList62.add(stickersInfo);
                    }
                }
                ArrayList arrayList63 = new ArrayList();
                Iterator it67 = arrayList62.iterator();
                while (it67.hasNext()) {
                    StickersBonusBalance zb6 = ((StickersInfo) it67.next()).zb();
                    if (zb6 != null) {
                        arrayList63.add(zb6);
                    }
                }
                ArrayList arrayList64 = new ArrayList(c5g.u(arrayList63, 10));
                Iterator it68 = arrayList63.iterator();
                while (it68.hasNext()) {
                    arrayList64.add(r0(e2, (StickersBonusBalance) it68.next()));
                }
                return arrayList64;
            case 32:
                int i9 = b.$EnumSwitchMapping$0[catalogBlock.Kb().ordinal()];
                if (i9 != 4) {
                    switch (i9) {
                        case 16:
                            List Bb = catalogBlock.Bb();
                            return !Bb.isEmpty() ? e43.k(K(O0(catalogExtendedData, Bb, e2), e2)) : e43.f();
                        case 17:
                            return O0(catalogExtendedData, catalogBlock.Bb(), e2);
                        case 18:
                            return R0(e2, catalogBlock.Bb(), catalogExtendedData);
                        case 19:
                            return e43.k(E(e2, catalogBlock.Bb(), catalogExtendedData));
                        case 20:
                            String str4 = e2.a;
                            CatalogViewType catalogViewType = CatalogViewType.SYNTHETIC_SUBNAVIGATION_CONTAINER;
                            CatalogDataType catalogDataType2 = CatalogDataType.DATA_TYPE_ACTION;
                            String str5 = e2.k;
                            UserId userId2 = e2.e;
                            List<String> list4 = e2.j;
                            Set<UIBlockDragDropAction> set = e2.m;
                            UIBlockHint uIBlockHint = e2.o;
                            ArrayList<CatalogButton> Bb2 = catalogBlock.Bb();
                            ArrayList arrayList65 = new ArrayList();
                            for (Object obj7 : Bb2) {
                                if (obj7 instanceof CatalogButtonFilters) {
                                    arrayList65.add(obj7);
                                }
                            }
                            ArrayList arrayList66 = new ArrayList();
                            Iterator it69 = arrayList65.iterator();
                            while (it69.hasNext()) {
                                g5g.y(r(this, e2, (CatalogButtonFilters) it69.next(), catalogBlock.b, null, str, 8), arrayList66);
                            }
                            return e43.k(new UIBlockButtons(str4, catalogViewType, catalogDataType2, str5, userId2, list4, set, uIBlockHint, arrayList66, null));
                        case 21:
                            ArrayList<CatalogButton> Bb3 = catalogBlock.Bb();
                            ArrayList arrayList67 = new ArrayList();
                            for (CatalogButton catalogButton : Bb3) {
                                UIBlockPlayMixAction u0 = catalogButton instanceof CatalogButtonPlayMix ? u0(e2, CatalogViewType.SYNTHETIC_ACTION_PLAY_MIX, (CatalogButtonPlayMix) catalogButton) : null;
                                if (u0 != null) {
                                    arrayList67.add(u0);
                                }
                            }
                            return arrayList67;
                        case 22:
                            Object a02 = j5g.a0(catalogBlock.Bb());
                            CatalogButtonFilters catalogButtonFilters = a02 instanceof CatalogButtonFilters ? (CatalogButtonFilters) a02 : null;
                            if (catalogButtonFilters != null) {
                                return e43.k(new UIBlockButtons(e2.a, CatalogViewType.SUBSECTION_TABS, e2.c, e2.k, e2.e, e2.j, e2.m, e2.o, r(this, e2, catalogButtonFilters, catalogBlock.b, CatalogViewType.SUBSECTION_FILTER_BUTTON, null, 16), h(catalogButtonFilters)));
                            }
                            return e43.f();
                        case 23:
                            if (this.c) {
                                List<UIBlockAction> e3 = e2.e();
                                if (!(e3 instanceof Collection) || !e3.isEmpty()) {
                                    for (UIBlockAction uIBlockAction : e3) {
                                        if (uIBlockAction instanceof UIBlockActionSaveAsPlaylistFromBlock) {
                                            CatalogViewStyle Lb = uIBlockAction.Lb();
                                            SavePlaylistViewStyle savePlaylistViewStyle = Lb instanceof SavePlaylistViewStyle ? (SavePlaylistViewStyle) Lb : null;
                                            if ((savePlaylistViewStyle != null ? savePlaylistViewStyle.zb() : null) == SavePlaylistViewStyle.Style.MyMusic) {
                                            }
                                        }
                                    }
                                }
                                return e2.e();
                            }
                            return e43.k(l0(e2, e2.e(), null, 12));
                        default:
                            return (e2.e().size() == 1 && ((UIBlockAction) j5g.Y(e2.e())).Mb() == CatalogViewType.SYNTHETIC_HEADER_CLEAR_TRACKS) ? e2.e() : e43.k(l0(e2, e2.e(), null, 12));
                    }
                }
                w060 w060Var = this;
                ArrayList<CatalogButton> Bb4 = catalogBlock.Bb();
                if (Bb4 == null || !Bb4.isEmpty()) {
                    Iterator<T> it70 = Bb4.iterator();
                    while (it70.hasNext()) {
                        if (((CatalogButton) it70.next()) instanceof CatalogShowFiltersButton) {
                            return w060Var.t(e2, catalogBlock);
                        }
                    }
                }
                String f2 = e2.f();
                OpenSectionViewStyle.ButtonStyle buttonStyle = OpenSectionViewStyle.ButtonStyle.SearchNavigationLinks;
                if (epx.f(f2, buttonStyle.h())) {
                    String str6 = e2.a;
                    CatalogViewType catalogViewType2 = CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION;
                    OpenSectionViewStyle openSectionViewStyle = new OpenSectionViewStyle(buttonStyle, OpenSectionViewStyle.ButtonIcon.NONE);
                    CatalogDataType catalogDataType3 = e2.c;
                    String str7 = e2.k;
                    UserId userId3 = e2.e;
                    List<String> list5 = e2.j;
                    Set<UIBlockDragDropAction> set2 = e2.m;
                    UIBlockHint uIBlockHint2 = e2.o;
                    List<UIBlockAction> e4 = e2.e();
                    ArrayList arrayList68 = new ArrayList();
                    for (Object obj8 : e4) {
                        if (obj8 instanceof UIBlockActionOpenSection) {
                            arrayList68.add(obj8);
                        }
                    }
                    return arrayList68.isEmpty() ? e43.f() : e43.k(new UIBlockButtons(str6, catalogViewType2, catalogDataType3, str7, userId3, list5, set2, uIBlockHint2, arrayList68, openSectionViewStyle));
                }
                ArrayList<CatalogButton> Bb5 = catalogBlock.Bb();
                if (Bb5 == null || !Bb5.isEmpty()) {
                    Iterator<T> it71 = Bb5.iterator();
                    while (it71.hasNext()) {
                        if (((CatalogButton) it71.next()) instanceof CatalogButtonOpenSection) {
                            List<UIBlockAction> e5 = e2.e();
                            ArrayList arrayList69 = new ArrayList();
                            for (Object obj9 : e5) {
                                if (obj9 instanceof UIBlockActionOpenSection) {
                                    arrayList69.add(obj9);
                                }
                            }
                            ArrayList arrayList70 = new ArrayList(c5g.u(arrayList69, 10));
                            Iterator it72 = arrayList69.iterator();
                            while (true) {
                                int i10 = i3;
                                if (!it72.hasNext()) {
                                    return arrayList70;
                                }
                                Object next31 = it72.next();
                                i3 = i10 + 1;
                                if (i10 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                UIBlockActionOpenSection uIBlockActionOpenSection = (UIBlockActionOpenSection) next31;
                                arrayList70.add(new UIBlockActionOpenSection(com.vk.catalog2.common.dto.api.ui.a.a(e2.c(CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION_CHIP), e2.a + '_' + i10, null, null, null, null, null, 8190), uIBlockActionOpenSection.Qb(), uIBlockActionOpenSection.getTitle(), uIBlockActionOpenSection.Xb(), uIBlockActionOpenSection.Vb(), uIBlockActionOpenSection.r(), uIBlockActionOpenSection.Sb(), uIBlockActionOpenSection.Ub(), uIBlockActionOpenSection.Tb(), uIBlockActionOpenSection.Wb()));
                            }
                        }
                    }
                }
                ArrayList<CatalogButton> Bb6 = catalogBlock.Bb();
                ArrayList arrayList71 = new ArrayList();
                for (Object obj10 : Bb6) {
                    if (obj10 instanceof CatalogButtonFilters) {
                        arrayList71.add(obj10);
                    }
                }
                ArrayList arrayList72 = new ArrayList();
                Iterator it73 = arrayList71.iterator();
                while (it73.hasNext()) {
                    g5g.y(r(w060Var, e2, (CatalogButtonFilters) it73.next(), catalogBlock.b, null, str, 8), arrayList72);
                    w060Var = this;
                }
                return arrayList72;
            case 33:
                int i11 = b.$EnumSwitchMapping$0[catalogBlock.Kb().ordinal()];
                if (i11 != 2) {
                    switch (i11) {
                        case 24:
                            CatalogStateInfo a4 = a.a(catalogBlock, catalogExtendedData);
                            return a4 == null ? e43.f() : e43.k(g0(bi20.a(e2, g(a4), CatalogViewType.LIST, null, null, null, null, 33554419), a4, catalogExtendedData));
                        case 25:
                            CatalogHint Cb = catalogExtendedData.Cb(catalogBlock.Cb());
                            return Cb == null ? e43.f() : e43.k(J(e2, Cb, catalogExtendedData));
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                            break;
                        case 37:
                            ArrayList Gb31 = catalogBlock.Gb(catalogExtendedData);
                            ArrayList arrayList73 = new ArrayList();
                            Iterator it74 = Gb31.iterator();
                            while (it74.hasNext()) {
                                Object next32 = it74.next();
                                if (next32 instanceof CatalogStateInfo) {
                                    arrayList73.add(next32);
                                }
                            }
                            ArrayList arrayList74 = new ArrayList(c5g.u(arrayList73, 10));
                            Iterator it75 = arrayList73.iterator();
                            while (it75.hasNext()) {
                                arrayList74.add(g0(e2, (CatalogStateInfo) it75.next(), catalogExtendedData));
                            }
                            return arrayList74;
                        case 38:
                            ArrayList Gb32 = catalogBlock.Gb(catalogExtendedData);
                            ArrayList arrayList75 = new ArrayList();
                            Iterator it76 = Gb32.iterator();
                            while (it76.hasNext()) {
                                Object next33 = it76.next();
                                if (next33 instanceof CatalogStateInfo) {
                                    arrayList75.add(next33);
                                }
                            }
                            ArrayList arrayList76 = new ArrayList(c5g.u(arrayList75, 10));
                            Iterator it77 = arrayList75.iterator();
                            while (it77.hasNext()) {
                                arrayList76.add(e0(e2, (CatalogStateInfo) it77.next()));
                            }
                            return arrayList76;
                        case 39:
                            ArrayList Gb33 = catalogBlock.Gb(catalogExtendedData);
                            ArrayList arrayList77 = new ArrayList();
                            Iterator it78 = Gb33.iterator();
                            while (it78.hasNext()) {
                                Object next34 = it78.next();
                                if (next34 instanceof CatalogStateInfo) {
                                    arrayList77.add(next34);
                                }
                            }
                            ArrayList arrayList78 = new ArrayList(c5g.u(arrayList77, 10));
                            Iterator it79 = arrayList77.iterator();
                            while (it79.hasNext()) {
                                arrayList78.add(y(e2, (CatalogStateInfo) it79.next()));
                            }
                            return arrayList78;
                        case 40:
                            ArrayList Gb34 = catalogBlock.Gb(catalogExtendedData);
                            ArrayList arrayList79 = new ArrayList();
                            Iterator it80 = Gb34.iterator();
                            while (it80.hasNext()) {
                                Object next35 = it80.next();
                                if (next35 instanceof CatalogStateInfo) {
                                    arrayList79.add(next35);
                                }
                            }
                            ArrayList arrayList80 = new ArrayList(c5g.u(arrayList79, 10));
                            Iterator it81 = arrayList79.iterator();
                            while (it81.hasNext()) {
                                arrayList80.add(I(e2, (CatalogStateInfo) it81.next()));
                            }
                            return arrayList80;
                        default:
                            return e43.f();
                    }
                }
                String string = bundle.getString(CatalogCustomAttributes$Keys.STYLE.h());
                if (epx.f(string, PlaceholderCatalogViewStyle.Style.VKVideoBanner.i()) || epx.f(string, PlaceholderCatalogViewStyle.Style.VkVideoMusicBanner.i()) || epx.f(string, PlaceholderCatalogViewStyle.Style.VkVideoKidsBanner.i())) {
                    return e43.k(f0(e2));
                }
                ArrayList Gb35 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList81 = new ArrayList();
                Iterator it82 = Gb35.iterator();
                while (it82.hasNext()) {
                    Object next36 = it82.next();
                    if (next36 instanceof CatalogStateInfo) {
                        arrayList81.add(next36);
                    }
                }
                ArrayList arrayList82 = new ArrayList(c5g.u(arrayList81, 10));
                Iterator it83 = arrayList81.iterator();
                while (it83.hasNext()) {
                    arrayList82.add(g0(e2, (CatalogStateInfo) it83.next(), catalogExtendedData));
                }
                ArrayList arrayList83 = new ArrayList();
                arrayList83.addAll(arrayList82);
                c(catalogBlock, arrayList83, e2);
                return arrayList83;
            case 34:
            case 35:
                int i12 = b.$EnumSwitchMapping$0[catalogBlock.Kb().ordinal()];
                if (i12 != 2 && i12 != 3 && i12 != 4 && i12 != 16) {
                    switch (i12) {
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                            break;
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                            ArrayList Gb36 = catalogBlock.Gb(catalogExtendedData);
                            ArrayList arrayList84 = new ArrayList();
                            Iterator it84 = Gb36.iterator();
                            while (it84.hasNext()) {
                                Object next37 = it84.next();
                                CatalogStateInfo catalogStateInfo = next37 instanceof CatalogStateInfo ? (CatalogStateInfo) next37 : null;
                                if (catalogStateInfo != null) {
                                    arrayList84.add(catalogStateInfo);
                                }
                            }
                            ArrayList arrayList85 = new ArrayList(c5g.u(arrayList84, 10));
                            Iterator it85 = arrayList84.iterator();
                            while (it85.hasNext()) {
                                arrayList85.add(g0(e2, (CatalogStateInfo) it85.next(), catalogExtendedData));
                            }
                            return arrayList85;
                        case 53:
                        case 54:
                            ArrayList Gb37 = catalogBlock.Gb(catalogExtendedData);
                            ArrayList arrayList86 = new ArrayList();
                            Iterator it86 = Gb37.iterator();
                            while (it86.hasNext()) {
                                Object next38 = it86.next();
                                CatalogStateInfo catalogStateInfo2 = next38 instanceof CatalogStateInfo ? (CatalogStateInfo) next38 : null;
                                if (catalogStateInfo2 != null) {
                                    arrayList86.add(catalogStateInfo2);
                                }
                            }
                            ArrayList arrayList87 = new ArrayList(c5g.u(arrayList86, 10));
                            Iterator it87 = arrayList86.iterator();
                            while (it87.hasNext()) {
                                arrayList87.add(g0(e2, (CatalogStateInfo) it87.next(), catalogExtendedData));
                            }
                            return arrayList87;
                        default:
                            return e43.f();
                    }
                }
                ArrayList Gb38 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList88 = new ArrayList();
                Iterator it88 = Gb38.iterator();
                while (it88.hasNext()) {
                    Object next39 = it88.next();
                    CatalogStateInfo catalogStateInfo3 = next39 instanceof CatalogStateInfo ? (CatalogStateInfo) next39 : null;
                    if (catalogStateInfo3 != null) {
                        arrayList88.add(catalogStateInfo3);
                    }
                }
                ArrayList arrayList89 = new ArrayList(c5g.u(arrayList88, 10));
                Iterator it89 = arrayList88.iterator();
                while (it89.hasNext()) {
                    CatalogStateInfo catalogStateInfo4 = (CatalogStateInfo) it89.next();
                    arrayList89.add(g0(bi20.a(e2, g(catalogStateInfo4), null, null, null, null, null, 33554427), catalogStateInfo4, catalogExtendedData));
                }
                return arrayList89;
            case 36:
                switch (b.$EnumSwitchMapping$0[catalogBlock.Kb().ordinal()]) {
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                        return y0(e2, catalogBlock);
                    case 59:
                    case 60:
                        return e43.k(k0(e(catalogBlock, catalogExtendedData), catalogBlock));
                    case 61:
                        return e2.e();
                    default:
                        return e43.f();
                }
            case 37:
                int i13 = b.$EnumSwitchMapping$0[catalogBlock.Kb().ordinal()];
                if (i13 != 62) {
                    return i13 != 63 ? e43.f() : L(catalogExtendedData, catalogBlock, e2);
                }
                ArrayList Gb39 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList90 = new ArrayList();
                Iterator it90 = Gb39.iterator();
                while (it90.hasNext()) {
                    Object next40 = it90.next();
                    CatalogAudioStreamMix catalogAudioStreamMix = next40 instanceof CatalogAudioStreamMix ? (CatalogAudioStreamMix) next40 : null;
                    if (catalogAudioStreamMix != null) {
                        arrayList90.add(catalogAudioStreamMix);
                    }
                }
                ArrayList arrayList91 = new ArrayList(c5g.u(arrayList90, 10));
                Iterator it91 = arrayList90.iterator();
                while (it91.hasNext()) {
                    arrayList91.add(M0(e2, (CatalogAudioStreamMix) it91.next()));
                }
                return arrayList91;
            case 38:
                int i14 = b.$EnumSwitchMapping$0[catalogBlock.Kb().ordinal()];
                if (i14 != 59) {
                    switch (i14) {
                        case 64:
                            return A0(e2, catalogBlock);
                        case 65:
                            return e43.f();
                        case 66:
                            return H0(catalogExtendedData, catalogBlock, e2);
                        default:
                            return e43.f();
                    }
                }
                CatalogDataType catalogDataType4 = CatalogDataType.DATA_TYPE_NONE;
                CatalogViewType catalogViewType3 = CatalogViewType.SEPARATOR;
                Bundle bundle2 = new Bundle();
                bundle2.putString(CatalogCustomAttributes$Keys.STYLE.h(), CatalogCustomAttributes$Values.ISLAND.h());
                s3q0 s3q0Var3 = s3q0.a;
                return T0(this, CatalogBlock.zb(catalogBlock, catalogDataType4, new CatalogLayout(catalogViewType3, null, null, null, null, false, bundle2, null, null, 446, null), null, 2097021), catalogExtendedData, list);
            case 39:
                int i15 = b.$EnumSwitchMapping$0[catalogBlock.Kb().ordinal()];
                if (i15 != 3 && i15 != 4) {
                    switch (i15) {
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                            break;
                        case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                            ArrayList Gb40 = catalogBlock.Gb(catalogExtendedData);
                            ArrayList arrayList92 = new ArrayList();
                            Iterator it92 = Gb40.iterator();
                            while (it92.hasNext()) {
                                Object next41 = it92.next();
                                CatalogUserMeta catalogUserMeta = next41 instanceof CatalogUserMeta ? (CatalogUserMeta) next41 : null;
                                if (catalogUserMeta != null) {
                                    arrayList92.add(catalogUserMeta);
                                }
                            }
                            List H0 = j5g.H0(arrayList92, 3);
                            ArrayList arrayList93 = new ArrayList();
                            Iterator it93 = H0.iterator();
                            while (it93.hasNext()) {
                                UIBlockProfile j0 = j0(catalogBlock, (CatalogUserMeta) it93.next(), catalogExtendedData, catalogBlock.Kb());
                                if (j0 != null) {
                                    arrayList93.add(j0);
                                }
                            }
                            return arrayList93;
                        case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                            return s0(catalogBlock, catalogExtendedData);
                        case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                            ArrayList Gb41 = catalogBlock.Gb(catalogExtendedData);
                            ArrayList arrayList94 = new ArrayList();
                            Iterator it94 = Gb41.iterator();
                            while (it94.hasNext()) {
                                Object next42 = it94.next();
                                CatalogUserMeta catalogUserMeta2 = next42 instanceof CatalogUserMeta ? (CatalogUserMeta) next42 : null;
                                if (catalogUserMeta2 != null) {
                                    arrayList94.add(catalogUserMeta2);
                                }
                            }
                            return G0(e2, catalogBlock, arrayList94, catalogExtendedData);
                        default:
                            return e43.f();
                    }
                }
                ArrayList Gb42 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList95 = new ArrayList();
                Iterator it95 = Gb42.iterator();
                while (it95.hasNext()) {
                    Object next43 = it95.next();
                    CatalogUserMeta catalogUserMeta3 = next43 instanceof CatalogUserMeta ? (CatalogUserMeta) next43 : null;
                    if (catalogUserMeta3 != null) {
                        arrayList95.add(catalogUserMeta3);
                    }
                }
                ArrayList arrayList96 = new ArrayList();
                Iterator it96 = arrayList95.iterator();
                while (it96.hasNext()) {
                    UIBlockProfile j02 = j0(catalogBlock, (CatalogUserMeta) it96.next(), catalogExtendedData, catalogBlock.Kb());
                    if (j02 != null) {
                        arrayList96.add(j02);
                    }
                }
                return m(arrayList96, e2);
            case 40:
                return euh0.b(euh0.a, catalogBlock, catalogExtendedData, e2);
            case 41:
            case 42:
                int i16 = b.$EnumSwitchMapping$0[catalogBlock.Kb().ordinal()];
                return (i16 == 3 || i16 == 4) ? rli0.A(rli0.s(rli0.k(j5g.N(catalogBlock.Gb(catalogExtendedData)), SearchSuggestion.class), new com.vk.libvideo.b(23, this, e2))) : e43.f();
            case 43:
                return rli0.A(rli0.s(rli0.k(j5g.N(catalogBlock.Gb(catalogExtendedData)), CatalogText.class), new ju(16, this, e2)));
            case 44:
                if (b.$EnumSwitchMapping$0[catalogBlock.Kb().ordinal()] != 2) {
                    return e43.f();
                }
                List A = rli0.A(rli0.k(j5g.N(catalogBlock.Gb(catalogExtendedData)), Thumb.class));
                ArrayList O03 = O0(catalogExtendedData, catalogBlock.Bb(), e2);
                Iterator it97 = O03.iterator();
                while (true) {
                    if (it97.hasNext()) {
                        obj4 = it97.next();
                        if (((UIBlockAction) obj4) instanceof UIBlockActionPlayAudiosFromBlock) {
                        }
                    } else {
                        obj4 = null;
                    }
                }
                UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock2 = obj4 instanceof UIBlockActionPlayAudiosFromBlock ? (UIBlockActionPlayAudiosFromBlock) obj4 : null;
                if (uIBlockActionPlayAudiosFromBlock2 == null) {
                    return e43.f();
                }
                Iterator it98 = O03.iterator();
                while (true) {
                    if (it98.hasNext()) {
                        obj5 = it98.next();
                        if (((UIBlockAction) obj5) instanceof UIBlockActionOpenSection) {
                        }
                    } else {
                        obj5 = null;
                    }
                }
                UIBlockActionOpenSection uIBlockActionOpenSection2 = obj5 instanceof UIBlockActionOpenSection ? (UIBlockActionOpenSection) obj5 : null;
                return uIBlockActionOpenSection2 == null ? e43.f() : e43.k(Z(e2, A, uIBlockActionPlayAudiosFromBlock2, uIBlockActionOpenSection2));
            case 45:
                int i17 = b.$EnumSwitchMapping$0[catalogBlock.Kb().ordinal()];
                if (i17 != 3) {
                    if (i17 == 14) {
                        Iterator it99 = O0(catalogExtendedData, catalogBlock.Bb(), e2).iterator();
                        while (true) {
                            if (it99.hasNext()) {
                                obj6 = it99.next();
                                if (((UIBlockAction) obj6) instanceof UIBlockActionOpenSection) {
                                }
                            } else {
                                obj6 = null;
                            }
                        }
                        UIBlockActionOpenSection uIBlockActionOpenSection3 = obj6 instanceof UIBlockActionOpenSection ? (UIBlockActionOpenSection) obj6 : null;
                        if (uIBlockActionOpenSection3 == null) {
                            return e43.f();
                        }
                        ArrayList Gb43 = catalogBlock.Gb(catalogExtendedData);
                        ArrayList arrayList97 = new ArrayList();
                        Iterator it100 = Gb43.iterator();
                        while (it100.hasNext()) {
                            Object next44 = it100.next();
                            GroupChat groupChat = next44 instanceof GroupChat ? (GroupChat) next44 : null;
                            if (groupChat != null) {
                                arrayList97.add(groupChat);
                            }
                        }
                        List H02 = j5g.H0(arrayList97, 3);
                        ArrayList arrayList98 = new ArrayList(c5g.u(H02, 10));
                        Iterator it101 = H02.iterator();
                        while (it101.hasNext()) {
                            arrayList98.add(((GroupChat) it101.next()).Ab());
                        }
                        return e43.k(i0(e2, arrayList98, e43.k(uIBlockActionOpenSection3)));
                    }
                    switch (i17) {
                        case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                        case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                        case TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER /* 78 */:
                            break;
                        default:
                            return e43.f();
                    }
                }
                ArrayList Gb44 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList99 = new ArrayList();
                Iterator it102 = Gb44.iterator();
                while (it102.hasNext()) {
                    Object next45 = it102.next();
                    GroupChat groupChat2 = next45 instanceof GroupChat ? (GroupChat) next45 : null;
                    if (groupChat2 != null) {
                        arrayList99.add(groupChat2);
                    }
                }
                ArrayList arrayList100 = new ArrayList(c5g.u(arrayList99, 10));
                Iterator it103 = arrayList99.iterator();
                while (it103.hasNext()) {
                    arrayList100.add(H(e2, (GroupChat) it103.next()));
                }
                return arrayList100;
            case 46:
                int i18 = b.$EnumSwitchMapping$0[catalogBlock.Kb().ordinal()];
                if (i18 != 3 && i18 != 4 && i18 != 16) {
                    switch (i18) {
                        case 79:
                        case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                        case IMAGES_IMAGE_LOADED_VALUE:
                            break;
                        default:
                            T = e43.f();
                            break;
                    }
                    return !catalogBlock.Kb().j() ? n(T, e2) : T;
                }
                T = T(catalogExtendedData, catalogBlock, e2);
                if (!catalogBlock.Kb().j()) {
                }
            case 47:
                int i19 = b.$EnumSwitchMapping$0[catalogBlock.Kb().ordinal()];
                return (i19 == 3 || i19 == 4 || i19 == 16 || i19 == 41) ? S(catalogExtendedData, catalogBlock, e2) : e43.f();
            case 48:
                int i20 = b.$EnumSwitchMapping$0[catalogBlock.Kb().ordinal()];
                if (i20 != 4) {
                    if (i20 == 23) {
                        return c0(e2, catalogBlock, catalogExtendedData, true);
                    }
                    if (i20 != 82) {
                        return e43.f();
                    }
                }
                return d0(catalogExtendedData, catalogBlock, e2);
            case 49:
                if (b.$EnumSwitchMapping$0[catalogBlock.Kb().ordinal()] != 3) {
                    return e43.f();
                }
                Map<String, MarketInfo> Eb = catalogExtendedData.Eb();
                ArrayList arrayList101 = new ArrayList(Eb.size());
                Iterator<Map.Entry<String, MarketInfo>> it104 = Eb.entrySet().iterator();
                while (it104.hasNext()) {
                    arrayList101.add(new UIBlockMarketInfo(e2.b(), it104.next().getValue()));
                }
                return arrayList101;
            case 50:
                if (b.$EnumSwitchMapping$0[catalogBlock.Kb().ordinal()] != 3) {
                    return e43.f();
                }
                ArrayList Gb45 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList102 = new ArrayList();
                Iterator it105 = Gb45.iterator();
                while (it105.hasNext()) {
                    Object next46 = it105.next();
                    GroupLikes groupLikes = next46 instanceof GroupLikes ? (GroupLikes) next46 : null;
                    if (groupLikes != null) {
                        arrayList102.add(groupLikes);
                    }
                }
                ArrayList arrayList103 = new ArrayList(c5g.u(arrayList102, 10));
                Iterator it106 = arrayList102.iterator();
                while (it106.hasNext()) {
                    GroupLikes groupLikes2 = (GroupLikes) it106.next();
                    Iterator<UserId> it107 = groupLikes2.f.iterator();
                    while (it107.hasNext()) {
                        UserProfile userProfile2 = catalogExtendedData.Gb(it107.next()).a;
                        if (userProfile2 != null) {
                            groupLikes2.e.add(userProfile2);
                            s3q0 s3q0Var4 = s3q0.a;
                        }
                    }
                    Group group12 = catalogExtendedData.Gb(fkq0.e(groupLikes2.zb())).b;
                    if (group12 != null) {
                        group12.T = groupLikes2;
                        s3q0 s3q0Var5 = s3q0.a;
                    }
                    arrayList103.add(group12);
                }
                ArrayList arrayList104 = new ArrayList();
                Iterator it108 = arrayList103.iterator();
                while (it108.hasNext()) {
                    Group group13 = (Group) it108.next();
                    if (group13 != null) {
                        arrayList104.add(group13);
                    }
                }
                ArrayList arrayList105 = new ArrayList(c5g.u(arrayList104, 10));
                Iterator it109 = arrayList104.iterator();
                while (it109.hasNext()) {
                    arrayList105.add(G(e2, (Group) it109.next(), null, 60));
                }
                return arrayList105;
            case 51:
                ArrayList Gb46 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList106 = new ArrayList();
                Iterator it110 = Gb46.iterator();
                while (it110.hasNext()) {
                    Object next47 = it110.next();
                    Group group14 = next47 instanceof Group ? (Group) next47 : null;
                    if (group14 != null) {
                        arrayList106.add(group14);
                    }
                }
                ArrayList arrayList107 = new ArrayList(c5g.u(arrayList106, 10));
                Iterator it111 = arrayList106.iterator();
                while (it111.hasNext()) {
                    Group group15 = (Group) it111.next();
                    String userId4 = group15.c.toString();
                    GroupLikes groupLikes3 = userId4 != null ? catalogExtendedData.G.get(userId4) : null;
                    if (groupLikes3 == null) {
                        groupLikes3 = new GroupLikes(r13, r13, i5, r13);
                    }
                    group15.T = groupLikes3;
                    arrayList107.add(G(e2, group15, null, 60));
                }
                return arrayList107;
            case 52:
                return rli0.A(rli0.s(rli0.k(j5g.N(catalogBlock.Gb(catalogExtendedData)), Article.class), new com.vk.libvideo.design.view.video.a(22, this, e2)));
            case 53:
                return rli0.A(rli0.s(rli0.k(j5g.N(catalogBlock.Gb(catalogExtendedData)), Podcast.class), new h440(i4, e2, this)));
            case 54:
                return rli0.A(rli0.s(rli0.k(j5g.N(catalogBlock.Gb(catalogExtendedData)), OfflinePodcast.class), new ux40(this, e2)));
            case 55:
                return b.$EnumSwitchMapping$0[catalogBlock.Kb().ordinal()] == 83 ? rli0.A(rli0.s(rli0.j(j5g.N(catalogBlock.Gb(catalogExtendedData)), d.b), new k82(17, e2, (CatalogButtonOpenUrl) j5g.a0(catalogBlock.Bb())))) : rli0.A(rli0.s(rli0.k(j5g.N(catalogBlock.Gb(catalogExtendedData)), MusicTrack.class), new wq20(this, e2)));
            case 56:
                return b.$EnumSwitchMapping$0[catalogBlock.Kb().ordinal()] == 3 ? rli0.A(rli0.s(rli0.t(rli0.k(j5g.N(catalogBlock.Gb(catalogExtendedData)), PodcastSliderItem.class), m.b), new px30(this, e2))) : rli0.A(rli0.s(rli0.k(j5g.N(catalogBlock.Gb(catalogExtendedData)), PodcastSliderItem.class), new j4x(this, e2)));
            case 57:
                return b.$EnumSwitchMapping$0[catalogBlock.Kb().ordinal()] == 3 ? rli0.A(rli0.s(rli0.k(j5g.N(catalogBlock.Gb(catalogExtendedData)), ExtendedPodcast.class), new cqv(this, e2))) : rli0.A(rli0.s(rli0.k(j5g.N(catalogBlock.Gb(catalogExtendedData)), ExtendedPodcast.class), new uv20(e2, 11)));
            case 58:
                return rli0.A(rli0.s(rli0.k(j5g.N(catalogBlock.Gb(catalogExtendedData)), FriendsLikedEpisode.class), new ku1(catalogExtendedData, this, e2)));
            case 59:
                return rli0.A(rli0.s(rli0.k(j5g.N(catalogBlock.Gb(catalogExtendedData)), MusicOwner.class), new dta(this, e2, catalogBlock, catalogExtendedData, 2)));
            case 60:
            case 61:
                return rli0.A(rli0.t(j5g.N(catalogBlock.Gb(catalogExtendedData)), new ri0(catalogBlock, this, e2)));
            case 62:
                return rli0.A(rli0.s(rli0.k(j5g.N(catalogBlock.Gb(catalogExtendedData)), MusicSignalInfo.class), new oh3(23, e2, catalogExtendedData)));
            case 63:
                return rli0.A(rli0.s(rli0.k(j5g.N(catalogBlock.Gb(catalogExtendedData)), CatalogSearchSpellcheckResult.class), new zo8(catalogBlock, this, e2, 7)));
            case 64:
                ArrayList Gb47 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList108 = new ArrayList();
                Iterator it112 = Gb47.iterator();
                while (it112.hasNext()) {
                    Object next48 = it112.next();
                    if (next48 instanceof RadioStation) {
                        arrayList108.add(next48);
                    }
                }
                ArrayList arrayList109 = new ArrayList(c5g.u(arrayList108, 10));
                for (Iterator it113 = arrayList108.iterator(); it113.hasNext(); it113 = it113) {
                    arrayList109.add(new UIBlockRadioStation(new com.vk.catalog2.common.dto.api.ui.a(e2.a, e2.b, e2.g(), e2.c, e2.k, e2.e, e2.j, e2.m, e2.o, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7680), (RadioStation) it113.next(), arrayList108));
                }
                return j5g.O0(arrayList109);
            case 65:
                return b.$EnumSwitchMapping$0[catalogBlock.Kb().ordinal()] == 83 ? rli0.A(rli0.s(rli0.u(rli0.j(j5g.N(catalogBlock.Gb(catalogExtendedData)), e.b), new jz30(i4)), new ab(17, e2, (CatalogButtonOpenUrl) j5g.a0(catalogBlock.Bb())))) : rli0.A(rli0.s(rli0.u(rli0.j(j5g.N(catalogBlock.Gb(catalogExtendedData)), f.b), new i0r(i6)), new kn20(this, e2)));
            case 66:
                return rli0.A(rli0.s(rli0.j(j5g.N(catalogBlock.Gb(catalogExtendedData)), g.b), new v4w(e2, 9)));
            case 67:
                return rli0.A(rli0.t(j5g.N(catalogBlock.Fb()), new byh(catalogBlock, catalogExtendedData, this, e2, 1)));
            case 68:
                return rli0.A(rli0.t(rli0.j(j5g.N(catalogBlock.Gb(catalogExtendedData)), h.b), new rr3(this, e2, catalogExtendedData, list)));
            case 69:
                int i21 = b.$EnumSwitchMapping$0[catalogBlock.Kb().ordinal()];
                if (i21 != 45) {
                    if (i21 != 63) {
                        return e43.k(new UIBlockShimmer(e2.b(), r13, 2, r13));
                    }
                    return e43.k(new UIBlockShimmer(com.vk.catalog2.common.dto.api.ui.a.a(e2.b(), null, null, null, null, null, new VkMixInteractiveViewStyle(catalogBlockItemsData.c.size() == 1 ? VkMixInteractiveViewStyle.Style.STATIC : VkMixInteractiveViewStyle.Style.Default), 7679), r13, 2, r13));
                }
                ArrayList Hb = catalogBlock.Hb(catalogExtendedData, CatalogDataType.DATA_TYPE_CATALOG_BANNERS);
                ArrayList arrayList110 = new ArrayList();
                Iterator it114 = Hb.iterator();
                while (it114.hasNext()) {
                    Object next49 = it114.next();
                    if (next49 instanceof CatalogStateInfo) {
                        arrayList110.add(next49);
                    }
                }
                ArrayList arrayList111 = new ArrayList(c5g.u(arrayList110, 10));
                Iterator it115 = arrayList110.iterator();
                while (it115.hasNext()) {
                    arrayList111.add(g0(bi20.a(e2, CatalogDataType.DATA_SYNTHETIC_LOADING, null, null, null, null, null, 33554427), (CatalogStateInfo) it115.next(), catalogExtendedData));
                }
                return arrayList111;
            case 70:
                int i22 = b.$EnumSwitchMapping$0[catalogBlock.Kb().ordinal()];
                if (i22 == 3) {
                    ArrayList Gb48 = catalogBlock.Gb(catalogExtendedData);
                    ArrayList arrayList112 = new ArrayList();
                    Iterator it116 = Gb48.iterator();
                    while (it116.hasNext()) {
                        Object next50 = it116.next();
                        if (next50 instanceof CatalogConcertItem) {
                            arrayList112.add(next50);
                        }
                    }
                    ArrayList arrayList113 = new ArrayList(c5g.u(arrayList112, 10));
                    Iterator it117 = arrayList112.iterator();
                    while (it117.hasNext()) {
                        arrayList113.add(new UIBlockConcert(e2.b(), (CatalogConcertItem) it117.next(), true));
                    }
                    return arrayList113;
                }
                if (i22 != 4) {
                    return e43.f();
                }
                String string2 = bundle.getString(CatalogCustomAttributes$Keys.STYLE.h());
                if (string2 != null) {
                    ConcertSliderViewStyle.Style.Companion.getClass();
                    concertSliderViewStyle = new ConcertSliderViewStyle(ConcertSliderViewStyle.Style.a.a(string2));
                }
                com.vk.catalog2.common.dto.api.ui.a aVar = new com.vk.catalog2.common.dto.api.ui.a(e2.a, e2.b, e2.g(), e2.c, e2.k, e2.e, e2.j, e2.m, e2.o, concertSliderViewStyle, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7168);
                ArrayList Gb49 = catalogBlock.Gb(catalogExtendedData);
                ArrayList arrayList114 = new ArrayList();
                Iterator it118 = Gb49.iterator();
                while (it118.hasNext()) {
                    Object next51 = it118.next();
                    if (next51 instanceof CatalogConcertItem) {
                        arrayList114.add(next51);
                    }
                }
                boolean z3 = arrayList114.size() == 1;
                ArrayList arrayList115 = new ArrayList(c5g.u(arrayList114, 10));
                Iterator it119 = arrayList114.iterator();
                while (it119.hasNext()) {
                    arrayList115.add(new UIBlockConcert(aVar, (CatalogConcertItem) it119.next(), z3));
                }
                return arrayList115;
            case 71:
                return rli0.A(rli0.s(rli0.j(j5g.N(catalogBlock.Gb(catalogExtendedData)), i.b), new ftm(this, catalogBlock, catalogExtendedData, i4)));
            case 72:
                return rli0.A(rli0.s(rli0.j(j5g.N(catalogBlock.Gb(catalogExtendedData)), j.b), new jy5(this, catalogBlock, catalogExtendedData, i2)));
            case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                return rli0.A(rli0.s(rli0.j(j5g.N(catalogBlock.Gb(catalogExtendedData)), k.b), new wyg(this, catalogBlock, catalogExtendedData, i4)));
            case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                return rli0.A(rli0.s(rli0.j(j5g.N(catalogBlock.Gb(catalogExtendedData)), l.b), new yhu(e2, 13)));
            default:
                return e43.f();
        }
    }

    public final List T(CatalogExtendedData catalogExtendedData, CatalogBlock catalogBlock, bi20 bi20Var) {
        return rli0.A(new ulp0(rli0.j(new i5g(catalogBlock.Gb(catalogExtendedData)), c.b), new sy4(this, catalogExtendedData, bi20Var, catalogBlock)));
    }

    @Override // xsna.jda
    public List<UIBlock> b(Object obj, CatalogExtendedData catalogExtendedData, boolean z, boolean z2) {
        UIBlockList a2;
        UIBlockList a3;
        w060 w060Var;
        CatalogExtendedData catalogExtendedData2;
        bi20 bi20Var;
        CatalogHeaderStyle.TitleGradient titleGradient;
        if (obj instanceof CatalogSection) {
            return Collections.singletonList(Q0((CatalogSection) obj, catalogExtendedData));
        }
        if (!(obj instanceof CatalogCatalog)) {
            if (obj instanceof CatalogBlock) {
                return N0((CatalogBlock) obj, catalogExtendedData, z2);
            }
            if (!BuildInfo.h()) {
                return EmptyList.b;
            }
            StringBuilder sb = new StringBuilder("Unknown type<");
            String canonicalName = obj.getClass().getCanonicalName();
            throw new IllegalArgumentException(i5s.a(sb, canonicalName != null ? canonicalName.toString() : null, "> to transform!"));
        }
        CatalogCatalog catalogCatalog = (CatalogCatalog) obj;
        List<CatalogSection> list = catalogCatalog.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Q0((CatalogSection) it.next(), catalogExtendedData));
        }
        CatalogSection catalogSection = catalogCatalog.e;
        if (catalogSection != null) {
            a2 = (UIBlockList) Q0(catalogSection, catalogExtendedData);
        } else {
            Serializer.c<UIBlockList> cVar = UIBlockList.CREATOR;
            a2 = UIBlockList.a.a();
        }
        UIBlockList uIBlockList = a2;
        CatalogSection catalogSection2 = catalogCatalog.d;
        if (catalogSection2 != null) {
            UIBlock Q0 = Q0(catalogSection2, catalogExtendedData);
            bi20 f2 = f(catalogSection2, CatalogDataType.DATA_SYNTHETIC_SECTION, CatalogViewType.LIST, catalogExtendedData, UserId.d);
            CatalogBadge catalogBadge = catalogSection2.g;
            UIBlockBadge A = catalogBadge != null ? A(f2, catalogBadge) : null;
            CatalogHeaderStyle catalogHeaderStyle = catalogSection2.m;
            UIBlockList uIBlockList2 = (UIBlockList) Q0;
            a3 = new UIBlockList(Q0.b, CatalogViewType.SYNTHETIC_HEADER_SECTION, CatalogDataType.DATA_TYPE_STICKERS_BANNERS, Q0.f, Q0.g, Q0.h, Q0.Db(), Q0.j, Q0.m, uIBlockList2.z, uIBlockList2.y, catalogSection2.e, uIBlockList2.B, uIBlockList2.C, uIBlockList2.D, uIBlockList2.I, uIBlockList2.E, uIBlockList2.F, uIBlockList2.G, A, uIBlockList2.J, (catalogHeaderStyle == null || (titleGradient = catalogHeaderStyle.b) == null) ? null : new CatalogTabStyle.Gradient(titleGradient.b, titleGradient.c, titleGradient.d, titleGradient.e), false, null, Q0.l, false, null, Q0.p, uIBlockList2.O, null, 650117120, null);
        } else {
            Serializer.c<UIBlockList> cVar2 = UIBlockList.CREATOR;
            a3 = UIBlockList.a.a();
        }
        UIBlockList uIBlockList3 = a3;
        CatalogSection Ab = catalogCatalog.Ab();
        if (Ab != null) {
            w060Var = this;
            catalogExtendedData2 = catalogExtendedData;
            bi20Var = w060Var.f(Ab, CatalogDataType.DATA_SYNTHETIC_SECTION, CatalogViewType.LIST, catalogExtendedData2, UserId.d);
        } else {
            w060Var = this;
            catalogExtendedData2 = catalogExtendedData;
            bi20Var = null;
        }
        return Collections.singletonList(new UIBlockCatalog(uIBlockList3, uIBlockList, arrayList, catalogCatalog.f, catalogCatalog.c, null, null, catalogCatalog.h, bi20Var != null ? w060Var.O0(catalogExtendedData2, catalogCatalog.g, bi20Var) : EmptyList.b, 96, null));
    }

    public final void c(CatalogBlock catalogBlock, ArrayList arrayList, bi20 bi20Var) {
        Object a0 = j5g.a0(catalogBlock.j);
        CatalogButtonFilters catalogButtonFilters = a0 instanceof CatalogButtonFilters ? (CatalogButtonFilters) a0 : null;
        if (catalogButtonFilters == null || !epx.f(catalogButtonFilters.c, "groups_my_groups_tabs")) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(r(this, bi20Var, catalogButtonFilters, catalogBlock.b, CatalogViewType.FILTER_BUTTON, null, 16));
        arrayList.add(0, l0(bi20Var, arrayList2, arrayList2.size() >= 3 ? CatalogViewType.BUTTONS_HORIZONTAL_WITH_SCROLL : CatalogViewType.BUTTONS_HORIZONTAL, 8));
    }

    public bi20 d(CatalogBlock catalogBlock) {
        Boolean bool;
        CatalogBlockMetaDto.ContextDto contextDto;
        String str = catalogBlock.b;
        String str2 = catalogBlock.e;
        CatalogDataType catalogDataType = catalogBlock.c;
        CatalogLayout catalogLayout = catalogBlock.i;
        CatalogViewType catalogViewType = catalogLayout.b;
        UserId userId = catalogLayout.c;
        String str3 = catalogLayout.d;
        String str4 = catalogLayout.e;
        TopTitle topTitle = catalogLayout.f;
        String str5 = catalogLayout.j;
        List<String> list = catalogBlock.l;
        String str6 = catalogBlock.d;
        EmptyList emptyList = EmptyList.b;
        EmptySet emptySet = EmptySet.b;
        String str7 = catalogBlock.f;
        Bundle bundle = catalogLayout.h;
        Meta meta = catalogBlock.p;
        String str8 = meta != null ? meta.e : null;
        CatalogOnboardingInfo catalogOnboardingInfo = meta != null ? meta.f : null;
        ShowAllInfo showAllInfo = meta != null ? meta.g : null;
        CatalogLaunchOrigin.a aVar = CatalogLaunchOrigin.Companion;
        ShowAllInfo showAllInfo2 = showAllInfo;
        String i2 = (meta == null || (contextDto = meta.i) == null) ? null : contextDto.i();
        if (i2 == null) {
            i2 = "";
        }
        aVar.getClass();
        CatalogLaunchOrigin catalogLaunchOrigin = CatalogLaunchOrigin.KIDS_SECTION;
        if (!i2.equals(catalogLaunchOrigin.h())) {
            catalogLaunchOrigin = CatalogLaunchOrigin.UNKNOWN;
        }
        return new bi20(str, str2, catalogDataType, catalogViewType, userId, str3, str4, topTitle, str5, list, str6, emptyList, emptySet, str7, bundle, str8, catalogOnboardingInfo, showAllInfo2, null, catalogLaunchOrigin, meta != null ? meta.j : null, catalogBlock.u, (meta == null || (bool = meta.k) == null) ? false : bool.booleanValue(), 2097152);
    }

    public final bi20 e(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData) {
        bi20 d2 = d(catalogBlock);
        Pair b2 = a.b(O0(catalogExtendedData, catalogBlock.j, d2));
        List list = (List) b2.d();
        Set set = (Set) b2.g();
        CatalogHint Cb = catalogExtendedData.Cb(catalogBlock.n);
        return bi20.a(d2, null, null, list, set, Cb != null ? J(d2, Cb, catalogExtendedData) : null, null, 33531903);
    }

    public final bi20 f(CatalogSection catalogSection, CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogExtendedData catalogExtendedData, UserId userId) {
        String str = catalogSection.b;
        bi20 bi20Var = new bi20(str, str, catalogDataType, catalogViewType, userId, catalogSection.d, "", null, null, catalogSection.h, str, EmptyList.b, EmptySet.b, catalogSection.e, Bundle.EMPTY, null, null, null, catalogSection.f, null, null, null, false, 32899072);
        Pair b2 = a.b(O0(catalogExtendedData, catalogSection.j, bi20Var));
        List list = (List) b2.d();
        Set set = (Set) b2.g();
        CatalogHint catalogHint = catalogSection.k;
        return bi20.a(bi20Var, null, null, list, set, catalogHint != null ? J(bi20Var, catalogHint, catalogExtendedData) : null, null, 33531903);
    }

    public final UIBlockPlaceholder g0(bi20 bi20Var, CatalogStateInfo catalogStateInfo, CatalogExtendedData catalogExtendedData) {
        PlaceholderCatalogViewStyle placeholderCatalogViewStyle = new PlaceholderCatalogViewStyle(bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h()));
        String str = catalogStateInfo.n;
        CatalogViewType catalogViewType = (str == null || str.length() == 0) ? bi20Var.d : CatalogViewType.SYNTHETIC_PLACEHOLDER;
        ArrayList O0 = O0(catalogExtendedData, catalogStateInfo.g, bi20Var);
        CatalogButton catalogButton = catalogStateInfo.h;
        return new UIBlockPlaceholder(bi20Var.a, catalogViewType, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, catalogStateInfo.b, catalogStateInfo.c, catalogStateInfo.d, catalogStateInfo.e, catalogStateInfo.f, catalogStateInfo.m, catalogButton != null ? (UIBlockAction) j5g.a0(O0(catalogExtendedData, Collections.singletonList(catalogButton), bi20Var)) : null, O0, catalogStateInfo.i, catalogStateInfo.l, catalogStateInfo.n, catalogStateInfo.o, catalogStateInfo.p, catalogStateInfo.q, placeholderCatalogViewStyle, bi20Var.u, null, catalogStateInfo.r, C.DEFAULT_MUXED_BUFFER_SIZE, null);
    }

    public final FiltersViewStyle h(CatalogButtonFilters catalogButtonFilters) {
        if (this.c && epx.f(catalogButtonFilters.c, "my_music_subsection_tabs")) {
            return new FiltersViewStyle(FiltersViewStyle.Style.TABS);
        }
        return null;
    }

    public final UIBlockProfile j0(CatalogBlock catalogBlock, CatalogUserMeta catalogUserMeta, CatalogExtendedData catalogExtendedData, CatalogViewType catalogViewType) {
        int i2;
        UserProfile userProfile = catalogExtendedData.Gb(catalogUserMeta.c).a;
        ArrayList arrayList = null;
        if (userProfile == null) {
            return null;
        }
        bi20 e2 = e(catalogBlock, catalogExtendedData);
        List<UserId> list = catalogUserMeta.f;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                UserProfile userProfile2 = catalogExtendedData.Gb((UserId) it.next()).a;
                if (userProfile2 != null) {
                    arrayList.add(userProfile2);
                }
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList O0 = O0(catalogExtendedData, catalogUserMeta.e, e2);
        String str = catalogBlock.k;
        int i3 = catalogUserMeta.g;
        int i4 = 1;
        boolean z = catalogViewType == CatalogViewType.LIST && epx.f(e2.p.getString(TtmlNode.TAG_STYLE), "followers");
        if (z) {
            int i5 = userProfile.v;
            if (i5 == 2) {
                i4 = 0;
            } else if (i5 != 3) {
                i4 = 2;
            }
            i2 = i4;
        } else {
            i2 = 0;
        }
        return new UIBlockProfile(e2.a, z ? CatalogViewType.SYNTHETIC_LIST_FOLLOWERS : catalogViewType, e2.c, e2.k, e2.e, e2.j, e2.m, e2.o, catalogUserMeta, userProfile, str, arrayList2, i3, O0, i2, null, 32768, null);
    }

    public final List<UIBlock> s0(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData) {
        ArrayList Gb = catalogBlock.Gb(catalogExtendedData);
        ArrayList arrayList = new ArrayList();
        Iterator it = Gb.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof CatalogUserMeta) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (((CatalogUserMeta) next2).zb()) {
                arrayList2.add(next2);
            }
        }
        if (arrayList2.size() <= 2) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                UIBlockProfile j0 = j0(catalogBlock, (CatalogUserMeta) it3.next(), catalogExtendedData, CatalogViewType.LIST);
                if (j0 != null) {
                    arrayList3.add(j0);
                }
            }
            return arrayList3;
        }
        if (arrayList2.size() <= 2) {
            return EmptyList.b;
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            Object next3 = it4.next();
            if (((CatalogUserMeta) next3).Ab()) {
                arrayList4.add(next3);
            }
        }
        ArrayList arrayList5 = new ArrayList(t0(catalogBlock, arrayList4, catalogExtendedData));
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            Object next4 = it5.next();
            if (epx.f(((CatalogUserMeta) next4).i, "tomorrow")) {
                arrayList6.add(next4);
            }
        }
        arrayList5.addAll(t0(catalogBlock, arrayList6, catalogExtendedData));
        return arrayList5;
    }

    public final List<UIBlockFilter2D> t(bi20 bi20Var, CatalogBlock catalogBlock) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<CatalogButton> it = catalogBlock.j.iterator();
        while (it.hasNext()) {
            CatalogButton next = it.next();
            if (next instanceof CatalogButtonFilters) {
                arrayList2.addAll(r(this, bi20Var, (CatalogButtonFilters) next, catalogBlock.b, null, null, 24));
            } else if (next instanceof CatalogShowFiltersButton) {
                CatalogShowFiltersButton catalogShowFiltersButton = (CatalogShowFiltersButton) next;
                String str = catalogShowFiltersButton.c;
                List list = catalogShowFiltersButton.g;
                if (list == null) {
                    list = EmptyList.b;
                }
                arrayList.addAll(q(bi20Var.d, str, catalogShowFiltersButton.i, catalogBlock.b, list, bi20Var));
            }
        }
        CatalogSliderViewStyle catalogSliderViewStyle = new CatalogSliderViewStyle(bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h()));
        String str2 = bi20Var.a;
        CatalogViewType catalogViewType = bi20Var.d;
        CatalogDataType catalogDataType = CatalogDataType.DATA_SYNTHETIC_SECTION;
        String str3 = bi20Var.k;
        UserId userId = bi20Var.e;
        List<String> list2 = bi20Var.j;
        Set<UIBlockDragDropAction> set = bi20Var.m;
        UIBlockHint uIBlockHint = bi20Var.o;
        Iterator<T> it2 = bi20Var.l.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((UIBlockAction) obj).j != null) {
                break;
            }
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        return Collections.singletonList(new UIBlockFilter2D(str2, catalogViewType, catalogDataType, str3, userId, list2, set, uIBlockHint, B0(this, bi20Var, arrayList2, arrayList2, null, null, null, null, false, null, false, null, null, 1048568), B0(this, bi20Var, arrayList, arrayList, null, null, null, uIBlockAction != null ? uIBlockAction.j : null, false, null, false, null, null, 1046520), catalogSliderViewStyle));
    }

    public final List t0(CatalogBlock catalogBlock, ArrayList arrayList, CatalogExtendedData catalogExtendedData) {
        if (arrayList.isEmpty()) {
            return EmptyList.b;
        }
        if (arrayList.size() == 1) {
            UIBlockProfile j0 = j0(catalogBlock, (CatalogUserMeta) arrayList.get(0), catalogExtendedData, CatalogViewType.LIST);
            return j0 != null ? Collections.singletonList(j0) : EmptyList.b;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UserProfile userProfile = catalogExtendedData.Gb(((CatalogUserMeta) it.next()).c).a;
            if (userProfile != null) {
                arrayList2.add(userProfile);
            }
        }
        bi20 e2 = e(catalogBlock, catalogExtendedData);
        return Collections.singletonList(new UIBlockProfilesList(e2.a, e2.d, e2.c, e2.k, e2.e, e2.j, e2.m, e2.o, arrayList, arrayList2, catalogBlock.k, null));
    }

    public final UIBlockGroupsCategory v0(bi20 bi20Var, CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, GroupsCategory groupsCategory, boolean z) {
        CatalogButton Db = catalogBlock.Db(groupsCategory.b);
        UIBlockAction uIBlockAction = Db != null ? (UIBlockAction) j5g.a0(O0(catalogExtendedData, Collections.singletonList(Db), bi20Var)) : null;
        if (!z) {
            return new UIBlockGroupsCategory(bi20Var.b(), groupsCategory, uIBlockAction, EmptyList.b);
        }
        Object zb = catalogBlock.m.zb(groupsCategory.b);
        GroupsEntityCatalogItem groupsEntityCatalogItem = zb instanceof GroupsEntityCatalogItem ? (GroupsEntityCatalogItem) zb : null;
        return new UIBlockGroupsCategory(bi20Var.b(), groupsCategory, uIBlockAction, j(catalogExtendedData, groupsEntityCatalogItem != null ? groupsEntityCatalogItem.c : null, bi20Var));
    }

    public final List<UIBlock> y0(bi20 bi20Var, CatalogBlock catalogBlock) {
        if (!epx.f(catalogBlock.i.h.getString(CatalogCustomAttributes$Keys.STYLE.h()), CatalogCustomAttributes$Values.LEGAL_NOTICE.h())) {
            CatalogBadge catalogBadge = catalogBlock.h;
            return z0(bi20Var, catalogBadge != null ? A(bi20Var, catalogBadge) : null, bi20Var.l);
        }
        com.vk.catalog2.common.dto.api.ui.a c2 = bi20Var.c(CatalogViewType.SYNTHETIC_LEGAL_NOTICE);
        CatalogLayout catalogLayout = catalogBlock.i;
        return Collections.singletonList(new UIBlockLegalNotice(c2, catalogLayout.d, catalogLayout.e));
    }

    public List<UIBlock> z0(bi20 bi20Var, UIBlockBadge uIBlockBadge, List<? extends UIBlockAction> list) {
        Object obj;
        Object obj2;
        CatalogViewType catalogViewType = bi20Var.d;
        List<? extends UIBlockAction> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list2) {
            if (obj3 instanceof UIBlockActionOpenUrl) {
                arrayList.add(obj3);
            }
        }
        UIBlockActionOpenUrl uIBlockActionOpenUrl = (UIBlockActionOpenUrl) j5g.a0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : list2) {
            if (obj4 instanceof UIBlockActionOpenSection) {
                arrayList2.add(obj4);
            }
        }
        UIBlockActionOpenSection uIBlockActionOpenSection = (UIBlockActionOpenSection) j5g.a0(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj5 : list2) {
            if (obj5 instanceof UIBlockActionSwitchSection) {
                arrayList3.add(obj5);
            }
        }
        UIBlockActionSwitchSection uIBlockActionSwitchSection = (UIBlockActionSwitchSection) j5g.a0(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj6 : list2) {
            if (obj6 instanceof UIBlockActionOpenSearchTab) {
                arrayList4.add(obj6);
            }
        }
        UIBlockActionOpenSearchTab uIBlockActionOpenSearchTab = (UIBlockActionOpenSearchTab) j5g.a0(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj7 : list2) {
            if (obj7 instanceof UIBlockActionClearRecent) {
                arrayList5.add(obj7);
            }
        }
        UIBlockActionClearRecent uIBlockActionClearRecent = (UIBlockActionClearRecent) j5g.a0(arrayList5);
        ArrayList arrayList6 = new ArrayList();
        for (Object obj8 : list2) {
            if (obj8 instanceof UIBlockActionOpenScreen) {
                arrayList6.add(obj8);
            }
        }
        UIBlockActionOpenScreen uIBlockActionOpenScreen = (UIBlockActionOpenScreen) j5g.a0(arrayList6);
        ArrayList arrayList7 = new ArrayList();
        for (Object obj9 : list2) {
            if (obj9 instanceof UIBlockHideBlockButton) {
                arrayList7.add(obj9);
            }
        }
        UIBlockHideBlockButton uIBlockHideBlockButton = (UIBlockHideBlockButton) j5g.a0(arrayList7);
        List<? extends UIBlockAction> list3 = list;
        Iterator<T> it = list3.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            UIBlockAction uIBlockAction = (UIBlockAction) obj2;
            if ((uIBlockAction instanceof UIBlockActionShowFilters) && uIBlockAction.d != CatalogViewType.SYNTHETIC_ACTION_FRIENDS_SORT_MODES) {
                break;
            }
        }
        UIBlockAction uIBlockAction2 = (UIBlockAction) obj2;
        UIBlockActionShowFilters uIBlockActionShowFilters = uIBlockAction2 != null ? (UIBlockActionShowFilters) uIBlockAction2 : null;
        Iterator<T> it2 = list3.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            UIBlockAction uIBlockAction3 = (UIBlockAction) next;
            if ((uIBlockAction3 instanceof UIBlockActionShowFilters) && uIBlockAction3.d == CatalogViewType.SYNTHETIC_ACTION_FRIENDS_SORT_MODES) {
                obj = next;
                break;
            }
        }
        UIBlockAction uIBlockAction4 = (UIBlockAction) obj;
        if (uIBlockActionClearRecent != null) {
            int i2 = b.$EnumSwitchMapping$0[catalogViewType.ordinal()];
            catalogViewType = i2 != 56 ? i2 != 58 ? CatalogViewType.SYNTHETIC_HEADER_CLEAR_RECENTS : CatalogViewType.SYNTHETIC_HEADER_CLEAR_RECENTS_LARGE : CatalogViewType.SYNTHETIC_HEADER_CLEAR_RECENTS_COMPACT;
        }
        ArrayList o = e43.o(new UIBlockHeader(new com.vk.catalog2.common.dto.api.ui.a(bi20Var.a, bi20Var.b, catalogViewType, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, new HeaderCatalogViewStyle(bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h())), (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7168), bi20Var.f, bi20Var.g, bi20Var.h, new mwp0(uIBlockBadge, uIBlockActionShowFilters, uIBlockActionOpenSection, uIBlockActionSwitchSection, uIBlockActionOpenSearchTab, uIBlockActionClearRecent, uIBlockActionOpenScreen, uIBlockActionOpenUrl, uIBlockHideBlockButton, null), bi20Var.i, bi20Var.v));
        if (uIBlockAction4 != null) {
            o.add(uIBlockAction4);
        }
        return o;
    }

    public /* synthetic */ w060(int i2) {
        this(o25.a());
    }
}
