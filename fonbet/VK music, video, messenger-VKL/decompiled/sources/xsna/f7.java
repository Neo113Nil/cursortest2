package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.vk.common.links.LinksParserData;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.stories.entities.StoryCameraGalleryData;
import com.vk.imageloader.ImageScreenSize;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.EmptyList;
import xsna.tam0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f7 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List d;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                VideoFile videoFile = (VideoFile) obj;
                ucp ucpVar = ucp.a;
                return new AboutVideoItem.o(videoFile.getDuration(), ucp.i(xwk.d().a().d(cqm0.f(videoFile.j1()), new LinksParserData(0, (Bundle) null, R.color.vk_sky_300, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16379))));
            case 1:
                com.vk.cameraui.impl.a aVar = (com.vk.cameraui.impl.a) obj;
                List<StoryCameraGalleryData> list = aVar.c.C;
                if (list == null) {
                    return EmptyList.b;
                }
                List<StoryCameraGalleryData> list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                for (StoryCameraGalleryData storyCameraGalleryData : list2) {
                    Context context = aVar.b.getContext();
                    Uri uri = storyCameraGalleryData.b;
                    if (storyCameraGalleryData.c) {
                        d = Collections.singletonList(tam0.a.c(uri, storyCameraGalleryData.d, false, false, false, null, 60));
                    } else {
                        String path = uri.getPath();
                        if (path == null) {
                            path = "";
                        }
                        if (brm0.B(uri.toString(), "content:", false)) {
                            path = tam0.a.e(context, uri);
                        }
                        L.e("Using " + path + ", origin is " + uri);
                        d = tam0.x.d(new File(path), storyCameraGalleryData.d, true, false);
                    }
                    arrayList.add(d);
                }
                return c5g.v(arrayList);
            default:
                ImageSize Cb = ((Image) obj).Cb(ImageScreenSize.MID.h(), true, false);
                return Uri.parse(Cb != null ? Cb.d.d : null);
        }
    }
}
