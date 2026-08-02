package xsna;

import com.vk.catalog.mvi.block.BlockId;
import xsna.mno0;

/* compiled from: MovieButtonsViewState.kt */
/* loaded from: classes.dex */
public final class fd30 implements r2a {
    public final BlockId b;
    public final mno0.g c;
    public final a d;
    public final mno0 e;

    /* compiled from: MovieButtonsViewState.kt */
    /* loaded from: classes16.dex */
    public static final class a {
        public final boolean a;
        public final boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WatchLaterButtonState(isChecked=");
            sb.append(this.a);
            sb.append(", isLarge=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    public fd30(BlockId blockId, mno0.g gVar, a aVar, mno0.g gVar2) {
        this.b = blockId;
        this.c = gVar;
        this.d = aVar;
        this.e = gVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd30)) {
            return false;
        }
        fd30 fd30Var = (fd30) obj;
        return epx.f(this.b, fd30Var.b) && this.c.equals(fd30Var.c) && epx.f(this.d, fd30Var.d) && epx.f(this.e, fd30Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        a aVar = this.d;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        mno0 mno0Var = this.e;
        return hashCode2 + (mno0Var != null ? mno0Var.hashCode() : 0);
    }

    public final String toString() {
        return "MovieButtonsViewState(blockId=" + this.b + ", watchButtonText=" + this.c + ", watchLaterButtonState=" + this.d + ", disclaimer=" + this.e + ')';
    }

    @Override // xsna.r2a
    public final BlockId w() {
        return this.b;
    }
}
