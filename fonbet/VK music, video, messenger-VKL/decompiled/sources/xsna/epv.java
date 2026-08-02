package xsna;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;

/* compiled from: NewsEntryActionsRedesignAdapter.kt */
/* loaded from: classes4.dex */
public final class epv extends vif0<ua60> implements View.OnClickListener {
    public final TextView n;
    public final ImageView o;
    public z960 p;
    public WeakReference<VkContextMenu> q;

    public epv(ViewGroup viewGroup) {
        super(viewGroup, R.layout.newsfeed_popup_action_item_with_icon, 0);
        this.n = (TextView) this.itemView.findViewById(android.R.id.text1);
        this.o = (ImageView) this.itemView.findViewById(android.R.id.icon);
        this.itemView.setOnClickListener(this);
    }

    @Override // xsna.vif0
    public final void i6(ua60 ua60Var) {
        ua60 ua60Var2 = ua60Var;
        CharSequence charSequence = ua60Var2.b;
        TextView textView = this.n;
        textView.setText(charSequence);
        Drawable drawable = ua60Var2.d;
        ImageView imageView = this.o;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
        }
        textView.setTextColor(ua60Var2.e);
        imageView.setColorFilter(ua60Var2.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ua60 ua60Var;
        if (jjc.b() || (ua60Var = (ua60) this.m) == null) {
            return;
        }
        int i = ua60Var.a;
        z960 z960Var = this.p;
        if (z960Var != null) {
            WeakReference<VkContextMenu> weakReference = this.q;
            z960Var.g(weakReference != null ? weakReference.get() : null, i);
        }
    }
}
