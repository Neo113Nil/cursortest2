package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* loaded from: classes9.dex */
public final class luu implements k5t0 {
    public final juu A;
    public final iuu B;
    public final kuu C;
    public final kuu D;
    public ErrorCode E;
    public IOException F;
    public final int a;
    public final euu b;
    public final d651 c;
    public long w;
    public long x;
    public final ArrayDeque y;
    public boolean z;

    public luu(int i, euu euuVar, boolean z, boolean z2, meu meuVar) {
        this.a = i;
        this.b = euuVar;
        this.c = new d651(i);
        this.x = euuVar.K.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.y = arrayDeque;
        this.A = new juu(this, euuVar.J.a(), z2);
        this.B = new iuu(this, z);
        this.C = new kuu(this);
        this.D = new kuu(this);
        if (meuVar == null) {
            if (h()) {
                return;
            }
            ny61.r("remotely-initiated streams should have headers");
            throw null;
        }
        if (h()) {
            ny61.r("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(meuVar);
    }

    public final void a() {
        boolean z;
        boolean i;
        TimeZone timeZone = bg61.a;
        synchronized (this) {
            try {
                juu juuVar = this.A;
                if (!juuVar.b && juuVar.x) {
                    iuu iuuVar = this.B;
                    if (!iuuVar.a) {
                        if (iuuVar.c) {
                        }
                    }
                    z = true;
                    i = i();
                }
                z = false;
                i = i();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(ErrorCode.CANCEL, null);
        } else {
            if (i) {
                return;
            }
            this.b.d(this.a);
        }
    }

    public final void b() {
        iuu iuuVar = this.B;
        if (iuuVar.c) {
            ny61.v("stream closed");
            return;
        }
        if (iuuVar.a) {
            ny61.v("stream finished");
        } else if (g() != null) {
            IOException iOException = this.F;
            if (iOException == null) {
                throw new StreamResetException(g());
            }
        }
    }

    public final void c(ErrorCode errorCode, IOException iOException) {
        if (d(errorCode, iOException)) {
            this.b.P.o(this.a, errorCode);
        }
    }

    @Override // defpackage.k5t0
    public final void cancel() {
        f(ErrorCode.CANCEL);
    }

    public final boolean d(ErrorCode errorCode, IOException iOException) {
        TimeZone timeZone = bg61.a;
        synchronized (this) {
            if (g() != null) {
                return false;
            }
            this.E = errorCode;
            this.F = iOException;
            notifyAll();
            if (this.A.b) {
                if (this.B.a) {
                    return false;
                }
            }
            this.b.d(this.a);
            return true;
        }
    }

    @Override // defpackage.k5t0
    public final uis0 e() {
        return this.B;
    }

    public final void f(ErrorCode errorCode) {
        if (d(errorCode, null)) {
            this.b.o(this.a, errorCode);
        }
    }

    public final ErrorCode g() {
        ErrorCode errorCode;
        synchronized (this) {
            errorCode = this.E;
        }
        return errorCode;
    }

    @Override // defpackage.k5t0
    public final y9t0 getSource() {
        return this.A;
    }

    public final boolean h() {
        boolean z = (this.a & 1) == 1;
        this.b.getClass();
        return true == z;
    }

    public final boolean i() {
        synchronized (this) {
            try {
                if (g() != null) {
                    return false;
                }
                juu juuVar = this.A;
                if (!juuVar.b) {
                    if (juuVar.x) {
                    }
                    return true;
                }
                iuu iuuVar = this.B;
                if (iuuVar.a || iuuVar.c) {
                    if (this.z) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x0010, B:11:0x0019, B:13:0x002a, B:14:0x002e, B:22:0x0021), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(meu meuVar, boolean z) {
        boolean i;
        TimeZone timeZone = bg61.a;
        synchronized (this) {
            try {
                if (this.z && meuVar.a(":status") == null && meuVar.a(":method") == null) {
                    this.A.getClass();
                    if (z) {
                        this.A.b = true;
                    }
                    i = i();
                    notifyAll();
                }
                this.z = true;
                this.y.add(meuVar);
                if (z) {
                }
                i = i();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i) {
            return;
        }
        this.b.d(this.a);
    }
}
