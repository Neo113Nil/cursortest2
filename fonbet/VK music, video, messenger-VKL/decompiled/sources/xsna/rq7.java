package xsna;

import android.view.View;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderBrandedVh;
import com.vk.core.view.components.tabs.VkTabs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class rq7 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rq7(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                ((x64) this.c).a(((sq7) this.d).C);
                break;
            case 1:
                VideoCatalogHeaderBrandedVh videoCatalogHeaderBrandedVh = (VideoCatalogHeaderBrandedVh) this.c;
                View view2 = (View) this.d;
                izs<View, s3q0> izsVar = videoCatalogHeaderBrandedVh.d;
                if (izsVar != null) {
                    izsVar.invoke(view2);
                    break;
                }
                break;
            default:
                VkTabs.k((VkTabs) this.c, (VkTabs.c) this.d);
                break;
        }
    }
}
