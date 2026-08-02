package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import com.vk.audiomsg.player.SpeakerType;
import xsna.bwe0;
import xsna.yyu;

/* compiled from: ChangeSpeakerByRaiseToEarController.kt */
/* loaded from: classes.dex */
public final class ysa {
    public final xal a;
    public final bpn0 c;
    public final bpn0 e;
    public final bpn0 g;
    public boolean i;
    public boolean j;
    public final bpn0 b = new bpn0(new zf6(this, 3));
    public final bpn0 d = new bpn0(new bg6(this, 1));
    public final bpn0 f = new bpn0(new ib8(this, 2));
    public final bpn0 h = new bpn0(new kb8(this, 1));

    /* compiled from: ChangeSpeakerByRaiseToEarController.kt */
    /* loaded from: classes15.dex */
    public final class a implements yyu.a {
        public a() {
        }

        @Override // xsna.yyu.a
        public final void a(boolean z) {
            ysa.this.a();
        }
    }

    /* compiled from: ChangeSpeakerByRaiseToEarController.kt */
    public final class b extends o56 {
        public b() {
        }

        @Override // xsna.o56, xsna.kr4
        public final void a(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
            ysa.this.d();
        }

        @Override // xsna.o56, xsna.kr4
        public final void e(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
            ysa.this.c();
        }

        @Override // xsna.o56, xsna.kr4
        public final void m(ir4 ir4Var, ur4 ur4Var, Throwable th) {
            ysa.this.d();
        }

        @Override // xsna.o56, xsna.kr4
        public final void n(ir4 ir4Var, bgk0 bgk0Var) {
            ysa.this.d();
        }

        @Override // xsna.o56, xsna.kr4
        public final void s(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
            ysa.this.d();
        }
    }

    /* compiled from: ChangeSpeakerByRaiseToEarController.kt */
    /* loaded from: classes15.dex */
    public final class c implements bwe0.b {
        public c() {
        }

        @Override // xsna.bwe0.b
        public final void a() {
            ysa.this.a();
        }
    }

    public ysa(Context context, xal xalVar) {
        this.a = xalVar;
        this.c = new bpn0(new ag6(context, 1));
        this.e = new bpn0(new xsa(context, 0));
        this.g = new bpn0(new jb8(context, 1));
    }

    @SuppressLint({"WakelockTimeout"})
    public final synchronized void a() {
        boolean z;
        try {
            bwe0 bwe0Var = (bwe0) this.c.getValue();
            synchronized (bwe0Var) {
                z = bwe0Var.f;
            }
            boolean z2 = z && !((yyu) this.e.getValue()).c;
            if (this.i && z2) {
                this.a.e(SpeakerType.INNER);
                if (!((PowerManager.WakeLock) this.h.getValue()).isHeld()) {
                    ((PowerManager.WakeLock) this.h.getValue()).acquire();
                }
            } else {
                this.a.e(SpeakerType.OUTER);
                if (((PowerManager.WakeLock) this.h.getValue()).isHeld()) {
                    ((PowerManager.WakeLock) this.h.getValue()).release();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            if (!this.i) {
                this.i = true;
                this.a.v((b) this.b.getValue());
                if (this.a.isPlaying()) {
                    c();
                }
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        if (!this.j) {
            this.j = true;
            bwe0 bwe0Var = (bwe0) this.c.getValue();
            c cVar = (c) this.d.getValue();
            synchronized (bwe0Var) {
                int size = bwe0Var.e.size();
                bwe0Var.e.add(cVar);
                int size2 = bwe0Var.e.size();
                if (size == 0 && size2 > 0) {
                    bwe0Var.b();
                }
            }
            ((yyu) this.e.getValue()).a((a) this.f.getValue());
            a();
        }
    }

    public final synchronized void d() {
        if (this.j) {
            this.j = false;
            bwe0 bwe0Var = (bwe0) this.c.getValue();
            c cVar = (c) this.d.getValue();
            synchronized (bwe0Var) {
                int size = bwe0Var.e.size();
                bwe0Var.e.remove(cVar);
                int size2 = bwe0Var.e.size();
                if (size > 0 && size2 == 0) {
                    bwe0Var.c();
                }
            }
            yyu yyuVar = (yyu) this.e.getValue();
            a aVar = (a) this.f.getValue();
            synchronized (yyuVar) {
                int size3 = yyuVar.b.size();
                yyuVar.b.remove(aVar);
                int size4 = yyuVar.b.size();
                if (size3 > 0 && size4 == 0) {
                    yyuVar.b();
                }
            }
            a();
        }
    }
}
