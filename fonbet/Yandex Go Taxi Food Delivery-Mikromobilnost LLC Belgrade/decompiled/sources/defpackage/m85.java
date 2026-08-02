package defpackage;

import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.BaseProgressIndicator;

/* loaded from: classes11.dex */
public final class m85 extends Animatable2Compat.a {
    public final /* synthetic */ BaseProgressIndicator b;

    public m85(BaseProgressIndicator baseProgressIndicator) {
        this.b = baseProgressIndicator;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.a
    public final void a(Drawable drawable) {
        boolean z;
        int i;
        BaseProgressIndicator baseProgressIndicator = this.b;
        z = baseProgressIndicator.isIndeterminateModeChangeRequested;
        if (z) {
            return;
        }
        i = baseProgressIndicator.visibilityAfterHide;
        baseProgressIndicator.setVisibility(i);
    }
}
