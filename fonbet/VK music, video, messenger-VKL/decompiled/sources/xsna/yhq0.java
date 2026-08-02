package xsna;

import android.util.LruCache;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.friends.dto.FriendsFriendStatusStatusDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.voip.dto.profiles.VoipFriendStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.sew0;

/* compiled from: UserDtoToCallMemberInfoTransformer.kt */
/* loaded from: classes7.dex */
public final class yhq0 {
    public final gzs<Boolean> a;

    public yhq0(gzs<Boolean> gzsVar) {
        this.a = gzsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x000d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v2, types: [xsna.whr0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList a(List list) {
        sew0.b a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UsersUserFullDto usersUserFullDto = (UsersUserFullDto) it.next();
            if (usersUserFullDto.l0() == null) {
                Boolean V2 = usersUserFullDto.V2();
                Boolean bool = Boolean.TRUE;
                if (!epx.f(V2, bool)) {
                    String valueOf = String.valueOf(usersUserFullDto.s1().b);
                    String D0 = usersUserFullDto.D0();
                    String str = (D0 == null && (D0 = usersUserFullDto.S0()) == null) ? "" : D0;
                    String x1 = usersUserFullDto.x1();
                    String str2 = (x1 == null && (x1 = usersUserFullDto.L1()) == null) ? "" : x1;
                    String K0 = usersUserFullDto.K0();
                    String str3 = K0 == null ? str : K0;
                    String N0 = usersUserFullDto.N0();
                    String str4 = N0 == null ? str : N0;
                    boolean z = usersUserFullDto.R2() == BaseBoolIntDto.YES;
                    String M = usersUserFullDto.M();
                    String str5 = M == null ? "" : M;
                    boolean booleanValue = this.a.invoke().booleanValue();
                    String r2 = usersUserFullDto.r2();
                    if (r2 == null || r2.length() <= 0) {
                        LruCache<String, fxj0> lruCache = sew0.a;
                        String X1 = usersUserFullDto.X1();
                        a = sew0.a.a(X1 != null ? X1 : "", usersUserFullDto.y2(), epx.f(usersUserFullDto.h3(), bool));
                    } else {
                        LruCache<String, fxj0> lruCache2 = sew0.a;
                        String r22 = usersUserFullDto.r2();
                        a = sew0.a.b(r22 != null ? r22 : "", epx.f(usersUserFullDto.h3(), bool), true);
                    }
                    boolean z2 = usersUserFullDto.L2() == BaseSexDto.FEMALE;
                    FriendsFriendStatusStatusDto V0 = usersUserFullDto.V0();
                    int i = V0 != null ? V0.i() : 0;
                    VoipFriendStatus voipFriendStatus = i != 1 ? i != 2 ? i != 3 ? VoipFriendStatus.NOT_FRIENDS : VoipFriendStatus.FRIENDS : VoipFriendStatus.INCOME_FRIENDSHIP_REQUEST : VoipFriendStatus.FOLLOWING;
                    boolean f = epx.f(usersUserFullDto.o(), bool);
                    BaseImageDto g = usersUserFullDto.g();
                    r4 = new whr0(valueOf, a, z2, z, false, f, voipFriendStatus, str, str2, str4, str3, str5, booleanValue, false, null, false, null, g != null ? new qdw0(g.getUrl(), g.getWidth(), g.getHeight()) : null, 122880);
                    if (r4 == null) {
                        arrayList.add(r4);
                    }
                }
            }
            if (r4 == null) {
            }
        }
        return arrayList;
    }
}
