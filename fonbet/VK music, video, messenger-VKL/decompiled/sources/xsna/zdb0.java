package xsna;

import com.vk.video.playlist.playlistscreen.ui.entity.NotificationsState;

/* compiled from: PlaylistScreenViewState.kt */
/* loaded from: classes6.dex */
public final class zdb0 implements lm50 {
    public final x3g b;
    public final ttk0<sga> c;
    public final NotificationsState d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public zdb0(x3g x3gVar, ttk0 ttk0Var, NotificationsState notificationsState, boolean z, boolean z2, boolean z3) {
        this.b = x3gVar;
        this.c = ttk0Var;
        this.d = notificationsState;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdb0)) {
            return false;
        }
        zdb0 zdb0Var = (zdb0) obj;
        return this.b.equals(zdb0Var.b) && this.c.equals(zdb0Var.c) && this.d == zdb0Var.d && this.e == zdb0Var.e && this.f == zdb0Var.f && this.g == zdb0Var.g;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        NotificationsState notificationsState = this.d;
        return Boolean.hashCode(false) + qoy.b(qoy.b(qoy.b((hashCode + (notificationsState == null ? 0 : notificationsState.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistScreenViewState(collapsableHeaderViewState=");
        sb.append(this.b);
        sb.append(", catalogSectionState=");
        sb.append(this.c);
        sb.append(", notificationsState=");
        sb.append(this.d);
        sb.append(", isUnsubscribeBottomSheetVisible=");
        sb.append(this.e);
        sb.append(", isPtrRefreshing=");
        sb.append(this.f);
        sb.append(", isEmptyState=");
        return n23.b(sb, this.g, ", isLegoTheme=false)");
    }
}
