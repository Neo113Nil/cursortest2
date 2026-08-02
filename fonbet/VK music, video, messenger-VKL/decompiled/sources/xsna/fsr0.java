package xsna;

import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.apps.BuildInfo;
import com.vkontakte.android.R;
import xsna.yyb;

/* compiled from: VhMembersInvite.kt */
/* loaded from: classes2.dex */
public final class fsr0 extends kqr0<yyb.h> {
    public final jj0 l;
    public final kkm m;
    public final TextView n;
    public final ImageView o;

    public fsr0(jj0 jj0Var, ViewGroup viewGroup, kkm kkmVar) {
        super(R.layout.vkim_chat_settings_members_invite, viewGroup);
        this.l = jj0Var;
        this.m = kkmVar;
        TextView textView = (TextView) this.itemView.findViewById(R.id.vkim_btn);
        this.n = textView;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.vkim_icon);
        this.o = imageView;
        if (BuildInfo.t()) {
            if (textView != null) {
                at.d(this.itemView, R.string.add, textView);
            }
            if (imageView != null) {
                imageView.setImageResource(R.drawable.vkim_ic_24_add_to_chat);
            }
            if (imageView != null) {
                imageView.setPadding(cn70.b(14), cn70.b(14), cn70.b(14), cn70.b(14));
            }
        }
        bwt0.i0(this.itemView, new ece0(this, 20));
    }

    @Override // xsna.vfz
    public final void V5() {
        boolean t = BuildInfo.t();
        ImageView imageView = this.o;
        TextView textView = this.n;
        if (t) {
            int c = dhr0.t.c(R.attr.vk_ui_text_accent);
            if (textView != null) {
                textView.setTextColor(c);
            }
            if (imageView != null) {
                imageView.setImageTintList(ColorStateList.valueOf(c));
                return;
            }
            return;
        }
        kkm kkmVar = this.m;
        if (kkmVar != null) {
            if (textView != null) {
                kkmVar.c(textView, R.attr.vk_ui_text_accent);
            }
            if (imageView != null) {
                kkmVar.d(imageView, R.attr.vk_ui_icon_accent);
            }
        }
    }

    @Override // xsna.vfz
    public final void a6() {
        kkm kkmVar;
        if (BuildInfo.t() || (kkmVar = this.m) == null) {
            return;
        }
        TextView textView = this.n;
        if (textView != null) {
            kkmVar.h(textView);
        }
        ImageView imageView = this.o;
        if (imageView != null) {
            kkmVar.h(imageView);
        }
    }
}
