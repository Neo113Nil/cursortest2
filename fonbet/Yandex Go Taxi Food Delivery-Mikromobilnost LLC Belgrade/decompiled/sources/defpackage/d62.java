package defpackage;

import android.view.View;
import androidx.core.view.b;
import androidx.customview.widget.a;
import com.ybsdk.core.design.coordinator.AnchorBottomSheetBehavior;
import com.ybsdk.core.design.widget.SlideableModalView;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class d62 extends b62 {
    public final /* synthetic */ int c;
    public final /* synthetic */ AnchorBottomSheetBehavior w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d62(AnchorBottomSheetBehavior anchorBottomSheetBehavior, View view, int i, int i2) {
        super(view, i);
        this.c = i2;
        this.w = anchorBottomSheetBehavior;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        int i2 = this.b;
        AnchorBottomSheetBehavior anchorBottomSheetBehavior = this.w;
        View view = this.a;
        switch (i) {
            case 0:
                if (anchorBottomSheetBehavior.Z == this && view != null) {
                    int i3 = (int) anchorBottomSheetBehavior.a.a;
                    int top = i3 - view.getTop();
                    WeakHashMap weakHashMap = b.a;
                    view.offsetTopAndBottom(top);
                    anchorBottomSheetBehavior.w(i3);
                    if (!anchorBottomSheetBehavior.b.f) {
                        anchorBottomSheetBehavior.H(i2, false);
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
                    if (anchorBottomSheetBehavior.Z == this) {
                        ((SlideableModalView) ((wor0) anchorBottomSheetBehavior.V).a).updateBottomSheetBackground();
                        WeakHashMap weakHashMap2 = b.a;
                        view.postOnAnimation(this);
                        break;
                    }
                } else {
                    anchorBottomSheetBehavior.H(i2, false);
                    if (view != null) {
                        jg jgVar = new jg(16, this);
                        WeakHashMap weakHashMap3 = b.a;
                        view.postOnAnimationDelayed(jgVar, 2000L);
                        break;
                    }
                }
                break;
        }
    }
}
