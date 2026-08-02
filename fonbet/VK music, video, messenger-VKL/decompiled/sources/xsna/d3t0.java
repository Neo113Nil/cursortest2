package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.posting.presentation.video.model.VideoPickerFilter;

/* compiled from: VideoPickerState.kt */
/* loaded from: classes5.dex */
public final class d3t0 implements km50 {
    public final UserId b;
    public final wia0<Object> c;
    public final boolean d;
    public final ewp e;
    public final boolean f;
    public final VideoPickerFilter g;

    public d3t0(UserId userId, wia0<Object> wia0Var, boolean z, ewp ewpVar, boolean z2, VideoPickerFilter videoPickerFilter) {
        this.b = userId;
        this.c = wia0Var;
        this.d = z;
        this.e = ewpVar;
        this.f = z2;
        this.g = videoPickerFilter;
    }

    public static d3t0 a(d3t0 d3t0Var, wia0 wia0Var, boolean z, ewp ewpVar, boolean z2, VideoPickerFilter videoPickerFilter, int i) {
        wia0 wia0Var2 = wia0Var;
        UserId userId = d3t0Var.b;
        if ((i & 2) != 0) {
            wia0Var2 = d3t0Var.c;
        }
        if ((i & 4) != 0) {
            z = d3t0Var.d;
        }
        if ((i & 8) != 0) {
            ewpVar = d3t0Var.e;
        }
        if ((i & 16) != 0) {
            z2 = d3t0Var.f;
        }
        if ((i & 32) != 0) {
            videoPickerFilter = d3t0Var.g;
        }
        VideoPickerFilter videoPickerFilter2 = videoPickerFilter;
        d3t0Var.getClass();
        boolean z3 = z2;
        ewp ewpVar2 = ewpVar;
        return new d3t0(userId, wia0Var2, z, ewpVar2, z3, videoPickerFilter2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3t0)) {
            return false;
        }
        d3t0 d3t0Var = (d3t0) obj;
        return epx.f(this.b, d3t0Var.b) && epx.f(this.c, d3t0Var.c) && this.d == d3t0Var.d && epx.f(this.e, d3t0Var.e) && this.f == d3t0Var.f && this.g == d3t0Var.g;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b.b) * 31;
        wia0<Object> wia0Var = this.c;
        int b = qoy.b((hashCode + (wia0Var == null ? 0 : wia0Var.hashCode())) * 31, 31, this.d);
        ewp ewpVar = this.e;
        return this.g.hashCode() + qoy.b((b + (ewpVar != null ? ewpVar.a.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        return "VideoPickerState(ownerId=" + this.b + ", videos=" + this.c + ", isLoading=" + this.d + ", errorLoading=" + this.e + ", isReloadFilter=" + this.f + ", filter=" + this.g + ')';
    }
}
