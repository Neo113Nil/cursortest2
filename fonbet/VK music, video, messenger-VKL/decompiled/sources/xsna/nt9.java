package xsna;

import android.view.View;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.dto.common.clips.TrendingHashtag;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.superapp.browser.internal.ui.sheet.VkOrderResultSheetDialog;
import com.vk.superapp.vkpay.checkout.data.model.Card;
import xsna.y5c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class nt9 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nt9(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Card card;
        switch (this.b) {
            case 0:
                ot9 ot9Var = (ot9) this.c;
                y5c.a aVar = (y5c.a) this.d;
                ht9 ht9Var = ot9Var.r;
                if (ht9Var != null && (card = (Card) ht9Var.b) != null) {
                    aVar.c(card);
                    break;
                }
                break;
            case 1:
                u1f u1fVar = (u1f) this.c;
                ClipsRouter.j(u1fVar.w0.a(), u1fVar.itemView.getContext(), new ClipGridParams.OnlyId.Hashtag(((TrendingHashtag) this.d).b), false, null, null, 60);
                break;
            case 2:
                ((k2s) this.c).l.v();
                break;
            default:
                VkOrderResultSheetDialog vkOrderResultSheetDialog = (VkOrderResultSheetDialog) this.c;
                gzs gzsVar = (gzs) this.d;
                dw20 dw20Var = vkOrderResultSheetDialog.b;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                vkOrderResultSheetDialog.b = null;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
        }
    }
}
