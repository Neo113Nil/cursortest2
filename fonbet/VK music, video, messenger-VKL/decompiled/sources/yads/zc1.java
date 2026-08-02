package yads;

import android.content.Context;
import android.view.View;

/* loaded from: classes10.dex */
public final class zc1 implements xc1 {
    @Override // yads.xc1
    public final void a(Context context, View view) {
        view.setVisibility(0);
        view.setMinimumHeight(om3.a(context, 50.0f));
    }

    @Override // yads.xc1
    public final void onAttachedToWindow() {
    }

    @Override // yads.xc1
    public final void onDetachedFromWindow() {
    }
}
