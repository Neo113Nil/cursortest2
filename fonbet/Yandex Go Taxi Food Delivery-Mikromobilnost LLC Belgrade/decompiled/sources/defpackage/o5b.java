package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes15.dex */
public final class o5b {
    public final long a;
    public final byte[] b;
    public final byte[] c;
    public final byte[] d;
    public final String e;
    public final Boolean f;
    public final Boolean g;

    public o5b(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, String str, Boolean bool, Boolean bool2) {
        this.a = j;
        this.b = bArr;
        this.c = bArr2;
        this.d = bArr3;
        this.e = str;
        this.f = bool;
        this.g = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof o5b)) {
            o5b o5bVar = (o5b) obj;
            if (this.a != o5bVar.a || !jl40.l(this.e, o5bVar.e) || !jl40.l(this.g, o5bVar.g)) {
                return false;
            }
            byte[] bArr = this.b;
            boolean z = bArr == null;
            byte[] bArr2 = o5bVar.b;
            if (!(z ^ (bArr2 == null)) && (bArr == null || Arrays.equals(bArr, bArr2))) {
                byte[] bArr3 = this.c;
                boolean z2 = bArr3 == null;
                byte[] bArr4 = o5bVar.c;
                if (!(z2 ^ (bArr4 == null)) && (bArr3 == null || Arrays.equals(bArr3, bArr4))) {
                    byte[] bArr5 = this.d;
                    boolean z3 = bArr5 == null;
                    byte[] bArr6 = o5bVar.d;
                    if (!(z3 ^ (bArr6 == null)) && (bArr5 == null || Arrays.equals(bArr5, bArr6))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Long valueOf = Long.valueOf(this.a);
        byte[] bArr = this.b;
        Integer valueOf2 = Integer.valueOf(bArr != null ? Arrays.hashCode(bArr) : 0);
        byte[] bArr2 = this.c;
        Integer valueOf3 = Integer.valueOf(bArr2 != null ? Arrays.hashCode(bArr2) : 0);
        byte[] bArr3 = this.d;
        return Objects.hash(valueOf, valueOf2, valueOf3, Integer.valueOf(bArr3 != null ? Arrays.hashCode(bArr3) : 0), this.e, this.g);
    }
}
