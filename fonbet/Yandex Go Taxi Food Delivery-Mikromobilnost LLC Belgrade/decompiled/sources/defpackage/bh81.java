package defpackage;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes7.dex */
public final class bh81 implements u871 {
    public final u871 a;
    public long b;
    public Uri c;

    public bh81(u871 u871Var) {
        u871Var.getClass();
        this.a = u871Var;
        this.c = Uri.EMPTY;
    }

    @Override // defpackage.u871
    public final long Q(no71 no71Var) {
        this.c = no71Var.a;
        u871 u871Var = this.a;
        long Q = u871Var.Q(no71Var);
        Uri d = u871Var.d();
        d.getClass();
        this.c = d;
        u871Var.b();
        return Q;
    }

    @Override // defpackage.u871
    public final void S(mr81 mr81Var) {
        mr81Var.getClass();
        this.a.S(mr81Var);
    }

    @Override // defpackage.u871
    public final Map b() {
        return this.a.b();
    }

    @Override // defpackage.u871
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.u871
    public final Uri d() {
        return this.a.d();
    }

    @Override // defpackage.jz61
    public final int v(int i, int i2, byte[] bArr) {
        int v = this.a.v(i, i2, bArr);
        if (v != -1) {
            this.b += v;
        }
        return v;
    }
}
