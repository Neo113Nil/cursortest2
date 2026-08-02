package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.viewpager2.widget.ViewPager2;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.stories.design.view.StoryProgressView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;
import xsna.iut0;

/* compiled from: CommunityLiveCoverPagerHolder.kt */
/* loaded from: classes5.dex */
public final class w8h {
    public final FrameLayout a;
    public gzs<s3q0> b;
    public final ArrayList<View> c;
    public final ArrayList<View> d;
    public boolean e;
    public final StoryProgressView f;
    public final io.reactivex.rxjava3.disposables.g g;
    public c h;
    public t8h i;
    public r8h j;
    public c8h k;
    public final ViewPager2 l;
    public final d m;
    public boolean n;

    /* compiled from: CommunityLiveCoverPagerHolder.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            w8h w8hVar = w8h.this;
            ViewPager2 viewPager2 = w8hVar.l;
            viewPager2.b(w8hVar.m);
            viewPager2.requestLayout();
            r8h r8hVar = w8hVar.j;
            c8h c8hVar = w8hVar.k;
            if (r8hVar == null || c8hVar == null) {
                return;
            }
            w8h.a(w8hVar, r8hVar, c8hVar, 0, 4);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            w8h w8hVar = w8h.this;
            if (w8hVar.e) {
                return;
            }
            w8hVar.l.g(w8hVar.m);
            jyg b = w8hVar.b();
            if (b != null) {
                com.vk.profile.community.impl.ui.cover.redesign.delegate.a aVar = b.q;
                if (aVar != null) {
                    aVar.g(true);
                }
                com.vk.profile.community.impl.ui.cover.redesign.delegate.b bVar = b.r;
                if (bVar != null) {
                    bVar.f(true);
                }
                b.q = null;
                b.r = null;
            }
        }
    }

    /* compiled from: CommunityLiveCoverPagerHolder.kt */
    public static final class b extends m.b {
        public final List<gwh<?, ?>> b;
        public final List<gwh<?, ?>> c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends gwh<?, ?>> list, List<? extends gwh<?, ?>> list2) {
            this.b = list;
            this.c = list2;
        }

        @Override // androidx.recyclerview.widget.m.b
        public final boolean areContentsTheSame(int i, int i2) {
            return epx.f(this.b.get(i), this.c.get(i2));
        }

        @Override // androidx.recyclerview.widget.m.b
        public final boolean areItemsTheSame(int i, int i2) {
            gwh<?, ?> gwhVar = this.b.get(i);
            gwh<?, ?> gwhVar2 = this.c.get(i2);
            return gwhVar.getClass().equals(gwhVar2.getClass()) && epx.f(gwhVar2.getData(), gwhVar.getData());
        }

        @Override // androidx.recyclerview.widget.m.b
        public final int getNewListSize() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.m.b
        public final int getOldListSize() {
            return this.b.size();
        }
    }

    /* compiled from: CommunityLiveCoverPagerHolder.kt */
    public static final class c {
        public final boolean a;
        public final boolean b;

        public c() {
            this(true, true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VisibilityState(hasFocus=");
            sb.append(this.a);
            sb.append(", isResumed=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public c(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    public w8h(FrameLayout frameLayout) {
        this.a = frameLayout;
        ArrayList<View> arrayList = new ArrayList<>();
        this.c = arrayList;
        ArrayList<View> arrayList2 = new ArrayList<>();
        this.d = arrayList2;
        StoryProgressView storyProgressView = new StoryProgressView(frameLayout.getContext());
        storyProgressView.b = iah0.a(12);
        storyProgressView.c = iah0.a(2.5f);
        storyProgressView.setFillPreviousSections(false);
        this.f = storyProgressView;
        this.g = new io.reactivex.rxjava3.disposables.g();
        this.h = new c(true, true);
        ViewPager2 viewPager2 = new ViewPager2(frameLayout.getContext());
        viewPager2.setPageTransformer(new u8h());
        viewPager2.setOffscreenPageLimit(1);
        dc80 dc80Var = new dc80(viewPager2.getContext(), 100, new y8h(this, viewPager2));
        dc80Var.l = new x8h(this);
        dc80Var.k.getClass();
        viewPager2.setOnTouchListener(dc80Var);
        viewPager2.setImportantForAccessibility(2);
        this.l = viewPager2;
        this.m = new d();
        frameLayout.setBackgroundColor(-16777216);
        viewPager2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(viewPager2, new FrameLayout.LayoutParams(-1, -1));
        View view = new View(frameLayout.getContext());
        Context context = view.getContext();
        e3m.a aVar = e3m.a;
        view.setBackground(m33.a(R.drawable.scrim_top_36percent_120, context));
        arrayList2.add(view);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, iah0.a(120));
        layoutParams.gravity = 48;
        s3q0 s3q0Var = s3q0.a;
        frameLayout.addView(view, layoutParams);
        View view2 = new View(frameLayout.getContext());
        view2.setBackground(m33.a(R.drawable.scrim_bottom_48percent_240, view2.getContext()));
        arrayList.add(view2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, iah0.a(PsExtractor.VIDEO_STREAM_MASK));
        layoutParams2.gravity = 80;
        frameLayout.addView(view2, layoutParams2);
        frameLayout.addView(storyProgressView, new FrameLayout.LayoutParams(-1, -2, 1));
        u080 u080Var = new u080() { // from class: xsna.v8h
            @Override // xsna.u080
            public final bqx0 b(View view3, bqx0 bqx0Var) {
                f4m.t(iah0.a(4) + wqx0.a(bqx0Var), w8h.this.f);
                return bqx0.b;
            }
        };
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(storyProgressView, u080Var);
        viewPager2.addOnAttachStateChangeListener(new a());
    }

    public static void a(w8h w8hVar, r8h r8hVar, c8h c8hVar, int i, int i2) {
        ViewPager2 viewPager2;
        r8h r8hVar2;
        w8h w8hVar2;
        boolean z;
        r8h r8hVar3;
        c8h c8hVar2;
        ArrayList arrayList;
        List<gwh<?, ?>> list;
        int i3 = (i2 & 4) != 0 ? r8hVar.c : i;
        boolean z2 = (i2 & 8) == 0;
        StoryProgressView storyProgressView = w8hVar.f;
        List<gwh<?, ?>> list2 = r8hVar.a;
        boolean z3 = r8hVar.k;
        ViewPager2 viewPager22 = w8hVar.l;
        viewPager22.setUserInputEnabled(r8hVar.f && !z3);
        r8h r8hVar4 = w8hVar.j;
        w8hVar.j = r8hVar;
        w8hVar.k = c8hVar;
        if (w8hVar.i == null) {
            r8hVar2 = r8hVar4;
            viewPager2 = viewPager22;
            z = z3;
            w8hVar2 = w8hVar;
            r8hVar3 = r8hVar;
            c8hVar2 = c8hVar;
            t8h t8hVar = new t8h(r8hVar.a, r8hVar3, c8hVar2, new z8h(2, w8hVar, w8h.class, "updateProgress", "updateProgress(IF)V", 0), new k3b(0, w8hVar, w8h.class, "onTap", "onTap()V", 0, 2));
            w8hVar2.i = t8hVar;
            viewPager2.setAdapter(t8hVar);
        } else {
            viewPager2 = viewPager22;
            r8hVar2 = r8hVar4;
            w8hVar2 = w8hVar;
            z = z3;
            r8hVar3 = r8hVar;
            c8hVar2 = c8hVar;
        }
        t8h t8hVar2 = w8hVar2.i;
        if (t8hVar2 != null) {
            r8h r8hVar5 = t8hVar2.d;
            t8hVar2.d = r8hVar3;
            int i4 = r8hVar3.c;
            t8hVar2.e = c8hVar2;
            if (!z2) {
                boolean z4 = r8hVar5.g;
                int i5 = r8hVar5.c;
                if (z4 == r8hVar3.g && (!z || i5 == i4)) {
                    if ((!epx.f(r8hVar5.a, list2) || i5 == i4) && r8hVar5.d == r8hVar3.d) {
                        List<? extends gwh<?, ?>> list3 = t8hVar2.c;
                        m.d a2 = androidx.recyclerview.widget.m.a(new b(list3, list2), true);
                        t8hVar2.c = list2;
                        a2.c(new c9h(r8hVar3, list3, t8hVar2));
                    } else {
                        t8hVar2.notifyItemChanged(i4);
                    }
                }
            }
            t8hVar2.c = list2;
            int i6 = i4 - 2;
            if (i6 < 0) {
                i6 = 0;
            }
            t8hVar2.notifyItemRangeChanged(i6, i4 + 2);
        }
        storyProgressView.setSectionCount(r8hVar3.l);
        storyProgressView.setCurrentSection(r8hVar3.i);
        if (viewPager2.getCurrentItem() != i3) {
            r8h r8hVar6 = r8hVar2;
            boolean z5 = r8hVar6 == null;
            List<gwh<?, ?>> list4 = list2;
            ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
            Iterator<T> it = list4.iterator();
            while (it.hasNext()) {
                arrayList2.add(((gwh) it.next()).getData());
            }
            if (r8hVar6 == null || (list = r8hVar6.a) == null) {
                arrayList = null;
            } else {
                List<gwh<?, ?>> list5 = list;
                arrayList = new ArrayList(c5g.u(list5, 10));
                Iterator<T> it2 = list5.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((gwh) it2.next()).getData());
                }
            }
            viewPager2.e(i3, (z5 || !arrayList2.equals(arrayList) || z) ? false : true);
        }
    }

    public final jyg b() {
        ViewPager2 viewPager2 = this.l;
        View a2 = mxt0.a(0, viewPager2);
        RecyclerView recyclerView = a2 instanceof RecyclerView ? (RecyclerView) a2 : null;
        RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(viewPager2.getCurrentItem()) : null;
        if (findViewHolderForAdapterPosition instanceof jyg) {
            return (jyg) findViewHolderForAdapterPosition;
        }
        return null;
    }

    public final Float c() {
        q8h q8hVar;
        jyg b2 = b();
        if (b2 != null) {
            gwh<?, ?> gwhVar = b2.s;
            if (gwhVar instanceof sjw) {
                q8hVar = b2.q;
            } else if (gwhVar instanceof pqs0) {
                q8hVar = b2.r;
            } else {
                if (gwhVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                q8hVar = null;
            }
            if (q8hVar != null) {
                return q8hVar.getCurrentProgress();
            }
        }
        return null;
    }

    public final void d() {
        jyg b2 = b();
        if (b2 != null) {
            com.vk.profile.community.impl.ui.cover.redesign.delegate.a aVar = b2.q;
            if (aVar != null) {
                aVar.C(false);
            }
            com.vk.profile.community.impl.ui.cover.redesign.delegate.b bVar = b2.r;
            if (bVar != null) {
                bVar.C(false);
            }
        }
    }

    public final void e(Float f) {
        jyg b2 = b();
        if (b2 != null) {
            b2.W5(f);
            com.vk.profile.community.impl.ui.cover.redesign.delegate.a aVar = b2.q;
            if (aVar != null || b2.r != null) {
                if (aVar != null) {
                    aVar.e();
                }
                com.vk.profile.community.impl.ui.cover.redesign.delegate.b bVar = b2.r;
                if (bVar != null) {
                    bVar.e();
                    return;
                }
                return;
            }
            gwh<?, ?> gwhVar = b2.s;
            r8h r8hVar = b2.m;
            c8h c8hVar = b2.n;
            if (gwhVar == null || r8hVar == null || c8hVar == null) {
                return;
            }
            b2.V5(gwhVar, r8hVar, c8hVar);
        }
    }

    /* compiled from: CommunityLiveCoverPagerHolder.kt */
    public static final class d extends ViewPager2.g {
        public Integer d;

        public d() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
        
            if (r4.intValue() == r0.l.getCurrentItem()) goto L13;
         */
        @Override // androidx.viewpager2.widget.ViewPager2.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onPageScrollStateChanged(int i) {
            w8h w8hVar = w8h.this;
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                w8hVar.d();
                return;
            }
            Integer num = this.d;
            if (num != null) {
            }
            w8hVar.e(null);
            Integer num2 = this.d;
            if (num2 != null) {
                int intValue = num2.intValue();
                c8h c8hVar = w8hVar.k;
                if (c8hVar != null) {
                    c8hVar.a.invoke(new CommunityProfileAction.g.d.b(intValue));
                }
                this.d = null;
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageSelected(int i) {
            this.d = Integer.valueOf(i);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrolled(int i, float f, int i2) {
        }
    }
}
