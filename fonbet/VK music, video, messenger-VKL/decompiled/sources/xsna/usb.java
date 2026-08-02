package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.im.ui.components.common.NotifyId;
import com.vk.im.ui.views.settings.LabelSettingsView;
import com.vk.im.ui.views.settings.MaterialSwitchSettingsView;
import com.vkontakte.android.R;
import xsna.cwb0;
import xsna.qsb;

/* compiled from: ChatMakeLinkVcImpl.kt */
/* loaded from: classes2.dex */
public final class usb implements tsb {
    public final qsb.a a;
    public final ssb b;
    public final Context c;
    public final View d;
    public final View e;
    public final TextView f;
    public final LabelSettingsView g;
    public final TextView h;
    public final bzb0 i;

    public usb(LayoutInflater layoutInflater, ViewGroup viewGroup, qsb.a aVar, ssb ssbVar) {
        int i = ssbVar.e;
        this.a = aVar;
        this.b = ssbVar;
        Context context = layoutInflater.getContext();
        this.c = context;
        View inflate = layoutInflater.inflate(R.layout.vkim_chat_make_link, viewGroup, false);
        this.d = inflate;
        this.e = inflate.findViewById(R.id.vkim_progress);
        TextView textView = (TextView) inflate.findViewById(R.id.vkim_chat_link);
        this.f = textView;
        LabelSettingsView labelSettingsView = (LabelSettingsView) inflate.findViewById(R.id.vkim_link_invalidate);
        this.g = labelSettingsView;
        LabelSettingsView labelSettingsView2 = (LabelSettingsView) inflate.findViewById(R.id.vkim_copy);
        LabelSettingsView labelSettingsView3 = (LabelSettingsView) inflate.findViewById(R.id.vkim_share);
        LabelSettingsView labelSettingsView4 = (LabelSettingsView) inflate.findViewById(R.id.vkim_share_qr);
        this.h = (TextView) inflate.findViewById(R.id.vkim_link_hint);
        MaterialSwitchSettingsView materialSwitchSettingsView = (MaterialSwitchSettingsView) inflate.findViewById(R.id.vkim_show_last_messages);
        this.i = new bzb0(context);
        textView.setOnClickListener(new x16(this, 2));
        jjc.g(labelSettingsView, new com.vk.movika.sdk.base.observable.q(this, 18));
        labelSettingsView.setVisibility(ssbVar.d ? 0 : 8);
        jjc.g(labelSettingsView2, new tb(this, 26));
        labelSettingsView2.setVisibility(ssbVar.b ? 0 : 8);
        jjc.g(labelSettingsView3, new u8(this, 21));
        labelSettingsView3.setVisibility(ssbVar.a ? 0 : 8);
        jjc.g(labelSettingsView4, new mz(this, 22));
        labelSettingsView4.setVisibility(ssbVar.c ? 0 : 8);
        View findViewById = inflate.findViewById(R.id.vkim_show_last_messages_divider);
        if (i > 0) {
            findViewById.setVisibility(0);
            materialSwitchSettingsView.setVisibility(0);
            materialSwitchSettingsView.setChecked(true);
            materialSwitchSettingsView.setDescription(context.getString(R.string.vkim_invite_share_msgs_description, Integer.valueOf(i)));
            materialSwitchSettingsView.setListener(new nz(this, 9));
        } else {
            findViewById.setVisibility(8);
            materialSwitchSettingsView.setVisibility(8);
        }
        labelSettingsView.setIconTint(R.attr.vk_ui_icon_accent);
        labelSettingsView2.setIconTint(R.attr.vk_ui_icon_accent);
        labelSettingsView3.setIconTint(R.attr.vk_ui_icon_accent);
        labelSettingsView4.setIconTint(R.attr.vk_ui_icon_accent);
    }

    @Override // xsna.tsb
    public final void a(Throwable th) {
        e();
        zk70.e(th);
    }

    @Override // xsna.tsb
    public final void b(NotifyId notifyId) {
        g2v.c().getClass();
        zk70.c(notifyId);
    }

    @Override // xsna.tsb
    public final void c() {
        edw edwVar = edw.a;
        edw.d(R.string.vkim_chat_make_link, this.c, true);
    }

    @Override // xsna.tsb
    public final void d(msx msxVar) {
        TextView textView = this.f;
        textView.setVisibility(0);
        this.e.setVisibility(4);
        textView.setText(msxVar.b);
        this.i.a();
        if (this.b.d) {
            boolean z = msxVar.c;
            TextView textView2 = this.h;
            LabelSettingsView labelSettingsView = this.g;
            if (z) {
                labelSettingsView.setVisibility(8);
                textView2.setText(R.string.vkim_channel_link_hint);
            } else {
                labelSettingsView.setVisibility(0);
                textView2.setText(R.string.vkim_chat_make_link_hint);
            }
        }
    }

    @Override // xsna.tsb
    public final void destroy() {
        this.i.a();
    }

    @Override // xsna.tsb
    public final void e() {
        this.f.setVisibility(4);
        this.e.setVisibility(0);
    }

    @Override // xsna.tsb
    public final void f(z4 z4Var) {
        bzb0.d(this.i, cwb0.l.l, z4Var, null, null, 28);
    }

    @Override // xsna.tsb
    public final View getView() {
        return this.d;
    }
}
