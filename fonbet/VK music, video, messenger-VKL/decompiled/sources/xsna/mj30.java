package xsna;

import com.vk.im.engine.models.ProfilesInfo;

/* compiled from: MsgHistoryExt.kt */
/* loaded from: classes2.dex */
public final class mj30 {
    public final gj30 a;
    public final ProfilesInfo b;

    public mj30(gj30 gj30Var, ProfilesInfo profilesInfo) {
        this.a = gj30Var;
        this.b = profilesInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj30)) {
            return false;
        }
        mj30 mj30Var = (mj30) obj;
        return epx.f(this.a, mj30Var.a) && epx.f(this.b, mj30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgHistoryExt(history=");
        sb.append(this.a);
        sb.append(", profiles=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.c(sb, this.b, ')');
    }
}
