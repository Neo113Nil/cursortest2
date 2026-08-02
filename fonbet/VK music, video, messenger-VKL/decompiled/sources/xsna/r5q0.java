package xsna;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.vk.core.formatters.spans.ThemedForegroundColorSpan;
import com.vkontakte.android.R;
import kotlin.Pair;

/* compiled from: UnsafeFileWarningBottomSheet.kt */
/* loaded from: classes2.dex */
public final class r5q0 extends dw20 {
    public static final /* synthetic */ int f1 = 0;

    /* compiled from: UnsafeFileWarningBottomSheet.kt */
    public static final class a {
        public String a = "";
        public String b = "";
        public uqb c;

        public final r5q0 a(FragmentManager fragmentManager) {
            r5q0 r5q0Var = new r5q0();
            r5q0Var.setArguments(yfb.b(new Pair("fileName", this.a), new Pair("url", this.b), new Pair("returnByResult", Boolean.valueOf(this.c != null))));
            if (fragmentManager != null) {
                fragmentManager.l0("fragmentResult", r5q0Var, new u1j0(this, 7));
            }
            return r5q0Var;
        }

        public final void c(String str) {
            this.a = str;
        }

        public final void d(String str) {
            this.b = str;
        }
    }

    public final String Yn() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("fileName")) == null) ? "" : string;
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        View inflate = LayoutInflater.from(mo2getContext()).inflate(R.layout.vkim_unsafe_file_warning_bottom_sheet, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.unsafe_file_warning_subtitle);
        Context mo2getContext = mo2getContext();
        SpannableString spannableString = new SpannableString(mo2getContext != null ? mo2getContext.getString(R.string.vkim_unsafe_file_warning_subtitle, Yn()) : null);
        int K = drm0.K(0, 6, spannableString, Yn(), false);
        spannableString.setSpan(new ThemedForegroundColorSpan(R.attr.vk_ui_text_primary), K, Yn().length() + K, 18);
        textView.setText(spannableString);
        ((Button) inflate.findViewById(R.id.negative_button)).setOnClickListener(new k1(this, 14));
        ((Button) inflate.findViewById(R.id.positive_button)).setOnClickListener(new vw0(this, 16));
        dw20.Rn(this, inflate, 6);
        return super.yn(bundle);
    }
}
