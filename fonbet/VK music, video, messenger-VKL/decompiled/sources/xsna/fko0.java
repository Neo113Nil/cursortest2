package xsna;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: TextParams.kt */
/* loaded from: classes4.dex */
public final class fko0 implements g5p, bo00 {
    public final vlo a;
    public final xmo0 b;

    public fko0() {
        this(0);
    }

    @Override // xsna.g5p
    public final boolean I() {
        List<uap> list = this.a.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((uap) it.next()) instanceof zeo0) {
                return false;
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
        return (obj instanceof fko0) && epx.f(this.a, ((fko0) obj).a);
    }

    @Override // xsna.g5p
    public final f5p getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "TextParams(drawingState=" + this.a + ")";
    }

    public fko0(vlo vloVar) {
        this.a = vloVar;
        this.b = xmo0.a;
    }

    public /* synthetic */ fko0(int i) {
        this(new vlo((kif0) null, 3));
    }
}
