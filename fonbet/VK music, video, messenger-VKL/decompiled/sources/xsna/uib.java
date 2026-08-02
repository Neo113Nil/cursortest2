package xsna;

import android.util.SparseArray;
import com.vk.channels.api.ChannelActionInProgress;
import com.vk.channels.api.ChannelFilter;
import com.vk.dto.common.Direction;
import com.vk.im.engine.models.channels.ChannelBanInfo;
import com.vk.im.engine.models.channels.ChannelNotificationsSettings;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.channels.ChannelsCounters;
import com.vk.im.engine.models.groups.AdminLevel;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ChannelsStorageManager.kt */
/* loaded from: classes2.dex */
public interface uib {
    void A(bdb bdbVar);

    ChannelType B(long j);

    void C(long j);

    List<bdb> D(aeb aebVar, ChannelFilter channelFilter, Direction direction, aeb aebVar2, List<? extends ChannelType> list, int i);

    void E(int i);

    void F(long j);

    void G(long j, String str);

    void H(long j, boolean z);

    void I(long j, AdminLevel adminLevel, boolean z);

    void J(long j, boolean z);

    void K(int i, int i2, long j);

    void L(int i, long j);

    void M(ChannelFilter channelFilter);

    int N();

    void O(int i, long j);

    int P();

    void R(long j);

    void S();

    void T(long j, String str);

    void U(int i, long j);

    void V(int i, long j);

    HashMap W();

    void X(long j, boolean z);

    void Y(long j, ChannelNotificationsSettings channelNotificationsSettings);

    List Z(vcb vcbVar, ChannelFilter channelFilter, Direction direction, vcb vcbVar2);

    void a(Collection<bdb> collection);

    void a0(long j, ChannelBanInfo channelBanInfo);

    void b0(int i, long j);

    bdb c(long j);

    void c0(Collection<wfb> collection);

    Map<Long, bdb> d(Collection<Long> collection);

    Collection<bdb> d0();

    int e();

    List<Long> e0(boolean z);

    void f(int i, long j);

    void g(int i, long j);

    void i(Collection<com.vk.im.engine.models.channels.a> collection);

    void j(int i, long j);

    Map<ChannelsCounters.Type, com.vk.im.engine.models.channels.a> k(Collection<? extends ChannelsCounters.Type> collection);

    void l(ChannelFilter channelFilter);

    void m(Map<Long, gbb> map);

    void n(int i, long j);

    wfb o(ChannelFilter channelFilter);

    Integer p(long j);

    void q(long j, ChannelActionInProgress channelActionInProgress, Boolean bool);

    void r(long j, ChannelNotificationsSettings channelNotificationsSettings);

    void s(long j, long j2);

    void t(int i);

    void u(long j, aeb aebVar);

    void v(int i, long j);

    void w(long j);

    void x(long j, vcb vcbVar);

    SparseArray<bdb> y();

    void z(ChannelFilter channelFilter, vcb vcbVar);
}
