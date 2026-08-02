package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vkontakte.android.R;

/* compiled from: CommunityProfileContentTitleAdapter.kt */
/* loaded from: classes5.dex */
public final class hlh extends zoj0<String, a> {
    public final String e;
    public final int f;
    public final boolean g;

    /* compiled from: CommunityProfileContentTitleAdapter.kt */
    public final class a extends vif0<String> {
        public final VkGroupHeader n;

        public a(hlh hlhVar, View view) {
            super(view);
            VkGroupHeader vkGroupHeader = (VkGroupHeader) view.findViewById(R.id.community_profile_item_group_header);
            this.n = vkGroupHeader;
            this.itemView.getContext();
            vkGroupHeader.setShowTopDivider(hlhVar.g);
        }

        @Override // xsna.vif0
        public final void i6(String str) {
            VkGroupHeader.d dVar = new VkGroupHeader.d(str, null, null, null, 0, null, 510);
            VkGroupHeader vkGroupHeader = this.n;
            vkGroupHeader.setTitle(dVar);
            vkGroupHeader.setSize(VkGroupHeader.Size.Medium);
        }
    }

    public hlh(String str, int i, int i2) {
        i = (i2 & 2) != 0 ? iah0.a(8) : i;
        boolean z = (i2 & 4) != 0;
        this.e = str;
        this.f = i;
        this.g = z;
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((a) e0Var).V5(this.e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View b = tf3.b(viewGroup, R.layout.community_item_content_header_item, viewGroup, false);
        awt0.x(b, 0, this.f, 0, 0, 13);
        return new a(this, b);
    }
}
