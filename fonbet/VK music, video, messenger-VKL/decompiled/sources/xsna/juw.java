package xsna;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.tabs.b;
import xsna.wdt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class juw implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ juw(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        int i2 = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                int i3 = com.vk.core.view.components.tabs.b.w0;
                b.AbstractC0865b indicator = ((com.vk.core.view.components.tabs.b) obj).getIndicator();
                ViewGroup.LayoutParams layoutParams = indicator.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.width = i2;
                indicator.setLayoutParams(layoutParams2);
                return;
            default:
                ((wdt0.a) obj).a.invoke(Integer.valueOf(i2));
                return;
        }
    }
}
