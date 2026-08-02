package xsna;

import org.json.JSONObject;

/* compiled from: ClipsFeedNativeTransitionConfig.kt */
/* loaded from: classes16.dex */
public interface f8e {

    /* compiled from: ClipsFeedNativeTransitionConfig.kt */
    public static final class a {
        public static f8e a(JSONObject jSONObject, boolean z) {
            if (z) {
                return new c(jSONObject != null ? jSONObject.optBoolean("use_transitiong_group", true) : true, jSONObject == null ? false : jSONObject.optBoolean("stats_from_profile_feed", false), jSONObject == null ? false : jSONObject.optBoolean("stats_from_profile_clips", false), jSONObject == null ? false : jSONObject.optBoolean("no_bottom_navigation", false), jSONObject != null ? jSONObject.optBoolean("deep_stack_optimizations", false) : false);
            }
            return b.a;
        }
    }

    /* compiled from: ClipsFeedNativeTransitionConfig.kt */
    public static final class b implements f8e {
        public static final b a = new b();

        @Override // xsna.f8e
        public final boolean a() {
            return false;
        }

        @Override // xsna.f8e
        public final boolean b() {
            return false;
        }

        @Override // xsna.f8e
        public final boolean c() {
            return false;
        }

        @Override // xsna.f8e
        public final boolean d() {
            return false;
        }

        @Override // xsna.f8e
        public final boolean e() {
            return false;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1360675951;
        }

        @Override // xsna.f8e
        public final boolean isEnabled() {
            return false;
        }

        public final String toString() {
            return "Disabled";
        }
    }

    /* compiled from: ClipsFeedNativeTransitionConfig.kt */
    public static final class c implements f8e {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        public c(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = z5;
        }

        @Override // xsna.f8e
        public final boolean a() {
            return this.e;
        }

        @Override // xsna.f8e
        public final boolean b() {
            return this.c;
        }

        @Override // xsna.f8e
        public final boolean c() {
            return this.d;
        }

        @Override // xsna.f8e
        public final boolean d() {
            return this.b;
        }

        @Override // xsna.f8e
        public final boolean e() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        @Override // xsna.f8e
        public final boolean isEnabled() {
            return true;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Enabled(animateAsTransitionGroup=");
            sb.append(this.a);
            sb.append(", clipsStatsFromProfileFeedEnabled=");
            sb.append(this.b);
            sb.append(", clipsStatsFromProfileClipsEnabled=");
            sb.append(this.c);
            sb.append(", noBottomNavigation=");
            sb.append(this.d);
            sb.append(", deepStackOptimizations=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    boolean a();

    boolean b();

    boolean c();

    boolean d();

    boolean e();

    boolean isEnabled();
}
