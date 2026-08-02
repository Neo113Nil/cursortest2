package xsna;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import xsna.aqx0;

/* compiled from: BaseCommonQuestionsView.kt */
/* loaded from: classes17.dex */
public final class ob6 extends aqx0.b {
    public int d;
    public boolean e;
    public final /* synthetic */ pb6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob6(pb6 pb6Var) {
        super(0);
        this.f = pb6Var;
    }

    @Override // xsna.aqx0.b
    public final bqx0 d(bqx0 bqx0Var, List<aqx0> list) {
        ygy ygyVar;
        int availableKeyboardAreaHeight;
        ygy ygyVar2;
        if (this.e) {
            this.e = false;
            int i = bqx0Var.a.i(8).d;
            pb6 pb6Var = this.f;
            if (i == 0) {
                RecyclerView recyclerView = pb6Var.B;
                if (recyclerView != null && (ygyVar2 = pb6Var.C) != null) {
                    com.vk.movika.sdk.base.model.e eVar = new com.vk.movika.sdk.base.model.e(pb6Var, 5);
                    if (!ygyVar2.b) {
                        recyclerView.addOnScrollListener(ygyVar2);
                        ygyVar2.c = eVar;
                        ygyVar2.b = true;
                    }
                }
                int i2 = this.d;
                int[] iArr = new int[2];
                pb6Var.getLocationInWindow(iArr);
                int p = i2 - ((iah0.p(pb6Var.getContext()) - iArr[1]) - pb6Var.getHeight());
                int i3 = p >= 0 ? p : 0;
                availableKeyboardAreaHeight = pb6Var.getAvailableKeyboardAreaHeight();
                pb6Var.setKeyboardAreaHeight(Integer.min(i3, availableKeyboardAreaHeight));
                return bqx0Var;
            }
            RecyclerView recyclerView2 = pb6Var.B;
            if (recyclerView2 != null && (ygyVar = pb6Var.C) != null) {
                recyclerView2.removeOnScrollListener(ygyVar);
                ygyVar.c = null;
                ygyVar.b = false;
            }
            pb6Var.setKeyboardAreaHeight(0);
        }
        return bqx0Var;
    }

    @Override // xsna.aqx0.b
    public final aqx0.a e(aqx0 aqx0Var, aqx0.a aVar) {
        if ((aqx0Var.a.d() & 8) != 0) {
            this.d = aVar.b.d;
            this.e = true;
        }
        return aVar;
    }
}
