package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.picture.c;
import com.vkontakte.android.R;
import java.util.List;
import xsna.r0z;

/* compiled from: ContextMenuScreenContent.kt */
/* loaded from: classes18.dex */
public final class q0z extends RecyclerView.Adapter<a> {
    public final Context c;
    public final List<r0z> d;

    /* compiled from: ContextMenuScreenContent.kt */
    public static final class a extends RecyclerView.e0 {
    }

    public q0z(Context context) {
        this.c = context;
        r0z.d dVar = r0z.d.c;
        this.d = e43.l(dVar, r0z.e.c, dVar, r0z.a.c, r0z.c.c, r0z.b.c, r0z.f.c, r0z.g.c, dVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return this.d.get(i).b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i) {
        View view;
        a aVar2 = aVar;
        r0z r0zVar = this.d.get(i);
        if (r0zVar instanceof r0z.d) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) aVar2.itemView;
        linearLayout.removeAllViews();
        r0z.c cVar = r0z.c.c;
        boolean equals = r0zVar.equals(cVar);
        Context context = this.c;
        View view2 = null;
        if (equals) {
            view = com.vk.design.demo.presentation.screens.a.f(R.drawable.vk_icon_add_16, context);
        } else if (r0zVar.equals(r0z.b.c)) {
            VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
            int b = hbh0.b(48, context);
            vkAvatar.setLayoutParams(new LinearLayout.LayoutParams(b, b));
            vkAvatar.setContent(new c.C0853c("VK", com.vk.design.demo.presentation.screens.a.g(new m9b(cxu0.a, 3))));
            view = vkAvatar;
        } else if (r0zVar.equals(r0z.f.c)) {
            VkPicture vkPicture = new VkPicture(context, null, 6, 0);
            int b2 = hbh0.b(48, context);
            vkPicture.setLayoutParams(new LinearLayout.LayoutParams(b2, b2));
            vkPicture.setContent(new c.C0853c("VK", com.vk.design.demo.presentation.screens.a.g(new xkw(cxu0.a, 1))));
            view = vkPicture;
        } else {
            view = null;
        }
        if (view != null) {
            linearLayout.addView(view);
        }
        TextView textView = new TextView(context);
        textView.setText(r0zVar.a);
        textView.setTextSize(16.0f);
        textView.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMarginStart(view != null ? hbh0.b(16, context) : 0);
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        if (r0zVar.equals(cVar)) {
            view2 = com.vk.design.demo.presentation.screens.a.f(R.drawable.vk_icon_done_24, context);
        } else if (r0zVar.equals(r0z.g.c)) {
            view2 = com.vk.design.demo.presentation.screens.a.f(R.drawable.vk_icon_add_16, context);
        }
        if (view2 != null) {
            linearLayout.addView(view2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        if (i == r0z.d.c.b) {
            View view2 = new View(viewGroup.getContext());
            view2.setLayoutParams(new RecyclerView.p(-1, hbh0.b(1, viewGroup.getContext())));
            view2.setBackgroundColor(855638016);
            view2.setAlpha(0.12f);
            view = view2;
        } else {
            LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            linearLayout.setMinimumHeight(hbh0.b(40, viewGroup.getContext()));
            linearLayout.setPadding(hbh0.b(16, viewGroup.getContext()), hbh0.b(8, viewGroup.getContext()), hbh0.b(16, viewGroup.getContext()), hbh0.b(8, viewGroup.getContext()));
            view = linearLayout;
        }
        return new a(view);
    }
}
