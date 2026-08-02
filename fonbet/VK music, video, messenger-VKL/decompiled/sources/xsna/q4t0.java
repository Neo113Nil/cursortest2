package xsna;

import com.vk.catalog2.common.ui.holders.video.playlist.cover.VideoPlaylistCoverComposeVh;

/* compiled from: VideoPlaylistCoverView.kt */
/* loaded from: classes16.dex */
public final class q4t0 {
    public final float a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final izs<com.vk.catalog2.common.ui.holders.video.playlist.cover.a, s3q0> k;

    /* JADX WARN: Multi-variable type inference failed */
    public q4t0(float f, String str, boolean z, boolean z2, String str2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, izs<? super com.vk.catalog2.common.ui.holders.video.playlist.cover.a, s3q0> izsVar) {
        this.a = f;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = str2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = z7;
        this.k = izsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static q4t0 a(q4t0 q4t0Var, float f, String str, boolean z, boolean z2, String str2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, VideoPlaylistCoverComposeVh.a aVar, int i) {
        if ((i & 1) != 0) {
            f = q4t0Var.a;
        }
        float f2 = f;
        if ((i & 2) != 0) {
            str = q4t0Var.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            z = q4t0Var.c;
        }
        boolean z8 = z;
        boolean z9 = (i & 8) != 0 ? q4t0Var.d : z2;
        String str4 = (i & 16) != 0 ? q4t0Var.e : str2;
        boolean z10 = (i & 32) != 0 ? q4t0Var.f : z3;
        boolean z11 = (i & 64) != 0 ? q4t0Var.g : z4;
        boolean z12 = (i & 128) != 0 ? q4t0Var.h : z5;
        boolean z13 = (i & 256) != 0 ? q4t0Var.i : z6;
        boolean z14 = (i & 512) != 0 ? q4t0Var.j : z7;
        izs izsVar = (i & 1024) != 0 ? q4t0Var.k : aVar;
        q4t0Var.getClass();
        return new q4t0(f2, str3, z8, z9, str4, z10, z11, z12, z13, z14, izsVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4t0)) {
            return false;
        }
        q4t0 q4t0Var = (q4t0) obj;
        return Float.compare(this.a, q4t0Var.a) == 0 && epx.f(this.b, q4t0Var.b) && this.c == q4t0Var.c && this.d == q4t0Var.d && epx.f(this.e, q4t0Var.e) && this.f == q4t0Var.f && this.g == q4t0Var.g && this.h == q4t0Var.h && this.i == q4t0Var.i && this.j == q4t0Var.j && epx.f(this.k, q4t0Var.k);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(urd0.a(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return this.k.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoPlaylistCoverState(collapseProgress=");
        sb.append(this.a);
        sb.append(", backgroundUrl=");
        sb.append(this.b);
        sb.append(", imageBlur=");
        sb.append(this.c);
        sb.append(", isVerticalImage=");
        sb.append(this.d);
        sb.append(", watchBtnText=");
        sb.append(this.e);
        sb.append(", isSubscribed=");
        sb.append(this.f);
        sb.append(", hasWatchAllBtn=");
        sb.append(this.g);
        sb.append(", hasSubscribeBtn=");
        sb.append(this.h);
        sb.append(", hasAddVideosBtn=");
        sb.append(this.i);
        sb.append(", hasShuffleBtn=");
        sb.append(this.j);
        sb.append(", onAction=");
        return up.c(sb, this.k, ')');
    }
}
