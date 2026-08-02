package xsna;

import android.util.ArraySet;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.DialogBackground;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.account.AccountInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.emails.Email;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.im.engine.models.events.channels.OnChannelsCacheInvalidateEvent;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.users.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: EventHelper.kt */
/* loaded from: classes.dex */
public interface bzp {
    /* JADX WARN: Multi-variable type inference failed */
    static void E(bzp bzpVar, Collection collection, ArraySet arraySet, Collection collection2, int i) {
        if ((i & 1) != 0) {
            collection = EmptyList.b;
        }
        Collection collection3 = arraySet;
        if ((i & 2) != 0) {
            collection3 = EmptyList.b;
        }
        EmptyList emptyList = EmptyList.b;
        if ((i & 8) != 0) {
            collection2 = emptyList;
        }
        bzpVar.K(collection, collection3, emptyList, collection2);
    }

    void A(Object obj, wpp<Long, Dialog> wppVar);

    void B(Object obj, boolean z);

    void C(Object obj, xpp<AccountInfo> xppVar);

    void D(long j, String str);

    void F(long j, Peer peer, ProfilesInfo profilesInfo);

    void G(Object obj, Collection<? extends Msg> collection);

    void H(long j);

    void I(long j, Object obj);

    void J(Object obj, wpp<Long, User> wppVar);

    void K(Collection<Long> collection, Collection<Long> collection2, Collection<Long> collection3, Collection<Long> collection4);

    void L(Attach attach);

    void M(Object obj, Map<Long, User> map);

    void N(Collection<UserId> collection);

    void O(Attach attach);

    void P(ArrayList arrayList);

    void Q(Object obj, OnChannelsCacheInvalidateEvent.Reason reason);

    void R(UserId userId);

    void S();

    void T(String str);

    void U(DialogsCounters.Type type, int i);

    void V(long j);

    void W(int i);

    void a(List<Long> list);

    void b(int i, ArrayList arrayList);

    void c(Object obj, wpp<Integer, Msg> wppVar);

    void d(String str, Collection collection);

    void e(Throwable th);

    void f(Attach attach);

    void g(DialogBackground dialogBackground);

    void h(List<j0l0> list);

    void i();

    void j(Object obj);

    void k(Attach attach);

    void l(DialogsFilter dialogsFilter, xpp<Boolean> xppVar);

    void m(long j, long j2, z28 z28Var, ProfilesInfo profilesInfo);

    void n(Object obj, Collection<Long> collection);

    void o(Object obj, Object obj2, gkx0 gkx0Var, int i);

    void p(Object obj, ProfilesSimpleInfo profilesSimpleInfo);

    void q(long j);

    void r(ArrayList arrayList);

    void s(int i, Object obj);

    void t(Object obj, wpp<Long, Group> wppVar);

    void u(Object obj, OnCacheInvalidateEvent.Reason reason);

    void v(long j, Object obj);

    void w(Object obj, MsgFromUser msgFromUser);

    void x(long j, List<? extends Msg> list);

    void y(Object obj, wpp<Long, Email> wppVar);

    void z(Attach attach, int i, int i2);
}
