package xsna;

import com.vk.catalog.mvi.block.BlockId;
import xsna.rmw;

/* compiled from: AlbumTitleSubtitleAvatar.kt */
/* loaded from: classes.dex */
public final class al1 implements r2a {
    public final String b;
    public final String c;
    public final mno0 d;
    public final rmw e;
    public final boolean f;

    public al1(String str, String str2, mno0 mno0Var, rmw.f fVar, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = mno0Var;
        this.e = fVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al1)) {
            return false;
        }
        al1 al1Var = (al1) obj;
        return BlockId.Simple.b(this.b, al1Var.b) && epx.f(this.c, al1Var.c) && epx.f(this.d, al1Var.d) && epx.f(this.e, al1Var.e) && this.f == al1Var.f;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + urd0.a(BlockId.Simple.d(this.b) * 31, 31, this.c)) * 31;
        rmw rmwVar = this.e;
        return Boolean.hashCode(this.f) + ((hashCode + (rmwVar == null ? 0 : rmwVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewState(blockId=");
        io.reactivex.rxjava3.processors.b.b(sb, this.b, ", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", image=");
        sb.append(this.e);
        sb.append(", isPublic=");
        return defpackage.q0.a(sb, this.f, ')');
    }

    @Override // xsna.r2a
    public final BlockId w() {
        return BlockId.Simple.a(this.b);
    }
}
