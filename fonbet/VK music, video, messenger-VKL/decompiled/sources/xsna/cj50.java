package xsna;

import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.MutualInfo;
import com.vk.dto.user.RequestUserProfile;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MutualFriendsRxExt.kt */
/* loaded from: classes13.dex */
public final class cj50 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public static final ArrayList a(List list, izs izsVar) {
        ?? r4;
        Integer num;
        List<Long> list2;
        List list3 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            RequestUserProfile requestUserProfile = new RequestUserProfile((UserProfile) izsVar.invoke((UsersUserFullDto) it.next()));
            MutualInfo mutualInfo = requestUserProfile.d0;
            if (mutualInfo == null || (list2 = mutualInfo.c) == null) {
                r4 = EmptyList.b;
            } else {
                List<Long> list4 = list2;
                r4 = new ArrayList(c5g.u(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    dq.h(((Number) it2.next()).longValue(), r4);
                }
            }
            MutualInfo mutualInfo2 = requestUserProfile.d0;
            arrayList.add(new zxq0(requestUserProfile, (mutualInfo2 == null || (num = mutualInfo2.b) == null) ? 0 : num.intValue(), r4));
        }
        return arrayList;
    }

    public static final io.reactivex.rxjava3.internal.operators.observable.o0 b(io.reactivex.rxjava3.internal.operators.observable.m1 m1Var, zi50 zi50Var) {
        return new io.reactivex.rxjava3.internal.operators.observable.o0(m1Var, new adz(new aj50(zi50Var, 0), 6));
    }
}
