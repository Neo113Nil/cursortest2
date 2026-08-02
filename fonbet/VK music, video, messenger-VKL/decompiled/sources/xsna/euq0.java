package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: UserProfileRecommendationsViewHolder.kt */
/* loaded from: classes5.dex */
public final class euq0 extends ViewOutlineProvider {
    public final /* synthetic */ int a;

    public euq0(int i) {
        this.a = i;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i = this.a;
        outline.setRoundRect(0, -i, view.getMeasuredWidth(), view.getMeasuredHeight(), i);
    }
}
