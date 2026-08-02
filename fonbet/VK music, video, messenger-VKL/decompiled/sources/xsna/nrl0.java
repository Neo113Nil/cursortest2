package xsna;

import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.ideas.StoryIdea;
import com.vk.dto.stories.model.ideas.StoryIdeasBlock;
import com.vk.log.L;
import com.vk.story.impl.domain.interactor.cache.StoriesCacheManager;
import io.reactivex.rxjava3.internal.functions.a;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.Regex;

/* compiled from: StoriesCacheInteractorImpl.kt */
/* loaded from: classes11.dex */
public final class nrl0 implements lrl0 {
    public final p870 a;
    public final v5m0 b;
    public volatile GetStoriesResponse d;
    public final StoriesCacheManager c = new StoriesCacheManager();
    public final io.reactivex.rxjava3.subjects.h e = io.reactivex.rxjava3.subjects.d.N0().M0();

    public nrl0(p870 p870Var, v5m0 v5m0Var) {
        this.a = p870Var;
        this.b = v5m0Var;
    }

    @Override // xsna.lrl0
    public final void a(final int i) {
        final StoriesCacheManager storiesCacheManager = this.c;
        storiesCacheManager.d = i;
        asu0.a.getClass();
        asu0.n().execute(new Runnable() { // from class: xsna.orl0
            @Override // java.lang.Runnable
            public final void run() {
                StoriesCacheManager storiesCacheManager2 = StoriesCacheManager.this;
                try {
                    File file = storiesCacheManager2.b;
                    Regex regex = com.vk.core.files.a.a;
                    if (vhk0.g(file)) {
                        FileInputStream fileInputStream = new FileInputStream(storiesCacheManager2.b);
                        try {
                            byte[] bArr = new byte[8];
                            fileInputStream.read(bArr);
                            int i2 = ByteBuffer.wrap(bArr).getInt();
                            fileInputStream.close();
                            if (i2 < i) {
                                storiesCacheManager2.a();
                            }
                        } finally {
                        }
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        });
    }

    @Override // xsna.lrl0
    public final void b(List<? extends StoriesContainer> list, boolean z) {
        GetStoriesResponse getStoriesResponse = new GetStoriesResponse(list, list.size());
        getStoriesResponse.h = z;
        this.e.onNext(getStoriesResponse);
        this.a.e(101, list);
    }

    @Override // xsna.lrl0
    public final void c(StoriesContainer storiesContainer) {
        ArrayList<StoriesContainer> arrayList;
        GetStoriesResponse getStoriesResponse = this.d;
        if (getStoriesResponse == null || (arrayList = getStoriesResponse.c) == null) {
            return;
        }
        g5g.D(arrayList, true, new k7l0(storiesContainer, 2));
    }

    @Override // xsna.lrl0
    public final void clear() {
        this.b.cancel();
        this.d = null;
        this.c.a();
    }

    @Override // xsna.lrl0
    public final io.reactivex.rxjava3.core.q<GetStoriesResponse> d() {
        StoriesCacheManager storiesCacheManager = this.c;
        storiesCacheManager.getClass();
        io.reactivex.rxjava3.internal.operators.observable.j1 U = new io.reactivex.rxjava3.internal.operators.observable.s0(new cwk(storiesCacheManager, 3)).r0(asu0.a.c()).U(new wx40(new ye40(16), 8));
        m5y m5yVar = new m5y(new b140(this, 24), 25);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return U.E(m5yVar, lVar, kVar, kVar);
    }

    @Override // xsna.lrl0
    public final void e(Collection<? extends StoryEntry> collection, izs<? super StoryEntry, s3q0> izsVar) {
        GetStoriesResponse getStoriesResponse = this.d;
        if (getStoriesResponse == null) {
            return;
        }
        try {
            GetStoriesResponse getStoriesResponse2 = new GetStoriesResponse(getStoriesResponse);
            ArrayList<StoriesContainer> arrayList = getStoriesResponse2.c;
            if (arrayList.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<StoriesContainer> it = arrayList.iterator();
            while (it.hasNext()) {
                g5g.y(it.next().Mb(), arrayList2);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (collection.contains((StoryEntry) next)) {
                    arrayList3.add(next);
                }
            }
            Iterator it3 = arrayList3.iterator();
            boolean z = false;
            while (it3.hasNext()) {
                izsVar.invoke((StoryEntry) it3.next());
                z = true;
            }
            if (z) {
                j(getStoriesResponse2);
            }
        } catch (Throwable th) {
            L.g("Can't update story in cache", th);
        }
    }

    @Override // xsna.lrl0
    public final void f(List<? extends StoryEntry> list) {
        e(list, new azt(27));
    }

    @Override // xsna.lrl0
    public final io.reactivex.rxjava3.core.q<GetStoriesResponse> g() {
        return this.e;
    }

    @Override // xsna.lrl0
    public final void h(String str) {
        StoryIdeasBlock storyIdeasBlock;
        GetStoriesResponse getStoriesResponse = this.d;
        if (getStoriesResponse == null || (storyIdeasBlock = getStoriesResponse.g) == null) {
            return;
        }
        List<StoryIdea> d = storyIdeasBlock.d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : d) {
            if (!epx.f(s200.x(((StoryIdea) obj).d()).h(), str)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == storyIdeasBlock.d().size()) {
            return;
        }
        j(new GetStoriesResponse(getStoriesResponse.b, getStoriesResponse.d, getStoriesResponse.c, getStoriesResponse.f, getStoriesResponse.e, arrayList.isEmpty() ? null : StoryIdeasBlock.a(storyIdeasBlock, arrayList)));
    }

    @Override // xsna.lrl0
    public final GetStoriesResponse i() {
        return this.d;
    }

    @Override // xsna.lrl0
    public final void j(GetStoriesResponse getStoriesResponse) {
        this.d = getStoriesResponse;
        StoriesCacheManager storiesCacheManager = this.c;
        storiesCacheManager.getClass();
        io.reactivex.rxjava3.internal.operators.single.f0 q = new io.reactivex.rxjava3.internal.operators.single.v(new prl0(0, storiesCacheManager, new StoriesCacheManager.StoriesCache(new StoriesCacheManager.Meta(getStoriesResponse.b), i7o0.a(getStoriesResponse.c)))).q(asu0.a.c());
        int i = kwg0.a;
        q.subscribe(new iwg0(), new hu50(new n1g0(8), 20));
    }

    @Override // xsna.lrl0
    public final void k(StoriesContainer storiesContainer) {
        e(storiesContainer.Mb(), new fxi0(1));
    }

    @Override // xsna.lrl0
    public final long l() {
        return com.vk.core.files.a.I(this.c.b);
    }

    @Override // xsna.lrl0
    public final void m(StoriesContainer storiesContainer) {
        CopyOnWriteArrayList<StoryEntry> Mb = storiesContainer.Mb();
        GetStoriesResponse getStoriesResponse = this.d;
        if (getStoriesResponse != null) {
            ArrayList<StoriesContainer> arrayList = getStoriesResponse.c;
            StoriesContainer storiesContainer2 = null;
            if (arrayList != null) {
                Iterator<StoriesContainer> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    StoriesContainer next = it.next();
                    StoriesContainer storiesContainer3 = next;
                    if (storiesContainer3.Jb() != null && storiesContainer.Jb() != null && epx.f(storiesContainer.Jb(), storiesContainer3.Jb())) {
                        storiesContainer2 = next;
                        break;
                    }
                }
                storiesContainer2 = storiesContainer2;
            }
            if (storiesContainer2 != null) {
                storiesContainer2.Sb(new CopyOnWriteArrayList<>(Mb));
            }
        }
    }

    @Override // xsna.lrl0
    public final void n(StoryIdea storyIdea) {
        StoryIdeasBlock storyIdeasBlock;
        int indexOf;
        GetStoriesResponse getStoriesResponse = this.d;
        if (getStoriesResponse == null || (storyIdeasBlock = getStoriesResponse.g) == null || (indexOf = storyIdeasBlock.d().indexOf(storyIdea)) == -1) {
            return;
        }
        ArrayList arrayList = new ArrayList(storyIdeasBlock.d());
        arrayList.remove(indexOf);
        j(new GetStoriesResponse(getStoriesResponse.b, getStoriesResponse.d, getStoriesResponse.c, getStoriesResponse.f, getStoriesResponse.e, arrayList.isEmpty() ? null : StoryIdeasBlock.a(storyIdeasBlock, arrayList)));
    }

    @Override // xsna.lrl0
    public final void o() {
        asu0.a.getClass();
        asu0.n().execute(new mrl0());
    }
}
