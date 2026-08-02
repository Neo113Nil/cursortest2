package xsna;

import android.net.Uri;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryEntryExtended;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.story.api.domain.preload.StoryVideoMemoryCache;
import com.vk.toggle.features.StoriesFeatures;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyThreadSafetyMode;

/* compiled from: StoriesBackgroundContentLoaderImpl.kt */
/* loaded from: classes6.dex */
public final class fql0 implements aql0 {
    public final v5m0 a;
    public final fnm0 b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final io.reactivex.rxjava3.disposables.c h;
    public final ConcurrentHashMap<String, String> i;

    public fql0(e1m0 e1m0Var, v5m0 v5m0Var, hnm0 hnm0Var) {
        this.a = v5m0Var;
        this.b = hnm0Var;
        e3c0 e3c0Var = new e3c0(7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, e3c0Var);
        this.d = msy.a(lazyThreadSafetyMode, new nof0(3));
        this.e = msy.a(lazyThreadSafetyMode, new ku70(11));
        this.f = msy.a(lazyThreadSafetyMode, new daz(22));
        this.g = msy.a(lazyThreadSafetyMode, new jo60(12));
        new bpn0(new uv80(8));
        this.h = EmptyDisposable.INSTANCE;
        this.i = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.aql0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.reactivex.rxjava3.core.x a(StoryEntry storyEntry) {
        final fql0 fql0Var;
        final StoryEntry storyEntry2;
        io.reactivex.rxjava3.core.a fVar;
        io.reactivex.rxjava3.core.x k;
        StoriesFeatures storiesFeatures;
        VideoFile videoFile;
        VideoUrlStorage w9;
        io.reactivex.rxjava3.internal.operators.completable.f fVar2 = new io.reactivex.rxjava3.internal.operators.completable.f(new irg(1, this, storyEntry));
        final boolean booleanValue = ((Boolean) this.g.getValue()).booleanValue();
        StoryEntryExtended storyEntryExtended = storyEntry.R;
        final String Cb = storyEntryExtended != null ? storyEntryExtended.b.Cb(true) : "";
        if (Cb == null) {
            fVar = io.reactivex.rxjava3.internal.operators.completable.i.b;
        } else {
            final StoryEntryExtended storyEntryExtended2 = storyEntry.R;
            if (storyEntryExtended2 != null) {
                fql0Var = this;
                storyEntry2 = storyEntry;
                fVar = new io.reactivex.rxjava3.internal.operators.completable.f(new io.reactivex.rxjava3.functions.n() { // from class: xsna.cql0
                    @Override // io.reactivex.rxjava3.functions.n
                    public final Object get() {
                        StoryEntry storyEntry3 = StoryEntryExtended.this.b;
                        String str = storyEntry3 != null ? storyEntry3.B0 : null;
                        boolean z = str == null || str.length() == 0;
                        final String str2 = Cb;
                        if (str2.length() <= 0 || (booleanValue && !z)) {
                            return io.reactivex.rxjava3.internal.operators.completable.i.b;
                        }
                        L l = L.a;
                        l.getClass();
                        boolean m = L.m(LoggerOutputTarget.NONE);
                        final StoryEntry storyEntry4 = storyEntry2;
                        if (!m) {
                            L.u(l, L.LogType.d, new Object[]{"preload start thumb entry " + storyEntry4.Kb() + " url=" + str2});
                        }
                        Uri parse = Uri.parse(str2);
                        io.reactivex.rxjava3.core.a vVar = parse != null ? (mcr0.o(parse.toString()) || mcr0.p(parse.toString())) ? io.reactivex.rxjava3.internal.operators.completable.i.b : new io.reactivex.rxjava3.internal.operators.completable.v(new io.reactivex.rxjava3.internal.operators.completable.e(new yh1(new x5z(parse, 0), 20)), io.reactivex.rxjava3.internal.functions.a.g) : io.reactivex.rxjava3.internal.operators.completable.i.b;
                        final fql0 fql0Var2 = fql0Var;
                        p350 p350Var = new p350(new oh3(28, fql0Var2, str2), 17);
                        vVar.getClass();
                        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                        return new io.reactivex.rxjava3.internal.operators.completable.w(vVar, p350Var, lVar, kVar, kVar, kVar, kVar).g(new io.reactivex.rxjava3.functions.a() { // from class: xsna.dql0
                            @Override // io.reactivex.rxjava3.functions.a
                            public final void run() {
                                L l2 = L.a;
                                l2.getClass();
                                boolean m2 = L.m(LoggerOutputTarget.NONE);
                                String str3 = str2;
                                if (!m2) {
                                    L.u(l2, L.LogType.d, new Object[]{"preload done thumb entry " + storyEntry4.Kb() + " url=" + str3});
                                }
                                fql0.this.i.remove(str3);
                            }
                        });
                    }
                });
                io.reactivex.rxjava3.internal.operators.completable.b c = fVar2.c(fVar);
                if (!storyEntry2.b && storyEntry2.Tb()) {
                    storiesFeatures = StoriesFeatures.ST_VIDEO_PRELOADER_PART;
                    storiesFeatures.getClass();
                    if (com.vk.toggle.b.A.a(storiesFeatures)) {
                        if (storyEntry2.Tb() && (videoFile = storyEntry2.n) != null && (w9 = videoFile.w9()) != null) {
                            Iterator it = w9.Bb().iterator();
                            while (it.hasNext()) {
                                String str = (String) it.next();
                                fql0Var.i.put(str, str);
                            }
                        }
                        k = new io.reactivex.rxjava3.internal.operators.completable.c0(fql0Var.a.b(storyEntry2, StoryVideoMemoryCache.ONLY_DISK).g(new xp9(this, storyEntry2, 1)), new bql0(), null);
                        return new io.reactivex.rxjava3.internal.operators.single.n(c.e(k), new s520(new w620(storyEntry2, 29), 21));
                    }
                }
                k = io.reactivex.rxjava3.core.x.k(Boolean.FALSE);
                return new io.reactivex.rxjava3.internal.operators.single.n(c.e(k), new s520(new w620(storyEntry2, 29), 21));
            }
            fVar = io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
        fql0Var = this;
        storyEntry2 = storyEntry;
        io.reactivex.rxjava3.internal.operators.completable.b c2 = fVar2.c(fVar);
        if (!storyEntry2.b) {
            storiesFeatures = StoriesFeatures.ST_VIDEO_PRELOADER_PART;
            storiesFeatures.getClass();
            if (com.vk.toggle.b.A.a(storiesFeatures)) {
            }
        }
        k = io.reactivex.rxjava3.core.x.k(Boolean.FALSE);
        return new io.reactivex.rxjava3.internal.operators.single.n(c2.e(k), new s520(new w620(storyEntry2, 29), 21));
    }
}
