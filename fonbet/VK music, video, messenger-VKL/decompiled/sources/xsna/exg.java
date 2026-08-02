package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vkontakte.android.R;
import kotlin.Pair;

/* compiled from: CommunityClosedItem.kt */
/* loaded from: classes5.dex */
public final class exg extends we6 {
    public final fxg g;
    public final int h = -215;

    /* compiled from: CommunityClosedItem.kt */
    public static final class a extends vif0<exg> {
        public final VkPlaceholder n;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(ViewGroup viewGroup) {
            super(r0, viewGroup);
            VkPlaceholder vkPlaceholder = new VkPlaceholder(viewGroup.getContext(), null, 6, 0);
            vkPlaceholder.setId(R.id.vk_community_closed_info_placeholder);
            this.n = (VkPlaceholder) this.itemView;
        }

        @Override // xsna.vif0
        public final void i6(exg exgVar) {
            Pair pair = exgVar.g.b ? new Pair(Integer.valueOf(R.string.community_closed_title), Integer.valueOf(R.string.community_closed_subtitle)) : null;
            VkPlaceholder.c.C0860c c0860c = new VkPlaceholder.c.C0860c(new ulw(R.drawable.vk_icon_lock_outline_56), null, new x7g(R.attr.vk_ui_icon_secondary), null, 26);
            VkPlaceholder vkPlaceholder = this.n;
            vkPlaceholder.setTop(c0860c);
            vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, pair != null ? tq.h(tlo0.Companion, ((Number) pair.i()).intValue()) : null), new VkPlaceholder.b.C0859b(14, pair != null ? tq.h(tlo0.Companion, ((Number) pair.j()).intValue()) : null)));
        }
    }

    public exg(fxg fxgVar) {
        this.g = fxgVar;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @Override // xsna.we6
    public final int h() {
        return this.h;
    }
}
