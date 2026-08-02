package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.List;

/* compiled from: IconAdapter.kt */
/* loaded from: classes2.dex */
public final class jpv extends RecyclerView.Adapter<irv> {
    public final List<ymy> c;
    public ymy d;
    public io.reactivex.rxjava3.disposables.c e;
    public final int f;

    public jpv(Context context) {
        bny.a.getClass();
        v1v0 v1v0Var = bny.i;
        List<ymy> c = (v1v0Var == null ? null : v1v0Var).c();
        this.c = c;
        this.e = EmptyDisposable.INSTANCE;
        v1v0 v1v0Var2 = bny.i;
        this.f = c.indexOf((v1v0Var2 != null ? v1v0Var2 : null).a(context));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(irv irvVar, int i) {
        irv irvVar2 = irvVar;
        List<ymy> list = this.c;
        ymy ymyVar = list.get(i);
        boolean f = epx.f(this.d, list.get(i));
        View view = irvVar2.l;
        ImageView imageView = irvVar2.m;
        TextView textView = irvVar2.n;
        irvVar2.o = ymyVar;
        int g = ymyVar.g();
        abg0 abg0Var = dhr0.t;
        Drawable a = abg0Var.a(g);
        Integer f2 = ymyVar.f();
        Drawable a2 = f2 != null ? abg0Var.a(f2.intValue()) : null;
        hny hnyVar = new hny(imageView.getContext());
        hnyVar.b(a);
        if (a2 != null) {
            hnyVar.b(a2);
        }
        imageView.setImageBitmap(xjo.b(new dpg0(hnyVar, cn70.a() * 16.0f), cn70.b(64), cn70.b(64), 4));
        if (ymyVar.d() != 0) {
            textView.setText(ymyVar.d());
        } else {
            f4m.j(textView);
        }
        if (!f) {
            textView.setTextColor(abg0Var.c(R.attr.vk_ui_text_primary));
            view.setBackground(null);
        } else {
            textView.setTextColor(abg0Var.c(R.attr.vk_ui_text_accent));
            qcy<Object>[] qcyVarArr = bwt0.a;
            dhr0.f0(R.drawable.selected_icon_background_solid, R.attr.vk_ui_text_accent, view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final irv onCreateViewHolder(ViewGroup viewGroup, int i) {
        irv irvVar = new irv(tf3.b(viewGroup, R.layout.item_icon_settings, viewGroup, false), new ipv(2, this, jpv.class, "createIconChangeDialog", "createIconChangeDialog(Landroid/view/View;Lcom/vk/android/launcher/icons/settings/LauncherIconItem;)V", 0));
        Context context = viewGroup.getContext();
        if (this.d != null) {
            return irvVar;
        }
        bny.a.getClass();
        v1v0 v1v0Var = bny.i;
        if (v1v0Var == null) {
            v1v0Var = null;
        }
        this.d = v1v0Var.a(context);
        return irvVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.e.dispose();
    }
}
