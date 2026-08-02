package defpackage;

import android.content.Context;
import android.util.TypedValue;
import yads.oa1;

/* loaded from: classes7.dex */
public final class i881 implements p181 {
    @Override // defpackage.p181
    public final void c(Context context, oa1 oa1Var) {
        oa1Var.setVisibility(0);
        oa1Var.setMinimumHeight(m810.b(TypedValue.applyDimension(1, 50.0f, context.getResources().getDisplayMetrics())));
    }

    @Override // defpackage.p181
    public final void onAttachedToWindow() {
    }

    @Override // defpackage.p181
    public final void onDetachedFromWindow() {
    }
}
