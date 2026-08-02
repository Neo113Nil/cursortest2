package xsna;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.core.view.components.button.VkButton;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vkontakte.android.R;
import xsna.bex0;

/* compiled from: VkBottomSheetWithProgressButtonModal.kt */
/* loaded from: classes6.dex */
public final class ifu0 extends dw20 {
    public a f1;

    /* compiled from: VkBottomSheetWithProgressButtonModal.kt */
    public static final class a {
        public final String a;
        public final baf0 b;
        public final String c;
        public final String d;
        public final v2y e;

        public a(String str, baf0 baf0Var, String str2, String str3, v2y v2yVar) {
            this.a = str;
            this.b = baf0Var;
            this.c = str2;
            this.d = str3;
            this.e = v2yVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b.equals(aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e.equals(aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + urd0.a(urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            return "Params(title=" + this.a + ", iconRes=" + this.b + ", positiveButtonText=" + this.c + ", negativeButtonText=" + this.d + ", callback=" + this.e + ')';
        }
    }

    @Override // xsna.dw20, androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        a aVar = this.f1;
        if (aVar != null) {
            bex0.a.a(aVar.e.a.a, JsApiMethodType.ADD_MINI_APP_SNIPPET_TO_CHAT, VkAppsErrors.Client.USER_DENIED, null, null, null, 60);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        String str;
        String str2;
        String str3;
        q0o0 q0o0Var = this instanceof q0o0 ? (q0o0) this : null;
        prw.h(this, q0o0Var != null ? q0o0Var.tag() : "VkSdkDialogFragment", null);
        View inflate = LayoutInflater.from(mo2getContext()).inflate(R.layout.vk_bottom_sheet_with_progress, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.dialog_title);
        AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(R.id.dialog_icon);
        a aVar = this.f1;
        if (aVar != null) {
            appCompatImageView.setImageDrawable(aVar.b);
        }
        Button button = (Button) inflate.findViewById(R.id.dialog_dismiss);
        VkButton vkButton = (VkButton) inflate.findViewById(R.id.dialog_confirm);
        a aVar2 = this.f1;
        if (aVar2 != null && (str3 = aVar2.a) != null) {
            textView.setText(str3);
        }
        a aVar3 = this.f1;
        if (aVar3 != null && (str2 = aVar3.d) != null) {
            button.setText(str2);
        }
        jjc.g(button, new vlc0(this, 29));
        a aVar4 = this.f1;
        if (aVar4 != null && (str = aVar4.c) != null) {
            vkButton.setText(str);
        }
        jjc.g(vkButton, new ogd(this, vkButton, button, 10));
        dw20.Rn(this, inflate, 6);
        return super.yn(bundle);
    }
}
