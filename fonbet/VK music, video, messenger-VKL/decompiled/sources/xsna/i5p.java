package xsna;

import android.view.View;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class i5p implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ i5p(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        View view = this.c;
        etv0 etv0Var = (etv0) obj;
        switch (i) {
            case 0:
                etv0Var.b(false);
                view.performClick();
                break;
            default:
                int i2 = VideoNewProfileHeaderViewV2.y;
                etv0Var.b(false);
                view.performClick();
                break;
        }
        return s3q0.a;
    }
}
