package xsna;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.Window;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dhr0;

/* compiled from: AppPickerDialog.kt */
/* loaded from: classes15.dex */
public final class c83 extends kar0 implements dhr0.e {
    public final /* synthetic */ Ref$ObjectRef<b83> A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c83(Context context, Ref$ObjectRef ref$ObjectRef) {
        super(context);
        this.A = ref$ObjectRef;
        dhr0.f(this);
    }

    @Override // xsna.kar0, xsna.too0
    public final void Ng() {
        super.Ng();
        b83 b83Var = this.A.element;
        if (b83Var != null) {
            dhr0.W(b83Var);
            Drawable background = b83Var.getBackground();
            if (background != null) {
                background.setColorFilter(dhr0.t.c(R.attr.vk_ui_background_content), PorterDuff.Mode.MULTIPLY);
            }
        }
        Window window = getWindow();
        if (window != null) {
            dhr0.s0(window);
            fvr.x(window, false);
        }
    }
}
