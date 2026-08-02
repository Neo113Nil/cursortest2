package xsna;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class j3g implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ j3g(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new e1g(this.c);
            default:
                Context context = this.c;
                LinearLayout linearLayout = new LinearLayout(context);
                int a = e3m.a(R.dimen.vk_ui_base_padding_horizontal, context);
                int a2 = e3m.a(R.dimen.vk_ui_spacing_size_l, context);
                int a3 = e3m.a(R.dimen.vk_ui_base_padding_horizontal, context);
                int a4 = e3m.a(R.dimen.vk_ui_spacing_size_l, context);
                linearLayout.setOrientation(0);
                linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                linearLayout.setGravity(16);
                linearLayout.setPadding(a, a2, a3, a4);
                return linearLayout;
        }
    }
}
