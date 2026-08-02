package xsna;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import com.vkontakte.android.R;
import one.video.controls.view.buttons.CastButton;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class hz9 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ hz9(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                int i2 = CastButton.g;
                return (AnimatedVectorDrawable) m33.a(R.drawable.one_video_icon_cast_connect_animated_24, context);
            default:
                hd60.a().h1(context);
                return s3q0.a;
        }
    }
}
