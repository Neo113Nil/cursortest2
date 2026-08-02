package xsna;

import android.content.Context;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.newsfeed.Owner;
import com.vk.feed.core.models.ImagePhoto;
import com.vk.feed.core.models.dzen.DzenNews;
import com.vk.feed.core.models.dzen.DzenNewsItem;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.tlo0;
import xsna.uto;

/* compiled from: DzenNewsItemHolderTransformer.kt */
/* loaded from: classes4.dex */
public final class tto implements gn60<DzenNews, wm60> {
    public final int b;
    public final int c;

    public tto(int i) {
        this.b = i;
        Context context = e43.a;
        this.c = e3m.a(R.dimen.dzen_item_icon_size, context == null ? null : context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0047, code lost:
    
        if ((!xsna.drm0.N(r1)) == true) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a(DzenNews dzenNews) {
        String str;
        uto.a bVar;
        DzenNewsItem dzenNewsItem = (DzenNewsItem) j5g.b0(this.b, dzenNews.j);
        if (dzenNewsItem == null) {
            return EmptyList.b;
        }
        ImagePhoto imagePhoto = dzenNewsItem.b;
        Owner owner = imagePhoto != null ? imagePhoto.e : null;
        int i = this.c;
        if (owner != null) {
            Owner owner2 = imagePhoto.e;
            if (owner2 != null) {
                str = owner2.f(i);
            }
            str = null;
        } else {
            if ((imagePhoto != null ? imagePhoto.b : null) != null) {
                Image image = imagePhoto.b;
                if (image != null) {
                    Serializer.c<Owner> cVar = Owner.CREATOR;
                    str = Owner.a.a(i, image);
                }
                str = null;
            } else {
                if (imagePhoto != null) {
                    str = imagePhoto.c;
                    if (str != null) {
                    }
                }
                str = null;
            }
        }
        if (str != null) {
            bVar = new uto.a.C3832a(str, tq.h(tlo0.Companion, R.string.accessibility_community_photo));
        } else {
            String str2 = imagePhoto != null ? imagePhoto.d : null;
            int i2 = R.drawable.vk_icon_flash_16;
            if (str2 != null && str2.length() != 0) {
                Context context = e43.a;
                int q = znk0.q(context != null ? context : null, str2);
                if (q != 0) {
                    i2 = q;
                }
            }
            bVar = new uto.a.b(i2, tq.h(tlo0.Companion, R.string.accessibility_community_photo));
        }
        tlo0.a aVar = tlo0.Companion;
        ucp ucpVar = ucp.a;
        return Collections.singletonList(new uto(bVar, u11.f(aVar, ucp.i(dzenNewsItem.c.b)), dzenNewsItem.g, dzenNewsItem, this.b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a((DzenNews) pair);
    }
}
