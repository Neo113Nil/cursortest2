package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.live.LiveEventModel;
import com.vk.libvideo.live.impl.views.chat.a;

/* compiled from: ChatContract.java */
/* loaded from: classes3.dex */
public interface rpb extends rr6<qpb> {
    void C4(UserId userId, a.j jVar);

    void N1(LiveEventModel liveEventModel);

    void V1();

    void b1(boolean z, boolean z2);

    void c4();

    void d1();

    void f2();

    void l3();

    void setActionLinksPresenter(b30 b30Var);

    void setAdapter(RecyclerView.Adapter<RecyclerView.e0> adapter);

    void update();
}
