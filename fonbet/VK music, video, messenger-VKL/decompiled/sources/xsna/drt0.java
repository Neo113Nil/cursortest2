package xsna;

import com.vk.libvideo.ui.video2.ScreenState;

/* compiled from: VideoState.kt */
/* loaded from: classes3.dex */
public final class drt0 {
    public final com.vk.libvideo.autoplay.a a;
    public final ScreenState b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public drt0(com.vk.libvideo.autoplay.a aVar, ScreenState screenState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = aVar;
        this.b = screenState;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drt0)) {
            return false;
        }
        drt0 drt0Var = (drt0) obj;
        return this.a.equals(drt0Var.a) && this.b == drt0Var.b && this.c == drt0Var.c && this.d == drt0Var.d && this.e == drt0Var.e && this.f == drt0Var.f && this.g == drt0Var.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ScreenState screenState = this.b;
        return Boolean.hashCode(this.g) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((hashCode + (screenState == null ? 0 : screenState.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, true), 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoViewState(videoConfig=");
        sb.append(this.a);
        sb.append(", screenState=");
        sb.append(this.b);
        sb.append(", isAutoScrollInVideoFeed=");
        sb.append(this.c);
        sb.append(", isShowSubscribe=");
        sb.append(this.d);
        sb.append(", isShowPlaylist=");
        sb.append(this.e);
        sb.append(", isShowFeedbackButton=");
        sb.append(this.f);
        sb.append(", isBottomVideoControlsBarVisible=true, isExtendSeekBarOpened=false, isFullscreenLocked=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
