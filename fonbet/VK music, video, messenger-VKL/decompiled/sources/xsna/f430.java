package xsna;

import com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.a;
import com.vk.messagetemplates.impl.details.a;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class f430 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ f430(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                String i = ((l2v0) obj).i();
                if (i != null) {
                    this.c.invoke(new a.c(i));
                }
                break;
            case 1:
                List list = (List) obj;
                bn40.f(ho8.a(new StringBuilder("Tracks received ["), j5g.g0(list, null, null, null, 0, null, 63), ']'));
                this.c.invoke(list);
                break;
            default:
                this.c.invoke(new a.b((String) obj));
                break;
        }
        return s3q0.a;
    }
}
