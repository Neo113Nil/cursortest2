package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class e73 extends ro implements Handler.Callback {
    public int A;
    public long B;
    public final Handler n;
    public final d73 o;
    public final z53 p;
    public final ox0 q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public nx0 v;
    public w53 w;
    public a63 x;
    public b63 y;
    public b63 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e73(xn0 xn0Var, Looper looper) {
        super(3);
        y53 y53Var = z53.a;
        this.o = (d73) ni.a(xn0Var);
        this.n = looper == null ? null : mc3.a(looper, (Handler.Callback) this);
        this.p = y53Var;
        this.q = new ox0();
        this.B = C.TIME_UNSET;
    }

    @Override // yads.ro
    public final void a(long j, boolean z) {
        List list = Collections.EMPTY_LIST;
        Handler handler = this.n;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            ((xn0) this.o).a(list);
            ((xn0) this.o).a(new q20(list));
        }
        this.r = false;
        this.s = false;
        this.B = C.TIME_UNSET;
        if (this.u != 0) {
            p();
            n();
        } else {
            o();
            w53 w53Var = this.w;
            w53Var.getClass();
            w53Var.flush();
        }
    }

    @Override // yads.ro
    public final String d() {
        return "TextRenderer";
    }

    @Override // yads.ro
    public final boolean f() {
        return this.s;
    }

    @Override // yads.ro
    public final boolean g() {
        return true;
    }

    @Override // yads.ro
    public final void h() {
        this.v = null;
        this.B = C.TIME_UNSET;
        List list = Collections.EMPTY_LIST;
        Handler handler = this.n;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            ((xn0) this.o).a(list);
            ((xn0) this.o).a(new q20(list));
        }
        p();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        List list = (List) message.obj;
        ((xn0) this.o).a(list);
        ((xn0) this.o).a(new q20(list));
        return true;
    }

    public final long m() {
        if (this.A == -1) {
            return Long.MAX_VALUE;
        }
        this.y.getClass();
        if (this.A >= this.y.a()) {
            return Long.MAX_VALUE;
        }
        return this.y.a(this.A);
    }

    public final void n() {
        this.t = true;
        z53 z53Var = this.p;
        nx0 nx0Var = this.v;
        nx0Var.getClass();
        this.w = ((y53) z53Var).a(nx0Var);
    }

    public final void o() {
        this.x = null;
        this.A = -1;
        b63 b63Var = this.y;
        if (b63Var != null) {
            b63Var.b();
            this.y = null;
        }
        b63 b63Var2 = this.z;
        if (b63Var2 != null) {
            b63Var2.b();
            this.z = null;
        }
    }

    public final void p() {
        o();
        w53 w53Var = this.w;
        w53Var.getClass();
        w53Var.release();
        this.w = null;
        this.u = 0;
    }

    @Override // yads.ro
    public final void a(nx0[] nx0VarArr, long j, long j2) {
        this.v = nx0VarArr[0];
        if (this.w != null) {
            this.u = 1;
        } else {
            n();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x00e0, code lost:
    
        if (r14 != false) goto L52;
     */
    @Override // yads.ro
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j, long j2) {
        boolean z;
        if (this.l) {
            long j3 = this.B;
            if (j3 != C.TIME_UNSET && j >= j3) {
                o();
                this.s = true;
            }
        }
        if (this.s) {
            return;
        }
        if (this.z == null) {
            w53 w53Var = this.w;
            w53Var.getClass();
            w53Var.a(j);
            try {
                w53 w53Var2 = this.w;
                w53Var2.getClass();
                this.z = (b63) w53Var2.a();
            } catch (x53 e) {
                ji1.b("TextRenderer", ji1.a("Subtitle decoding failed. streamFormat=" + this.v, e));
                List list = Collections.EMPTY_LIST;
                Handler handler = this.n;
                if (handler != null) {
                    handler.obtainMessage(0, list).sendToTarget();
                } else {
                    ((xn0) this.o).a(list);
                    ((xn0) this.o).a(new q20(list));
                }
                p();
                n();
                return;
            }
        }
        if (this.g != 2) {
            return;
        }
        if (this.y != null) {
            long m = m();
            z = false;
            while (m <= j) {
                this.A++;
                m = m();
                z = true;
            }
        } else {
            z = false;
        }
        b63 b63Var = this.z;
        if (b63Var != null) {
            if (b63Var.b(4)) {
                if (!z && m() == Long.MAX_VALUE) {
                    if (this.u == 2) {
                        p();
                        n();
                    } else {
                        o();
                        this.s = true;
                    }
                }
            } else if (b63Var.c <= j) {
                b63 b63Var2 = this.y;
                if (b63Var2 != null) {
                    b63Var2.b();
                }
                this.A = b63Var.a(j);
                this.y = b63Var;
                this.z = null;
                this.y.getClass();
                List b = this.y.b(j);
                Handler handler2 = this.n;
                if (handler2 != null) {
                    handler2.obtainMessage(0, b).sendToTarget();
                } else {
                    ((xn0) this.o).a(b);
                    ((xn0) this.o).a(new q20(b));
                }
                if (this.u == 2) {
                    return;
                }
                while (!this.r) {
                    try {
                        a63 a63Var = this.x;
                        if (a63Var == null) {
                            w53 w53Var3 = this.w;
                            w53Var3.getClass();
                            a63Var = (a63) w53Var3.b();
                            if (a63Var == null) {
                                return;
                            } else {
                                this.x = a63Var;
                            }
                        }
                        if (this.u == 1) {
                            a63Var.b = 4;
                            w53 w53Var4 = this.w;
                            w53Var4.getClass();
                            w53Var4.a(a63Var);
                            this.x = null;
                            this.u = 2;
                            return;
                        }
                        int a = a(this.q, a63Var, 0);
                        if (a == -4) {
                            if (a63Var.b(4)) {
                                this.r = true;
                                this.t = false;
                            } else {
                                nx0 nx0Var = this.q.b;
                                if (nx0Var == null) {
                                    return;
                                }
                                a63Var.j = nx0Var.q;
                                a63Var.c();
                                this.t &= !a63Var.b(1);
                            }
                            if (!this.t) {
                                w53 w53Var5 = this.w;
                                w53Var5.getClass();
                                w53Var5.a(a63Var);
                                this.x = null;
                            }
                        } else if (a == -3) {
                            return;
                        }
                    } catch (x53 e2) {
                        ji1.b("TextRenderer", ji1.a("Subtitle decoding failed. streamFormat=" + this.v, e2));
                        List list2 = Collections.EMPTY_LIST;
                        Handler handler3 = this.n;
                        if (handler3 != null) {
                            handler3.obtainMessage(0, list2).sendToTarget();
                        } else {
                            ((xn0) this.o).a(list2);
                            ((xn0) this.o).a(new q20(list2));
                        }
                        p();
                        n();
                        return;
                    }
                }
            }
        }
    }

    @Override // yads.ro
    public final int a(nx0 nx0Var) {
        if (((y53) this.p).b(nx0Var)) {
            return ro.a(nx0Var.F == 0 ? 4 : 2, 0, 0);
        }
        if (iu1.e(nx0Var.m)) {
            return ro.a(1, 0, 0);
        }
        return ro.a(0, 0, 0);
    }
}
