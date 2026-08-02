package xsna;

import com.vk.stickers.ContextUser;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ucm0 implements izs {
    public final /* synthetic */ xcm0 b;
    public final /* synthetic */ ContextUser c;
    public final /* synthetic */ int d;

    public /* synthetic */ ucm0(int i, ContextUser contextUser, xcm0 xcm0Var) {
        this.b = xcm0Var;
        this.c = contextUser;
        this.d = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        dqt dqtVar = (dqt) obj;
        xcm0 xcm0Var = this.b;
        ArrayList arrayList = new ArrayList(e43.m(xcm0Var.i.d()));
        ContextUser contextUser = this.c;
        if (contextUser == null) {
            arrayList.clear();
        } else if (contextUser.Ab(this.d)) {
            arrayList.remove(contextUser.b);
        }
        g2v.d().a().g(xcm0Var.b, arrayList, dqtVar.b, "sticker_longtap_keyboard");
        return s3q0.a;
    }
}
