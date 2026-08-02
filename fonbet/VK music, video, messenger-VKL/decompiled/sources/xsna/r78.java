package xsna;

import android.view.View;
import com.vk.core.tips.Tooltip;
import com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment;
import com.vkontakte.android.R;
import xsna.nzl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class r78 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ r78(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        View view = this.c;
        switch (i) {
            case 0:
                nzl.a aVar = BottomSheetCommentsFragment.f1;
                ucp.f(view);
                return s3q0.a;
            default:
                int a = iah0.a(-6);
                abg0 abg0Var = dhr0.t;
                return new Tooltip.f(abg0Var.c(R.attr.vk_ui_background_modal), Integer.valueOf(abg0Var.c(R.attr.vk_ui_text_primary)), null, 48, new zn2(view, 3), a, 32481145);
        }
    }
}
