package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.Collection;

/* loaded from: classes10.dex */
public final class xc0 extends Handler {
    public final /* synthetic */ zc0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc0(zc0 zc0Var, Looper looper) {
        super(looper);
        this.a = zc0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.a.a(obj, obj2);
            return;
        }
        zc0 zc0Var = this.a;
        if (obj == zc0Var.x) {
            if (zc0Var.o == 2 || zc0Var.e()) {
                zc0Var.x = null;
                if (obj2 instanceof Exception) {
                    ((ed0) zc0Var.c).a((Exception) obj2, false);
                    return;
                }
                try {
                    zc0Var.b.c((byte[]) obj2);
                    ed0 ed0Var = (ed0) zc0Var.c;
                    ed0Var.b = null;
                    s51 a = s51.a((Collection) ed0Var.a);
                    ed0Var.a.clear();
                    p51 listIterator = a.listIterator(0);
                    while (listIterator.hasNext()) {
                        zc0 zc0Var2 = (zc0) listIterator.next();
                        if (zc0Var2.f()) {
                            zc0Var2.a(true);
                        }
                    }
                } catch (Exception e) {
                    ((ed0) zc0Var.c).a(e, true);
                }
            }
        }
    }
}
