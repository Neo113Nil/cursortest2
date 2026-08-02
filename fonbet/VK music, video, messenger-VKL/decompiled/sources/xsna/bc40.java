package xsna;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.CatalogButtonFilters;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenUrl;
import com.vk.catalog2.common.dto.api.CatalogButtonPlayMix;
import com.vk.catalog2.common.dto.api.CatalogButtonSaveAsPlaylist;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Values;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.CatalogStateInfo;
import com.vk.catalog2.common.dto.api.CatalogText;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogArtistChip;
import com.vk.catalog2.common.dto.api.block.CatalogArtistInfo;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.music.ArtistsIdsList;
import com.vk.catalog2.common.dto.api.music.AudioStreamMixTitles;
import com.vk.catalog2.common.dto.api.music.CatalogAudioContentCard;
import com.vk.catalog2.common.dto.api.music.CatalogAudioStreamMix;
import com.vk.catalog2.common.dto.api.music.CatalogConcertItem;
import com.vk.catalog2.common.dto.api.music.MusicOwner;
import com.vk.catalog2.common.dto.api.music.MusicSignalInfo;
import com.vk.catalog2.common.dto.api.music.RadioStation;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.ConcertSliderViewStyle;
import com.vk.catalog2.common.dto.api.style.FiltersViewStyle;
import com.vk.catalog2.common.dto.api.style.MusicRecommendedPlaylistViewStyle;
import com.vk.catalog2.common.dto.api.style.MusicTrackCatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.SavePlaylistViewStyle;
import com.vk.catalog2.common.dto.api.style.VkMixInteractiveViewStyle;
import com.vk.catalog2.common.dto.api.style.VkMixViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.catalog2.common.dto.ui.UIBlockArtistBio;
import com.vk.catalog2.common.dto.ui.UIBlockButtons;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.UIBlockShimmer;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSaveAsPlaylistFromBlock;
import com.vk.catalog2.feature.music.dto.ui.MusicArtistChip;
import com.vk.catalog2.feature.music.dto.ui.MusicArtistInfo;
import com.vk.catalog2.feature.music.dto.ui.UIBlockAudioContentCard;
import com.vk.catalog2.feature.music.dto.ui.UIBlockConcert;
import com.vk.catalog2.feature.music.dto.ui.UIBlockLegalNotice;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicAggregatedUpdate;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicArtist;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicArtistNew;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicCurator;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylistUpdate;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicSpecial;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.catalog2.feature.music.dto.ui.UIBlockRadioStation;
import com.vk.catalog2.feature.music.dto.ui.UiBlockInteractiveVkMix;
import com.vk.catalog2.feature.music.dto.ui.UiBlockMusicVkMixStyle;
import com.vk.catalog2.feature.music.dto.ui.UiBlockSimpleVkMix;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
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
import com.vk.dto.music.Thumb;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.podcast.ExtendedPodcast;
import com.vk.dto.podcast.FriendsLikedEpisode;
import com.vk.dto.podcast.OfflinePodcast;
import com.vk.dto.podcast.Podcast;
import com.vk.dto.podcast.PodcastSliderItem;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.c670;
import xsna.djk0;
import xsna.gsa0;
import xsna.hgb0;
import xsna.hpn0;
import xsna.iu;
import xsna.iwi;
import xsna.k840;
import xsna.ld4;
import xsna.nq3;
import xsna.o670;
import xsna.xom0;
import xsna.y8z;

/* compiled from: MusicBlockCatalogTransformer.kt */
/* loaded from: classes16.dex */
public final class bc40 implements xe7 {
    public final HashMap b = pn00.i(new Pair(CatalogDataType.DATA_TYPE_MUSIC_TRACKS, k.b), new Pair(CatalogDataType.DATA_TYPE_MUSIC_PLAYLISTS, v.b), new Pair(CatalogDataType.DATA_TYPE_MUSIC_RECOMMENDED_PLAYLISTS, w.b), new Pair(CatalogDataType.DATA_TYPE_AUDIO_CONTENT_CARDS, x.b), new Pair(CatalogDataType.DATA_TYPE_ARTIST, y.b), new Pair(CatalogDataType.DATA_TYPE_CURATOR, z.b), new Pair(CatalogDataType.DATA_TYPE_AUDIO_FOLLOWINGS_UPDATE_INFO, a0.b), new Pair(CatalogDataType.DATA_TYPE_AUDIO_FOLLOWINGS_UPDATE_ITEM, b0.b), new Pair(CatalogDataType.DATA_TYPE_AUDIO_STREAM_MIXES, c0.b), new Pair(CatalogDataType.DATA_TYPE_MUSIC_SPECIAL, a.b), new Pair(CatalogDataType.DATA_TYPE_PODCASTS, b.b), new Pair(CatalogDataType.DATA_TYPE_OFFLINE_PODCASTS, c.b), new Pair(CatalogDataType.DATA_TYPE_PODCAST_EPISODES, d.b), new Pair(CatalogDataType.DATA_TYPE_PODCAST_SLIDER_ITEMS, e.b), new Pair(CatalogDataType.DATA_TYPE_EXTENDED_PODCASTS, f.b), new Pair(CatalogDataType.DATA_TYPE_FRIENDS_LIKE_EPISODE, g.b), new Pair(CatalogDataType.DATA_TYPE_MUSIC_OWNERS, h.b), new Pair(CatalogDataType.DATA_TYPE_AUDIO_SIGNAL_COMMON_INFO, i.b), new Pair(CatalogDataType.DATA_TYPE_RADIO_STATIONS, j.b), new Pair(CatalogDataType.DATA_TYPE_AUDIOBOOKS, l.b), new Pair(CatalogDataType.DATA_TYPE_AUDIOBOOKS_PERSONS, m.b), new Pair(CatalogDataType.DATA_TYPE_CONCERTS, n.b), new Pair(CatalogDataType.DATA_TYPE_NONE, o.b), new Pair(CatalogDataType.DATA_TYPE_LINKS, p.b), new Pair(CatalogDataType.DATA_TYPE_ACTION, q.b), new Pair(CatalogDataType.DATA_TYPE_PLACEHOLDER, r.b), new Pair(CatalogDataType.DATA_TYPE_CATALOG_BANNERS, s.b), new Pair(CatalogDataType.DATA_TYPE_GROUP_BANNERS, t.b), new Pair(CatalogDataType.DATA_SYNTHETIC_LOADING, u.b));

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final a b = new a(4, djk0.class, "transformSpecialBlocks", "transformSpecialBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
        @Override // xsna.zzs
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            Object obj;
            UIBlockActionOpenSection uIBlockActionOpenSection;
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            nq8 nq8Var2 = nq8Var;
            if (djk0.a.$EnumSwitchMapping$0[catalogBlock2.i.b.ordinal()] != 1) {
                return EmptyList.b;
            }
            List A = rli0.A(rli0.k(new i5g(catalogBlock2.Gb(catalogExtendedData2)), Thumb.class));
            ArrayList a = nq8Var2.a(catalogExtendedData2, catalogBlock2.j, bi20Var2);
            Iterator it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((UIBlockAction) obj) instanceof UIBlockActionPlayAudiosFromBlock) {
                    break;
                }
            }
            UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock = obj instanceof UIBlockActionPlayAudiosFromBlock ? (UIBlockActionPlayAudiosFromBlock) obj : null;
            if (uIBlockActionPlayAudiosFromBlock == null) {
                return EmptyList.b;
            }
            Iterator it2 = a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    uIBlockActionOpenSection = 0;
                    break;
                }
                uIBlockActionOpenSection = it2.next();
                if (((UIBlockAction) uIBlockActionOpenSection) instanceof UIBlockActionOpenSection) {
                    break;
                }
            }
            UIBlockActionOpenSection uIBlockActionOpenSection2 = uIBlockActionOpenSection instanceof UIBlockActionOpenSection ? uIBlockActionOpenSection : null;
            return uIBlockActionOpenSection2 == null ? EmptyList.b : Collections.singletonList(new UIBlockMusicSpecial(bi20Var2.a, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, A, bi20Var2.f, bi20Var2.g, uIBlockActionPlayAudiosFromBlock, uIBlockActionOpenSection2));
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class a0 extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final a0 b = new a0(4, m4s.class, "transformFollowingsUpdateInfoBlocks", "transformFollowingsUpdateInfoBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
        @Override // xsna.zzs
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            AudioFollowingsUpdateInfo audioFollowingsUpdateInfo;
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            nq8 nq8Var2 = nq8Var;
            Iterator it = catalogBlock2.Gb(catalogExtendedData2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    audioFollowingsUpdateInfo = 0;
                    break;
                }
                audioFollowingsUpdateInfo = it.next();
                if (audioFollowingsUpdateInfo instanceof AudioFollowingsUpdateInfo) {
                    break;
                }
            }
            AudioFollowingsUpdateInfo audioFollowingsUpdateInfo2 = audioFollowingsUpdateInfo instanceof AudioFollowingsUpdateInfo ? audioFollowingsUpdateInfo : null;
            if (audioFollowingsUpdateInfo2 == null) {
                return EmptyList.b;
            }
            return Collections.singletonList(new UIBlockMusicAggregatedUpdate(bi20Var2.b(), audioFollowingsUpdateInfo2, (UIBlockAction) j5g.a0(nq8Var2.a(catalogExtendedData2, catalogBlock2.j, bi20Var2))));
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final b b = new b(4, hgb0.class, "transformPodcastBlocks", "transformPodcastBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.zzs
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            return rli0.A(new ulp0(rli0.k(new i5g(catalogBlock.Gb(catalogExtendedData)), Podcast.class), new mga0(bi20Var, 2)));
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class b0 extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final b0 b = new b0(4, m4s.class, "transformFollowingsUpdateItemBlocks", "transformFollowingsUpdateItemBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.zzs
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            bi20 bi20Var2 = bi20Var;
            ArrayList Gb = catalogBlock.Gb(catalogExtendedData);
            ArrayList arrayList = new ArrayList();
            Iterator it = Gb.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                AudioFollowingsUpdateItem audioFollowingsUpdateItem = next instanceof AudioFollowingsUpdateItem ? (AudioFollowingsUpdateItem) next : null;
                if (audioFollowingsUpdateItem != null) {
                    arrayList.add(audioFollowingsUpdateItem);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new UIBlockMusicPlaylistUpdate(bi20Var2.a, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, (AudioFollowingsUpdateItem) it2.next()));
            }
            return arrayList2;
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final c b = new c(4, hgb0.class, "transformOfflinePodcastBlocks", "transformOfflinePodcastBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.zzs
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            return rli0.A(new ulp0(rli0.k(new i5g(catalogBlock.Gb(catalogExtendedData)), OfflinePodcast.class), new lxz(bi20Var, 18)));
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class c0 extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final c0 b = new c0(4, xom0.class, "transformAudioStreamMixBlocks", "transformAudioStreamMixBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.zzs
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            nq8 nq8Var2 = nq8Var;
            int i = xom0.a.$EnumSwitchMapping$0[catalogBlock2.i.b.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return EmptyList.b;
                }
                String str = (String) j5g.a0(catalogBlock2.m.j);
                if (str == null) {
                    str = "";
                }
                CatalogStateInfo catalogStateInfo = (CatalogStateInfo) catalogExtendedData2.Fb().get(str);
                UIBlockPlaceholder c = catalogStateInfo != null ? fsa0.c(bi20Var2, catalogStateInfo, catalogExtendedData2, nq8Var2) : null;
                ArrayList Gb = catalogBlock2.Gb(catalogExtendedData2);
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
                    arrayList2.add(new UiBlockInteractiveVkMix(com.vk.catalog2.common.dto.api.ui.a.a(bi20Var2.b(), null, null, null, null, null, new VkMixInteractiveViewStyle(Gb.size() == 1 ? VkMixInteractiveViewStyle.Style.STATIC : VkMixInteractiveViewStyle.Style.Default), 7679), catalogAudioStreamMix2.b, catalogAudioStreamMix2.f, catalogAudioStreamMix2.g, catalogAudioStreamMix2.e, catalogAudioStreamMix2.h, c));
                }
                return Collections.singletonList(bez.b(bi20Var2, arrayList2, EmptyList.b, null, null, null, null, false, null, false, null, 524280));
            }
            ArrayList Gb2 = catalogBlock2.Gb(catalogExtendedData2);
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = Gb2.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                CatalogAudioStreamMix catalogAudioStreamMix3 = next2 instanceof CatalogAudioStreamMix ? (CatalogAudioStreamMix) next2 : null;
                if (catalogAudioStreamMix3 != null) {
                    arrayList3.add(catalogAudioStreamMix3);
                }
            }
            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                CatalogAudioStreamMix catalogAudioStreamMix4 = (CatalogAudioStreamMix) it4.next();
                String string = bi20Var2.p.getString(CatalogCustomAttributes$Keys.STYLE.h());
                VkMixViewStyle.Style.Companion.getClass();
                com.vk.catalog2.common.dto.api.ui.a aVar = new com.vk.catalog2.common.dto.api.ui.a(bi20Var2.a, bi20Var2.b, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, new VkMixViewStyle(VkMixViewStyle.Style.a.a(string)), bi20Var2.r, (CatalogLaunchOrigin) null, 5120);
                String str2 = catalogAudioStreamMix4.b;
                boolean z = catalogAudioStreamMix4.h;
                String str3 = catalogAudioStreamMix4.c;
                AudioStreamMixTitles audioStreamMixTitles = catalogAudioStreamMix4.f;
                String str4 = catalogAudioStreamMix4.d;
                String str5 = catalogAudioStreamMix4.g;
                UiBlockMusicVkMixStyle.Companion.getClass();
                arrayList4.add(new UiBlockSimpleVkMix(aVar, str2, z, str3, audioStreamMixTitles, str4, str5, UiBlockMusicVkMixStyle.a.a(string)));
            }
            return arrayList4;
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final d b = new d(4, hgb0.class, "transformPodcastEpisodeBlocks", "transformPodcastEpisodeBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.zzs
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            if (hgb0.a.$EnumSwitchMapping$0[catalogBlock2.i.b.ordinal()] != 1) {
                return rli0.A(new ulp0(rli0.k(new i5g(catalogBlock2.Gb(catalogExtendedData2)), MusicTrack.class), new owv(bi20Var2, 25)));
            }
            return rli0.A(new ulp0(rli0.j(new i5g(catalogBlock2.Gb(catalogExtendedData2)), igb0.c), new qm90(3, bi20Var2, (CatalogButtonOpenUrl) j5g.a0(catalogBlock2.j))));
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final e b = new e(4, hgb0.class, "transformPodcastSliderItemBlocks", "transformPodcastSliderItemBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.zzs
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            return hgb0.a.$EnumSwitchMapping$0[catalogBlock2.i.b.ordinal()] == 2 ? rli0.A(new ulp0(rli0.t(rli0.k(new i5g(catalogBlock2.Gb(catalogExtendedData2)), PodcastSliderItem.class), jgb0.b), new ggb0(bi20Var2, 0))) : rli0.A(new ulp0(rli0.k(new i5g(catalogBlock2.Gb(catalogExtendedData2)), PodcastSliderItem.class), new p010(bi20Var2, 19)));
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final f b = new f(4, hgb0.class, "transformExtendedPodcastBlocks", "transformExtendedPodcastBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.zzs
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            return hgb0.a.$EnumSwitchMapping$0[catalogBlock2.i.b.ordinal()] == 2 ? rli0.A(new ulp0(rli0.k(new i5g(catalogBlock2.Gb(catalogExtendedData2)), ExtendedPodcast.class), new d410(bi20Var2, 18))) : rli0.A(new ulp0(rli0.k(new i5g(catalogBlock2.Gb(catalogExtendedData2)), ExtendedPodcast.class), new w620(bi20Var2, 15)));
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final g b = new g(4, hgb0.class, "transformFriendLikedEpisodeBlocks", "transformFriendLikedEpisodeBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.zzs
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            return rli0.A(new ulp0(rli0.k(new i5g(catalogBlock.Gb(catalogExtendedData2)), FriendsLikedEpisode.class), new mu1(26, catalogExtendedData2, bi20Var)));
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final h b = new h(4, p490.class, "transformOwnerBlocks", "transformOwnerBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.zzs
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            return rli0.A(new ulp0(rli0.k(new i5g(catalogBlock2.Gb(catalogExtendedData2)), MusicOwner.class), new fk50(nq8Var, bi20Var, catalogBlock2, catalogExtendedData2, 1)));
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class i extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final i b = new i(4, imj0.class, "transformSignalCommonInfoBlocks", "transformSignalCommonInfoBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.zzs
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            return rli0.A(new ulp0(rli0.k(new i5g(catalogBlock.Gb(catalogExtendedData2)), MusicSignalInfo.class), new lyb0(2, bi20Var, catalogExtendedData2)));
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class j extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final j b = new j(4, rte0.class, "transformRadioStationBlocks", "transformRadioStationBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.zzs
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            bi20 bi20Var2 = bi20Var;
            ArrayList Gb = catalogBlock.Gb(catalogExtendedData);
            ArrayList arrayList = new ArrayList();
            Iterator it = Gb.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof RadioStation) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new UIBlockRadioStation(new com.vk.catalog2.common.dto.api.ui.a(bi20Var2.a, bi20Var2.b, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7680), (RadioStation) it2.next(), arrayList));
            }
            return j5g.O0(arrayList2);
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class k extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final k b = new k(4, k15.class, "transformMusicAudioBlocks", "transformMusicAudioBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.zzs
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            UIBlockMusicTrack x;
            String str;
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
            MusicTrackCatalogViewStyle musicTrackCatalogViewStyle = new MusicTrackCatalogViewStyle(bi20Var2.p.getString(CatalogCustomAttributes$Keys.STYLE.h()));
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                MusicTrack musicTrack2 = (MusicTrack) it2.next();
                if (musicTrackCatalogViewStyle.b == MusicTrackCatalogViewStyle.Style.FoundByLyrics) {
                    Object Ab = catalogExtendedData2.Ab(CatalogDataType.DATA_TYPE_TEXTS, musicTrack2.Fb());
                    CatalogText catalogText = Ab instanceof CatalogText ? (CatalogText) Ab : null;
                    x = k15.w(bi20Var2, musicTrack2, musicTrackCatalogViewStyle, (catalogText == null || (str = catalogText.d) == null) ? null : brm0.y(str, "\\/", DomExceptionUtils.SEPARATOR));
                } else {
                    x = k15.x(bi20Var2, musicTrack2, musicTrackCatalogViewStyle, 8);
                }
                arrayList2.add(x);
            }
            return rte0.E(arrayList2, bi20Var2);
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class l extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final l b = new l(4, ld4.class, "transformAudiobookBlocks", "transformAudiobookBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.zzs
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            if (ld4.a.$EnumSwitchMapping$0[catalogBlock2.i.b.ordinal()] != 1) {
                return rli0.A(new ulp0(rli0.u(rli0.j(new i5g(catalogBlock2.Gb(catalogExtendedData2)), kg1.d), new kz0(2)), new lz0(bi20Var2, 3)));
            }
            int i = 2;
            return rli0.A(new ulp0(rli0.u(rli0.j(new i5g(catalogBlock2.Gb(catalogExtendedData2)), md4.b), new sm(i)), new sh3(i, bi20Var2, (CatalogButtonOpenUrl) j5g.a0(catalogBlock2.j))));
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class m extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final m b = new m(4, ld4.class, "transformAudiobookPersonBlocks", "transformAudiobookPersonBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.zzs
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            return rli0.A(new ulp0(rli0.j(new i5g(catalogBlock.Gb(catalogExtendedData)), lg1.d), new l5(bi20Var, 4)));
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class n extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final n b = new n(4, iwi.class, "transformConcertBlocks", "transformConcertBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.zzs
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            int i = iwi.a.$EnumSwitchMapping$0[catalogBlock2.i.b.ordinal()];
            ConcertSliderViewStyle concertSliderViewStyle = null;
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                ArrayList Gb = catalogBlock2.Gb(catalogExtendedData2);
                ArrayList arrayList = new ArrayList();
                Iterator it = Gb.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof CatalogConcertItem) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new UIBlockConcert(bi20Var2.b(), (CatalogConcertItem) it2.next(), true));
                }
                return arrayList2;
            }
            String string = bi20Var2.p.getString(CatalogCustomAttributes$Keys.STYLE.h());
            if (string != null) {
                ConcertSliderViewStyle.Style.Companion.getClass();
                concertSliderViewStyle = new ConcertSliderViewStyle(ConcertSliderViewStyle.Style.a.a(string));
            }
            com.vk.catalog2.common.dto.api.ui.a aVar = new com.vk.catalog2.common.dto.api.ui.a(bi20Var2.a, bi20Var2.b, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, concertSliderViewStyle, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7168);
            ArrayList Gb2 = catalogBlock2.Gb(catalogExtendedData2);
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = Gb2.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                if (next2 instanceof CatalogConcertItem) {
                    arrayList3.add(next2);
                }
            }
            boolean z = arrayList3.size() == 1;
            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                arrayList4.add(new UIBlockConcert(aVar, (CatalogConcertItem) it4.next(), z));
            }
            return arrayList4;
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class o extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final o b = new o(4, o670.class, "transformNoneBlocks", "transformNoneBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.zzs
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            bi20 bi20Var2 = bi20Var;
            CatalogLayout catalogLayout = catalogBlock.i;
            int i = o670.a.$EnumSwitchMapping$0[catalogLayout.b.ordinal()];
            if ((i == 1 || i == 2 || i == 3 || i == 4) && epx.f(catalogLayout.h.getString(CatalogCustomAttributes$Keys.STYLE.h()), CatalogCustomAttributes$Values.LEGAL_NOTICE.h())) {
                return Collections.singletonList(new UIBlockLegalNotice(bi20Var2.c(CatalogViewType.SYNTHETIC_LEGAL_NOTICE), catalogLayout.d, catalogLayout.e));
            }
            return null;
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class p extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final p b = new p(4, y8z.class, "transformLinkBlocks", "transformLinkBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.zzs
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            int i = y8z.a.$EnumSwitchMapping$0[bi20Var2.d.ordinal()];
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5) {
                return null;
            }
            ArrayList Gb = catalogBlock2.Gb(catalogExtendedData2);
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
                arrayList2.add(new UIBlockLink(bi20Var2.a, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, bi20Var2.b, (CatalogLink) it2.next(), null, bi20Var2.u));
            }
            return bez.c(arrayList2, bi20Var2);
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class q extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final q b = new q(4, iu.class, "transformActionBlocks", "transformActionBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        /* JADX WARN: Removed duplicated region for block: B:43:0x00f2 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0097 A[SYNTHETIC] */
        @Override // xsna.zzs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            UIBlockActionSaveAsPlaylistFromBlock uIBlockActionSaveAsPlaylistFromBlock;
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            nq8 nq8Var2 = nq8Var;
            ArrayList<CatalogButton> arrayList = catalogBlock2.j;
            CatalogLayout catalogLayout = catalogBlock2.i;
            int i = iu.a.$EnumSwitchMapping$0[catalogLayout.b.ordinal()];
            FiltersViewStyle filtersViewStyle = null;
            if (i == 1) {
                Object a0 = j5g.a0(arrayList);
                CatalogButtonFilters catalogButtonFilters = a0 instanceof CatalogButtonFilters ? (CatalogButtonFilters) a0 : null;
                if (catalogButtonFilters == null) {
                    return EmptyList.b;
                }
                List list = catalogButtonFilters.g;
                if (list == null) {
                    list = EmptyList.b;
                }
                ArrayList c = hu.c(bi20Var2, list, catalogButtonFilters.i, catalogBlock2.b, CatalogViewType.SUBSECTION_FILTER_BUTTON, null, 32);
                String str = bi20Var2.a;
                CatalogViewType catalogViewType = CatalogViewType.SUBSECTION_TABS;
                CatalogDataType catalogDataType = bi20Var2.c;
                String str2 = bi20Var2.k;
                UserId userId = bi20Var2.e;
                List<String> list2 = bi20Var2.j;
                Set<UIBlockDragDropAction> set = bi20Var2.m;
                UIBlockHint uIBlockHint = bi20Var2.o;
                if (com.vk.toggle.d.I() && epx.f(catalogButtonFilters.c, "my_music_subsection_tabs")) {
                    filtersViewStyle = new FiltersViewStyle(FiltersViewStyle.Style.TABS);
                }
                return Collections.singletonList(new UIBlockButtons(str, catalogViewType, catalogDataType, str2, userId, list2, set, uIBlockHint, c, filtersViewStyle));
            }
            if (i == 2) {
                ArrayList arrayList2 = new ArrayList();
                for (CatalogButton catalogButton : arrayList) {
                    if (com.vk.toggle.d.I() && (catalogButton instanceof CatalogButtonSaveAsPlaylist)) {
                        CatalogButtonSaveAsPlaylist catalogButtonSaveAsPlaylist = (CatalogButtonSaveAsPlaylist) catalogButton;
                        if (epx.f(catalogButtonSaveAsPlaylist.c, "my_music_filter_save_as_playlist")) {
                            String str3 = catalogButtonSaveAsPlaylist.f;
                            if (str3 != null) {
                                uIBlockActionSaveAsPlaylistFromBlock = new UIBlockActionSaveAsPlaylistFromBlock(com.vk.catalog2.common.dto.api.ui.a.a(bi20Var2.b(), null, null, null, null, null, new SavePlaylistViewStyle(SavePlaylistViewStyle.Style.MyMusic), 7679), catalogLayout.b, catalogButtonSaveAsPlaylist.i, str3, catalogButtonSaveAsPlaylist.e, catalogButtonSaveAsPlaylist.h, catalogButtonSaveAsPlaylist.j);
                                if (uIBlockActionSaveAsPlaylistFromBlock == null) {
                                    arrayList2.add(uIBlockActionSaveAsPlaylistFromBlock);
                                }
                            }
                        }
                    }
                    uIBlockActionSaveAsPlaylistFromBlock = null;
                    if (uIBlockActionSaveAsPlaylistFromBlock == null) {
                    }
                }
                return arrayList2;
            }
            if (i == 3) {
                return Collections.singletonList(new UIBlockButtons(bi20Var2.a, catalogLayout.b, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, nq8Var2.a(catalogExtendedData2, arrayList, bi20Var2), null));
            }
            if (i == 4) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof CatalogButtonPlayMix) {
                        arrayList3.add(obj);
                    }
                }
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add(zua0.a((CatalogButtonPlayMix) it.next(), bi20Var2));
                }
                return arrayList4;
            }
            return null;
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class r extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final r b = new r(4, gsa0.class, "transformPlaceholderBlocks", "transformPlaceholderBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.zzs
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            nq8 nq8Var2 = nq8Var;
            switch (gsa0.a.$EnumSwitchMapping$0[catalogBlock2.i.b.ordinal()]) {
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
                        if (next instanceof CatalogStateInfo) {
                            arrayList.add(next);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(fsa0.c(bi20Var2, (CatalogStateInfo) it2.next(), catalogExtendedData2, nq8Var2));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.addAll(arrayList2);
                    fsa0.a(catalogBlock2, arrayList3, bi20Var2);
                    return arrayList3;
                default:
                    return null;
            }
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class s extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final s b = new s(4, k16.class, "transformBannerBlocks", "transformBannerBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.zzs
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            return k16.a(catalogBlock, catalogExtendedData, bi20Var, nq8Var);
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class t extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final t b = new t(4, k16.class, "transformBannerBlocks", "transformBannerBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.zzs
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            return k16.a(catalogBlock, catalogExtendedData, bi20Var, nq8Var);
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class u extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final u b = new u(4, hpn0.class, "transformSyntheticLoadingBlocks", "transformSyntheticLoadingBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.zzs
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            nq8 nq8Var2 = nq8Var;
            int i = hpn0.a.$EnumSwitchMapping$0[catalogBlock2.i.b.ordinal()];
            if (i != 1) {
                int i2 = 2;
                String str = null;
                Object[] objArr = 0;
                if (i != 2) {
                    return null;
                }
                return Collections.singletonList(new UIBlockShimmer(com.vk.catalog2.common.dto.api.ui.a.a(bi20Var2.b(), null, null, null, null, null, new VkMixInteractiveViewStyle(catalogBlock2.m.c.size() == 1 ? VkMixInteractiveViewStyle.Style.STATIC : VkMixInteractiveViewStyle.Style.Default), 7679), str, i2, objArr == true ? 1 : 0));
            }
            ArrayList E = g5g.E(catalogBlock2.Hb(catalogExtendedData2, CatalogDataType.DATA_TYPE_CATALOG_BANNERS), CatalogStateInfo.class);
            ArrayList arrayList = new ArrayList(c5g.u(E, 10));
            Iterator it = E.iterator();
            while (it.hasNext()) {
                arrayList.add(fsa0.c(bi20.a(bi20Var2, CatalogDataType.DATA_SYNTHETIC_LOADING, null, null, null, null, null, 33554427), (CatalogStateInfo) it.next(), catalogExtendedData2, nq8Var2));
            }
            return arrayList;
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class v extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final v b = new v(4, e7b0.class, "transformPlaylistBlocks", "transformPlaylistBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.zzs
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            UserId userId;
            List<String> list;
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            ArrayList Gb = catalogBlock2.Gb(catalogExtendedData2);
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
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Playlist playlist2 = (Playlist) it2.next();
                PlaylistLink playlistLink = playlist2.f;
                if (playlistLink == null || (userId = playlistLink.c) == null) {
                    userId = playlist2.c;
                }
                rba Gb2 = catalogExtendedData2.Gb(fkq0.a(userId));
                UserProfile userProfile = Gb2.a;
                Group group = Gb2.b;
                playlist2.q = userProfile != null ? new PlaylistOwner(userProfile) : group != null ? new PlaylistOwner(group) : null;
                ArtistsIdsList artistsIdsList = catalogBlock2.m.m.get(playlist2.Ib());
                arrayList2.add(new UIBlockMusicPlaylist(bi20Var2.b(), playlist2, null, null, null, null, false, arrayList.size() == 1, null, (artistsIdsList == null || (list = artistsIdsList.b) == null) ? null : catalogExtendedData2.Bb(list), 380, null));
            }
            return arrayList2;
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class w extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final w b = new w(4, e7b0.class, "transformRecommendedPlaylistBlocks", "transformRecommendedPlaylistBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.zzs
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            UserId userId;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            ArrayList Gb = catalogBlock.Gb(catalogExtendedData2);
            ArrayList arrayList = new ArrayList();
            Iterator it = Gb.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                PlaylistRecommendationData playlistRecommendationData = next instanceof PlaylistRecommendationData ? (PlaylistRecommendationData) next : null;
                if (playlistRecommendationData != null) {
                    arrayList.add(playlistRecommendationData);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                PlaylistRecommendationData playlistRecommendationData2 = (PlaylistRecommendationData) it2.next();
                Playlist playlist = playlistRecommendationData2.b;
                RecommendedPlaylist recommendedPlaylist = playlistRecommendationData2.c;
                PlaylistLink playlistLink = playlist.f;
                if (playlistLink == null || (userId = playlistLink.c) == null) {
                    userId = playlist.c;
                }
                rba Gb2 = catalogExtendedData2.Gb(fkq0.a(userId));
                UserProfile userProfile = Gb2.a;
                Group group = Gb2.b;
                playlist.q = userProfile != null ? new PlaylistOwner(userProfile) : group != null ? new PlaylistOwner(group) : null;
                List<String> list = recommendedPlaylist.g;
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    Object Ab = catalogExtendedData2.Ab(CatalogDataType.DATA_TYPE_MUSIC_TRACKS, (String) it3.next());
                    MusicTrack musicTrack = Ab instanceof MusicTrack ? (MusicTrack) Ab : null;
                    if (musicTrack != null) {
                        arrayList3.add(musicTrack);
                    }
                }
                playlist.y = arrayList3;
                playlist.q = userProfile != null ? new PlaylistOwner(userProfile) : group != null ? new PlaylistOwner(group) : null;
                List<String> list2 = recommendedPlaylist.g;
                ArrayList arrayList4 = new ArrayList();
                Iterator<T> it4 = list2.iterator();
                while (it4.hasNext()) {
                    Object Ab2 = catalogExtendedData2.Ab(CatalogDataType.DATA_TYPE_MUSIC_TRACKS, (String) it4.next());
                    MusicTrack musicTrack2 = Ab2 instanceof MusicTrack ? (MusicTrack) Ab2 : null;
                    if (musicTrack2 != null) {
                        arrayList4.add(musicTrack2);
                    }
                }
                playlist.y = arrayList4;
                arrayList2.add(new UIBlockMusicPlaylist(com.vk.catalog2.common.dto.api.ui.a.a(bi20Var2.b(), null, null, null, null, null, new MusicRecommendedPlaylistViewStyle(bi20Var2.p.getString(CatalogCustomAttributes$Keys.STYLE.h())), 7679), playlist, recommendedPlaylist.d, recommendedPlaylist.e, recommendedPlaylist.h, recommendedPlaylist.i, recommendedPlaylist.j, false, recommendedPlaylist.k, null, 640, null));
            }
            return arrayList2;
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class x extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final x b = new x(4, c670.class, "transformContentCardBlocks", "transformContentCardBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        /* JADX WARN: Removed duplicated region for block: B:43:0x00cc A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0036 A[SYNTHETIC] */
        @Override // xsna.zzs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            Serializer.StreamParcelableAdapter streamParcelableAdapter;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            ArrayList Gb = catalogBlock.Gb(catalogExtendedData2);
            ArrayList arrayList = new ArrayList();
            Iterator it = Gb.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                CatalogAudioContentCard catalogAudioContentCard = next instanceof CatalogAudioContentCard ? (CatalogAudioContentCard) next : null;
                if (catalogAudioContentCard != null) {
                    arrayList.add(catalogAudioContentCard);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                CatalogAudioContentCard catalogAudioContentCard2 = (CatalogAudioContentCard) it2.next();
                List<UIBlockAction> list = bi20Var2.l;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof UIBlockActionOpenUrl) {
                        arrayList3.add(obj);
                    }
                }
                UIBlockActionOpenUrl uIBlockActionOpenUrl = (UIBlockActionOpenUrl) j5g.a0(arrayList3);
                CatalogAudioContentCard.EntityType entityType = catalogAudioContentCard2.b;
                int i = entityType == null ? -1 : c670.a.$EnumSwitchMapping$0[entityType.ordinal()];
                if (i != -1) {
                    if (i == 1) {
                        Podcast podcast = catalogExtendedData2.R.get(catalogAudioContentCard2.Ab());
                        if (podcast != null) {
                            streamParcelableAdapter = new UIBlockAudioContentCard.PodcastCard(catalogAudioContentCard2, uIBlockActionOpenUrl, podcast, bi20Var2.b());
                        }
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AudioBook audioBook = catalogExtendedData2.W.get(catalogAudioContentCard2.c);
                        if (audioBook != null) {
                            com.vk.catalog2.common.dto.api.ui.a b2 = bi20Var2.b();
                            qh4 a = k840.a.a();
                            bpn0 bpn0Var = o25.a;
                            if (bpn0Var == null) {
                                bpn0Var = null;
                            }
                            a.B(((b25) bpn0Var.getValue()).c(), audioBook);
                            streamParcelableAdapter = new UIBlockAudioContentCard.AudioBookCard(catalogAudioContentCard2, uIBlockActionOpenUrl, audioBook, b2);
                        }
                    }
                    if (streamParcelableAdapter == null) {
                        arrayList2.add(streamParcelableAdapter);
                    }
                }
                streamParcelableAdapter = null;
                if (streamParcelableAdapter == null) {
                }
            }
            return arrayList2;
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class y extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final y b = new y(4, nq3.class, "transformArtistBlocks", "transformArtistBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        /* JADX WARN: Removed duplicated region for block: B:67:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0230  */
        @Override // xsna.zzs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            Object obj;
            String str;
            int i;
            Iterator it;
            Serializer.StreamParcelableAdapter uIBlockArtistBio;
            Serializer.StreamParcelableAdapter streamParcelableAdapter;
            UIBlockAction uIBlockAction;
            CatalogBlock catalogBlock2 = catalogBlock;
            CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
            bi20 bi20Var2 = bi20Var;
            nq8 nq8Var2 = nq8Var;
            List<String> list = bi20Var2.j;
            List<String> list2 = catalogBlock2.m.j;
            List<UIBlockAction> list3 = bi20Var2.l;
            Iterator<T> it2 = list3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((UIBlockAction) obj) instanceof UIBlockActionPlayAudiosFromBlock) {
                    break;
                }
            }
            UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock = (UIBlockActionPlayAudiosFromBlock) obj;
            List<CatalogArtistInfo> list4 = catalogBlock2.t;
            int i2 = 10;
            ArrayList arrayList = new ArrayList(c5g.u(list4, 10));
            for (CatalogArtistInfo catalogArtistInfo : list4) {
                List<CatalogArtistChip> list5 = catalogArtistInfo.b;
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it3 = list5.iterator();
                while (it3.hasNext()) {
                    CatalogButton catalogButton = ((CatalogArtistChip) it3.next()).d;
                    if (catalogButton != null) {
                        arrayList2.add(catalogButton);
                    }
                }
                ArrayList a = nq8Var2.a(catalogExtendedData2, arrayList2, bi20Var2);
                List<CatalogArtistChip> list6 = catalogArtistInfo.b;
                ArrayList arrayList3 = new ArrayList(c5g.u(list6, i2));
                int i3 = 0;
                for (CatalogArtistChip catalogArtistChip : list6) {
                    if (catalogArtistChip.d != null) {
                        uIBlockAction = (UIBlockAction) j5g.b0(i3, a);
                        i3++;
                    } else {
                        uIBlockAction = null;
                    }
                    String str2 = catalogArtistChip.b;
                    nq8 nq8Var3 = nq8Var2;
                    String str3 = catalogArtistChip.c;
                    String str4 = catalogArtistChip.e;
                    String str5 = catalogArtistChip.h;
                    String str6 = catalogArtistChip.f;
                    String str7 = catalogArtistChip.g;
                    CatalogButton catalogButton2 = catalogArtistChip.d;
                    arrayList3.add(new MusicArtistChip(str2, str3, uIBlockAction, str4, str6, str7, str5, catalogButton2 != null ? catalogButton2.getType() : null));
                    nq8Var2 = nq8Var3;
                }
                arrayList.add(new MusicArtistInfo(arrayList3, catalogArtistInfo.c, catalogArtistInfo.d, catalogArtistInfo.e, catalogArtistInfo.f, catalogArtistInfo.g, catalogArtistInfo.h, catalogArtistInfo.i));
                nq8Var2 = nq8Var2;
                i2 = 10;
            }
            ArrayList Gb = catalogBlock2.Gb(catalogExtendedData2);
            ArrayList arrayList4 = new ArrayList();
            Iterator it4 = Gb.iterator();
            int i4 = 0;
            while (it4.hasNext()) {
                Object next = it4.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    e43.t();
                    throw null;
                }
                Artist artist = next instanceof Artist ? (Artist) next : null;
                if (artist == null) {
                    it = it4;
                    streamParcelableAdapter = null;
                } else {
                    String str8 = (String) j5g.b0(i4, list2);
                    if (str8 == null) {
                        str8 = (String) j5g.a0(list2);
                    }
                    if (str8 != null) {
                        Object Ab = catalogExtendedData2.Ab(CatalogDataType.DATA_TYPE_GROUPS, str8);
                        Group group = Ab instanceof Group ? (Group) Ab : null;
                        if (group == null || !group.j) {
                            str = str8;
                            i = nq3.a.$EnumSwitchMapping$0[bi20Var2.d.ordinal()];
                            if (i != 1) {
                                it = it4;
                                Artist artist2 = artist;
                                MusicArtistInfo musicArtistInfo = (MusicArtistInfo) j5g.a0(arrayList);
                                String str9 = musicArtistInfo != null ? musicArtistInfo.f : null;
                                MusicArtistInfo musicArtistInfo2 = (MusicArtistInfo) j5g.a0(arrayList);
                                String str10 = musicArtistInfo2 != null ? musicArtistInfo2.g : null;
                                MusicArtistInfo musicArtistInfo3 = (MusicArtistInfo) j5g.a0(arrayList);
                                String str11 = musicArtistInfo3 != null ? musicArtistInfo3.h : null;
                                ArrayList arrayList5 = new ArrayList(list);
                                arrayList5.add("artist_subscribe");
                                arrayList5.add("artist_unsubscribe");
                                uIBlockArtistBio = new UIBlockArtistBio(bi20Var2.a, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, arrayList5, bi20Var2.m, artist2, bi20Var2.u, str9, str10, str11);
                            } else if (i != 2) {
                                ArrayList arrayList6 = new ArrayList(list);
                                arrayList6.add("artist_subscribe");
                                arrayList6.add("artist_unsubscribe");
                                it = it4;
                                uIBlockArtistBio = new UIBlockMusicArtist(new com.vk.catalog2.common.dto.api.ui.a(bi20Var2.a, bi20Var2.b, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, arrayList6, bi20Var2.m, (UIBlockHint) null, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, bi20Var2.u, 3840), bi20Var2.o, artist, uIBlockActionPlayAudiosFromBlock, str);
                            } else {
                                it = it4;
                                Artist artist3 = artist;
                                List m = e43.m(artist3.b);
                                ArrayList arrayList7 = new ArrayList(list);
                                arrayList7.add("artist_subscribe");
                                arrayList7.add("artist_unsubscribe");
                                uIBlockArtistBio = new UIBlockMusicArtistNew(new com.vk.catalog2.common.dto.api.ui.a(bi20Var2.a, bi20Var2.b, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, arrayList7, bi20Var2.m, bi20Var2.o, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, bi20Var2.u, 3584), bi20Var2.o, artist3, uIBlockActionPlayAudiosFromBlock, str, list3, arrayList, m);
                            }
                            streamParcelableAdapter = uIBlockArtistBio;
                        }
                    }
                    str = null;
                    i = nq3.a.$EnumSwitchMapping$0[bi20Var2.d.ordinal()];
                    if (i != 1) {
                    }
                    streamParcelableAdapter = uIBlockArtistBio;
                }
                if (streamParcelableAdapter != null) {
                    arrayList4.add(streamParcelableAdapter);
                }
                it4 = it;
                i4 = i5;
            }
            return arrayList4;
        }
    }

    /* compiled from: MusicBlockCatalogTransformer.kt */
    public static final /* synthetic */ class z extends FunctionReferenceImpl implements zzs<CatalogBlock, CatalogExtendedData, bi20, nq8, List<? extends UIBlock>> {
        public static final z b = new z(4, alk.class, "transformCuratorBlocks", "transformCuratorBlocks(Lcom/vk/catalog2/common/dto/api/block/CatalogBlock;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/ButtonListCatalogTransformer;)Ljava/util/List;", 1);

        @Override // xsna.zzs
        public final List<? extends UIBlock> invoke(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, nq8 nq8Var) {
            Object obj;
            bi20 bi20Var2 = bi20Var;
            ArrayList Gb = catalogBlock.Gb(catalogExtendedData);
            ArrayList arrayList = new ArrayList();
            Iterator it = Gb.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Curator curator = next instanceof Curator ? (Curator) next : null;
                if (curator != null) {
                    arrayList.add(curator);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Curator curator2 = (Curator) it2.next();
                Iterator<T> it3 = bi20Var2.l.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    if (((UIBlockAction) obj) instanceof UIBlockActionPlayAudiosFromBlock) {
                        break;
                    }
                }
                arrayList2.add(new UIBlockMusicCurator(new com.vk.catalog2.common.dto.api.ui.a(bi20Var2.a, bi20Var2.b, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, (UIBlockHint) null, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7936), bi20Var2.o, curator2, (UIBlockActionPlayAudiosFromBlock) obj));
            }
            return arrayList2;
        }
    }

    @Override // xsna.xe7
    public final List f(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List list, oq8 oq8Var) {
        zzs zzsVar = (zzs) this.b.get(catalogBlock.c);
        if (zzsVar != null) {
            return (List) zzsVar.invoke(catalogBlock, catalogExtendedData, bi20Var, oq8Var);
        }
        return null;
    }
}
