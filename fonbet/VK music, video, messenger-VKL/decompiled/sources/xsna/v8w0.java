package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.log.L;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class v8w0 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v8w0(long j, w8w0 w8w0Var, UserId userId) {
        this.c = j;
        this.d = userId;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                long j = this.c;
                UserId userId = (UserId) this.d;
                qyg0 V0 = ((hyg0) obj).V0("UPDATE user_vmoji_files set last_access = ? where user=?");
                try {
                    V0.bindLong(1, j);
                    V0.bindLong(2, userId.b);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            default:
                y4x0 y4x0Var = (y4x0) this.d;
                L.f("VVMOpponentAvatarDelegate", "Failed to load opponent avatar by dialog id " + this.c, (Throwable) obj);
                y4x0Var.g = null;
                return s3q0.a;
        }
    }

    public /* synthetic */ v8w0(long j, y4x0 y4x0Var) {
        this.c = j;
        this.d = y4x0Var;
    }
}
