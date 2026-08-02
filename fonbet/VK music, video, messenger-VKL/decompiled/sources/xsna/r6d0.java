package xsna;

import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AlbumAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PrimaryAlbumHolderTransformer.kt */
/* loaded from: classes4.dex */
public final class r6d0 implements gn60<bd1, wm60> {
    public static List a(bd1 bd1Var) {
        int min;
        int i;
        int i2;
        NewsEntry newsEntry = bd1Var.a;
        NewsEntry newsEntry2 = bd1Var.b;
        AlbumAttachment albumAttachment = bd1Var.c;
        xah0 xah0Var = bd1Var.d;
        Photo photo = albumAttachment.l;
        ArrayList arrayList = photo.y.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (ImageSize.j.contains(Character.valueOf(((ImageSize) next).b))) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = photo.y.b;
        }
        boolean z = false;
        if (xah0Var == null) {
            min = iah0.a(640.0f);
        } else {
            min = Math.min(cn70.b(xah0Var.b) - (xah0Var.c ? cn70.b(84) : 0), iah0.a(640.0f));
        }
        ImageSize y = nr2.y(min, arrayList2);
        if (y != null) {
            Image image = y.d;
            i = image.b;
            i2 = image.c;
        } else {
            i = 135;
            i2 = 100;
        }
        int i3 = i2;
        boolean Ib = photo.Ib();
        boolean Hb = photo.Hb();
        ArrayList arrayList3 = (!Ib || Hb) ? arrayList2 : null;
        PhotoRestriction photoRestriction = photo.L;
        if (photoRestriction != null && !photoRestriction.d) {
            z = true;
        }
        return Collections.singletonList(new s6d0(newsEntry, newsEntry2, albumAttachment, albumAttachment.m, albumAttachment.y, i, i3, arrayList3, Ib, Hb, z, photoRestriction != null ? photoRestriction.b : null, Hb ? R.drawable.vk_icon_hide_outline_56 : R.drawable.vk_icon_do_not_disturb_outline_56, di60.s(newsEntry)));
    }
}
