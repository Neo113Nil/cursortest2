package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.editor.analytics.StoryEditorEvents;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.stickers.api.styles.MusicStickerStyle;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vkontakte.android.R;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import xsna.q850;

/* compiled from: StoryMusicDelegate.kt */
/* loaded from: classes16.dex */
public final class e7m0 extends kh6 {
    public final Activity l;
    public final u76 m;
    public final Object n;
    public final Object o;
    public boolean p;
    public final a q;

    /* compiled from: StoryMusicDelegate.kt */
    public static final class a implements c7m0 {
        public a() {
        }

        @Override // xsna.c7m0
        public final int B0() {
            return e7m0.this.m.B0();
        }

        @Override // xsna.c7m0
        public final void K() {
            e7m0.this.m.K();
        }

        @Override // xsna.c7m0
        public final void V(boolean z) {
            e7m0.this.m.V(z);
        }

        @Override // xsna.c7m0
        public final io.reactivex.rxjava3.internal.operators.observable.m1 a() {
            return e7m0.this.m.s4().a.e.a0(io.reactivex.rxjava3.android.schedulers.a.b());
        }

        @Override // xsna.c7m0
        public final u850 b() {
            return e7m0.this.m.s4().a.h();
        }

        @Override // xsna.c7m0
        public final void c(int i, int i2, int i3) {
            u76 u76Var = e7m0.this.m;
            p1m0 s4 = u76Var.s4();
            s4.b(false);
            MusicTrack musicTrack = s4.b;
            if (musicTrack != null) {
                s4.c(musicTrack, i, i2, i3);
            }
            u76Var.w0();
            u76Var.K();
            u76Var.s4().b(true);
        }

        @Override // xsna.c7m0
        public final void d() {
            e7m0.this.m.s4().a();
        }

        @Override // xsna.c7m0
        public final void e() {
            e7m0.this.m.s4().a.f(new PlaybackActionMeta(6, 0L, 2, null));
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.c7m0
        public final int f() {
            return i() ? B0() : ((psj0) e7m0.this.o.getValue()).c();
        }

        @Override // xsna.c7m0
        public final void g() {
            e7m0.this.m.s4().d();
        }

        @Override // xsna.c7m0
        public final void h() {
            e7m0.this.m.s4().a.m(null, 6, false, false);
        }

        @Override // xsna.c7m0
        public final boolean i() {
            return e7m0.this.m.f3();
        }

        @Override // xsna.c7m0
        public final void j(MusicTrack musicTrack, int i, int i2, int i3) {
            u76 u76Var = e7m0.this.m;
            u76Var.s4().b(false);
            u76Var.s4().c(musicTrack, i, i2, i3);
            q850 q850Var = u76Var.s4().a;
            q850.a aVar = q850Var.f;
            if (aVar != null) {
                q850Var.q(q850.a.a(aVar, null, 0, 0, false, null, 55));
            }
            u76Var.w0();
        }

        @Override // xsna.c7m0
        public final void pauseVideo() {
            e7m0.this.m.pauseVideo();
        }
    }

    public e7m0(Activity activity, StickersDrawingViewGroup stickersDrawingViewGroup, u76 u76Var, b96 b96Var, v3l0 v3l0Var) {
        super(stickersDrawingViewGroup, b96Var, u76Var, v3l0Var);
        this.l = activity;
        this.m = u76Var;
        b290 b290Var = new b290(this, 22);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.n = msy.a(lazyThreadSafetyMode, b290Var);
        this.o = msy.a(lazyThreadSafetyMode, new in60(this, 21));
        u76Var.a(bh6.m.subscribe(new j720(new n7b0(this, 9), 9)));
        this.q = new a();
    }

    @Override // xsna.b7m0
    public final void a() {
        this.m.s4().d();
        n(m());
    }

    @Override // xsna.b7m0
    public final void b() {
        h7m0 m = m();
        nov novVar = m instanceof nov ? (nov) m : null;
        if (novVar != null) {
            this.b.t(novVar);
        }
    }

    @Override // xsna.kh6, xsna.b7m0
    public final void c() {
        StoryMusicInfo info;
        nov novVar = this.e;
        u76 u76Var = this.m;
        if (novVar == null) {
            if (this.j) {
                this.j = false;
            } else {
                k(this.h);
            }
            if (this.h == null) {
                p1m0 s4 = u76Var.s4();
                s4.f.removeCallbacksAndMessages(null);
                q850 q850Var = s4.a;
                q850Var.l = false;
                q850Var.stop(26);
                s4.b = null;
                s4.c = 0;
                s4.d = 0;
            }
        } else {
            u76Var.s4().b(true);
            if (this.j) {
                e(((h7m0) this.e).getInfo());
            }
        }
        h7m0 h7m0Var = this.h;
        if (h7m0Var == null || (info = h7m0Var.getInfo()) == null) {
            return;
        }
        e(info);
    }

    @Override // xsna.kh6, xsna.b7m0
    public final void d(StoryMusicInfo storyMusicInfo, MusicStickerStyle musicStickerStyle, boolean z) {
        o(storyMusicInfo, musicStickerStyle, z);
        this.c.f();
    }

    @Override // xsna.b7m0
    public final void e(StoryMusicInfo storyMusicInfo) {
        o(storyMusicInfo, null, false);
        this.c.f();
    }

    @Override // xsna.kh6
    public final a i() {
        return this.q;
    }

    @Override // xsna.kh6
    public final void k(h7m0 h7m0Var) {
        if (h7m0Var != null) {
            h(h7m0Var instanceof nov ? (nov) h7m0Var : null);
        } else {
            n(h7m0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    public final h7m0 m() {
        h7m0 h7m0Var;
        nov novVar = this.e;
        h7m0 h7m0Var2 = novVar instanceof h7m0 ? (h7m0) novVar : null;
        if (h7m0Var2 != null) {
            return h7m0Var2;
        }
        Iterator it = this.b.getCurrentStickers().iterator();
        while (true) {
            if (!it.hasNext()) {
                h7m0Var = 0;
                break;
            }
            h7m0Var = it.next();
            if (((nov) h7m0Var) instanceof h7m0) {
                break;
            }
        }
        h7m0 h7m0Var3 = h7m0Var instanceof h7m0 ? h7m0Var : null;
        return h7m0Var3 == null ? this.h : h7m0Var3;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void n(h7m0 h7m0Var) {
        a aVar = this.q;
        if (aVar.i() && aVar.B0() <= 1000) {
            cvk.u(R.string.story_music_very_short_video, false);
            return;
        }
        this.h = h7m0Var;
        o7m0 o7m0Var = h7m0Var instanceof o7m0 ? (o7m0) h7m0Var : null;
        if (o7m0Var != null) {
            o7m0Var.setStickerAlpha(0);
        }
        this.p = false;
        this.b.postDelayed(new ryc(this, 10), 100L);
        y3p y3pVar = (y3p) this.n.getValue();
        u76 u76Var = this.m;
        y3pVar.n(u76Var.k3(), u76Var.H2());
    }

    public final void o(StoryMusicInfo storyMusicInfo, MusicStickerStyle musicStickerStyle, boolean z) {
        MusicStickerStyle musicStickerStyle2 = musicStickerStyle;
        u76 u76Var = this.m;
        u76Var.s4().d();
        u76Var.w0();
        h7m0 m = m();
        StickersDrawingViewGroup stickersDrawingViewGroup = this.b;
        if (m == null) {
            Context context = stickersDrawingViewGroup.getContext();
            if (musicStickerStyle2 == null) {
                musicStickerStyle2 = MusicStickerStyle.Horizontal;
            }
            o7m0 o7m0Var = new o7m0(context, storyMusicInfo, musicStickerStyle2);
            o7m0Var.setRemovable(z);
            stickersDrawingViewGroup.f(o7m0Var);
            u76Var.o5().e();
        } else {
            m.setInfo(storyMusicInfo);
            if (musicStickerStyle2 != null) {
                o7m0 o7m0Var2 = m instanceof o7m0 ? (o7m0) m : null;
                if (o7m0Var2 != null) {
                    o7m0Var2.setStyle(musicStickerStyle2);
                }
            }
            o7m0 o7m0Var3 = m instanceof o7m0 ? (o7m0) m : null;
            if (o7m0Var3 != null) {
                o7m0Var3.setStickerAlpha(255);
            }
            stickersDrawingViewGroup.invalidate();
            u76Var.p4((nov) m);
            u76Var.o5().i(StoryEditorEvents.EDIT_STICKER);
        }
        String str = storyMusicInfo.g;
        u76Var.s4().c(str != null ? MusicTrack.zb(storyMusicInfo.b, 0, null, 0, 0, str, false, null, null, false, false, null, null, null, -129, 1048575) : storyMusicInfo.b, storyMusicInfo.d, storyMusicInfo.e, storyMusicInfo.f);
        u76Var.K();
    }
}
