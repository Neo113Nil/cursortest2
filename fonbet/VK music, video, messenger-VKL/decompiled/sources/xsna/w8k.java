package xsna;

import com.vk.ecomm.design.compose.imagegallery.model.ImageGalleryItem;
import com.vk.ecomm.reviews.api.model.createreview.UploadImageModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CreateMarketItemReviewReducer.kt */
/* loaded from: classes18.dex */
public final class w8k implements izs<c9k, wow<ImageGalleryItem>> {
    public static final w8k b = new w8k();

    @Override // xsna.izs
    public final wow<ImageGalleryItem> invoke(c9k c9kVar) {
        c9k c9kVar2 = c9kVar;
        List<UploadImageModel> list = c9kVar2.x;
        List<UploadImageModel> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(azg.b((UploadImageModel) it.next()));
        }
        if (list.size() < c9kVar2.b) {
            arrayList = j5g.v0(ImageGalleryItem.ImageGalleryAddItem.b, arrayList);
        }
        return new wow<>(arrayList);
    }
}
