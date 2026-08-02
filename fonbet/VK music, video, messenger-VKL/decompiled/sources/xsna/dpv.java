package xsna;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;

/* compiled from: ClipBannerAdMenuAdapter.kt */
/* loaded from: classes4.dex */
public final class dpv extends vif0<hmc> implements View.OnClickListener {
    public final TextView n;
    public final ImageView o;
    public z960 p;
    public WeakReference<VkContextMenu> q;

    public dpv(ViewGroup viewGroup) {
        super(viewGroup, R.layout.newsfeed_popup_action_item_with_icon, 0);
        this.n = (TextView) this.itemView.findViewById(android.R.id.text1);
        this.o = (ImageView) this.itemView.findViewById(android.R.id.icon);
        this.itemView.setOnClickListener(this);
    }

    @Override // xsna.vif0
    public final void i6(hmc hmcVar) {
        hmc hmcVar2 = hmcVar;
        CharSequence charSequence = hmcVar2.b;
        TextView textView = this.n;
        textView.setText(charSequence);
        Drawable drawable = hmcVar2.d;
        ImageView imageView = this.o;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
        }
        textView.setTextColor(hmcVar2.e);
        imageView.setColorFilter(hmcVar2.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hmc hmcVar;
        if (jjc.b() || (hmcVar = (hmc) this.m) == null) {
            return;
        }
        int i = hmcVar.a;
        z960 z960Var = this.p;
        if (z960Var != null) {
            WeakReference<VkContextMenu> weakReference = this.q;
            z960Var.g(weakReference != null ? weakReference.get() : null, i);
        }
    }
}
