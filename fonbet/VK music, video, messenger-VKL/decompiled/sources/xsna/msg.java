package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: CommunityAvitoIntegrationItem.kt */
/* loaded from: classes5.dex */
public final class msg extends we6 {
    public final nsg g;
    public final uh3 h;

    /* compiled from: CommunityAvitoIntegrationItem.kt */
    public static final class a extends vif0<msg> {
        @Override // xsna.vif0
        public final void i6(msg msgVar) {
            msgVar.g.getClass();
            throw null;
        }
    }

    public msg(nsg nsgVar, uh3 uh3Var, com.vk.movika.sdk.base.flow.binding.g gVar) {
        this.g = nsgVar;
        this.h = uh3Var;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        a aVar = new a(viewGroup, R.layout.item_community_avito_banner, 0);
        VKImageView vKImageView = (VKImageView) aVar.itemView.findViewById(R.id.image);
        TextView textView = (TextView) aVar.itemView.findViewById(R.id.title);
        bwt0.i0(aVar.itemView, new o1e(aVar, 4));
        int a2 = iah0.a(20);
        int a3 = iah0.a(12);
        bwt0.m0(a2, a2, vKImageView);
        vKImageView.setImageResource(R.drawable.vk_icon_work_outline_20);
        f4m.s(a3, textView);
        textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_link));
        return aVar;
    }

    @Override // xsna.we6
    public final int h() {
        return -222;
    }
}
