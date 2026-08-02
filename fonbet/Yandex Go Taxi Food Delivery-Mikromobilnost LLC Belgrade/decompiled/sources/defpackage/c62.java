package defpackage;

import android.view.View;
import androidx.core.view.b;
import androidx.customview.widget.a;
import java.util.WeakHashMap;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;

/* loaded from: classes2.dex */
public final class c62 extends a62 {
    public final /* synthetic */ int w;
    public final /* synthetic */ AnchorBottomSheetBehavior x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c62(AnchorBottomSheetBehavior anchorBottomSheetBehavior, View view, int i, int i2) {
        super(view, i);
        this.w = i2;
        this.x = anchorBottomSheetBehavior;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.w;
        int i2 = this.b;
        AnchorBottomSheetBehavior anchorBottomSheetBehavior = this.x;
        View view = this.a;
        switch (i) {
            case 0:
                if (jl40.l(anchorBottomSheetBehavior.h0, this) && view != null) {
                    int i3 = (int) anchorBottomSheetBehavior.j0.a;
                    int top = i3 - view.getTop();
                    WeakHashMap weakHashMap = b.a;
                    view.offsetTopAndBottom(top);
                    anchorBottomSheetBehavior.v(i3, null);
                    if (!anchorBottomSheetBehavior.k0.f) {
                        anchorBottomSheetBehavior.Q(i2, false);
                        break;
                    } else {
                        view.postOnAnimation(this);
                        break;
                    }
                }
                break;
            default:
                a aVar = anchorBottomSheetBehavior.F;
                if (aVar != null && aVar.h() && view != null) {
                    if (jl40.l(anchorBottomSheetBehavior.h0, this)) {
                        view.postOnAnimation(this);
                        break;
                    }
                } else {
                    anchorBottomSheetBehavior.Q(i2, false);
                    break;
                }
                break;
        }
    }
}
