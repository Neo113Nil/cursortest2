package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import java.util.ArrayList;

/* compiled from: CommunityRepository.kt */
/* loaded from: classes11.dex */
public interface gxh extends xic {

    /* compiled from: CommunityRepository.kt */
    /* loaded from: classes5.dex */
    public interface a {
        void a(ArrayList<Group> arrayList);

        void onError();
    }

    void C(UserId userId);

    Group C0(UserId userId);

    void G0(UserId userId);

    ArrayList M();

    io.reactivex.rxjava3.core.q<Group> N0(UserId userId);

    void S(int i, a aVar);

    void a();

    boolean g0(UserId userId);

    void h0(Group group);

    void load();

    boolean m(UserId userId);

    void r0(String str, nlf0 nlf0Var);

    void t0(Group group);
}
