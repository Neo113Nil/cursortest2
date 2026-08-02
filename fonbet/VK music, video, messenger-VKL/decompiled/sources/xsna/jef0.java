package xsna;

import com.vk.api.generated.audio.dto.AudioPhotoDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.audio.dto.AudioRecommendedPlaylistDto;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.music.impl.entity.PlayingState;
import com.vk.catalog.mvi.block.music.impl.recommended.entity.RecommendedPlaylistState;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistLink;
import com.vk.dto.music.PlaylistOwner;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;

/* compiled from: RecommendedPlaylistStateMapper.kt */
/* loaded from: classes.dex */
public final class jef0 implements f2a<RecommendedPlaylistState> {
    public final u2b0 a;

    public jef0(u2b0 u2b0Var) {
        this.a = u2b0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x01d5, code lost:
    
        r8 = xsna.sdy.r(r12).Ab(xsna.iah0.a(265), false);
     */
    @Override // xsna.f2a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<RecommendedPlaylistState> a(CatalogExtraResponseObjectDto catalogExtraResponseObjectDto, CatalogBlockDto catalogBlockDto, CatalogBlockVariant catalogBlockVariant) {
        Playlist playlist;
        RecommendedPlaylistState recommendedPlaylistState;
        UserId userId;
        UserProfile userProfile;
        Group group;
        String f;
        List<AudioRecommendedPlaylistDto> o = catalogExtraResponseObjectDto.o();
        if (o == null) {
            o = EmptyList.b;
        }
        List<AudioRecommendedPlaylistDto> list = o;
        int e = on00.e(c5g.u(list, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Object obj : list) {
            AudioRecommendedPlaylistDto audioRecommendedPlaylistDto = (AudioRecommendedPlaylistDto) obj;
            StringBuilder sb = new StringBuilder();
            sb.append(audioRecommendedPlaylistDto.q());
            sb.append('_');
            sb.append(audioRecommendedPlaylistDto.g());
            linkedHashMap.put(sb.toString(), obj);
        }
        List<AudioPlaylistDto> d0 = catalogExtraResponseObjectDto.d0();
        if (d0 == null) {
            d0 = EmptyList.b;
        }
        List<AudioPlaylistDto> list2 = d0;
        int e2 = on00.e(c5g.u(list2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e2 >= 16 ? e2 : 16);
        for (Object obj2 : list2) {
            AudioPlaylistDto audioPlaylistDto = (AudioPlaylistDto) obj2;
            Set<Integer> set = Playlist.P;
            linkedHashMap2.put(Playlist.a.a(audioPlaylistDto.getId(), audioPlaylistDto.q()), obj2);
        }
        List<UsersUserFullDto> n = catalogExtraResponseObjectDto.n();
        new j2r0();
        if (n == null) {
            n = EmptyList.b;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (UsersUserFullDto usersUserFullDto : n) {
            linkedHashMap3.put(String.valueOf(usersUserFullDto.s1().b), j2r0.a(usersUserFullDto));
        }
        List<GroupsGroupFullDto> g = catalogExtraResponseObjectDto.g();
        new dqu();
        if (g == null) {
            g = EmptyList.b;
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (GroupsGroupFullDto groupsGroupFullDto : g) {
            linkedHashMap4.put(String.valueOf(groupsGroupFullDto.P0().b), dqu.a(groupsGroupFullDto));
        }
        List<String> l2 = catalogBlockDto.l2();
        if (l2 == null) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : l2) {
            AudioPlaylistDto audioPlaylistDto2 = (AudioPlaylistDto) linkedHashMap2.get(str);
            if (audioPlaylistDto2 != null) {
                jt4.a.getClass();
                playlist = jt4.a(audioPlaylistDto2);
            } else {
                playlist = null;
            }
            Object obj3 = linkedHashMap.get(str);
            if (playlist == null || obj3 == null) {
                recommendedPlaylistState = null;
            } else {
                AudioRecommendedPlaylistDto audioRecommendedPlaylistDto2 = (AudioRecommendedPlaylistDto) obj3;
                PlaylistLink playlistLink = playlist.f;
                if (playlistLink == null || (userId = playlistLink.q()) == null) {
                    userId = playlist.c;
                }
                UserId[] userIdArr = {fkq0.a(userId)};
                Iterator it = rl3.D(userIdArr).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        userProfile = null;
                        break;
                    }
                    userProfile = (UserProfile) linkedHashMap3.get(String.valueOf(((UserId) it.next()).b));
                    if (userProfile != null) {
                        break;
                    }
                }
                Iterator it2 = rl3.D(userIdArr).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        group = null;
                        break;
                    }
                    group = (Group) linkedHashMap4.get(String.valueOf(fkq0.a((UserId) it2.next()).b));
                    if (group != null) {
                        break;
                    }
                }
                rba rbaVar = new rba(userProfile, group);
                UserProfile a = rbaVar.a();
                Group b = rbaVar.b();
                playlist.q = a != null ? new PlaylistOwner(a) : b != null ? new PlaylistOwner(b) : null;
                String id = catalogBlockDto.getId();
                Float i = audioRecommendedPlaylistDto2.i();
                String j = audioRecommendedPlaylistDto2.j();
                if (j == null) {
                    j = "";
                }
                String str2 = j;
                u2b0 u2b0Var = this.a;
                PlayingState h = uzp.h(playlist, u2b0Var);
                AudioPhotoDto k = audioRecommendedPlaylistDto2.k();
                if (k == null || f == null) {
                    f = audioRecommendedPlaylistDto2.f();
                }
                String str3 = f;
                MusicTrack b2 = u2b0Var.b();
                recommendedPlaylistState = new RecommendedPlaylistState(BlockId.Simple.a(id), catalogBlockVariant, "", i, str2, h, playlist, epx.f(audioRecommendedPlaylistDto2.l(), Boolean.TRUE), str3, b2 != null ? b2.Fb() : null);
            }
            if (recommendedPlaylistState != null) {
                arrayList.add(recommendedPlaylistState);
            }
        }
        return arrayList;
    }
}
