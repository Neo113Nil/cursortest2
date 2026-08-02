package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: AuthBridgeAdapter.kt */
@vby
/* loaded from: classes17.dex */
public final class e25 implements jih0 {
    public final b25 a;

    public /* synthetic */ e25(b25 b25Var) {
        this.a = b25Var;
    }

    @Override // xsna.jih0
    public final boolean b() {
        return this.a.b();
    }

    @Override // xsna.jih0
    public final UserId c() {
        return this.a.c();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e25) {
            return epx.f(this.a, ((e25) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AuthBridgeAdapter(original=" + this.a + ')';
    }
}
