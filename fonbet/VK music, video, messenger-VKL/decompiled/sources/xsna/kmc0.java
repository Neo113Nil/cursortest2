package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import java.util.List;
import xsna.fmc0;

/* compiled from: PostingSideEffect.kt */
/* loaded from: classes4.dex */
public final class kmc0 implements fmc0.j {
    public final UserId a;
    public final int b;
    public final List<MusicDto> c;
    public final MusicDto d;
    public final boolean e;
    public final boolean f;
    public final String g;

    public kmc0(UserId userId, int i, List<MusicDto> list, MusicDto musicDto, boolean z, boolean z2, String str) {
        this.a = userId;
        this.b = i;
        this.c = list;
        this.d = musicDto;
        this.e = z;
        this.f = z2;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmc0)) {
            return false;
        }
        kmc0 kmc0Var = (kmc0) obj;
        return epx.f(this.a, kmc0Var.a) && this.b == kmc0Var.b && epx.f(this.c, kmc0Var.c) && epx.f(this.d, kmc0Var.d) && this.e == kmc0Var.e && this.f == kmc0Var.f && epx.f(this.g, kmc0Var.g);
    }

    public final int hashCode() {
        UserId userId = this.a;
        int a = fw3.a(shy.a(this.b, (userId == null ? 0 : Long.hashCode(userId.b)) * 31, 31), 31, this.c);
        MusicDto musicDto = this.d;
        int b = qoy.b(qoy.b((a + (musicDto == null ? 0 : musicDto.hashCode())) * 31, 31, this.e), 31, this.f);
        String str = this.g;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenMusicPicker(musicOwnerIdOverride=");
        sb.append(this.a);
        sb.append(", audioMaxCount=");
        sb.append(this.b);
        sb.append(", selectedTracks=");
        sb.append(this.c);
        sb.append(", selectedPlaylist=");
        sb.append(this.d);
        sb.append(", isMultiSelectEnabled=");
        sb.append(this.e);
        sb.append(", isSnippetPreferred=");
        sb.append(this.f);
        sb.append(", snippetOnboardingTitle=");
        return ho8.a(sb, this.g, ')');
    }
}
