package defpackage;

import android.graphics.PointF;

/* loaded from: classes7.dex */
public final class m5v {
    public final PointF a;

    public m5v(PointF pointF) {
        this.a = pointF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m5v) && jl40.l(this.a, ((m5v) obj).a);
    }

    public final int hashCode() {
        PointF pointF = this.a;
        return (pointF == null ? 0 : pointF.hashCode()) * 29791;
    }

    public final String toString() {
        return "IconStyleImpl(anchor=" + this.a + ", zIndex=null, visible=null, scale=null)";
    }
}
