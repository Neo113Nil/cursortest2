package xsna;

import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.video.impl.upload.UploadListView$UploadListState;
import com.vk.libvideo.upload.api.VideoUploadEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class vbq0 implements s2a {
    @Override // xsna.s2a
    public final r2a a(CatalogBlockState catalogBlockState) {
        UploadListView$UploadListState uploadListView$UploadListState = (UploadListView$UploadListState) catalogBlockState;
        String str = uploadListView$UploadListState.b;
        List<VideoUploadEvent> list = uploadListView$UploadListState.f;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(cdq0.a((VideoUploadEvent) it.next()));
        }
        return new acq0(str, arrayList);
    }
}
