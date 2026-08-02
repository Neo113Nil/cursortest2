package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.api.ContentType;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.link.CatalogLinkImageStyle;
import com.vk.catalog2.feature.music.offline.content.OfflineCatalogCategories;
import com.vk.dto.common.Image;
import com.vkontakte.android.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.ok.gl.tf.Tensorflow;

/* compiled from: MusicOfflineCatalogLinkProviderImpl.kt */
/* loaded from: classes16.dex */
public final class zp40 {
    public final Context a;

    public zp40(Context context) {
        this.a = context;
    }

    public final HashMap a(yp40 yp40Var, List list) {
        String str;
        String str2;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OfflineCatalogCategories offlineCatalogCategories = (OfflineCatalogCategories) it.next();
            String o = offlineCatalogCategories.o();
            OfflineCatalogCategories offlineCatalogCategories2 = OfflineCatalogCategories.AutoDownload;
            Context context = this.a;
            if (offlineCatalogCategories == offlineCatalogCategories2) {
                str2 = context.getString(R.string.music_catalog_offline_autodownload_description);
            } else {
                long a = yp40Var.a(offlineCatalogCategories);
                if (a > 0) {
                    Context context2 = e43.a;
                    if (context2 == null) {
                        context2 = null;
                    }
                    str = f870.t(a, context2);
                } else {
                    str = "";
                }
                str2 = str;
            }
            hashMap.put(o, new CatalogLink(offlineCatalogCategories.o(), context.getString(offlineCatalogCategories.p()), str2, "", Image.d, new Meta(null, ContentType.AUDIO_OFFLINE, offlineCatalogCategories.o(), null, null, null, false, null, null, null, Tensorflow.FRAME_HEIGHT, null), null, false, CatalogLinkImageStyle.RECTANGLE_STACKED_ROTATED, null, null, null, null, 4096, null));
        }
        return hashMap;
    }
}
