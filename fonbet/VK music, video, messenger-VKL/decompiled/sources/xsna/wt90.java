package xsna;

import com.vk.im.engine.models.dialogs.Dialog;

/* compiled from: PeerItem.kt */
/* loaded from: classes18.dex */
public final class wt90 implements hfz {
    public final long b;
    public final Dialog c;
    public final cr5 d;
    public final fzo0 e;
    public final n0n0 f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public wt90(long j, Dialog dialog, cr5 cr5Var, fzo0 fzo0Var, n0n0 n0n0Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = j;
        this.c = dialog;
        this.d = cr5Var;
        this.e = fzo0Var;
        this.f = n0n0Var;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
    }

    public static wt90 a(wt90 wt90Var, boolean z) {
        long j = wt90Var.b;
        Dialog dialog = wt90Var.c;
        cr5 cr5Var = wt90Var.d;
        fzo0 fzo0Var = wt90Var.e;
        n0n0 n0n0Var = wt90Var.f;
        boolean z2 = wt90Var.g;
        boolean z3 = wt90Var.i;
        boolean z4 = wt90Var.j;
        wt90Var.getClass();
        return new wt90(j, dialog, cr5Var, fzo0Var, n0n0Var, z2, z, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt90)) {
            return false;
        }
        wt90 wt90Var = (wt90) obj;
        return this.b == wt90Var.b && this.c.equals(wt90Var.c) && epx.f(this.d, wt90Var.d) && epx.f(this.e, wt90Var.e) && epx.f(this.f, wt90Var.f) && this.g == wt90Var.g && this.h == wt90Var.h && this.i == wt90Var.i && this.j == wt90Var.j;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Long.valueOf(this.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + qoy.b(qoy.b(qoy.b((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (Long.hashCode(this.b) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PeerItem(id=");
        sb.append(this.b);
        sb.append(", dialog=");
        sb.append(this.c);
        sb.append(", avatar=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", subtitle=");
        sb.append(this.f);
        sb.append(", isSelectable=");
        sb.append(this.g);
        sb.append(", isSelected=");
        sb.append(this.h);
        sb.append(", isWithMenu=");
        sb.append(this.i);
        sb.append(", belongsToAnySublist=");
        return defpackage.q0.a(sb, this.j, ')');
    }
}
