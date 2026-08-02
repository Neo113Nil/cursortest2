package xsna;

import com.vk.clips.coauthors.list.pendings.mvi.entity.state.ClipCoauthorPendingItem;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.newsfeed.Owner;
import com.vk.toggle.features.ClipsFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ClipCoauthorPendingItem.kt */
/* loaded from: classes16.dex */
public final class loc {
    public static final ArrayList a(ClipVideoFile clipVideoFile) {
        List<CoOwnerItem> list = clipVideoFile.N1;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            CoOwnerItem coOwnerItem = (CoOwnerItem) obj;
            if (coOwnerItem.e && coOwnerItem.c == CoOwnerItem.StatusDto.PENDING) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            Owner owner = ((CoOwnerItem) next).d;
            ClipsFeatures clipsFeatures = ClipsFeatures.COAUTHORS_REDESIGN;
            clipsFeatures.getClass();
            arrayList2.add(new ClipCoauthorPendingItem(owner, !com.vk.toggle.b.A.a(clipsFeatures) && i == 0));
            i = i2;
        }
        return arrayList2;
    }
}
