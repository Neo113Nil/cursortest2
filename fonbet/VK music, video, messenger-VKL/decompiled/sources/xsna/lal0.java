package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: StickersInfoDialog.kt */
/* loaded from: classes6.dex */
public final class lal0 implements fcn {
    public dw20 b;

    /* compiled from: StickersInfoDialog.kt */
    public static final class a {
        public static void a(Context context, int i, int i2, int i3) {
            lal0 lal0Var = new lal0();
            View inflate = LayoutInflater.from(context).inflate(R.layout.dialog_stickers_info_view, (ViewGroup) null);
            ((TextView) inflate.findViewById(R.id.dialog_stickers_info_title)).setText(context.getText(i));
            ((TextView) inflate.findViewById(R.id.dialog_stickers_info_subtitle)).setText(context.getText(i2));
            TextView textView = (TextView) inflate.findViewById(R.id.dialog_stickers_info_action_button);
            textView.setText(context.getText(R.string.stickers_alert_hint_button_text));
            bwt0.i0(textView, new mi10(lal0Var, 26));
            ((ImageView) inflate.findViewById(R.id.dialog_stickers_info_image)).setImageResource(i3);
            bwt0.i0(inflate.findViewById(R.id.dialog_stickers_info_close_button), new xd40(lal0Var, 21));
            lal0Var.b = new dw20.b(context, null).D0(inflate, false).I0(null);
        }
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    @Override // xsna.fcn
    public final void b(boolean z) {
        dw20 dw20Var = this.b;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
    }

    @Override // xsna.fcn
    public final void dismiss() {
        b(false);
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }
}
