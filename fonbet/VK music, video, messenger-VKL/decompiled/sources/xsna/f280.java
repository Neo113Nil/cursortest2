package xsna;

import com.vk.im.engine.models.ProfilesInfo;

/* compiled from: OnBotCallbackReceivedEvent.kt */
/* loaded from: classes2.dex */
public final class f280 extends sxp {
    public final long b;
    public final long c;
    public final z28 d;
    public final ProfilesInfo e;

    public f280(long j, long j2, z28 z28Var, ProfilesInfo profilesInfo) {
        this.b = j;
        this.c = j2;
        this.d = z28Var;
        this.e = profilesInfo;
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f280)) {
            return false;
        }
        f280 f280Var = (f280) obj;
        return this.b == f280Var.b && this.c == f280Var.c && epx.f(this.d, f280Var.d) && epx.f(this.e, f280Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + bh10.a(Long.hashCode(this.b) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnBotCallbackReceivedEvent(dialogId=");
        sb.append(this.b);
        sb.append(", botOwnerId=");
        sb.append(this.c);
        sb.append(", callbackAction=");
        sb.append(this.d);
        sb.append(", profilesInfo=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.c(sb, this.e, ')');
    }
}
