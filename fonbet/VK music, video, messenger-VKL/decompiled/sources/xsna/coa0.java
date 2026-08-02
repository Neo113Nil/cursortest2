package xsna;

import com.vk.superapp.api.dto.app.Status;

/* compiled from: PingableOrder.kt */
/* loaded from: classes6.dex */
public final class coa0 implements hu80 {
    public final fhx0 a;
    public final int b;
    public final boolean c;

    public coa0(fhx0 fhx0Var) {
        this.a = fhx0Var;
        this.b = fhx0Var.a;
        this.c = fhx0Var.b == Status.LOADED;
    }

    @Override // xsna.hu80
    public final int a() {
        return this.b;
    }

    @Override // xsna.hu80
    public final boolean isReady() {
        return this.c;
    }
}
