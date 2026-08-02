package xsna;

import com.vkontakte.android.R;
import com.vkontakte.android.actionlinks.views.fragments.ItemsDialogWrapper;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class xvx implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xvx(ItemsDialogWrapper itemsDialogWrapper, boolean z) {
        this.b = 0;
        this.d = itemsDialogWrapper;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        final boolean z = this.c;
        switch (i) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                int i2 = ItemsDialogWrapper.S;
                qgi0.h(tgi0Var, ((ItemsDialogWrapper) obj2).getString(R.string.done));
                qgi0.r(tgi0Var, "items_done_button");
                qgi0.e(tgi0Var, null, new gzs() { // from class: xsna.yvx
                    @Override // xsna.gzs
                    public final Object invoke() {
                        int i3 = ItemsDialogWrapper.S;
                        return Boolean.valueOf(z);
                    }
                });
                break;
            case 1:
                rw30 rw30Var = (rw30) obj2;
                if (z && rw30Var.p.d.length() > 0) {
                    rw30Var.b1().f(false);
                }
                break;
            default:
                enc0 enc0Var = (enc0) obj2;
                tgi0 tgi0Var2 = (tgi0) obj;
                qgi0.r(tgi0Var2, "PostingNextButton");
                qgi0.h(tgi0Var2, z ? enc0Var.c.getContext().getString(R.string.next_step_toolbar_button_title) : enc0Var.c.getContext().getString(R.string.next_step_toolbar_disabled_button_content_description));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ xvx(boolean z, Object obj, int i) {
        this.b = i;
        this.c = z;
        this.d = obj;
    }
}
