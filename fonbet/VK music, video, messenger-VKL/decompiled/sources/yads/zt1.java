package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class zt1 extends ro implements Handler.Callback {
    public final wt1 n;
    public final yt1 o;
    public final Handler p;
    public final xt1 q;
    public h03 r;
    public boolean s;
    public boolean t;
    public long u;
    public long v;
    public ut1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt1(xn0 xn0Var, Looper looper) {
        super(5);
        vt1 vt1Var = wt1.a;
        this.o = (yt1) ni.a(xn0Var);
        this.p = looper == null ? null : mc3.a(looper, (Handler.Callback) this);
        this.n = (wt1) ni.a(vt1Var);
        this.q = new xt1();
        this.v = C.TIME_UNSET;
    }

    public final void a(ut1 ut1Var, ArrayList arrayList) {
        int i = 0;
        while (true) {
            tt1[] tt1VarArr = ut1Var.b;
            if (i >= tt1VarArr.length) {
                return;
            }
            nx0 a = tt1VarArr[i].a();
            if (a != null) {
                ((vt1) this.n).getClass();
                String str = a.m;
                if (MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
                    h03 a2 = ((vt1) this.n).a(a);
                    byte[] b = ut1Var.b[i].b();
                    b.getClass();
                    this.q.b();
                    this.q.c(b.length);
                    this.q.d.put(b);
                    this.q.c();
                    ut1 a3 = a2.a(this.q);
                    if (a3 != null) {
                        a(a3, arrayList);
                    }
                    i++;
                }
            }
            arrayList.add(ut1Var.b[i]);
            i++;
        }
    }

    @Override // yads.ro
    public final String d() {
        return "MetadataRenderer";
    }

    @Override // yads.ro
    public final boolean f() {
        return this.t;
    }

    @Override // yads.ro
    public final boolean g() {
        return true;
    }

    @Override // yads.ro
    public final void h() {
        this.w = null;
        this.v = C.TIME_UNSET;
        this.r = null;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        ((xn0) this.o).a((ut1) message.obj);
        return true;
    }

    @Override // yads.ro
    public final void a(long j, boolean z) {
        this.w = null;
        this.v = C.TIME_UNSET;
        this.s = false;
        this.t = false;
    }

    @Override // yads.ro
    public final void a(nx0[] nx0VarArr, long j, long j2) {
        this.r = ((vt1) this.n).a(nx0VarArr[0]);
    }

    @Override // yads.ro
    public final void a(long j, long j2) {
        boolean z;
        do {
            z = false;
            if (!this.s && this.w == null) {
                this.q.b();
                ox0 ox0Var = this.c;
                ox0Var.a = null;
                ox0Var.b = null;
                int a = a(ox0Var, this.q, 0);
                if (a == -4) {
                    if (this.q.b(4)) {
                        this.s = true;
                    } else {
                        xt1 xt1Var = this.q;
                        xt1Var.j = this.u;
                        xt1Var.c();
                        h03 h03Var = this.r;
                        int i = mc3.a;
                        ut1 a2 = h03Var.a(this.q);
                        if (a2 != null) {
                            ArrayList arrayList = new ArrayList(a2.b.length);
                            a(a2, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.w = new ut1(arrayList);
                                this.v = this.q.f;
                            }
                        }
                    }
                } else if (a == -5) {
                    nx0 nx0Var = ox0Var.b;
                    nx0Var.getClass();
                    this.u = nx0Var.q;
                }
            }
            ut1 ut1Var = this.w;
            if (ut1Var != null && this.v <= j) {
                Handler handler = this.p;
                if (handler != null) {
                    handler.obtainMessage(0, ut1Var).sendToTarget();
                } else {
                    ((xn0) this.o).a(ut1Var);
                }
                this.w = null;
                this.v = C.TIME_UNSET;
                z = true;
            }
            if (this.s && this.w == null) {
                this.t = true;
            }
        } while (z);
    }

    @Override // yads.ro
    public final int a(nx0 nx0Var) {
        ((vt1) this.n).getClass();
        String str = nx0Var.m;
        if (!MimeTypes.APPLICATION_ID3.equals(str) && !MimeTypes.APPLICATION_EMSG.equals(str) && !MimeTypes.APPLICATION_SCTE35.equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
            return ro.a(0, 0, 0);
        }
        return ro.a(nx0Var.F == 0 ? 4 : 2, 0, 0);
    }
}
