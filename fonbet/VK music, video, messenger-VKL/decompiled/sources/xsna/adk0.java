package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.MusicTrack;
import com.vk.music.snippet.ui.presentation.base.view.SnippetLinesProgressView;
import com.vk.music.snippet.ui.presentation.base.view.SnippetTrackItemView$Companion$ButtonAddAction;
import com.vk.music.view.MusicRoundPlayView;
import java.util.Iterator;
import java.util.List;
import xsna.kck0;

/* compiled from: SnippetTrackViewHolder.kt */
/* loaded from: classes3.dex */
public final class adk0 extends vfz<yck0> implements kck0.a {
    public static final /* synthetic */ int q = 0;
    public final zck0 l;
    public final bgy m;
    public final kck0 n;
    public final wck0 o;
    public yck0 p;

    /* compiled from: SnippetTrackViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnippetTrackItemView$Companion$ButtonAddAction.values().length];
            try {
                iArr[SnippetTrackItemView$Companion$ButtonAddAction.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnippetTrackItemView$Companion$ButtonAddAction.REMOVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public adk0(zck0 zck0Var, bgy bgyVar, kck0 kck0Var, wck0 wck0Var) {
        super(zck0Var);
        this.l = zck0Var;
        this.m = bgyVar;
        this.n = kck0Var;
        this.o = wck0Var;
    }

    @Override // xsna.kck0.a
    public final void L0() {
        yck0 yck0Var = this.p;
        String str = (yck0Var == null ? null : yck0Var).b;
        if (yck0Var == null) {
            yck0Var = null;
        }
        MusicTrack musicTrack = yck0Var.c;
        kck0 kck0Var = this.n;
        if (!kck0Var.d(musicTrack, str)) {
            yck0 yck0Var2 = this.p;
            this.l.setPlayViewState(kck0Var.d((yck0Var2 != null ? yck0Var2 : null).c, (yck0Var2 == null ? null : yck0Var2).b));
            return;
        }
        yck0 yck0Var3 = this.p;
        if (yck0Var3 == null) {
            yck0Var3 = null;
        }
        MusicTrack musicTrack2 = yck0Var3.c;
        xck0 xck0Var = this.o.a;
        pck0 pck0Var = xck0Var.o;
        nck0 nck0Var = (pck0Var != null ? pck0Var : null).b;
        List<nbk0> list = nck0Var.g;
        Iterator<nbk0> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().b.equals(musicTrack2)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= e43.h(list)) {
            xck0Var.n.invoke(nck0Var.a);
            return;
        }
        tck0 tck0Var = xck0Var.l;
        int i2 = i + 1;
        mck0 mck0Var = tck0Var.D;
        if (mck0Var != null) {
            mck0Var.f = true;
        }
        tck0Var.t.smoothScrollToPosition(i2);
    }

    @Override // xsna.vfz
    public final void V5() {
        this.n.a(this);
    }

    @Override // xsna.vfz
    public final void W5(yck0 yck0Var) {
        yck0 yck0Var2 = yck0Var;
        this.p = yck0Var2;
        MusicTrack musicTrack = yck0Var2.c;
        zck0 zck0Var = this.l;
        zck0Var.setTrackInfo(musicTrack);
        zck0Var.setPlayViewState(h6());
        zck0Var.setTrackClickListener(new ni0(20, yck0Var2, this));
        zck0Var.setTogglePlayPauseListener(new mh3(27, this, yck0Var2));
        MusicTrack musicTrack2 = yck0Var2.e;
        if (musicTrack2 == null) {
            musicTrack2 = yck0Var2.c;
        }
        zck0Var.P4(musicTrack2, new ku1(25, this, yck0Var2));
    }

    @Override // xsna.vfz
    public final void a6() {
        this.n.c(this);
    }

    @Override // xsna.kck0.a
    public final void g4() {
        boolean h6 = h6();
        zck0 zck0Var = this.l;
        if (!h6) {
            zck0Var.setPlayViewState(h6());
            return;
        }
        MusicRoundPlayView musicRoundPlayView = zck0Var.u;
        musicRoundPlayView.getClass();
        musicRoundPlayView.b(MusicRoundPlayView.State.BUFFERING);
        yck0 yck0Var = this.p;
        if (yck0Var == null) {
            yck0Var = null;
        }
        MusicTrack musicTrack = yck0Var.c;
        xck0 xck0Var = this.o.a;
        pck0 pck0Var = xck0Var.o;
        if (pck0Var == null) {
            pck0Var = null;
        }
        Iterator<nbk0> it = pck0Var.b.g.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().b.equals(musicTrack)) {
                break;
            } else {
                i++;
            }
        }
        Integer valueOf = i != -1 ? Integer.valueOf(i) : null;
        if (valueOf != null) {
            xck0Var.l.w.h = valueOf.intValue();
        }
    }

    public final boolean h6() {
        yck0 yck0Var = this.p;
        String str = (yck0Var == null ? null : yck0Var).b;
        if (yck0Var == null) {
            yck0Var = null;
        }
        return this.n.b(yck0Var.c, str);
    }

    @Override // xsna.kck0.a
    public final void n4(long j, boolean z) {
        zck0 zck0Var = this.l;
        if (z) {
            zck0Var.u.b(MusicRoundPlayView.State.PLAY);
            return;
        }
        if (!h6()) {
            zck0Var.setPlayViewState(h6());
            return;
        }
        zck0Var.u.b(MusicRoundPlayView.State.PLAY);
        SnippetLinesProgressView snippetLinesProgressView = this.o.a.l.w;
        snippetLinesProgressView.getClass();
        snippetLinesProgressView.g = (int) j;
    }

    @Override // xsna.kck0.a
    public final void r(int i) {
        boolean h6 = h6();
        zck0 zck0Var = this.l;
        if (!h6) {
            zck0Var.setPlayViewState(h6());
            return;
        }
        zck0Var.u.b(MusicRoundPlayView.State.PLAY);
        SnippetLinesProgressView snippetLinesProgressView = this.o.a.l.w;
        int i2 = snippetLinesProgressView.g;
        if (i2 == 0 || snippetLinesProgressView.i != snippetLinesProgressView.h) {
            return;
        }
        snippetLinesProgressView.e = xwk.a(i / i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        snippetLinesProgressView.invalidate();
    }

    @Override // xsna.kck0.a
    public final void s1(boolean z) {
        zck0 zck0Var = this.l;
        if (z) {
            zck0Var.u.b(MusicRoundPlayView.State.PAUSE);
        } else if (h6()) {
            zck0Var.u.b(MusicRoundPlayView.State.PAUSE);
        } else {
            zck0Var.setPlayViewState(h6());
        }
    }
}
