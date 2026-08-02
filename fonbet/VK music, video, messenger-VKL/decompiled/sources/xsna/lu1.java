package xsna;

import android.os.Bundle;
import android.os.SystemClock;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.stories.model.HighlightStoriesContainer;
import com.vk.dto.stories.model.NarrativePublishEventType;
import com.vk.lists.c;
import com.vk.log.L;
import com.vk.narratives.impl.highlights.AllHighlightsFragment;
import com.vk.narratives.impl.highlights.HighlightEditFragment;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.h7u0;
import xsna.us80;

/* compiled from: AllHighlightsPresenter.kt */
/* loaded from: classes3.dex */
public final class lu1 extends ysi implements zt1 {
    public final AllHighlightsFragment c;
    public final UserId d;
    public final String e;
    public final vu50 f;
    public final gu50 g;
    public final j6v h;
    public final gd60 i;
    public final boolean j;
    public ArrayList k;
    public ArrayList l;
    public boolean m;
    public final ArrayList n = new ArrayList();
    public Integer o;

    /* compiled from: AllHighlightsPresenter.kt */
    public static final class a implements c.m<VKList<Narrative>> {

        /* compiled from: AllHighlightsPresenter.kt */
        /* renamed from: xsna.lu1$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3299a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
            @Override // xsna.izs
            public final s3q0 invoke(Throwable th) {
                L.i(th);
                return s3q0.a;
            }
        }

        public a() {
        }

        @Override // com.vk.lists.c.m
        public final io.reactivex.rxjava3.core.q<VKList<Narrative>> O9(String str, com.vk.lists.c cVar) {
            lu1 lu1Var = lu1.this;
            return lu1Var.f.b(cVar.k(), lu1Var.d, str, lu1Var.j);
        }

        @Override // com.vk.lists.c.k
        public final io.reactivex.rxjava3.core.q<VKList<Narrative>> hj(com.vk.lists.c cVar, boolean z) {
            return O9(null, cVar);
        }

        @Override // com.vk.lists.c.k
        public final void wd(io.reactivex.rxjava3.core.q<VKList<Narrative>> qVar, boolean z, com.vk.lists.c cVar) {
            lu1 lu1Var = lu1.this;
            lu1Var.b.b(qVar.subscribe(new jv(new ku1(0, lu1Var, cVar), 3), new lz(new C3299a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 2)));
        }
    }

    public lu1(AllHighlightsFragment allHighlightsFragment, UserId userId, String str, vu50 vu50Var, gu50 gu50Var, j6v j6vVar, gd60 gd60Var) {
        this.c = allHighlightsFragment;
        this.d = userId;
        this.e = str;
        this.f = vu50Var;
        this.g = gu50Var;
        this.h = j6vVar;
        this.i = gd60Var;
        this.j = xg5.a().a(userId);
    }

    @Override // xsna.zt1
    public final void E4(Narrative narrative) {
        gd60.X0(this.i, this.c.getActivity(), narrative, new pqq(null, null, null, null, 15), null, null, 56);
    }

    @Override // xsna.zt1
    public final void E5() {
        Integer num = this.o;
        if (num != null) {
            int intValue = num.intValue();
            int i = 1;
            this.b.b(hg1.n(this.g.i(intValue, this.d), this.c.getActivity(), false, null, 62).subscribe(new ez(new hu1(this, intValue, 0), i), new iu1(new vl1(this, i), 0)));
        }
    }

    @Override // xsna.zt1
    public final void K4(VkRecyclerPaginatedView vkRecyclerPaginatedView) {
        c.h hVar = new c.h(new a());
        hVar.i = 100;
        com.vk.lists.f.a(hVar, vkRecyclerPaginatedView);
    }

    @Override // xsna.zt1
    public final boolean P4() {
        return this.j;
    }

    @Override // xsna.zt1
    public final void R1(boolean z) {
        this.m = z;
        this.n.clear();
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = null;
        if (z && arrayList != null) {
            arrayList2 = new ArrayList(arrayList);
        }
        this.l = arrayList2;
        AllHighlightsFragment allHighlightsFragment = this.c;
        allHighlightsFragment.jo(z);
        if (z || arrayList == null) {
            return;
        }
        allHighlightsFragment.ko(arrayList);
    }

    @Override // xsna.zt1
    public final void X() {
        if (this.m) {
            ArrayList arrayList = this.n;
            if (arrayList.isEmpty()) {
                R1(false);
                return;
            }
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((us80) it.next()) instanceof us80.d) {
                        this.h.d(NarrativePublishEventType.CHANGE_SORT, this.e, null);
                        break;
                    }
                }
            }
            this.b.b(hg1.n(this.f.h(this.d, arrayList).m(io.reactivex.rxjava3.android.schedulers.a.b()), this.c.getActivity(), false, null, 62).subscribe(new hv(new com.vk.movika.sdk.base.observable.o(this, 3), 1), new io1(new ul1(this, 2), 1)));
        }
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    @Override // xsna.zt1
    public final void c7(int i) {
        ArrayList arrayList = this.l;
        if (!this.m || arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (((Narrative) it.next()).b == i) {
                break;
            } else {
                i2++;
            }
        }
        arrayList.remove(i2);
        this.n.add(new us80.b(i));
        this.c.ko(arrayList);
    }

    @Override // xsna.gm6
    public final void d() {
        this.c.jo(this.m);
        io.reactivex.rxjava3.subjects.f<Pair<UserId, d5v>> fVar = this.g.a().a;
        ju1 ju1Var = new ju1(new com.vk.movika.sdk.base.observable.k(this, 4), 0);
        fVar.getClass();
        this.b.b(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, ju1Var).subscribe(new defpackage.d(new com.vk.movika.sdk.base.observable.m(this, 4), 2)));
    }

    @Override // xsna.zt1
    public final void g6(int i, int i2) {
        ArrayList arrayList = this.l;
        if (!this.m || arrayList == null) {
            return;
        }
        Narrative narrative = (Narrative) arrayList.remove(i);
        arrayList.add(i2, narrative);
        this.n.add(new us80.d(narrative.b, i2 < e43.h(arrayList) ? ((Narrative) arrayList.get(i2 + 1)).b : 0, i2 > 0 ? ((Narrative) arrayList.get(i2 - 1)).b : 0));
        this.c.ko(arrayList);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.zt1
    public final void h2(Narrative narrative) {
        AllHighlightsFragment allHighlightsFragment = this.c;
        allHighlightsFragment.getClass();
        UserId userId = narrative.c;
        int i = narrative.b;
        String str = (String) allHighlightsFragment.a0.getValue();
        Bundle bundle = new Bundle();
        bundle.putParcelable("owner_id", userId);
        bundle.putInt("EXTRA_HIGHLIGHT_ID", i);
        bundle.putString("ref", str);
        oz50 oz50Var = new oz50(HighlightEditFragment.class, null, bundle);
        oz50Var.s(true);
        oz50Var.g(8765, allHighlightsFragment);
    }

    @Override // xsna.zt1
    public final void l2(int i) {
        this.o = Integer.valueOf(i);
        AllHighlightsFragment allHighlightsFragment = this.c;
        h7u0.a aVar = new h7u0.a(allHighlightsFragment.kn());
        aVar.U(R.string.highlight_delete_confirm_message);
        aVar.c0(R.string.delete, new au1(allHighlightsFragment, 0));
        aVar.W(R.string.cancel_request, new du1(0));
        allHighlightsFragment.e0 = aVar.m();
    }

    @Override // xsna.zt1
    public final void n1(Narrative narrative) {
        if (this.m) {
            return;
        }
        AllHighlightsFragment allHighlightsFragment = this.c;
        ((StoryViewerRouter) allHighlightsFragment.c0.getValue()).h(allHighlightsFragment.kn(), Collections.singletonList(new HighlightStoriesContainer(narrative, 0, 2, null)), fsk.M(narrative.b), null, (r42 & 16) != 0, MobileOfficialAppsConStoriesStat$ViewEntryPoint.NARRATIVE_SECTION, (r42 & 64) != 0 ? MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER : MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.NARRATIVES_LIST), null, (r42 & 512) != 0 ? null : null, new fu1(allHighlightsFragment), (r42 & 2048) != 0 ? StoryViewerRouter.InOutAnimation.PointToFullScreen : StoryViewerRouter.InOutAnimation.PointToFullScreen, (r42 & 4096) != 0 ? new com.vk.story.api.a() : null, -1, -1, (32768 & r42) != 0 ? null : null, (65536 & r42) != 0 ? null : null, (131072 & r42) != 0 ? null : null, (262144 & r42) != 0 ? null : null, (r42 & 524288) != 0 ? SystemClock.elapsedRealtime() : 0L);
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        dispose();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.zt1
    public final void u2() {
        AllHighlightsFragment allHighlightsFragment = this.c;
        String str = (String) allHighlightsFragment.a0.getValue();
        EmptyList emptyList = EmptyList.b;
        Bundle bundle = new Bundle();
        bundle.putParcelable("owner_id", this.d);
        bundle.putIntegerArrayList("EXTRA_STORY_IDS", p4g.q(emptyList));
        bundle.putString("ref", str);
        oz50 oz50Var = new oz50(HighlightEditFragment.class, null, bundle);
        oz50Var.s(true);
        oz50Var.g(8764, allHighlightsFragment);
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
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
