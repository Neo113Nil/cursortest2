package xsna;

import android.annotation.SuppressLint;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.ideas.StoryIdea;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: StoryViewerInteractorImpl.kt */
/* loaded from: classes6.dex */
public final class hnm0 implements fnm0 {
    public final lrl0 a;
    public final nnm0 b;
    public final bsl0 c;
    public volatile GetStoriesResponse d;

    public hnm0(lrl0 lrl0Var, nnm0 nnm0Var, bsl0 bsl0Var) {
        this.a = lrl0Var;
        this.b = nnm0Var;
        this.c = bsl0Var;
    }

    @Override // xsna.fnm0
    public final io.reactivex.rxjava3.core.x<StoriesContainer> a(StoriesContainer storiesContainer) {
        return storiesContainer.g.isEmpty() ? new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.b(new f8x(this, storiesContainer)).q(asu0.a.c()), new uxb0(new ggb0(this, 17), 9)) : io.reactivex.rxjava3.core.x.k(storiesContainer);
    }

    @Override // xsna.fnm0
    public final void b() {
        this.b.b.a.onNext(Boolean.FALSE);
    }

    @Override // xsna.fnm0
    public final io.reactivex.rxjava3.core.a c(String str) {
        final String str2;
        this.b.c.getClass();
        tfx tfxVar = new tfx("storiesIdeas.hide", new joi0(2), new hq(28));
        if (str != null) {
            str2 = str;
            tfx.o(tfxVar, "idea_id", str2, 0, 0, 12);
        } else {
            str2 = str;
        }
        return new io.reactivex.rxjava3.internal.operators.completable.p(rsg0.w0(yfb.x(tfxVar))).g(new io.reactivex.rxjava3.functions.a() { // from class: xsna.gnm0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                hnm0.this.a.h(str2);
            }
        });
    }

    @Override // xsna.fnm0
    public final io.reactivex.rxjava3.core.a d(StoryIdea storyIdea) {
        String str = storyIdea.b;
        this.b.c.getClass();
        tfx tfxVar = new tfx("storiesIdeas.markSeen", new iq(29), new koi0(3));
        tfx.o(tfxVar, "idea_id", str, 0, 0, 12);
        return new io.reactivex.rxjava3.internal.operators.completable.p(rsg0.w0(yfb.x(tfxVar)));
    }

    @Override // xsna.fnm0
    @SuppressLint({"CheckResult"})
    public final void e() {
        itg0.l(io.reactivex.rxjava3.core.a.l(new uex(1)).q(asu0.a.c()));
    }

    @Override // xsna.fnm0
    public final io.reactivex.rxjava3.core.a f(StoryIdea storyIdea) {
        return io.reactivex.rxjava3.core.a.l(new tmc0(1, this, storyIdea));
    }

    @Override // xsna.fnm0
    public final io.reactivex.rxjava3.core.q<Boolean> g() {
        return this.b.b.a;
    }

    public final StoriesContainer h(String str) {
        ArrayList<StoriesContainer> arrayList;
        Object obj = null;
        if (str == null) {
            return null;
        }
        GetStoriesResponse getStoriesResponse = this.d;
        ArrayList a = (getStoriesResponse == null || (arrayList = getStoriesResponse.c) == null) ? null : i7o0.a(arrayList);
        if (a == null) {
            return null;
        }
        Iterator it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            StoriesContainer storiesContainer = (StoriesContainer) next;
            if (epx.f(storiesContainer.f, str) && !storiesContainer.g.isEmpty()) {
                obj = next;
                break;
            }
        }
        return (StoriesContainer) obj;
    }
}
