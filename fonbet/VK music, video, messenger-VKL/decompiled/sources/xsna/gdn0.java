package xsna;

import android.view.View;
import com.vkontakte.android.R;

/* compiled from: SuperAppWidgetSectionButtonHolder.kt */
/* loaded from: classes6.dex */
public final class gdn0 extends hf6<fdn0> {
    public final u7n0 m;
    public final View n;

    public gdn0(View view, u7n0 u7n0Var) {
        super(view);
        this.m = u7n0Var;
        View findViewById = this.itemView.findViewById(R.id.container);
        this.n = findViewById;
        findViewById.setOnClickListener(new ybq(this, 7));
    }

    @Override // xsna.hf6
    public final void W5(fdn0 fdn0Var) {
        throw null;
    }
}
