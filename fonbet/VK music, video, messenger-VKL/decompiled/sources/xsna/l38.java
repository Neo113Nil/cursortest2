package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.vk.lists.ListDataSet;
import com.vk.masks.MasksView;
import com.vk.superapp.api.dto.user.WebUserShortInfo;
import xsna.jgz0;
import xsna.kkz0;
import xsna.m38;
import xsna.ydz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class l38 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l38(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kkz0.a aVar;
        switch (this.b) {
            case 0:
                m38.a aVar2 = (m38.a) this.c;
                p38 p38Var = (p38) this.d;
                if (!jjc.b()) {
                    aVar2.m.invoke();
                    p38Var.d.invoke();
                    break;
                }
                break;
            case 1:
                MasksView masksView = (MasksView) this.c;
                MasksView.b bVar = (MasksView.b) this.d;
                xg10 xg10Var = (xg10) ((pd90) masksView.getPagindatedView().getRecyclerView().getAdapter()).c;
                int w = ((ListDataSet) xg10Var.c).w(new ki10(new rlh(bVar, 22), 0));
                if (w >= 0 && w < xg10Var.E0()) {
                    MasksView.b.a aVar3 = new MasksView.b.a(bVar.getContext());
                    aVar3.setTargetPosition(w);
                    ((LinearLayoutManager) masksView.getPagindatedView().getRecyclerView().getLayoutManager()).startSmoothScroll(aVar3);
                    break;
                }
                break;
            case 2:
                mgv0 mgv0Var = (mgv0) this.c;
                izs izsVar = (izs) this.d;
                WebUserShortInfo webUserShortInfo = mgv0Var.q;
                if (webUserShortInfo != null) {
                    izsVar.invoke(webUserShortInfo);
                    break;
                }
                break;
            default:
                lly0 lly0Var = (lly0) this.c;
                ydz0.a aVar4 = (ydz0.a) this.d;
                int i = view == lly0Var.i ? 2 : 1;
                akz0 akz0Var = new akz0();
                ydz0 ydz0Var = (ydz0) ((bj50) aVar4).c;
                if (view.isEnabled() && (aVar = ydz0Var.t) != null) {
                    ((jgz0.b) aVar).a(i, akz0Var);
                    break;
                }
                break;
        }
    }
}
