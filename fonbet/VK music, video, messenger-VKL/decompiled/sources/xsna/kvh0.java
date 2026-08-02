package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: SearchHistoryRepoComponent.kt */
/* loaded from: classes3.dex */
public class kvh0 extends uaj0 {
    public final UserId a;
    public final uuh0 b;

    public kvh0(UserId userId, uuh0 uuh0Var) {
        this.a = userId;
        this.b = uuh0Var;
    }

    @Override // xsna.pwj0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kvh0 kvh0Var = (kvh0) obj;
        return epx.f(this.a, kvh0Var.a) && epx.f(this.b, kvh0Var.b);
    }

    @Override // xsna.pwj0
    public final int hashCode() {
        return this.b.hashCode() + bh10.a(super.hashCode() * 31, 31, this.a.b);
    }
}
