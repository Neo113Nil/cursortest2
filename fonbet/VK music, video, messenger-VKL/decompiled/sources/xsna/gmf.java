package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.lists.c;
import java.util.Collections;
import java.util.List;
import xsna.sft0;

/* compiled from: ClipsVideoAttachmentDataProvider.kt */
/* loaded from: classes16.dex */
public final class gmf implements c.l<VKList<VideoFile>> {
    public static final List<String> g = Collections.singletonList("attached_short_videos_counter");
    public final qp3 b;
    public final io.reactivex.rxjava3.disposables.b c;
    public final UserId d;
    public final im0 e;
    public int f;

    public gmf(qp3 qp3Var, io.reactivex.rxjava3.disposables.b bVar, UserId userId, im0 im0Var) {
        this.b = qp3Var;
        this.c = bVar;
        this.d = userId;
        this.e = im0Var;
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<VKList<VideoFile>> hj(com.vk.lists.c cVar, boolean z) {
        return ui(0, cVar);
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<VKList<VideoFile>> ui(int i, com.vk.lists.c cVar) {
        return rsg0.y0(yfb.x(sft0.a.b(new uft0(), this.d, null, (Integer) this.e.invoke(), Integer.valueOf(cVar.k()), Integer.valueOf(cVar.i()), Boolean.TRUE, g, 15725358)), null, null, 3).U(new g7(new com.vk.movika.sdk.base.logic.interactor.p(this, 23), 13));
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<VKList<VideoFile>> qVar, boolean z, com.vk.lists.c cVar) {
        hg1.e(this.c, qVar.subscribe(new tf(new g84(4, cVar, this), 14)));
    }
}
