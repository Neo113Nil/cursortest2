package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.im.ui.views.InfoBarView;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;

/* compiled from: DialogBarVc.kt */
/* loaded from: classes2.dex */
public final class zam {
    public final Context a;
    public final View b;
    public final InfoBarView c;
    public final View d;
    public final TextView e;
    public final bpn0 f;
    public final gdp g;
    public qkr0 h;

    public zam(LayoutInflater layoutInflater, ViewGroup viewGroup, kkm kkmVar) {
        this.a = layoutInflater.getContext();
        View inflate = layoutInflater.inflate(R.layout.vkim_dialog_bar, viewGroup, false);
        this.b = inflate;
        InfoBarView infoBarView = (InfoBarView) inflate.findViewById(R.id.bar);
        this.c = infoBarView;
        this.d = inflate.findViewById(R.id.loading);
        this.e = (TextView) inflate.findViewById(R.id.error);
        this.f = new bpn0(new x5i(this, 6));
        this.g = new gdp();
        infoBarView.setDialogThemeBinder(kkmVar);
        inflate.setOnClickListener(new o44(0));
        inflate.setOnLongClickListener(new hbm());
        int i = 8;
        infoBarView.setTextFormatter(new igh(this, i));
        infoBarView.setOnHideCloseListener(new dwg(this, i));
        infoBarView.setOnButtonClickListener(new fd4(this, 3));
    }

    public final com.vk.im.popup.a a() {
        return (com.vk.im.popup.a) this.f.getValue();
    }

    public final void b() {
        a().dismiss();
    }

    public final void c() {
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
    }

    public final void d() {
        com.vk.im.popup.a a = a();
        ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
        imFeatures.getClass();
        a.b(new fvl(R.string.vkim_msg_header_delete_spam_chat_progress_desc, 5, null, null, com.vk.toggle.b.A.a(imFeatures)), new zqf(this, 14));
    }

    public final void e() {
        com.vk.im.popup.a a = a();
        Context context = this.a;
        com.vk.im.popup.a.d(a, new gvl(R.string.vkim_msg_header_delete_spam_chat_title, null, R.string.vkim_msg_header_delete_spam_chat_submit_desc, null, 0, cqm0.c(e3m.f(R.attr.vk_ui_background_negative, context), context.getString(R.string.vkim_yes)), R.string.vkim_kick_submit_no, 922), new p3h(this, 6), null, null, 12);
    }
}
