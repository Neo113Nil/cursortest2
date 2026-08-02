package defpackage;

import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.BaseProgressIndicator;

/* loaded from: classes11.dex */
public final class l85 extends Animatable2Compat.a {
    public final /* synthetic */ BaseProgressIndicator b;

    public l85(BaseProgressIndicator baseProgressIndicator) {
        this.b = baseProgressIndicator;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.a
    public final void a(Drawable drawable) {
        int i;
        boolean z;
        BaseProgressIndicator baseProgressIndicator = this.b;
        baseProgressIndicator.setIndeterminate(false);
        i = baseProgressIndicator.storedProgress;
        z = baseProgressIndicator.storedProgressAnimated;
        baseProgressIndicator.setProgressCompat(i, z);
    }
}
