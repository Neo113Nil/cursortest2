package xsna;

import android.view.View;
import com.vk.content.design.view.camera.MasksWrap;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import one.video.controls.view.ZoomRateView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class pi10 implements o7j {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ pi10(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // xsna.o7j
    public final void accept(Object obj) {
        int i = this.b;
        View view = this.c;
        switch (i) {
            case 0:
                List<? extends hfz> list = (List) obj;
                o9e o9eVar = ((MasksWrap) view).J;
                if (o9eVar != null) {
                    o9eVar.e(list);
                    break;
                }
                break;
            default:
                ZoomRateView zoomRateView = (ZoomRateView) view;
                w6y0 w6y0Var = (w6y0) obj;
                int i2 = ZoomRateView.c;
                if (!w6y0Var.b) {
                    zoomRateView.setVisibility(w6y0Var.a ? 0 : 8);
                }
                if (zoomRateView.getVisibility() == 0) {
                    zoomRateView.setText(String.format(Locale.US, "%.1fx", Arrays.copyOf(new Object[]{Float.valueOf(w6y0Var.c)}, 1)));
                    break;
                }
                break;
        }
    }
}
