package xsna;

import com.vk.music.bottomsheets.artistlist.domain.LoadingState;
import java.util.List;

/* compiled from: ArtistListBottomSheetViewState.kt */
/* loaded from: classes3.dex */
public final class mr3 implements ao50 {
    public final fi50 a;
    public final fi50 b;

    /* compiled from: ArtistListBottomSheetViewState.kt */
    public interface a extends fm50<lr3> {

        /* compiled from: ArtistListBottomSheetViewState.kt */
        /* renamed from: xsna.mr3$a$a, reason: collision with other inner class name */
        public static final class C3368a implements a {
            public final yzt0<List<yq3>> a;
            public final yzt0<LoadingState> b;

            public C3368a(h0u0 h0u0Var, h0u0 h0u0Var2) {
                this.a = h0u0Var;
                this.b = h0u0Var2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3368a)) {
                    return false;
                }
                C3368a c3368a = (C3368a) obj;
                return epx.f(this.a, c3368a.a) && epx.f(this.b, c3368a.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Content(artistList=");
                sb.append(this.a);
                sb.append(", loadingState=");
                return tr.c(sb, this.b, ')');
            }
        }

        /* compiled from: ArtistListBottomSheetViewState.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -982900891;
            }

            public final String toString() {
                return "Init";
            }
        }
    }

    public mr3(fi50 fi50Var, fi50 fi50Var2) {
        this.a = fi50Var;
        this.b = fi50Var2;
    }
}
