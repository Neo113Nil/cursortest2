package xsna;

import com.vk.api.generated.audio.dto.AudioArtistDto;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioChartInfoDto;
import com.vk.api.generated.audio.dto.AudioGenreDto;
import com.vk.api.generated.audio.dto.AudioPhotoDto;
import com.vk.api.generated.audio.dto.AudioPlaylistActionDto;
import com.vk.api.generated.audio.dto.AudioPlaylistAlbumItemDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.audio.dto.AudioPlaylistMetaDto;
import com.vk.api.generated.audio.dto.AudioPlaylistOriginalFollowedDto;
import com.vk.api.generated.audio.dto.AudioPlaylistPermissionsDto;
import com.vk.api.generated.audio.dto.AudioPlaylistTypeDto;
import com.vk.api.generated.audio.dto.AudioPlaylistViewDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.media.dto.MediaPopupDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Genre;
import com.vk.dto.music.MusicDynamicRestriction;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistAction;
import com.vk.dto.music.PlaylistLink;
import com.vk.dto.music.PlaylistMeta;
import com.vk.dto.music.PlaylistPermissions;
import com.vk.dto.music.Thumb;
import com.vk.dto.music.chart.ChartIcon;
import com.vk.dto.music.chart.ChartInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: AudioPlaylistDtoToPlaylistMapper.kt */
/* loaded from: classes3.dex */
public final class jt4 {
    public static final jt4 a = new jt4();

    /* compiled from: AudioPlaylistDtoToPlaylistMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[AudioChartInfoDto.StateDto.values().length];
            try {
                iArr[AudioChartInfoDto.StateDto.MOVED_DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioChartInfoDto.StateDto.MOVED_UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioChartInfoDto.StateDto.NEW_RELEASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AudioChartInfoDto.StateDto.NO_CHANGES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AudioPlaylistAlbumItemDto.TypeDto.values().length];
            try {
                iArr2[AudioPlaylistAlbumItemDto.TypeDto.ALBUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AudioPlaylistAlbumItemDto.TypeDto.EP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AudioPlaylistAlbumItemDto.TypeDto.COLLECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AudioPlaylistAlbumItemDto.TypeDto.SINGLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AudioPlaylistTypeDto.values().length];
            try {
                iArr3[AudioPlaylistTypeDto.GENERATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[AudioPlaylistTypeDto.UGC.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[AudioPlaylistTypeDto.CHAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[AudioPlaylistTypeDto.ALBUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.ArrayList] */
    public static Playlist a(AudioPlaylistDto audioPlaylistDto) {
        int i;
        String str;
        ArrayList arrayList;
        List<AudioArtistDto> g;
        String str2;
        AudioArtistDto audioArtistDto;
        ArrayList arrayList2;
        String str3;
        ArrayList arrayList3;
        int i2;
        ArrayList arrayList4;
        long j;
        List list;
        MusicDynamicRestriction musicDynamicRestriction;
        PlaylistMeta playlistMeta;
        PlaylistMeta playlistMeta2;
        UserId userId;
        boolean z;
        PlaylistPermissions playlistPermissions;
        UserId userId2;
        int i3;
        ArrayList arrayList5;
        String str4;
        String str5;
        ChartInfo chartInfo;
        ArrayList arrayList6;
        PlaylistMeta playlistMeta3;
        Integer num;
        boolean z2;
        ArrayList arrayList7;
        AudioArtistDto audioArtistDto2;
        AudioPlaylistAlbumItemDto.ViewDto e;
        int id = audioPlaylistDto.getId();
        UserId q = audioPlaylistDto.q();
        AudioPlaylistTypeDto l0 = audioPlaylistDto.l0();
        AudioPlaylistAlbumItemDto f = audioPlaylistDto.f();
        AudioPlaylistAlbumItemDto.TypeDto d = f != null ? f.d() : null;
        a.getClass();
        int i4 = a.$EnumSwitchMapping$2[l0.ordinal()];
        if (i4 == 1 || i4 == 2) {
            i = 0;
        } else if (i4 == 3) {
            i = 5;
        } else {
            if (i4 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            int i5 = d == null ? -1 : a.$EnumSwitchMapping$1[d.ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    i = 2;
                } else if (i5 == 3) {
                    i = 3;
                } else if (i5 == 4) {
                    i = 4;
                }
            }
            i = 1;
        }
        AudioPlaylistAlbumItemDto f2 = audioPlaylistDto.f();
        if (f2 == null || (e = f2.e()) == null || (str = e.i()) == null) {
            str = "collection";
        }
        AudioPlaylistOriginalFollowedDto F = audioPlaylistDto.F();
        PlaylistLink playlistLink = F != null ? new PlaylistLink(F.e(), F.q(), F.d()) : null;
        AudioPlaylistOriginalFollowedDto o = audioPlaylistDto.o();
        PlaylistLink playlistLink2 = o != null ? new PlaylistLink(o.e(), o.q(), o.d()) : null;
        String title = audioPlaylistDto.getTitle();
        String W = audioPlaylistDto.W();
        String description = audioPlaylistDto.getDescription();
        Boolean D0 = audioPlaylistDto.D0();
        boolean booleanValue = D0 != null ? D0.booleanValue() : false;
        Integer w0 = audioPlaylistDto.w0();
        int intValue = w0 != null ? w0.intValue() : 0;
        AudioPhotoDto K = audioPlaylistDto.K();
        Thumb r = K != null ? sdy.r(K) : null;
        List<AudioGenreDto> p = audioPlaylistDto.p();
        if (p != null) {
            List<AudioGenreDto> list2 = p;
            arrayList = new ArrayList(c5g.u(list2, 10));
            for (AudioGenreDto audioGenreDto : list2) {
                arrayList.add(new Genre(audioGenreDto.getId(), audioGenreDto.d()));
            }
        } else {
            arrayList = null;
        }
        List<AudioArtistDto> u = audioPlaylistDto.u();
        if ((u == null || (audioArtistDto2 = (AudioArtistDto) j5g.b0(0, u)) == null || (str2 = audioArtistDto2.k()) == null || str2.length() <= 0) && ((g = audioPlaylistDto.g()) == null || (audioArtistDto = (AudioArtistDto) j5g.b0(0, g)) == null || (str2 = audioArtistDto.k()) == null)) {
            str2 = "";
        }
        List<AudioPhotoDto> a0 = audioPlaylistDto.a0();
        if (a0 != null) {
            arrayList2 = new ArrayList(a0.size());
            Iterator it = a0.iterator();
            while (it.hasNext()) {
                arrayList2.add(sdy.r((AudioPhotoDto) it.next()));
            }
        } else {
            arrayList2 = null;
        }
        List<AudioArtistDto> u2 = audioPlaylistDto.u();
        if (u2 != null) {
            List<AudioArtistDto> list3 = u2;
            str3 = str;
            arrayList3 = new ArrayList(c5g.u(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList3.add(sp.n((AudioArtistDto) it2.next(), false));
            }
        } else {
            str3 = str;
            arrayList3 = null;
        }
        List<AudioArtistDto> l = audioPlaylistDto.l();
        if (l != null) {
            List<AudioArtistDto> list4 = l;
            i2 = id;
            arrayList4 = new ArrayList(c5g.u(list4, 10));
            Iterator it3 = list4.iterator();
            while (it3.hasNext()) {
                arrayList4.add(sp.n((AudioArtistDto) it3.next(), false));
            }
        } else {
            i2 = id;
            arrayList4 = null;
        }
        Boolean F0 = audioPlaylistDto.F0();
        boolean booleanValue2 = F0 != null ? F0.booleanValue() : false;
        int R = audioPlaylistDto.R();
        int count = audioPlaylistDto.getCount();
        long v0 = audioPlaylistDto.v0();
        String d2 = audioPlaylistDto.d();
        List<AudioAudioDto> j2 = audioPlaylistDto.j();
        if (j2 != null) {
            List<AudioAudioDto> list5 = j2;
            j = v0;
            list = new ArrayList(c5g.u(list5, 10));
            Iterator it4 = list5.iterator();
            while (it4.hasNext()) {
                list.add(oc4.d((AudioAudioDto) it4.next()));
            }
        } else {
            j = v0;
            list = 0;
        }
        if (list == 0) {
            list = EmptyList.b;
        }
        MediaPopupDto T = audioPlaylistDto.T();
        MusicDynamicRestriction v = T != null ? emi.v(T) : null;
        AudioPlaylistMetaDto C = audioPlaylistDto.C();
        if (C != null) {
            musicDynamicRestriction = v;
            playlistMeta = new PlaylistMeta(C.d() == AudioPlaylistViewDto.COMPACT);
        } else {
            musicDynamicRestriction = v;
            playlistMeta = null;
        }
        AudioPlaylistPermissionsDto G = audioPlaylistDto.G();
        PlaylistPermissions p2 = G != null ? gcd0.p(G) : null;
        Boolean Z = audioPlaylistDto.Z();
        boolean booleanValue3 = Z != null ? Z.booleanValue() : false;
        Boolean M = audioPlaylistDto.M();
        if (M != null) {
            boolean booleanValue4 = M.booleanValue();
            playlistMeta2 = playlistMeta;
            userId = q;
            z = booleanValue4;
        } else {
            playlistMeta2 = playlistMeta;
            userId = q;
            z = false;
        }
        Boolean D = audioPlaylistDto.D();
        boolean z3 = D == null || !D.booleanValue();
        String r2 = audioPlaylistDto.r();
        String str6 = r2 != null ? r2 : "";
        AudioChartInfoDto i6 = audioPlaylistDto.i();
        if (i6 != null) {
            Integer e2 = i6.e();
            int intValue2 = e2 != null ? e2.intValue() : 0;
            AudioChartInfoDto.StateDto f3 = i6.f();
            int i7 = f3 != null ? a.$EnumSwitchMapping$0[f3.ordinal()] : -1;
            playlistPermissions = p2;
            int i8 = i7;
            userId2 = userId;
            ChartInfo.ChartIconCode chartIconCode = i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? ChartInfo.ChartIconCode.NONE : ChartInfo.ChartIconCode.NO_CHANGES : ChartInfo.ChartIconCode.NEW_RELEASE : ChartInfo.ChartIconCode.MOVED_UP : ChartInfo.ChartIconCode.MOVED_DOWN;
            List<BaseImageDto> d3 = i6.d();
            if (d3 != null) {
                List<BaseImageDto> list6 = d3;
                i3 = i;
                arrayList5 = arrayList4;
                str4 = str2;
                arrayList7 = new ArrayList(c5g.u(list6, 10));
                Iterator it5 = list6.iterator();
                while (it5.hasNext()) {
                    BaseImageDto baseImageDto = (BaseImageDto) it5.next();
                    arrayList7.add(new ChartIcon(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight()));
                    it5 = it5;
                    str6 = str6;
                }
            } else {
                i3 = i;
                arrayList5 = arrayList4;
                str4 = str2;
                arrayList7 = null;
            }
            str5 = str6;
            chartInfo = new ChartInfo(intValue2, chartIconCode, arrayList7);
        } else {
            playlistPermissions = p2;
            userId2 = userId;
            i3 = i;
            arrayList5 = arrayList4;
            str4 = str2;
            str5 = str6;
            chartInfo = null;
        }
        Boolean y0 = audioPlaylistDto.y0();
        boolean booleanValue5 = y0 != null ? y0.booleanValue() : false;
        Float B = audioPlaylistDto.B();
        Integer valueOf = B != null ? Integer.valueOf((int) B.floatValue()) : null;
        List<AudioPlaylistActionDto> e3 = audioPlaylistDto.e();
        if (e3 != null) {
            List<AudioPlaylistActionDto> list7 = e3;
            arrayList6 = new ArrayList(c5g.u(list7, 10));
            for (AudioPlaylistActionDto audioPlaylistActionDto : list7) {
                arrayList6.add(new PlaylistAction(audioPlaylistActionDto.e().i(), audioPlaylistActionDto.d().i()));
                valueOf = valueOf;
            }
        } else {
            arrayList6 = null;
        }
        Integer num2 = valueOf;
        List list8 = arrayList6;
        if (arrayList6 == null) {
            list8 = EmptyList.b;
        }
        List list9 = list8;
        Boolean k = audioPlaylistDto.k();
        if (k != null) {
            playlistMeta3 = playlistMeta2;
            num = num2;
            z2 = k.booleanValue();
        } else {
            playlistMeta3 = playlistMeta2;
            num = num2;
            z2 = false;
        }
        Integer n = audioPlaylistDto.n();
        return new Playlist(i2, userId2, i3, str3, playlistLink, playlistLink2, title, W, description, booleanValue, intValue, r, arrayList, str4, arrayList2, null, arrayList3, arrayList5, booleanValue2, R, count, j, d2, list, musicDynamicRestriction, playlistMeta3, playlistPermissions, booleanValue3, z, z3, str5, chartInfo, null, 0, booleanValue5, num, list9, z2, null, n != null ? n.intValue() : 0, 32768, 67, null);
    }
}
