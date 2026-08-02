package xsna;

import android.content.Context;
import com.google.android.material.tabs.TabLayout;
import com.vk.core.view.components.segmented.control.VkSegmentedControl;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class dma0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ dma0(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                qgi0.h((tgi0) obj, context.getString(R.string.talkback_pin_btn, "0"));
                return s3q0.a;
            case 1:
                j03.j(context, (Throwable) obj);
                return s3q0.a;
            default:
                int i2 = VkSegmentedControl.B0;
                ((TabLayout.g) obj).h.setPadding(0, 0, 0, 0);
                return new ajv0(context);
        }
    }
}
