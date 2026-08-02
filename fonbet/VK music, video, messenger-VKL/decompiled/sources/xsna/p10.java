package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.newsfeed.common.PostActions;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;

/* compiled from: NewsEntryActionsAdapter.kt */
/* loaded from: classes4.dex */
public final class p10 extends vif0<y960> implements View.OnClickListener {
    public final TextView n;
    public z960 o;
    public WeakReference<VkContextMenu> p;

    public p10(ViewGroup viewGroup) {
        super(viewGroup, R.layout.newsfeed_popup_action_item, 0);
        this.n = (TextView) this.itemView.findViewById(android.R.id.text1);
        this.itemView.setOnClickListener(this);
    }

    @Override // xsna.vif0
    public final void i6(y960 y960Var) {
        y960 y960Var2 = y960Var;
        CharSequence charSequence = y960Var2.b;
        TextView textView = this.n;
        textView.setText(charSequence);
        if (y960Var2.a == PostActions.ACTION_REMOVE.h()) {
            textView.setTextColor(dhr0.t.c(R.attr.vk_ui_background_negative));
        } else {
            textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        y960 y960Var;
        if (jjc.b() || (y960Var = (y960) this.m) == null) {
            return;
        }
        int i = y960Var.a;
        z960 z960Var = this.o;
        if (z960Var != null) {
            WeakReference<VkContextMenu> weakReference = this.p;
            z960Var.g(weakReference != null ? weakReference.get() : null, i);
        }
    }
}
