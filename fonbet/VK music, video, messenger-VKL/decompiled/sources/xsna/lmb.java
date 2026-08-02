package xsna;

import android.view.View;
import com.vk.catalog2.common.dto.ui.subscriptions.UIBlockHorizontalButtonLarge;
import com.vk.catalog2.common.ui.holders.button.HorizontalButtonLargeVh;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.actionlinks.ActionLink;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class lmb implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lmb(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                nmb nmbVar = (nmb) obj3;
                mhy.d(nmbVar);
                ((gmb) obj2).a(nmbVar.getContext(), (ActionLink) ((pmb) obj).b);
                break;
            default:
                HorizontalButtonLargeVh horizontalButtonLargeVh = (HorizontalButtonLargeVh) obj3;
                String str = (String) obj2;
                UIBlockHorizontalButtonLarge uIBlockHorizontalButtonLarge = (UIBlockHorizontalButtonLarge) obj;
                String str2 = uIBlockHorizontalButtonLarge.f;
                LaunchContext.a aVar = new LaunchContext.a();
                aVar.d = str2;
                LaunchContext a = aVar.a();
                maz e = horizontalButtonLargeVh.b.e();
                VkCell vkCell = horizontalButtonLargeVh.d;
                if (vkCell == null) {
                    vkCell = null;
                }
                maz.c(e, vkCell.getContext(), str, a, null, null, 24);
                s1v s1vVar = p1s0.a;
                p1s0.c(uIBlockHorizontalButtonLarge, new com.vk.stat.scheme.j0());
                break;
        }
    }
}
