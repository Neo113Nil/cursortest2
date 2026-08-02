package xsna;

import android.view.View;
import com.vk.feed.design.view.newsfeed.ads_mytarget.MyTargetAdHideReasonsView;
import xsna.s4m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class q4m implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q4m(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                gzs gzsVar = (gzs) this.c;
                s4m s4mVar = (s4m) this.d;
                gzsVar.invoke();
                s4m.a.q6(s4mVar, false);
                break;
            case 1:
                MyTargetAdHideReasonsView myTargetAdHideReasonsView = (MyTargetAdHideReasonsView) this.c;
                MyTargetAdHideReasonsView.ActionModel actionModel = (MyTargetAdHideReasonsView.ActionModel) this.d;
                izs<? super String, s3q0> izsVar = myTargetAdHideReasonsView.e;
                if (izsVar != null) {
                    izsVar.invoke(actionModel.c);
                    break;
                }
                break;
            case 2:
                du90 du90Var = (du90) this.c;
                du90Var.l.c((wt90) this.d);
                break;
            default:
                yads.n0.a((yads.n0) this.c, (yads.u90) this.d, view);
                break;
        }
    }

    public /* synthetic */ q4m(gzs gzsVar, s4m.a aVar, s4m s4mVar) {
        this.b = 0;
        this.c = gzsVar;
        this.d = s4mVar;
    }
}
