package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.friends.discover.UsersDiscoverAdapter;
import xsna.gsf0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class dsf0 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dsf0(UsersDiscoverAdapter usersDiscoverAdapter, int i, Object obj) {
        this.d = usersDiscoverAdapter;
        this.c = i;
        this.e = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                gsf0 gsf0Var = (gsf0) this.d;
                UserId userId = (UserId) this.e;
                int i = this.c;
                gsf0Var.getClass();
                vrf0 vrf0Var = (vrf0) j5g.a0(((isf0) obj).a);
                if (vrf0Var != null) {
                    gsf0Var.e = new gsf0.a(userId, i, vrf0Var);
                }
                break;
            default:
                UsersDiscoverAdapter usersDiscoverAdapter = (UsersDiscoverAdapter) this.d;
                int i2 = this.c;
                Object obj2 = this.e;
                z76 z76Var = usersDiscoverAdapter.h;
                if (z76Var != null) {
                    z76Var.invoke(Integer.valueOf(i2), obj2);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ dsf0(gsf0 gsf0Var, UserId userId, int i) {
        this.d = gsf0Var;
        this.e = userId;
        this.c = i;
    }
}
