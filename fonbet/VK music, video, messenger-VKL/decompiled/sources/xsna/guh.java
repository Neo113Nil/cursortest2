package xsna;

import com.vk.community.design.compose.topbar.PassthroughThemedComposeView;

/* compiled from: CommunityProfileTopBarDependencies.kt */
/* loaded from: classes5.dex */
public final class guh {
    public final PassthroughThemedComposeView a;
    public final gzs<Boolean> b;
    public final boolean c;
    public final boolean d;
    public final y89 e;

    public guh(PassthroughThemedComposeView passthroughThemedComposeView, gzs gzsVar, boolean z, boolean z2, y89 y89Var) {
        this.a = passthroughThemedComposeView;
        this.b = gzsVar;
        this.c = z;
        this.d = z2;
        this.e = y89Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof guh)) {
            return false;
        }
        guh guhVar = (guh) obj;
        return this.a.equals(guhVar.a) && epx.f(this.b, guhVar.b) && this.c == guhVar.c && this.d == guhVar.d && this.e.equals(guhVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + qoy.b(qoy.b(sf3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "CommunityProfileTopBarDependencies(toolbarView=" + this.a + ", isTabRoot=" + this.b + ", useDefaultNativeNavigation=" + this.c + ", isSearchInsideCommunitiesEnabled=" + this.d + ", onAction=" + this.e + ')';
    }
}
