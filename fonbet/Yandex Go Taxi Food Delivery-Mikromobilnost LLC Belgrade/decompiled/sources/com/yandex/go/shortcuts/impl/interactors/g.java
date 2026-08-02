package com.yandex.go.shortcuts.impl.interactors;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.dto.response.Action$MediaStory;
import defpackage.anu0;
import defpackage.czo0;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.jst;
import defpackage.jy60;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.unr0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.communications.api.dto.RetryPolicy;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.promotions.model.PromotionBackground;

/* loaded from: classes8.dex */
public final class g implements jy60 {
    public final m a;
    public final ru.yandex.taxi.stories.domain.b b;
    public final h3y c;
    public final Lifecycle d;
    public final tse e;
    public pzt0 f;
    public final hbp0 g = new hbp0(new czo0(14), "", null);

    public g(m mVar, ru.yandex.taxi.stories.domain.b bVar, h3y h3yVar, Lifecycle lifecycle, tse tseVar) {
        this.a = mVar;
        this.b = bVar;
        this.c = h3yVar;
        this.d = lifecycle;
        this.e = tseVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(g gVar, Action$MediaStory action$MediaStory, ContinuationImpl continuationImpl) {
        MediaShortcutInteractor$preloadMediaShortcut$1 mediaShortcutInteractor$preloadMediaShortcut$1;
        int i;
        String str;
        Action$MediaStory.Prefetch prefetch;
        ru.yandex.taxi.stories.domain.b bVar = gVar.b;
        try {
            if (continuationImpl instanceof MediaShortcutInteractor$preloadMediaShortcut$1) {
                mediaShortcutInteractor$preloadMediaShortcut$1 = (MediaShortcutInteractor$preloadMediaShortcut$1) continuationImpl;
                int i2 = mediaShortcutInteractor$preloadMediaShortcut$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mediaShortcutInteractor$preloadMediaShortcut$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = mediaShortcutInteractor$preloadMediaShortcut$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = mediaShortcutInteractor$preloadMediaShortcut$1.label;
                    zy11 zy11Var = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        String a = action$MediaStory.a.getA();
                        try {
                            ru.yandex.taxi.stories.domain.b bVar2 = gVar.b;
                            mediaShortcutInteractor$preloadMediaShortcut$1.L$0 = action$MediaStory;
                            mediaShortcutInteractor$preloadMediaShortcut$1.L$1 = a;
                            mediaShortcutInteractor$preloadMediaShortcut$1.label = 1;
                            try {
                                Object c = bVar2.d.c(a, bVar2.a, RetryPolicy.DEFAULT, mediaShortcutInteractor$preloadMediaShortcut$1);
                                if (c == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                obj = c;
                                str = a;
                            } catch (Throwable th) {
                                th = th;
                                str = a;
                                jst.e.k(th, String.format("Error preloading story %s", Arrays.copyOf(new Object[]{str}, 1)));
                                return zy11Var;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) mediaShortcutInteractor$preloadMediaShortcut$1.L$1;
                        action$MediaStory = (Action$MediaStory) mediaShortcutInteractor$preloadMediaShortcut$1.L$0;
                        try {
                            kotlin.b.b(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            jst.e.k(th, String.format("Error preloading story %s", Arrays.copyOf(new Object[]{str}, 1)));
                            return zy11Var;
                        }
                    }
                    Story story = (Story) obj;
                    unr0.C(new Object[]{str}, 1, "Story preloaded %s", jst.e);
                    prefetch = action$MediaStory.b;
                    if (prefetch != Action$MediaStory.Prefetch.IMAGES) {
                        bVar.b.b(story, true);
                        return zy11Var;
                    }
                    if (prefetch == Action$MediaStory.Prefetch.ALL_MEDIA) {
                        anu0 anu0Var = bVar.b;
                        anu0 anu0Var2 = bVar.b;
                        anu0Var.b(story, true);
                        anu0Var2.a(story);
                        ru.yandex.taxi.stories.data.caching.a aVar = anu0Var2.c;
                        ArrayList s = story.s(PromotionBackground.Type.VIDEO);
                        aVar.getClass();
                        Iterator it = s.iterator();
                        while (it.hasNext()) {
                            aVar.b((String) it.next());
                        }
                    }
                    return zy11Var;
                }
            }
            if (i != 0) {
            }
            Story story2 = (Story) obj;
            unr0.C(new Object[]{str}, 1, "Story preloaded %s", jst.e);
            prefetch = action$MediaStory.b;
            if (prefetch != Action$MediaStory.Prefetch.IMAGES) {
            }
        } catch (CancellationException e) {
            throw e;
        }
        mediaShortcutInteractor$preloadMediaShortcut$1 = new MediaShortcutInteractor$preloadMediaShortcut$1(gVar, continuationImpl);
        Object obj2 = mediaShortcutInteractor$preloadMediaShortcut$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mediaShortcutInteractor$preloadMediaShortcut$1.label;
        zy11 zy11Var2 = zy11.a;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "MediaShortcutInteractor";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.e, null, null, new MediaShortcutInteractor$onFirstContentfulPaint$1(this, null), 3);
    }
}
