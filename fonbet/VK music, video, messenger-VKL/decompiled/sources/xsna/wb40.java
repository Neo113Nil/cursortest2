package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.ExternalAudio;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.AdvertisementInfo;
import com.vk.music.player.LoopMode;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.music.player.domain.state.LyricsMode;
import com.vk.music.player.domain.state.MusicBigPlayerPage;
import com.vk.music.player.e;
import com.vk.music.player.f;
import com.vk.music.player.presentation.main.SwipeBlockingViewPager;
import com.vk.music.view.ThumbsImageView;
import com.vk.music.view.player.MusicBigPlayerParams;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.ec40;
import xsna.iut0;
import xsna.sb40;

/* compiled from: MusicBigPlayerRootHolder.kt */
/* loaded from: classes3.dex */
public final class wb40 extends se50<com.vk.music.player.domain.state.a> implements xb40, f380, too0 {
    public static final /* synthetic */ int I = 0;
    public final LinearLayout A;
    public final yz40 B;
    public final ThumbsImageView C;
    public final View D;
    public final ArrayList E;
    public final SwipeBlockingViewPager F;
    public ey40 G;
    public final f H;
    public final MusicBigPlayerParams n;
    public final boolean o;
    public fy40 p;
    public float q;
    public boolean r;
    public com.vk.music.stats.a s;
    public final d t;
    public com.vk.music.player.domain.state.a u;
    public final ugp0 v;
    public final com.vk.music.view.player.a w;
    public final View x;
    public final VkButton y;
    public final VkButton z;

    /* compiled from: MusicBigPlayerRootHolder.kt */
    public static final class a {
    }

    /* compiled from: MusicBigPlayerRootHolder.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoopMode.values().length];
            try {
                iArr[LoopMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoopMode.TRACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoopMode.LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MusicBigPlayerRootHolder.kt */
    public static final class d implements View.OnClickListener, ec40.a {
        public d() {
        }

        @Override // xsna.ec40.a
        public final boolean a(Object obj) {
            PlayerTrack playerTrack = (PlayerTrack) obj;
            ey40 ey40Var = wb40.this.G;
            return ey40Var != null && ey40Var.a(playerTrack);
        }

        @Override // xsna.ec40.a
        public final boolean b(ec40<PlayerTrack> ec40Var) {
            wb40 wb40Var = wb40.this;
            MusicBigPlayerParams musicBigPlayerParams = wb40Var.n;
            ey40 ey40Var = wb40Var.G;
            if (ey40Var != null && ey40Var.b(ec40Var)) {
                return true;
            }
            int i = ec40Var.a;
            if (i == R.id.music_action_remove_from_current_playlist) {
                if (musicBigPlayerParams.c.J1(ec40Var.b.f)) {
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    cvk.w(context.getString(R.string.music_toast_audio_removal_from_next), false);
                    tb40 tb40Var = musicBigPlayerParams.a;
                    com.vk.music.player.domain.state.a a = com.vk.music.player.domain.state.a.a(tb40Var.b, null, musicBigPlayerParams.c.g(), null, false, null, null, false, false, null, null, null, null, null, false, false, false, false, 0, 2097143);
                    tb40Var.b = a;
                    tb40Var.a.invoke(a);
                    return true;
                }
            } else if (i == R.id.music_action_play_similar) {
                tb40 tb40Var2 = musicBigPlayerParams.a;
                com.vk.music.player.domain.state.a a2 = com.vk.music.player.domain.state.a.a(tb40Var2.b, null, null, MusicPlaybackLaunchContext.d, false, null, null, false, false, null, null, null, null, null, false, false, false, false, 0, 2097135);
                tb40Var2.b = a2;
                tb40Var2.a.invoke(a2);
            }
            return false;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Activity h;
            Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
            if (valueOf != null && valueOf.intValue() == R.id.close) {
                Context context = view.getContext();
                if (context == null || (h = e3m.h(context)) == null) {
                    return;
                }
                h.finish();
                return;
            }
            wb40 wb40Var = wb40.this;
            if (valueOf != null && valueOf.intValue() == R.id.repeat) {
                wb40Var.n.c.V0();
            } else if (valueOf != null && valueOf.intValue() == R.id.shuffle) {
                wb40Var.n.c.o();
            }
        }
    }

    /* compiled from: MusicBigPlayerRootHolder.kt */
    public static final class e extends ViewPager.m {
        public e() {
        }

        @Override // androidx.viewpager.widget.ViewPager.m, androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i) {
            tb40 tb40Var = wb40.this.n.a;
            com.vk.music.player.domain.state.a a = com.vk.music.player.domain.state.a.a(tb40Var.b, null, null, null, false, null, null, false, i == 1, null, null, null, null, null, false, false, false, false, 0, 2096127);
            tb40Var.b = a;
            tb40Var.a.invoke(a);
        }

        @Override // androidx.viewpager.widget.ViewPager.m, androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i, float f, int i2) {
            wb40 wb40Var = wb40.this;
            View view = wb40Var.x;
            if (view != null) {
                int i3 = wb40.I;
                if (i != (wb40Var.w != null ? r5.l.size() : 0) - 2) {
                    f = 1 - f;
                }
                view.setAlpha(f);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.m, androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(final int i) {
            final wb40 wb40Var = wb40.this;
            wb40Var.itemView.post(new Runnable() { // from class: xsna.vb40
                @Override // java.lang.Runnable
                public final void run() {
                    wb40 wb40Var2 = wb40.this;
                    zmp0.a(wb40Var2.A, new mk5());
                    ArrayList arrayList = wb40Var2.E;
                    View view = (View) j5g.a0(arrayList);
                    if (view != null) {
                        bwt0.p0(view, wb40Var2.w.l.size() > 2);
                    }
                    Iterator it = arrayList.iterator();
                    int i2 = i;
                    int i3 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            e43.t();
                            throw null;
                        }
                        View view2 = (View) next;
                        if (bwt0.K(view2)) {
                            view2.setSelected(i3 == i2);
                        } else {
                            i2++;
                        }
                        i3 = i4;
                    }
                }
            });
            tb40 tb40Var = wb40Var.n.a;
            MusicBigPlayerPage musicBigPlayerPage = (MusicBigPlayerPage) j5g.b0(i, wb40Var.w.l);
            if (musicBigPlayerPage == null) {
                MusicBigPlayerPage.Companion.getClass();
                musicBigPlayerPage = MusicBigPlayerPage.DEFAULT_PAGE;
            }
            tb40Var.a(new sb40.b(musicBigPlayerPage));
            fy40 fy40Var = wb40Var.p;
            if (fy40Var != null) {
                fy40Var.onPageSelected(i);
            }
        }
    }

    /* compiled from: MusicBigPlayerRootHolder.kt */
    public static final class f extends e.a {
        public boolean b;
        public String c = "";

        public f() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, com.vk.music.player.f fVar) {
            if (playState == PlayState.STOPPED) {
                return;
            }
            if (!this.b && fVar != null && !fVar.n()) {
                this.b = true;
                fVar.o(AdvertisementInfo.Action.VIEW);
            } else if (fVar != null && fVar.n()) {
                this.b = false;
            }
            MusicBigPlayerParams musicBigPlayerParams = wb40.this.n;
            tb40 tb40Var = musicBigPlayerParams.a;
            com.vk.music.player.domain.state.a a = com.vk.music.player.domain.state.a.a(tb40Var.b, playState, null, null, musicBigPlayerParams.c.U0(), musicBigPlayerParams.c.getRepeatMode(), null, false, false, null, null, null, null, null, false, false, false, false, 0, 2097051);
            a(a, fVar);
            tb40Var.b = a;
            tb40Var.a.invoke(a);
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void W3(com.vk.music.player.f fVar) {
            tb40 tb40Var = wb40.this.n.a;
            com.vk.music.player.domain.state.a aVar = tb40Var.b;
            aVar.m.a(fVar.h());
            a(aVar, fVar);
            tb40Var.b = aVar;
            tb40Var.a.invoke(aVar);
        }

        public final void a(com.vk.music.player.domain.state.a aVar, com.vk.music.player.f fVar) {
            DownloadingState downloadingState;
            String str;
            MusicTrack f;
            MusicTrack f2;
            MusicTrack f3;
            if (epx.f((fVar == null || (f3 = fVar.f()) == null) ? null : f3.Fb(), this.c)) {
                downloadingState = aVar.p;
            } else {
                if (fVar == null || (f2 = fVar.f()) == null || (str = f2.Fb()) == null) {
                    str = "";
                }
                this.c = str;
                if (fVar == null || (f = fVar.f()) == null || (downloadingState = f.J) == null) {
                    downloadingState = DownloadingState.NotLoaded.b;
                }
            }
            aVar.b(fVar, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.i, aVar.j, aVar.k, aVar.l, aVar.m, aVar.n, aVar.o, downloadingState, aVar.r, aVar.s, aVar.t, aVar.u, aVar.v);
            aVar.b.a = fVar != null ? fVar.e() : 0;
            aVar.b.b = fVar != null ? fVar.h() : 0;
            aVar.b.c = fVar != null ? fVar.d() : 0;
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void o2(com.vk.music.player.f fVar) {
            tb40 tb40Var = wb40.this.n.a;
            com.vk.music.player.domain.state.a aVar = tb40Var.b;
            a(aVar, fVar);
            tb40Var.b = aVar;
            tb40Var.a.invoke(aVar);
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void y4(List<PlayerTrack> list) {
            MusicBigPlayerParams musicBigPlayerParams = wb40.this.n;
            tb40 tb40Var = musicBigPlayerParams.a;
            com.vk.music.player.domain.state.a a = com.vk.music.player.domain.state.a.a(tb40Var.b, null, musicBigPlayerParams.c.g(), null, false, null, null, false, false, null, null, null, null, null, false, false, false, false, 0, 2097143);
            tb40Var.b = a;
            tb40Var.a.invoke(a);
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void z3() {
            MusicBigPlayerParams musicBigPlayerParams = wb40.this.n;
            tb40 tb40Var = musicBigPlayerParams.a;
            com.vk.music.player.domain.state.a a = com.vk.music.player.domain.state.a.a(tb40Var.b, null, null, null, musicBigPlayerParams.c.U0(), musicBigPlayerParams.c.getRepeatMode(), null, false, false, null, null, null, null, null, false, false, false, false, 0, 2097055);
            tb40Var.b = a;
            tb40Var.a.invoke(a);
        }
    }

    public wb40(ViewGroup viewGroup, MusicBigPlayerParams musicBigPlayerParams, com.vk.music.podcast.api.di.a aVar) {
        super(R.layout.music_player_fr, viewGroup);
        this.n = musicBigPlayerParams;
        boolean b2 = com.vk.core.apps.a.b();
        boolean z = !b2;
        this.o = z;
        Context context = viewGroup.getContext();
        bpn0 bpn0Var = enj.a;
        c07 c07Var = new c07(new WeakReference(e3m.h(context)), musicBigPlayerParams);
        d dVar = new d();
        this.t = dVar;
        e eVar = new e();
        this.u = new com.vk.music.player.domain.state.a();
        this.v = new ugp0(0, 0, 0);
        this.w = new com.vk.music.view.player.a(musicBigPlayerParams, dVar, eVar, c07Var, aVar);
        ImageButton imageButton = (ImageButton) this.itemView.findViewById(R.id.close);
        bwt0.p0(imageButton, b2);
        jjc.f(dVar, imageButton);
        this.x = this.itemView.findViewById(R.id.shadow);
        this.y = (VkButton) this.itemView.findViewById(R.id.shuffle);
        this.z = (VkButton) this.itemView.findViewById(R.id.repeat);
        this.A = (LinearLayout) this.itemView.findViewById(R.id.dots);
        abg0 abg0Var = dhr0.t;
        yz40 yz40Var = new yz40(abg0Var.c(R.attr.vk_ui_background_content), abg0Var.c(R.attr.vk_ui_background_secondary));
        this.B = yz40Var;
        ThumbsImageView thumbsImageView = (ThumbsImageView) this.itemView.findViewById(R.id.player_background_blur_image);
        thumbsImageView.setClipToOutline(true);
        bwt0.p0(thumbsImageView, z);
        thumbsImageView.setPostProcessorForSingle(yz40Var);
        thumbsImageView.setEmptyColor(abg0Var.c(R.attr.vk_ui_background_secondary));
        thumbsImageView.setBackground(abg0Var.c(R.attr.vk_ui_background_content));
        thumbsImageView.getHierarchy().q(0);
        thumbsImageView.g(iah0.b(12.0f), iah0.b(12.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        thumbsImageView.setOnLoadCallback(new c(thumbsImageView));
        this.C = thumbsImageView;
        View findViewById = this.itemView.findViewById(R.id.player_gradient);
        bwt0.p0(findViewById, z);
        this.D = findViewById;
        int[] iArr = {R.id.dot1, R.id.dot2, R.id.dot3};
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList.add(this.itemView.findViewById(iArr[i]));
        }
        this.E = arrayList;
        SwipeBlockingViewPager swipeBlockingViewPager = (SwipeBlockingViewPager) this.itemView.findViewById(R.id.pager);
        if (swipeBlockingViewPager != null) {
            swipeBlockingViewPager.setOffscreenPageLimit(3);
            com.vk.music.view.player.a aVar2 = this.w;
            SwipeBlockingViewPager swipeBlockingViewPager2 = aVar2.k;
            if (swipeBlockingViewPager2 != null) {
                swipeBlockingViewPager2.removeOnPageChangeListener(aVar2);
            }
            aVar2.k = swipeBlockingViewPager;
            swipeBlockingViewPager.addOnPageChangeListener(aVar2);
            aVar2.b(com.vk.music.view.player.a.q);
        } else {
            swipeBlockingViewPager = null;
        }
        this.F = swipeBlockingViewPager;
        jjc.f(this.t, this.y);
        jjc.f(this.t, this.z);
        this.itemView.setClipToOutline(true);
        if (com.vk.core.apps.a.b()) {
            View view = this.itemView;
            u080 u080Var = new u080() { // from class: xsna.ub40
                @Override // xsna.u080
                public final bqx0 b(View view2, bqx0 bqx0Var) {
                    f4m.t(wqx0.a(bqx0Var), wb40.this.itemView);
                    return bqx0.b;
                }
            };
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            iut0.d.c(view, u080Var);
        }
        this.H = new f();
    }

    @Override // xsna.xb40
    public final void B0(float f2) {
        this.q = f2;
        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT == f2) {
            m6();
        } else {
            l6();
        }
        this.w.B0(f2);
    }

    @Override // xsna.too0
    public final void Ng() {
        this.w.Ng();
        o6();
        abg0 abg0Var = dhr0.t;
        int c2 = abg0Var.c(R.attr.vk_ui_background_secondary);
        ThumbsImageView thumbsImageView = this.C;
        thumbsImageView.setEmptyColor(c2);
        thumbsImageView.setBackground(abg0Var.c(R.attr.vk_ui_background_content));
        int c3 = abg0Var.c(R.attr.vk_ui_background_content);
        yz40 yz40Var = this.B;
        yz40Var.d = c3;
        yz40Var.e = abg0Var.c(R.attr.vk_ui_background_secondary);
        thumbsImageView.setThumb(null);
    }

    @Override // xsna.se50
    public final void b6(com.vk.music.player.domain.state.a aVar) {
        com.vk.music.player.f fVar;
        MusicTrack f2;
        MusicTrack f3;
        ExternalAudio externalAudio;
        MusicTrack f4;
        MusicTrack f5;
        ExternalAudio externalAudio2;
        MusicTrack f6;
        Thumb Jb;
        com.vk.music.player.domain.state.a aVar2 = aVar;
        com.vk.music.player.domain.state.a aVar3 = this.u;
        PlayState playState = aVar3.c;
        PlayState playState2 = aVar2.c;
        com.vk.music.view.player.a aVar4 = this.w;
        if (playState == playState2 && epx.f(aVar3.d, aVar2.d) && epx.f(aVar3.e, aVar2.e) && aVar3.f == aVar2.f && aVar3.g == aVar2.g && aVar3.h == aVar2.h && aVar3.i == aVar2.i && aVar3.j == aVar2.j && aVar3.k == aVar2.k && aVar3.l == aVar2.l && epx.f(aVar3.m, aVar2.m) && aVar3.n == aVar2.n && aVar3.o == aVar2.o && epx.f(aVar3.p, aVar2.p) && epx.f(aVar3.q, aVar2.q) && aVar3.r == aVar2.r && aVar3.s == aVar2.s && aVar3.t == aVar2.t && aVar3.u == aVar2.u && aVar3.v == aVar2.v) {
            com.vk.music.player.f fVar2 = aVar3.a;
            com.vk.music.player.f fVar3 = aVar2.a;
            if (fVar2 != null) {
                f.a.C1335a c1335a = fVar2.j;
                if (fVar3 != null) {
                    f.a.C1335a c1335a2 = fVar3.j;
                    if (epx.f(fVar2.f(), fVar3.f()) && epx.f(fVar2.c, fVar3.c)) {
                        String str = fVar2.a;
                        fVar2.a = "";
                        String str2 = fVar3.a;
                        fVar3.a = "";
                        if (str.equals(str2) && epx.f(fVar2.d, fVar3.d) && fVar2.n() == fVar3.n() && fVar2.e() == fVar3.e() && epx.f(c1335a.i(fVar2, fVar2.k), c1335a2.i(fVar3, fVar3.k)) && epx.f(c1335a.c(fVar2, fVar2.k), c1335a2.c(fVar3, fVar3.k)) && epx.f(c1335a.g(fVar2, fVar2.k), c1335a2.g(fVar3, fVar3.k)) && epx.f(fVar2.b(), fVar3.b()) && epx.f(fVar2.c(), fVar3.c())) {
                            ugp0 ugp0Var = aVar2.b;
                            ugp0 ugp0Var2 = this.v;
                            if (epx.f(ugp0Var2, ugp0Var)) {
                                return;
                            }
                            ugp0 ugp0Var3 = aVar2.b;
                            ugp0Var2.a = ugp0Var3.a;
                            ugp0Var2.b = ugp0Var3.b;
                            ugp0Var2.c = ugp0Var3.c;
                            Iterator it = aVar4.m.values().iterator();
                            while (it.hasNext()) {
                                ((rb40) it.next()).l6(ugp0Var2);
                            }
                            return;
                        }
                    }
                }
            }
        }
        this.u = aVar2;
        String t = aVar2.e.t();
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = MusicPlaybackLaunchContext.o;
        if (epx.f(t, musicPlaybackLaunchContext.t()) && this.s == null) {
            this.s = new com.vk.music.stats.a(null);
        } else if (!epx.f(aVar2.e.t(), musicPlaybackLaunchContext.t()) && this.s != null) {
            this.s = null;
        }
        com.vk.music.stats.a aVar5 = this.s;
        aVar4.getClass();
        mb40 mb40Var = aVar4.p;
        if (mb40Var != null) {
            mb40Var.n.g = aVar5;
        }
        ThumbsImageView thumbsImageView = this.C;
        thumbsImageView.animate().alpha((aVar2.c.h() && aVar2.l == LyricsMode.COLLAPSED) ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(300L).start();
        com.vk.music.player.f fVar4 = aVar2.a;
        if (fVar4 != null) {
            thumbsImageView.setThumbs((!fVar4.n() || (f6 = fVar4.f()) == null || (Jb = f6.Jb()) == null) ? null : Collections.singletonList(Jb));
        }
        MusicBigPlayerPage musicBigPlayerPage = aVar2.i;
        aVar4.n = aVar2;
        com.vk.music.player.f fVar5 = aVar2.a;
        boolean z = (fVar5 == null || (f5 = fVar5.f()) == null || (externalAudio2 = f5.H) == null || externalAudio2.e != 4) ? false : true;
        com.vk.music.player.f fVar6 = aVar2.a;
        boolean z2 = (fVar6 == null || (f4 = fVar6.f()) == null || !f4.Ub()) ? false : true;
        com.vk.music.player.f fVar7 = aVar2.a;
        boolean z3 = ((fVar7 == null || (f3 = fVar7.f()) == null || (externalAudio = f3.H) == null) ? null : externalAudio.c) != null;
        com.vk.music.player.f fVar8 = aVar2.a;
        List<MusicBigPlayerPage> list = (z2 || z || z3 || (fVar8 != null && (f2 = fVar8.f()) != null && f2.Qb() && aVar2.d.size() == 1)) ? com.vk.music.view.player.a.s : com.vk.music.view.player.a.r;
        if (epx.f(aVar4.l, list)) {
            int i = 0;
            for (Object obj : aVar4.m.values()) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                ((rb40) obj).V5("", false, i, aVar2);
                i = i2;
            }
        } else {
            aVar4.l = list;
            aVar4.b(musicBigPlayerPage);
        }
        MusicBigPlayerParams musicBigPlayerParams = this.n;
        boolean z4 = musicBigPlayerParams.c.j() instanceof StartPlayVkMixSource;
        LyricsMode lyricsMode = aVar2.l;
        LyricsMode lyricsMode2 = LyricsMode.COLLAPSED;
        View view = this.x;
        LinearLayout linearLayout = this.A;
        SwipeBlockingViewPager swipeBlockingViewPager = this.F;
        VkButton vkButton = this.y;
        VkButton vkButton2 = this.z;
        if (lyricsMode != lyricsMode2 || ((fVar = aVar2.a) != null && !fVar.n())) {
            bwt0.p0(vkButton2, false);
            bwt0.p0(vkButton, false);
            bwt0.p0(linearLayout, false);
            bwt0.p0(view, false);
            if (swipeBlockingViewPager != null) {
                swipeBlockingViewPager.setSwipeEnabled(false);
                return;
            }
            return;
        }
        if (swipeBlockingViewPager != null) {
            swipeBlockingViewPager.setSwipeEnabled(!z4);
        }
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_repeat_24);
        int i3 = b.$EnumSwitchMapping$0[aVar2.g.ordinal()];
        if (i3 == 1) {
            int[] iArr = VkButton.W;
            vkButton2.a5(true, valueOf);
            vkButton2.setIconTint(R.attr.vk_ui_icon_secondary);
            vkButton2.setMode(VkButton.Mode.Tertiary);
            vkButton2.setContentDescription(this.itemView.getResources().getString(R.string.music_talkback_repeat_all));
        } else if (i3 == 2) {
            Integer valueOf2 = Integer.valueOf(R.drawable.vk_icon_repeat_one_24);
            int[] iArr2 = VkButton.W;
            vkButton2.a5(true, valueOf2);
            vkButton2.setMode(VkButton.Mode.Secondary);
            vkButton2.setContentDescription(this.itemView.getResources().getString(R.string.music_talkback_repeat_off));
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int[] iArr3 = VkButton.W;
            vkButton2.a5(true, valueOf);
            vkButton2.setMode(VkButton.Mode.Secondary);
            vkButton2.setContentDescription(this.itemView.getResources().getString(R.string.music_talkback_repeat_one));
        }
        boolean z5 = aVar2.f;
        if (z5) {
            vkButton.setMode(VkButton.Mode.Secondary);
        } else {
            vkButton.setMode(VkButton.Mode.Tertiary);
            vkButton.setIconTint(R.attr.vk_ui_icon_secondary);
        }
        vkButton.setContentDescription(z5 ? this.itemView.getResources().getString(R.string.music_talkback_shuffle_disable) : this.itemView.getResources().getString(R.string.music_talkback_shuffle_enable));
        o6();
        com.vk.music.player.f fVar9 = aVar2.a;
        MusicTrack f7 = fVar9 != null ? fVar9.f() : null;
        boolean z6 = f7 != null && f7.Vb();
        boolean z7 = f7 != null && f7.Ub();
        boolean z8 = musicBigPlayerParams.c.j() instanceof StartPlayVkMixSource;
        bwt0.p0(vkButton2, (z6 || z7) ? false : true);
        bwt0.p0(vkButton, (z6 || z7) ? false : true);
        vkButton.setEnabled(true);
        if (z7) {
            bwt0.p0(vkButton2, false);
            bwt0.p0(vkButton, false);
            awt0.v(view, true);
            linearLayout.setVisibility(8);
            view.setVisibility(8);
            return;
        }
        if (f7 != null && f7.Vb()) {
            bwt0.p0(vkButton2, false);
            bwt0.p0(vkButton, false);
            awt0.v(view, true);
            awt0.v(linearLayout, true);
            return;
        }
        if (f7 != null && f7.Wb()) {
            bwt0.p0(vkButton2, false);
            bwt0.p0(vkButton, false);
            r5 = aVar2.d.size() > 1;
            awt0.v(view, r5);
            awt0.v(linearLayout, r5);
            return;
        }
        if (f7 != null && f7.Qb()) {
            bwt0.p0(vkButton2, true);
            bwt0.p0(vkButton, false);
            ExternalAudio externalAudio3 = f7.H;
            if ((externalAudio3 != null && externalAudio3.c != null) || (externalAudio3 != null && externalAudio3.e == 4)) {
                r5 = false;
            }
            awt0.v(view, r5);
            awt0.v(linearLayout, r5);
            return;
        }
        if (f7 != null && f7.Mb()) {
            bwt0.p0(vkButton2, false);
            bwt0.p0(vkButton, false);
            awt0.v(view, true);
            awt0.v(linearLayout, true);
            return;
        }
        if (!z8) {
            awt0.v(vkButton, true);
            awt0.v(vkButton2, true);
            awt0.v(view, true);
            awt0.v(linearLayout, true);
            return;
        }
        vkButton.setEnabled(false);
        awt0.v(vkButton, true);
        awt0.v(vkButton2, true);
        awt0.v(view, true);
        linearLayout.setVisibility(8);
    }

    public final void l6() {
        if (this.q <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.r) {
            return;
        }
        this.r = true;
        Iterator it = this.w.m.values().iterator();
        while (it.hasNext()) {
            ((rb40) it.next()).a6();
        }
    }

    public final void m6() {
        if (this.r) {
            Iterator it = this.w.m.values().iterator();
            while (it.hasNext()) {
                ((rb40) it.next()).h6();
            }
            this.r = false;
        }
    }

    public final void o6() {
        ArrayList arrayList = this.E;
        if (arrayList == null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                Drawable background = view.getBackground();
                dhr0.a.getClass();
                background.setTintList(anj.b(R.color.music_selectable_dots, dhr0.E()));
                view.getBackground().invalidateSelf();
            }
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayList.get(i);
            Drawable background2 = view2.getBackground();
            dhr0.a.getClass();
            background2.setTintList(anj.b(R.color.music_selectable_dots, dhr0.E()));
            view2.getBackground().invalidateSelf();
        }
    }

    @Override // xsna.f380
    public final void onConfigurationChanged(Configuration configuration) {
        this.w.onConfigurationChanged(configuration);
        bwt0.d0(this.C, (this.o && iah0.s(this.itemView.getContext())) ? false : true);
    }

    /* compiled from: MusicBigPlayerRootHolder.kt */
    public static final class c implements b780 {
        public final /* synthetic */ ThumbsImageView c;

        public c(ThumbsImageView thumbsImageView) {
            this.c = thumbsImageView;
        }

        @Override // xsna.b780
        public final void g(String str) {
            if (wb40.this.u.l == LyricsMode.COLLAPSED) {
                this.c.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(100L).start();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.b780
        public final void t(int i, int i2, String str) {
            PlayState playState;
            wb40 wb40Var = wb40.this;
            if (wb40Var.u.l == LyricsMode.COLLAPSED) {
                ViewPropertyAnimator animate = this.c.animate();
                com.vk.music.player.domain.state.a aVar = (com.vk.music.player.domain.state.a) wb40Var.l;
                animate.alpha((aVar == null || (playState = aVar.c) == null || !playState.h()) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f).setDuration(300L).start();
            }
        }

        @Override // xsna.b780
        public final void onCancel(String str) {
        }

        @Override // xsna.b780
        public final void b(String str, Throwable th) {
        }
    }
}
