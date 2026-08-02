package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.dto.profile.Address;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.related_videos.data.VideoRelatedVideosPagingType;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class v5b implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v5b(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                w5b w5bVar = (w5b) this.d;
                xgl0 xgl0Var = (xgl0) obj;
                r3b e = w5bVar.j ? xgl0Var.e() : xgl0Var.y();
                Msg e2 = e.b.e(w5bVar.c);
                if (e2 != null && e2.d == 0) {
                    int i = this.c;
                    e2.d = i;
                    MsgFromChannel msgFromChannel = (MsgFromChannel) e2;
                    msgFromChannel.I = MsgFromChannel.b.a(msgFromChannel.I, null, i, null, null, null, null, false, null, null, 0, 0, 0L, false, 67108855);
                    e.o(e2);
                }
                return s3q0.a;
            case 1:
                trg trgVar = (trg) this.d;
                Address address = (Address) ((List) obj).get(0);
                trgVar.f.put(Integer.valueOf(this.c), address);
                return address;
            case 2:
                ((nk40) this.d).getClass();
                return Boolean.valueOf(k5a.b((UIBlockList) obj, new cju(this.c, 1)));
            default:
                ((com.vk.video.ui.discovery.minimizable.related_videos.c) this.d).e.invoke(new c.s0.g(this.c, (rbt0) obj, VideoRelatedVideosPagingType.Playlist));
                return s3q0.a;
        }
    }
}
