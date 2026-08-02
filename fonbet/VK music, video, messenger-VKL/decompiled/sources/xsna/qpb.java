package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.live.LiveEventModel;
import com.vk.dto.user.UserProfile;

/* compiled from: ChatContract.java */
/* loaded from: classes3.dex */
public interface qpb extends pk6 {
    boolean A0();

    void F1();

    void H0(UserId userId);

    void H1(UserId userId);

    void I0(LiveEventModel liveEventModel, boolean z);

    void M1(UserId userId);

    void O0(int i, String str);

    void O1(LiveEventModel liveEventModel, VideoFile videoFile);

    void P0(LiveEventModel liveEventModel, boolean z);

    void S0(UserId userId);

    void U1(int i, UserId userId);

    void W0(int i, UserId userId, String str, boolean z);

    void Y1(LiveEventModel liveEventModel);

    void c2(int i, UserId userId);

    void d1(int i, UserId userId);

    void g1(LiveEventModel liveEventModel);

    boolean isStreaming();

    boolean l0();

    boolean m0(int i, UserId userId);

    void m2(UserId userId);

    void n0(LiveEventModel liveEventModel, Group group, UserProfile userProfile);

    void o0(LiveEventModel liveEventModel);

    io.reactivex.rxjava3.core.q p0(int i, UserId userId, boolean z);

    void q0(UserId userId, CharSequence charSequence);

    void q2();

    void r0(LiveEventModel liveEventModel);

    void s0(int i, UserId userId);

    void t0(int i, UserId userId);

    void u1(UserProfile userProfile);

    void y1(LiveEventModel liveEventModel);

    void z0(int i, UserId userId, UserId userId2);
}
