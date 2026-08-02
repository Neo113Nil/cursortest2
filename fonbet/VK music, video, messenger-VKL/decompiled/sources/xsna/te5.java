package xsna;

import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.ui.holders.author.AuthorsVideoGroupCardVh;
import com.vk.dto.gift.GiftItem;
import com.vk.newsfeed.common.presentation.model.items.MyTargetInternalNativeAdBlsUiDto;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.sharing.api.dto.Target;
import com.vk.superapp.vkpay.checkout.data.model.PayMethodData;
import com.vk.voip.ui.call_by_link.ui.VoipCallByLinkViewState;
import com.vk.voip.ui.call_by_link.ui.a;
import com.vkontakte.android.attachments.DocumentAttachment;
import xsna.t6k;
import xsna.w9m0;
import xsna.y5c;
import xsna.ypq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class te5 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ te5(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PayMethodData payMethodData;
        switch (this.b) {
            case 0:
                AuthorsVideoGroupCardVh authorsVideoGroupCardVh = (AuthorsVideoGroupCardVh) this.c;
                Context context = ((cd5) this.d).getContext();
                UIBlockGroup uIBlockGroup = authorsVideoGroupCardVh.e;
                authorsVideoGroupCardVh.h(context, uIBlockGroup != null ? uIBlockGroup.y : null, null, null, null);
                break;
            case 1:
                ((t06) this.c).l.b(((r06) this.d).b);
                break;
            case 2:
                nmb nmbVar = (nmb) this.c;
                tbg tbgVar = (tbg) this.d;
                mhy.d(nmbVar);
                tbgVar.invoke();
                break;
            case 3:
                t6k.j jVar = (t6k.j) this.c;
                qtd0 qtd0Var = (qtd0) this.d;
                nkr0 nkr0Var = jVar.l;
                if (nkr0Var != null) {
                    nkr0Var.a(qtd0Var.getId().longValue(), qtd0Var.t8());
                    break;
                }
                break;
            case 4:
                ((fr50) this.c).D.sa(new NewsfeedExternalAction.Navigation.n(((MyTargetInternalNativeAdBlsUiDto) this.d).i));
                break;
            case 5:
                rr90 rr90Var = (rr90) this.c;
                y5c.a aVar = (y5c.a) this.d;
                T t = rr90Var.o;
                if (t != 0 && (payMethodData = t.b) != null) {
                    aVar.c(payMethodData);
                    break;
                }
                break;
            case 6:
                su90 su90Var = (su90) this.c;
                x64 x64Var = (x64) this.d;
                DocumentAttachment documentAttachment = (DocumentAttachment) su90Var.C;
                if (documentAttachment != null) {
                    x64Var.c(documentAttachment);
                    break;
                }
                break;
            case 7:
                ((f9m0) this.c).l.invoke(((w9m0.a) this.d).g);
                break;
            case 8:
                ((com.vk.sharing.core.view.i) this.c).V5((Target) this.d);
                break;
            case 9:
                GiftItem giftItem = (GiftItem) this.c;
                ypq0.b bVar = (ypq0.b) this.d;
                String str = giftItem.k;
                if (str != null) {
                    bVar.n.c.t6(str);
                    break;
                }
                break;
            default:
                ((hgw0) this.d).b.a(new a.b.c(((VoipCallByLinkViewState.MediaSettingDialog.Visible) this.c).a));
                break;
        }
    }
}
