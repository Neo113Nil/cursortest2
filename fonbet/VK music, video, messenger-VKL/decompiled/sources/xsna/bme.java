package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.components.common.UserActions;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class bme implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bme(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        char c = 1;
        switch (i) {
            case 0:
                dme dmeVar = (dme) obj5;
                wh50 wh50Var = (wh50) obj4;
                wh50 wh50Var2 = (wh50) obj3;
                wh50 wh50Var3 = (wh50) obj2;
                tho0 tho0Var = (tho0) obj;
                int i2 = dme.m1;
                ucp ucpVar = ucp.a;
                us2 us2Var = tho0Var.a;
                ucp.i(us2Var.c);
                String str = us2Var.c;
                wh50Var2.setValue(Boolean.valueOf(str.length() <= 1000));
                wh50Var3.setValue(dmeVar.eo(str.length()));
                wh50Var.setValue(tho0Var);
                break;
            default:
                User user = (User) obj4;
                CharSequence charSequence = (CharSequence) obj3;
                String str2 = (String) obj2;
                List list = (List) obj;
                qkr0 qkr0Var = ((zam) obj5).h;
                if (qkr0Var != null) {
                    long j = user.b;
                    UserSex userSex = user.g;
                    boolean contains = list.contains(UserActions.ADD_TO_BLACK_LIST);
                    xam xamVar = qkr0Var.a;
                    if (!hg1.d(xamVar.p)) {
                        Serializer.c<Peer> cVar = Peer.CREATOR;
                        xamVar.p = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(xamVar.j.F(xamVar, new a6g0(Peer.a.b(j), contains, true, str2)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new y50(new zqh(xamVar, 8), 20)), new bpk(xamVar, c == true ? 1 : 0)).subscribe(new b60(new wam(xamVar, charSequence, userSex, contains), 21), new n20(new o1e(xamVar, 14), 19));
                    }
                }
                break;
        }
        return s3q0.a;
    }
}
