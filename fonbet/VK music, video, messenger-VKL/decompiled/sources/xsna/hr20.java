package xsna;

import com.vk.donut.video.api.di.DonutVideoComponent;

/* compiled from: MiniPlayerView2WrapperDeps.kt */
/* loaded from: classes7.dex */
public final class hr20 {
    public final com.vk.video.kidsprofile.restricteduseractions.a a;
    public final v3t0 b;
    public final zet0 c;
    public final DonutVideoComponent d;

    public hr20(com.vk.video.kidsprofile.restricteduseractions.a aVar, v3t0 v3t0Var, zet0 zet0Var, DonutVideoComponent donutVideoComponent) {
        this.a = aVar;
        this.b = v3t0Var;
        this.c = zet0Var;
        this.d = donutVideoComponent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr20)) {
            return false;
        }
        hr20 hr20Var = (hr20) obj;
        return epx.f(this.a, hr20Var.a) && epx.f(this.b, hr20Var.b) && epx.f(this.c, hr20Var.c) && epx.f(this.d, hr20Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MiniPlayerView2WrapperDeps(restrictedUserActionsRepository=" + this.a + ", playbackSpeedRepository=" + this.b + ", videoSeekEventsTracker=" + this.c + ", videoDonutComponent=" + this.d + ')';
    }
}
