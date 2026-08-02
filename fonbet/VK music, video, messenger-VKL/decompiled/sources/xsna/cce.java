package xsna;

import com.vk.clips.sdk.models.SdkImages;
import java.util.ArrayList;
import xsna.tlo0;
import xsna.ybe;

/* compiled from: ClipsGridBlockViewState.kt */
/* loaded from: classes17.dex */
public final class cce implements ao50 {
    public final fi50 a;

    /* compiled from: ClipsGridBlockViewState.kt */
    public static final class a {
        public final boolean a;
        public final tlo0 b;

        public a(tlo0 tlo0Var, boolean z) {
            this.a = z;
            this.b = tlo0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            tlo0 tlo0Var = this.b;
            return hashCode + (tlo0Var == null ? 0 : tlo0Var.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AccessibilityUiState(isFocused=");
            sb.append(this.a);
            sb.append(", accessibilityDescription=");
            return bt.a(sb, this.b, ')');
        }
    }

    /* compiled from: ClipsGridBlockViewState.kt */
    public static final class b {
        public final fi5 a;
        public final fi5 b;
        public final fi5 c;
        public final boolean d;
        public final boolean e;

        public b(fi5 fi5Var, fi5 fi5Var2, fi5 fi5Var3, boolean z, boolean z2) {
            this.a = fi5Var;
            this.b = fi5Var2;
            this.c = fi5Var3;
            this.d = z;
            this.e = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e;
        }

        public final int hashCode() {
            fi5 fi5Var = this.a;
            int hashCode = (fi5Var == null ? 0 : fi5Var.hashCode()) * 31;
            fi5 fi5Var2 = this.b;
            int hashCode2 = (hashCode + (fi5Var2 == null ? 0 : fi5Var2.hashCode())) * 31;
            fi5 fi5Var3 = this.c;
            return Boolean.hashCode(this.e) + qoy.b((hashCode2 + (fi5Var3 != null ? fi5Var3.hashCode() : 0)) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AutoPlayUiState(currentAutoPlay=");
            sb.append(this.a);
            sb.append(", previousAutoPlay=");
            sb.append(this.b);
            sb.append(", transitioningAutoPlay=");
            sb.append(this.c);
            sb.append(", isBlockFocused=");
            sb.append(this.d);
            sb.append(", isFullscreenTransition=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: ClipsGridBlockViewState.kt */
    public static final class c {
        public final ArrayList a;

        /* compiled from: ClipsGridBlockViewState.kt */
        public static final class a {
            public final SdkImages a;
            public final boolean b;
            public final vae c;
            public final boolean d;
            public final tlo0 e;

            public a(SdkImages sdkImages, boolean z, vae vaeVar, boolean z2, tlo0 tlo0Var) {
                this.a = sdkImages;
                this.b = z;
                this.c = vaeVar;
                this.d = z2;
                this.e = tlo0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c) && this.d == aVar.d && epx.f(this.e, aVar.e);
            }

            public final int hashCode() {
                SdkImages sdkImages = this.a;
                int b = qoy.b((sdkImages == null ? 0 : sdkImages.hashCode()) * 31, 31, this.b);
                vae vaeVar = this.c;
                int b2 = qoy.b((b + (vaeVar == null ? 0 : vaeVar.hashCode())) * 31, 31, this.d);
                tlo0 tlo0Var = this.e;
                return b2 + (tlo0Var != null ? tlo0Var.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ClipItemViewState(previewImage=");
                sb.append(this.a);
                sb.append(", isPreviewVisible=");
                sb.append(this.b);
                sb.append(", badge=");
                sb.append(this.c);
                sb.append(", isInTransition=");
                sb.append(this.d);
                sb.append(", accessibilityDescription=");
                return bt.a(sb, this.e, ')');
            }
        }

        public c(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("ClipItemsUiState(clipItems="), this.a);
        }
    }

    /* compiled from: ClipsGridBlockViewState.kt */
    public static final class d {
        public final boolean a;

        public d(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ClipsAnimationUiState(isAnimating="), this.a, ')');
        }
    }

    /* compiled from: ClipsGridBlockViewState.kt */
    public static final class e implements fm50<ybe.a> {
        public final yzt0<c> a;
        public final yzt0<f> b;
        public final yzt0<a> c;
        public final yzt0<g> d;
        public final yzt0<d> e;
        public final yzt0<b> f;

        public e(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
            this.f = h0u0Var6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && epx.f(this.d, eVar.d) && epx.f(this.e, eVar.e) && epx.f(this.f, eVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(clipItemsUiState=");
            sb.append(this.a);
            sb.append(", otherClipsButtonUiState=");
            sb.append(this.b);
            sb.append(", accessibilityUiState=");
            sb.append(this.c);
            sb.append(", trackingDataUiState=");
            sb.append(this.d);
            sb.append(", animationUiState=");
            sb.append(this.e);
            sb.append(", autoPlayUiState=");
            return tr.c(sb, this.f, ')');
        }
    }

    /* compiled from: ClipsGridBlockViewState.kt */
    public interface f {

        /* compiled from: ClipsGridBlockViewState.kt */
        public static final class a implements f {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 746355771;
            }

            public final String toString() {
                return "Hidden";
            }
        }

        /* compiled from: ClipsGridBlockViewState.kt */
        public static final class b implements f {
            public final tlo0.f a;
            public final boolean b;

            public b(tlo0.f fVar, boolean z) {
                this.a = fVar;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a.equals(bVar.a) && this.b == bVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Integer.hashCode(this.a.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Visible(title=");
                sb.append(this.a);
                sb.append(", isLoading=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }
    }

    /* compiled from: ClipsGridBlockViewState.kt */
    public static final class g {
        public final ArrayList a;
        public final boolean b;

        /* compiled from: ClipsGridBlockViewState.kt */
        public static final class a {
            public final kih0 a;
            public final oi5 b;

            public a(kih0 kih0Var, oi5 oi5Var) {
                this.a = kih0Var;
                this.b = oi5Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "AutoPlayWithTrackingData(autoPlay=" + this.a + ", autoPlayTrackingData=" + this.b + ')';
            }
        }

        public g(ArrayList arrayList, boolean z) {
            this.a = arrayList;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a.equals(gVar.a) && this.b == gVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TrackingDataUiState(autoPlayItems=");
            sb.append(this.a);
            sb.append(", isAnyClipInTransitionState=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    public cce(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
