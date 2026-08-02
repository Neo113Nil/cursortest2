package xsna;

import com.vk.stickers.ContextUser;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class u1y0 implements izs {
    public final /* synthetic */ y1y0 b;
    public final /* synthetic */ ContextUser c;
    public final /* synthetic */ int d;

    public /* synthetic */ u1y0(y1y0 y1y0Var, ContextUser contextUser, int i) {
        this.b = y1y0Var;
        this.c = contextUser;
        this.d = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        dqt dqtVar = (dqt) obj;
        y1y0 y1y0Var = this.b;
        ArrayList arrayList = new ArrayList(y1y0Var.o);
        ContextUser contextUser = this.c;
        if (contextUser == null) {
            arrayList.clear();
        } else if (contextUser.Ab(this.d)) {
            arrayList.remove(contextUser.b);
        }
        bay.c().c(dqtVar.b, arrayList, y1y0Var.a.getContext());
        return s3q0.a;
    }
}
