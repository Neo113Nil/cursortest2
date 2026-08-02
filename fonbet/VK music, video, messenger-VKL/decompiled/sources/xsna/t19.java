package xsna;

import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class t19 implements Callable {
    public final /* synthetic */ int b = 0;

    public /* synthetic */ t19() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ArrayList arrayList;
        List O0;
        switch (this.b) {
            case 0:
                return com.vk.contacts.d.a.K0(true).get();
            default:
                ImageList imageList = o25.a().o().i;
                if (imageList == null || (O0 = j5g.O0(imageList.b)) == null) {
                    arrayList = null;
                } else {
                    List<Image> list = O0;
                    arrayList = new ArrayList(c5g.u(list, 10));
                    for (Image image : list) {
                        arrayList.add(new ImageSize(image.d, image.b, image.c, null, (char) 0, false, 56, null));
                    }
                }
                return new com.vk.dto.common.Image(arrayList);
        }
    }

    public /* synthetic */ t19(mbl mblVar) {
    }
}
