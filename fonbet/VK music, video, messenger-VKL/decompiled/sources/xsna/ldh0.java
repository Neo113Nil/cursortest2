package xsna;

import com.vk.video.ui.upload.impl.videoviewer.presentation.compose.screen.IconViewState;

/* compiled from: ScreenViewState.kt */
/* loaded from: classes7.dex */
public final class ldh0 implements lm50 {
    public final xk80 b;
    public final IconViewState c;
    public final IconViewState d;
    public final boolean e;
    public final long f;
    public final long g;

    public ldh0(xk80 xk80Var, IconViewState iconViewState, IconViewState iconViewState2, boolean z, long j, long j2) {
        this.b = xk80Var;
        this.c = iconViewState;
        this.d = iconViewState2;
        this.e = z;
        this.f = j;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldh0)) {
            return false;
        }
        ldh0 ldh0Var = (ldh0) obj;
        return epx.f(this.b, ldh0Var.b) && this.c == ldh0Var.c && this.d == ldh0Var.d && this.e == ldh0Var.e && this.f == ldh0Var.f && this.g == ldh0Var.g;
    }

    public final int hashCode() {
        xk80 xk80Var = this.b;
        int hashCode = (xk80Var == null ? 0 : xk80Var.hashCode()) * 31;
        IconViewState iconViewState = this.c;
        int hashCode2 = (hashCode + (iconViewState == null ? 0 : iconViewState.hashCode())) * 31;
        IconViewState iconViewState2 = this.d;
        return Long.hashCode(this.g) + bh10.a(qoy.b((hashCode2 + (iconViewState2 != null ? iconViewState2.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenViewState(player=");
        sb.append(this.b);
        sb.append(", iconLeft=");
        sb.append(this.c);
        sb.append(", iconRight=");
        sb.append(this.d);
        sb.append(", isPlayButtonVisible=");
        sb.append(this.e);
        sb.append(", durationMs=");
        sb.append(this.f);
        sb.append(", currentPos=");
        return vu5.a(')', this.g, sb);
    }
}
