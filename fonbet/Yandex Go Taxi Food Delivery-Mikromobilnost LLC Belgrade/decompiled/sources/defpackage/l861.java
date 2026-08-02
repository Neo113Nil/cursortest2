package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class l861 implements zo31 {
    public final ConstraintLayout a;
    public final TextView b;
    public final RecyclerView c;
    public final TextView d;
    public final TextView e;

    public l861(ConstraintLayout constraintLayout, TextView textView, RecyclerView recyclerView, TextView textView2, TextView textView3) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = recyclerView;
        this.d = textView2;
        this.e = textView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
