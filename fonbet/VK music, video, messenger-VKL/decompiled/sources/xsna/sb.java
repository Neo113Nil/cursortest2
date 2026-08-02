package xsna;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh;
import com.vk.catalog2.common.ui.mvp.holder.header.ExpandableVkSearchView;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import com.vk.core.view.components.tabs.Tab$Mode;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.friends.impl.friends.presentation.fragment.AbsFriendsFragment;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.time.Instant;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import one.video.calls.sdk_private.al;
import one.video.calls.sdk_private.bE;
import one.video.calls.sdk_private.bF;
import one.video.calls.sdk_private.bx;
import ru.ok.android.webrtc.Call;
import ru.ok.media.ConnectionBenchmark;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class sb implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [kotlin.jvm.internal.Lambda, xsna.gzs] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                A a = ((AbsFriendsFragment) this.c).i0;
                if (a != 0) {
                    a.notifyDataSetChanged();
                    return;
                }
                return;
            case 1:
                im1 im1Var = (im1) this.c;
                im1Var.i.unregisterContentObserver(im1Var.f);
                return;
            case 2:
                yj3 yj3Var = (yj3) this.c;
                RecyclerView recyclerView = yj3Var.b;
                MotionEvent motionEvent = yj3Var.t;
                if (motionEvent == null) {
                    return;
                }
                View findChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
                RecyclerView.e0 childViewHolder = findChildViewUnder != null ? recyclerView.getChildViewHolder(findChildViewUnder) : null;
                if (childViewHolder != null) {
                    jsx0 jsx0Var = childViewHolder instanceof jsx0 ? (jsx0) childViewHolder : null;
                    if (jsx0Var == null || !jsx0Var.H4()) {
                        return;
                    }
                    if (yj3Var.r != 0) {
                        throw new IllegalStateException("Preview vh is not null!");
                    }
                    yj3Var.q = true;
                    if (yj3Var.m) {
                        awt0.p(childViewHolder.itemView);
                    }
                    LinkedHashSet linkedHashSet = yj3Var.k;
                    int rawX = (int) motionEvent.getRawX();
                    int rawY = (int) motionEvent.getRawY();
                    P p = (P) childViewHolder;
                    if (childViewHolder instanceof ytx0) {
                        ytx0 ytx0Var = (ytx0) childViewHolder;
                        if (ytx0Var.w1() && ytx0Var.T5(yj3Var.d).contains(rawX, rawY)) {
                            yj3Var.t(p);
                            yj3Var.r = p;
                            return;
                        }
                    }
                    if (childViewHolder instanceof usx0) {
                        usx0 usx0Var = (usx0) childViewHolder;
                        if (usx0Var.M1()) {
                            List<Rect> p2 = usx0Var.p2();
                            if (!(p2 instanceof Collection) || !p2.isEmpty()) {
                                Iterator<T> it = p2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((Rect) it.next()).contains(rawX, rawY)) {
                                            List<Rect> V3 = usx0Var.V3();
                                            if (!(V3 instanceof Collection) || !V3.isEmpty()) {
                                                Iterator<T> it2 = V3.iterator();
                                                while (it2.hasNext()) {
                                                    if (((Rect) it2.next()).contains(rawX, rawY)) {
                                                    }
                                                }
                                            }
                                            yj3Var.c();
                                            childViewHolder.itemView.setLongClickable(false);
                                            yj3Var.o(p);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (childViewHolder instanceof otx0) {
                        yj3Var.a(childViewHolder);
                        if (yj3Var.k(linkedHashSet.size())) {
                            recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
                            int a2 = yj3Var.a(childViewHolder);
                            yj3Var.n = Integer.valueOf(a2);
                            yj3Var.o = Integer.valueOf(a2);
                            linkedHashSet.add(Integer.valueOf(a2));
                            yj3Var.s(a2, p);
                            return;
                        }
                    }
                    yj3Var.q(p);
                    return;
                }
                return;
            case 3:
                ((Call) this.c).h();
                return;
            case 4:
                ((ConnectionBenchmark) this.c).lambda$start$0();
                return;
            case 5:
                com.vk.im.ui.components.msg_list.a aVar = (com.vk.im.ui.components.msg_list.a) this.c;
                aVar.K.removeCallbacksAndMessages(com.vk.im.ui.components.msg_list.a.R0);
                aVar.T.d();
                return;
            case 6:
                ((gzs) this.c).invoke();
                return;
            case 7:
                j070 j070Var = (j070) this.c;
                j070Var.b.g();
                ((de60) j070Var.n.getValue()).a();
                if (j070Var.i) {
                    return;
                }
                if (j070Var.g == 1.0f) {
                    return;
                }
                long c = an10.c(j070Var.h * r1);
                j070Var.h = c;
                j070Var.b(c, c);
                return;
            case 8:
                iy70 iy70Var = (iy70) this.c;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"OkHttpNetworkNewFetcher", "Run fetchNext in idle callback"});
                }
                iy70Var.h();
                return;
            case 9:
                PaginatedGridListVh paginatedGridListVh = (PaginatedGridListVh) this.c;
                ib80 ib80Var = paginatedGridListVh.B;
                RecyclerPaginatedView recyclerPaginatedView = paginatedGridListVh.n;
                if (recyclerPaginatedView == null) {
                    recyclerPaginatedView = null;
                }
                RecyclerView recyclerView2 = recyclerPaginatedView.getRecyclerView();
                if (ib80Var.o) {
                    return;
                }
                ib80Var.f = recyclerView2;
                ib80Var.o = true;
                ib80Var.n = false;
                ib80Var.j.postDelayed(ib80Var.r, 300L);
                return;
            case 10:
                xia0 xia0Var = (xia0) this.c;
                EditText editText = xia0Var.g;
                if (editText == null) {
                    editText = null;
                }
                mhy.j(editText);
                d98 d98Var = xia0Var.l;
                if (d98Var != null) {
                    d98Var.c.requestApplyInsets();
                    return;
                }
                return;
            case 11:
                View view = (View) this.c;
                view.requestLayout();
                view.invalidate();
                return;
            case 12:
                ((Lambda) this.c).invoke();
                return;
            case 13:
                ExpandableVkSearchView expandableVkSearchView = ((ToolbarVh) this.c).I;
                if (expandableVkSearchView != null) {
                    expandableVkSearchView.setExpanded(false);
                    return;
                }
                return;
            case 14:
                VkTabs vkTabs = (VkTabs) this.c;
                vkTabs.setMode(Tab$Mode.Default);
                vkTabs.setMode(Tab$Mode.Secondary);
                return;
            default:
                one.video.calls.sdk_private.bx bxVar = (one.video.calls.sdk_private.bx) this.c;
                if (bxVar.h) {
                    Instant instant = bxVar.a.instant();
                    if (bxVar.g.plusMillis(bxVar.d).isBefore(instant)) {
                        if (bxVar.g.plusMillis(bxVar.f.getAsInt() * 3).isBefore(instant)) {
                            bxVar.b.shutdown();
                            bE bEVar = bxVar.e;
                            if (bEVar.p == bF.f.d || bEVar.p == bF.f.e) {
                                return;
                            }
                            bEVar.h(new one.video.calls.sdk_private.al(bEVar.j.i == bx.a.b ? al.a.d : al.a.a));
                            bEVar.E.f();
                            bEVar.B.g();
                            bEVar.c.getClass();
                            Instant.now();
                            bEVar.q();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ sb(gzs gzsVar) {
        this.b = 12;
        this.c = (Lambda) gzsVar;
    }
}
