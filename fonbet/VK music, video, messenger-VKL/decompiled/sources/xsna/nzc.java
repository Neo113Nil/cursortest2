package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.paging.list.VkErrorView;
import com.vk.core.view.components.paging.list.a;

/* compiled from: ClipFooterErrorViewProvider.kt */
/* loaded from: classes17.dex */
public final class nzc extends n6s {
    public m4 b;

    /* compiled from: ClipFooterErrorViewProvider.kt */
    public static final class a extends RecyclerView.e0 {
    }

    @Override // xsna.n6s
    public final ee a(Context context, ViewGroup viewGroup) {
        VkErrorView vkErrorView = new VkErrorView(context, null, 6, 0);
        vkErrorView.c(a.C0851a.a(context, new in0(this, 18)));
        return vkErrorView;
    }

    @Override // xsna.n6s
    public final RecyclerView.e0 b(Context context, ViewGroup viewGroup, xa80 xa80Var) {
        VkErrorView vkErrorView = new VkErrorView(context, null, 6, 0);
        vkErrorView.c(a.C0851a.a(context, new in0(this, 18)));
        return new a(vkErrorView);
    }
}
