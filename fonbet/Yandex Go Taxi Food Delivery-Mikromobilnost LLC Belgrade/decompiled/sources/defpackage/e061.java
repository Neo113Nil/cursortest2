package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;

/* loaded from: classes2.dex */
public final class e061 implements zo31 {
    public final FrameLayout a;
    public final YbDivView b;
    public final DivSkeletonsView c;
    public final rm d;
    public final wz51 e;

    public e061(FrameLayout frameLayout, YbDivView ybDivView, DivSkeletonsView divSkeletonsView, rm rmVar, wz51 wz51Var) {
        this.a = frameLayout;
        this.b = ybDivView;
        this.c = divSkeletonsView;
        this.d = rmVar;
        this.e = wz51Var;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
