package xsna;

import com.vk.api.generated.audio.dto.AudioAudioIdDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.dto.music.Playlist;
import java.util.List;

/* compiled from: AudioSavePlaylistRequests.kt */
/* loaded from: classes14.dex */
public final class bx4 extends awi<Playlist> {
    public final rsg0<AudioPlaylistDto> s;
    public final rsg0<AudioPlaylistDto> t;
    public final rsg0<BaseOkResponseDto> u;
    public final rsg0<List<AudioAudioIdDto>> v;
    public final rsg0<BaseBoolIntDto> w;
    public final cx4 x;

    public bx4(rsg0<AudioPlaylistDto> rsg0Var, rsg0<AudioPlaylistDto> rsg0Var2, rsg0<BaseOkResponseDto> rsg0Var3, rsg0<List<AudioAudioIdDto>> rsg0Var4, rsg0<BaseBoolIntDto> rsg0Var5, cx4 cx4Var) {
        this.s = rsg0Var;
        this.t = rsg0Var2;
        this.u = rsg0Var3;
        this.v = rsg0Var4;
        this.w = rsg0Var5;
        this.x = cx4Var;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        ax4 f = new zw4(this.s, this.t, this.u, this.v, this.w, this.x).f(l7r0Var);
        AudioPlaylistDto audioPlaylistDto = (AudioPlaylistDto) yfb.x(hx4.x(new ix4(), f.b, f.a, f.c, 3, null, 72)).f(l7r0Var);
        jt4.a.getClass();
        return jt4.a(audioPlaylistDto);
    }
}
