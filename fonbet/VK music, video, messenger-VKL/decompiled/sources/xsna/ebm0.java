package xsna;

import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vk.stories.design.view.viewer.reactions.StoryReactionViewGroup;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* compiled from: StoryReactionsController.kt */
/* loaded from: classes6.dex */
public final class ebm0 {
    public final StoryBottomViewGroup a;
    public final nzl0 b;
    public final StoriesContainer c;
    public final p870 d;
    public final StoryEntry e;
    public final MobileOfficialAppsConStoriesStat$ViewEntryPoint f;
    public final bpn0 g;
    public final StoryReactionViewGroup h;
    public final io.reactivex.rxjava3.disposables.b i;
    public boolean j;
    public List<y0f0> k;
    public final zoq l;
    public final a m;
    public final Object n;
    public final Object o;

    public ebm0(StoryBottomViewGroup storyBottomViewGroup, nzl0 nzl0Var, StoriesContainer storiesContainer, p870 p870Var, StoryEntry storyEntry, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
        this.a = storyBottomViewGroup;
        this.b = nzl0Var;
        this.c = storiesContainer;
        this.d = p870Var;
        this.e = storyEntry;
        this.f = mobileOfficialAppsConStoriesStat$ViewEntryPoint;
        bpn0 bpn0Var = new bpn0(new w2j0(this, 3));
        this.g = new bpn0(new gkc0(this, 14));
        this.h = (StoryReactionViewGroup) storyBottomViewGroup.findViewById(R.id.reactions_view);
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.i = bVar;
        this.k = EmptyList.b;
        zoq zoqVar = new zoq(this, 2);
        this.l = zoqVar;
        a aVar = new a();
        this.m = aVar;
        x9l0 x9l0Var = new x9l0(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a2 = msy.a(lazyThreadSafetyMode, x9l0Var);
        this.n = a2;
        Lazy a3 = msy.a(lazyThreadSafetyMode, new fog0(1));
        this.o = a3;
        if (!((Boolean) a3.getValue()).booleanValue()) {
            StoriesFeatures storiesFeatures = StoriesFeatures.ST_REACTION_STICKER;
            storiesFeatures.getClass();
            if (!com.vk.toggle.b.A.a(storiesFeatures)) {
                return;
            }
        }
        if (!storyEntry.d0 || storiesContainer.Rb() || storyEntry.F) {
            return;
        }
        int i = 29;
        bVar.b(((fbm0) bpn0Var.getValue()).a().l(new z8(new t3v(this, 17), i)).m(asu0.a.d()).subscribe(new lav(new ksg0(this, 7), i), new pmu(new jvl0(1), 21)));
        p870Var.b(128, zoqVar);
        nzl0Var.g(aVar);
        nzl0Var.g(((jd80) a2.getValue()).j);
    }

    public final y0f0 a(Integer num) {
        Object obj = null;
        if (num == null) {
            return null;
        }
        Iterator<T> it = this.k.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((y0f0) next).a == num.intValue()) {
                obj = next;
                break;
            }
        }
        return (y0f0) obj;
    }

    /* compiled from: StoryReactionsController.kt */
    public static final class a implements m8m0 {
        public a() {
        }

        @Override // xsna.m8m0
        public final void a() {
            ebm0.this.h.d();
        }

        @Override // xsna.m8m0
        public final void b() {
        }

        @Override // xsna.m8m0
        public final void c() {
        }
    }
}
