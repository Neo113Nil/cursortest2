package defpackage;

import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes.dex */
public final class bq31 implements Runnable, Comparable {
    public static final /* synthetic */ kgx[] w;
    public final int a;
    public final String b;
    public final y941 c;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl("channelRef", 0, "getChannelRef()Lcom/yandex/div/internal/viewpool/AdvanceViewPool$Channel;", bq31.class);
        qoi0.a.getClass();
        w = new kgx[]{propertyReference1Impl};
    }

    public bq31(id1 id1Var, int i) {
        this.a = i;
        this.b = id1Var.a;
        this.c = new y941(id1Var);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        bq31 bq31Var = (bq31) obj;
        int i = this.a - bq31Var.a;
        return i != 0 ? i : !this.b.equals(bq31Var.b) ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!bq31.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        bq31 bq31Var = (bq31) obj;
        return this.b.equals(bq31Var.b) && this.a == bq31Var.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((6913 + this.a) * 31);
    }

    @Override // java.lang.Runnable
    public final void run() {
        id1 id1Var = (id1) this.c.getValue(this, w[0]);
        if (id1Var == null || id1Var.h.get()) {
            return;
        }
        try {
            id1Var.f.offer(id1Var.d.a());
        } catch (Exception unused) {
        }
    }
}
