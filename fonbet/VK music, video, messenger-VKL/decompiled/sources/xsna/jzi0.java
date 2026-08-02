package xsna;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: SettableCacheEvent.java */
/* loaded from: classes12.dex */
public final class jzi0 implements nzz0 {
    public static final Object c = new Object();
    public static jzi0 d;
    public static int e;
    public Object a;
    public Object b;

    public jzi0(int i) {
        switch (i) {
            case 3:
                this.a = new HashSet();
                this.b = new HashSet();
                break;
            case 4:
                this.a = new es();
                this.b = new kub0();
                break;
            default:
                this.a = new HashMap();
                this.b = new HashMap();
                break;
        }
    }

    public static jzi0 d() {
        synchronized (c) {
            try {
                jzi0 jzi0Var = d;
                if (jzi0Var == null) {
                    return new jzi0();
                }
                d = (jzi0) jzi0Var.b;
                jzi0Var.b = null;
                e--;
                return jzi0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.nzz0
    public void a(String str, long j, int i, @Nullable Object obj, long j2, long j3) {
        ((zyz0) this.b).g = null;
        nzz0 nzz0Var = (nzz0) this.a;
        if (nzz0Var != null) {
            nzz0Var.a(str, j, i, obj, j2, j3);
        }
    }

    @Override // xsna.nzz0
    public void b(long j, long j2, long j3, String str) {
        nzz0 nzz0Var = (nzz0) this.a;
        if (nzz0Var != null) {
            nzz0Var.b(j, j2, j3, str);
        }
    }

    public ww8 c() {
        return (ww8) this.a;
    }

    public void e() {
        synchronized (c) {
            try {
                int i = e;
                if (i < 5) {
                    this.a = null;
                    e = i + 1;
                    jzi0 jzi0Var = d;
                    if (jzi0Var != null) {
                        this.b = jzi0Var;
                    }
                    d = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
