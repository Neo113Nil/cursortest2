package xsna;

import android.content.Context;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.m;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.im.ui.views.EmptyViewForList;
import com.vkontakte.android.R;
import java.util.List;
import xsna.e3m;
import xsna.wej;

/* compiled from: ContactsSearchVc.kt */
/* loaded from: classes2.dex */
public final class ddj extends wej {
    public io.reactivex.rxjava3.disposables.c A;
    public final GestureDetector B;
    public final LayoutInflater o;
    public final a p;
    public final b25 q;
    public View r;
    public b s;
    public View t;
    public EmptyViewForList u;
    public VkTopBar v;
    public VkSearchView w;
    public View x;
    public FrameLayout y;
    public bzb0 z;

    /* compiled from: ContactsSearchVc.kt */
    public interface b {
        void a();

        void b(tbh tbhVar);

        boolean c();

        void cancel();
    }

    /* compiled from: ContactsSearchVc.kt */
    public static final class c extends GestureDetector.SimpleOnGestureListener {
        public c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            ddj.this.f();
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddj(LayoutInflater layoutInflater, a aVar, b25 b25Var, boolean z) {
        super(layoutInflater, aVar, b25Var, true, true, null, true, false, false, z, false);
        layoutInflater.getContext();
        this.o = layoutInflater;
        this.p = aVar;
        this.q = b25Var;
        this.B = new GestureDetector(layoutInflater.getContext(), new c());
    }

    @Override // xsna.wej
    public final void c(List<? extends hfz> list, SortOrder sortOrder, m.d dVar) {
        super.c(list, sortOrder, dVar);
        if (!list.isEmpty()) {
            FrameLayout frameLayout = this.y;
            if (frameLayout == null) {
                frameLayout = null;
            }
            frameLayout.setVisibility(0);
            View view = this.x;
            f4m.j(view != null ? view : null);
            return;
        }
        if (this.p.r()) {
            EmptyViewForList emptyViewForList = this.u;
            if (emptyViewForList == null) {
                emptyViewForList = null;
            }
            emptyViewForList.getContext();
            EmptyViewForList emptyViewForList2 = this.u;
            EmptyViewForList emptyViewForList3 = emptyViewForList2 == null ? null : emptyViewForList2;
            if (emptyViewForList2 == null) {
                emptyViewForList2 = null;
            }
            Context context = emptyViewForList2.getContext();
            e3m.a aVar = e3m.a;
            emptyViewForList3.a(m33.a(R.drawable.vk_icon_deprecated_placeholder_not_found_56, context), null);
            View view2 = this.x;
            if (view2 == null) {
                view2 = null;
            }
            view2.setVisibility(0);
        } else {
            View view3 = this.x;
            if (view3 == null) {
                view3 = null;
            }
            f4m.j(view3);
        }
        FrameLayout frameLayout2 = this.y;
        f4m.j(frameLayout2 != null ? frameLayout2 : null);
    }

    @Override // xsna.wej
    public final void d() {
        FrameLayout frameLayout = this.y;
        if (frameLayout == null) {
            frameLayout = null;
        }
        frameLayout.setVisibility(0);
        super.d();
    }

    public final boolean f() {
        b bVar = this.s;
        if (bVar == null) {
            bVar = null;
        }
        if (bVar.c()) {
            return true;
        }
        View view = this.r;
        if (view == null) {
            view = null;
        }
        if (!bwt0.K(view)) {
            return false;
        }
        View view2 = this.t;
        d3m.e(view2 == null ? null : view2, (r15 & 1) != 0 ? 300L : 150L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        FrameLayout frameLayout = this.y;
        d3m.e(frameLayout == null ? null : frameLayout, (r15 & 1) != 0 ? 300L : 150L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        View view3 = this.x;
        d3m.e(view3 == null ? null : view3, (r15 & 1) != 0 ? 300L : 150L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        b bVar2 = this.s;
        (bVar2 != null ? bVar2 : null).b(new tbh(this, 4));
        return true;
    }

    public final void g() {
        VkTopBar vkTopBar = this.v;
        if (vkTopBar == null) {
            vkTopBar = null;
        }
        vkTopBar.setMiddle(new VkTopBar.Middle.d(this.o.getContext().getString(R.string.search), new tho0("", 0L, 6), false, null, new p4f(this, 10), null, null, null, null, null, 4076));
    }

    /* compiled from: ContactsSearchVc.kt */
    public interface a extends wej.a {
        void g(CharSequence charSequence);

        boolean r();

        default void i() {
        }
    }
}
