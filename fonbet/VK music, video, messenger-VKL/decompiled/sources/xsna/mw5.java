package xsna;

import androidx.recyclerview.widget.m;

/* compiled from: BackgroundChooseItem.kt */
/* loaded from: classes2.dex */
public abstract class mw5 implements t1c {
    public static final a a = new a();

    /* compiled from: BackgroundChooseItem.kt */
    public static final class a extends m.e<mw5> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(mw5 mw5Var, mw5 mw5Var2) {
            return mw5Var.equals(mw5Var2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(mw5 mw5Var, mw5 mw5Var2) {
            return epx.f(mw5Var.a(), mw5Var2.a());
        }
    }

    public abstract String a();
}
