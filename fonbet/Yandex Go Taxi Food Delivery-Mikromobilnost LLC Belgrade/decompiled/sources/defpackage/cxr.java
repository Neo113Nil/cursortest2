package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class cxr {
    public final List a;
    public final boolean b;
    public final boolean c;
    public final int d;

    public cxr(int i, List list, boolean z, boolean z2) {
        this.a = list;
        this.b = z;
        this.c = z2;
        this.d = i;
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator it = list2.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (!((dxr) it.next()).a() && (i2 = i2 + 1) < 0) {
                scc.l();
                throw null;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxr)) {
            return false;
        }
        cxr cxrVar = (cxr) obj;
        return jl40.l(this.a, cxrVar.a) && this.b == cxrVar.b && this.c == cxrVar.c && this.d == cxrVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + unr0.e(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "FoldersEditorUiState(items=" + this.a + ", isEditMode=" + this.b + ", showMainFolderModal=" + this.c + ", maxLimitFolderCount=" + this.d + Extension.C_BRAKE;
    }

    public cxr() {
        this(null, 15);
    }

    public /* synthetic */ cxr(List list, int i) {
        this(10, (i & 1) != 0 ? EmptyList.a : list, (i & 2) == 0, false);
    }
}
