package xsna;

import android.util.SparseArray;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.upload.api.VideoUploadEvent;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class got0 implements wzs {
    public final /* synthetic */ com.vk.libvideo.upload.impl.b b;

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        com.vk.libvideo.upload.impl.b bVar;
        VideoUploadEvent videoUploadEvent = (VideoUploadEvent) obj;
        SparseArray sparseArray = (SparseArray) obj2;
        sparseArray.put(videoUploadEvent.b.Eb(), videoUploadEvent);
        ArrayList arrayList = new ArrayList();
        int size = sparseArray.size();
        int i = 0;
        while (true) {
            bVar = this.b;
            if (i >= size) {
                break;
            }
            sparseArray.keyAt(i);
            VideoUploadEvent videoUploadEvent2 = (VideoUploadEvent) sparseArray.valueAt(i);
            VideoFile A = videoUploadEvent2.b.A();
            if (A != null && bVar.i.contains(A.r1())) {
                videoUploadEvent2 = new VideoUploadEvent.Removed(A);
            } else if (videoUploadEvent2 instanceof VideoUploadEvent.Delete) {
                videoUploadEvent2 = null;
            }
            if (videoUploadEvent2 != null) {
                arrayList.add(videoUploadEvent2);
            }
            i++;
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((VideoUploadEvent) it.next()).zb(!epx.f(bVar.h.get(r0.b.q()), Boolean.FALSE)));
        }
        return j5g.y0(arrayList2);
    }
}
