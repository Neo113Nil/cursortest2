package xsna;

import android.view.View;
import com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class be01 implements View.OnClickListener {
    public final /* synthetic */ ExpandedControllerActivity b;

    public be01(ExpandedControllerActivity expandedControllerActivity) {
        this.b = expandedControllerActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        lvf0 Q1;
        ExpandedControllerActivity expandedControllerActivity = this.b;
        if (!expandedControllerActivity.K.isClickable() || (Q1 = expandedControllerActivity.Q1()) == null) {
            return;
        }
        exc0.e("Must be called from the main thread.");
        if (Q1.H()) {
            lvf0.J(new zp01(Q1));
        } else {
            lvf0.G();
        }
    }
}
