package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vkontakte.android.R;

/* compiled from: CommunityProfileClipTitleAdapter.kt */
/* loaded from: classes5.dex */
public final class yeh extends zoj0<a, b> {
    public final ss3 e;

    /* compiled from: CommunityProfileClipTitleAdapter.kt */
    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClipsHeader(title=");
            sb.append(this.a);
            sb.append(", rightButtonTitle=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: CommunityProfileClipTitleAdapter.kt */
    public final class b extends vif0<a> {
        public final gzs<s3q0> n;
        public final VkGroupHeader o;

        public b(View view, ss3 ss3Var) {
            super(view);
            this.n = ss3Var;
            this.o = (VkGroupHeader) view.findViewById(R.id.community_profile_item_group_header);
        }

        @Override // xsna.vif0
        public final void i6(a aVar) {
            a aVar2 = aVar;
            VkGroupHeader.d dVar = new VkGroupHeader.d(aVar2.a, null, null, null, 0, null, 510);
            VkGroupHeader vkGroupHeader = this.o;
            vkGroupHeader.setTitle(dVar);
            vkGroupHeader.setSize(VkGroupHeader.Size.Medium);
            String str = aVar2.b;
            VkGroupHeader.Right right = null;
            if (str != null) {
                right = new VkGroupHeader.Right(new VkGroupHeader.Right.ExtraContent.a(oq.d(tlo0.Companion, str), new h9(this, 28), null, null, VkButton.Appearance.Accent, null, 492), null, null, 6);
            }
            vkGroupHeader.setRight(right);
        }
    }

    public yeh(ss3 ss3Var) {
        this.e = ss3Var;
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((b) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View b2 = tf3.b(viewGroup, R.layout.community_item_content_header_item, viewGroup, false);
        awt0.x(b2, 0, iah0.a(2), 0, 0, 13);
        return new b(b2, this.e);
    }
}
