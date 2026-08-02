package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vkontakte.android.R;

/* compiled from: BlockedFooterEmptyViewProvider.kt */
/* loaded from: classes17.dex */
public final class of7 extends ie {
    public final int b = R.string.clips_grid_empty_list;
    public final int c = R.string.clips_private_error;
    public final int d = R.string.clips_show_top;
    public final pce e;
    public uqu0 f;
    public boolean g;

    /* compiled from: BlockedFooterEmptyViewProvider.kt */
    public static final class a extends RecyclerView.e0 {
    }

    public of7(pce pceVar) {
        this.e = pceVar;
    }

    @Override // xsna.h6s
    public final View a(Context context, ViewGroup viewGroup) {
        uqu0 uqu0Var = new uqu0(context, null, 6);
        this.f = uqu0Var;
        c(this.g);
        return uqu0Var;
    }

    @Override // xsna.h6s
    public final RecyclerView.e0 b(Context context, ViewGroup viewGroup) {
        return new a(a(context, viewGroup));
    }

    public final void c(boolean z) {
        this.g = z;
        com.vk.core.view.components.paging.list.a aVar = new com.vk.core.view.components.paging.list.a(z ? new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_lock_outline_56), new a8g(VkColorToken.IconSecondary), null, 28) : null, new VkPlaceholder.b((tlo0) null, z ? tq.h(tlo0.Companion, this.c) : tq.h(tlo0.Companion, this.b), com.vk.core.compose.component.semantics.b.a(null, new z90(7), 3), 3), z ? null : new VkPlaceholder.a(new VkPlaceholder.a.C0854a(tq.h(tlo0.Companion, this.d), new wm1(this, 7), null, null, null, VkButton.Mode.Tertiary, null, false, com.vk.core.compose.component.semantics.b.a(null, new lt0(10), 3), 892), (VkPlaceholder.a.C0854a) null, 6));
        uqu0 uqu0Var = this.f;
        if (uqu0Var != null) {
            uqu0Var.a(aVar);
        }
    }
}
