package xsna;

import android.view.View;
import com.vk.friends.discover.UserDiscoverState;

/* compiled from: ThirdCardAnimationProvider.kt */
/* loaded from: classes13.dex */
public final class fqo0 extends of6 {
    @Override // xsna.of6
    public final void A(View view, int i, UserDiscoverState userDiscoverState) {
        int i2 = i - 1;
        float f = 1.0f - (i * 0.125f);
        float b = (((thq0) this.a).b(userDiscoverState) * ((1.0f - (0.125f * i2)) - f)) + f;
        view.setScaleX(b);
        view.setScaleY(b);
    }
}
