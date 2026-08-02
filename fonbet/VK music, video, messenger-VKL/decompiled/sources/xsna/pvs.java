package xsna;

import com.vk.fullscreenbanners.api.dto.FullScreenBanner;

/* compiled from: FullScreenBannerParams.kt */
/* loaded from: classes16.dex */
public final class pvs {
    public final FullScreenBanner a;
    public final fnu0 b;
    public final op5 c;
    public final lwu0 d;

    public pvs(FullScreenBanner fullScreenBanner, fnu0 fnu0Var, op5 op5Var, lwu0 lwu0Var) {
        this.a = fullScreenBanner;
        this.b = fnu0Var;
        this.c = op5Var;
        this.d = lwu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvs)) {
            return false;
        }
        pvs pvsVar = (pvs) obj;
        return epx.f(this.a, pvsVar.a) && this.b.equals(pvsVar.b) && this.c.equals(pvsVar.c) && this.d.equals(pvsVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "FullScreenBannerParams(fullScreenBanner=" + this.a + ", consumeManager=" + this.b + ", bus=" + this.c + ", orientationLocker=" + this.d + ')';
    }
}
