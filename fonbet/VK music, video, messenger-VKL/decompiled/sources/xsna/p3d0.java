package xsna;

import androidx.recyclerview.widget.m;

/* compiled from: PreviewAdapter.kt */
/* loaded from: classes6.dex */
public final class p3d0 {
    public static final a a = new a();

    /* compiled from: PreviewAdapter.kt */
    public static final class a extends m.e<m4d0> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(m4d0 m4d0Var, m4d0 m4d0Var2) {
            return m4d0Var.equals(m4d0Var2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(m4d0 m4d0Var, m4d0 m4d0Var2) {
            return m4d0Var.c.c == m4d0Var2.c.c;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final Object getChangePayload(m4d0 m4d0Var, m4d0 m4d0Var2) {
            m4d0 m4d0Var3 = m4d0Var;
            m4d0 m4d0Var4 = m4d0Var2;
            return m4d0Var3.d != m4d0Var4.d ? d4u0.a : m4d0Var3.b != m4d0Var4.b ? cyj.a : m4d0Var3.a != m4d0Var4.a ? eei0.a : s3q0.a;
        }
    }
}
