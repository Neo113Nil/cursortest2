package xsna;

import com.vk.dto.photo.ImageCropData;
import com.vk.newsfeed.api.posting.viewpresenter.PreviewRatio;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ClipsActivitiesAnimatedBadgeStorage.kt */
/* loaded from: classes17.dex */
public final class bgd {
    public Object a;

    public ArrayList a(PreviewRatio previewRatio) {
        ArrayList arrayList = (ArrayList) this.a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            ImageCropData imageCropData = (ImageCropData) next;
            if (Math.abs((imageCropData.c() / imageCropData.a()) - (previewRatio.b() / previewRatio.a())) <= 0.04f) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }
}
