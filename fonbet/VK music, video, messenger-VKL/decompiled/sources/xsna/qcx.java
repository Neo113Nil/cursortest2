package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import java.util.Iterator;
import java.util.List;
import xsna.xnt0;

/* compiled from: InteractiveVideoUnderModalBottomSheetResizer.kt */
/* loaded from: classes14.dex */
public final class qcx extends xnt0.a {
    public final ViewGroup a;
    public final View b;
    public final List<View> c;
    public boolean d;
    public boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public qcx(ViewGroup viewGroup, View view, List<? extends View> list) {
        this.a = viewGroup;
        this.b = view;
        this.c = list;
        this.e = iah0.s(viewGroup.getContext());
        viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xsna.pcx
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                qcx qcxVar = qcx.this;
                boolean z = qcxVar.e;
                boolean s = iah0.s(qcxVar.a.getContext());
                qcxVar.e = s;
                if (z != s) {
                    qcxVar.e(qcxVar.b, qcxVar.d);
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
                ((View) it.next()).setLayoutParams(new FrameLayout.LayoutParams(-1, viewGroup.getMeasuredHeight()));
            }
            return;
        }
        if (z) {
            f4m.v(0, viewGroup);
            f4m.w(view.getMeasuredWidth(), viewGroup);
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setLayoutParams(new FrameLayout.LayoutParams(viewGroup.getWidth(), -1));
            }
            return;
        }
        f4m.v(0, viewGroup);
        f4m.w(0, viewGroup);
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // xsna.xnt0.a, com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void a(View view, float f) {
    }

    @Override // xsna.xnt0.a, com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void b(int i, View view) {
    }
}
