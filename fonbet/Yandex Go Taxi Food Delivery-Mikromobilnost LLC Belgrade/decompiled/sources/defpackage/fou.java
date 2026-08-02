package defpackage;

import androidx.media3.common.a;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class fou implements g001 {
    public static final a g;
    public static final a h;
    public final ngo a = new ngo();
    public final g001 b;
    public final a c;
    public a d;
    public byte[] e;
    public int f;

    static {
        f7s f7sVar = new f7s();
        f7sVar.m = eh20.q("application/id3");
        g = new a(f7sVar);
        f7s f7sVar2 = new f7s();
        f7sVar2.m = eh20.q("application/x-emsg");
        h = new a(f7sVar2);
    }

    public fou(g001 g001Var, int i) {
        this.b = g001Var;
        if (i == 1) {
            this.c = g;
        } else {
            if (i != 3) {
                ny61.g(oyr.i(i, "Unknown metadataType: "));
                throw null;
            }
            this.c = h;
        }
        this.e = new byte[0];
        this.f = 0;
    }

    @Override // defpackage.g001
    public final void a(ef90 ef90Var, int i, int i2) {
        int i3 = this.f + i;
        byte[] bArr = this.e;
        if (bArr.length < i3) {
            this.e = Arrays.copyOf(bArr, (i3 / 2) + i3);
        }
        ef90Var.i(this.f, i, this.e);
        this.f += i;
    }

    @Override // defpackage.g001
    public final int b(apg apgVar, int i, boolean z) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (bArr.length < i2) {
            this.e = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int read = apgVar.read(this.e, this.f, i);
        if (read != -1) {
            this.f += read;
            return read;
        }
        if (z) {
            return -1;
        }
        ny61.b();
        return 0;
    }

    @Override // defpackage.g001
    public final void c(long j, int i, int i2, int i3, f001 f001Var) {
        this.d.getClass();
        int i4 = this.f - i3;
        ef90 ef90Var = new ef90(Arrays.copyOfRange(this.e, i4 - i2, i4));
        byte[] bArr = this.e;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.f = i3;
        String str = this.d.n;
        a aVar = this.c;
        String str2 = aVar.n;
        String str3 = aVar.n;
        if (!Objects.equals(str, str2)) {
            if (!"application/x-emsg".equals(this.d.n)) {
                lk91.j("Ignoring sample for unsupported format: " + this.d.n);
                return;
            }
            this.a.getClass();
            mgo c = ngo.c(ef90Var);
            a wrappedMetadataFormat = c.getWrappedMetadataFormat();
            if (wrappedMetadataFormat == null || !Objects.equals(str3, wrappedMetadataFormat.n)) {
                lk91.j("Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + c.getWrappedMetadataFormat());
                return;
            }
            byte[] wrappedMetadataBytes = c.getWrappedMetadataBytes();
            wrappedMetadataBytes.getClass();
            ef90Var = new ef90(wrappedMetadataBytes);
        }
        int a = ef90Var.a();
        this.b.a(ef90Var, a, 0);
        this.b.c(j, i, a, 0, f001Var);
    }

    @Override // defpackage.g001
    public final void d(a aVar) {
        this.d = aVar;
        this.b.d(this.c);
    }
}
