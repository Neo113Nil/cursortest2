package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vkontakte.android.R;

/* compiled from: CommunityPriorityBlockGoodsItem.kt */
/* loaded from: classes5.dex */
public final class ldh extends we6 {
    public final mdh g;
    public final sz h;

    /* compiled from: CommunityPriorityBlockGoodsItem.kt */
    public static final class a extends vif0<ldh> {
        public final ComposeView n;
        public final wh50 o;

        public a(ViewGroup viewGroup, ComposeView composeView, mdh mdhVar, sz szVar) {
            super(composeView, viewGroup);
            this.n = composeView;
            this.o = androidx.compose.runtime.k.b(mdhVar);
            bwt0.Z(R.attr.vk_ui_background_content, composeView);
            composeView.setTag("market_priority_block_item_compose_view");
            composeView.setContent(new jai(1832319074, new a6(2, this, szVar), true));
        }

        @Override // xsna.vif0
        public final void i6(ldh ldhVar) {
            ldh ldhVar2 = ldhVar;
            if (ldhVar2 != null) {
                ((zak0) this.o).setValue(ldhVar2.g);
            }
        }

        public final mdh q6() {
            return (mdh) ((zak0) this.o).getValue();
        }
    }

    public ldh(mdh mdhVar, sz szVar) {
        this.g = mdhVar;
        this.h = szVar;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        ComposeView e = sv1.e(viewGroup.getContext());
        e.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new a(viewGroup, e, this.g, this.h);
    }

    @Override // xsna.we6
    public final int h() {
        return -248;
    }
}
