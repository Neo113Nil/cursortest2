package yads;

import android.os.Looper;
import com.huawei.hms.support.api.entity.auth.AuthCode;

/* loaded from: classes10.dex */
public final class rk0 implements tk0 {
    @Override // yads.tk0
    public final void a(Looper looper, zf2 zf2Var) {
    }

    @Override // yads.tk0
    public final nk0 b(pk0 pk0Var, nx0 nx0Var) {
        if (nx0Var.p == null) {
            return null;
        }
        return new tm0(new mk0(new pb3(), AuthCode.StatusCode.WAITING_CONNECT));
    }

    @Override // yads.tk0
    public final int a(nx0 nx0Var) {
        return nx0Var.p != null ? 1 : 0;
    }
}
