package xsna;

import com.vk.ecomm.design.compose.imagegallery.model.ImageGalleryItem;
import com.vk.ecomm.reviews.api.model.createreview.UploadImageModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CommunityCreateReviewReducer.kt */
/* loaded from: classes18.dex */
public final class dzg implements izs<fzg, wow<ImageGalleryItem>> {
    public static final dzg b = new dzg();

    @Override // xsna.izs
    public final wow<ImageGalleryItem> invoke(fzg fzgVar) {
        fzg fzgVar2 = fzgVar;
        List<UploadImageModel> list = fzgVar2.j;
        List<UploadImageModel> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(azg.b((UploadImageModel) it.next()));
        }
        if (list.size() < fzgVar2.b) {
            arrayList = j5g.v0(ImageGalleryItem.ImageGalleryAddItem.b, arrayList);
        }
        return new wow<>(arrayList);
    }
}
