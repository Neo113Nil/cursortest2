package xsna;

import android.view.View;
import com.vk.core.view.components.topbar.VkTopBar;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class kcv implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ kcv(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        View view = this.c;
        switch (i) {
            case 0:
                awt0.r((am) obj, view.getContext());
                return s3q0.a;
            default:
                int i2 = VkTopBar.I;
                return view;
        }
    }
}
