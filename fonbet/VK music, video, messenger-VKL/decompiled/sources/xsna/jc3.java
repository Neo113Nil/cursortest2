package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenVkApp;
import com.vk.superapp.ui.widgets.SuperAppShowcaseScrollWidget;
import com.vk.superapp.ui.widgets.tile.SuperAppWidgetTile;
import java.util.LinkedHashSet;
import xsna.udn0;

/* compiled from: AppViewVisibilityTracker.kt */
/* loaded from: classes6.dex */
public final class jc3 {
    public final RecyclerView a;
    public final float b;
    public long f;
    public boolean h;
    public final c i;
    public final LinkedHashSet j;
    public wgm0 k;
    public th3 l;
    public final Rect c = new Rect();
    public final LinkedHashSet d = new LinkedHashSet();
    public final LinkedHashSet e = new LinkedHashSet();
    public final long g = 100;

    /* compiled from: AppViewVisibilityTracker.kt */
    public static final class a implements RecyclerView.q {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void g(View view) {
            jc3 jc3Var = jc3.this;
            jc3Var.a.post(new ic3(jc3Var, 0));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void k(View view) {
            jc3 jc3Var = jc3.this;
            jc3Var.a.post(new hc3(0, jc3Var, view));
        }
    }

    /* compiled from: AppViewVisibilityTracker.kt */
    public static final class b extends RecyclerView.i {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            jc3 jc3Var = jc3.this;
            jc3Var.a.post(new wd2(jc3Var, 1));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            jc3 jc3Var = jc3.this;
            jc3Var.a.post(new gh1(jc3Var, 2));
        }
    }

    /* compiled from: AppViewVisibilityTracker.kt */
    public static final class c extends RecyclerView.t {
        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            jc3.a(jc3.this, recyclerView);
        }
    }

    public jc3(RecyclerView recyclerView, float f) {
        this.a = recyclerView;
        this.b = f;
        c cVar = new c();
        this.i = cVar;
        RecyclerView.i bVar = new b();
        this.j = new LinkedHashSet();
        recyclerView.addOnScrollListener(cVar);
        recyclerView.addOnChildAttachStateChangeListener(new a());
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(bVar);
        }
    }

    public static final void a(jc3 jc3Var, RecyclerView recyclerView) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - jc3Var.f;
        long j2 = jc3Var.g;
        if (j >= j2) {
            jc3Var.f = currentTimeMillis;
            jc3Var.b(recyclerView);
        } else {
            if (jc3Var.h) {
                return;
            }
            jc3Var.h = true;
            recyclerView.postDelayed(new gc3(0, jc3Var, recyclerView), j2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(RecyclerView recyclerView) {
        String str;
        SuperAppWidgetTile c2;
        SuperAppWidgetTile.Payload payload;
        SuperAppShowcaseScrollWidget.Payload.ScrollItem scrollItem;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        int i = 0;
        int v = linearLayoutManager != null ? linearLayoutManager.v() : 0;
        if (linearLayoutManager != null) {
            i = linearLayoutManager.x();
        } else if (layoutManager != null) {
            i = layoutManager.getChildCount();
        }
        if (v > i) {
            return;
        }
        while (true) {
            RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(v);
            if (findViewHolderForAdapterPosition != 0 && findViewHolderForAdapterPosition.getAbsoluteAdapterPosition() != -1 && findViewHolderForAdapterPosition.itemView.isShown()) {
                boolean z = findViewHolderForAdapterPosition instanceof w160;
                boolean z2 = findViewHolderForAdapterPosition instanceof lhp0;
                if (z2 || z) {
                    if (z2) {
                        if ((findViewHolderForAdapterPosition instanceof jcn0) || (findViewHolderForAdapterPosition instanceof kcn0) || (findViewHolderForAdapterPosition instanceof hcn0)) {
                            men0 men0Var = (men0) ((fcn0) findViewHolderForAdapterPosition).o;
                            WebAction webAction = (men0Var == null || (c2 = men0Var.c()) == null || (payload = c2.o) == null) ? null : payload.e;
                            WebActionOpenVkApp webActionOpenVkApp = webAction instanceof WebActionOpenVkApp ? (WebActionOpenVkApp) webAction : null;
                            if (webActionOpenVkApp != null) {
                                str = webActionOpenVkApp.g;
                                if (str != null) {
                                    LinkedHashSet linkedHashSet = this.d;
                                    if (!linkedHashSet.contains(str)) {
                                        linkedHashSet.add(str);
                                        wgm0 wgm0Var = this.k;
                                        if (wgm0Var != null) {
                                            wgm0Var.invoke(findViewHolderForAdapterPosition);
                                        }
                                    }
                                    LinkedHashSet linkedHashSet2 = this.e;
                                    if (!linkedHashSet2.contains(str)) {
                                        View view = findViewHolderForAdapterPosition.itemView;
                                        boolean isShown = view.isShown();
                                        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        if (isShown) {
                                            if (view.getGlobalVisibleRect(this.c)) {
                                                int height = view.getHeight() * view.getWidth();
                                                if (height != 0) {
                                                    f = (r8.height() * r8.width()) / height;
                                                }
                                            }
                                        }
                                        if (f >= this.b) {
                                            linkedHashSet2.add(str);
                                            th3 th3Var = this.l;
                                            if (th3Var != null) {
                                                th3Var.invoke(findViewHolderForAdapterPosition, Float.valueOf(f));
                                            }
                                        }
                                    }
                                }
                            }
                            str = null;
                            if (str != null) {
                            }
                        } else {
                            if (findViewHolderForAdapterPosition instanceof udn0.a) {
                                udn0.b bVar = (udn0.b) ((udn0.a) findViewHolderForAdapterPosition).o;
                                WebAction webAction2 = (bVar == null || (scrollItem = bVar.a) == null) ? null : scrollItem.e;
                                WebActionOpenVkApp webActionOpenVkApp2 = webAction2 instanceof WebActionOpenVkApp ? (WebActionOpenVkApp) webAction2 : null;
                                if (webActionOpenVkApp2 != null) {
                                    str = webActionOpenVkApp2.g;
                                    if (str != null) {
                                    }
                                }
                            }
                            str = null;
                            if (str != null) {
                            }
                        }
                    }
                    if (z) {
                        b(((w160) findViewHolderForAdapterPosition).v4());
                    }
                }
            }
            if (v == i) {
                return;
            } else {
                v++;
            }
        }
    }
}
