package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vk.im.ui.views.settings.LabelSettingsView;
import com.vkontakte.android.R;
import xsna.l8j;

/* compiled from: VkAppContactVc.kt */
/* loaded from: classes2.dex */
public final class j9u0 implements laj {
    public lkr0 a;
    public ImAvatarView b;
    public TextView c;
    public View d;
    public LabelSettingsView e;
    public View f;
    public View g;
    public View h;
    public final sj90 i = new sj90();

    @Override // xsna.laj
    public final void b(boolean z) {
        if (z) {
            View view = this.h;
            (view != null ? view : null).setVisibility(0);
        } else {
            View view2 = this.h;
            f4m.j(view2 != null ? view2 : null);
        }
    }

    @Override // xsna.laj
    public final View c(Context context, ViewGroup viewGroup) {
        View inflate = e3m.b(context).inflate(R.layout.vkim_vkapp_contact, viewGroup, false);
        this.b = (ImAvatarView) inflate.findViewById(R.id.im_avatar);
        this.c = (TextView) inflate.findViewById(R.id.im_name);
        ((TextView) inflate.findViewById(R.id.im_last_seen)).setText(context.getString(R.string.vkim_from_contact_list));
        View findViewById = inflate.findViewById(R.id.im_write_msg);
        bwt0.i0(findViewById, new e9i0(this, 27));
        this.d = findViewById;
        View findViewById2 = inflate.findViewById(R.id.im_invite_to_chat);
        bwt0.i0(findViewById2, new i9u0(this, 0));
        this.f = findViewById2;
        LabelSettingsView labelSettingsView = (LabelSettingsView) inflate.findViewById(R.id.im_phone_number);
        bwt0.i0(labelSettingsView, new qhg0(this, 27));
        this.e = labelSettingsView;
        this.g = inflate.findViewById(R.id.im_back);
        this.h = inflate.findViewById(R.id.im_progress_container);
        View view = this.g;
        if (view == null) {
            view = null;
        }
        bwt0.i0(view, new gqq0(this, 5));
        return inflate;
    }

    @Override // xsna.laj
    public final void d(Throwable th) {
        zk70.e(th);
    }

    @Override // xsna.laj
    public final void e(boolean z) {
        View view = this.d;
        if (view == null) {
            view = null;
        }
        bwt0.p0(view, z);
    }

    @Override // xsna.laj
    public final void f(boolean z) {
        View view = this.f;
        if (view == null) {
            view = null;
        }
        bwt0.p0(view, z);
    }

    @Override // xsna.laj
    public final void g(String str) {
        TextView textView = this.c;
        if (textView == null) {
            textView = null;
        }
        textView.setText(hdp.a.a(str));
    }

    @Override // xsna.laj
    public final void h(qtd0 qtd0Var) {
        ImAvatarView imAvatarView = this.b;
        if (imAvatarView == null) {
            imAvatarView = null;
        }
        imAvatarView.s1(qtd0Var);
    }

    @Override // xsna.laj
    public final void i(String str) {
        LabelSettingsView labelSettingsView = this.e;
        if (labelSettingsView == null) {
            labelSettingsView = null;
        }
        bwt0.p0(labelSettingsView, this.i.a(str));
        LabelSettingsView labelSettingsView2 = this.e;
        (labelSettingsView2 != null ? labelSettingsView2 : null).setTitle(str);
    }

    @Override // xsna.laj
    public final void j(l8j.b bVar) {
        this.a = bVar;
    }
}
