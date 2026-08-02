package xsna;

import androidx.recyclerview.widget.m;

/* compiled from: SelectAlbumAdapter.kt */
/* loaded from: classes4.dex */
public final class g6i0 {
    public static final a a = new a();

    /* compiled from: SelectAlbumAdapter.kt */
    public static final class a extends m.e<j6i0> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(j6i0 j6i0Var, j6i0 j6i0Var2) {
            return j6i0Var.d() == j6i0Var2.d();
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(j6i0 j6i0Var, j6i0 j6i0Var2) {
            return j6i0Var.getId() == j6i0Var2.getId();
        }

        @Override // androidx.recyclerview.widget.m.e
        public final /* bridge */ /* synthetic */ Object getChangePayload(j6i0 j6i0Var, j6i0 j6i0Var2) {
            return s3q0.a;
        }
    }
}
