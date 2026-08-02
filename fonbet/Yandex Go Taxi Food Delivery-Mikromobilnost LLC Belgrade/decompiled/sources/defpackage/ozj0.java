package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes10.dex */
public final class ozj0 {
    public static final Handler d = new Handler(Looper.getMainLooper());
    public final ba20 a;
    public final x920 b;
    public boolean c;

    public ozj0(x920 x920Var, ba20 ba20Var) {
        this.a = ba20Var;
        this.b = x920Var;
        d.hasMessages(0);
    }

    public static /* synthetic */ void c(ozj0 ozj0Var, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        ozj0Var.b(str, str2, null);
    }

    public final void a(Object obj) {
        if (this.c) {
            return;
        }
        this.c = true;
        d.post(new xmf0(20, this.a, obj));
    }

    public final void b(String str, String str2, Object obj) {
        if (this.c) {
            return;
        }
        this.c = true;
        d.post(new l9(this.a, str, str2, obj, 29));
    }
}
