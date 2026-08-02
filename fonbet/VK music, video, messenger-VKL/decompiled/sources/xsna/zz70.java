package xsna;

import com.vk.profile.core.onboarding.model.ContentHintOnboardingResource;

/* compiled from: UserProfileState.kt */
/* loaded from: classes5.dex */
public final class zz70 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final ContentHintOnboardingResource d;

    public zz70() {
        this(0);
    }

    public static zz70 a(zz70 zz70Var, int i) {
        boolean z = (i & 1) != 0 ? zz70Var.a : false;
        boolean z2 = (i & 2) != 0 ? zz70Var.b : false;
        boolean z3 = (i & 4) != 0 ? zz70Var.c : false;
        ContentHintOnboardingResource contentHintOnboardingResource = (i & 8) != 0 ? zz70Var.d : null;
        zz70Var.getClass();
        return new zz70(z, z2, z3, contentHintOnboardingResource);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz70)) {
            return false;
        }
        zz70 zz70Var = (zz70) obj;
        return this.a == zz70Var.a && this.b == zz70Var.b && this.c == zz70Var.c && epx.f(this.d, zz70Var.d);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        ContentHintOnboardingResource contentHintOnboardingResource = this.d;
        return b + (contentHintOnboardingResource == null ? 0 : contentHintOnboardingResource.hashCode());
    }

    public final String toString() {
        return "OldUserHintBlock(isVisible=" + this.a + ", isHintsLoaded=" + this.b + ", canShowBanner=" + this.c + ", videoHint=" + this.d + ')';
    }

    public /* synthetic */ zz70(int i) {
        this(false, false, false, null);
    }

    public zz70(boolean z, boolean z2, boolean z3, ContentHintOnboardingResource contentHintOnboardingResource) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = contentHintOnboardingResource;
    }
}
