package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.my.target.nativeads.views.CollageView;
import com.vk.libvideo.design.view.duration.DurationView;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: ViewExt.kt */
/* loaded from: classes4.dex */
public final class ucq implements View.OnLayoutChangeListener {
    public final /* synthetic */ Map b;
    public final /* synthetic */ CollageView c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ FrameLayout.LayoutParams e;

    public ucq(Map map, CollageView collageView, ArrayList arrayList, FrameLayout.LayoutParams layoutParams) {
        this.b = map;
        this.c = collageView;
        this.d = arrayList;
        this.e = layoutParams;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        for (Map.Entry entry : this.b.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            String str = (String) entry.getValue();
            FrameLayout a = this.c.a(intValue);
            if (a != null) {
                DurationView durationView = (DurationView) this.d.get(intValue);
                if (a.getWidth() > iah0.a(120)) {
                    durationView.setText(str);
                } else {
                    durationView.setText("");
                }
                ViewParent parent = durationView.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(durationView);
                }
                a.addView(durationView, this.e);
            }
        }
    }
}
