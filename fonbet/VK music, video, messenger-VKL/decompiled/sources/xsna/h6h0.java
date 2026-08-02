package xsna;

import android.view.View;
import com.vk.voip.ui.call_list.scheduled.ui.items.ScheduledCallViewItem;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class h6h0 implements Runnable {
    public final /* synthetic */ i6h0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ScheduledCallViewItem.b d;

    public /* synthetic */ h6h0(i6h0 i6h0Var, int i, ScheduledCallViewItem.b bVar) {
        this.b = i6h0Var;
        this.c = i;
        this.d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getClass();
        i6h0 i6h0Var = this.b;
        i6h0Var.itemView.getBottom();
        int bottom = i6h0Var.itemView.getBottom();
        int i = this.c;
        int i2 = i - bottom;
        if (i2 < i) {
            View view = i6h0Var.itemView;
            bwt0.c0(view.getHeight() + i2, view);
        }
    }
}
