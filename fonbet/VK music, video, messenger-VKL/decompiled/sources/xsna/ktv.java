package xsna;

import android.content.Context;
import android.view.View;
import android.view.Window;
import com.vk.dto.stories.model.ideas.StoryIdea;
import com.vk.dto.stories.model.ideas.StoryIdeaType;
import com.vk.dto.stories.model.web.StoryBoxPrepared;
import com.vk.log.L;
import com.vk.story.viewer.impl.presentation.ideas.ui.IdeasTeaserEvent;
import com.vk.story.viewer.impl.presentation.stories.view.SourceTransitionStory;
import com.vk.superapp.api.dto.story.WebStoryBox;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.fa90;
import xsna.iuv;
import xsna.ltv;
import xsna.rsv;

/* compiled from: IdeasStoryFeature.kt */
/* loaded from: classes6.dex */
public final class ktv extends wk50<ruv, juv, rsv, ltv> {
    public final muv f;
    public final ptv g;
    public final f4z h;

    public ktv(fuv fuvVar, muv muvVar, ptv ptvVar) {
        super(null, fuvVar);
        this.f = muvVar;
        this.g = ptvVar;
        this.h = new f4z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v47, types: [xsna.ltv$i] */
    /* JADX WARN: Type inference failed for: r1v48, types: [xsna.ltv$k] */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object] */
    @Override // xsna.wk50
    public final void N(juv juvVar, rsv rsvVar) {
        ltv.h hVar;
        View decorView;
        Context context;
        io.reactivex.rxjava3.core.x B;
        int g;
        juv juvVar2 = juvVar;
        rsv rsvVar2 = rsvVar;
        int i = juvVar2.c;
        List<nsv> list = juvVar2.b;
        boolean z = rsvVar2 instanceof tsv;
        int i2 = 10;
        int i3 = 0;
        f4z f4zVar = this.h;
        int i4 = 1;
        if (z) {
            List<StoryIdea> list2 = ((tsv) rsvVar2).b;
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                int i5 = ((StoryIdea) obj).e;
                if (i5 == 0 || i5 > currentTimeMillis) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                f4zVar.b(new iuv.a(SourceTransitionStory.EXPIRED_TIME));
                return;
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new nsv(UUID.randomUUID().toString(), (StoryIdea) it.next(), fa90.b.a));
            }
            T(new ltv.a(arrayList2));
            C(new ssv(0));
            return;
        }
        boolean z2 = rsvVar2 instanceof ssv;
        final muv muvVar = this.f;
        if (z2) {
            int i6 = ((ssv) rsvVar2).b;
            if (i6 < 0 || i6 >= list.size()) {
                return;
            }
            nsv nsvVar = list.get(i6);
            if (nsvVar.c instanceof fa90.b) {
                final String str = nsvVar.b.d;
                T(new ltv.c(i6));
                muvVar.getClass();
                a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.c(new io.reactivex.rxjava3.functions.n() { // from class: xsna.luv
                    @Override // io.reactivex.rxjava3.functions.n
                    public final Object get() {
                        muv muvVar2 = muv.this;
                        ConcurrentHashMap<String, StoryBoxPrepared> concurrentHashMap = muvVar2.b;
                        String str2 = str;
                        StoryBoxPrepared storyBoxPrepared = concurrentHashMap.get(str2);
                        return storyBoxPrepared != null ? io.reactivex.rxjava3.core.x.k(storyBoxPrepared) : new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.mixed.q(new io.reactivex.rxjava3.internal.operators.single.v(new j99(str2, 1)), new qj4(new g53(21), 18)).K(), new bf2(new yu1(12, muvVar2, str2), 22));
                    }
                }).q(asu0.a.c()), new m1g(this, i6, i4), new jtv(i6, this), 1);
                return;
            }
            return;
        }
        if (rsvVar2 instanceof xsv) {
            StoryBoxPrepared storyBoxPrepared = ((xsv) rsvVar2).b;
            Iterator<nsv> it2 = list.iterator();
            int i7 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i7 = -1;
                    break;
                }
                fa90 fa90Var = it2.next().c;
                if ((fa90Var instanceof fa90.d) && ((fa90.d) fa90Var).a == storyBoxPrepared) {
                    break;
                } else {
                    i7++;
                }
            }
            if (i7 == -1 || ((fa90.d) list.get(i7).c).b) {
                return;
            }
            T(new ltv.d(i7));
            if (i7 == i) {
                C(ftv.b);
                return;
            }
            return;
        }
        if (rsvVar2 instanceof wsv) {
            StoryBoxPrepared storyBoxPrepared2 = ((wsv) rsvVar2).b;
            Iterator<nsv> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    i3 = -1;
                    break;
                }
                fa90 fa90Var2 = it3.next().c;
                if ((fa90Var2 instanceof fa90.d) && ((fa90.d) fa90Var2).a == storyBoxPrepared2) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 == -1) {
                return;
            }
            T(new ltv.b(i3));
            return;
        }
        if (rsvVar2 instanceof ysv) {
            nsv nsvVar2 = (nsv) j5g.b0(((ysv) rsvVar2).b, list);
            if (nsvVar2 == null) {
                return;
            }
            final StoryIdea storyIdea = nsvVar2.b;
            f4zVar.b(new iuv.g(IdeasTeaserEvent.VIEW_STORY, storyIdea));
            muvVar.getClass();
            a7f0.a.d(this, new io.reactivex.rxjava3.internal.operators.completable.f(new io.reactivex.rxjava3.functions.n() { // from class: xsna.kuv
                @Override // io.reactivex.rxjava3.functions.n
                public final Object get() {
                    StoryIdea storyIdea2 = StoryIdea.this;
                    String str2 = storyIdea2.b;
                    muv muvVar2 = muvVar;
                    ConcurrentHashMap.KeySetView<String, Boolean> keySetView = muvVar2.c;
                    fnm0 fnm0Var = muvVar2.a;
                    return (keySetView.contains(str2) || !muvVar2.d.add(str2)) ? io.reactivex.rxjava3.internal.operators.completable.i.b : new io.reactivex.rxjava3.internal.operators.completable.h(fnm0Var.d(storyIdea2).c(fnm0Var.f(storyIdea2)).g(new o30(1, muvVar2, str2)), new qh3(1, muvVar2, str2));
                }
            }).q(asu0.a.c()), null, null, null, 7);
            return;
        }
        if (rsvVar2.equals(zsv.b)) {
            nsv nsvVar3 = (nsv) j5g.b0(i, list);
            if ((nsvVar3 != null ? nsvVar3.c : null) instanceof fa90.a) {
                T(new ltv.g(i));
                C(new ssv(i));
                return;
            }
            return;
        }
        if (rsvVar2.equals(vsv.b)) {
            T(new ltv.p(true));
            C(ftv.b);
            return;
        }
        if (rsvVar2.equals(usv.b)) {
            T(new ltv.p(false));
            T(new ltv.n(false));
            return;
        }
        if (rsvVar2 instanceof atv) {
            T(new ltv.o(((atv) rsvVar2).b));
            return;
        }
        if (rsvVar2 instanceof btv) {
            SourceTransitionStory sourceTransitionStory = ((btv) rsvVar2).b;
            int i8 = i + 1;
            if (i8 > e43.h(list)) {
                f4zVar.b(new iuv.a(sourceTransitionStory));
                return;
            }
            T(new ltv.q(i8));
            C(new ssv(i8));
            C(ftv.b);
            return;
        }
        if (rsvVar2.equals(ctv.b)) {
            int i9 = i - 1;
            if (i9 < 0) {
                f4zVar.b(iuv.d.a);
                return;
            }
            T(new ltv.q(i9));
            C(new ssv(i9));
            C(ftv.b);
            return;
        }
        if (rsvVar2 instanceof dtv) {
            if (list.isEmpty() || (g = swe0.g(0, 0, e43.h(list))) == i) {
                return;
            }
            T(new ltv.q(g));
            C(new ssv(g));
            C(ftv.b);
            return;
        }
        if (rsvVar2.equals(etv.b)) {
            T(new ltv.n(false));
            return;
        }
        if (rsvVar2.equals(ftv.b)) {
            T(new ltv.n(true));
            return;
        }
        boolean equals = rsvVar2.equals(htv.b);
        ptv ptvVar = this.g;
        if (equals) {
            nsv nsvVar4 = (nsv) j5g.b0(i, list);
            if (nsvVar4 == null) {
                return;
            }
            final StoryIdea storyIdea2 = nsvVar4.b;
            fa90 fa90Var3 = nsvVar4.c;
            fa90.d dVar = fa90Var3 instanceof fa90.d ? (fa90.d) fa90Var3 : null;
            if (dVar != null && dVar.b) {
                f4zVar.b(new iuv.g(IdeasTeaserEvent.CLICK_TO_PUBLISH, storyIdea2));
                StoryBoxPrepared storyBoxPrepared3 = dVar.a;
                huv huvVar = ptvVar.a;
                WebStoryBox webStoryBox = storyBoxPrepared3.b;
                if (epx.f(webStoryBox.b, "video")) {
                    B = io.reactivex.rxjava3.core.x.i(new UnsupportedOperationException("ideas: video storybox publish is not supported"));
                } else {
                    String str2 = webStoryBox.d;
                    if (!epx.f(webStoryBox.b, "image")) {
                        io.reactivex.rxjava3.core.x.k(null);
                        throw null;
                    }
                    if (str2 == null || drm0.N(str2)) {
                        io.reactivex.rxjava3.core.x.k(null);
                        throw null;
                    }
                    B = io.reactivex.rxjava3.core.x.B(new io.reactivex.rxjava3.internal.operators.single.v(new guv(str2, 0)), new szl0(1080.0f, 1920.0f, huvVar.a, huvVar.b).b(webStoryBox).K().l(new wq(19)), new kf3(new pue(huvVar), 22));
                }
                asu0 asu0Var = asu0.a;
                asu0Var.getClass();
                itg0.h(B.q(asu0.i()).m(asu0Var.c()), new ll1(i2, ptvVar, storyIdea2), new yhu(ptvVar, 2));
                muvVar.getClass();
                a7f0.a.d(this, new io.reactivex.rxjava3.internal.operators.completable.f(new io.reactivex.rxjava3.functions.n() { // from class: xsna.kuv
                    @Override // io.reactivex.rxjava3.functions.n
                    public final Object get() {
                        StoryIdea storyIdea22 = StoryIdea.this;
                        String str22 = storyIdea22.b;
                        muv muvVar2 = muvVar;
                        ConcurrentHashMap.KeySetView<String, Boolean> keySetView = muvVar2.c;
                        fnm0 fnm0Var = muvVar2.a;
                        return (keySetView.contains(str22) || !muvVar2.d.add(str22)) ? io.reactivex.rxjava3.internal.operators.completable.i.b : new io.reactivex.rxjava3.internal.operators.completable.h(fnm0Var.d(storyIdea22).c(fnm0Var.f(storyIdea22)).g(new o30(1, muvVar2, str22)), new qh3(1, muvVar2, str22));
                    }
                }).q(asu0Var.c()), null, null, null, 7);
                if (list.size() == 1) {
                    f4zVar.b(iuv.e.a);
                    return;
                } else {
                    T(new ltv.f(i));
                    return;
                }
            }
            return;
        }
        if (rsvVar2.equals(gtv.b)) {
            nsv nsvVar5 = (nsv) j5g.b0(i, list);
            if (nsvVar5 == null) {
                return;
            }
            StoryIdea storyIdea3 = nsvVar5.b;
            fa90 fa90Var4 = nsvVar5.c;
            fa90.d dVar2 = fa90Var4 instanceof fa90.d ? (fa90.d) fa90Var4 : null;
            if (dVar2 != null && dVar2.b) {
                f4zVar.b(new iuv.g(IdeasTeaserEvent.CLICK_TO_EDIT, storyIdea3));
                StoryBoxPrepared storyBoxPrepared4 = dVar2.a;
                Window window = (Window) ptvVar.g.invoke();
                if (window == null || (decorView = window.getDecorView()) == null || (context = decorView.getContext()) == null) {
                    L.G("ideas: openEditor — no window context");
                    return;
                }
                StoryIdeaType x = s200.x(storyIdea3.c);
                com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a("story_viewer_finished", ptvVar.h);
                aVar.A(storyBoxPrepared4);
                aVar.a0 = true;
                aVar.b0 = x.h();
                StoryIdeaType storyIdeaType = StoryIdeaType.BIRTHDAY;
                if (x == storyIdeaType) {
                    aVar.d = storyIdeaType.h();
                }
                aVar.C(context);
                return;
            }
            return;
        }
        if (rsvVar2 instanceof rsv.b) {
            rsv.b bVar = (rsv.b) rsvVar2;
            if (bVar.equals(rsv.b.C3629b.b)) {
                T(new ltv.n(false));
                f4zVar.b(iuv.c.a);
                return;
            }
            if (!bVar.equals(rsv.b.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            nsv nsvVar6 = (nsv) j5g.b0(i, list);
            if (nsvVar6 == null) {
                return;
            }
            StoryIdea storyIdea4 = nsvVar6.b;
            String h = s200.x(storyIdea4.c).h();
            f4zVar.b(new iuv.g(IdeasTeaserEvent.CLICK_TO_HIDE_TEASER, storyIdea4));
            f4zVar.b(iuv.f.a);
            T(new ltv.n(false));
            a7f0.a.d(this, muvVar.a.c(h).q(asu0.a.c()), null, new ugm(this, 11), new drg(this, 21), 1);
            return;
        }
        if (rsvVar2 instanceof rsv.c) {
            rsv.c cVar = (rsv.c) rsvVar2;
            if (cVar instanceof rsv.c.d) {
                hVar = new ltv.m();
            } else if (cVar instanceof rsv.c.C3630c) {
                rsv.c.C3630c c3630c = (rsv.c.C3630c) cVar;
                hVar = new ltv.k(c3630c.b, c3630c.c, c3630c.d);
            } else if (cVar instanceof rsv.c.b) {
                hVar = new ltv.i(((rsv.c.b) cVar).b);
            } else {
                if (!(cVar instanceof rsv.c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                hVar = new ltv.h(((rsv.c.a) cVar).b);
            }
            T(hVar);
            return;
        }
        if (!(rsvVar2 instanceof rsv.a)) {
            throw new NoWhenBranchMatchedException();
        }
        rsv.a aVar2 = (rsv.a) rsvVar2;
        if (aVar2 instanceof rsv.a.d) {
            T(new ltv.l(((rsv.a.d) aVar2).b));
            return;
        }
        if (aVar2.equals(rsv.a.c.b)) {
            T(new ltv.j());
        } else if (aVar2.equals(rsv.a.C3628a.b)) {
            T(new ltv.n(false));
        } else if (!aVar2.equals(rsv.a.b.b)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
