package xsna;

/* compiled from: ArrayPools.kt */
/* loaded from: classes8.dex */
public class nlb {
    public int a;
    public final Object b;

    public nlb(int i, androidx.constraintlayout.widget.b bVar) {
        this.a = i;
        this.b = bVar;
    }

    public void a(int i) {
        ((androidx.constraintlayout.widget.b) this.b).n(this.a, 0);
        ((androidx.constraintlayout.widget.b) this.b).k(this.a, 3, i, 3);
        ((androidx.constraintlayout.widget.b) this.b).k(this.a, 4, i, 4);
    }

    public void b(int i) {
        androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) this.b;
        int i2 = this.a;
        bVar.p(i2, 0);
        ((androidx.constraintlayout.widget.b) this.b).k(this.a, 6, i, 6);
        bVar.k(i2, 7, i, 7);
    }

    public void c() {
        androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) this.b;
        int i = this.a;
        bVar.u(i).e.Z = 2;
        bVar.u(i).e.f0 = 1.0f;
    }

    public void d(char[] cArr) {
        synchronized (this) {
            try {
                int i = this.a;
                if (cArr.length + i < dl3.a) {
                    this.a = i + cArr.length;
                    ((sk3) this.b).addLast(cArr);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public char[] e(int i) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) ((sk3) this.b).m();
            if (cArr != null) {
                this.a -= cArr.length;
            } else {
                cArr = null;
            }
        }
        return cArr == null ? new char[i] : cArr;
    }

    public void f(int i) {
        ((androidx.constraintlayout.widget.b) this.b).k(this.a, 3, i, 4);
    }

    public void g(int i) {
        ((androidx.constraintlayout.widget.b) this.b).J(this.a, i);
    }

    public nlb() {
        this.b = new sk3();
    }
}
