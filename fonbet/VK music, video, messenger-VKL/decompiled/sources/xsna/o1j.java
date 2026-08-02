package xsna;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: ConfigureRoomsView.kt */
/* loaded from: classes7.dex */
public final class o1j extends FrameLayout {

    /* compiled from: ConfigureRoomsView.kt */
    public interface a {
        void a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setContentView(View view) {
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(i < getChildCount())) {
                if (z) {
                    return;
                }
                addView(view, new FrameLayout.LayoutParams(-1, -2));
                a aVar = view instanceof a ? (a) view : null;
                if (aVar != null) {
                    aVar.a();
                    return;
                }
                return;
            }
            int i2 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.equals(view)) {
                i = i2;
                z = true;
            } else {
                removeView(childAt);
                i = i2;
            }
        }
    }
}
