package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class sp1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ up1 c;
    public final /* synthetic */ UserId d;

    public /* synthetic */ sp1(int i, up1 up1Var, UserId userId) {
        this.b = i;
        this.c = up1Var;
        this.d = userId;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VKList vKList = (VKList) obj;
        return vKList.size() < this.b ? this.c.h(this.d, false).U(new ft0(new op1(vKList, 0), 1)) : io.reactivex.rxjava3.core.q.T(new AlbumsRepository.a(vKList, false));
    }
}
