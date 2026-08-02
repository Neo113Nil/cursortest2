package xsna;

import android.view.View;
import com.vk.clips.design.view.component.ads.ClipMarketCardView;
import xsna.u0q0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class r7d implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r7d(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.c;
                ClipMarketCardView clipMarketCardView = (ClipMarketCardView) this.d;
                if (izsVar != null) {
                    izsVar.invoke(clipMarketCardView.y);
                    break;
                }
                break;
            default:
                u0q0.a aVar = (u0q0.a) this.c;
                qwd0 qwd0Var = (qwd0) this.d;
                u0q0 u0q0Var = aVar.c;
                if (u0q0Var != null) {
                    u0q0Var.a();
                }
                qwd0Var.onClick(view);
                break;
        }
    }
}
