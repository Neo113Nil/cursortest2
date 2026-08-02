package xsna;

import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.storycamera.screen.StoryCameraFragment;
import com.vk.superapp.ui.widgets.tile.ImageWithAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ybn0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ ybn0(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        WebImageSize e;
        int i = this.b;
        int i2 = this.c;
        switch (i) {
            case 0:
                WebImage webImage = ((ImageWithAction) obj).b;
                if (webImage == null || (e = webImage.e(i2)) == null) {
                    return null;
                }
                return e.b;
            case 1:
                return Integer.valueOf(((-((Integer) obj).intValue()) / 2) + i2);
            default:
                FragmentImpl fragmentImpl = (FragmentImpl) obj;
                StoryCameraMode storyCameraMode = StoryCameraMode.LIVE;
                xa4.q();
                EmptyList emptyList = EmptyList.b;
                UserId userId = UserId.d;
                StoryCameraTarget storyCameraTarget = StoryCameraTarget.UNDEFINED;
                StoryCameraMode storyCameraMode2 = StoryCameraMode.VMOJI_CAPTURE;
                List singletonList = Collections.singletonList(storyCameraMode2);
                StoryCameraTarget storyCameraTarget2 = StoryCameraTarget.VMOJI_UPLOAD;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : singletonList) {
                    if (!emptyList.contains((StoryCameraMode) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                new StoryCameraFragment.a(new StoryCameraParams("", "vmoji_capture", storyCameraMode2, arrayList, null, userId, null, null, null, null, true, false, null, storyCameraTarget2, null, 0L, null, null, null, null, null, null, null, null, false, false, true, null, false, false, null, null, null, null, null, null, null, null, null, null, false, true, true, true, true, true, true, false, null, null, null, Boolean.valueOf(!fkq0.b(userId)), null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, true, true, true, true, true, null, emptyList, false, null, null)).g(i2, fragmentImpl);
                return s3q0.a;
        }
    }
}
