package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class gsb implements ioz {
    public final long a;
    public boolean b;
    public t6f0 d;
    public long e;
    public ArrayList c = new ArrayList();
    public final esb f = new esb(0, this);

    public gsb(long j) {
        this.a = j;
    }

    @Override // defpackage.ioz
    public final void a(t6f0 t6f0Var) {
        if (t6f0Var != null && this.c.size() > 0) {
            t6f0Var.b(this.c);
            this.c = new ArrayList();
        }
        this.d = t6f0Var;
    }

    @Override // defpackage.ioz
    public final void start() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.e = SystemClock.uptimeMillis();
        this.c = new ArrayList();
        fsb.a.postFrameCallback(this.f);
    }

    @Override // defpackage.ioz
    public final void stop() {
        if (this.b) {
            this.b = false;
            fsb.a.removeFrameCallback(this.f);
        }
    }
}
