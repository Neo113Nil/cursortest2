package xsna;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.stories.model.DiscoverErrorLoadContainer;
import com.vk.dto.stories.model.DiscoverStubStoriesContainer;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.stat.scheme.MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import kotlin.NoWhenBranchMatchedException;
import xsna.dan;

/* compiled from: StoryViewDiscoverLoaderDelegate.kt */
/* loaded from: classes6.dex */
public final class bmm0 {
    public final com.vk.story.viewer.impl.presentation.stories.b a;
    public final q7m0 b;
    public String c;
    public boolean d;
    public String e;
    public io.reactivex.rxjava3.disposables.c f;

    public bmm0(com.vk.story.viewer.impl.presentation.stories.b bVar, q7m0 q7m0Var) {
        this.a = bVar;
        this.b = q7m0Var;
    }

    public static void d(bmm0 bmm0Var, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        boolean z = (i3 & 4) == 0;
        String str = bmm0Var.c;
        if (str == null) {
            return;
        }
        String str2 = bmm0Var.e;
        if (z || i - i2 <= 2) {
            bmm0Var.g(true);
            m9n m9nVar = m9n.b;
            io.reactivex.rxjava3.core.q a = m9n.a(6, str2, str);
            asu0 asu0Var = asu0.a;
            bmm0Var.f = a.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new k130(new b8j0(bmm0Var, 7), 23), new f5y(new qhg0(bmm0Var, 11), 27));
        }
    }

    public final void a(Throwable th) {
        if (th != null) {
            com.vk.metrics.eventtracking.b.a.a(th);
        }
        g(false);
        com.vk.story.viewer.impl.presentation.stories.b bVar = this.a;
        List<StoriesContainer> storiesContainer = bVar.getStoriesContainer();
        ArrayList<StoriesContainer> arrayList = storiesContainer != null ? new ArrayList<>(i7o0.a(storiesContainer)) : null;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                if (((StoriesContainer) it.next()) instanceof DiscoverErrorLoadContainer) {
                    return;
                }
            }
        }
        if (arrayList != null) {
            arrayList.add(new DiscoverErrorLoadContainer(null, null, 3, null));
        }
        bVar.S(arrayList, false);
        h();
    }

    public final void b(GetStoriesResponse getStoriesResponse) {
        String Ob;
        this.c = getStoriesResponse.d;
        com.vk.story.viewer.impl.presentation.stories.b bVar = this.a;
        List<StoriesContainer> storiesContainer = bVar.getStoriesContainer();
        ArrayList<StoriesContainer> arrayList = storiesContainer != null ? new ArrayList<>(i7o0.a(storiesContainer)) : new ArrayList<>();
        Iterator<StoriesContainer> it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next() instanceof DiscoverStubStoriesContainer) {
                break;
            } else {
                i++;
            }
        }
        if (i > -1) {
            DiscoverStubStoriesContainer discoverStubStoriesContainer = (DiscoverStubStoriesContainer) arrayList.get(i);
            if (discoverStubStoriesContainer.p == DiscoverStubStoriesContainer.State.NO_MORE_STORIES_AVAILABLE_STEP1) {
                discoverStubStoriesContainer.p = DiscoverStubStoriesContainer.State.NO_MORE_STORIES_AVAILABLE_STEP2;
            }
            while (arrayList.size() - 1 > i) {
                arrayList.remove(e43.h(arrayList));
            }
        }
        arrayList.addAll(getStoriesResponse.c);
        bVar.w = true;
        if (i != -1) {
            int i2 = 0;
            for (Object obj : arrayList) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    e43.t();
                    throw null;
                }
                StoriesContainer storiesContainer2 = (StoriesContainer) obj;
                if (i2 > i) {
                    storiesContainer2.k = Integer.valueOf(i2 - i);
                }
                i2 = i3;
            }
        }
        StoriesContainer storiesContainer3 = (StoriesContainer) j5g.b0(i + 1, arrayList);
        q7m0 q7m0Var = this.b;
        q7m0Var.j = false;
        q7m0Var.i = false;
        q7m0Var.h = false;
        q7m0Var.d();
        if (q7m0Var.c != null) {
            q7m0Var.d = new t170(storiesContainer3 != null ? storiesContainer3.Bb() : null, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.TypeNextStory.NEXT_CONTAINER_STORY);
        } else if (storiesContainer3 != null && (Ob = storiesContainer3.Ob()) != null) {
            q7m0Var.a = Ob;
        }
        q7m0Var.g = storiesContainer3;
        bVar.S(arrayList, false);
        h();
        g(false);
    }

    public final void c(GetStoriesResponse getStoriesResponse) {
        StoriesContainer storiesContainer;
        Integer num;
        this.c = getStoriesResponse.d;
        com.vk.story.viewer.impl.presentation.stories.b bVar = this.a;
        List<StoriesContainer> storiesContainer2 = bVar.getStoriesContainer();
        if (storiesContainer2 != null) {
            final fxi0 fxi0Var = new fxi0(5);
            storiesContainer2.removeIf(new Predicate() { // from class: xsna.amm0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((Boolean) fxi0.this.invoke(obj)).booleanValue();
                }
            });
        } else {
            storiesContainer2 = null;
        }
        int intValue = (storiesContainer2 == null || (storiesContainer = (StoriesContainer) j5g.k0(storiesContainer2)) == null || (num = storiesContainer.k) == null) ? -1 : num.intValue();
        int size = storiesContainer2 != null ? storiesContainer2.size() : 0;
        if (storiesContainer2 != null) {
            storiesContainer2.addAll(getStoriesResponse.c);
        }
        if (intValue != -1 && storiesContainer2 != null) {
            int i = 0;
            for (Object obj : storiesContainer2) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                StoriesContainer storiesContainer3 = (StoriesContainer) obj;
                if (i >= size) {
                    intValue++;
                    storiesContainer3.k = Integer.valueOf(intValue);
                }
                i = i2;
            }
        }
        bVar.S((ArrayList) storiesContainer2, false);
        g(false);
    }

    public final void e(int i, int i2, qo6 qo6Var) {
        io.reactivex.rxjava3.core.t B0;
        if (this.d) {
            return;
        }
        int i3 = 4;
        if (this.c != null) {
            d(this, i, i2, 4);
            return;
        }
        if (qo6Var instanceof dan) {
            g(true);
            dan danVar = (dan) qo6Var;
            String str = danVar.getStoriesContainer().o;
            this.e = str;
            m9n m9nVar = m9n.b;
            int i4 = 29;
            io.reactivex.rxjava3.internal.operators.observable.p1 p1Var = new io.reactivex.rxjava3.internal.operators.observable.p1(m9n.a(6, str, this.c).U(new hl30(new n0m0(3), 14)), new vvi0(new qcw(i4), i3));
            int i5 = dan.a.$EnumSwitchMapping$0[danVar.getStoriesContainer().p.ordinal()];
            if (i5 == 1 || i5 == 2) {
                B0 = io.reactivex.rxjava3.core.q.B0(1500L, TimeUnit.MILLISECONDS);
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                B0 = io.reactivex.rxjava3.core.q.T(0L);
            }
            io.reactivex.rxjava3.core.q m = io.reactivex.rxjava3.core.q.m(p1Var, B0, new ad0());
            asu0 asu0Var = asu0.a;
            this.f = m.r0(asu0Var.c()).Z(io.reactivex.rxjava3.core.g.b, asu0Var.d(), true).subscribe(new l8w(new fh1(24, this, qo6Var), i4), new fs00(new j37(1, this, bmm0.class, "handleErrorLoadingFirstPage", "handleErrorLoadingFirstPage(Ljava/lang/Throwable;)V", 0, 10), 27));
        }
    }

    public final void f() {
        View view;
        com.vk.story.viewer.impl.presentation.stories.b bVar = this.a;
        List<StoriesContainer> storiesContainer = bVar.getStoriesContainer();
        ArrayList<StoriesContainer> arrayList = storiesContainer != null ? new ArrayList<>(i7o0.a(storiesContainer)) : null;
        if (arrayList != null) {
            arrayList.removeIf(new h2n(new z410(28), 2));
        }
        ViewPager viewPager = bVar.getViewPager();
        if (viewPager != null) {
            int i = 0;
            while (true) {
                if (i >= viewPager.getChildCount()) {
                    view = null;
                    break;
                }
                int i2 = i + 1;
                view = viewPager.getChildAt(i);
                if (view == null) {
                    throw new IndexOutOfBoundsException();
                }
                if (view instanceof dan) {
                    break;
                } else {
                    i = i2;
                }
            }
            dan danVar = view instanceof dan ? (dan) view : null;
            if (danVar != null) {
                danVar.destroy();
            }
        }
        bVar.S(arrayList, true);
    }

    public final void g(boolean z) {
        View view;
        boolean z2 = !z;
        com.vk.story.viewer.impl.presentation.stories.b bVar = this.a;
        bVar.setAvailableSwipeRightClose(z2);
        ViewPager viewPager = bVar.getViewPager();
        if (viewPager != null) {
            int i = 0;
            while (true) {
                if (i >= viewPager.getChildCount()) {
                    view = null;
                    break;
                }
                int i2 = i + 1;
                view = viewPager.getChildAt(i);
                if (view == null) {
                    throw new IndexOutOfBoundsException();
                }
                if (view instanceof b2n) {
                    break;
                } else {
                    i = i2;
                }
            }
            b2n b2nVar = view instanceof b2n ? (b2n) view : null;
            if (b2nVar != null) {
                bwt0.p0(b2nVar.f, z);
                bwt0.p0(b2nVar.g, z2);
                bwt0.p0(b2nVar.h, z2);
            }
        }
        this.d = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        int i;
        ViewPager viewPager;
        xtw xtwVar;
        com.vk.story.viewer.impl.presentation.stories.b bVar = this.a;
        qo6 currentStoryView = bVar.getCurrentStoryView();
        if (!(currentStoryView instanceof dan)) {
            f();
            return;
        }
        ViewPager viewPager2 = bVar.getViewPager();
        View view = null;
        if (viewPager2 != null) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (!(i3 < viewPager2.getChildCount())) {
                    xtwVar = null;
                    break;
                }
                int i4 = i2 + 1;
                if (i2 < 0) {
                    e43.t();
                    throw null;
                }
                int i5 = i3 + 1;
                View childAt = viewPager2.getChildAt(i3);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                xtwVar = new xtw(i2, childAt);
                if (childAt instanceof dan) {
                    break;
                }
                i2 = i4;
                i3 = i5;
            }
            if (xtwVar != null) {
                i = xtwVar.a;
                viewPager = bVar.getViewPager();
                if (viewPager != null) {
                    try {
                        view = viewPager.getChildAt(i + 1);
                    } catch (Exception unused) {
                    }
                }
                if (view != null) {
                    view.setTranslationX((-iah0.f().widthPixels) + (-(bVar.getViewPager() != null ? r0.getPageMargin() : 0)));
                }
                if (view != null) {
                    view.setScaleX(1.0f);
                }
                if (view != null) {
                    view.setScaleY(1.0f);
                }
                ((dan) currentStoryView).animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(300L).withEndAction(new q86(this, 10)).start();
            }
        }
        i = 0;
        viewPager = bVar.getViewPager();
        if (viewPager != null) {
        }
        if (view != null) {
        }
        if (view != null) {
        }
        if (view != null) {
        }
        ((dan) currentStoryView).animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(300L).withEndAction(new q86(this, 10)).start();
    }
}
