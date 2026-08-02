package xsna;

import java.util.ArrayList;

/* compiled from: ReactionsFeedPhotosBlockHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class b5f0 extends ol60 {
    public final ArrayList h;
    public final int i;
    public final c5f0 j;

    public b5f0(ArrayList arrayList, int i, c5f0 c5f0Var) {
        super(1108, 0, i, 0, null);
        this.h = arrayList;
        this.i = i;
        this.j = c5f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5f0)) {
            return false;
        }
        b5f0 b5f0Var = (b5f0) obj;
        return epx.f(this.h, b5f0Var.h) && this.i == b5f0Var.i && epx.f(this.j, b5f0Var.j);
    }

    @Override // xsna.ol60
    public final int f() {
        return this.i;
    }

    public final int hashCode() {
        return this.j.a.hashCode() + shy.a(this.i, this.h.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ReactionsFeedPhotosBlockHolderUiDto(items=" + this.h + ", seqId=" + this.i + ", raw=" + this.j + ')';
    }
}
