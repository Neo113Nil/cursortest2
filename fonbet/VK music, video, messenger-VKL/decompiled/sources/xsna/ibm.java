package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.im.engine.models.dialogs.BusinessNotifyInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vkontakte.android.R;
import xsna.ebm;

/* compiled from: DialogBusinessNotifyVc.kt */
/* loaded from: classes2.dex */
public final class ibm {
    public final View a;
    public final TextView b;
    public final TextView c;
    public final View d;
    public ebm.a e;

    public ibm(LayoutInflater layoutInflater, ViewGroup viewGroup, kkm kkmVar) {
        View inflate = layoutInflater.inflate(R.layout.vkim_dialog_business_notify, viewGroup, false);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.label);
        TextView textView = (TextView) inflate.findViewById(R.id.open);
        this.c = textView;
        View findViewById = inflate.findViewById(R.id.hide);
        this.d = findViewById;
        inflate.setOnClickListener(new o44(0));
        inflate.setOnLongClickListener(new hbm());
        kkmVar.c(textView, R.attr.vk_legacy_text_link);
        bwt0.i0(textView, new ifg(this, 7));
        bwt0.i0(findViewById, new lwh(this, 3));
    }

    public final void a(Dialog dialog) {
        BusinessNotifyInfo Ab;
        TextView textView = this.b;
        Context context = textView.getContext();
        int i = 0;
        int i2 = dialog == null ? 8 : 0;
        textView.setVisibility(i2);
        this.c.setVisibility(i2);
        this.d.setVisibility(i2);
        if (i2 == 0) {
            if (dialog != null && (Ab = dialog.Ab()) != null) {
                i = Ab.d;
            }
            textView.setText(i == 0 ? context.getString(R.string.vkim_business_notify_count_default) : enj.f(R.plurals.vkim_business_notify_count_many, i, context));
        }
    }
}
