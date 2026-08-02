package xsna;

import android.content.Context;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.profile.user.impl.ui.viewdelegates.SnowballsCoverHolder;
import java.util.HashSet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class z7k0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z7k0(boolean z, Object obj, Object obj2, int i) {
        this.b = i;
        this.c = z;
        this.d = obj;
        this.e = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z = this.c;
        switch (i) {
            case 0:
                String str = (String) obj3;
                k7k0 k7k0Var = (k7k0) obj2;
                tgi0 tgi0Var = (tgi0) obj;
                if (z) {
                    qgi0.j(tgi0Var, 0);
                }
                qgi0.k(tgi0Var, str);
                tgi0Var.a(wfi0.v, new ck(null, new dbj0(k7k0Var, 2)));
                break;
            default:
                vrq0 vrq0Var = (vrq0) obj3;
                UserProfileHeaderView userProfileHeaderView = vrq0Var.r;
                d9f0 d9f0Var = (d9f0) obj2;
                if (z) {
                    vrq0Var.D.a.setVisibility(8);
                    lov.a(vrq0Var.q.c, d9f0Var, new i8n0(vrq0Var, 5), 0, userProfileHeaderView.getTopPadding(), 4);
                } else {
                    SnowballsCoverHolder snowballsCoverHolder = vrq0Var.D;
                    prq0 prq0Var = new prq0(vrq0Var, r4);
                    int topPadding = userProfileHeaderView.getTopPadding();
                    Context context = vrq0Var.itemView.getContext();
                    HashSet hashSet = iah0.a;
                    lov.a(snowballsCoverHolder, d9f0Var, prq0Var, topPadding + (fnj.d(context) ? iah0.a(25) : 0), 0, 8);
                }
                break;
        }
        return s3q0.a;
    }
}
