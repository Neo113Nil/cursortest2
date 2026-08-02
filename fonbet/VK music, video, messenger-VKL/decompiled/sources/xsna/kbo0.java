package xsna;

import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.links.LinkedTextView;
import com.vkontakte.android.R;

/* compiled from: ClipBannerAdMenuAdapter.kt */
/* loaded from: classes4.dex */
public final class kbo0 extends vif0<imc> implements View.OnClickListener {
    public final LinkedTextView n;

    public kbo0(ViewGroup viewGroup) {
        super(viewGroup, R.layout.newsfeed_popup_text_action_item, 0);
        this.n = (LinkedTextView) this.itemView.findViewById(android.R.id.text1);
        this.itemView.setOnClickListener(this);
    }

    @Override // xsna.vif0
    public final void i6(imc imcVar) {
        CharSequence n0 = hd60.a().n0(imcVar.b);
        if (n0 instanceof Spannable) {
            qaz[] qazVarArr = (qaz[]) ((Spannable) n0).getSpans(0, n0.length(), qaz.class);
            if (qazVarArr != null) {
                for (qaz qazVar : qazVarArr) {
                    qazVar.b(R.attr.vk_ui_text_subhead);
                }
            }
        }
        LinkedTextView linkedTextView = this.n;
        linkedTextView.setText(n0);
        jno0.c(linkedTextView, R.attr.vk_ui_text_subhead);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }
}
