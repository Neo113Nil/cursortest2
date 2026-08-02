package xsna;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.lmf;

/* compiled from: ClipsVideoAttachmentReducer.kt */
/* loaded from: classes16.dex */
public final class pmf extends dm50<com.vk.clips.attachments.impl.views.video.b, lmf, rmf> {
    @Override // xsna.dm50
    public final rmf c(rmf rmfVar, lmf lmfVar) {
        rmf rmfVar2 = rmfVar;
        lmf lmfVar2 = lmfVar;
        if (!(lmfVar2 instanceof lmf.b)) {
            if (lmfVar2 instanceof lmf.a) {
                return rmf.a(rmfVar2, null, 0, ((lmf.a) lmfVar2).b, null, null, 0, null, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
            }
            if (lmfVar2 instanceof lmf.e) {
                ((lmf.e) lmfVar2).getClass();
                return rmf.a(rmfVar2, null, 0, null, null, null, 0, null, 2015);
            }
            if (lmfVar2 instanceof lmf.d) {
                return rmf.a(rmfVar2, null, ((lmf.d) lmfVar2).b, null, null, null, 0, null, 2039);
            }
            if (!(lmfVar2 instanceof lmf.c)) {
                throw new NoWhenBranchMatchedException();
            }
            lmf.c cVar = (lmf.c) lmfVar2;
            return rmf.a(rmfVar2, EmptyList.b, 0, null, rmfVar2.g, null, cVar.b, cVar.c, 1547);
        }
        ListBuilder e = e43.e();
        List<VideoFile> list = rmfVar2.d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            e.add((VideoFile) it.next());
            arrayList.add(Boolean.TRUE);
        }
        VKList<VideoFile> vKList = ((lmf.b) lmfVar2).b;
        ArrayList arrayList2 = new ArrayList(c5g.u(vKList, 10));
        Iterator<VideoFile> it2 = vKList.iterator();
        while (it2.hasNext()) {
            e.add(it2.next());
            arrayList2.add(Boolean.TRUE);
        }
        s3q0 s3q0Var = s3q0.a;
        ListBuilder g = e.g();
        String str = rmfVar2.f;
        if (str == null) {
            str = rmfVar2.g;
        }
        return rmf.a(rmfVar2, g, 0, str, null, vKList.j(), 0, null, 1963);
    }

    @Override // xsna.dm50
    public final com.vk.clips.attachments.impl.views.video.b d() {
        return new com.vk.clips.attachments.impl.views.video.b(e(new omf(this, 0)));
    }

    @Override // xsna.dm50
    public final void h(rmf rmfVar, com.vk.clips.attachments.impl.views.video.b bVar) {
        f(bVar.a, rmfVar);
    }
}
