package defpackage;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes10.dex */
public final class ocy0 implements kpg {
    public final kpg a;
    public final hpg b;
    public boolean c;
    public long w;

    public ocy0(kpg kpgVar, hpg hpgVar) {
        this.a = kpgVar;
        hpgVar.getClass();
        this.b = hpgVar;
    }

    @Override // defpackage.kpg
    public final void addTransferListener(cj01 cj01Var) {
        cj01Var.getClass();
        this.a.addTransferListener(cj01Var);
    }

    @Override // defpackage.kpg
    public final void close() {
        hpg hpgVar = this.b;
        try {
            this.a.close();
        } finally {
            if (this.c) {
                this.c = false;
                hpgVar.close();
            }
        }
    }

    @Override // defpackage.kpg
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // defpackage.kpg
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.kpg
    public final long open(npg npgVar) {
        long open = this.a.open(npgVar);
        this.w = open;
        if (open == 0) {
            return 0L;
        }
        if (npgVar.g == -1 && open != -1) {
            npgVar = npgVar.e(0L, open);
        }
        this.c = true;
        this.b.open(npgVar);
        return this.w;
    }

    @Override // defpackage.apg
    public final int read(byte[] bArr, int i, int i2) {
        if (this.w == 0) {
            return -1;
        }
        int read = this.a.read(bArr, i, i2);
        if (read > 0) {
            this.b.write(bArr, i, read);
            long j = this.w;
            if (j != -1) {
                this.w = j - read;
            }
        }
        return read;
    }
}
