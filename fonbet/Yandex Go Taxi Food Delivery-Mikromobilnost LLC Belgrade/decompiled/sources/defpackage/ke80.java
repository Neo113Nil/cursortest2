package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoFrameLayout;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes13.dex */
public final class ke80 extends c8c0 {
    public final boolean b;
    public final lf80 c;
    public final oe80 d;

    public ke80(boolean z, lf80 lf80Var, oe80 oe80Var) {
        this.b = z;
        this.c = lf80Var;
        this.d = oe80Var;
    }

    @Override // defpackage.c8c0
    public final View a(ViewGroup viewGroup, z7c0 z7c0Var, z7c0 z7c0Var2) {
        GoFrameLayout goFrameLayout = new GoFrameLayout(viewGroup.getContext(), null, 0, 0, 14, null);
        goFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c.z(new bm50(11, z7c0Var, this), goFrameLayout);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(vuh0.organizations_error_loading_container, (ViewGroup) goFrameLayout, false);
        goFrameLayout.addView(inflate);
        LinearLayout linearLayout = px6.o(inflate).b;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        boolean z = this.b;
        layoutParams.gravity = z ? 48 : 16;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        linearLayout.setMinimumHeight(z ? (int) (xw31.v() * this.c.b) : 0);
        return goFrameLayout;
    }
}
