package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsShelfView;

/* loaded from: classes3.dex */
public final class n561 implements zo31 {
    public final SavingsShelfView a;
    public final RecyclerView b;
    public final ConstraintLayout c;
    public final YbDivView d;
    public final ImageView e;
    public final View f;
    public final ImageView g;
    public final SpoilerTextView h;
    public final YbDivView i;
    public final TextView j;

    public n561(SavingsShelfView savingsShelfView, RecyclerView recyclerView, ConstraintLayout constraintLayout, YbDivView ybDivView, ImageView imageView, View view, ImageView imageView2, SpoilerTextView spoilerTextView, YbDivView ybDivView2, TextView textView) {
        this.a = savingsShelfView;
        this.b = recyclerView;
        this.c = constraintLayout;
        this.d = ybDivView;
        this.e = imageView;
        this.f = view;
        this.g = imageView2;
        this.h = spoilerTextView;
        this.i = ybDivView2;
        this.j = textView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
