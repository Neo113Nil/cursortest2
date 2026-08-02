package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.view.Window;
import com.vkontakte.android.R;
import one.video.controls.view.buttons.CastButton;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ll7 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ ll7(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Window window;
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                return Integer.valueOf(e3m.f(R.attr.vk_ui_image_border_alpha, context));
            case 1:
                int i2 = CastButton.g;
                return (AnimatedVectorDrawable) m33.a(R.drawable.one_video_icon_cast_disconnect_animated_24, context);
            case 2:
                cxn.e(context, "Admin settings");
                return s3q0.a;
            default:
                float f = qy90.T;
                Activity h = e3m.h(context);
                if (h == null || (window = h.getWindow()) == null) {
                    return null;
                }
                return window.getDecorView();
        }
    }

    public /* synthetic */ ll7(cxn cxnVar, Context context) {
        this.b = 2;
        this.c = context;
    }
}
