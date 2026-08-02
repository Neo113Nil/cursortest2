package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.view.GuidelineItemView;

/* loaded from: classes3.dex */
public final class ka61 implements zo31 {
    public final GuidelineItemView a;
    public final ImageView b;
    public final TextView c;

    public ka61(GuidelineItemView guidelineItemView, ImageView imageView, TextView textView) {
        this.a = guidelineItemView;
        this.b = imageView;
        this.c = textView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
