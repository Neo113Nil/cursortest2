package xsna;

import android.net.Uri;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.eno0;

/* compiled from: LinkUnderMediaTransformer.kt */
/* loaded from: classes4.dex */
public final class cbz implements gn60<Pair<? extends NewsEntry, ? extends LinkAttachment>, wm60> {
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        if (r1.size() == 1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<ol60> a(int i, Pair<? extends NewsEntry, ? extends LinkAttachment> pair, wm60 wm60Var) {
        ArrayList arrayList;
        PhotoAttachment photoAttachment;
        Photo photo;
        String str;
        e0c0 e0c0Var;
        Post post;
        ArrayList<EntryAttachment> arrayList2;
        NewsEntry d = pair.d();
        LinkAttachment g = pair.g();
        boolean z = d instanceof PromoPost;
        Uri uri = null;
        PromoPost promoPost = z ? (PromoPost) d : null;
        if (promoPost == null || (post = promoPost.n) == null || (arrayList2 = post.z) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
            Iterator<T> it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((EntryAttachment) it.next()).b);
            }
            arrayList = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (next instanceof PhotoAttachment) {
                    arrayList.add(next);
                }
            }
        }
        PromoPost promoPost2 = z ? (PromoPost) d : null;
        boolean z2 = epx.f((promoPost2 == null || (e0c0Var = promoPost2.H) == null) ? null : Boolean.valueOf(e0c0Var.a), Boolean.TRUE) && arrayList != null;
        if (arrayList != null && (photoAttachment = (PhotoAttachment) j5g.a0(arrayList)) != null && (photo = photoAttachment.l) != null && (str = photo.t) != null) {
            uri = Uri.parse(str);
        }
        return Collections.singletonList(new ur8(new eno0.b(g.g), g, z2, uri));
    }

    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a(0, pair, bp5Var);
    }
}
