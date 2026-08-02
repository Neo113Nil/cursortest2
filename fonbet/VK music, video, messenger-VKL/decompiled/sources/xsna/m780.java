package xsna;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.autoplay.e;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.music.player.PlayState;
import com.vk.music.player.e;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedPostAudioItem;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostMuteAudio;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostUnmuteAudio;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OnMediaAudioAutoplayProvider.kt */
/* loaded from: classes4.dex */
public final class m780 implements mnt0, e.a {
    public final boolean b;
    public final osj0 c;
    public final lm4 d;
    public final u2b0 e;
    public final k780 f;
    public final FunctionReferenceImpl g;
    public final FunctionReferenceImpl h;
    public boolean i;
    public boolean j;
    public String k;
    public Integer l;
    public Long m;
    public String n;
    public final Handler o;
    public final a p;
    public boolean q;
    public final com.vk.libvideo.autoplay.a r;
    public final b s;
    public final xh5 t;

    /* compiled from: OnMediaAudioAutoplayProvider.kt */
    public final class a extends e.a {
        public a() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, com.vk.music.player.f fVar) {
            osj0 osj0Var = m780.this.c;
            if (playState != null && playState.h() && osj0Var.c.getState().j()) {
                osj0Var.j(28);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m780(boolean z, osj0 osj0Var, lm4 lm4Var, u2b0 u2b0Var, k780 k780Var, gzs<s3q0> gzsVar, izs<? super Boolean, s3q0> izsVar) {
        this.b = z;
        this.c = osj0Var;
        this.d = lm4Var;
        this.e = u2b0Var;
        this.f = k780Var;
        this.g = (FunctionReferenceImpl) gzsVar;
        this.h = (FunctionReferenceImpl) izsVar;
        com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
        this.i = com.vk.libvideo.autoplay.e.c();
        this.k = "";
        this.o = new Handler(Looper.getMainLooper());
        this.p = new a();
        com.vk.libvideo.autoplay.a aVar = new com.vk.libvideo.autoplay.a(false, null, null, false, false, false, null, null, null, null, null, null, false, null, 524287);
        this.r = aVar;
        this.s = new b();
        this.t = new xh5(new pc4(new w7u(this, 22), 2), aVar, null, null, null);
    }

    public static void c(m780 m780Var, Integer num, Long l) {
        String str = m780Var.k;
        String str2 = m780Var.n;
        m780Var.k = str;
        m780Var.l = num;
        m780Var.m = l;
        m780Var.n = str2;
    }

    public final void a() {
        z2s0.b.getClass();
        z2s0.i(this.s);
        this.j = false;
        this.c.j(32);
    }

    @Override // xsna.dnt0
    public final VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return null;
    }

    @Override // xsna.mnt0
    public final com.vk.libvideo.autoplay.a getVideoConfig() {
        return this.r;
    }

    @Override // xsna.dnt0
    public final boolean getVideoFocused() {
        return this.j;
    }

    @Override // xsna.mnt0
    /* renamed from: getVideoView */
    public final VideoTextureView mo407getVideoView() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r5v5, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // com.vk.libvideo.autoplay.e.a
    public final void onMuteChange(boolean z) {
        boolean z2 = this.i;
        this.h.invoke(Boolean.valueOf(z));
        k780 k780Var = this.f;
        osj0 osj0Var = this.c;
        if (z) {
            osj0Var.j(6);
            if (z2 != this.i) {
                Integer num = this.l;
                Long l = this.m;
                String str = this.n;
                k780Var.getClass();
                k780.f(new MobileOfficialAppsFeedStat$TypeFeedPostMuteAudio(k780.a(num, l, MobileOfficialAppsFeedStat$FeedPostAudioItem.ItemType.AUDIO)), str);
                return;
            }
            return;
        }
        if (osj0Var.c.getState().j()) {
            return;
        }
        z2s0.b.g(this.s, 0);
        this.g.invoke();
        if (z2 != this.i) {
            Integer num2 = this.l;
            Long l2 = this.m;
            String str2 = this.n;
            k780Var.getClass();
            k780.f(new MobileOfficialAppsFeedStat$TypeFeedPostUnmuteAudio(k780.a(num2, l2, MobileOfficialAppsFeedStat$FeedPostAudioItem.ItemType.AUDIO)), str2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r7v12, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.dnt0
    public final void setVideoFocused(boolean z) {
        if (z == this.j) {
            return;
        }
        this.j = z;
        boolean z2 = this.b;
        osj0 osj0Var = this.c;
        xh5 xh5Var = this.t;
        if (!z2) {
            if (!z) {
                osj0Var.j(32);
                return;
            } else {
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                b.C1208b.a().b(xh5Var);
                return;
            }
        }
        b bVar = this.s;
        a aVar = this.p;
        lm4 lm4Var = this.d;
        if (!z) {
            lm4Var.f(aVar);
            this.o.postDelayed(new qb3(this, 8), 300L);
            z2s0.b.getClass();
            z2s0.i(bVar);
            osj0Var.j(32);
            return;
        }
        bpn0 bpn0Var2 = com.vk.libvideo.autoplay.b.B;
        b.C1208b.a().b(xh5Var);
        lm4Var.e(aVar);
        com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
        this.h.invoke(Boolean.valueOf(com.vk.libvideo.autoplay.e.c()));
        com.vk.libvideo.autoplay.e.c = new WeakReference<>(this);
        z2s0.b.g(bVar, 0);
        if (this.i) {
            return;
        }
        this.f.f = true;
        this.g.invoke();
    }

    /* compiled from: OnMediaAudioAutoplayProvider.kt */
    public static final class b implements a3s0 {
        public b() {
        }

        @Override // xsna.a3s0
        public final com.vk.libvideo.autoplay.a getConfig() {
            return new com.vk.libvideo.autoplay.a(true, null, null, false, false, false, null, null, null, null, null, null, false, null, 524286);
        }

        @Override // xsna.a3s0
        public final String getId() {
            return m780.this.k;
        }

        @Override // xsna.a3s0
        public final float getVolume() {
            return 1.0f;
        }

        @Override // xsna.a3s0
        public final boolean isPlaying() {
            return true;
        }

        @Override // xsna.a3s0
        public final boolean m() {
            return false;
        }

        @Override // xsna.a3s0
        public final boolean v() {
            return false;
        }

        @Override // xsna.a3s0
        public final void c() {
        }

        @Override // xsna.a3s0
        public final void pause() {
        }

        @Override // xsna.a3s0
        public final void play() {
        }

        @Override // xsna.a3s0
        public final void l(x2s0 x2s0Var) {
        }

        @Override // xsna.a3s0
        public final void setVolume(float f) {
        }
    }

    @Override // xsna.mnt0
    public final void G2(View view) {
    }

    @Override // xsna.mnt0
    public final void setFocusController(cnt0 cnt0Var) {
    }

    @Override // xsna.mnt0
    public final void w0(View view) {
    }
}
