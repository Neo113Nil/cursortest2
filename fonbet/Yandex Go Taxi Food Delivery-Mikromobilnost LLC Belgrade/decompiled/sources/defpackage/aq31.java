package defpackage;

import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes11.dex */
public final class aq31 implements Runnable, Comparable {
    public static final /* synthetic */ kgx[] w;
    public final int a;
    public final String b;
    public final x941 c;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl("channelRef", 0, "getChannelRef()Lcom/yandex/div/legacy/viewpool/AdvanceViewPool$Channel;", aq31.class);
        qoi0.a.getClass();
        w = new kgx[]{propertyReference1Impl};
    }

    public aq31(hd1 hd1Var, int i) {
        this.a = i;
        this.b = hd1Var.a;
        this.c = new x941(hd1Var);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        aq31 aq31Var = (aq31) obj;
        int i = this.a - aq31Var.a;
        return i != 0 ? i : !this.b.equals(aq31Var.b) ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!aq31.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        aq31 aq31Var = (aq31) obj;
        return this.b.equals(aq31Var.b) && this.a == aq31Var.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((6913 + this.a) * 31);
    }

    @Override // java.lang.Runnable
    public final void run() {
        hd1 hd1Var = (hd1) this.c.getValue(this, w[0]);
        if (hd1Var == null || hd1Var.e.get()) {
            return;
        }
        try {
            hd1Var.d.offer(hd1Var.b.a());
        } catch (Exception unused) {
        }
    }
}
