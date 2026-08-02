package xsna;

import android.view.KeyEvent;
import android.webkit.URLUtil;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.AlbumLink;
import com.vk.dto.music.AudioFromMusicCatalogInfo;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.music.Thumb;
import com.vk.stickers.api.styles.MusicStickerStyle;
import com.vk.stories.design.view.editor.SelectRangeWaveFormView;
import com.vk.toggle.features.StoriesFeatures;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.u850;

/* compiled from: StoryMusicPresenter.kt */
/* loaded from: classes16.dex */
public final class n7m0 extends xyl0<Object, d7m0> implements m9i0, w8i {
    public static final float A = SelectRangeWaveFormView.C0;
    public static final float B;
    public static final float C;
    public final kh6 d;
    public final c7m0 e;
    public final Float f;
    public final Object g;
    public io.reactivex.rxjava3.disposables.c h;
    public io.reactivex.rxjava3.disposables.c i;
    public MusicTrack j;
    public String k;
    public String l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public AudioFromMusicCatalogInfo v;
    public MusicStickerStyle w;
    public byte[] x;
    public boolean y;
    public final m7m0 z;

    static {
        int i = iah0.f().widthPixels;
        int i2 = iah0.f().widthPixels;
        iah0.a(60);
        B = (iah0.f().widthPixels - iah0.a(120)) - (SelectRangeWaveFormView.B0 * 2);
        C = iah0.f().widthPixels / 18.75f;
    }

    public n7m0(f7m0 f7m0Var, kh6 kh6Var, c7m0 c7m0Var, Float f) {
        super(f7m0Var);
        this.d = kh6Var;
        this.e = c7m0Var;
        this.f = f;
        this.g = msy.a(LazyThreadSafetyMode.NONE, new re40(this, 27));
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.h = emptyDisposable;
        this.i = emptyDisposable;
        this.m = true;
        this.w = MusicStickerStyle.Horizontal;
        this.x = new byte[0];
        this.z = new m7m0(this);
        c7m0Var.g();
        a(c7m0Var.a().subscribe(new m5y(new b140(this, 26), 26), new a960(new fxi0(4), 20)));
    }

    @Override // xsna.uyl0
    public final void X1(nov novVar) {
        MusicTrack musicTrack;
        n7m0 n7m0Var;
        StoryMusicInfo info;
        StoryMusicInfo info2;
        StoryMusicInfo info3;
        h7m0 h7m0Var = novVar instanceof h7m0 ? (h7m0) novVar : null;
        if ((h7m0Var == null || (info3 = h7m0Var.getInfo()) == null || (musicTrack = info3.b) == null) && (musicTrack = this.j) == null) {
            return;
        }
        MusicTrack musicTrack2 = musicTrack;
        int max = (h7m0Var == null || (info2 = h7m0Var.getInfo()) == null) ? 0 : StrictMath.max(0, (info2.e - info2.d) + info2.f);
        this.y = (h7m0Var == null || (info = h7m0Var.getInfo()) == null) ? false : info.n;
        this.j = musicTrack2;
        g0(musicTrack2);
        int i = musicTrack2.c0;
        f0(max, musicTrack2);
        c7m0 c7m0Var = this.e;
        c7m0Var.getClass();
        int i2 = this.s;
        KeyEvent.Callback callback = this.b;
        if (i2 <= 1000) {
            ((d7m0) callback).Y();
        }
        boolean z = !Z() && i > 5000;
        int a = an10.a(Math.ceil((((B * 1000.0f) / this.s) * musicTrack2.f) / (this.f != null ? r8.floatValue() : SelectRangeWaveFormView.u0)));
        if (i < c7m0Var.B0()) {
            a--;
        }
        byte[] bArr = new byte[a];
        for (int i3 = 0; i3 < a; i3++) {
            int i4 = i3 % 6;
            int i5 = 33;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        i5 = 100;
                    } else if (i4 != 4) {
                        if (i4 != 5) {
                            i5 = 0;
                        }
                    }
                }
                i5 = 66;
            }
            bArr[i3] = (byte) i5;
        }
        this.x = bArr;
        d7m0 d7m0Var = (d7m0) callback;
        d7m0Var.ng(false);
        d7m0Var.qj(this.x);
        d7m0Var.l3(z);
        d7m0Var.u6();
        d7m0Var.f9();
        d7m0Var.Xk(false);
        d7m0Var.ml(false);
        d7m0Var.Vd(b(musicTrack2));
        d7m0Var.r6(false);
        d7m0Var.f2(true);
        if (novVar instanceof o7m0) {
            MusicStickerStyle style = ((o7m0) novVar).getStyle();
            this.w = style;
            d7m0Var.M5(style);
        }
        StoriesFeatures storiesFeatures = StoriesFeatures.ST_TAB_STYLE_PICKER;
        storiesFeatures.getClass();
        if (com.vk.toggle.b.A.a(storiesFeatures)) {
            d7m0Var.Z3();
        }
        d7m0Var.fb(novVar != null);
        d7m0Var.setActive(true);
        if (h7m0Var == null) {
            this.u = false;
            h0(musicTrack2);
            n7m0Var = this;
        } else {
            this.h.dispose();
            this.u = true;
            this.l = h7m0Var.getInfo().g;
            this.v = h7m0Var.getInfo().l;
            n7m0Var = this;
            n7m0Var.d0(h7m0Var.getInfo().c, h7m0Var.getInfo().d, h7m0Var.getInfo().e, h7m0Var.getInfo().f, musicTrack2, h7m0Var.getInfo().i);
            x(musicTrack2, h7m0Var.getInfo().c, h7m0Var.getInfo().g);
        }
        if (n7m0Var.y) {
            d7m0Var.j4();
        }
    }

    public final boolean Z() {
        c7m0 c7m0Var = this.e;
        c7m0Var.getClass();
        return c7m0Var.i();
    }

    public final StoryMusicInfo b(MusicTrack musicTrack) {
        MusicTrack zb = MusicTrack.zb(musicTrack, 0, null, 0, 0, this.k, false, null, null, false, false, null, null, null, -129, 1048575);
        String str = this.k;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        int i = this.o;
        int i2 = this.p;
        int i3 = this.r;
        return new StoryMusicInfo(zb, str2, i, i2, this.q, this.l, false, i3, false, URLUtil.isFileUrl(musicTrack.i), this.v, false, this.y, 2368, null);
    }

    public final void d0(String str, int i, int i2, int i3, MusicTrack musicTrack, int i4) {
        String str2 = str;
        this.k = str2;
        this.r = i4;
        if (str2.length() == 0) {
            return;
        }
        d7m0 d7m0Var = (d7m0) this.b;
        d7m0Var.f2(false);
        d7m0Var.r6(true);
        this.o = i;
        c7m0 c7m0Var = this.e;
        c7m0Var.getClass();
        int i5 = this.o;
        int i6 = (this.s + i5) - i3;
        this.p = i6;
        int i7 = i6 - i5;
        int i8 = (int) ((A * 1000) / C);
        MusicTrack musicTrack2 = this.j;
        if (musicTrack2 != null) {
            int i9 = musicTrack2.c0;
            this.o = Math.min(i5, i9 - i8);
            this.p = Math.min(this.p, i9);
        }
        if (i7 < i8 && c7m0Var.B0() == 0) {
            this.p = this.o + i8;
        }
        int i10 = this.s;
        if (i7 > i10) {
            this.p = this.o + i10;
        }
        this.q = i3;
        f0(0, musicTrack);
        d7m0Var.u7(i3, this.o, this.p);
        d7m0Var.sl(this.o, this.p);
        d7m0Var.ja(i4);
        if (!Z() && musicTrack.c0 <= 5000) {
            d7m0Var.uh();
        }
        g0(musicTrack);
        c7m0Var.g();
        String str3 = this.l;
        if (str3 != null) {
            if (str3.length() <= 0) {
                str3 = null;
            }
            if (str3 != null) {
                str2 = str3;
            }
        }
        c7m0Var.j(MusicTrack.zb(musicTrack, 0, null, 0, 0, str2, false, null, null, false, false, null, null, null, -129, 1048575), this.o, this.p, i3);
        d7m0Var.Vd(b(musicTrack));
    }

    public final void e0(MusicTrack musicTrack) {
        MusicTrack musicTrack2 = this.j;
        boolean z = musicTrack2 != null;
        boolean f = epx.f(musicTrack2, musicTrack);
        this.j = musicTrack;
        this.v = null;
        ((d7m0) this.b).setActive(true);
        this.e.getClass();
        if (z) {
            if (f) {
                StoryMusicInfo b = b(musicTrack);
                d0(b.c, b.d, b.e, b.f, musicTrack, b.i);
                return;
            }
            this.o = 0;
            this.p = 0;
            this.k = null;
            this.r = 0;
            this.q = 0;
            this.l = null;
            h0(musicTrack);
        }
    }

    public final void f0(int i, MusicTrack musicTrack) {
        c7m0 c7m0Var = this.e;
        c7m0Var.getClass();
        int i2 = musicTrack.c0;
        d7m0 d7m0Var = (d7m0) this.b;
        d7m0Var.w5(musicTrack.f, i2);
        d7m0Var.gn(0);
        this.s = i;
        if (i == 0 || i > c7m0Var.B0()) {
            this.s = c7m0Var.i() ? Math.min(c7m0Var.B0(), i2) : 16000;
        }
        this.s = StrictMath.max(this.s, c7m0Var.f());
    }

    @Override // xsna.m9i0
    public final void g() {
        ((d7m0) this.b).jb(false);
        c7m0 c7m0Var = this.e;
        if (!epx.f(c7m0Var.b(), u850.d.a)) {
            c7m0Var.h();
        }
        this.n = true;
    }

    public final void g0(MusicTrack musicTrack) {
        Thumb thumb;
        AlbumLink albumLink = musicTrack.q;
        KeyEvent.Callback callback = this.b;
        if (albumLink != null && (thumb = albumLink.f) != null) {
            int a = iah0.a(48);
            Serializer.c<Thumb> cVar = Thumb.CREATOR;
            if (thumb.Ab(a, false) != null) {
            }
        }
        this.e.getClass();
    }

    public final void h0(MusicTrack musicTrack) {
        this.h.dispose();
        this.e.getClass();
        Pair pair = new Pair(new ksl0(musicTrack.c, musicTrack.b, musicTrack.y), 1000);
        io.reactivex.rxjava3.disposables.c subscribe = rsg0.D0((spt) pair.d()).subscribe(new n240(new jng(this, ((Number) pair.g()).intValue(), musicTrack), 18), new m3y(new hij0(this, 4), 21));
        this.h = subscribe;
        a(subscribe);
    }

    @Override // xsna.m9i0
    public final void h1() {
        ((d7m0) this.b).h1();
    }

    @Override // xsna.m9i0
    public final void i1(int i, int i2, int i3, boolean z) {
        this.m = true;
        this.n = false;
        this.o = i2;
        this.q = i;
        c7m0 c7m0Var = this.e;
        c7m0Var.getClass();
        if (Z()) {
            i3 = Math.min(i3 - i2, c7m0Var.B0()) + i2;
        } else {
            z();
        }
        this.p = i3;
        int i4 = this.o;
        if (i4 < i3) {
            c7m0Var.c(i4, i3, this.q);
            if (z) {
                z();
            }
        }
        ((d7m0) this.b).sl(this.o, this.p);
    }

    @Override // xsna.uyl0
    public final void k() {
        String str;
        MusicTrack musicTrack = this.j;
        if (musicTrack == null) {
            return;
        }
        boolean isFileUrl = URLUtil.isFileUrl(musicTrack.i);
        KeyEvent.Callback callback = this.b;
        if (isFileUrl && ((str = this.k) == null || str.length() == 0)) {
            ((d7m0) callback).Y();
            return;
        }
        String str2 = this.k;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        this.t = true;
        this.d.d(b(musicTrack), this.w, true);
        ((d7m0) callback).Y();
        this.e.getClass();
    }

    public final void o() {
        ((d7m0) this.b).Y();
        this.d.c();
        this.e.getClass();
    }

    @Override // xsna.xyl0, xsna.cc6
    public final void onResume() {
        if (this.k != null) {
            this.m = true;
        }
    }

    @Override // xsna.uyl0
    public final void onStart() {
        ((d7m0) this.b).jb(false);
        c7m0 c7m0Var = this.e;
        if (c7m0Var.i()) {
            c7m0Var.V(false);
        }
    }

    @Override // xsna.xyl0, xsna.uyl0
    public final void onStop() {
        if (!this.t) {
            c7m0 c7m0Var = this.e;
            if (c7m0Var.i() || !this.u) {
                c7m0Var.g();
                c7m0Var.d();
                c7m0Var.V(true);
                c7m0Var.K();
            }
        }
        this.t = false;
        super.onStop();
    }

    @Override // xsna.m9i0
    public final void r1(int i, int i2, int i3, boolean z) {
        z();
        d7m0 d7m0Var = (d7m0) this.b;
        d7m0Var.gn(0);
        d7m0Var.Sg(i2, i3);
    }

    public final void x(MusicTrack musicTrack, String str, String str2) {
        io.reactivex.rxjava3.core.x l;
        this.e.getClass();
        this.i.dispose();
        if (str2 != null) {
            l = io.reactivex.rxjava3.core.x.k(str2);
        } else {
            new io.reactivex.rxjava3.disposables.b();
            l = new io.reactivex.rxjava3.internal.operators.single.c(new v850(musicTrack.Fb(), str)).l(new xul0(new wfl0(2), 1));
        }
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.single.s(l, new gs00(new b8j0(this, 5), 11)).q(io.reactivex.rxjava3.schedulers.a.b()).subscribe(new j7m0(), new f5y(new p7x(26), 24));
        this.i = subscribe;
        a(subscribe);
    }

    public final boolean z() {
        this.e.getClass();
        return false;
    }

    @Override // xsna.xyl0, xsna.cc6
    public final void onPause() {
    }
}
