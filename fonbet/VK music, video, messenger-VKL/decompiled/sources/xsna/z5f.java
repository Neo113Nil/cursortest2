package xsna;

import android.content.Context;
import android.view.ViewConfiguration;
import com.vk.newsfeed.impl.views.ModalCommentsPaginatedView;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class z5f implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ z5f(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                return Integer.valueOf(ViewConfiguration.get(context).getScaledTouchSlop());
            case 1:
                int i2 = ModalCommentsPaginatedView.T;
                return enj.e(R.drawable.vk_icon_lock_outline_56, R.attr.vk_ui_icon_secondary, context);
            case 2:
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.video_autoplay_seekbar_interval_margin));
            case 3:
                return new hnr0(context);
            default:
                return new n4u0(context);
        }
    }
}
