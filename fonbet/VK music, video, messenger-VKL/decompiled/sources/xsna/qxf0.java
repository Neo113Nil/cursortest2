package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.impl.presentation.newsfeed.editor.actions.DeleteSource;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedDuplicateOwnerPost;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.qn60;

/* compiled from: RemovePostsWithSameOwnerId.kt */
/* loaded from: classes4.dex */
public final class qxf0 implements qn60.b {
    public final List<NewsEntry> a;
    public final DeleteSource b;

    /* compiled from: RemovePostsWithSameOwnerId.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeleteSource.values().length];
            try {
                iArr[DeleteSource.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeleteSource.REMOTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qxf0(List<? extends NewsEntry> list, DeleteSource deleteSource) {
        this.a = list;
        this.b = deleteSource;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        List<NewsEntry> list;
        LinkedHashSet c = aVar.a.c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : c) {
            if (obj instanceof NewsEntry) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            list = this.a;
            if (!hasNext) {
                break;
            }
            Object next = it.next();
            if (!list.contains((NewsEntry) next)) {
                arrayList2.add(next);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            NewsEntry newsEntry = (NewsEntry) it2.next();
            linkedHashMap.put(k9q0.o(newsEntry), newsEntry);
        }
        for (NewsEntry newsEntry2 : list) {
            if (linkedHashMap.containsKey(k9q0.o(newsEntry2))) {
                int i = a.$EnumSwitchMapping$0[this.b.ordinal()];
                if (i == 1) {
                    newsEntry2 = (NewsEntry) linkedHashMap.get(k9q0.o(newsEntry2));
                } else if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (newsEntry2 != null) {
                    linkedHashSet.add(newsEntry2);
                }
            }
        }
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        aVar.i(j5g.H0(linkedHashSet, size));
        for (NewsEntry newsEntry3 : j5g.H0(linkedHashSet, size)) {
            new p4r().h(newsEntry3.Cb().b, Integer.valueOf(di60.n(newsEntry3)), k9q0.o(newsEntry3), MobileOfficialAppsFeedStat$TypeFeedDuplicateOwnerPost.Subtype.DELETE_POST);
        }
    }
}
