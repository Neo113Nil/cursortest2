package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;

/* compiled from: PollV3ActionsAdapter.kt */
/* loaded from: classes4.dex */
public final class fsb0 extends vif0<esb0> implements View.OnClickListener {
    public final TextView n;
    public psb0 o;
    public WeakReference<VkContextMenu> p;

    public fsb0(ViewGroup viewGroup) {
        super(viewGroup, R.layout.poll_v3_popup_action, 0);
        this.itemView.setOnClickListener(this);
        TextView textView = (TextView) this.itemView.findViewById(R.id.action_text);
        textView.setTextColor(e3m.f(R.attr.vk_ui_text_primary, this.l.getContext()));
        this.n = textView;
    }

    @Override // xsna.vif0
    public final void i6(esb0 esb0Var) {
        this.n.setText(esb0Var.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        esb0 esb0Var;
        if (jjc.b() || (esb0Var = (esb0) this.m) == null) {
            return;
        }
        int i = esb0Var.a;
        psb0 psb0Var = this.o;
        if (psb0Var != null) {
            WeakReference<VkContextMenu> weakReference = this.p;
            psb0Var.g(weakReference != null ? weakReference.get() : null, i);
        }
    }
}
