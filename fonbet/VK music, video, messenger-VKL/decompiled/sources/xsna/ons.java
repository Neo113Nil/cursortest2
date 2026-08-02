package xsna;

import com.vk.api.generated.friends.dto.FriendsRequestsMutualDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.ProfileDescription;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cos;
import xsna.ens;
import xsna.otf0;
import xsna.pf90;
import xsna.wns;

/* compiled from: FriendsCleanupReducer.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class ons extends FunctionReferenceImpl implements izs<wns.a, cos.d> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    @Override // xsna.izs
    public final cos.d invoke(wns.a aVar) {
        String str;
        ProfileDescription profileDescription;
        ?? r1;
        List<UserId> e;
        List<UserId> H0;
        Object obj;
        Integer d;
        wns.a aVar2 = aVar;
        zms zmsVar = (zms) this.receiver;
        zmsVar.getClass();
        pf90 pf90Var = aVar2.d;
        ListBuilder e2 = e43.e();
        rms rmsVar = aVar2.b;
        if (rmsVar.a.length() > 0) {
            e2.add(new bns(rmsVar.a));
        }
        e2.add(ans.b);
        for (UsersUserFullDto usersUserFullDto : rmsVar.b) {
            boolean contains = rmsVar.e.contains(usersUserFullDto.s1());
            List<UsersUserFullDto> list = rmsVar.c;
            zmsVar.a.getClass();
            UserProfile a = j2r0.a(usersUserFullDto);
            List list2 = a.E;
            if (list2 == null) {
                list2 = EmptyList.b;
            }
            int i = 0;
            if (list2.size() >= 2) {
                String str2 = ((ProfileDescription) list2.get(0)).e;
                str = str2 != null ? str2 : "";
                profileDescription = (ProfileDescription) list2.get(1);
            } else {
                String str3 = a.r;
                str = str3 != null ? str3 : "";
                profileDescription = (ProfileDescription) j5g.a0(list2);
            }
            ProfileDescription profileDescription2 = profileDescription;
            String str4 = str;
            UserId s1 = usersUserFullDto.s1();
            kr5 b = qp5.b(a);
            String str5 = a.e;
            OnlineInfo onlineInfo = a.n;
            VerifyInfo verifyInfo = a.B;
            FriendsRequestsMutualDto R1 = usersUserFullDto.R1();
            if (R1 != null && (d = R1.d()) != null) {
                i = d.intValue();
            }
            FriendsRequestsMutualDto R12 = usersUserFullDto.R1();
            if (R12 == null || (e = R12.e()) == null || (H0 = j5g.H0(e, 3)) == null) {
                r1 = EmptyList.b;
            } else {
                ArrayList arrayList = new ArrayList();
                for (UserId userId : H0) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (epx.f(((UsersUserFullDto) obj).s1(), userId)) {
                            break;
                        }
                    }
                    UsersUserFullDto usersUserFullDto2 = (UsersUserFullDto) obj;
                    if (usersUserFullDto2 != null) {
                        arrayList.add(usersUserFullDto2);
                    }
                }
                r1 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    UsersUserFullDto usersUserFullDto3 = (UsersUserFullDto) it2.next();
                    Serializer.c<Image> cVar = Image.CREATOR;
                    r1.add(Image.b.a(usersUserFullDto3.r2()));
                }
            }
            e2.add(new ens(s1, b, str5, str4, profileDescription2, onlineInfo, verifyInfo, new ens.a(i, r1), contains ? R.string.friends_cleanup_return_to_friends : R.string.friends_cleanup_delete_friend));
        }
        if (pf90Var instanceof pf90.c) {
            e2.add(dns.b);
        }
        if (pf90Var instanceof pf90.a) {
            e2.add(new cns(((pf90.a) pf90Var).a));
        }
        return new cos.d(e2.g(), aVar2.c instanceof otf0.b);
    }
}
