package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;

/* compiled from: DialogPinnedMsgVcOld.kt */
/* loaded from: classes2.dex */
public final class tim {
    public final Context a;
    public final View b;
    public final View c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final View g;
    public final View h;
    public final TextView i;
    public final View j;
    public final View k;
    public final TextView l;
    public final DisplayNameFormatter m;
    public final roa0 n;
    public final com.vk.im.popup.b o;
    public hkp p;

    public tim(LayoutInflater layoutInflater, ViewGroup viewGroup, kkm kkmVar) {
        Context context = layoutInflater.getContext();
        this.a = context;
        View inflate = layoutInflater.inflate(R.layout.vkim_dialog_pinned_msg, viewGroup, false);
        this.b = inflate;
        View findViewById = inflate.findViewById(R.id.content_container);
        this.c = findViewById;
        TextView textView = (TextView) inflate.findViewById(R.id.content_sender);
        kkmVar.c(textView, R.attr.vk_ui_vkontakte_color_im_text_name);
        this.d = textView;
        this.e = (TextView) inflate.findViewById(R.id.content_time);
        TextView textView2 = (TextView) inflate.findViewById(R.id.content_body);
        kkmVar.a(textView2, "linkColor", new lrk(kkmVar, 3));
        this.f = textView2;
        View findViewById2 = inflate.findViewById(R.id.content_hide);
        this.g = findViewById2;
        this.h = inflate.findViewById(R.id.hidden_container);
        TextView textView3 = (TextView) inflate.findViewById(R.id.hidden_detach);
        this.i = textView3;
        this.j = inflate.findViewById(R.id.loading_container);
        this.k = inflate.findViewById(R.id.error_container);
        this.l = (TextView) inflate.findViewById(R.id.error_info);
        TextView textView4 = (TextView) inflate.findViewById(R.id.error_retry);
        this.m = new DisplayNameFormatter(null, 3, null);
        this.n = new roa0(context);
        new bpn0(new com.vk.movika.sdk.base.logic.processor.h(this, 29));
        new bpn0(new tbh(this, 7));
        new bpn0(new cu1(10));
        this.o = new com.vk.im.popup.b(context);
        inflate.setOnClickListener(new o44(0));
        inflate.setOnLongClickListener(new hbm());
        jjc.g(findViewById, new p4f(this, 19));
        jjc.g(findViewById2, new dsc(this, 22));
        jjc.g(textView3, new b5h(this, 10));
        jjc.g(textView4, new n3i(this, 6));
    }

    public final void a() {
        this.o.dismiss();
    }

    public final void b() {
        this.o.dismiss();
    }

    public final void c() {
        this.c.setVisibility(8);
        this.h.setVisibility(8);
        this.j.setVisibility(8);
        this.k.setVisibility(8);
    }

    public final void d() {
        ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
        imFeatures.getClass();
        this.o.b(new joa0(com.vk.toggle.b.A.a(imFeatures)), new wnh(this, 5));
    }

    public final void e() {
        this.o.a(poa0.j, new sim(this, 0), new com.vk.movika.sdk.base.logic.processor.actions.i(this, 29), new bu1(this, 27));
    }
}
