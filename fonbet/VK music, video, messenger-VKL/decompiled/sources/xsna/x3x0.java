package xsna;

import android.widget.FrameLayout;
import com.vk.voip.api.id.CallId;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class x3x0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x3x0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                CallId callId = (CallId) obj;
                return (callId == null || callId.c) ? com.vk.voip.ui.c.r.b() : callId;
            default:
                int i2 = WriteBar.h0;
                return (FrameLayout) ((WriteBar) obj).findViewById(R.id.writebar_left_button_container);
        }
    }
}
