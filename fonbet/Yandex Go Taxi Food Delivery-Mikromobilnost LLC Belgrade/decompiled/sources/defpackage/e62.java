package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;

/* loaded from: classes9.dex */
public final class e62 extends kq31 {
    public final /* synthetic */ AnchorBottomSheetBehavior a;

    public e62(AnchorBottomSheetBehavior anchorBottomSheetBehavior) {
        this.a = anchorBottomSheetBehavior;
    }

    @Override // defpackage.kq31
    public final int a(View view, int i) {
        return view.getLeft();
    }

    @Override // defpackage.kq31
    public final int b(View view, int i, int i2) {
        Integer f;
        AnchorBottomSheetBehavior anchorBottomSheetBehavior = this.a;
        if (!anchorBottomSheetBehavior.W && i2 > 0 && i >= anchorBottomSheetBehavior.w(anchorBottomSheetBehavior.w.length - 1) - i2) {
            return anchorBottomSheetBehavior.w(anchorBottomSheetBehavior.w.length - 1);
        }
        if (!anchorBottomSheetBehavior.Z && i2 > 0) {
            int i3 = i + i2;
            int i4 = anchorBottomSheetBehavior.A;
            if (i3 >= i4) {
                return i4;
            }
        }
        v52 v52Var = anchorBottomSheetBehavior.q0;
        if (v52Var != null && (f = v52Var.f(i, i2)) != null) {
            return f.intValue();
        }
        int i5 = anchorBottomSheetBehavior.z;
        return i < i5 ? i5 : Math.min(i, anchorBottomSheetBehavior.C ? anchorBottomSheetBehavior.K : anchorBottomSheetBehavior.A);
    }

    @Override // defpackage.kq31
    public final int d() {
        int i;
        int i2;
        AnchorBottomSheetBehavior anchorBottomSheetBehavior = this.a;
        if (anchorBottomSheetBehavior.C && anchorBottomSheetBehavior.Z) {
            i = anchorBottomSheetBehavior.K;
            i2 = anchorBottomSheetBehavior.z;
        } else {
            i = anchorBottomSheetBehavior.A;
            i2 = anchorBottomSheetBehavior.z;
        }
        return i - i2;
    }

    @Override // defpackage.kq31
    public final void h(int i) {
        if (i == 1) {
            this.a.Q(1, false);
        }
    }

    @Override // defpackage.kq31
    public final void i(View view, int i, int i2) {
        this.a.v(i2, null);
    }

    @Override // defpackage.kq31
    public final void j(View view, float f, float f2) {
        this.a.B(f, f2, view);
    }

    @Override // defpackage.kq31
    public final boolean k(int i, View view) {
        AnchorBottomSheetBehavior anchorBottomSheetBehavior = this.a;
        int i2 = anchorBottomSheetBehavior.E;
        if (i2 == 1 || i2 == 7 || anchorBottomSheetBehavior.Q) {
            return false;
        }
        if (i2 == 3 && anchorBottomSheetBehavior.O == i) {
            WeakReference weakReference = anchorBottomSheetBehavior.M;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        WeakReference weakReference2 = anchorBottomSheetBehavior.L;
        return weakReference2 != null && weakReference2.get() == view;
    }
}
