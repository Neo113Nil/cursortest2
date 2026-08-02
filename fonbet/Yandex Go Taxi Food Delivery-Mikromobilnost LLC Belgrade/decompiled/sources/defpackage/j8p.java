package defpackage;

import android.view.View;
import com.ybsdk.core.stories.StoriesComponentView;

/* loaded from: classes3.dex */
public final class j8p implements jt31 {
    @Override // defpackage.jt31
    public final void c(float f, View view) {
        StoriesComponentView storiesComponentView = (StoriesComponentView) view.findViewById(ybh0.storiesView);
        if (storiesComponentView != null) {
            storiesComponentView.setAlpha(1.0f - Math.min(1.0f, Math.abs(f)));
        }
    }
}
