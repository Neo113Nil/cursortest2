package defpackage;

import android.view.View;
import androidx.core.view.b;
import com.ybsdk.core.design.coordinator.AnchorBottomSheetBehavior;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class o290 extends b62 {
    public final int c;
    public final int w;
    public final int x;
    public final ddf y;
    public final long z;

    public o290(View view, int i, int i2, int i3, ddf ddfVar) {
        super(view, i);
        this.c = i2;
        this.w = i3;
        this.x = view != null ? view.getTop() : 0;
        this.y = ddfVar;
        this.z = System.currentTimeMillis();
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.a;
        if (view == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.z;
        boolean z = currentTimeMillis > 1300;
        int i = this.c;
        if (!z) {
            int i2 = this.w;
            if (currentTimeMillis <= 800) {
                i = (int) (((i2 - r2) * (currentTimeMillis / 800.0f)) + this.x);
            } else {
                i = (int) (((i - i2) * ((currentTimeMillis - 800) / 500.0f)) + i2);
            }
        }
        int top = i - view.getTop();
        WeakHashMap weakHashMap = b.a;
        view.offsetTopAndBottom(top);
        ddf ddfVar = this.y;
        ((AnchorBottomSheetBehavior) ddfVar.b).w(i);
        if (z) {
            ((AnchorBottomSheetBehavior) ddfVar.b).H(this.b, false);
        } else {
            view.postOnAnimation(this);
        }
    }
}
