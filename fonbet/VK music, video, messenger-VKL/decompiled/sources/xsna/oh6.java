package xsna;

import android.content.Context;
import androidx.media3.datasource.a;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import com.vk.dto.music.MusicTrack;
import xsna.d7q;
import xsna.k840;

/* compiled from: BaseMusicPlayerDependenciesProvider.kt */
/* loaded from: classes7.dex */
public class oh6 implements aw40 {
    public final boolean a;
    public final com.vk.music.audioeffect.a b;
    public final nb4 c = nb4.a.getSTUB();
    public final bpn0 d;
    public final bpn0 e;
    public final bpn0 f;
    public a.InterfaceC0045a g;
    public final bpn0 h;
    public final bpn0 i;
    public final wr j;

    public oh6(boolean z, com.vk.music.audioeffect.a aVar) {
        this.a = z;
        this.b = aVar;
        new bpn0(new s1(this, 10));
        this.d = new bpn0(new w9(1));
        this.e = new bpn0(new v40(this, 6));
        this.f = new bpn0(new o6(2));
        this.h = new bpn0(new ca(this, 10));
        this.i = new bpn0(new px0(this, 6));
        this.j = new wr(8);
    }

    @Override // xsna.aw40
    public final com.vk.music.offline.api.domain.download.b I() {
        return (com.vk.music.offline.api.domain.download.b) this.e.getValue();
    }

    @Override // xsna.aw40
    public final androidx.media3.datasource.d a(MusicTrack musicTrack) {
        a.InterfaceC0045a interfaceC0045a;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        mjp0 mjp0Var = (mjp0) this.f.getValue();
        boolean h = h(musicTrack);
        bpn0 bpn0Var = this.i;
        if (h) {
            interfaceC0045a = this.g;
            if (interfaceC0045a == null) {
                interfaceC0045a = k840.a.f().e((a.InterfaceC0045a) bpn0Var.getValue());
                if (interfaceC0045a != null) {
                    this.g = interfaceC0045a;
                } else {
                    interfaceC0045a = (a.InterfaceC0045a) bpn0Var.getValue();
                }
            }
        } else {
            interfaceC0045a = (a.InterfaceC0045a) bpn0Var.getValue();
        }
        return new androidx.media3.datasource.d(context, mjp0Var, interfaceC0045a);
    }

    @Override // xsna.aw40
    public final p9v b(MusicTrack musicTrack) {
        if (musicTrack != null) {
            return h(musicTrack) ? k840.a.f().b(musicTrack) : new tfl();
        }
        com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("Trying to get parser factory with the null track!"));
        return new tfl();
    }

    @Override // xsna.aw40
    public final HlsPlaylistTracker.a c(MusicTrack musicTrack) {
        tf3 tf3Var = androidx.media3.exoplayer.hls.playlist.a.p;
        if (musicTrack != null) {
            return h(musicTrack) ? k840.a.f().c(musicTrack) : tf3Var;
        }
        com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("Trying to get tracker factory with the null track!"));
        return tf3Var;
    }

    @Override // xsna.aw40
    public final void d(MusicTrack musicTrack, oya0 oya0Var) {
        k840.a.d().O(h(musicTrack), o25.a().c(), musicTrack, oya0Var);
    }

    @Override // xsna.aw40
    public final npl e(Context context) {
        return new npl(context, (d7q.b) this.d.getValue());
    }

    @Override // xsna.aw40
    public final ts4 f() {
        return new ts4();
    }

    @Override // xsna.aw40
    public final com.vk.music.audioeffect.a f0() {
        return this.b;
    }

    @Override // xsna.aw40
    public boolean g() {
        return false;
    }

    public final boolean h(MusicTrack musicTrack) {
        if (!this.a) {
            return false;
        }
        bpn0 bpn0Var = k840.a.a;
        if (k840.a.i.b()) {
            return true;
        }
        if (musicTrack != null) {
            return musicTrack.Mb() || musicTrack.Vb();
        }
        return false;
    }
}
