package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.MusicTrack;
import com.vk.im.external.AudioTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayEntitySource;
import com.vk.music.player.e;
import com.vk.music.stats.AdsAudioPixelsContainer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.js4;
import xsna.k840;

/* compiled from: ImAudioPlayer.kt */
/* loaded from: classes7.dex */
public final class xwv implements js4 {
    public final ArrayList<js4.a> a = new ArrayList<>();
    public final a b = new a();
    public final u2b0 c = k840.a.g().b();
    public final ArrayList<AudioTrack> d;
    public final List<AudioTrack> e;
    public AudioTrack f;
    public boolean g;
    public boolean h;

    /* compiled from: ImAudioPlayer.kt */
    public final class a extends e.a {
        public a() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, com.vk.music.player.f fVar) {
            xwv.this.a();
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void W3(com.vk.music.player.f fVar) {
            xwv xwvVar = xwv.this;
            AudioTrack audioTrack = xwvVar.f;
            if (audioTrack != null) {
                audioTrack.f = fVar.k();
            }
            xwvVar.h();
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void o2(com.vk.music.player.f fVar) {
            int d = fVar.d();
            xwv xwvVar = xwv.this;
            if (d < 100) {
                AudioTrack audioTrack = xwvVar.f;
                if (audioTrack != null) {
                    audioTrack.c = true;
                }
                if (audioTrack != null) {
                    audioTrack.e = d / 100.0f;
                    return;
                }
                return;
            }
            AudioTrack audioTrack2 = xwvVar.f;
            if (audioTrack2 != null) {
                audioTrack2.c = false;
            }
            if (audioTrack2 != null) {
                audioTrack2.e = 1.0f;
            }
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void y4(List<PlayerTrack> list) {
            xwv.this.a();
        }
    }

    /* compiled from: ImAudioPlayer.kt */
    /* loaded from: classes11.dex */
    public static final class b {
    }

    public xwv() {
        ArrayList<AudioTrack> arrayList = new ArrayList<>();
        this.d = arrayList;
        this.e = Collections.unmodifiableList(arrayList);
    }

    public final void a() {
        u2b0 u2b0Var = this.c;
        PlayState m0 = u2b0Var.m0();
        MusicTrack b2 = u2b0Var.b();
        com.vk.music.player.f H = u2b0Var.H();
        List<PlayerTrack> g = u2b0Var.g();
        ArrayList<AudioTrack> arrayList = this.d;
        if (b2 == null || H == null || m0.i() || g.isEmpty()) {
            arrayList.clear();
            this.f = null;
            h();
            return;
        }
        AudioTrack audioTrack = new AudioTrack(MusicTrack.zb(b2, 0, null, 0, 0, null, false, null, null, false, false, null, null, null, -1, 1048575), false, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30, null);
        audioTrack.c = H.d() < 100;
        audioTrack.e = H.d() / 100.0f;
        audioTrack.d = m0 == PlayState.PLAYING;
        audioTrack.f = H.i() / 100.0f;
        this.f = audioTrack;
        arrayList.clear();
        List<PlayerTrack> list = g;
        ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new AudioTrack(((PlayerTrack) it.next()).b, false, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30, null));
        }
        arrayList.addAll(arrayList2);
        h();
    }

    @Override // xsna.js4
    public final AudioTrack b() {
        pro0.a();
        return this.f;
    }

    @Override // xsna.js4
    public final void c() {
        if (this.g) {
            throw new IllegalStateException("Already acquired!");
        }
        pro0.a();
        this.g = true;
        this.c.P0(this.b, true);
        a();
    }

    @Override // xsna.js4
    public final void d(js4.a aVar) {
        pro0.a();
        this.a.remove(aVar);
    }

    @Override // xsna.js4
    public final void e(js4.a aVar) {
        pro0.a();
        this.a.add(aVar);
    }

    @Override // xsna.js4
    public final void f(List<AudioTrack> list, AudioTrack audioTrack, Long l) {
        int i;
        pro0.a();
        boolean isEmpty = list.isEmpty();
        u2b0 u2b0Var = this.c;
        ArrayList<AudioTrack> arrayList = this.d;
        if (isEmpty) {
            u2b0Var.stop(26);
            arrayList.clear();
            this.f = null;
            h();
            return;
        }
        arrayList.clear();
        arrayList.addAll(list);
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator<AudioTrack> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(MusicTrack.zb(it.next().b, 0, null, 0, 0, null, false, null, null, false, false, null, null, null, -1, 1048575));
        }
        ArrayList g = bis.g(arrayList2);
        int i2 = -1;
        if (g != null && !g.isEmpty()) {
            if (audioTrack != null) {
                Iterator<AudioTrack> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (audioTrack.b.b != it2.next().b.b) {
                        r8++;
                    }
                }
                this.f = new AudioTrack(list.get(i2));
                u2b0Var.N0(new lqk0(new StartPlayEntitySource(StartPlayEntitySource.PlayEntitySource.IM, String.valueOf(l), false, 4, null), (MusicTrack) arrayList2.get(i2), arrayList2, MusicPlaybackLaunchContext.q, 0, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 1008));
                return;
            }
            i2 = r8;
            this.f = new AudioTrack(list.get(i2));
            u2b0Var.N0(new lqk0(new StartPlayEntitySource(StartPlayEntitySource.PlayEntitySource.IM, String.valueOf(l), false, 4, null), (MusicTrack) arrayList2.get(i2), arrayList2, MusicPlaybackLaunchContext.q, 0, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 1008));
            return;
        }
        u2b0Var.stop(26);
        arrayList.clear();
        this.f = null;
        h();
        if (audioTrack != null) {
            Iterator<AudioTrack> it3 = list.iterator();
            i = 0;
            while (true) {
                if (!it3.hasNext()) {
                    i = -1;
                    break;
                } else {
                    if (audioTrack.b.b == it3.next().b.b) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        } else {
            i = 0;
        }
        r8 = i > 0 ? i : 0;
        if (arrayList2.isEmpty() || r8 <= -1 || r8 >= arrayList2.size()) {
            return;
        }
        com.vk.music.notifications.restriction.a aVar = k840.a.d;
        (aVar != null ? aVar : null).g((MusicTrack) arrayList2.get(r8));
    }

    @Override // xsna.js4
    public final void g(List<AudioTrack> list, AudioTrack audioTrack, Long l) {
        MusicTrack musicTrack;
        pro0.a();
        if (this.f != null && audioTrack != null && (musicTrack = audioTrack.b) != null) {
            if (r0.b.b == musicTrack.b) {
                play();
                return;
            }
        }
        f(list, audioTrack, l);
    }

    public final void h() {
        ArrayList<js4.a> arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a(this);
        }
    }

    @Override // xsna.js4
    public final void pause() {
        this.c.pause(6);
    }

    @Override // xsna.js4
    public final void play() {
        this.c.f(new PlaybackActionMeta(6, 0L, 2, null));
    }

    @Override // xsna.js4
    public final void release() {
        if (this.h) {
            throw new IllegalStateException("Already released!");
        }
        pro0.a();
        this.h = true;
        this.c.n0(this.b);
        this.d.clear();
        this.f = null;
        h();
    }
}
