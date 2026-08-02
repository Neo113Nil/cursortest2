package xsna;

import android.app.Activity;
import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.preference.Preference;
import com.vk.core.ui.floating_view.FloatingViewGesturesHelper;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.SituationalSuggest;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.stories.model.clickable.ClickableApp;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.view.VKImageView;
import com.vk.inappreview.InAppReviewConditionKey;
import com.vk.newsfeed.utils.NewsDebuggerPoint;
import com.vk.toggle.features.FeedFeatures;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.e3m;
import xsna.lrv0;
import xsna.vs60;
import xsna.xh60;
import xsna.yo60;

/* compiled from: NewsfeedMainEventsHandler.kt */
/* loaded from: classes4.dex */
public final class it60 {
    public final AtomicInteger a;
    public final io.reactivex.rxjava3.disposables.b b;

    public it60(AtomicInteger atomicInteger, io.reactivex.rxjava3.disposables.b bVar) {
        this.a = atomicInteger;
        this.b = bVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    public static void a(yo60.j jVar, xk2 xk2Var) {
        if (jVar instanceof yo60.j.b) {
            ((f170) xk2Var.b.getValue()).b();
        }
        fq60 fq60Var = (fq60) ((Lazy) xk2Var.c).getValue();
        gq60 gq60Var = (gq60) xk2Var.d;
        fq60Var.getClass();
        fq60.c(jVar, gq60Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v52, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v21, types: [xsna.lrv0$a, xsna.yc60] */
    /* JADX WARN: Type inference failed for: r3v72, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(ct60 ct60Var, FragmentImpl fragmentImpl, Activity activity, RecyclerView recyclerView, xh60 xh60Var) {
        ArrayList<StoriesContainer> arrayList;
        StoryEntry storyEntry;
        StoryEntry storyEntry2;
        ArrayList<StoriesContainer> arrayList2;
        ArrayList<StoriesContainer> arrayList3;
        ArrayList<StoriesContainer> arrayList4;
        StoryOwner.User zb;
        StoryOwner.User zb2;
        ArrayList<StoriesContainer> arrayList5;
        ClickableStickers clickableStickers;
        Object obj;
        int i = 0;
        if (xh60Var instanceof xh60.c) {
            b25 s = ((AuthBridgeComponent) ct60Var.v.getValue()).s();
            Object obj2 = ct60Var.s;
            if (myc0.f(s.P())) {
                FeedFeatures feedFeatures = FeedFeatures.FEED_YANDEX_AD;
                feedFeatures.getClass();
                if (com.vk.toggle.b.A.a(feedFeatures) && activity != null) {
                    this.b.b(new io.reactivex.rxjava3.internal.operators.completable.m(new ht60(i, activity, obj2)).q(asu0.a.d()).subscribe());
                }
            }
            s3q0 s3q0Var = s3q0.a;
            return;
        }
        if (xh60Var instanceof xh60.e) {
            yo60 yo60Var = ((xh60.e) xh60Var).a;
            if (!(yo60Var instanceof yo60.j)) {
                ((fq60) ct60Var.c.v.getValue()).b(ct60Var.c, fragmentImpl, activity, recyclerView, yo60Var);
                return;
            } else {
                a((yo60.j) yo60Var, ct60Var.A);
                s3q0 s3q0Var2 = s3q0.a;
                return;
            }
        }
        if (xh60Var instanceof xh60.f) {
            xh60.f fVar = (xh60.f) xh60Var;
            if (activity != null) {
                cu60 cu60Var = (cu60) ct60Var.q.getValue();
                cu60Var.getClass();
                ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
                com.vk.mvi.core.internal.executors.a.a(new defpackage.d0(cu60Var, activity, fVar, 4));
            }
            s3q0 s3q0Var3 = s3q0.a;
            return;
        }
        if (xh60Var instanceof xh60.b.d) {
            wc60 c = ct60Var.c();
            xh60.b.d dVar = (xh60.b.d) xh60Var;
            int i2 = dVar.a;
            int i3 = dVar.b;
            if (recyclerView != null) {
                c.getClass();
                LinearLayoutManager c2 = wc60.c(recyclerView);
                if (c2 != null) {
                    c2.K(i2, i3);
                }
            } else {
                c.getClass();
            }
            s3q0 s3q0Var4 = s3q0.a;
            return;
        }
        if (xh60Var instanceof xh60.b.a) {
            wc60 c3 = ct60Var.c();
            if (((xh60.b.a) xh60Var).a) {
                if (recyclerView != null) {
                    c3.getClass();
                    i = wc60.b(recyclerView);
                }
                c3.h = i;
                vhs vhsVar = c3.i;
                if (vhsVar != null) {
                    vhsVar.a(true);
                }
            } else {
                c3.d();
            }
            s3q0 s3q0Var5 = s3q0.a;
            return;
        }
        if (xh60Var instanceof xh60.b.C4002b) {
            wc60 c4 = ct60Var.c();
            int i4 = ((xh60.b.C4002b) xh60Var).a;
            c4.getClass();
            if (recyclerView != null) {
                recyclerView.postDelayed(new g8z(c4, recyclerView, i4), 200L);
            }
            s3q0 s3q0Var6 = s3q0.a;
            return;
        }
        if (xh60Var instanceof xh60.d) {
            xh60.d dVar2 = (xh60.d) xh60Var;
            ((y1q0) ct60Var.n.getValue()).c(new UiTrackingScreen(vrk0.a(dVar2.a, dVar2.c)), true);
            ((AtomicReference) ct60Var.c.a.b).set(dVar2.b);
            this.a.set(dVar2.a);
            ce60 ce60Var = ce60.b;
            int i5 = dVar2.a;
            ce60Var.getClass();
            if (o25.a().b()) {
                ce60.m = Integer.valueOf(i5);
                Preference.f("feed_newsfeed").edit().putInt("feed_list", i5).apply();
            } else {
                ce60.m = null;
            }
            s3q0 s3q0Var7 = s3q0.a;
            return;
        }
        if (xh60Var.equals(xh60.a.a)) {
            ((hm60) ct60Var.c.f0.getValue()).t = true;
            s3q0 s3q0Var8 = s3q0.a;
            return;
        }
        if (!(xh60Var instanceof xh60.h)) {
            if (!(xh60Var instanceof xh60.g)) {
                if (!(xh60Var instanceof xh60.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                xh60.b bVar = (xh60.b) xh60Var;
                ?? r1 = ct60Var.u;
                if (bVar instanceof xh60.b.c) {
                    xh60.b.c cVar = (xh60.b.c) bVar;
                    ((wc60) r1.getValue()).n = cVar.a;
                    ((wc60) r1.getValue()).o = cVar.b;
                }
                s3q0 s3q0Var9 = s3q0.a;
                return;
            }
            final ad60 ad60Var = (ad60) ct60Var.r.getValue();
            xh60.g gVar = (xh60.g) xh60Var;
            ad60Var.getClass();
            if (gVar instanceof ai60) {
                ai60 ai60Var = (ai60) gVar;
                ViewGroup viewGroup = ad60Var.e;
                if (viewGroup != null && ad60Var.d == null) {
                    Context context = viewGroup.getContext();
                    gsr gsrVar = new gsr(context, null, 0);
                    TextPaint textPaint = new TextPaint();
                    View.inflate(context, R.layout.view_floating_placeholder, gsrVar);
                    gsrVar.setBackgroundResource(R.drawable.bg_floating_placeholder);
                    e3m.a aVar = e3m.a;
                    gsrVar.setForeground(m33.a(R.drawable.highlight_icon_white_unbounded, context));
                    gsrVar.g = (VKImageView) gsrVar.findViewById(R.id.floating_placeholder_circle_image);
                    gsrVar.h = (VKImageView) gsrVar.findViewById(R.id.floating_placeholder_square_image);
                    gsrVar.c = (TextView) gsrVar.findViewById(R.id.floating_placeholder_text);
                    gsrVar.d = (TextView) gsrVar.findViewById(R.id.floating_placeholder_action_text);
                    ImageView imageView = (ImageView) gsrVar.findViewById(R.id.floating_placeholder_close_button);
                    gsrVar.e = imageView;
                    gsrVar.f = gsrVar.findViewById(R.id.floating_placeholder_close_background);
                    if (imageView != null) {
                        imageView.setOnClickListener(gsrVar);
                    }
                    gsrVar.setOnClickListener(gsrVar);
                    com.vk.typography.b.c(textPaint, context, FontFamily.REGULAR, Float.valueOf(context.getResources().getDimensionPixelSize(R.dimen.newsfeed_floating_placeholder_text_size)), TextSizeUnit.PX);
                    int i6 = FloatingViewGesturesHelper.f;
                    FloatingViewGesturesHelper.a.C0787a c0787a = new FloatingViewGesturesHelper.a.C0787a();
                    c0787a.b = new t1e(gsrVar, 20);
                    c0787a.c = new m4g(gsrVar, 20);
                    c0787a.d = new wze(gsrVar, 25);
                    c0787a.e = 0.25f;
                    c0787a.f = 0.4f;
                    c0787a.g = FloatingViewGesturesHelper.SwipeDirection.VerticalBottom;
                    gsrVar.i = c0787a.a(gsrVar);
                    bwt0.p0(gsrVar, false);
                    CoordinatorLayout.f fVar2 = new CoordinatorLayout.f(-1, -2);
                    fVar2.c = 80;
                    fVar2.setMargins(cn70.b(8), cn70.b(8), cn70.b(8), cn70.b(8));
                    if (viewGroup instanceof CoordinatorLayout) {
                        viewGroup.addView(gsrVar, fVar2);
                    }
                    ad60Var.d = gsrVar;
                }
                final SituationalSuggest situationalSuggest = ai60Var.a;
                if (situationalSuggest == null) {
                    ad60Var.b();
                    gsr gsrVar2 = ad60Var.d;
                    if (gsrVar2 != null) {
                        gsrVar2.setIsVisible(false);
                    }
                } else {
                    yc60 yc60Var = ad60Var.f;
                    if (yc60Var != null) {
                        dhr0.a.d(yc60Var);
                    }
                    ?? r3 = new lrv0.a() { // from class: xsna.yc60
                        @Override // xsna.lrv0.a
                        public final void xb() {
                            ad60.this.a(situationalSuggest);
                        }
                    };
                    ad60Var.f = r3;
                    dhr0.a.a(r3);
                    gsr gsrVar3 = ad60Var.d;
                    if (gsrVar3 != null) {
                        gsrVar3.setPresenter((fsr) new zc60(ad60Var, situationalSuggest));
                    }
                    gsr gsrVar4 = ad60Var.d;
                    if (gsrVar4 != null) {
                        gsrVar4.setIsVisible(true);
                    }
                    ad60Var.a(situationalSuggest);
                    int i7 = ad60Var.h;
                    int i8 = ad60Var.g;
                    ad60Var.h = i7;
                    ad60Var.g = i8;
                    gsr gsrVar5 = ad60Var.d;
                    if (gsrVar5 != null) {
                        gsrVar5.setTranslationY((-i8) - i7);
                    }
                }
            } else if (gVar instanceof yh60) {
                gsr gsrVar6 = ad60Var.d;
                if (gsrVar6 != null) {
                    gsrVar6.setIsVisible(false);
                }
            } else {
                if (!(gVar instanceof zh60)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (activity != null) {
                    io.reactivex.rxjava3.internal.operators.observable.m1 w = emi.w(activity, ((zh60) gVar).a, (String) ad60Var.c.invoke());
                    if (w != null) {
                        ad60Var.b.b(itg0.m(w));
                    }
                    ad60Var.b();
                    gsr gsrVar7 = ad60Var.d;
                    if (gsrVar7 != null) {
                        gsrVar7.setIsVisible(false);
                    }
                }
            }
            s3q0 s3q0Var10 = s3q0.a;
            return;
        }
        xh60.h hVar = (xh60.h) xh60Var;
        d070 f = ct60Var.f();
        f.getClass();
        if (hVar instanceof xh60.h.g) {
            xh60.h.g gVar2 = (xh60.h.g) hVar;
            if (gVar2.a == 0) {
                ts60 ts60Var = f.c;
                NewsDebuggerPoint newsDebuggerPoint = NewsDebuggerPoint.ChangeList;
                ts60Var.T();
                f.a().f(gVar2.b);
            }
        } else if (hVar instanceof xh60.h.b) {
            boolean z = ((xh60.h.b) hVar).a;
            if (BuildInfo.s()) {
                io.reactivex.rxjava3.core.a b = fsk.c.b(InAppReviewConditionKey.REFRESH_FEED_3_TIMES_AND_WATCH_GARLAND, on00.f(new Pair("garland_trigger_reset", Boolean.valueOf(z))));
                int i9 = kwg0.a;
                f.b.b(b.subscribe(io.reactivex.rxjava3.internal.functions.a.c, new hwg0()));
            }
        } else if (hVar instanceof xh60.h.c) {
            RecyclerView recyclerView2 = f.x;
            cht chtVar = f.k;
            if (chtVar != null && recyclerView2 != null) {
                recyclerView2.removeOnScrollListener(chtVar);
            }
            cht chtVar2 = new cht(new f550(f, 5));
            f.k = chtVar2;
            if (recyclerView2 != null) {
                recyclerView2.addOnScrollListener(chtVar2);
            }
        } else if (hVar instanceof xh60.h.d) {
            f.n = true;
        } else if (hVar instanceof xh60.h.a) {
            xh60.h.a aVar2 = (xh60.h.a) hVar;
            k070 k070Var = aVar2.b;
            axl0 axl0Var = aVar2.a;
            GetStoriesResponse getStoriesResponse = k070Var.a;
            if (getStoriesResponse != null && (arrayList5 = getStoriesResponse.c) != null) {
                Iterator<StoriesContainer> it = arrayList5.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    StoriesContainer next = it.next();
                    if (next.Eb()) {
                        Iterator<StoryEntry> it2 = next.g.iterator();
                        while (it2.hasNext()) {
                            StoryEntry next2 = it2.next();
                            if (next2.c == axl0Var.a && (clickableStickers = next2.X) != null) {
                                List<ClickableSticker> list = clickableStickers.d;
                                if (list != null) {
                                    Iterator<T> it3 = list.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            obj = null;
                                            break;
                                        }
                                        obj = it3.next();
                                        ClickableSticker clickableSticker = (ClickableSticker) obj;
                                        if ((clickableSticker instanceof ClickableApp) && clickableSticker.b == axl0Var.b) {
                                            break;
                                        }
                                    }
                                    ClickableSticker clickableSticker2 = (ClickableSticker) obj;
                                    if (clickableSticker2 != null) {
                                        ClickableApp clickableApp = clickableSticker2 instanceof ClickableApp ? (ClickableApp) clickableSticker2 : null;
                                        if (clickableApp != null) {
                                            clickableApp.g = false;
                                        }
                                        z2 = true;
                                    }
                                }
                                ClickableStickers clickableStickers2 = next2.X;
                                if (clickableStickers2 != null) {
                                    clickableStickers2.Ab();
                                }
                            }
                        }
                    }
                }
                if (z2) {
                    f.a.a(new vs60.i.e(aVar2.b));
                }
            }
        } else if (hVar instanceof xh60.h.C4003h) {
            xh60.h.C4003h c4003h = (xh60.h.C4003h) hVar;
            k070 k070Var2 = c4003h.b;
            ywm0 ywm0Var = c4003h.a;
            GetStoriesResponse getStoriesResponse2 = k070Var2.a;
            if (getStoriesResponse2 != null && (arrayList4 = getStoriesResponse2.c) != null) {
                int size = arrayList4.size();
                boolean z3 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    StoriesContainer storiesContainer = arrayList4.get(i10);
                    CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList = storiesContainer.g;
                    if (copyOnWriteArrayList != null) {
                        int size2 = copyOnWriteArrayList.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            if (epx.f(copyOnWriteArrayList.get(i11).d, ywm0Var.b)) {
                                StoryOwner storyOwner = storiesContainer.b;
                                UserProfile userProfile = (storyOwner == null || (zb2 = storyOwner.zb()) == null) ? null : zb2.c;
                                if (userProfile != null) {
                                    userProfile.V = ywm0Var.a;
                                }
                                if (!ywm0Var.a && userProfile != null) {
                                    userProfile.U = true;
                                }
                                z3 = true;
                            }
                        }
                    } else {
                        Iterator<StoryEntry> it4 = copyOnWriteArrayList.iterator();
                        while (it4.hasNext()) {
                            if (epx.f(it4.next().d, ywm0Var.b)) {
                                StoryOwner storyOwner2 = storiesContainer.b;
                                UserProfile userProfile2 = (storyOwner2 == null || (zb = storyOwner2.zb()) == null) ? null : zb.c;
                                if (userProfile2 != null) {
                                    userProfile2.V = ywm0Var.a;
                                }
                                if (!ywm0Var.a && userProfile2 != null) {
                                    userProfile2.U = true;
                                }
                                z3 = true;
                            }
                        }
                    }
                }
                if (z3) {
                    f.a.a(new vs60.i.e(c4003h.b));
                }
            }
        } else if (hVar instanceof xh60.h.i) {
            xh60.h.i iVar = (xh60.h.i) hVar;
            k070 k070Var3 = iVar.b;
            UserProfile userProfile3 = iVar.a;
            GetStoriesResponse getStoriesResponse3 = k070Var3.a;
            if (getStoriesResponse3 != null && (arrayList3 = getStoriesResponse3.c) != null) {
                Iterator<StoriesContainer> it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    StoriesContainer next3 = it5.next();
                    if (epx.f(next3.Ab(), userProfile3.c)) {
                        StoryOwner storyOwner3 = next3.b;
                        if (storyOwner3 instanceof StoryOwner.User) {
                            storyOwner3 = new StoryOwner.User(userProfile3, ((StoryOwner.User) storyOwner3).d);
                        } else if (storyOwner3 instanceof StoryOwner.Owner) {
                            Owner l0 = userProfile3.l0();
                            ((StoryOwner.Owner) storyOwner3).getClass();
                            storyOwner3 = new StoryOwner.Owner(l0);
                        }
                        next3.b = storyOwner3;
                        i = 1;
                    }
                }
                if (i != 0) {
                    f.a.a(new vs60.i.e(iVar.b));
                }
            }
        } else if (hVar instanceof xh60.h.e) {
            xh60.h.e eVar = (xh60.h.e) hVar;
            GetStoriesResponse getStoriesResponse4 = eVar.b.a;
            if (getStoriesResponse4 != null && (arrayList2 = getStoriesResponse4.c) != null) {
                Iterator<StoriesContainer> it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    StoriesContainer next4 = it6.next();
                    if (next4.Eb()) {
                        Iterator<StoryEntry> it7 = next4.g.iterator();
                        while (it7.hasNext()) {
                            StoryEntry next5 = it7.next();
                            if (eVar.a.contains(next5)) {
                                next5.h = true;
                                i = 1;
                            }
                        }
                    }
                }
                if (i != 0) {
                    f.a.a(new vs60.i.e(eVar.b));
                    RecyclerView recyclerView3 = f.x;
                    if (recyclerView3 != null) {
                        wjf0.c(recyclerView3, new yu60(f, 1));
                    }
                }
            }
        } else if (hVar instanceof bi60) {
            bi60 bi60Var = (bi60) hVar;
            k070 k070Var4 = bi60Var.b;
            zjm0 zjm0Var = bi60Var.a;
            GetStoriesResponse getStoriesResponse5 = k070Var4.a;
            if (getStoriesResponse5 != null && (arrayList = getStoriesResponse5.c) != null) {
                int size3 = arrayList.size();
                int i12 = 0;
                loop9: while (true) {
                    if (i12 >= size3) {
                        break;
                    }
                    CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList2 = arrayList.get(i12).g;
                    if (copyOnWriteArrayList2 != null) {
                        int size4 = copyOnWriteArrayList2.size();
                        for (int i13 = 0; i13 < size4; i13++) {
                            StoryEntry storyEntry3 = copyOnWriteArrayList2.get(i13);
                            if (storyEntry3.b && storyEntry3.c == zjm0Var.a && (storyEntry2 = zjm0Var.g) != null) {
                                storyEntry3.y = zjm0Var.f;
                                storyEntry3.Xb(storyEntry2);
                                break loop9;
                            }
                        }
                        i12++;
                    } else {
                        Iterator<StoryEntry> it8 = copyOnWriteArrayList2.iterator();
                        while (it8.hasNext()) {
                            StoryEntry next6 = it8.next();
                            if (next6.b && next6.c == zjm0Var.a && (storyEntry = zjm0Var.g) != null) {
                                next6.y = zjm0Var.f;
                                next6.Xb(storyEntry);
                                break loop9;
                            }
                        }
                        i12++;
                    }
                }
            }
            f.a.a(new vs60.i.e(bi60Var.b));
        } else {
            if (!(hVar instanceof xh60.h.f)) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator<rov> it9 = f.o.iterator();
            while (it9.hasNext()) {
                rov next7 = it9.next();
                if (next7 != null) {
                    if (next7 instanceof rql0) {
                        ((rql0) next7).q6();
                    }
                    s3q0 s3q0Var11 = s3q0.a;
                } else {
                    it9.remove();
                }
            }
        }
        s3q0 s3q0Var12 = s3q0.a;
    }
}
