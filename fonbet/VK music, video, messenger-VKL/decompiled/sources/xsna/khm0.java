package xsna;

import com.vk.dto.stories.model.StoryEntry;
import java.util.ArrayList;

/* compiled from: StoryStatisticsViewState.kt */
/* loaded from: classes6.dex */
public final class khm0 implements ao50 {
    public final fi50 a;
    public final fi50 b;

    /* compiled from: StoryStatisticsViewState.kt */
    public static final class a implements fm50<chm0> {
        public final yzt0<StoryEntry> a;
        public final yzt0<Integer> b;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
        }
    }

    /* compiled from: StoryStatisticsViewState.kt */
    public static final class b {
        public final int a;
        public final String b;

        public b(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PreviewCarouselState(currentIndex=");
            sb.append(this.a);
            sb.append(", blurUrl=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: StoryStatisticsViewState.kt */
    public static final class c {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public c(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PreviewContentVisibility(isVisible=");
            sb.append(this.a);
            sb.append(", isPrivacyAvailable=");
            sb.append(this.b);
            sb.append(", isPrivacyVisible=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: StoryStatisticsViewState.kt */
    public static final class d {
        public final ArrayList a;

        public d(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a.equals(((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("PreviewItemsState(previewItems="), this.a);
        }
    }

    /* compiled from: StoryStatisticsViewState.kt */
    public static final class e {
        public final boolean a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public e(boolean z, int i, int i2, int i3, int i4) {
            this.a = z;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.d == eVar.d && this.e == eVar.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + shy.a(this.d, shy.a(this.c, shy.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PrivacyState(isAvailable=");
            sb.append(this.a);
            sb.append(", iconResId=");
            sb.append(this.b);
            sb.append(", iconColorAttrResId=");
            sb.append(this.c);
            sb.append(", titleResId=");
            sb.append(this.d);
            sb.append(", titleColorAttrResId=");
            return vu5.b(sb, this.e, ')');
        }
    }

    /* compiled from: StoryStatisticsViewState.kt */
    public static final class f implements fm50<chm0> {
        public final yzt0<c> a;
        public final yzt0<Boolean> b;
        public final yzt0<d> c;
        public final yzt0<b> d;
        public final yzt0<e> e;

        public f(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
        }
    }

    public khm0(fi50 fi50Var, fi50 fi50Var2) {
        this.a = fi50Var;
        this.b = fi50Var2;
    }
}
