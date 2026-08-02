package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.profile.core.tabs.ui.fab.ProfileFabState;

/* compiled from: ProfileFabView.kt */
/* loaded from: classes5.dex */
public final class etk0 {
    public final ProfileFabState a;
    public final ProfileFabState b;
    public final ProfileFabState c;
    public final float d;
    public final boolean e;
    public final float f;
    public final boolean g;
    public final boolean h;

    public etk0() {
        this(0);
    }

    public static etk0 a(etk0 etk0Var, ProfileFabState profileFabState, ProfileFabState profileFabState2, ProfileFabState profileFabState3, float f, boolean z, float f2, boolean z2, int i) {
        if ((i & 1) != 0) {
            profileFabState = etk0Var.a;
        }
        ProfileFabState profileFabState4 = profileFabState;
        if ((i & 2) != 0) {
            profileFabState2 = etk0Var.b;
        }
        ProfileFabState profileFabState5 = profileFabState2;
        if ((i & 4) != 0) {
            profileFabState3 = etk0Var.c;
        }
        ProfileFabState profileFabState6 = profileFabState3;
        if ((i & 8) != 0) {
            f = etk0Var.d;
        }
        float f3 = f;
        if ((i & 16) != 0) {
            z = etk0Var.e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            f2 = etk0Var.f;
        }
        float f4 = f2;
        if ((i & 64) != 0) {
            z2 = etk0Var.g;
        }
        etk0Var.getClass();
        return new etk0(profileFabState4, profileFabState5, profileFabState6, f3, z3, f4, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etk0)) {
            return false;
        }
        etk0 etk0Var = (etk0) obj;
        return epx.f(this.a, etk0Var.a) && epx.f(this.b, etk0Var.b) && epx.f(this.c, etk0Var.c) && Float.compare(this.d, etk0Var.d) == 0 && this.e == etk0Var.e && Float.compare(this.f, etk0Var.f) == 0 && this.g == etk0Var.g;
    }

    public final int hashCode() {
        ProfileFabState profileFabState = this.a;
        int hashCode = (profileFabState == null ? 0 : profileFabState.hashCode()) * 31;
        ProfileFabState profileFabState2 = this.b;
        int hashCode2 = (hashCode + (profileFabState2 == null ? 0 : profileFabState2.hashCode())) * 31;
        ProfileFabState profileFabState3 = this.c;
        return Boolean.hashCode(this.g) + io.reactivex.rxjava3.subjects.b.a(this.f, qoy.b(io.reactivex.rxjava3.subjects.b.a(this.d, (hashCode2 + (profileFabState3 != null ? profileFabState3.hashCode() : 0)) * 31, 31), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(currentTab=");
        sb.append(this.a);
        sb.append(", nextTab=");
        sb.append(this.b);
        sb.append(", forcedTab=");
        sb.append(this.c);
        sb.append(", offset=");
        sb.append(this.d);
        sb.append(", isFullyScrolled=");
        sb.append(this.e);
        sb.append(", percentScrolled=");
        sb.append(this.f);
        sb.append(", isScrollingTop=");
        return defpackage.q0.a(sb, this.g, ')');
    }

    public /* synthetic */ etk0(int i) {
        this(null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
    }

    public etk0(ProfileFabState profileFabState, ProfileFabState profileFabState2, ProfileFabState profileFabState3, float f, boolean z, float f2, boolean z2) {
        this.a = profileFabState;
        this.b = profileFabState2;
        this.c = profileFabState3;
        this.d = f;
        this.e = z;
        this.f = f2;
        this.g = z2;
        this.h = (!z || z2) && f2 > 0.4f;
    }
}
