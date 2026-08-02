package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.safety.center.safetycenter_web.ui.loading.SafetyCenterWebLoadingView;
import ru.yandex.taxi.widget.ShimmeringBar;

/* loaded from: classes13.dex */
public final class nvl0 implements zo31 {
    public final SafetyCenterWebLoadingView a;
    public final GoImageView b;
    public final FrameLayout c;
    public final ShimmeringBar d;
    public final ShimmeringBar e;
    public final ShimmeringBar f;

    public nvl0(SafetyCenterWebLoadingView safetyCenterWebLoadingView, GoImageView goImageView, FrameLayout frameLayout, ShimmeringBar shimmeringBar, ShimmeringBar shimmeringBar2, ShimmeringBar shimmeringBar3) {
        this.a = safetyCenterWebLoadingView;
        this.b = goImageView;
        this.c = frameLayout;
        this.d = shimmeringBar;
        this.e = shimmeringBar2;
        this.f = shimmeringBar3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
