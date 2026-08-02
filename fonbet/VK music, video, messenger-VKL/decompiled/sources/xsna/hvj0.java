package xsna;

import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.Image;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* compiled from: SinglePhotoHolderTransformer.kt */
/* loaded from: classes4.dex */
public final class hvj0 implements gn60<vp10, wm60> {
    public final List a(vp10 vp10Var) {
        int min;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int size;
        NewsEntry newsEntry = vp10Var.a;
        NewsEntry newsEntry2 = vp10Var.b;
        PhotoAttachment photoAttachment = vp10Var.c;
        int i5 = vp10Var.d;
        int i6 = vp10Var.e;
        List<EntryAttachment> list = vp10Var.f;
        xah0 xah0Var = vp10Var.g;
        int i7 = 0;
        r7 = false;
        r7 = false;
        boolean z2 = false;
        if (xah0Var == null) {
            min = iah0.a(640.0f);
        } else {
            min = Math.min(cn70.b(xah0Var.b) - (xah0Var.c ? cn70.b(84) : 0), iah0.a(640.0f));
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
        ArrayList arrayList3 = arrayList2;
        ImageSize y = nr2.y(min, arrayList3);
        if (y != null) {
            Image image = y.d;
            i = image.b;
            i2 = image.c;
        } else {
            i = 135;
            i2 = 100;
        }
        int i8 = i2;
        int i9 = i;
        if (ao8.r(list)) {
            int b = cn70.b(12);
            int b2 = cn70.b(36);
            int b3 = cn70.b(40);
            if (i6 == 0 && (size = list.size()) != 0 && size == 1) {
                EntryAttachment entryAttachment = (EntryAttachment) j5g.a0(list);
                z2 = (entryAttachment != null ? entryAttachment.b : null) instanceof AudioPlaylistAttachment;
            }
            i3 = b;
            z = z2;
            i4 = b2;
            i7 = b3;
        } else {
            z = false;
            i3 = 0;
            i4 = 0;
        }
        return Collections.singletonList(new ivj0(newsEntry, newsEntry2, photoAttachment, i5, i3, i4, i7, z, photo.b, photo.x, photo.r, photo.y, i9, i8, arrayList3, di60.s(newsEntry)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a((vp10) pair);
    }
}
