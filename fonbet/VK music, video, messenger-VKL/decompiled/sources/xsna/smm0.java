package xsna;

import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryEntryExtended;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.story.api.domain.preload.StoryVideoMemoryCache;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.LazyThreadSafetyMode;

/* compiled from: StoryViewPrioritizingLoading.kt */
/* loaded from: classes6.dex */
public final class smm0 {
    public final q7m0 a;
    public final WeakReference<vrl0> b;
    public final v5m0 c;
    public io.reactivex.rxjava3.disposables.c d;
    public io.reactivex.rxjava3.disposables.c e;
    public final Object f;
    public final int g;
    public volatile boolean h;
    public final CopyOnWriteArrayList<otz> i;

    /* compiled from: StoryViewPrioritizingLoading.kt */
    public final class a {
        public final io.reactivex.rxjava3.subjects.f<otz> a;
        public final CopyOnWriteArrayList<otz> b;
        public final io.reactivex.rxjava3.disposables.c c;

        public a(smm0 smm0Var) {
            io.reactivex.rxjava3.subjects.f<otz> fVar = new io.reactivex.rxjava3.subjects.f<>();
            this.a = fVar;
            this.b = new CopyOnWriteArrayList<>();
            this.c = EmptyDisposable.INSTANCE;
            this.c = fVar.t(new l340(new v74(29, this, smm0Var), 16)).subscribe(new eiy(new hsc0(this, 16), 19), new qmm0(new o7j0(4), 0));
        }
    }

    public smm0(q7m0 q7m0Var, WeakReference weakReference, v5m0 v5m0Var) {
        this.a = q7m0Var;
        this.b = weakReference;
        this.c = v5m0Var;
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.d = emptyDisposable;
        this.e = emptyDisposable;
        this.f = msy.a(LazyThreadSafetyMode.NONE, new uv80(9));
        this.g = 3;
        new a(this);
        this.i = new CopyOnWriteArrayList<>();
    }

    public final x1d0 a(StoriesContainer storiesContainer, Integer num) {
        if (storiesContainer == null || num == null) {
            return null;
        }
        StoryEntry storyEntry = (StoryEntry) j5g.b0(num.intValue(), storiesContainer.g);
        if (storyEntry == null) {
            return null;
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"next auth stories isVideo=" + storyEntry.Tb() + ' ' + storyEntry.Kb()});
        }
        if (!storyEntry.Tb()) {
            return null;
        }
        x1d0 x1d0Var = new x1d0(storyEntry, Boolean.FALSE, this.a.b(), storiesContainer);
        d(x1d0Var);
        return x1d0Var;
    }

    public final io.reactivex.rxjava3.core.a b(otz otzVar) {
        io.reactivex.rxjava3.core.a aVar;
        if (otzVar instanceof dtz) {
            return new io.reactivex.rxjava3.internal.operators.completable.e(new mrc0((dtz) otzVar, this));
        }
        if (otzVar instanceof ktz) {
            return new io.reactivex.rxjava3.internal.operators.completable.e(new khc0((ktz) otzVar, this));
        }
        if (otzVar instanceof vtz) {
            return new io.reactivex.rxjava3.internal.operators.completable.e(new hkc0((vtz) otzVar, this));
        }
        if (!(otzVar instanceof x1d0)) {
            return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
        x1d0 x1d0Var = (x1d0) otzVar;
        String Bb = x1d0Var.a.Bb(iah0.v());
        StoryEntry storyEntry = x1d0Var.a;
        StoryEntryExtended storyEntryExtended = storyEntry.R;
        String Cb = storyEntryExtended != null ? storyEntryExtended.b.Cb(true) : "";
        io.reactivex.rxjava3.internal.operators.completable.b c = c(Bb, storyEntry, true).c(new io.reactivex.rxjava3.internal.operators.observable.l0(io.reactivex.rxjava3.core.q.T(Boolean.valueOf(true ^ (Cb == null || Cb.length() == 0))), new tj60(new ed5(this, Cb, x1d0Var, 4), 15)));
        if (storyEntry.Tb()) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.LogType logType = L.LogType.d;
                StringBuilder sb = new StringBuilder("start preload video=");
                sb.append(storyEntry.Kb());
                sb.append(" | owner=");
                StoryOwner storyOwner = storyEntry.l0;
                sb.append(storyOwner != null ? storyOwner.Db() : null);
                L.u(l, logType, new Object[]{sb.toString()});
            }
            vrl0 vrl0Var = this.b.get();
            if (vrl0Var != null) {
                vrl0Var.n(this.a.b(), storyEntry, false, false);
            }
            aVar = new io.reactivex.rxjava3.internal.operators.completable.v(this.c.b(storyEntry, StoryVideoMemoryCache.MEMORY_AND_DISK).g(new hr60(1, storyEntry, this)).q(asu0.a.c()), new p5w(new fuc0(storyEntry, 13), 22));
        } else {
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.LogType logType2 = L.LogType.d;
                StringBuilder sb2 = new StringBuilder("skip preload video=");
                sb2.append(storyEntry.Kb());
                sb2.append(" | owner=");
                StoryOwner storyOwner2 = storyEntry.l0;
                sb2.append(storyOwner2 != null ? storyOwner2.Db() : null);
                L.u(l2, logType2, new Object[]{sb2.toString()});
            }
            aVar = io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
        return c.c(aVar);
    }

    public final io.reactivex.rxjava3.internal.operators.single.s c(String str, StoryEntry storyEntry, boolean z) {
        return new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.v(new kmm0(str, 0)).q(asu0.a.c()), new xq70(new lmm0(this, storyEntry, z, str), 16));
    }

    public final void d(otz otzVar) {
        StoryEntry c = otzVar.c();
        StoriesContainer storiesContainer = otzVar.getStoriesContainer();
        q7m0 q7m0Var = this.a;
        Integer a2 = q7m0Var.a(storiesContainer);
        int i = 1000;
        if (a2 != null) {
            int intValue = a2.intValue();
            StoriesContainer storiesContainer2 = q7m0Var.g;
            Integer a3 = storiesContainer2 != null ? q7m0Var.a(storiesContainer2) : null;
            if (a3 != null) {
                int intValue2 = a3.intValue();
                StoriesContainer storiesContainer3 = q7m0Var.g;
                if (storiesContainer3 != null) {
                    Iterator<StoryEntry> it = storiesContainer.g.iterator();
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (it.hasNext()) {
                        StoryEntry next = it.next();
                        int i5 = i2 + 1;
                        if (i2 < 0) {
                            e43.t();
                            throw null;
                        }
                        StoryEntry storyEntry = next;
                        if (intValue <= i4 || !storyEntry.h) {
                            String id = storyEntry.getId();
                            StoryEntry b = q7m0Var.b();
                            if (epx.f(id, b != null ? b.getId() : null)) {
                                i4 = i2;
                            }
                            if (!epx.f(storyEntry.getId(), c != null ? c.getId() : null)) {
                                i2 = i3;
                            }
                            i3 = i2;
                        }
                        i2 = i5;
                    }
                    i = intValue == intValue2 ? i3 - i4 : intValue > intValue2 ? storiesContainer3.g.size() + i3 : 1000 + i3;
                }
            }
        }
        otzVar.a(Integer.valueOf(i));
    }
}
