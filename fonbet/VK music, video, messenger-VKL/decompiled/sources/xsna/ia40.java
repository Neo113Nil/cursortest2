package xsna;

import com.vk.api.generated.audio.dto.AudioGetAudiosByArtistTypeDto;
import com.vk.music.common.MusicPlaybackLaunchContext;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: MusicArtistModelImpl.kt */
/* loaded from: classes3.dex */
public final class ia40 implements fa40 {
    public final u2b0 a;
    public final ix4 b;

    public ia40(u2b0 u2b0Var) {
        ix4 ix4Var = new ix4();
        this.a = u2b0Var;
        this.b = ix4Var;
    }

    @Override // xsna.fa40
    public final void a(String str, String str2) {
        itg0.i(4, b(str), null, new jh3(this, str, MusicPlaybackLaunchContext.Fb(str2), 5), new ha40(0));
    }

    @Override // xsna.fa40
    public final io.reactivex.rxjava3.core.q b(String str) {
        AudioGetAudiosByArtistTypeDto audioGetAudiosByArtistTypeDto = AudioGetAudiosByArtistTypeDto.SNIPPET;
        Integer num = 200;
        this.b.getClass();
        tfx tfxVar = new tfx("audio.getAudiosByArtist", new hr(4), new ir(4));
        tfx.o(tfxVar, "artist_id", str, 0, 0, 12);
        if (audioGetAudiosByArtistTypeDto != null) {
            tfx.o(tfxVar, "type", audioGetAudiosByArtistTypeDto.i(), 0, 0, 12);
        }
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, 0, 0, 0, 8);
        tfxVar.f(num.intValue(), 0, 1000, "count");
        return rsg0.y0(yfb.x(tfxVar), null, null, 3).U(new ga40(new c3v(4), 0));
    }
}
