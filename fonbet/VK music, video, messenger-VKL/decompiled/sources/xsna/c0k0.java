package xsna;

import android.view.View;
import com.vk.superapp.browser.ui.slide.bottomsheet.SlideBottomSheetBehavior;

/* compiled from: SlideBottomSheetBehavior.java */
/* loaded from: classes6.dex */
public final class c0k0 implements Runnable {
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;
    public final /* synthetic */ SlideBottomSheetBehavior d;

    public c0k0(SlideBottomSheetBehavior slideBottomSheetBehavior, View view, int i) {
        this.d = slideBottomSheetBehavior;
        this.b = view;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.b;
        this.d.F(this.c, view);
    }
}
