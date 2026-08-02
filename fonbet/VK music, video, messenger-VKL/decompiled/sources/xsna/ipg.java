package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ipg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ ipg(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        mnt0 c;
        switch (this.b) {
            case 0:
                this.c.performClick();
                ((etv0) obj).b(false);
                break;
            default:
                Object obj2 = (RecyclerView.e0) obj;
                ent0 ent0Var = obj2 instanceof ent0 ? (ent0) obj2 : null;
                if (ent0Var != null && (c = x5t0.c(ent0Var)) != null) {
                    c.G2(this.c);
                }
                break;
        }
        return s3q0.a;
    }
}
