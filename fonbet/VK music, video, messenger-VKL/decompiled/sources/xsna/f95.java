package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.SubnavigationBarAppearance;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonMode;
import com.vk.profile.community.members.impl.ui.MembersState;
import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import xsna.q630;
import xsna.uum0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class f95 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f95(int i, int i2, Object obj, Object obj2, Object obj3, q630 q630Var) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                k95.c((AuthorHeaderConfig.Info) this.d, (AuthorHeaderConfig.Author) this.e, (AuthorHeaderConfig.Viewer) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                db10.a((String) this.d, (String) this.e, (frv0) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                MembersState membersState = (MembersState) this.d;
                gzs gzsVar = (gzs) this.e;
                z37 z37Var = (z37) this.f;
                gzs gzsVar2 = (gzs) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1536245662, intValue, -1, "com.vk.profile.community.members.impl.ui.MembersScreen.<anonymous>.<anonymous> (MembersScreen.kt:114)");
                    }
                    MembersState.Error error = membersState.g;
                    if ((error != null ? error.b : null) == MembersState.Error.Cause.NETWORK_ERROR && membersState.c.isEmpty()) {
                        aVar.K(-876876785);
                        com.vk.profile.community.members.impl.ui.d.d(0, aVar, gzsVar, null);
                        aVar.j();
                    } else {
                        aVar.K(-876690599);
                        boolean z = membersState.b;
                        q630 d = txj0.d(q630.a.a, 1.0f);
                        boolean J = aVar.J(z37Var);
                        Object x = aVar.x();
                        if (J || x == a.C0011a.a) {
                            x = new xyh(z37Var, 28);
                            aVar.R(x);
                        }
                        dge0.a(z, (gzs) x, d, null, null, kai.c(1164545840, new f220(membersState, z37Var, gzsVar2, 0), aVar), aVar, 196992, 24);
                        aVar.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                ra70.a((String) this.d, (gzs) this.e, (gzs) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                uum0.c cVar = (uum0.c) this.d;
                SubnavigationButtonMode subnavigationButtonMode = (SubnavigationButtonMode) this.e;
                SubnavigationBarAppearance subnavigationBarAppearance = (SubnavigationBarAppearance) this.f;
                q630 q630Var = (q630) this.c;
                ((Integer) obj2).getClass();
                cVar.b(ne7.I(1), (androidx.compose.runtime.a) obj, subnavigationBarAppearance, subnavigationButtonMode, q630Var);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ f95(MembersState membersState, gzs gzsVar, z37 z37Var, gzs gzsVar2) {
        this.b = 2;
        this.d = membersState;
        this.e = gzsVar;
        this.f = z37Var;
        this.c = gzsVar2;
    }
}
