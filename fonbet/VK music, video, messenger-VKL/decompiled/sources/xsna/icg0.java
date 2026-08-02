package xsna;

import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* compiled from: RestrictedBlurredPhotoHolderTransformer.kt */
/* loaded from: classes4.dex */
public final class icg0 implements gn60<vp10, wm60> {
    public final List a(vp10 vp10Var) {
        int b;
        int i;
        int min;
        int i2;
        int i3;
        RestrictionButton restrictionButton;
        NewsEntry newsEntry = vp10Var.a;
        NewsEntry newsEntry2 = vp10Var.b;
        PhotoAttachment photoAttachment = vp10Var.c;
        int i4 = vp10Var.d;
        if (ao8.r(vp10Var.f)) {
            i = cn70.b(12);
            b = cn70.b(36);
        } else {
            int b2 = cn70.b(8);
            b = cn70.b(8);
            i = b2;
        }
        Photo photo = photoAttachment.l;
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
        xah0 xah0Var = vp10Var.g;
        if (xah0Var == null) {
            min = iah0.a(640.0f);
        } else {
            min = Math.min(cn70.b(xah0Var.b) - (xah0Var.c ? cn70.b(84) : 0), iah0.a(640.0f));
        }
        ImageSize y = nr2.y(min, arrayList2);
        if (y != null) {
            Image image = y.d;
            i2 = image.b;
            i3 = image.c;
        } else {
            i2 = 135;
            i3 = 100;
        }
        boolean Hb = photo.Hb();
        boolean z = Hb ? false : photo.r;
        int i5 = i3;
        String Ib = photoAttachment.Ib();
        String str = null;
        String str2 = Hb ? Ib : y != null ? y.d.d : null;
        PhotoRestriction photoRestriction = photo.L;
        String str3 = photoRestriction != null ? photoRestriction.b : null;
        if (photoRestriction != null && (restrictionButton = photoRestriction.e) != null) {
            str = restrictionButton.c;
        }
        return Collections.singletonList(new jcg0(newsEntry, newsEntry2, photoAttachment, i2, i5, Ib, Hb, str3, str, str2, z, i, b, i4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a((vp10) pair);
    }
}
