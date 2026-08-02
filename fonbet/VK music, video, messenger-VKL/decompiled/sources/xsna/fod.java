package xsna;

import android.view.View;
import com.vk.clips.design.view.camera.controls.ClipsControlsView;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: ViewExt.kt */
/* loaded from: classes16.dex */
public final class fod implements View.OnLayoutChangeListener {
    public final /* synthetic */ ClipsControlsView b;
    public final /* synthetic */ boolean c;

    public fod(ClipsControlsView clipsControlsView, boolean z) {
        this.b = clipsControlsView;
        this.c = z;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        ClipsControlsView clipsControlsView = this.b;
        View[] viewArr = clipsControlsView.y;
        clipsControlsView.v = true;
        if (!this.c) {
            ArrayList arrayList = new ArrayList();
            for (View view2 : viewArr) {
                if (!epx.f(view2, clipsControlsView.findViewById(R.id.camera_clips_controls_tip_settings))) {
                    arrayList.add(view2);
                }
            }
            viewArr = (View[]) arrayList.toArray(new View[0]);
        }
        dod.c(viewArr, new gy(clipsControlsView, 6));
    }
}
