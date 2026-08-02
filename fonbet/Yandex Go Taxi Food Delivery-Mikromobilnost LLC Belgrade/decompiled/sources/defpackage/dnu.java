package defpackage;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class dnu extends nsb {
    public byte[] C;
    public volatile boolean D;
    public byte[] E;

    @Override // defpackage.pyy
    public final void d() {
        this.D = true;
    }

    @Override // defpackage.pyy
    public final void load() {
        try {
            this.B.open(this.b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.D) {
                byte[] bArr = this.C;
                if (bArr.length < i2 + 16384) {
                    this.C = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.B.read(this.C, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.D) {
                this.E = Arrays.copyOf(this.C, i2);
            }
            yri0.b(this.B);
        } catch (Throwable th) {
            yri0.b(this.B);
            throw th;
        }
    }
}
