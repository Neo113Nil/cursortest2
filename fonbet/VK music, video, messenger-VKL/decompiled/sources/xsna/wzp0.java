package xsna;

import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.libvideo.ui.video2.ScreenState;
import one.video.transform.TransformController;

/* compiled from: UiParams.kt */
/* loaded from: classes3.dex */
public final class wzp0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final ScreenState f;
    public final TransformController.ScaleType g;
    public final SubtitlesConfigurationMode h;
    public final boolean i;

    public wzp0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ScreenState screenState, TransformController.ScaleType scaleType, SubtitlesConfigurationMode subtitlesConfigurationMode, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = screenState;
        this.g = scaleType;
        this.h = subtitlesConfigurationMode;
        this.i = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzp0)) {
            return false;
        }
        wzp0 wzp0Var = (wzp0) obj;
        return this.a == wzp0Var.a && this.b == wzp0Var.b && this.c == wzp0Var.c && this.d == wzp0Var.d && this.e == wzp0Var.e && this.f == wzp0Var.f && this.g == wzp0Var.g && this.h == wzp0Var.h && this.i == wzp0Var.i;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, true), 31, false);
        ScreenState screenState = this.f;
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + ((this.g.hashCode() + ((b + (screenState != null ? screenState.hashCode() : 0)) * 31)) * 961)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UiParams(isNotInterested=");
        sb.append(this.a);
        sb.append(", isShowSubscribe=");
        sb.append(this.b);
        sb.append(", isShowPlaylist=");
        sb.append(this.c);
        sb.append(", isShowFeedbackButton=");
        sb.append(this.d);
        sb.append(", isAutoScrollInVideoFeed=");
        sb.append(this.e);
        sb.append(", isBottomVideoControlsBarVisible=true, isExtendSeekBarOpened=false, state=");
        sb.append(this.f);
        sb.append(", scaleType=");
        sb.append(this.g);
        sb.append(", smartCastConnectionState=null, subtitlesConfigurationMode=");
        sb.append(this.h);
        sb.append(", isFullscreenLocked=");
        return defpackage.q0.a(sb, this.i, ')');
    }
}
