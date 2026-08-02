package xsna;

import com.vk.api.generated.friends.dto.FriendsGetFieldsResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.gpw0;
import xsna.hpw0;
import xsna.lpw0;
import xsna.spw0;
import xsna.xpw0;

/* compiled from: VoipHistoryFriendsFeature.kt */
/* loaded from: classes7.dex */
public final class kpw0 extends wk50<com.vk.voip.ui.history.friends.ui.b, xpw0, hpw0, spw0> {
    public final wpw0 f;
    public final f4z g;
    public final f4z h;

    public kpw0(vpw0 vpw0Var, wpw0 wpw0Var) {
        super(null, vpw0Var);
        this.f = wpw0Var;
        this.g = new f4z();
        this.h = new f4z();
    }

    public static ArrayList U(FriendsGetFieldsResponseDto friendsGetFieldsResponseDto) {
        List<UsersUserFullDto> d = friendsGetFieldsResponseDto.d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        Iterator<T> it = d.iterator();
        while (it.hasNext()) {
            arrayList.add(gpw0.a.a((UsersUserFullDto) it.next()));
        }
        return arrayList;
    }

    public static ArrayList V(FriendsGetFieldsResponseDto friendsGetFieldsResponseDto) {
        List<UsersUserFullDto> d = friendsGetFieldsResponseDto.d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        Iterator<T> it = d.iterator();
        while (it.hasNext()) {
            arrayList.add(gpw0.a.a((UsersUserFullDto) it.next()));
        }
        return arrayList;
    }

    @Override // xsna.wk50
    public final void N(xpw0 xpw0Var, hpw0 hpw0Var) {
        xpw0 xpw0Var2 = xpw0Var;
        hpw0 hpw0Var2 = hpw0Var;
        boolean z = hpw0Var2 instanceof hpw0.a;
        wpw0 wpw0Var = this.f;
        if (z) {
            if (!(xpw0Var2 instanceof xpw0.a)) {
                T(spw0.c.b);
                a7f0.a.f(this, io.reactivex.rxjava3.core.x.B(wpw0Var.b(), wpw0Var.a(0), new l960(new hkb(this), 17)), new bjm0(this, 23), new biw0(this, 4), 1);
            }
        } else if (hpw0Var2 instanceof hpw0.d) {
            if ((xpw0Var2 instanceof xpw0.a) && (((xpw0.a) xpw0Var2).e instanceof xpw0.a.b.C4035a)) {
                T(spw0.d.c.b);
                a7f0.a.f(this, io.reactivex.rxjava3.core.x.B(wpw0Var.b(), wpw0Var.a(0), new uxb0(new cc5(this), 20)), new n9t0(this, 5), new aiw0(this, 3), 1);
            }
        } else if (hpw0Var2 instanceof hpw0.b) {
            hpw0.b bVar = (hpw0.b) hpw0Var2;
            if (xpw0Var2 instanceof xpw0.a) {
                xpw0.a aVar = (xpw0.a) xpw0Var2;
                List<gpw0> list = aVar.d;
                if (list.size() != aVar.c && (aVar.e instanceof xpw0.a.b.C4035a) && (!(bVar instanceof hpw0.b.C3015b) || (aVar.f instanceof xpw0.a.AbstractC4033a.b))) {
                    T(spw0.b.c.b);
                    a7f0.a.f(this, wpw0Var.a(list.size()).l(new h8e0(new yaq0(this, 8), 7)), new vgs0(this, 13), new cbt0(this, 11), 1);
                }
            }
        } else {
            if (!(hpw0Var2 instanceof hpw0.c)) {
                throw new NoWhenBranchMatchedException();
            }
            hpw0.c cVar = (hpw0.c) hpw0Var2;
            boolean z2 = cVar instanceof hpw0.c.b;
            f4z f4zVar = this.h;
            if (z2) {
                f4zVar.b(lpw0.b.a);
            } else if (cVar instanceof hpw0.c.C3016c) {
                hpw0.c.C3016c c3016c = (hpw0.c.C3016c) cVar;
                if (xpw0Var2 instanceof xpw0.a) {
                    f4zVar.b(new lpw0.c(c3016c.b));
                }
            } else {
                if (!(cVar instanceof hpw0.c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                hpw0.c.a aVar2 = (hpw0.c.a) cVar;
                if (xpw0Var2 instanceof xpw0.a) {
                    f4zVar.b(new lpw0.a(aVar2.b, aVar2.c));
                }
            }
            s3q0 s3q0Var = s3q0.a;
        }
        s3q0 s3q0Var2 = s3q0.a;
    }
}
