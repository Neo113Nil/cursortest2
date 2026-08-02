package xsna;

import com.vk.api.base.VkPaginationList;
import com.vk.attachpicker.impl.fragment.video.AttachVideoFragment;
import com.vk.attachpicker.impl.fragment.video.VideoData;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.im.engine.models.users.UserStorageModel;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class u34 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ u34(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = this.c;
        switch (i) {
            case 0:
                VKList vKList = (VKList) obj;
                int i3 = AttachVideoFragment.F0;
                ArrayList arrayList = new ArrayList(c5g.u(vKList, 10));
                Iterator<T> it = vKList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new VideoData((VideoFile) it.next(), null, 2, null));
                }
                return new VkPaginationList(arrayList, vKList.i(), i2 + 30 < vKList.i(), i2);
            case 1:
                tso.n((tgi0) obj, i2);
                return s3q0.a;
            default:
                return UserStorageModel.zb((UserStorageModel) obj, null, null, null, null, null, null, this.c, -4194305);
        }
    }
}
