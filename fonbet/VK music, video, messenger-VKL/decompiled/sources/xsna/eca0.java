package xsna;

import androidx.recyclerview.widget.m;
import xsna.fs90;
import xsna.tba0;

/* compiled from: PhotoTagsAdapter.kt */
/* loaded from: classes4.dex */
public final class eca0 {
    public static final a a = new a();

    /* compiled from: PhotoTagsAdapter.kt */
    public static final class a extends m.e<tba0> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(tba0 tba0Var, tba0 tba0Var2) {
            return tba0Var.equals(tba0Var2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(tba0 tba0Var, tba0 tba0Var2) {
            tba0 tba0Var3 = tba0Var;
            tba0 tba0Var4 = tba0Var2;
            if ((tba0Var3 instanceof tba0.a) && (tba0Var4 instanceof tba0.a)) {
                return true;
            }
            return (tba0Var3 instanceof tba0.b) && (tba0Var4 instanceof tba0.b) && ((tba0.b) tba0Var3).a.j == ((tba0.b) tba0Var4).a.j;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final Object getChangePayload(tba0 tba0Var, tba0 tba0Var2) {
            tba0 tba0Var3 = tba0Var;
            tba0 tba0Var4 = tba0Var2;
            return ((tba0Var3 instanceof tba0.b) && (tba0Var4 instanceof tba0.b) && ((tba0.b) tba0Var3).a.n != ((tba0.b) tba0Var4).a.n) ? fs90.b.a : s3q0.a;
        }
    }
}
