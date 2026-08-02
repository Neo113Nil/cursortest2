package xsna;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.tlo0;

/* compiled from: CommunityProfileAdsMarketPromoteAdapter.kt */
/* loaded from: classes5.dex */
public final class eeh extends zoj0<e11, b> {
    public final int e;
    public final FunctionReferenceImpl f;

    /* compiled from: CommunityProfileAdsMarketPromoteAdapter.kt */
    public static final class a extends m.e<e11> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(e11 e11Var, e11 e11Var2) {
            e11 e11Var3 = e11Var;
            e11 e11Var4 = e11Var2;
            return e11Var3 == e11Var4 && epx.f(e11Var3.a, e11Var4.a) && epx.f(e11Var3.b, e11Var4.b);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(e11 e11Var, e11 e11Var2) {
            return e11Var == e11Var2;
        }
    }

    /* compiled from: CommunityProfileAdsMarketPromoteAdapter.kt */
    public static final class b extends vif0<e11> {
        public final izs<String, s3q0> n;
        public final VkCell o;

        /* JADX WARN: Multi-variable type inference failed */
        public b(View view, izs<? super String, s3q0> izsVar) {
            super(view);
            this.n = izsVar;
            this.o = (VkCell) this.itemView.findViewById(R.id.vk_cell);
        }

        @Override // xsna.vif0
        public final void i6(e11 e11Var) {
            e11 e11Var2 = e11Var;
            VkCell.Middle.b a = VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(oq.d(tlo0.Companion, e11Var2.b), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, 14);
            VkCell vkCell = this.o;
            vkCell.setMiddle(a);
            tlo0.h hVar = new tlo0.h(e11Var2.a);
            VkButton.Mode mode = VkButton.Mode.Secondary;
            VkCell.Right.e eVar = null;
            VkCell.Right.ExtraAction.a aVar = null;
            vkCell.setRight(new VkCell.Right.d(new VkCell.Right.a.b(hVar, new j3(7, this, e11Var2), VkButton.Appearance.Accent, mode, null, null, null, null, 2032), eVar, aVar, (VkCell.Right.b) null, 30));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public eeh(int i, izs<? super String, s3q0> izsVar) {
        super(new com.vk.lists.a(new a()));
        this.e = i;
        this.f = (FunctionReferenceImpl) izsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((b) e0Var).V5(this.c.c(i));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View b2 = tf3.b(viewGroup, R.layout.community_item_content_ads_market_promote_item, viewGroup, false);
        f4m.y(this.e, b2);
        return new b(b2, this.f);
    }
}
