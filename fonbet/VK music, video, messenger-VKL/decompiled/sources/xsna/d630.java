package xsna;

import com.vk.api.generated.audio.dto.AudioGetPlaylistsResponseDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistLink;
import com.vk.dto.music.PlaylistOwner;
import com.vk.external.miniapp.net.app.WebApiApplication;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d630 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d630(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        UserId userId;
        UserId userId2;
        UserId userId3;
        switch (this.b) {
            case 0:
                com.vk.music.track.a aVar = (com.vk.music.track.a) this.d;
                Boolean bool = (Boolean) obj;
                bn40.g("audio.unfollowRadioStation", bool);
                if (bool.booleanValue()) {
                    aVar.d.b(new bve0(this.c));
                }
                return s3q0.a;
            case 1:
                pn0 pn0Var = (pn0) this.d;
                AudioGetPlaylistsResponseDto audioGetPlaylistsResponseDto = (AudioGetPlaylistsResponseDto) obj;
                int i = this.c;
                int i2 = i + 50;
                int count = audioGetPlaylistsResponseDto.getCount();
                List<AudioPlaylistDto> e = audioGetPlaylistsResponseDto.e();
                ArrayList arrayList = new ArrayList(c5g.u(e, 10));
                for (AudioPlaylistDto audioPlaylistDto : e) {
                    jt4.a.getClass();
                    Playlist a = jt4.a(audioPlaylistDto);
                    PlaylistLink playlistLink = a.f;
                    if (playlistLink == null || (userId = playlistLink.c) == null) {
                        userId = a.c;
                    }
                    Object obj2 = null;
                    if (fkq0.b(userId)) {
                        List<GroupsGroupFullDto> d = audioGetPlaylistsResponseDto.d();
                        if (d != null) {
                            Iterator<T> it = d.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    UserId P0 = ((GroupsGroupFullDto) next).P0();
                                    PlaylistLink playlistLink2 = a.f;
                                    if (playlistLink2 == null || (userId3 = playlistLink2.c) == null) {
                                        userId3 = a.c;
                                    }
                                    if (epx.f(P0, userId3)) {
                                        obj2 = next;
                                    }
                                }
                            }
                            GroupsGroupFullDto groupsGroupFullDto = (GroupsGroupFullDto) obj2;
                            if (groupsGroupFullDto != null) {
                                ((dqu) pn0Var.a).getClass();
                                a = Playlist.zb(a, null, new PlaylistOwner(dqu.a(groupsGroupFullDto)), null, null, -32769, 255);
                            }
                        }
                    } else {
                        List<UsersUserFullDto> g = audioGetPlaylistsResponseDto.g();
                        if (g != null) {
                            Iterator<T> it2 = g.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    UserId s1 = ((UsersUserFullDto) next2).s1();
                                    PlaylistLink playlistLink3 = a.f;
                                    if (playlistLink3 == null || (userId2 = playlistLink3.c) == null) {
                                        userId2 = a.c;
                                    }
                                    if (epx.f(s1, userId2)) {
                                        obj2 = next2;
                                    }
                                }
                            }
                            UsersUserFullDto usersUserFullDto = (UsersUserFullDto) obj2;
                            if (usersUserFullDto != null) {
                                ((j2r0) pn0Var.b).getClass();
                                a = Playlist.zb(a, null, new PlaylistOwner(j2r0.a(usersUserFullDto)), null, null, -32769, 255);
                            }
                        }
                    }
                    arrayList.add(a);
                }
                return new sa90(arrayList, i, i2, count);
            default:
                WebApiApplication webApiApplication = (WebApiApplication) this.d;
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                return vdx0Var.d().j(this.c, webApiApplication.b).U(new iwt(jov0.b, 1));
        }
    }
}
