package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.Platform;
import com.vk.im.engine.models.account.AccountInfo;
import com.vk.im.engine.models.users.UserStorageModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: UsersStorageManager.kt */
/* loaded from: classes2.dex */
public interface x1r0 {
    void a(Collection<UserStorageModel> collection);

    UserStorageModel b(long j);

    Map<Long, UserStorageModel> c(Collection<Long> collection);

    void d(UserId userId, OnlineInfo onlineInfo, long j);

    Collection<Long> e();

    irs f(Peer peer);

    void g(int i, long j);

    void h(long j, ArrayList arrayList);

    void i(long j, Long l);

    void j(AccountInfo accountInfo);

    void k();

    void l(Collection<Long> collection);

    Long m();

    void n(Peer peer, List<? extends Peer> list, long j);

    void o(long j);

    Long p();

    ArrayList q();

    void r();

    void s(Collection<Long> collection, Platform platform, long j, long j2);

    Collection<Long> t(int... iArr);

    void u(Peer.User user);
}
