package xsna;

import com.vk.api.generated.users.dto.UsersUserDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.VisibleStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* compiled from: GetUsersOnlineCmd.kt */
/* loaded from: classes2.dex */
public final class mwt extends xl6<Map<UserId, ? extends OnlineInfo>> {
    public final ArrayList b;

    public mwt() {
        throw null;
    }

    public mwt(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-users-online-updates";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        ArrayList arrayList = this.b;
        boolean isEmpty = arrayList.isEmpty();
        jgp jgpVar = jgp.b;
        if (isEmpty) {
            return jgpVar;
        }
        try {
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Long.valueOf(((UserId) it.next()).b));
            }
            tfx tfxVar = new tfx("users.onlines", new nq(28), new hun0(1));
            tfxVar.i("user_ids", arrayList2);
            Iterable<UsersUserDto> iterable = (Iterable) bz2.d(tfxVar);
            int e = on00.e(c5g.u(iterable, 10));
            if (e < 16) {
                e = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(e);
            for (UsersUserDto usersUserDto : iterable) {
                UserId j = usersUserDto.j();
                Object obj = jgq0.a;
                Object a = jgq0.a(usersUserDto.n());
                if (a == null) {
                    a = VisibleStatus.f;
                }
                Pair pair = new Pair(j, a);
                linkedHashMap.put(pair.i(), pair.j());
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                w2wVar.I0().d().d((UserId) entry.getKey(), (OnlineInfo) entry.getValue(), w2wVar.f1());
            }
            w2wVar.S0().N(linkedHashMap.keySet());
            return linkedHashMap;
        } catch (InterruptedException e2) {
            throw e2;
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.a(th);
            return jgpVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mwt) && epx.f(this.b, ((mwt) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return qoy.b(this.b.hashCode() * 31, 31, false);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "GetUsersOnlineCmd(ids=" + this.b + ", awaitNetwork=false, changerTag=null)";
    }
}
