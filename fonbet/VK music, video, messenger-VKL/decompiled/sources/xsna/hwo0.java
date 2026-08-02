package xsna;

import android.view.View;
import com.vk.clips.design.view.timeline.TimelineBottomActionsView;

/* compiled from: View.kt */
/* loaded from: classes16.dex */
public final class hwo0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ TimelineBottomActionsView.a b;

    public hwo0(TimelineBottomActionsView.a aVar) {
        this.b = aVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        y6c y6cVar;
        view.removeOnLayoutChangeListener(this);
        TimelineBottomActionsView.a aVar = this.b;
        iwo0 iwo0Var = aVar.o;
        if (iwo0Var == null) {
            iwo0Var = null;
        }
        e5p0 e5p0Var = iwo0Var.e;
        if (e5p0Var == null || (y6cVar = aVar.m) == null) {
            return;
        }
        y6cVar.invoke(e5p0Var, aVar.itemView);
    }
}
