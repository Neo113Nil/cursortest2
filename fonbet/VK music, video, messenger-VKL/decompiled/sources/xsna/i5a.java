package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistOwner;
import com.vk.dto.user.UserProfile;
import com.vk.music.search.history.SearchHistoryModel;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CatalogExtendedDataExtensions.kt */
/* loaded from: classes16.dex */
public final class i5a {

    /* compiled from: CatalogExtendedDataExtensions.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }

    public static final Serializer.StreamParcelable a(CatalogExtendedData catalogExtendedData, vp70 vp70Var) {
        PlaylistOwner playlistOwner;
        if (vp70Var == null) {
            return null;
        }
        SearchHistoryModel.Type type = vp70Var.a;
        UserId userId = vp70Var.b;
        String str = vp70Var.c;
        int[] iArr = a.$EnumSwitchMapping$0;
        switch (iArr[type.ordinal()]) {
            case 1:
            case 2:
                Serializer.c<MusicTrack> cVar = MusicTrack.CREATOR;
                str = MusicTrack.a.a(Integer.parseInt(str), userId);
                break;
            case 3:
            case 4:
            case 6:
            case 9:
                break;
            case 5:
                str = efz.b(userId.b, "_-100", new StringBuilder());
                break;
            case 7:
            case 8:
                Set<Integer> set = Playlist.P;
                str = Playlist.a.a(Integer.parseInt(str), userId);
                break;
            case 10:
                str = r11.b(new StringBuilder(), userId.b, '_', Integer.parseInt(str));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        switch (iArr[type.ordinal()]) {
            case 1:
                return catalogExtendedData.o.get(str);
            case 2:
                return catalogExtendedData.o.get(str);
            case 3:
                return catalogExtendedData.s.get(str);
            case 4:
                return catalogExtendedData.E.get(str);
            case 5:
                return catalogExtendedData.R.get(str);
            case 6:
                return catalogExtendedData.W.get(str);
            case 7:
                return catalogExtendedData.j.get(str);
            case 8:
                Playlist playlist = catalogExtendedData.j.get(str);
                if (playlist == null) {
                    return null;
                }
                Object Ab = catalogExtendedData.Ab(CatalogDataType.DATA_TYPE_SEARCH_AUTHORS, String.valueOf(playlist.c.b));
                if (Ab instanceof UserProfile) {
                    playlistOwner = new PlaylistOwner((UserProfile) Ab);
                } else if (Ab instanceof Group) {
                    playlistOwner = new PlaylistOwner((Group) Ab);
                    String str2 = playlistOwner.e;
                    if (str2 == null || str2.length() == 0) {
                        UserId userId2 = playlistOwner.b;
                        String str3 = playlistOwner.c;
                        playlistOwner = new PlaylistOwner(userId2, str3, playlistOwner.d, str3, playlistOwner.f, playlistOwner.g, playlistOwner.h);
                    }
                } else {
                    playlistOwner = playlist.q;
                }
                return Playlist.zb(playlist, null, playlistOwner, null, null, -32769, 255);
            case 9:
                return catalogExtendedData.V.get(str);
            case 10:
                return catalogExtendedData.e.get(str);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
