package defpackage;

import android.view.View;
import androidx.core.view.b;
import java.util.WeakHashMap;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;

/* loaded from: classes2.dex */
public final class n290 extends a62 {
    public final long A;
    public final int w;
    public final int x;
    public final g191 y;
    public final int z;

    public n290(View view, int i, int i2, int i3, g191 g191Var) {
        super(view, i);
        this.w = i2;
        this.x = i3;
        this.y = g191Var;
        this.z = view != null ? view.getTop() : 0;
        this.A = System.currentTimeMillis();
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnchorBottomSheetBehavior anchorBottomSheetBehavior = (AnchorBottomSheetBehavior) this.y.a;
        View view = this.a;
        if (view == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.A;
        boolean z = currentTimeMillis > 1300;
        int i = this.w;
        if (!z) {
            int i2 = this.x;
            if (currentTimeMillis <= 800) {
                i = (int) (((i2 - r3) * (currentTimeMillis / 800.0f)) + this.z);
            } else {
                i = (int) (((i - i2) * ((currentTimeMillis - 800) / 500.0f)) + i2);
            }
        }
        int top = i - view.getTop();
        WeakHashMap weakHashMap = b.a;
        view.offsetTopAndBottom(top);
        anchorBottomSheetBehavior.v(i, null);
        if (z) {
            anchorBottomSheetBehavior.Q(this.b, false);
        } else {
            view.postOnAnimation(this);
        }
    }
}
