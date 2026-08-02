package xsna;

import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.music.RadioStation;
import com.vk.catalog2.common.dto.api.style.SearchHistoryViewStyle;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.podcast.Podcast;
import com.vk.music.search.history.SearchHistoryModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.vp70;

/* compiled from: SearchHistoryBlockTransformer.kt */
/* loaded from: classes16.dex */
public final class euh0 {
    public static final euh0 a = new euh0();

    /* compiled from: SearchHistoryBlockTransformer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SearchHistoryModel.Type.values().length];
            try {
                iArr[SearchHistoryModel.Type.Track.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchHistoryModel.Type.TrackLyrics.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchHistoryModel.Type.Artist.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SearchHistoryModel.Type.Curator.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SearchHistoryModel.Type.Podcast.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SearchHistoryModel.Type.AudioBook.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SearchHistoryModel.Type.Album.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SearchHistoryModel.Type.Playlist.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SearchHistoryModel.Type.RadioStation.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SearchHistoryModel.Type.Video.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogViewType.values().length];
            try {
                iArr2[CatalogViewType.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v19, types: [com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory$UIBlockSearchHistoryPlaylist] */
    /* JADX WARN: Type inference failed for: r6v22, types: [com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory$UIBlockSearchHistoryPlaylist] */
    /* JADX WARN: Type inference failed for: r6v25, types: [com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory$UIBlockSearchHistoryRadioStation] */
    /* JADX WARN: Type inference failed for: r6v29, types: [com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory$UIBlockSearchHistoryVideo] */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory$UIBlockSearchHistoryArtist] */
    /* JADX WARN: Type inference failed for: r8v7, types: [com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory$UIBlockSearchHistoryPodcast] */
    /* JADX WARN: Type inference failed for: r8v9, types: [com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory$UIBlockSearchHistoryAudioBook] */
    public static List a(CatalogExtendedData catalogExtendedData, CatalogBlock catalogBlock, bi20 bi20Var) {
        UIBlockSearchHistory.UIBlockSearchHistoryTrack uIBlockSearchHistoryTrack;
        UIBlockSearchHistory.UIBlockSearchHistoryTrack uIBlockSearchHistoryTrack2;
        if (a.$EnumSwitchMapping$1[catalogBlock.i.b.ordinal()] != 1) {
            return EmptyList.b;
        }
        String str = catalogBlock.d;
        List<String> list = catalogBlock.m.c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vp70 a2 = vp70.a.a((String) it.next());
            UIBlockSearchHistory.UIBlockSearchHistoryTrack uIBlockSearchHistoryTrack3 = null;
            if (a2 != null) {
                SearchHistoryModel.Type type = a2.a;
                int i = a.$EnumSwitchMapping$0[type.ordinal()];
                euh0 euh0Var = a;
                switch (i) {
                    case 1:
                    case 2:
                        Serializer.StreamParcelable a3 = i5a.a(catalogExtendedData, a2);
                        MusicTrack musicTrack = a3 instanceof MusicTrack ? (MusicTrack) a3 : null;
                        boolean z = type == SearchHistoryModel.Type.TrackLyrics;
                        euh0Var.getClass();
                        if (musicTrack != null) {
                            uIBlockSearchHistoryTrack3 = new UIBlockSearchHistory.UIBlockSearchHistoryTrack(com.vk.catalog2.common.dto.api.ui.a.a(bi20Var.b(), null, null, null, null, null, z ? new SearchHistoryViewStyle(SearchHistoryViewStyle.Style.TrackLyrics) : new SearchHistoryViewStyle(SearchHistoryViewStyle.Style.Track), 7679), musicTrack, str, null, null, 24, null);
                            break;
                        }
                        break;
                    case 3:
                        Serializer.StreamParcelable a4 = i5a.a(catalogExtendedData, a2);
                        Artist artist = a4 instanceof Artist ? (Artist) a4 : null;
                        euh0Var.getClass();
                        if (artist != null) {
                            uIBlockSearchHistoryTrack = new UIBlockSearchHistory.UIBlockSearchHistoryArtist(com.vk.catalog2.common.dto.api.ui.a.a(bi20Var.b(), null, null, null, null, null, new SearchHistoryViewStyle(SearchHistoryViewStyle.Style.Artist), 7679), artist, artist.b, str);
                            uIBlockSearchHistoryTrack3 = uIBlockSearchHistoryTrack;
                            break;
                        }
                        break;
                    case 4:
                        break;
                    case 5:
                        Serializer.StreamParcelable a5 = i5a.a(catalogExtendedData, a2);
                        Podcast podcast = a5 instanceof Podcast ? (Podcast) a5 : null;
                        euh0Var.getClass();
                        if (podcast != null) {
                            uIBlockSearchHistoryTrack = new UIBlockSearchHistory.UIBlockSearchHistoryPodcast(com.vk.catalog2.common.dto.api.ui.a.a(bi20Var.b(), null, null, null, null, null, new SearchHistoryViewStyle(SearchHistoryViewStyle.Style.Podcast), 7679), podcast, podcast.e(), str);
                            uIBlockSearchHistoryTrack3 = uIBlockSearchHistoryTrack;
                            break;
                        }
                        break;
                    case 6:
                        Serializer.StreamParcelable a6 = i5a.a(catalogExtendedData, a2);
                        AudioBook audioBook = a6 instanceof AudioBook ? (AudioBook) a6 : null;
                        euh0Var.getClass();
                        if (audioBook != null) {
                            uIBlockSearchHistoryTrack = new UIBlockSearchHistory.UIBlockSearchHistoryAudioBook(com.vk.catalog2.common.dto.api.ui.a.a(bi20Var.b(), null, null, null, null, null, new SearchHistoryViewStyle(SearchHistoryViewStyle.Style.AudioBook), 7679), audioBook, String.valueOf(audioBook.b), str);
                            uIBlockSearchHistoryTrack3 = uIBlockSearchHistoryTrack;
                            break;
                        }
                        break;
                    case 7:
                        Serializer.StreamParcelable a7 = i5a.a(catalogExtendedData, a2);
                        Playlist playlist = a7 instanceof Playlist ? (Playlist) a7 : null;
                        euh0Var.getClass();
                        if (playlist != null) {
                            uIBlockSearchHistoryTrack2 = new UIBlockSearchHistory.UIBlockSearchHistoryPlaylist(com.vk.catalog2.common.dto.api.ui.a.a(bi20Var.b(), null, null, null, null, null, new SearchHistoryViewStyle(SearchHistoryViewStyle.Style.Album), 7679), playlist, str);
                            uIBlockSearchHistoryTrack3 = uIBlockSearchHistoryTrack2;
                            break;
                        }
                        break;
                    case 8:
                        Serializer.StreamParcelable a8 = i5a.a(catalogExtendedData, a2);
                        Playlist playlist2 = a8 instanceof Playlist ? (Playlist) a8 : null;
                        euh0Var.getClass();
                        if (playlist2 != null) {
                            uIBlockSearchHistoryTrack2 = new UIBlockSearchHistory.UIBlockSearchHistoryPlaylist(com.vk.catalog2.common.dto.api.ui.a.a(bi20Var.b(), null, null, null, null, null, new SearchHistoryViewStyle(SearchHistoryViewStyle.Style.Playlist), 7679), playlist2, str);
                            uIBlockSearchHistoryTrack3 = uIBlockSearchHistoryTrack2;
                            break;
                        }
                        break;
                    case 9:
                        Serializer.StreamParcelable a9 = i5a.a(catalogExtendedData, a2);
                        RadioStation radioStation = a9 instanceof RadioStation ? (RadioStation) a9 : null;
                        euh0Var.getClass();
                        if (radioStation != null) {
                            uIBlockSearchHistoryTrack2 = new UIBlockSearchHistory.UIBlockSearchHistoryRadioStation(com.vk.catalog2.common.dto.api.ui.a.a(bi20Var.b(), null, null, null, null, null, new SearchHistoryViewStyle(SearchHistoryViewStyle.Style.RadioStation), 7679), radioStation, str);
                            uIBlockSearchHistoryTrack3 = uIBlockSearchHistoryTrack2;
                            break;
                        }
                        break;
                    case 10:
                        Serializer.StreamParcelable a10 = i5a.a(catalogExtendedData, a2);
                        VideoFile videoFile = a10 instanceof VideoFile ? (VideoFile) a10 : null;
                        euh0Var.getClass();
                        if (videoFile != null) {
                            uIBlockSearchHistoryTrack2 = new UIBlockSearchHistory.UIBlockSearchHistoryVideo(com.vk.catalog2.common.dto.api.ui.a.a(bi20Var.b(), null, null, null, null, null, new SearchHistoryViewStyle(SearchHistoryViewStyle.Style.Video), 7679), videoFile, str);
                            uIBlockSearchHistoryTrack3 = uIBlockSearchHistoryTrack2;
                            break;
                        }
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            if (uIBlockSearchHistoryTrack3 != null) {
                arrayList.add(uIBlockSearchHistoryTrack3);
            }
        }
        return arrayList;
    }

    public static List b(euh0 euh0Var, CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var) {
        EmptyList emptyList = EmptyList.b;
        euh0Var.getClass();
        return a(catalogExtendedData, catalogBlock, bi20Var);
    }
}
