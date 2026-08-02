package xsna;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.vk.music.broadcast.BecomingNoisyReceiver;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.e;
import com.vk.music.player.error.VkPlayerException;
import com.vk.music.pref.MusicPrefsComponent;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: AudioStateListener.java */
/* loaded from: classes.dex */
public final class dy4 extends e.a implements BecomingNoisyReceiver.a, w8i {
    public static final dy4 p = new dy4();

    @Nullable
    public com.vk.music.api.a b;
    public PlayState c;
    public com.vk.music.player.f d;
    public List<PlayerTrack> e;

    @Nullable
    public com.vk.music.pref.a k;
    public WeakReference<kza0> f = null;
    public volatile String g = null;
    public volatile int h = -1;
    public volatile HashSet i = new HashSet();
    public final BecomingNoisyReceiver j = new BecomingNoisyReceiver();
    public final a l = new a();
    public final b m = new b();
    public final c n = new c();
    public final d o = new d();

    /* compiled from: AudioStateListener.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            HashSet hashSet = dy4.this.i;
            dy4 dy4Var = dy4.this;
            PlayState playState = dy4Var.c;
            com.vk.music.player.f fVar = dy4Var.d;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((com.vk.music.player.e) it.next()).N3(playState, fVar);
            }
        }
    }

    /* compiled from: AudioStateListener.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = dy4.this.i.iterator();
            while (it.hasNext()) {
                ((com.vk.music.player.e) it.next()).y4(dy4.this.e);
            }
        }
    }

    /* compiled from: AudioStateListener.java */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            HashSet hashSet = dy4.this.i;
            com.vk.music.player.f fVar = dy4.this.d;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((com.vk.music.player.e) it.next()).W3(fVar);
            }
        }
    }

    /* compiled from: AudioStateListener.java */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            HashSet hashSet = dy4.this.i;
            com.vk.music.player.f fVar = dy4.this.d;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((com.vk.music.player.e) it.next()).o2(fVar);
            }
        }
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void B1() {
        pro0.e(new nq4(this, 1));
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void K1() {
        pro0.e(new fy4(this, 0));
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void N3(PlayState playState, com.vk.music.player.f fVar) {
        if (playState == PlayState.PLAYING) {
            if (this.k == null) {
                this.k = ((MusicPrefsComponent) j6i.b(m7m.f(this), MusicPrefsComponent.class)).Q0();
            }
            if (this.k.E()) {
                if (this.k == null) {
                    this.k = ((MusicPrefsComponent) j6i.b(m7m.f(this), MusicPrefsComponent.class)).Q0();
                }
                this.k.n();
            }
        }
        this.c = playState;
        this.d = fVar;
        a aVar = this.l;
        pro0.d(aVar);
        pro0.e(aVar);
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void W3(com.vk.music.player.f fVar) {
        this.d = fVar;
        c cVar = this.n;
        pro0.d(cVar);
        pro0.e(cVar);
    }

    @Nullable
    public final kza0 a() {
        WeakReference<kza0> weakReference = this.f;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void n3() {
        pro0.e(new gy4(this));
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void o2(com.vk.music.player.f fVar) {
        if (fVar.m()) {
            if (TextUtils.equals(this.g, fVar.f().Fb()) && this.h == fVar.d()) {
                return;
            }
            this.g = fVar.f().Fb();
            this.h = fVar.d();
            this.d = fVar;
            d dVar = this.o;
            pro0.d(dVar);
            pro0.e(dVar);
        }
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void onError(String str) {
        pro0.e(new hy4(this, str));
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final boolean t3(VkPlayerException vkPlayerException) {
        Iterator it = this.i.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (((com.vk.music.player.e) it.next()).t3(vkPlayerException) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void y4(List<PlayerTrack> list) {
        this.e = list;
        b bVar = this.m;
        pro0.d(bVar);
        pro0.e(bVar);
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void z3() {
        pro0.e(new ey4(this));
    }
}
