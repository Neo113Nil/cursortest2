package xsna;

import androidx.media3.datasource.a;
import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import com.vk.dto.music.MusicTrack;

/* compiled from: OfflineHlsComponentsImpl.kt */
/* loaded from: classes.dex */
public final class eu70 implements du70 {
    public final qp40 b;
    public final jc50 c;
    public final bpn0 d = new bpn0(new cpf(this, 2));
    public final qu70 e = new qu70(new s0f(this, 7));

    public eu70(sp40 sp40Var, jc50 jc50Var) {
        this.b = sp40Var;
        this.c = jc50Var;
    }

    @Override // xsna.du70
    public final tbn a() {
        return this.e;
    }

    @Override // xsna.du70
    public final p9v b(MusicTrack musicTrack) {
        return new m9v(this.c, this.b.getCache(), musicTrack);
    }

    @Override // xsna.du70
    public final HlsPlaylistTracker.a c(MusicTrack musicTrack) {
        return new l9v(musicTrack);
    }

    @Override // xsna.du70
    public final ja50 d() {
        return (ja50) this.d.getValue();
    }

    @Override // xsna.du70
    public final a.InterfaceC0045a e(a.InterfaceC0045a interfaceC0045a) {
        qp40 qp40Var = this.b;
        if (!qp40Var.a()) {
            return null;
        }
        a.b bVar = new a.b();
        bVar.a = qp40Var.getCache();
        bVar.c = new ju70();
        bVar.e = interfaceC0045a;
        bVar.d(null);
        return bVar;
    }
}
