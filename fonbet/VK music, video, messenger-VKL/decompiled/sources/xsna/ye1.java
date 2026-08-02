package xsna;

import com.vk.dto.common.ImageSize;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.entity.AlbumChooseState;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.entity.VideoAlbumData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: AlbumChooseViewStateMapper.kt */
/* loaded from: classes7.dex */
public final class ye1 implements izs<AlbumChooseState, xe1> {
    public static final ye1 b = new ye1();

    @Override // xsna.izs
    public final xe1 invoke(AlbumChooseState albumChooseState) {
        Iterator it;
        boolean z;
        ArrayList arrayList;
        AlbumChooseState albumChooseState2 = albumChooseState;
        boolean z2 = true;
        boolean z3 = !albumChooseState2.f;
        boolean z4 = albumChooseState2.e;
        List<VideoAlbumData> list = albumChooseState2.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            VideoAlbumData videoAlbumData = (VideoAlbumData) obj;
            if (videoAlbumData.f && videoAlbumData.b >= 0) {
                arrayList2.add(obj);
            }
        }
        int i = 10;
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Integer.valueOf(((VideoAlbumData) it2.next()).b));
        }
        List<Integer> list2 = albumChooseState2.c;
        List u = list2 != null ? d02.u(list2) : EmptyList.b;
        if (arrayList3.containsAll(u) && u.containsAll(arrayList3)) {
            z2 = false;
        }
        ArrayList arrayList4 = new ArrayList(c5g.u(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            VideoAlbumData videoAlbumData2 = (VideoAlbumData) it3.next();
            boolean z5 = videoAlbumData2.e;
            boolean z6 = videoAlbumData2.f;
            String str = videoAlbumData2.c;
            boolean z7 = videoAlbumData2.d;
            List<ImageSize> list3 = videoAlbumData2.g;
            int i2 = videoAlbumData2.h;
            int i3 = videoAlbumData2.i;
            List<PrivacySetting.PrivacyRule> list4 = videoAlbumData2.j;
            if (list4 != null) {
                List<PrivacySetting.PrivacyRule> list5 = list4;
                it = it3;
                z = z2;
                arrayList = new ArrayList(c5g.u(list5, i));
                Iterator<T> it4 = list5.iterator();
                while (it4.hasNext()) {
                    arrayList.add(new qow((PrivacySetting.PrivacyRule) it4.next()));
                }
            } else {
                it = it3;
                z = z2;
                arrayList = null;
            }
            arrayList4.add(new rl1(z5, z6, str, z7, videoAlbumData2, list3, i2, i3, arrayList));
            it3 = it;
            z2 = z;
            i = 10;
        }
        return new xe1(z3, z4, arrayList4, z2, albumChooseState2.h);
    }
}
