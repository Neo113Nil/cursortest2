package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vkontakte.android.R;
import xsna.dw20;
import xsna.eeu0;

/* compiled from: ClipsDescriptionEditController.kt */
/* loaded from: classes17.dex */
public final class iqd implements w8i {
    public final Context b;
    public final zih0 c;
    public dw20 d;

    /* compiled from: ClipsDescriptionEditController.kt */
    public static final class a extends dw20 {

        /* compiled from: ClipsDescriptionEditController.kt */
        /* renamed from: xsna.iqd$a$a, reason: collision with other inner class name */
        public static final class C3073a extends dw20.b {
            @Override // xsna.dw20.b, xsna.dw20.a
            public final dw20 f() {
                return new a();
            }
        }

        /* compiled from: ClipsDescriptionEditController.kt */
        public static final class b extends nw20 {
            @Override // xsna.nw20, xsna.b33, xsna.y8i, android.app.Dialog
            public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
                super.setContentView(view, layoutParams);
                ImageView imageView = (ImageView) findViewById(R.id.ivClose);
                if (imageView != null) {
                    imageView.setColorFilter(e3m.f(R.attr.vk_ui_icon_accent_themed, imageView.getContext()));
                }
                ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior = this.i;
                if (modalBottomSheetBehavior != null) {
                    modalBottomSheetBehavior.D = false;
                }
            }
        }

        @Override // xsna.dw20
        public final nw20 Fn(int i, Context context) {
            return new b(context, i);
        }
    }

    public iqd(Context context, p5f p5fVar, zih0 zih0Var) {
        this.b = context;
        this.c = zih0Var;
    }

    public final void a(String str, String str2) {
        if (epx.f(str, str2)) {
            dw20 dw20Var = this.d;
            if (dw20Var != null) {
                dw20Var.hide();
                return;
            }
            return;
        }
        eeu0.a aVar = new eeu0.a(this.b);
        aVar.B(R.string.clips_edit_description_exit_alert_title);
        aVar.q(R.string.clips_edit_description_exit_alert_message);
        aVar.setNegativeButton(R.string.clips_edit_description_exit_alert_cancel, new o1c());
        aVar.setPositiveButton(R.string.clips_edit_description_exit_alert_exit, new hqd(this, 0));
        aVar.m();
    }
}
