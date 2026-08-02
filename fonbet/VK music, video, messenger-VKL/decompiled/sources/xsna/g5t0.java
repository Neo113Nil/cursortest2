package xsna;

import com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.VideoPlaylistToolbarComposeVh;

/* compiled from: VideoPlaylistToolbarView.kt */
/* loaded from: classes16.dex */
public final class g5t0 {
    public final String a;
    public final float b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final izs<com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.a, s3q0> f;

    /* JADX WARN: Multi-variable type inference failed */
    public g5t0(String str, float f, boolean z, boolean z2, boolean z3, izs<? super com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.a, s3q0> izsVar) {
        this.a = str;
        this.b = f;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = izsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static g5t0 a(g5t0 g5t0Var, String str, float f, boolean z, boolean z2, boolean z3, VideoPlaylistToolbarComposeVh.b bVar, int i) {
        if ((i & 1) != 0) {
            str = g5t0Var.a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            f = g5t0Var.b;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            z = g5t0Var.c;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = g5t0Var.d;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = g5t0Var.e;
        }
        boolean z6 = z3;
        izs izsVar = bVar;
        if ((i & 32) != 0) {
            izsVar = g5t0Var.f;
        }
        g5t0Var.getClass();
        return new g5t0(str2, f2, z4, z5, z6, izsVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5t0)) {
            return false;
        }
        g5t0 g5t0Var = (g5t0) obj;
        return epx.f(this.a, g5t0Var.a) && Float.compare(this.b, g5t0Var.b) == 0 && this.c == g5t0Var.c && this.d == g5t0Var.d && this.e == g5t0Var.e && epx.f(this.f, g5t0Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        return this.f.hashCode() + qoy.b(qoy.b(qoy.b(io.reactivex.rxjava3.subjects.b.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoPlaylistToolbarState(title=");
        sb.append(this.a);
        sb.append(", collapseProgress=");
        sb.append(this.b);
        sb.append(", hasEditBtn=");
        sb.append(this.c);
        sb.append(", hasSubscribeBtn=");
        sb.append(this.d);
        sb.append(", isSubscribed=");
        sb.append(this.e);
        sb.append(", onAction=");
        return up.c(sb, this.f, ')');
    }
}
