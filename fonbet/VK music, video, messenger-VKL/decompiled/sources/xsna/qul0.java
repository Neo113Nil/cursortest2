package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.EmptyList;

/* compiled from: StoriesSeenControllerImpl.kt */
/* loaded from: classes6.dex */
public final class qul0 implements oul0 {
    public final p870 a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();

    /* compiled from: StoriesSeenControllerImpl.kt */
    public final class a implements bd70<List<? extends StoryEntry>> {
        public final izs<UserId, s3q0> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super UserId, s3q0> izsVar) {
            this.b = izsVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
        @Override // xsna.bd70
        public final void x0(int i, int i2, List<? extends StoryEntry> list) {
            UserId userId;
            ?? r1;
            List<? extends StoryEntry> list2 = list;
            StoryEntry storyEntry = (StoryEntry) j5g.a0(list2);
            if (storyEntry == null || (userId = storyEntry.d) == null) {
                return;
            }
            LinkedHashMap linkedHashMap = qul0.this.b;
            if (linkedHashMap.keySet().contains(userId)) {
                List list3 = (List) linkedHashMap.get(userId);
                if (list3 != null) {
                    r1 = new ArrayList();
                    for (Object obj : list3) {
                        if (!list2.contains((StoryEntry) obj)) {
                            r1.add(obj);
                        }
                    }
                } else {
                    r1 = 0;
                }
                if (r1 == 0) {
                    r1 = EmptyList.b;
                }
                linkedHashMap.put(userId, r1);
                Collection collection = (Collection) linkedHashMap.get(userId);
                if (collection == null || collection.isEmpty()) {
                    this.b.invoke(userId);
                }
            }
        }
    }

    /* compiled from: StoriesSeenControllerImpl.kt */
    public final class b implements bd70<List<? extends StoriesContainer>> {
        public b() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, List<? extends StoriesContainer> list) {
            for (StoriesContainer storiesContainer : list) {
                UserId Ab = storiesContainer.Ab();
                if (Ab != null) {
                    LinkedHashMap linkedHashMap = qul0.this.b;
                    CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList = storiesContainer.g;
                    ArrayList arrayList = new ArrayList();
                    Iterator<StoryEntry> it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        StoryEntry next = it.next();
                        if (!next.h) {
                            arrayList.add(next);
                        }
                    }
                    linkedHashMap.put(Ab, arrayList);
                }
            }
        }
    }

    public qul0(p870 p870Var) {
        this.a = p870Var;
    }

    @Override // xsna.oul0
    public final io.reactivex.rxjava3.disposables.c a(izs<? super UserId, s3q0> izsVar) {
        final b bVar = new b();
        final a aVar = new a(izsVar);
        final int identityHashCode = System.identityHashCode(bVar);
        final int identityHashCode2 = System.identityHashCode(aVar);
        Integer valueOf = Integer.valueOf(identityHashCode);
        LinkedHashMap linkedHashMap = this.c;
        linkedHashMap.put(valueOf, bVar);
        linkedHashMap.put(Integer.valueOf(identityHashCode2), aVar);
        p870 p870Var = this.a;
        p870Var.b(120, bVar);
        p870Var.b(100, aVar);
        return new io.reactivex.rxjava3.disposables.a(new io.reactivex.rxjava3.functions.a() { // from class: xsna.pul0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                qul0 qul0Var = qul0.this;
                p870 p870Var2 = qul0Var.a;
                p870Var2.g(bVar);
                p870Var2.g(aVar);
                LinkedHashMap linkedHashMap2 = qul0Var.c;
                linkedHashMap2.remove(Integer.valueOf(identityHashCode));
                linkedHashMap2.remove(Integer.valueOf(identityHashCode2));
            }
        });
    }
}
