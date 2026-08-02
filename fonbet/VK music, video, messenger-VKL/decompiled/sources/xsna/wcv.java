package xsna;

import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.data.PostInteract;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import xsna.s1c0;

/* compiled from: HorizontalCarouselDisplayItemsFactory.kt */
/* loaded from: classes4.dex */
public final class wcv {
    public final a7d0 a;

    public wcv(a7d0 a7d0Var) {
        this.a = a7d0Var;
    }

    public final a160 a(ArrayList arrayList, v1c0 v1c0Var, ArrayList arrayList2, s1c0 s1c0Var) {
        String str;
        v1c0 v1c0Var2 = v1c0Var;
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        s1c0.a aVar = new s1c0.a();
        int i = 0;
        aVar.j = false;
        aVar.l = true;
        xah0 xah0Var = s1c0Var.q;
        if (xah0Var != null) {
            aVar.s = xah0Var;
        }
        s1c0 a = aVar.a();
        NewsEntry newsEntry = v1c0Var2.a;
        NewsEntry newsEntry2 = v1c0Var2.b;
        PostInteract postInteract = v1c0Var2.e;
        String str2 = v1c0Var2.c;
        String str3 = (postInteract == null || (str = postInteract.b) == null) ? str2 : str;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            EntryAttachment entryAttachment = (EntryAttachment) arrayList.get(i2);
            a2c0.m(entryAttachment.b, newsEntry, newsEntry2, postInteract, str2);
            int f = p7i.f(entryAttachment.b);
            if (f != -1) {
                r74 a2 = this.a.a(v1c0Var2, f, entryAttachment.b, arrayList3.size(), arrayList2, a);
                a2.l = str3;
                a2.n = a;
                a2.m = postInteract;
                arrayList3.add(a2);
            }
            i2++;
            v1c0Var2 = v1c0Var;
        }
        a160 a160Var = new a160(newsEntry, newsEntry2, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, arrayList3);
        Triple triple = new Triple(newsEntry, newsEntry2, arrayList3);
        NewsEntry newsEntry3 = (NewsEntry) triple.d();
        List list = (List) triple.h();
        ArrayList arrayList4 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList4.add(((u1c0) it.next()).h);
        }
        a160Var.h = (ol60) j5g.a0(Collections.singletonList(new vdv((NewsEntry) triple.i(), (NewsEntry) triple.j(), arrayList4, di60.h(newsEntry3))));
        if (newsEntry instanceof Post) {
            i = ((Post) newsEntry).S;
        } else if (newsEntry instanceof PromoPost) {
            i = ((PromoPost) newsEntry).n.S;
        }
        a160Var.f = i;
        a160Var.g = newsEntry instanceof Photos ? Integer.valueOf(((Photos) newsEntry).r) : null;
        a160Var.l = str3;
        return a160Var;
    }
}
