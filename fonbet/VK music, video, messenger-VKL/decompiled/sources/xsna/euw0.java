package xsna;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.dw20;

/* compiled from: VoipParticipantsAddUserOptionsModalDialog.kt */
/* loaded from: classes7.dex */
public final class euw0 extends dw20 {
    public static final /* synthetic */ int f1 = 0;

    /* compiled from: VoipParticipantsAddUserOptionsModalDialog.kt */
    public static final class a extends dw20.b {
        public final boolean e;

        public a(Context context, boolean z) {
            super(context, tzp0.a(null, 3));
            this.e = z;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            euw0 euw0Var = new euw0();
            euw0Var.setArguments(yfb.b(new Pair("key_show_add_by_qr_button", Boolean.valueOf(this.e))));
            return euw0Var;
        }
    }

    public final TextView Yn(int i, int i2, gzs gzsVar) {
        TextView textView = new TextView(requireContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView.setTextAppearance(R.style.VkUiTypography_Text);
        textView.setText(R.string.voip_share_link);
        textView.setText(i);
        dhr0.a.getClass();
        textView.setTextColor(e3m.f(R.attr.vk_ui_text_primary, dhr0.s()));
        his0.w(textView, i2, R.attr.vk_ui_icon_accent);
        textView.setCompoundDrawablePadding(iah0.a(16));
        float f = 4;
        bwt0.f0(textView, iah0.a(f), 0, iah0.a(f), 0, 10);
        jjc.g(textView, new qyi0(gzsVar, 27));
        return textView;
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(requireContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        TextView Yn = Yn(R.string.voip_share_link, R.drawable.vk_icon_chain_outline_28, new jcf0(this, 26));
        f4m.t(iah0.a(4), Yn);
        linearLayout.addView(Yn);
        Bundle arguments = getArguments();
        if (arguments != null ? arguments.getBoolean("key_show_add_by_qr_button") : false) {
            TextView Yn2 = Yn(R.string.voip_participants_add_user_options_modal_dialog_add_by_qr, R.drawable.vk_icon_scan_viewfinder_outline_28, new uhs0(this, 11));
            bwt0.f0(Yn2, 0, iah0.a(24), 0, iah0.a(8), 5);
            linearLayout.addView(Yn2);
        }
        dw20.Rn(this, linearLayout, 6);
        return super.yn(bundle);
    }
}
