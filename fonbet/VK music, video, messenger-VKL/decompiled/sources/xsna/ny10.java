package xsna;

import android.content.Context;
import com.vk.dto.stories.entities.StoryCameraGalleryData;
import com.vk.media.MediaUtils;
import com.vk.stories.analytics.StoryPublishEvent;
import java.util.List;
import xsna.hfr;
import xsna.kjw;

/* compiled from: MediaSizeAnalytics.kt */
/* loaded from: classes6.dex */
public final class ny10 {
    public static final void a(final String str, final List list) {
        itg0.j(io.reactivex.rxjava3.core.a.l(new io.reactivex.rxjava3.functions.a() { // from class: xsna.ky10
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                am9 am9Var = new am9();
                am9Var.a.a = str;
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                List list2 = list;
                hfr.a aVar = new hfr.a(rli0.j(new i5g(list2), new y510(1)));
                boolean z = false;
                while (aVar.hasNext()) {
                    kjw.a g = kjw.g(context, ((StoryCameraGalleryData) aVar.next()).b, true);
                    am9Var.c(StoryPublishEvent.ADD_FROM_GALLERY, new ly10(g.a, g.b));
                    z = true;
                }
                hfr.a aVar2 = new hfr.a(rli0.j(new i5g(list2), new n9w(2)));
                while (aVar2.hasNext()) {
                    String b = r9r.b(context, ((StoryCameraGalleryData) aVar2.next()).b);
                    MediaUtils.f d = b != null ? MediaUtils.a.d(b) : null;
                    if (d != null) {
                        am9Var.c(StoryPublishEvent.ADD_FROM_GALLERY, new ly10(d.a, d.b));
                    }
                    z = true;
                }
                if (z) {
                    return;
                }
                am9Var.c(StoryPublishEvent.ADD_FROM_GALLERY, null);
            }
        }).q(asu0.a.c()), null, 3);
    }
}
