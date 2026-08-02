package xsna;

import com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity;
import com.vkontakte.android.R;
import xsna.lvf0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class bl01 implements lvf0.b {
    public final /* synthetic */ ExpandedControllerActivity b;

    public /* synthetic */ bl01(ExpandedControllerActivity expandedControllerActivity) {
        this.b = expandedControllerActivity;
    }

    @Override // xsna.lvf0.b
    public final void a() {
        this.b.R1();
    }

    @Override // xsna.lvf0.b
    public final void b() {
        ExpandedControllerActivity expandedControllerActivity = this.b;
        lvf0 Q1 = expandedControllerActivity.Q1();
        if (Q1 == null || !Q1.k()) {
            if (expandedControllerActivity.Q) {
                return;
            }
            expandedControllerActivity.finish();
        } else {
            expandedControllerActivity.Q = false;
            expandedControllerActivity.T1();
            expandedControllerActivity.U1();
        }
    }

    @Override // xsna.lvf0.b
    public final void c() {
        this.b.U1();
    }

    @Override // xsna.lvf0.b
    public final void f() {
        ExpandedControllerActivity expandedControllerActivity = this.b;
        expandedControllerActivity.z.setText(expandedControllerActivity.getResources().getString(R.string.cast_expanded_controller_loading));
    }

    @Override // xsna.lvf0.b
    public final void d() {
    }

    @Override // xsna.lvf0.b
    public final void e() {
    }
}
