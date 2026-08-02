package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.NarrativePublishEventType;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.lists.ListDataSet;
import com.vk.lists.c;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.archive.impl.presentation.StoryArchiveFragment;
import com.vk.story.archive.impl.presentation.list.StoryArchiveRecyclerPaginatedView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: StoryArchivePresenter.kt */
/* loaded from: classes6.dex */
public final class oxl0 implements cxl0, c.l<ppt> {
    public final StoryArchiveFragment b;
    public final UserId c;
    public final xsl0 d;
    public final upl0 e;
    public final p870 f;
    public com.vk.lists.c h;
    public mxl0 i;
    public final ListDataSet<zif0> g = new ListDataSet<>();
    public final LinkedHashSet j = new LinkedHashSet();
    public final io.reactivex.rxjava3.disposables.b k = new io.reactivex.rxjava3.disposables.b();
    public final zoq l = new zoq(this, 1);
    public final nxl0 m = new nxl0(this, 0);

    /* compiled from: StoryArchivePresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            j03.l(th);
            return s3q0.a;
        }
    }

    public oxl0(StoryArchiveFragment storyArchiveFragment, UserId userId, xsl0 xsl0Var, upl0 upl0Var, p870 p870Var) {
        this.b = storyArchiveFragment;
        this.c = userId;
        this.d = xsl0Var;
        this.e = upl0Var;
        this.f = p870Var;
    }

    @Override // xsna.cxl0
    public final boolean K0() {
        return fkq0.b(this.c);
    }

    @Override // xsna.cxl0
    public final void V0() {
        LinkedHashSet linkedHashSet = this.j;
        linkedHashSet.clear();
        StoryArchiveFragment storyArchiveFragment = this.b;
        storyArchiveFragment.ko();
        storyArchiveFragment.lo(p4g.d(linkedHashSet));
    }

    @Override // xsna.cxl0
    public final void W6() {
        hg1.l(this.d.c(j5g.O0(this.j)).o(io.reactivex.rxjava3.android.schedulers.a.b()), this.b.getActivity(), 62).subscribe(new u30(this, 7), new pmu(new a(1, j03.a, j03.class, "showErrorToast", "showErrorToast(Ljava/lang/Throwable;)V", 0), 20));
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    @Override // xsna.gm6
    public final void d() {
        c.h hVar = new c.h(this);
        hVar.i = 100;
        StoryArchiveFragment storyArchiveFragment = this.b;
        zak0 zak0Var = (zak0) storyArchiveFragment.e0;
        fj3 fj3Var = (fj3) zak0Var.getValue();
        ListDataSet<zif0> listDataSet = this.g;
        zak0Var.setValue(fj3.a(fj3Var, listDataSet.d.size() > 0, false, 2));
        bxl0 bxl0Var = new bxl0(listDataSet, new exl0(1, storyArchiveFragment, StoryArchiveFragment.class, "openStory", "openStory(Lcom/vk/dto/stories/model/StoryEntry;)V", 0), new com.vk.movika.tools.controls.seekbar.p(storyArchiveFragment, 15));
        storyArchiveFragment.f0 = bxl0Var;
        StoryArchiveRecyclerPaginatedView storyArchiveRecyclerPaginatedView = storyArchiveFragment.Y;
        if (storyArchiveRecyclerPaginatedView != null) {
            storyArchiveRecyclerPaginatedView.setAdapter(bxl0Var);
        }
        this.h = com.vk.lists.f.a(hVar, storyArchiveFragment.Y);
        zoq zoqVar = this.l;
        p870 p870Var = this.f;
        p870Var.b(108, zoqVar);
        p870Var.b(102, this.m);
    }

    @Override // xsna.cxl0
    public final void d1() {
        LinkedHashSet linkedHashSet = this.j;
        ArrayList arrayList = new ArrayList(c5g.u(linkedHashSet, 10));
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((StoryEntry) it.next()).c));
        }
        StoryArchiveFragment storyArchiveFragment = this.b;
        j6v j6vVar = (j6v) storyArchiveFragment.T.getValue();
        NarrativePublishEventType narrativePublishEventType = NarrativePublishEventType.CLICK_TO_ADD_TO_NARRATIVE;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.STORY_ARCHIVE;
        j6vVar.f(narrativePublishEventType, mobileOfficialAppsCoreNavStat$EventScreen, null);
        ((su50) storyArchiveFragment.V.getValue()).c(this.c, mobileOfficialAppsCoreNavStat$EventScreen, arrayList).g(229, storyArchiveFragment);
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<ppt> hj(com.vk.lists.c cVar, boolean z) {
        return ui(0, cVar);
    }

    @Override // xsna.cxl0
    public final List<StoriesContainer> k6() {
        mxl0 mxl0Var = this.i;
        if (mxl0Var == null) {
            mxl0Var = null;
        }
        return j5g.O0((ArrayList) mxl0Var.c);
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
        this.k.dispose();
        com.vk.lists.c cVar = this.h;
        if (cVar != null) {
            cVar.v();
        }
        this.h = null;
        zoq zoqVar = this.l;
        p870 p870Var = this.f;
        p870Var.g(zoqVar);
        p870Var.g(this.m);
    }

    @Override // xsna.cxl0
    public final UserId q() {
        return this.c;
    }

    @Override // xsna.cxl0
    public final void s0(StoryEntry storyEntry, boolean z) {
        LinkedHashSet linkedHashSet = this.j;
        if (z) {
            linkedHashSet.add(storyEntry);
        } else {
            linkedHashSet.remove(storyEntry);
        }
        boolean isEmpty = linkedHashSet.isEmpty();
        StoryArchiveFragment storyArchiveFragment = this.b;
        if (isEmpty) {
            storyArchiveFragment.ko();
        } else {
            int size = linkedHashSet.size();
            anm0.E((anm0) storyArchiveFragment.U.getValue(), StoryViewAction.SELECT_SOME_STORY, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_ARCHIVE), MobileOfficialAppsConStoriesStat$ViewEntryPoint.ARCHIVE, null, null, 56);
            zak0 zak0Var = (zak0) storyArchiveFragment.e0;
            zak0Var.setValue(fj3.a((fj3) zak0Var.getValue(), false, true, 1));
            ((wak0) storyArchiveFragment.d0).C(size);
        }
        storyArchiveFragment.lo(p4g.d(linkedHashSet));
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<ppt> ui(int i, com.vk.lists.c cVar) {
        return this.e.b(i, this.c, cVar.k()).w().a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<ppt> qVar, boolean z, com.vk.lists.c cVar) {
        this.k.b(qVar.subscribe(new k5j0(new sd1(this, z, 4), 3), new lav(new sux(29), 28)));
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}
