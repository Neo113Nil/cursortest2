package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public final class c150 {
    public final int a;
    public boolean b;
    public boolean c;
    public byte[] d;
    public int e;

    public c150(int i, int i2) {
        switch (i2) {
            case 1:
                this.a = i;
                byte[] bArr = new byte[HProv.PP_FAST_CODE];
                this.d = bArr;
                bArr[2] = 1;
                break;
            default:
                this.a = i;
                byte[] bArr2 = new byte[HProv.PP_FAST_CODE];
                this.d = bArr2;
                bArr2[2] = 1;
                break;
        }
    }

    public void a(int i, int i2, byte[] bArr) {
        if (this.b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.d;
            int length = bArr2.length;
            int i4 = this.e + i3;
            if (length < i4) {
                this.d = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.d, this.e, i3);
            this.e += i3;
        }
    }

    public boolean b(int i) {
        if (!this.b) {
            return false;
        }
        this.e -= i;
        this.b = false;
        this.c = true;
        return true;
    }

    public void c(int i, int i2, byte[] bArr) {
        if (this.b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.d;
            int length = bArr2.length;
            int i4 = this.e + i3;
            if (length < i4) {
                this.d = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.d, this.e, i3);
            this.e += i3;
        }
    }

    public void d(int i) {
        if (this.b) {
            ny61.k();
            return;
        }
        boolean z = i == this.a;
        this.b = z;
        if (z) {
            this.e = 3;
            this.c = false;
        }
    }

    public boolean e(int i) {
        if (!this.b) {
            return false;
        }
        this.e -= i;
        this.b = false;
        this.c = true;
        return true;
    }

    public void f() {
        this.b = false;
        this.c = false;
    }

    public void g(int i) {
        d6z.x(!this.b);
        boolean z = i == this.a;
        this.b = z;
        if (z) {
            this.e = 3;
            this.c = false;
        }
    }
}
