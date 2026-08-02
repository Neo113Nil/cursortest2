package xsna;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vkontakte.android.R;

/* compiled from: ChannelPayoutView.kt */
/* loaded from: classes16.dex */
public final class f8b implements gm50 {
    public final View b;
    public final q7b c;
    public final com.vk.movika.sdk.base.data.a d;
    public final VkTopBar e;
    public final LinearLayout f;
    public final View g;
    public final o7b h;
    public final VkButton i;

    public f8b(View view, q7b q7bVar, com.vk.movika.sdk.base.data.a aVar) {
        this.b = view;
        this.c = q7bVar;
        this.d = aVar;
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.top_bar);
        vkTopBar.setTransitionHeaderColor(VkTopBar.m.b.a);
        vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.C0879c(new h6(this, 15), null), null, 6));
        this.e = vkTopBar;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.skeleton_wrapper);
        new t7b(linearLayout);
        this.f = linearLayout;
        this.g = view.findViewById(R.id.content_wrapper);
        o7b o7bVar = new o7b(aVar);
        this.h = o7bVar;
        VkButton vkButton = (VkButton) view.findViewById(R.id.accept_button);
        bwt0.i0(vkButton, new t40(this, 10));
        this.i = vkButton;
        ((RecyclerView) view.findViewById(R.id.recycler_view)).setAdapter(o7bVar);
        bwt0.i0(view.findViewById(R.id.change_payout), new v9(this, 17));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.c;
    }
}
