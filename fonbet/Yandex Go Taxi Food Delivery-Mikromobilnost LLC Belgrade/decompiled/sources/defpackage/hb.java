package defpackage;

import com.yandex.payment.sdk.nfcscanner.tools.ownimpl.Command;
import java.io.Serializable;

/* loaded from: classes10.dex */
public final class hb {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [byte[], java.io.Serializable] */
    public hb(Command command, byte[] bArr) {
        this.f = new byte[0];
        this.a = command.getCla();
        this.b = command.getIns();
        this.c = command.getP1();
        this.d = command.getP2();
        this.f = bArr;
        this.e = 0;
    }

    public byte[] a() {
        boolean z = true;
        byte[] bArr = {(byte) this.a, (byte) this.b, (byte) this.c, (byte) this.d};
        byte[] bArr2 = (byte[]) this.f;
        int length = (bArr2.length == 0 ? 0 : bArr2.length + 1) + 4;
        int i = this.e;
        e390 e390Var = new e390(length + (i < 0 ? 0 : 1));
        try {
            e390Var.write(bArr);
            if (bArr2.length != 0) {
                z = false;
            }
            if (!z) {
                e390Var.a((byte) bArr2.length);
                e390Var.write(bArr2);
            }
            if (i != -1) {
                e390Var.a((byte) (i & 255));
            }
            int i2 = e390Var.b;
            byte[] bArr3 = new byte[i2];
            System.arraycopy(e390Var.a, 0, bArr3, 0, i2);
            return bArr3;
        } finally {
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [byte[], java.io.Serializable] */
    public hb(Command command, int i, int i2, int i3) {
        this.f = new byte[0];
        this.a = command.getCla();
        this.b = command.getIns();
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public hb(int i, int i2, int i3, int i4, int i5, String str) {
        this.f = str;
        this.b = i;
        this.a = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }
}
