package defpackage;

import android.content.Context;
import com.yandex.go.safety.center.safetycenter_web.ui.loading.SafetyCenterWebLoadingView;

/* loaded from: classes13.dex */
public final class ovl0 implements ms41 {
    public final uul0 b;
    public final mvl0 c;

    public ovl0(uul0 uul0Var, mvl0 mvl0Var) {
        this.b = uul0Var;
        this.c = mvl0Var;
    }

    @Override // defpackage.ms41
    public final lj41 create(Context context) {
        return new SafetyCenterWebLoadingView((Context) this.c.a.a.get(), this.b);
    }
}
