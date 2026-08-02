package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Triple;
import xsna.b83;

/* compiled from: AppPickerDialog.kt */
/* loaded from: classes15.dex */
public final class a83 extends RecyclerView.Adapter<b83.a> {
    public final /* synthetic */ b83 c;
    public final /* synthetic */ Context d;

    public a83(b83 b83Var, Context context) {
        this.c = b83Var;
        this.d = context;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return this.c.b.get(i).hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(b83.a aVar, int i) {
        b83.a aVar2 = aVar;
        Triple<Intent, ResolveInfo, String> triple = this.c.b.get(i);
        ResolveInfo j = triple.j();
        ApplicationInfo applicationInfo = j.activityInfo.applicationInfo;
        Context context = this.d;
        Drawable loadIcon = applicationInfo.loadIcon(context.getPackageManager());
        CharSequence loadLabel = j.loadLabel(context.getPackageManager());
        z73 z73Var = new z73(this, triple, j, context, 0);
        ImageView imageView = aVar2.l;
        View view = aVar2.m;
        if (gz80.a(26) && (loadIcon instanceof AdaptiveIconDrawable)) {
            view.setBackground(loadIcon);
            view.setVisibility(0);
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(loadIcon);
            view.setVisibility(8);
            imageView.setVisibility(0);
        }
        aVar2.n.setText(loadLabel);
        bwt0.i0(aVar2.itemView, new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(z73Var, 3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final b83.a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b83.a(viewGroup);
    }
}
