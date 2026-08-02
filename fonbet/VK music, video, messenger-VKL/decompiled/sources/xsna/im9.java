package xsna;

import android.net.Uri;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.superapp.api.dto.story.WebStoryBox;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class im9 implements Callable {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Serializer.StreamParcelableAdapter c;

    public /* synthetic */ im9(com.vk.cameraui.impl.a aVar, WebStoryBox webStoryBox) {
        this.c = webStoryBox;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object obj;
        switch (this.b) {
            case 0:
                List U0 = com.vk.cameraui.impl.a.U0((WebStoryBox) this.c);
                return U0 == null ? EmptyList.b : U0;
            default:
                Image image = (Image) this.c;
                t810 t810Var = new t810(24);
                Iterator it = j5g.y0(image.c).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((Boolean) t810Var.invoke(obj)).booleanValue()) {
                        }
                    } else {
                        obj = null;
                    }
                }
                ImageSize imageSize = (ImageSize) obj;
                if (imageSize == null) {
                    for (Object obj2 : j5g.y0(image.b)) {
                        if (((Boolean) t810Var.invoke(obj2)).booleanValue()) {
                            imageSize = (ImageSize) obj2;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                return Uri.parse(imageSize.d.d);
        }
    }
}
