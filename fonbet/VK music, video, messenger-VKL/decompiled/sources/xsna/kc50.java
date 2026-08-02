package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.audiobook.AudioBookChapter;

/* compiled from: MusicTrackManifestProviderImpl.kt */
/* loaded from: classes.dex */
public final class kc50 implements jc50, w8i {
    public final bpn0 b = new bpn0(new qy8(this, 10));
    public final bpn0 c = new bpn0(new j90(this, 5));
    public final bpn0 d = new bpn0(new ehs(this, 4));
    public final bpn0 e = new bpn0(new fu2(this, 2));

    @Override // xsna.jc50
    public final String a(MusicTrack musicTrack) {
        if (!musicTrack.Mb()) {
            return musicTrack.Vb() ? ((ctp) this.e.getValue()).v(musicTrack.Fb()) : ((kgp0) this.c.getValue()).l(musicTrack.Fb());
        }
        AudioBookChapter audioBookChapter = musicTrack.O;
        if (audioBookChapter != null) {
            return ((ilb) this.d.getValue()).a(audioBookChapter.getId());
        }
        return null;
    }
}
