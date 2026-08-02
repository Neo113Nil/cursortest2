package xsna;

import android.content.Context;
import android.util.SparseArray;
import androidx.media3.common.VideoFrameProcessingException;
import java.util.concurrent.Executor;
import xsna.o0u;

/* compiled from: InputSwitcher.java */
/* loaded from: classes12.dex */
public final class j3x {
    public final Context a;
    public final m6g b;
    public final k0u c;
    public final jms0 d;
    public final tp1 e;
    public final Executor f;
    public final SparseArray<b> g;
    public final boolean h;
    public o0u i;
    public goo0 j;

    /* compiled from: InputSwitcher.java */
    public static final class a implements o0u.c, o0u.b {
        public final nra a;
        public boolean b;

        public a(k0u k0uVar, mml mmlVar, o0u o0uVar, jms0 jms0Var) {
            this.a = new nra(k0uVar, mmlVar, o0uVar, jms0Var);
        }

        @Override // xsna.o0u.b
        public final synchronized void a() {
            if (this.b) {
                this.a.a();
            }
        }

        @Override // xsna.o0u.b
        public final void b(r0u r0uVar) {
            if (this.b) {
                this.a.b(r0uVar);
            }
        }

        @Override // xsna.o0u.c
        public final synchronized void c() {
            if (this.b) {
                this.a.c();
            }
        }

        @Override // xsna.o0u.c
        public final synchronized void d(r0u r0uVar, long j) {
            if (this.b) {
                this.a.d(r0uVar, j);
            }
        }

        @Override // xsna.o0u.b
        public final void e() {
            if (this.b) {
                this.a.e();
            }
        }
    }

    /* compiled from: InputSwitcher.java */
    public static final class b {
        public final goo0 a;
        public mml b;
        public a c;
        public boolean d;

        public b(goo0 goo0Var) {
            this.a = goo0Var;
        }
    }

    public j3x(Context context, m6g m6gVar, k0u k0uVar, jms0 jms0Var, Executor executor, tp1 tp1Var, boolean z, boolean z2, boolean z3) throws VideoFrameProcessingException {
        this.a = context;
        this.b = m6gVar;
        this.c = k0uVar;
        this.d = jms0Var;
        this.f = executor;
        this.e = tp1Var;
        SparseArray<b> sparseArray = new SparseArray<>();
        this.g = sparseArray;
        this.h = z2;
        b bVar = new b(new bgq(k0uVar, jms0Var, z, z2));
        sparseArray.put(1, bVar);
        sparseArray.put(4, bVar);
        sparseArray.put(2, new b(new gd7(k0uVar, jms0Var, z3)));
        sparseArray.put(3, new b(new gbo0(k0uVar, jms0Var)));
    }

    public final void a() throws VideoFrameProcessingException {
        int i = 0;
        while (true) {
            SparseArray<b> sparseArray = this.g;
            if (i >= sparseArray.size()) {
                return;
            }
            b bVar = sparseArray.get(sparseArray.keyAt(i));
            if (!bVar.d) {
                bVar.d = true;
                bVar.a.k();
                mml mmlVar = bVar.b;
                if (mmlVar != null) {
                    mmlVar.release();
                }
            }
            i++;
        }
    }
}
