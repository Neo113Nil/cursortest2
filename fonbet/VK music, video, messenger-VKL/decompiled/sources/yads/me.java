package yads;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes10.dex */
public final class me implements zf0 {
    public final y00 a;
    public final s02 b;

    public me(y00 y00Var, s02 s02Var) {
        this.a = y00Var;
        this.b = s02Var;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.b.getClass();
        View findViewById = viewGroup.findViewById(R$id.age_divider);
        if (findViewById == null || this.a.f != null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    @Override // yads.zf0
    public final void c() {
    }
}
