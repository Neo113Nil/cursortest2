package xsna;

import android.view.View;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderDebrandedVh;
import xsna.s8f0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class r8f0 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r8f0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                s8f0.a aVar = (s8f0.a) this.c;
                s8f0 s8f0Var = (s8f0) this.d;
                if (aVar.getAdapterPosition() != -1) {
                    s8f0Var.d.invoke(s8f0Var.c.get(aVar.getAdapterPosition()));
                    break;
                }
                break;
            default:
                VideoCatalogHeaderDebrandedVh videoCatalogHeaderDebrandedVh = (VideoCatalogHeaderDebrandedVh) this.c;
                View view2 = (View) this.d;
                izs<View, s3q0> izsVar = videoCatalogHeaderDebrandedVh.d;
                if (izsVar != null) {
                    izsVar.invoke(view2);
                    break;
                }
                break;
        }
    }
}
