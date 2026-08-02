package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import java.util.Iterator;
import java.util.List;
import xsna.xnt0;

/* compiled from: VideoUnderModalBottomSheetResizer.kt */
/* loaded from: classes14.dex */
public final class bot0 extends xnt0.a {
    public final ViewGroup a;
    public final View b;
    public final List<View> c;
    public boolean d;
    public boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public bot0(ViewGroup viewGroup, View view, List<? extends View> list) {
        this.a = viewGroup;
        this.b = view;
        this.c = list;
        this.e = iah0.s(viewGroup.getContext());
        viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xsna.aot0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                bot0 bot0Var = bot0.this;
                boolean z = bot0Var.e;
                boolean s = iah0.s(bot0Var.a.getContext());
                bot0Var.e = s;
                if (z != s) {
                    bot0Var.e(bot0Var.b, bot0Var.d);
                }
            }
        });
    }

    @Override // xsna.xnt0.a
    public final void d(View view, float f) {
        boolean z = this.d;
        boolean z2 = f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.d = z2;
        if (z != z2) {
            e(view, z2);
        }
    }

    public final void e(View view, boolean z) {
        int measuredHeight;
        ViewGroup viewGroup = this.a;
        viewGroup.setClipToPadding(!z);
        viewGroup.setClipChildren(!z);
        List<View> list = this.c;
        if (z && this.e) {
            try {
                measuredHeight = ModalBottomSheetBehavior.H(view).L();
            } catch (Exception unused) {
                measuredHeight = view.getMeasuredHeight();
            }
            f4m.v(measuredHeight, viewGroup);
            f4m.w(0, viewGroup);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                cot0.a(-1, viewGroup.getMeasuredHeight(), (View) it.next());
            }
            return;
        }
        if (!z) {
            f4m.v(0, viewGroup);
            f4m.w(0, viewGroup);
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                cot0.a(-1, -1, (View) it2.next());
            }
            return;
        }
        f4m.v(0, viewGroup);
        f4m.w(view.getMeasuredWidth(), viewGroup);
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            cot0.a(viewGroup.getWidth(), -1, (View) it3.next());
        }
    }

    @Override // xsna.xnt0.a, com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void a(View view, float f) {
    }

    @Override // xsna.xnt0.a, com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void b(int i, View view) {
    }
}
