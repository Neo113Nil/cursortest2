package xsna;

import android.view.View;
import com.vk.core.view.VKTabLayout;

/* compiled from: View.kt */
/* loaded from: classes16.dex */
public final class mlr implements Runnable {
    public final /* synthetic */ View b;
    public final /* synthetic */ VKTabLayout c;
    public final /* synthetic */ int d;

    public mlr(View view, VKTabLayout vKTabLayout, int i) {
        this.b = view;
        this.c = vKTabLayout;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VKTabLayout vKTabLayout = this.c;
        if (vKTabLayout.getTabCount() == 1) {
            int paddingTop = vKTabLayout.getPaddingTop();
            int paddingBottom = vKTabLayout.getPaddingBottom();
            View view = this.b;
            int i = this.d;
            view.setPadding(i, paddingTop, i, paddingBottom);
        }
    }
}
