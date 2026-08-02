package xsna;

import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.groups.MemberStatus;
import com.vk.im.engine.models.groups.WarningNotification;
import java.util.Collection;
import java.util.Map;

/* compiled from: GroupsStorageManager.kt */
/* loaded from: classes2.dex */
public interface bru {
    void a(Collection<Group> collection);

    Group b(long j);

    Map<Long, Group> c(Collection<Long> collection);

    yiu d(long j);

    void e(long j);

    void f(long j, boolean z, boolean z2);

    void g(yiu yiuVar);

    void h(long j, MemberStatus memberStatus);

    void i(long j, WarningNotification warningNotification);
}
