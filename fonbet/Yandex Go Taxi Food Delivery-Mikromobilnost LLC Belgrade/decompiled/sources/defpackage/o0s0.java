package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.yandex.go.shortcuts.impl.router.b;
import ru.yandex.taxi.coordinator.BottomSheetFloatButtonBehavior;

/* loaded from: classes13.dex */
public final class o0s0 {
    public final i4s0 a;
    public final /* synthetic */ b b;

    public o0s0(b bVar, i4s0 i4s0Var) {
        this.b = bVar;
        this.a = i4s0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(eor eorVar) {
        wdz wdzVar = this.b.e;
        wdzVar.getClass();
        if (wdzVar instanceof m980) {
            return;
        }
        View view = (View) eorVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        CoordinatorLayout.LayoutParams layoutParams2 = layoutParams != null ? new CoordinatorLayout.LayoutParams(layoutParams) : new CoordinatorLayout.LayoutParams(-2, -2);
        layoutParams2.setBehavior(new BottomSheetFloatButtonBehavior());
        view.setLayoutParams(layoutParams2);
    }
}
