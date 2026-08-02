package xsna;

import java.util.Collection;
import java.util.List;

/* compiled from: DrawParams.kt */
/* loaded from: classes4.dex */
public final class nio implements g5p, bo00 {
    public final vlo a;
    public final hjo b;

    public nio() {
        this(0);
    }

    @Override // xsna.g5p
    public final boolean I() {
        List<uap> list = this.a.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (uap uapVar : list) {
            if ((uapVar instanceof hq90) || (uapVar instanceof mmb0)) {
                return false;
            }
            if (uapVar instanceof hak0) {
                T t = ((hak0) uapVar).a;
                if ((t instanceof hq90) || (t instanceof mmb0)) {
                    return false;
                }
            }
            if (uapVar instanceof zkp0) {
                throw null;
            }
        }
        return true;
    }

    @Override // xsna.bo00
    public final vlo a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nio) && epx.f(this.a, ((nio) obj).a);
    }

    @Override // xsna.g5p
    public final f5p getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "DrawParams(drawingState=" + this.a + ")";
    }

    public nio(vlo vloVar) {
        this.a = vloVar;
        this.b = hjo.a;
    }

    public /* synthetic */ nio(int i) {
        this(new vlo((kif0) null, 3));
    }
}
