package xsna;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import com.vk.superapp.browser.ui.slide.bottomsheet.SlideBottomSheetBehavior;
import java.lang.ref.Reference;
import java.util.WeakHashMap;

/* compiled from: SlideBottomSheetBehavior.java */
/* loaded from: classes6.dex */
public final class e0k0 implements zm {
    public final /* synthetic */ int b;
    public final /* synthetic */ SlideBottomSheetBehavior c;

    public e0k0(SlideBottomSheetBehavior slideBottomSheetBehavior, int i) {
        this.c = slideBottomSheetBehavior;
        this.b = i;
    }

    @Override // xsna.zm
    public final boolean a(@NonNull View view) {
        SlideBottomSheetBehavior slideBottomSheetBehavior = this.c;
        int i = slideBottomSheetBehavior.g;
        int i2 = this.b;
        if (i2 == i) {
            return true;
        }
        Reference reference = slideBottomSheetBehavior.l;
        if (reference == null) {
            if (i2 != 4 && i2 != 3 && i2 != 6) {
                return true;
            }
            slideBottomSheetBehavior.g = i2;
            return true;
        }
        View view2 = (View) reference.get();
        if (view2 == null) {
            return true;
        }
        ViewParent parent = view2.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (view2.isAttachedToWindow()) {
                view2.post(new c0k0(slideBottomSheetBehavior, view2, i2));
                return true;
            }
        }
        slideBottomSheetBehavior.F(i2, view2);
        return true;
    }
}
