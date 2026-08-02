package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.view.TransfersDashboardErrorView;

/* loaded from: classes3.dex */
public final class ma61 implements zo31 {
    public final FrameLayout a;
    public final DivSkeletonsView b;
    public final YbDivView c;
    public final TransfersDashboardErrorView d;
    public final n961 e;
    public final n961 f;

    public ma61(FrameLayout frameLayout, DivSkeletonsView divSkeletonsView, YbDivView ybDivView, TransfersDashboardErrorView transfersDashboardErrorView, n961 n961Var, n961 n961Var2) {
        this.a = frameLayout;
        this.b = divSkeletonsView;
        this.c = ybDivView;
        this.d = transfersDashboardErrorView;
        this.e = n961Var;
        this.f = n961Var2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
