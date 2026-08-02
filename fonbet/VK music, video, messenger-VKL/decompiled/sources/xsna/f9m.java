package xsna;

import android.view.View;
import com.vk.catalog2.common.ui.mvp.holder.header.VkSearchViewVh;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.mentions.MentionProfileVO;
import xsna.g9m;
import xsna.r9n0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class f9m implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f9m(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                g9m g9mVar = (g9m) this.c;
                g9m.a aVar = (g9m.a) this.d;
                com.vk.movika.sdk.base.observable.w wVar = g9mVar.d;
                if (wVar != null) {
                    wVar.invoke(aVar);
                    break;
                }
                break;
            case 1:
                p320 p320Var = (p320) this.c;
                p320Var.l.invoke((MentionProfileVO) this.d);
                break;
            case 2:
                r9n0 r9n0Var = (r9n0) this.c;
                r9n0.a aVar2 = (r9n0.a) this.d;
                r9n0Var.e.invoke(r9n0Var.c.c(aVar2.getBindingAdapterPosition()));
                break;
            default:
                ((VkSearchViewVh) this.c).e.a3(((VkSearchView) this.d).getQuery());
                break;
        }
    }
}
