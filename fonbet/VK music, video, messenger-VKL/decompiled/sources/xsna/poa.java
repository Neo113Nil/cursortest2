package xsna;

import androidx.compose.runtime.a;

/* compiled from: CellSkeleton.kt */
/* loaded from: classes17.dex */
public interface poa {

    /* compiled from: CellSkeleton.kt */
    public static final class a {
        public static uzy a(c cVar, nkg nkgVar, androidx.compose.runtime.a aVar, int i) {
            if ((i & 2) != 0) {
                nkgVar = null;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-267883156, 384, -1, "com.vk.core.compose.component.cell.skeleton.CellSkeleton.Left.Companion.invoke (CellSkeleton.kt:22)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1016166035, 6, -1, "com.vk.core.compose.component.cell.skeleton.remember (LeftImpl.kt:41)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new uzy(cVar, nkgVar);
                aVar.R(x);
            }
            uzy uzyVar = (uzy) x;
            ((zak0) uzyVar.a).setValue(cVar);
            ((zak0) uzyVar.b).setValue(nkgVar);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return uzyVar;
        }
    }

    /* compiled from: CellSkeleton.kt */
    public interface b {
        void a(int i, androidx.compose.runtime.a aVar);
    }

    /* compiled from: CellSkeleton.kt */
    public interface c extends poa {
    }

    void a(int i, androidx.compose.runtime.a aVar);
}
