package xsna;

import android.text.Spanned;
import com.vk.dto.music.audiobook.AudioBookPerson;
import java.util.List;

/* compiled from: DisplayAudioBookChaptersViewState.kt */
/* loaded from: classes3.dex */
public final class ken implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* compiled from: DisplayAudioBookChaptersViewState.kt */
    public interface a extends fm50<jen> {

        /* compiled from: DisplayAudioBookChaptersViewState.kt */
        /* renamed from: xsna.ken$a$a, reason: collision with other inner class name */
        public static final class C3177a implements a {
            public final yzt0<Boolean> a;
            public final yzt0<h9b0> b;
            public final yzt0<String> c;
            public final yzt0<List<AudioBookPerson>> d;
            public final yzt0<List<String>> e;
            public final yzt0<List<AudioBookPerson>> f;
            public final yzt0<Boolean> g;
            public final yzt0<Boolean> h;
            public final yzt0<Spanned> i;
            public final yzt0<String> j;
            public final yzt0<Integer> k;
            public final yzt0<String> l;
            public final yzt0<n05> m;
            public final yzt0<Integer> n;
            public final yzt0<Integer> o;
            public final yzt0<String> p;
            public final yzt0<Boolean> q;
            public final yzt0<Boolean> r;
            public final yzt0<Boolean> s;
            public final yzt0<Boolean> t;
            public final yzt0<Boolean> u;
            public final yzt0<Boolean> v;
            public final yzt0<Boolean> w;
            public final yzt0<Boolean> x;

            public C3177a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8, h0u0 h0u0Var9, h0u0 h0u0Var10, h0u0 h0u0Var11, h0u0 h0u0Var12, h0u0 h0u0Var13, h0u0 h0u0Var14, h0u0 h0u0Var15, h0u0 h0u0Var16, h0u0 h0u0Var17, h0u0 h0u0Var18, h0u0 h0u0Var19, h0u0 h0u0Var20, h0u0 h0u0Var21, h0u0 h0u0Var22, h0u0 h0u0Var23, h0u0 h0u0Var24) {
                this.a = h0u0Var;
                this.b = h0u0Var2;
                this.c = h0u0Var3;
                this.d = h0u0Var4;
                this.e = h0u0Var5;
                this.f = h0u0Var6;
                this.g = h0u0Var7;
                this.h = h0u0Var8;
                this.i = h0u0Var9;
                this.j = h0u0Var10;
                this.k = h0u0Var11;
                this.l = h0u0Var12;
                this.m = h0u0Var13;
                this.n = h0u0Var14;
                this.o = h0u0Var15;
                this.p = h0u0Var16;
                this.q = h0u0Var17;
                this.r = h0u0Var18;
                this.s = h0u0Var19;
                this.t = h0u0Var20;
                this.u = h0u0Var21;
                this.v = h0u0Var22;
                this.w = h0u0Var23;
                this.x = h0u0Var24;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3177a)) {
                    return false;
                }
                C3177a c3177a = (C3177a) obj;
                return epx.f(this.a, c3177a.a) && epx.f(this.b, c3177a.b) && epx.f(this.c, c3177a.c) && epx.f(this.d, c3177a.d) && epx.f(this.e, c3177a.e) && epx.f(this.f, c3177a.f) && epx.f(this.g, c3177a.g) && epx.f(this.h, c3177a.h) && epx.f(this.i, c3177a.i) && epx.f(this.j, c3177a.j) && epx.f(this.k, c3177a.k) && epx.f(this.l, c3177a.l) && epx.f(this.m, c3177a.m) && epx.f(this.n, c3177a.n) && epx.f(this.o, c3177a.o) && epx.f(this.p, c3177a.p) && epx.f(this.q, c3177a.q) && epx.f(this.r, c3177a.r) && epx.f(this.s, c3177a.s) && epx.f(this.t, c3177a.t) && epx.f(this.u, c3177a.u) && epx.f(this.v, c3177a.v) && epx.f(this.w, c3177a.w) && epx.f(this.x, c3177a.x);
            }

            public final int hashCode() {
                return this.x.hashCode() + sr.a(this.w, sr.a(this.v, sr.a(this.u, sr.a(this.t, sr.a(this.s, sr.a(this.r, sr.a(this.q, sr.a(this.p, sr.a(this.o, sr.a(this.n, sr.a(this.m, sr.a(this.l, sr.a(this.k, sr.a(this.j, sr.a(this.i, sr.a(this.h, sr.a(this.g, sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Content(isRefreshing=");
                sb.append(this.a);
                sb.append(", header=");
                sb.append(this.b);
                sb.append(", authorName=");
                sb.append(this.c);
                sb.append(", authorPersonList=");
                sb.append(this.d);
                sb.append(", narrators=");
                sb.append(this.e);
                sb.append(", narratorsPersonList=");
                sb.append(this.f);
                sb.append(", isBookPlaying=");
                sb.append(this.g);
                sb.append(", isBookFavorite=");
                sb.append(this.h);
                sb.append(", summary=");
                sb.append(this.i);
                sb.append(", genre=");
                sb.append(this.j);
                sb.append(", chaptersCount=");
                sb.append(this.k);
                sb.append(", illegalMention=");
                sb.append(this.l);
                sb.append(", chapterItemList=");
                sb.append(this.m);
                sb.append(", minimumAge=");
                sb.append(this.n);
                sb.append(", bookDurationSec=");
                sb.append(this.o);
                sb.append(", copyright=");
                sb.append(this.p);
                sb.append(", isExplicit=");
                sb.append(this.q);
                sb.append(", isBookFree=");
                sb.append(this.r);
                sb.append(", isVkMusicSubscriber=");
                sb.append(this.s);
                sb.append(", hasActionsForBottomSheet=");
                sb.append(this.t);
                sb.append(", canAdd=");
                sb.append(this.u);
                sb.append(", isKidsLimitedBook=");
                sb.append(this.v);
                sb.append(", isKidsModeEnabled=");
                sb.append(this.w);
                sb.append(", isKidsBook=");
                return tr.c(sb, this.x, ')');
            }
        }

        /* compiled from: DisplayAudioBookChaptersViewState.kt */
        public static final class b implements a {
            public final yzt0<Boolean> a;

            public b(h0u0 h0u0Var) {
                this.a = h0u0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tr.c(new StringBuilder("Error(isKidsPlaceholder="), this.a, ')');
            }
        }

        /* compiled from: DisplayAudioBookChaptersViewState.kt */
        public static final class c implements a {
            public static final c a = new c();
        }
    }

    public ken(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ken)) {
            return false;
        }
        ken kenVar = (ken) obj;
        return this.a.equals(kenVar.a) && this.b.equals(kenVar.b) && this.c.equals(kenVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayAudioBookChaptersViewState(content=");
        sb.append(this.a);
        sb.append(", loading=");
        sb.append(this.b);
        sb.append(", errorState=");
        return j8.b(sb, this.c, ')');
    }
}
