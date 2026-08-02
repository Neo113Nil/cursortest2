package xsna;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.dto.user.RequestUserProfile;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.itx;

/* compiled from: FriendsAdapter.kt */
/* loaded from: classes5.dex */
public final class xjs extends zoj0<itx, RecyclerView.e0> {
    public final byo e;
    public final mi10 f;

    /* compiled from: FriendsAdapter.kt */
    public static final class a extends RecyclerView.e0 {
        public final ViewGroup l;
        public final izs<RequestUserProfile, s3q0> m;
        public final izs<RequestUserProfile, s3q0> n;
        public final VKImageView o;
        public final TextView p;
        public final TextView q;
        public final VkSimpleButton r;
        public final VkSimpleButton s;

        public a(ViewGroup viewGroup, byo byoVar, mi10 mi10Var) {
            super(tf3.b(viewGroup, R.layout.new_social_graph_item_add_friend, viewGroup, false));
            this.l = viewGroup;
            this.m = byoVar;
            this.n = mi10Var;
            this.o = (VKImageView) this.itemView.findViewById(R.id.user_photo);
            this.p = (TextView) this.itemView.findViewById(R.id.user_name);
            this.q = (TextView) this.itemView.findViewById(R.id.user_city);
            this.r = (VkSimpleButton) this.itemView.findViewById(R.id.user_add);
            this.s = (VkSimpleButton) this.itemView.findViewById(R.id.user_add_cancel);
        }
    }

    /* compiled from: FriendsAdapter.kt */
    public static final class b {
    }

    /* compiled from: FriendsAdapter.kt */
    public static final class c extends RecyclerView.e0 {
    }

    public xjs(byo byoVar, mi10 mi10Var) {
        this.e = byoVar;
        this.f = mi10Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return this.c.c(i) instanceof itx.b ? 1 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        String string;
        itx itxVar = (itx) this.c.c(i);
        if ((itxVar instanceof itx.b) || !(itxVar instanceof itx.a)) {
            return;
        }
        a aVar = e0Var instanceof a ? (a) e0Var : null;
        if (aVar != null) {
            RequestUserProfile requestUserProfile = ((itx.a) itxVar).a;
            VkSimpleButton vkSimpleButton = aVar.s;
            VkSimpleButton vkSimpleButton2 = aVar.r;
            ViewGroup viewGroup = aVar.l;
            VKImageView vKImageView = aVar.o;
            String str = requestUserProfile.h;
            Bundle bundle = requestUserProfile.s;
            vKImageView.load(str);
            aVar.p.setText(requestUserProfile.e);
            TextView textView = aVar.q;
            Boolean bool = requestUserProfile.i0;
            Boolean bool2 = Boolean.TRUE;
            bwt0.p0(textView, epx.f(bool, bool2) || !((string = bundle.getString("city_name", "")) == null || drm0.N(string)));
            textView.setText(epx.f(requestUserProfile.i0, bool2) ? viewGroup.getContext().getString(R.string.social_graph_request_sent) : bundle.getString("city_name", ""));
            textView.setTextColor(epx.f(requestUserProfile.i0, bool2) ? viewGroup.getContext().getColor(R.color.vk_secondary_button_text) : e3m.f(R.attr.vk_ui_text_secondary, viewGroup.getContext()));
            bwt0.p0(vkSimpleButton2, !epx.f(requestUserProfile.i0, bool2));
            bwt0.p0(vkSimpleButton, epx.f(requestUserProfile.i0, bool2));
            bwt0.i0(aVar.itemView, new qt5(10, aVar, requestUserProfile));
            bwt0.i0(vkSimpleButton2, new ij8(16, aVar, requestUserProfile));
            bwt0.i0(vkSimpleButton, new com.vk.im.engine.commands.messages.a(22, aVar, requestUserProfile));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new c(tf3.b(viewGroup, R.layout.new_social_graph_item_title, viewGroup, false));
        }
        if (i == 2) {
            return new a(viewGroup, this.e, this.f);
        }
        throw new IllegalArgumentException(lhg.a(i, "Unknown view type "));
    }
}
