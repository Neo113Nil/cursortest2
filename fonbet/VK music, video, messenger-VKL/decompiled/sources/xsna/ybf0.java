package xsna;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.stickers.StickerPackRecommendationBlock;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.GiftData;
import com.vkontakte.android.R;
import xsna.f3l0;

/* compiled from: RecommendationsListHolder.kt */
/* loaded from: classes6.dex */
public final class ybf0 extends yr6<bbf0> implements f3l0.c, f3l0.b {
    public final g3l0 l;
    public final xaf0 m;
    public final VkButton n;
    public Bundle o;

    public ybf0(g3l0 g3l0Var, smg smgVar, RecyclerView.u uVar, rdf0 rdf0Var, ContextUser contextUser, GiftData giftData, ViewGroup viewGroup) {
        super(R.layout.sticker_details_recommendations_block_item, viewGroup);
        this.l = g3l0Var;
        this.m = new xaf0(smgVar, rdf0Var, this.itemView, contextUser, giftData, new xbf0(this), uVar);
        this.n = (VkButton) this.itemView.findViewById(R.id.subscription_button);
    }

    @Override // xsna.f3l0.b
    public final void F3() {
        xaf0 xaf0Var = this.m;
        dcl0<hfz> dcl0Var = xaf0Var.q;
        if (dcl0Var != null) {
            xaf0Var.p.getRecyclerView().removeOnScrollListener(dcl0Var);
        }
    }

    @Override // xsna.vfz
    public final void V5() {
        xaf0 xaf0Var = this.m;
        xaf0Var.getClass();
        xaf0Var.m = y9l0.a.subscribe(new n3t(new qz40(xaf0Var, 17), 20));
    }

    @Override // xsna.vfz
    public final void a6() {
        xaf0 xaf0Var = this.m;
        io.reactivex.rxjava3.disposables.c cVar = xaf0Var.m;
        if (cVar != null) {
            cVar.dispose();
        }
        xaf0Var.l.e();
    }

    @Override // xsna.f3l0.c
    public final void b2(Bundle bundle) {
        xaf0 xaf0Var = this.m;
        if (xaf0Var.i == null) {
            return;
        }
        RecyclerView.o layoutManager = xaf0Var.p.getRecyclerView().getLayoutManager();
        bundle.putParcelable("state_block_id_" + xaf0Var.i, layoutManager != null ? layoutManager.onSaveInstanceState() : null);
    }

    @Override // xsna.f3l0.c
    public final void d(Bundle bundle) {
        this.o = bundle;
    }

    @Override // xsna.f3l0.b
    public final void e3() {
        dcl0<hfz> dcl0Var = this.m.q;
        if (dcl0Var == null || !dcl0.n(dcl0Var.b)) {
            return;
        }
        dcl0Var.m();
    }

    @Override // xsna.yr6
    /* renamed from: i6, reason: merged with bridge method [inline-methods] */
    public final void W5(bbf0 bbf0Var) {
        StickerStockItem stickerStockItem = bbf0Var.c;
        StickerPackRecommendationBlock stickerPackRecommendationBlock = bbf0Var.b;
        int i = bbf0Var.e;
        xaf0 xaf0Var = this.m;
        View view = xaf0Var.o;
        xaf0Var.l.e();
        com.vk.lists.c cVar = xaf0Var.k;
        cVar.s(stickerPackRecommendationBlock.f);
        String str = stickerPackRecommendationBlock.b;
        xaf0Var.i = str;
        xaf0Var.h = i;
        cbf0 a = xaf0Var.c.a(str);
        if (a == null) {
            xaf0Var.j.clear();
            f4m.j(xaf0Var.d);
            cVar.p(false);
        } else {
            if (a.c.size() > 3) {
                jjc.g(view, new u2y(xaf0Var, stickerPackRecommendationBlock, stickerStockItem, 1));
                view.setVisibility(0);
            } else {
                view.setVisibility(4);
            }
            xaf0Var.a(a);
        }
        Bundle bundle = this.o;
        if (bundle != null && xaf0Var.i != null) {
            String str2 = "state_block_id_" + xaf0Var.i;
            Parcelable parcelable = bundle.getParcelable(str2);
            if (parcelable != null) {
                RecyclerView.o layoutManager = xaf0Var.p.getRecyclerView().getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.onRestoreInstanceState(parcelable);
                }
                bundle.remove(str2);
            }
        }
        boolean f = epx.f(stickerPackRecommendationBlock.c, "author_packs");
        VkButton vkButton = this.n;
        if (!f) {
            vkButton.setVisibility(8);
            return;
        }
        boolean f2 = epx.f(bbf0Var.d, Boolean.TRUE);
        vkButton.setVisibility(0);
        jjc.f(new pgr(3, this, stickerStockItem), vkButton);
        if (f2) {
            vkButton.setText(this.itemView.getContext().getString(R.string.stickers_unsubscribe_author));
            vkButton.a5(true, Integer.valueOf(R.drawable.vk_icon_notification_check_outline_28));
        } else {
            vkButton.setText(this.itemView.getContext().getString(R.string.stickers_subscribe_author));
            vkButton.a5(true, Integer.valueOf(R.drawable.vk_icon_notification_add_outline_28));
        }
    }
}
