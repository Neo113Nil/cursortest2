package xsna;

import com.vk.api.generated.donut.dto.DonutGetOneTimePaymentsResponseDto;
import com.vk.api.generated.donut.dto.DonutOneTimePaymentDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class x030 implements izs {
    public final /* synthetic */ com.vk.lists.c b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ y030 d;

    public /* synthetic */ x030(com.vk.lists.c cVar, boolean z, y030 y030Var) {
        this.b = cVar;
        this.c = z;
        this.d = y030Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        UserProfile userProfile;
        Object obj2;
        DonutGetOneTimePaymentsResponseDto donutGetOneTimePaymentsResponseDto = (DonutGetOneTimePaymentsResponseDto) obj;
        ArrayList arrayList = new ArrayList();
        com.vk.lists.c cVar = this.b;
        String j = cVar.j();
        Integer num = null;
        if (j == null || j.length() == 0 || epx.f(cVar.j(), "0")) {
            arrayList.add(new v6n0(donutGetOneTimePaymentsResponseDto.g()));
            if (this.c) {
                num = Integer.valueOf(donutGetOneTimePaymentsResponseDto.i());
            }
        }
        String d = donutGetOneTimePaymentsResponseDto.d();
        cVar.r(!(d == null || d.length() == 0));
        cVar.s(String.valueOf(donutGetOneTimePaymentsResponseDto.d()));
        List<DonutOneTimePaymentDto> e = donutGetOneTimePaymentsResponseDto.e();
        ArrayList arrayList2 = new ArrayList(c5g.u(e, 10));
        Iterator<T> it = e.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            y030 y030Var = this.d;
            if (!hasNext) {
                arrayList.addAll(arrayList2);
                y030Var.e.invoke(arrayList, num);
                return s3q0.a;
            }
            DonutOneTimePaymentDto donutOneTimePaymentDto = (DonutOneTimePaymentDto) it.next();
            iid iidVar = y030Var.b;
            UserId e2 = donutOneTimePaymentDto.e();
            List<UsersUserFullDto> f = donutGetOneTimePaymentsResponseDto.f();
            iidVar.getClass();
            if (f != null) {
                Iterator<T> it2 = f.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    Object next = it2.next();
                    if (((UsersUserFullDto) next).s1().b == e2.b) {
                        obj2 = next;
                        break;
                    }
                }
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) obj2;
                if (usersUserFullDto != null) {
                    ((j2r0) iidVar.b).getClass();
                    userProfile = j2r0.a(usersUserFullDto);
                    arrayList2.add(new z030(userProfile, Integer.valueOf(donutOneTimePaymentDto.d())));
                }
            }
            userProfile = null;
            arrayList2.add(new z030(userProfile, Integer.valueOf(donutOneTimePaymentDto.d())));
        }
    }
}
