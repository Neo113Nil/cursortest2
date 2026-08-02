package defpackage;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.view.ContextThemeWrapper;
import com.google.android.material.bottomsheet.BottomSheetDialog;

/* loaded from: classes15.dex */
public final class c3b {
    public final mp11 a;
    public final ike b;
    public final BottomSheetDialog c;
    public final ViewGroup d;
    public final TextView e;
    public final TextView f;
    public e3b g;

    public c3b(ViewGroup viewGroup, mp11 mp11Var, kse kseVar) {
        this.a = mp11Var;
        this.b = g8e.f(kseVar.b);
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(viewGroup.getContext(), w0i0.Messaging_Theme_RoundedBottomSheetDialog);
        bottomSheetDialog.setContentView(olh0.msg_d_chat_holder_menu);
        bottomSheetDialog.setCanceledOnTouchOutside(true);
        this.c = bottomSheetDialog;
        this.d = (ViewGroup) bottomSheetDialog.findViewById(e9h0.actions_container);
        this.e = (TextView) bottomSheetDialog.findViewById(e9h0.popup_dialog_message);
        this.f = (TextView) bottomSheetDialog.findViewById(e9h0.popup_dialog_details);
    }

    public final void a(int i, int i2, Integer num, sls slsVar) {
        ViewGroup viewGroup = this.d;
        TextView textView = new TextView(new ContextThemeWrapper(viewGroup.getContext(), w0i0.Messaging_MessagePopupButton));
        y3b1.h(i2, jng0.messagingCommonIconsPrimaryColor, textView);
        textView.setText(i);
        if (num != null) {
            int intValue = num.intValue();
            bob1.d(textView, intValue != 0 ? vqb1.e(intValue, textView.getContext()) : null, true);
        }
        viewGroup.addView(textView);
        textView.setOnClickListener(new b3b(slsVar, this, 0));
    }

    public final void b(int i, int i2, sls slsVar) {
        ViewGroup viewGroup = this.d;
        TextView textView = new TextView(new ContextThemeWrapper(viewGroup.getContext(), w0i0.Messaging_MessagePopupDestructiveButton));
        y3b1.h(i2, jng0.messagingCommonDestructiveIconsColor, textView);
        textView.setText(i);
        viewGroup.addView(textView);
        textView.setOnClickListener(new b3b(slsVar, this, 1));
    }
}
