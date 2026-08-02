package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class gp1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ gp1(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                VKList vKList = (VKList) obj;
                return new AlbumsRepository.a(vKList, vKList.size() < this.c);
            default:
                com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj;
                return com.vk.im.engine.models.dialogs.b.a(bVar, new vjm(this.c, bVar.d.c), null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -5, 2097151);
        }
    }
}
