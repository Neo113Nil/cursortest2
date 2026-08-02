package xsna;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.c;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: GenericShape.kt */
/* loaded from: classes11.dex */
public final class ujt implements r5j0 {
    public final yzs<Path, mxj0, LayoutDirection, s3q0> a;

    /* JADX WARN: Multi-variable type inference failed */
    public ujt(yzs<? super Path, ? super mxj0, ? super LayoutDirection, s3q0> yzsVar) {
        this.a = yzsVar;
    }

    @Override // xsna.r5j0
    public final androidx.compose.ui.graphics.c a(long j, LayoutDirection layoutDirection, azl azlVar) {
        androidx.compose.ui.graphics.a a = androidx.compose.ui.graphics.b.a();
        this.a.invoke(a, new mxj0(j), layoutDirection);
        a.close();
        return new c.a(a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ujt ujtVar = obj instanceof ujt ? (ujt) obj : null;
        return (ujtVar != null ? ujtVar.a : null) == this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
