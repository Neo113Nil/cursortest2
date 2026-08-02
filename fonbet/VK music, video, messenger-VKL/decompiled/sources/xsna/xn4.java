package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.player.StartPlayEntitySource;
import com.vk.music.player.StartPlayPodcastSource;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.StartPlayVkMixSource;

/* compiled from: AudioFetchControllerFactoryImpl.kt */
/* loaded from: classes3.dex */
public class xn4 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public xn4(gzs gzsVar, izs izsVar) {
        this.a = gzsVar;
        this.b = izsVar;
    }

    public wn4 a(MusicTrack musicTrack, com.vk.music.player.playback.e eVar) {
        if (musicTrack != null && musicTrack.Vb()) {
            return new ihb0(eVar);
        }
        ozd0 ozd0Var = (ozd0) this.c;
        StartPlaySource startPlaySource = eVar.a;
        return startPlaySource instanceof StartPlayEntitySource ? (musicTrack == null || !musicTrack.Wb()) ? new sk40(ozd0Var.a(), ozd0Var.b()) : new ute0(ozd0Var.a(), new com.vk.music.player.playback.a((hx4) ((bpn0) this.d).getValue(), (b25) this.a)) : startPlaySource instanceof StartPlayVkMixSource ? new h4v0((u940) this.b, eVar) : startPlaySource instanceof StartPlayPodcastSource ? new ihb0(eVar) : new sk40(ozd0Var.a(), ozd0Var.b());
    }

    public Object b() {
        Object invoke = ((gzs) this.a).invoke();
        Object obj = this.c;
        Object obj2 = this.d;
        this.c = invoke;
        if (obj2 != null && invoke == obj) {
            return obj2;
        }
        Object invoke2 = ((izs) this.b).invoke(invoke);
        this.d = invoke2;
        return invoke2;
    }

    public xn4(b25 b25Var, u940 u940Var, ozd0 ozd0Var) {
        this.a = b25Var;
        this.b = u940Var;
        this.c = ozd0Var;
        this.d = new bpn0(new uw3(1));
    }
}
