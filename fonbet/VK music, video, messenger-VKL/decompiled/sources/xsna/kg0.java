package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.picture.VkImage;
import java.lang.ref.WeakReference;
import kotlin.LazyThreadSafetyMode;

/* compiled from: AdMenuAdapter.kt */
/* loaded from: classes18.dex */
public final class kg0 extends zoj0<hh0, RecyclerView.e0> {
    public ip6 e;
    public WeakReference<VkContextMenu> f;
    public final Object g = msy.a(LazyThreadSafetyMode.NONE, new jg0(0));

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static void K0(kg0 kg0Var, String str, String str2, int i) {
        int intValue = ((Number) kg0Var.g.getValue()).intValue();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        kg0Var.x0(new ch0(str, str2, m33.a(i, context), intValue));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((hh0) this.c.c(i)) instanceof ch0 ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        hh0 hh0Var = (hh0) this.c.c(i);
        if (!(hh0Var instanceof ch0) || !(e0Var instanceof eh0)) {
            if ((hh0Var instanceof fh0) && (e0Var instanceof gh0)) {
                ((gh0) e0Var).l.setText(((fh0) hh0Var).a);
                return;
            }
            return;
        }
        ch0 ch0Var = (ch0) hh0Var;
        eh0 eh0Var = (eh0) e0Var;
        eh0Var.o = this.f;
        eh0Var.n = this.e;
        eh0Var.l.setText(ch0Var.b);
        VkImage vkImage = eh0Var.m;
        Drawable drawable = ch0Var.c;
        vkImage.setImageDrawable(drawable);
        vkImage.setVisibility(drawable != null ? 0 : 8);
        vkImage.setColorFilter(ch0Var.d);
        eh0Var.itemView.setOnClickListener(new dh0(0, eh0Var, ch0Var));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == 1 ? new eh0(viewGroup) : new gh0(viewGroup);
    }
}
