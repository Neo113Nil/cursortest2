package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class bpf0 implements fpf0 {
    public final dpf0 a;
    public final Runnable b;
    public final boolean c;

    public bpf0(dpf0 dpf0Var, Runnable runnable, boolean z) {
        this.a = dpf0Var;
        this.b = runnable;
        this.c = z;
    }

    @Override // defpackage.fpf0
    public final dpf0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpf0)) {
            return false;
        }
        bpf0 bpf0Var = (bpf0) obj;
        return this.a.equals(bpf0Var.a) && jl40.l(this.b, bpf0Var.b) && this.c == bpf0Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Runnable runnable = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (runnable == null ? 0 : runnable.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionButtonClicked(actionInfo=");
        sb.append(this.a);
        sb.append(", doOnClickButton=");
        sb.append(this.b);
        sb.append(", isClickActionResultAsync=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
