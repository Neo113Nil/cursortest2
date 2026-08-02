package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tips.Tooltip;
import com.vk.superapp.ui.VkTextFieldView;
import com.vk.superapp.vkpay.checkout.core.ui.views.VkCardForm;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.e3m;

/* compiled from: NewCardFormViewHolder.kt */
/* loaded from: classes6.dex */
public final class l660 extends vfz<k660> {
    public static final /* synthetic */ int n = 0;
    public final b l;
    public final VkCardForm m;

    /* compiled from: NewCardFormViewHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<View, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            l660 l660Var = (l660) this.receiver;
            int i = l660.n;
            l660Var.getClass();
            Rect e = f4m.e(view);
            String string = l660Var.itemView.getContext().getString(R.string.vk_pay_checkout_bind_card_cvc_tooltip);
            Context context = l660Var.itemView.getContext();
            int color = l660Var.itemView.getContext().getColor(R.color.vk_white);
            Context context2 = l660Var.itemView.getContext();
            e3m.a aVar = e3m.a;
            Tooltip.l(new Tooltip(context, string, "", null, null, null, null, color, context2.getColor(R.color.vk_black), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, false, null, 0, false, null, null, null, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, 0, null, null, null, null, -392, 15), l660Var.itemView.getContext(), new RectF(e), false, false, false, false, 236);
            return s3q0.a;
        }
    }

    /* compiled from: NewCardFormViewHolder.kt */
    public interface b {
        void b(VkCardForm.b bVar);
    }

    public l660(ViewGroup viewGroup, b bVar) {
        super(R.layout.vk_pay_checkout_new_card_form_item, viewGroup);
        this.l = bVar;
        VkCardForm vkCardForm = (VkCardForm) this.itemView.findViewById(R.id.vkpay_method_card_replenish_cardform);
        this.m = vkCardForm;
        vkCardForm.setCvcIconClickListener(new a(1, this, l660.class, "onCvcIconClicked", "onCvcIconClicked(Landroid/view/View;)V", 0));
    }

    @Override // xsna.vfz
    public final void W5(k660 k660Var) {
        VkTextFieldView vkTextFieldView;
        VkCardForm.b bVar = k660Var.b;
        boolean z = bVar instanceof VkCardForm.b.a;
        VkCardForm vkCardForm = this.m;
        if (z) {
            vkCardForm.setCardData(((VkCardForm.b.a) bVar).a);
        } else if (bVar instanceof VkCardForm.b.c) {
            Set<VkCardForm.CardField> set = ((VkCardForm.b.c) bVar).a;
            vkCardForm.getClass();
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                int i = VkCardForm.c.$EnumSwitchMapping$0[((VkCardForm.CardField) it.next()).ordinal()];
                VkTextFieldView vkTextFieldView2 = null;
                if (i == 1) {
                    vkTextFieldView = vkCardForm.b;
                    if (vkTextFieldView == null) {
                        vkTextFieldView2.c.setBackgroundResource(R.drawable.vkui_bg_edittext_error);
                    }
                    vkTextFieldView2 = vkTextFieldView;
                    vkTextFieldView2.c.setBackgroundResource(R.drawable.vkui_bg_edittext_error);
                } else if (i == 2) {
                    vkTextFieldView = vkCardForm.c;
                    if (vkTextFieldView == null) {
                        vkTextFieldView2.c.setBackgroundResource(R.drawable.vkui_bg_edittext_error);
                    }
                    vkTextFieldView2 = vkTextFieldView;
                    vkTextFieldView2.c.setBackgroundResource(R.drawable.vkui_bg_edittext_error);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vkTextFieldView = vkCardForm.d;
                    if (vkTextFieldView == null) {
                        vkTextFieldView2.c.setBackgroundResource(R.drawable.vkui_bg_edittext_error);
                    }
                    vkTextFieldView2 = vkTextFieldView;
                    vkTextFieldView2.c.setBackgroundResource(R.drawable.vkui_bg_edittext_error);
                }
            }
        }
        vkCardForm.setCardInfoChangeListener(new o3w(this, 21));
    }
}
