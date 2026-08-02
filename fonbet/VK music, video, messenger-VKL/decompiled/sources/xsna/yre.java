package xsna;

import com.vk.clips.playlists.playlist_ui.model.ClipsPlaylistUiLoadingState;
import com.vk.clips.playlists.playlist_ui.model.OverlayViewState;
import com.vk.clips.playlists.playlist_ui.model.PlaylistHeaderIconState;
import xsna.vre;

/* compiled from: ClipsPlaylistUiViewState.kt */
/* loaded from: classes16.dex */
public final class yre implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* compiled from: ClipsPlaylistUiViewState.kt */
    public interface a<T extends vre> extends fm50<vre> {

        /* compiled from: ClipsPlaylistUiViewState.kt */
        /* renamed from: xsna.yre$a$a, reason: collision with other inner class name */
        public static final class C4132a implements a<vre.b> {
            public final yzt0<String> a;
            public final yzt0<tlo0> b;
            public final yzt0<wow<zzc>> c;
            public final yzt0<Boolean> d;
            public final yzt0<Boolean> e;
            public final yzt0<Boolean> f;
            public final yzt0<Boolean> g;
            public final yzt0<s930> h;
            public final yzt0<OverlayViewState> i;
            public final yzt0<Integer> j;
            public final yzt0<ClipsPlaylistUiLoadingState> k;
            public final yzt0<PlaylistHeaderIconState> l;

            public C4132a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8, h0u0 h0u0Var9, h0u0 h0u0Var10, h0u0 h0u0Var11, h0u0 h0u0Var12) {
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
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4132a)) {
                    return false;
                }
                C4132a c4132a = (C4132a) obj;
                return epx.f(this.a, c4132a.a) && epx.f(this.b, c4132a.b) && epx.f(this.c, c4132a.c) && epx.f(this.d, c4132a.d) && epx.f(this.e, c4132a.e) && epx.f(this.f, c4132a.f) && epx.f(this.g, c4132a.g) && epx.f(this.h, c4132a.h) && epx.f(this.i, c4132a.i) && epx.f(this.j, c4132a.j) && epx.f(this.k, c4132a.k) && epx.f(this.l, c4132a.l);
            }

            public final int hashCode() {
                return this.l.hashCode() + sr.a(this.k, sr.a(this.j, sr.a(this.i, sr.a(this.h, sr.a(this.g, sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Content(title=");
                sb.append(this.a);
                sb.append(", count=");
                sb.append(this.b);
                sb.append(", videos=");
                sb.append(this.c);
                sb.append(", isMoreVisible=");
                sb.append(this.d);
                sb.append(", isReorderable=");
                sb.append(this.e);
                sb.append(", hasNext=");
                sb.append(this.f);
                sb.append(", hasPrev=");
                sb.append(this.g);
                sb.append(", popupState=");
                sb.append(this.h);
                sb.append(", overlayState=");
                sb.append(this.i);
                sb.append(", highlightedItemIndex=");
                sb.append(this.j);
                sb.append(", loadingState=");
                sb.append(this.k);
                sb.append(", editState=");
                return tr.c(sb, this.l, ')');
            }
        }

        /* compiled from: ClipsPlaylistUiViewState.kt */
        public static final class b implements a<vre.a> {
            public final yzt0<String> a;
            public final yzt0<tlo0> b;
            public final yzt0<s930> c;
            public final yzt0<PlaylistHeaderIconState> d;

            public b(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4) {
                this.a = h0u0Var;
                this.b = h0u0Var2;
                this.c = h0u0Var3;
                this.d = h0u0Var4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Error(title=");
                sb.append(this.a);
                sb.append(", count=");
                sb.append(this.b);
                sb.append(", popupState=");
                sb.append(this.c);
                sb.append(", canEdit=");
                return tr.c(sb, this.d, ')');
            }
        }

        /* compiled from: ClipsPlaylistUiViewState.kt */
        public static final class c implements a<Object> {
            public static final c a = new c();
        }

        /* compiled from: ClipsPlaylistUiViewState.kt */
        public static final class d implements a<vre.c> {
            public final yzt0<String> a;
            public final yzt0<tlo0> b;
            public final yzt0<s930> c;
            public final yzt0<PlaylistHeaderIconState> d;

            public d(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4) {
                this.a = h0u0Var;
                this.b = h0u0Var2;
                this.c = h0u0Var3;
                this.d = h0u0Var4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Loading(title=");
                sb.append(this.a);
                sb.append(", count=");
                sb.append(this.b);
                sb.append(", popupState=");
                sb.append(this.c);
                sb.append(", canEdit=");
                return tr.c(sb, this.d, ')');
            }
        }
    }

    public yre(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3, fi50 fi50Var4) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }
}
