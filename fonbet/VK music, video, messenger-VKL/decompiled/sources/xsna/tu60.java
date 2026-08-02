package xsna;

import com.vk.newsfeed.api.data.NewsfeedList;
import java.util.List;
import xsna.jv60;
import xsna.xh60;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class tu60 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ dv60 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    public /* synthetic */ tu60(int i, dv60 dv60Var, String str, int i2) {
        this.b = i;
        this.c = dv60Var;
        this.d = str;
        this.e = i2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean m;
        lu60 lu60Var = (lu60) obj;
        int i = this.b;
        if (i == 0) {
            ce60 ce60Var = ce60.b;
            Boolean c = lu60Var.c();
            ce60Var.getClass();
            ce60.n(c);
        }
        Boolean c2 = lu60Var.c();
        if (c2 != null) {
            m = c2.booleanValue();
        } else {
            ce60.b.getClass();
            m = ce60.m();
        }
        ce60.b.getClass();
        String j = ce60.j(i, m);
        dv60 dv60Var = this.c;
        pn60.b(dv60Var.m, j);
        String str = this.d;
        if (!epx.f(str, j) || this.e != i) {
            dv60Var.c(new xh60.d(i, j, m));
        }
        if (!epx.f(str, j)) {
            dv60Var.e(new jv60.c.b(j));
        }
        boolean z = lu60Var instanceof ew60;
        if (!z && !(lu60Var instanceof bl60)) {
            return lu60Var;
        }
        List<NewsfeedList> list = z ? ((ew60) lu60Var).d : lu60Var instanceof bl60 ? ((bl60) lu60Var).d : null;
        if (list != null) {
            if (o25.a().b()) {
                wmi0.a.m("newsfeed_lists_cache:" + ply.a(), list);
            }
            if (i == 0) {
                dv60Var.c(new xh60.e(new yo60.k(new ns60(list))));
            }
        }
        return lu60Var;
    }
}
