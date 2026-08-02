package xsna;

import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.feed.core.models.Description;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.header.HeaderTitle;
import com.vk.feed.core.models.header.SourcePhoto;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;

/* compiled from: PostCoownersHeaderTransformer.kt */
/* loaded from: classes4.dex */
public final class i1c0 implements gn60<Triple<? extends NewsEntry, ? extends NewsEntry, ? extends s1c0>, wm60> {
    /* JADX WARN: Multi-variable type inference failed */
    public final List a(int i, Triple triple) {
        SourcePhoto sourcePhoto;
        List<Owner> list;
        int i2;
        NewsfeedCoowners newsfeedCoowners;
        NewsfeedCoowners newsfeedCoowners2;
        ArrayList arrayList;
        int i3;
        String str;
        String str2;
        boolean z;
        c4c0 c4c0Var;
        UserId e;
        HeaderTitle headerTitle;
        List<Text> list2;
        NewsEntry newsEntry = (NewsEntry) triple.d();
        NewsEntry newsEntry2 = (NewsEntry) triple.g();
        s1c0 s1c0Var = (s1c0) triple.h();
        wsx0 wsx0Var = newsEntry instanceof wsx0 ? (wsx0) newsEntry : null;
        if (wsx0Var == null) {
            return EmptyList.b;
        }
        Post R = di60.R(newsEntry);
        EntryHeader header = wsx0Var.getHeader();
        if (header == null || (sourcePhoto = header.b) == null || (list = sourcePhoto.b) == null) {
            throw new IllegalArgumentException("This NewsEntry doesn't have photo sources");
        }
        if (list.size() < 2) {
            throw new IllegalArgumentException("There must be at least two co-owners");
        }
        boolean z2 = newsEntry instanceof Post;
        boolean z3 = false;
        if (z2) {
            newsfeedCoowners = ((Post) newsEntry).f0;
            i2 = 1;
        } else {
            if (newsEntry instanceof Videos) {
                Videos videos = (Videos) newsEntry;
                if (videos.Lb()) {
                    if (list.size() < 2) {
                        throw new IllegalArgumentException("There must be at least two co-owners");
                    }
                    ClipVideoFile Ob = videos.Ob();
                    Owner owner = Ob != null ? Ob.v0 : null;
                    List<Owner> list3 = list;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                    for (Owner owner2 : list3) {
                        arrayList2.add(new NewsfeedCoowners.CoownerStatus(owner2, CoOwnerItem.StatusDto.APPROVED.j(), !owner2.i(4), owner2.i(4)));
                    }
                    i2 = 1;
                    newsfeedCoowners = new NewsfeedCoowners(epx.f(owner != null ? owner.b : null, list.get(0)), !epx.f(owner != null ? owner.b : null, list.get(0)), null, null, arrayList2, EmptyList.b);
                }
            }
            i2 = 1;
            newsfeedCoowners = null;
        }
        if (newsfeedCoowners == null) {
            EmptyList emptyList = EmptyList.b;
            newsfeedCoowners2 = new NewsfeedCoowners(false, false, null, null, emptyList, emptyList);
        } else {
            newsfeedCoowners2 = newsfeedCoowners;
        }
        EntryHeader header2 = wsx0Var.getHeader();
        int i4 = (header2 != null ? header2.e : null) != null ? 331 : 329;
        EntryHeader header3 = wsx0Var.getHeader();
        if (header3 == null || (headerTitle = header3.c) == null || (list2 = headerTitle.c) == null) {
            arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String str3 = ((Owner) it.next()).c;
                if (str3 != null) {
                    arrayList.add(str3);
                }
            }
        } else {
            arrayList = new ArrayList();
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                String str4 = ((Text) it2.next()).b;
                if (str4 != null) {
                    arrayList.add(str4);
                }
            }
        }
        Long valueOf = R != null ? Long.valueOf(R.n) : null;
        Long valueOf2 = (R == null || (e = rv60.e(R)) == null) ? null : Long.valueOf(e.b);
        String str5 = R != null ? R.L.b : null;
        EntryHeader header4 = wsx0Var.getHeader();
        c4c0 c4c0Var2 = new c4c0(valueOf, valueOf2, str5, header4 != null ? header4.h : null);
        EntryHeader header5 = wsx0Var.getHeader();
        List<Description> list4 = header5 != null ? header5.e : null;
        if (list4 == null) {
            list4 = EmptyList.b;
        }
        List<Description> list5 = list4;
        String str6 = (String) arrayList.get(0);
        if (arrayList.size() == 2) {
            i3 = i2;
            str = (String) arrayList.get(i3);
        } else {
            i3 = i2;
            str = null;
        }
        int size = arrayList.size() - i3;
        Owner owner3 = list.get(0);
        Owner owner4 = list.get(i3);
        List<Description> list6 = list5;
        if (!(list6 instanceof Collection) || !list6.isEmpty()) {
            Iterator<T> it3 = list6.iterator();
            while (it3.hasNext()) {
                if (((Description) it3.next()).g) {
                    str2 = str;
                    z = true;
                    break;
                }
            }
        }
        str2 = str;
        z = false;
        if (z2) {
            z3 = ((Post) newsEntry).mc();
        } else if (newsEntry instanceof PromoPost) {
            z3 = ((PromoPost) newsEntry).n.mc();
        } else if ((newsEntry instanceof Videos) && s1c0Var != null && s1c0Var.o && s1c0Var.D && ((Videos) newsEntry).Rb()) {
            c4c0Var = c4c0Var2;
            z3 = true;
            return Collections.singletonList(new g1c0(newsEntry, newsEntry2, str6, str2, owner3, owner4, size, newsfeedCoowners2, c4c0Var, list5, z, i4, z3));
        }
        c4c0Var = c4c0Var2;
        return Collections.singletonList(new g1c0(newsEntry, newsEntry2, str6, str2, owner3, owner4, size, newsfeedCoowners2, c4c0Var, list5, z, i4, z3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a(0, (Triple) pair);
    }
}
