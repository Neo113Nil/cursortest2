package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;

/* compiled from: CommunityInteractorImpl.kt */
/* loaded from: classes5.dex */
public final class v4h implements u4h {
    public final gxh a;
    public final b25 b;

    public v4h(gxh gxhVar, b25 b25Var) {
        this.a = gxhVar;
        this.b = b25Var;
    }

    @Override // xsna.u4h
    public final boolean a(UserId userId) {
        long j = userId.b;
        if (j != 0) {
            if (j > 0) {
                return this.b.a(userId);
            }
            Group C0 = this.a.C0(fkq0.e(userId));
            if (C0 == null || !C0.d()) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.u4h
    public final boolean d(UserId userId) {
        long j = userId.b;
        if (j != 0) {
            if (j > 0) {
                return this.b.a(userId);
            }
            Group C0 = this.a.C0(fkq0.e(userId));
            if (C0 == null || !C0.i) {
                return false;
            }
        }
        return true;
    }
}
