package xsna;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.vk.im.ui.views.buttons.VkButtonWithSmallScreenSupport;
import com.vkontakte.android.R;

/* compiled from: ImWriteByPhoneDialog.kt */
/* loaded from: classes2.dex */
public final class afw extends AlertDialog {
    public final jbs b;
    public final EditText c;
    public final VkButtonWithSmallScreenSupport d;
    public final io.reactivex.rxjava3.disposables.b e;

    public afw(Context context, jbs jbsVar) {
        super(context);
        this.b = jbsVar;
        this.e = new io.reactivex.rxjava3.disposables.b();
        View inflate = LayoutInflater.from(context).inflate(R.layout.vkim_popup_write_by_phone_number, (ViewGroup) null);
        inflate.findViewById(R.id.cancel_button).setOnClickListener(new e9i(this, 5));
        VkButtonWithSmallScreenSupport vkButtonWithSmallScreenSupport = (VkButtonWithSmallScreenSupport) inflate.findViewById(R.id.write_button);
        this.d = vkButtonWithSmallScreenSupport;
        EditText editText = (EditText) inflate.findViewById(R.id.phone_edit_text);
        this.c = editText;
        editText.addTextChangedListener(new yfb0(context));
        editText.addTextChangedListener(new zew(this));
        editText.postDelayed(new e0(5, this, context), 200L);
        vkButtonWithSmallScreenSupport.setOnClickListener(new yew(0, this, context));
        ((VkButtonWithSmallScreenSupport) inflate.findViewById(R.id.create_contact_button)).setOnClickListener(new com.vk.movika.sdk.android.defaultplayer.control.i(1, this, context));
        setView(inflate);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.e.dispose();
        super.dismiss();
    }
}
