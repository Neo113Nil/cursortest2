package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.superapp.discovery.map.impl.ui.main.explorer.ExplorerButtonView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.explorer.ExplorerDistrictCoverageProgressView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.explorer.ExplorerOutlineRobotoTextView;
import ru.yandex.taxi.design.FloatButtonIconComponent;

/* loaded from: classes14.dex */
public final class nvv0 implements zo31 {
    public final GoConstraintLayout a;
    public final FloatButtonIconComponent b;
    public final FloatButtonIconComponent c;
    public final ExplorerDistrictCoverageProgressView d;
    public final ExplorerOutlineRobotoTextView e;
    public final ExplorerButtonView f;
    public final FloatButtonIconComponent g;
    public final RecyclerView h;
    public final FloatButtonIconComponent i;
    public final FloatButtonIconComponent j;
    public final FloatButtonIconComponent k;
    public final GoFrameLayout l;

    public nvv0(GoConstraintLayout goConstraintLayout, FloatButtonIconComponent floatButtonIconComponent, FloatButtonIconComponent floatButtonIconComponent2, ExplorerDistrictCoverageProgressView explorerDistrictCoverageProgressView, ExplorerOutlineRobotoTextView explorerOutlineRobotoTextView, ExplorerButtonView explorerButtonView, FloatButtonIconComponent floatButtonIconComponent3, RecyclerView recyclerView, FloatButtonIconComponent floatButtonIconComponent4, FloatButtonIconComponent floatButtonIconComponent5, FloatButtonIconComponent floatButtonIconComponent6, GoFrameLayout goFrameLayout) {
        this.a = goConstraintLayout;
        this.b = floatButtonIconComponent;
        this.c = floatButtonIconComponent2;
        this.d = explorerDistrictCoverageProgressView;
        this.e = explorerOutlineRobotoTextView;
        this.f = explorerButtonView;
        this.g = floatButtonIconComponent3;
        this.h = recyclerView;
        this.i = floatButtonIconComponent4;
        this.j = floatButtonIconComponent5;
        this.k = floatButtonIconComponent6;
        this.l = goFrameLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
