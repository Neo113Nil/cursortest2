package xsna;

import com.vk.api.generated.audio.dto.AudioArtistDto;
import com.vk.api.generated.audio.dto.AudioAudioRawIdTrackedDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.music.Playlist;
import java.util.List;
import java.util.Map;

/* compiled from: LoadPlaylistState.kt */
/* loaded from: classes3.dex */
public final class iqz implements jqz {
    public final Playlist a;
    public final List<AudioArtistDto> b;
    public final GroupsGroupFullDto c;
    public final UsersUserFullDto d;
    public final List<AudioAudioRawIdTrackedDto> e;
    public final String f;
    public final Object g;

    public iqz(Playlist playlist, List<AudioArtistDto> list, GroupsGroupFullDto groupsGroupFullDto, UsersUserFullDto usersUserFullDto, List<AudioAudioRawIdTrackedDto> list2, String str, Map<String, String> map) {
        this.a = playlist;
        this.b = list;
        this.c = groupsGroupFullDto;
        this.d = usersUserFullDto;
        this.e = list2;
        this.f = str;
        this.g = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqz)) {
            return false;
        }
        iqz iqzVar = (iqz) obj;
        return epx.f(this.a, iqzVar.a) && epx.f(this.b, iqzVar.b) && epx.f(this.c, iqzVar.c) && epx.f(this.d, iqzVar.d) && epx.f(this.e, iqzVar.e) && epx.f(this.f, iqzVar.f) && this.g.equals(iqzVar.g);
    }

    public final int hashCode() {
        int a = fw3.a(this.a.hashCode() * 31, 31, this.b);
        GroupsGroupFullDto groupsGroupFullDto = this.c;
        int hashCode = (a + (groupsGroupFullDto == null ? 0 : groupsGroupFullDto.hashCode())) * 31;
        UsersUserFullDto usersUserFullDto = this.d;
        int a2 = fw3.a((hashCode + (usersUserFullDto == null ? 0 : usersUserFullDto.hashCode())) * 31, 31, this.e);
        String str = this.f;
        return this.g.hashCode() + ((a2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Online(playlist=");
        sb.append(this.a);
        sb.append(", artists=");
        sb.append(this.b);
        sb.append(", group=");
        sb.append(this.c);
        sb.append(", user=");
        sb.append(this.d);
        sb.append(", trackIds=");
        sb.append(this.e);
        sb.append(", recommendationSectionId=");
        sb.append(this.f);
        sb.append(", albumParts=");
        return k73.c(sb, this.g, ')');
    }
}
