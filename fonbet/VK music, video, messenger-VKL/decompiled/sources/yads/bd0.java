package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class bd0 extends Handler {
    public final /* synthetic */ gd0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd0(gd0 gd0Var, Looper looper) {
        super(looper);
        this.a = gd0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null) {
            return;
        }
        Iterator it = this.a.m.iterator();
        while (it.hasNext()) {
            zc0 zc0Var = (zc0) it.next();
            if (Arrays.equals(zc0Var.u, bArr)) {
                if (message.what == 2 && zc0Var.e == 0 && zc0Var.o == 4) {
                    int i = mc3.a;
                    zc0Var.a(false);
                    return;
                }
                return;
            }
        }
    }
}
