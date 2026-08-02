package defpackage;

import com.yandex.messaging.core.net.entities.proto.message.EListReactionsMode;
import com.yandex.messaging.core.net.entities.proto.message.ListReactionsRequest;
import com.yandex.messaging.core.net.entities.proto.message.ListReactionsResponse;
import com.yandex.messaging.core.net.entities.proto.message.UserReaction;
import com.yandex.messaging.core.net.entities.proto.message.UserRead;
import com.yandex.messaging.internal.ServerMessageRef;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes15.dex */
public final class oyf0 extends nty {
    public final /* synthetic */ pyf0 a;
    public final /* synthetic */ s020 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ v790 w;

    public oyf0(pyf0 pyf0Var, s020 s020Var, long j, v790 v790Var) {
        this.a = pyf0Var;
        this.b = s020Var;
        this.c = j;
        this.w = v790Var;
    }

    @Override // defpackage.nty
    public final void b(ListReactionsResponse listReactionsResponse) {
        listReactionsResponse.getStatus();
        this.w.onError();
    }

    @Override // defpackage.o5t0
    public final Object c(int i, int i2) {
        pyf0 pyf0Var = this.a;
        ServerMessageRef serverMessageRef = pyf0Var.a;
        return new ListReactionsRequest(serverMessageRef.getRequiredChatId(), ((m8g) this.b).f().e(), serverMessageRef.getTimestamp(), Long.valueOf(this.c), 50, !pyf0Var.c.c ? null : pyf0Var.e ? Integer.valueOf(EListReactionsMode.OnlyReadTimestamps.getValue()) : Integer.valueOf(EListReactionsMode.All.getValue()));
    }

    @Override // defpackage.nty
    public final void f(ListReactionsResponse listReactionsResponse) {
        w790 w790Var;
        UserReaction[] userReactions = listReactionsResponse.getUserReactions();
        List d0 = userReactions != null ? j73.d0(userReactions) : null;
        UserRead[] userReads = listReactionsResponse.getUserReads();
        List d02 = userReads != null ? j73.d0(userReads) : null;
        List list = d0;
        boolean z = list == null || list.isEmpty();
        List list2 = d02;
        boolean z2 = list2 == null || list2.isEmpty();
        EmptyList emptyList = EmptyList.a;
        if (z && z2) {
            w790Var = new w790(emptyList, false, false);
        } else if (z || !z2) {
            pyf0 pyf0Var = this.a;
            if (z || z2) {
                pyf0Var.e = true;
                List<UserRead> list3 = d02 == null ? emptyList : d02;
                ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                for (UserRead userRead : list3) {
                    arrayList.add(new kyf0(userRead.getTimestamp(), userRead.getUserInfo()));
                }
                if (d02 == null) {
                    d02 = emptyList;
                }
                w790Var = new w790(arrayList, false, d02.size() == 50);
            } else {
                pyf0Var.e = true;
                List<UserReaction> list4 = d0;
                ArrayList arrayList2 = new ArrayList(tcc.n(list4, 10));
                for (UserReaction userReaction : list4) {
                    arrayList2.add(new jyf0(userReaction.getType(), userReaction.getTimestamp(), userReaction.getUserInfo()));
                }
                List<UserRead> list5 = d02;
                ArrayList arrayList3 = new ArrayList(tcc.n(list5, 10));
                for (UserRead userRead2 : list5) {
                    arrayList3.add(new kyf0(userRead2.getTimestamp(), userRead2.getUserInfo()));
                }
                w790Var = new w790(a.m0(arrayList3, arrayList2), false, d02.size() + d0.size() == 50);
            }
        } else {
            List<UserReaction> list6 = d0;
            ArrayList arrayList4 = new ArrayList(tcc.n(list6, 10));
            for (UserReaction userReaction2 : list6) {
                arrayList4.add(new jyf0(userReaction2.getType(), userReaction2.getTimestamp(), userReaction2.getUserInfo()));
            }
            w790Var = new w790(arrayList4, false, d0.size() == 50);
        }
        this.w.F(w790Var);
    }
}
