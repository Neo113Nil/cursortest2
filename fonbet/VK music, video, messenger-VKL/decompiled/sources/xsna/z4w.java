package xsna;

import android.app.AlertDialog;
import android.content.Context;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.vk.dto.common.Peer;
import com.vkontakte.android.R;
import xsna.ikv0;

/* compiled from: ImInviteByPhoneDialog.kt */
/* loaded from: classes2.dex */
public final class z4w extends AlertDialog {
    public final izs<qtd0, s3q0> b;
    public final EditText c;
    public final Button d;
    public final io.reactivex.rxjava3.disposables.b e;

    public z4w(Context context, Peer peer, tcn tcnVar) {
        super(context);
        this.b = tcnVar;
        this.e = new io.reactivex.rxjava3.disposables.b();
        View inflate = LayoutInflater.from(context).inflate(R.layout.vkim_popup_invite_by_phone_number, (ViewGroup) null);
        inflate.findViewById(R.id.cancel_button).setOnClickListener(new ai0(this, 4));
        Button button = (Button) inflate.findViewById(R.id.invite_button);
        this.d = button;
        EditText editText = (EditText) inflate.findViewById(R.id.phone_edit_text);
        this.c = editText;
        editText.addTextChangedListener(new yfb0(context));
        editText.addTextChangedListener(new y4w(this));
        editText.postDelayed(new z(4, this, context), 200L);
        button.setOnClickListener(new vc4(1, this, peer));
        setView(inflate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        ikv0.a aVar = new ikv0.a(getContext());
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_negative), (Size) null, 12);
        aVar.u = new ikv0.d(getContext().getString(R.string.vkim_contacts_invite_by_phone_number_cant_add_snackbar), (String) (0 == true ? 1 : 0), (ikv0.d.a) (0 == true ? 1 : 0), 6);
        aVar.n();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.e.dispose();
        super.dismiss();
    }
}
