package xsna;

import androidx.compose.foundation.lazy.layout.a;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptySet;

/* compiled from: HistoryLoadArgs.kt */
/* loaded from: classes2.dex */
public final class p8v {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;

    public p8v(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = new ci50(new nox[16]);
                break;
            case 2:
            default:
                this.c = gkx0.e;
                this.d = EmptySet.b;
                this.b = 20;
                break;
            case 3:
                break;
        }
    }

    public void a(int i, a.InterfaceC0009a interfaceC0009a) {
        if (i < 0) {
            xzw.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        nox noxVar = new nox(this.b, i, interfaceC0009a);
        this.b += i;
        ((ci50) this.c).b(noxVar);
    }

    public nox b(int i) {
        if (i < 0 || i >= this.b) {
            StringBuilder b = ji.b(i, "Index ", ", size ");
            b.append(this.b);
            xzw.e(b.toString());
        }
        nox noxVar = (nox) this.d;
        if (noxVar != null) {
            int i2 = noxVar.a;
            if (i < noxVar.b + i2 && i2 <= i) {
                return noxVar;
            }
        }
        ci50 ci50Var = (ci50) this.c;
        nox noxVar2 = (nox) ci50Var.b[rdi.e(i, ci50Var)];
        this.d = noxVar2;
        return noxVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public void c() {
        ?? r0 = this.d;
        int i = this.b;
        if (i == 0) {
            return;
        }
        int i2 = i - 1;
        this.b = i2;
        if (i2 == 0 && r0.isInitialized()) {
            rt8 rt8Var = (rt8) this.c;
            byte[] bArr = (byte[]) r0.getValue();
            sk3<byte[]> sk3Var = rt8Var.b;
            ReentrantLock reentrantLock = rt8Var.a;
            reentrantLock.lock();
            try {
                Arrays.fill(bArr, (byte) 0);
                if (sk3Var.size() < 10) {
                    sk3Var.addLast(bArr);
                }
                s3q0 s3q0Var = s3q0.a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "since=" + ((gkx0) this.c) + ", dialogIds=" + ((Set) this.d) + ", limit=" + this.b;
            default:
                return super.toString();
        }
    }

    public p8v(rt8 rt8Var) {
        this.a = 2;
        this.c = rt8Var;
        this.d = msy.a(LazyThreadSafetyMode.NONE, new lbc0(this, 9));
    }
}
