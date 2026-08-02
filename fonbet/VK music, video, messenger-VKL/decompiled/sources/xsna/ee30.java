package xsna;

import com.vk.catalog.mvi.block.BlockId;
import java.util.List;
import xsna.mno0;

/* compiled from: MovieInfoView.kt */
/* loaded from: classes.dex */
public final class ee30 implements r2a {
    public final BlockId b;
    public final mno0.g c;
    public final List d;
    public final boolean e;
    public final boolean f;

    /* compiled from: MovieInfoView.kt */
    /* loaded from: classes16.dex */
    public static final class a {
        public final mno0 a;
        public final mno0 b;

        public a(mno0 mno0Var, mno0 mno0Var2) {
            this.a = mno0Var;
            this.b = mno0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Field(name=" + this.a + ", value=" + this.b + ')';
        }
    }

    public ee30(BlockId blockId, mno0.g gVar, List list, boolean z, boolean z2) {
        this.b = blockId;
        this.c = gVar;
        this.d = list;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee30)) {
            return false;
        }
        ee30 ee30Var = (ee30) obj;
        return this.b.equals(ee30Var.b) && this.c.equals(ee30Var.c) && wow.a(this.d, ee30Var.d) && this.e == ee30Var.e && this.f == ee30Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b((wow.b(this.d) + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieInfoViewState(blockId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", fields=");
        mr.c(", isExpanded=", sb, this.d);
        sb.append(this.e);
        sb.append(", isExpandable=");
        return defpackage.q0.a(sb, this.f, ')');
    }

    @Override // xsna.r2a
    public final BlockId w() {
        return this.b;
    }
}
