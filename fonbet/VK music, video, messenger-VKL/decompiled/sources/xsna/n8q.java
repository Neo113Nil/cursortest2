package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vk.core.view.components.search.ExpandableActionVkSearchView;
import com.vk.search.ui.api.SearchQuery;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import xsna.lrv0;
import xsna.vrh0;

/* compiled from: ExpandableSearchFeatureQueryActionMenuItem.kt */
/* loaded from: classes5.dex */
public final class n8q implements srh0, vrh0, MenuItem.OnActionExpandListener, lrv0.a {
    public final /* synthetic */ emg b;
    public final Toolbar c;
    public final MenuItem d;
    public final ExpandableActionVkSearchView e;
    public final a f;
    public izs<? super Boolean, s3q0> g;
    public boolean h;

    /* compiled from: ExpandableSearchFeatureQueryActionMenuItem.kt */
    public static final class a extends FrameLayout {
        @Override // android.widget.FrameLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        }
    }

    /* compiled from: View.kt */
    public static final class b implements View.OnLayoutChangeListener {
        public final /* synthetic */ Bitmap c;

        public b(Bitmap bitmap) {
            this.c = bitmap;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            Rect rect = new Rect();
            n8q n8qVar = n8q.this;
            a aVar = n8qVar.f;
            aVar.getDrawingRect(rect);
            n8qVar.c.offsetDescendantRectToMyCoords(view, rect);
            rect.right -= iah0.a(64);
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Rect rect2 = new Rect(rect);
            rect2.offsetTo(0, 0);
            s3q0 s3q0Var = s3q0.a;
            canvas.drawBitmap(this.c, rect, rect2, (Paint) null);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(aVar.getResources(), createBitmap);
            new d(n8qVar).set(bitmapDrawable);
            n8qVar.e.setExpandFractionListener(new c(bitmapDrawable));
        }
    }

    /* compiled from: ExpandableSearchFeatureQueryActionMenuItem.kt */
    public static final class c implements ExpandableActionVkSearchView.a {
        public final /* synthetic */ BitmapDrawable a;

        public c(BitmapDrawable bitmapDrawable) {
            this.a = bitmapDrawable;
        }

        @Override // com.vk.core.view.components.search.ExpandableActionVkSearchView.a
        public final void a(float f) {
            this.a.setAlpha((int) ((1 - f) * 255));
        }
    }

    /* compiled from: ExpandableSearchFeatureQueryActionMenuItem.kt */
    public static final /* synthetic */ class d extends MutablePropertyReference0Impl {
        public d(Object obj) {
            super(obj, n8q.class, "toolbarFadeAnimationDrawable", "getToolbarFadeAnimationDrawable()Landroid/graphics/drawable/Drawable;", 0);
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((n8q) this.receiver).f.getBackground();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((n8q) this.receiver).f.setBackground((Drawable) obj);
        }
    }

    public n8q(Toolbar toolbar, MenuItem menuItem, Context context) {
        ExpandableActionVkSearchView expandableActionVkSearchView = new ExpandableActionVkSearchView(context);
        expandableActionVkSearchView.X4(false);
        BaseVkSearchView.d5(expandableActionVkSearchView, 0, 0, 14);
        expandableActionVkSearchView.setVoiceActionDelegate(new nrl(context, new acw0(new n3i(expandableActionVkSearchView, 16)), new sg0(expandableActionVkSearchView, 6)));
        this.b = new emg(expandableActionVkSearchView);
        this.c = toolbar;
        this.d = menuItem;
        this.e = expandableActionVkSearchView;
        a aVar = new a(expandableActionVkSearchView.getContext());
        aVar.addView(expandableActionVkSearchView, -1, -1);
        this.f = aVar;
        if (toolbar.isAttachedToWindow()) {
            dhr0.a.a(this);
        }
        toolbar.addOnAttachStateChangeListener(new o8q(this));
    }

    @Override // xsna.vrh0
    public final void P1(String str) {
        this.b.P1(str);
    }

    @Override // xsna.vrh0
    public final void a(vrh0.a aVar) {
        this.b.a(aVar);
    }

    @Override // xsna.vrh0
    public final boolean b() {
        return this.b.b();
    }

    @Override // xsna.srh0
    public final boolean c() {
        MenuItem menuItem = this.d;
        boolean isActionViewExpanded = menuItem.isActionViewExpanded();
        if (isActionViewExpanded) {
            menuItem.collapseActionView();
        }
        return isActionViewExpanded;
    }

    @Override // xsna.vrh0
    public final void d(boolean z) {
        this.b.d(z);
    }

    @Override // xsna.vrh0
    public final void d0() {
        this.b.d0();
    }

    @Override // xsna.vrh0
    public final void e(boolean z) {
        this.b.e(z);
    }

    @Override // xsna.vrh0
    public final void f(boolean z) {
        this.b.f(z);
    }

    @Override // xsna.vrh0
    public final void g(SearchQuery searchQuery) {
        this.b.g(searchQuery);
    }

    public final void h(MenuItem menuItem) {
        Bitmap a2;
        a aVar = this.f;
        if (aVar.getBackground() != null) {
            return;
        }
        Toolbar toolbar = this.c;
        if (toolbar.isLaidOut()) {
            this.h = true;
            View view = (View) toolbar.getParent();
            boolean isActionViewExpanded = menuItem.isActionViewExpanded();
            if (isActionViewExpanded) {
                view.setForeground(new BitmapDrawable(view.getResources(), hyt0.a(view)));
                menuItem.collapseActionView();
            }
            a2 = hyt0.a(toolbar);
            if (isActionViewExpanded) {
                menuItem.expandActionView();
                view.setForeground(null);
            }
            this.h = false;
        } else {
            a2 = null;
        }
        if (a2 == null) {
            return;
        }
        if (!aVar.isLaidOut() || aVar.isLayoutRequested()) {
            aVar.addOnLayoutChangeListener(new b(a2));
            return;
        }
        Rect rect = new Rect();
        aVar.getDrawingRect(rect);
        toolbar.offsetDescendantRectToMyCoords(aVar, rect);
        rect.right -= iah0.a(64);
        Bitmap createBitmap = Bitmap.createBitmap(aVar.getWidth(), aVar.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect rect2 = new Rect(rect);
        rect2.offsetTo(0, 0);
        s3q0 s3q0Var = s3q0.a;
        canvas.drawBitmap(a2, rect, rect2, (Paint) null);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(aVar.getResources(), createBitmap);
        new d(this).set(bitmapDrawable);
        this.e.setExpandFractionListener(new c(bitmapDrawable));
    }

    @Override // xsna.vrh0
    public final SearchQuery i() {
        return this.b.i();
    }

    public final void j(izs<? super Boolean, s3q0> izsVar) {
        this.g = izsVar;
        izsVar.invoke(Boolean.valueOf(this.e.getExpandState() != ExpandableActionVkSearchView.ExpandState.COLLAPSED));
    }

    @Override // xsna.vrh0
    public final void k() {
        this.b.k();
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        if (!this.h) {
            ExpandableActionVkSearchView expandableActionVkSearchView = this.e;
            if (expandableActionVkSearchView.getExpandState().compareTo(ExpandableActionVkSearchView.ExpandState.COLLAPSING) <= 0) {
                izs<? super Boolean, s3q0> izsVar = this.g;
                if (izsVar != null) {
                    izsVar.invoke(Boolean.FALSE);
                }
                if (expandableActionVkSearchView.getExpandState() != ExpandableActionVkSearchView.ExpandState.COLLAPSED) {
                    return false;
                }
            } else {
                if (this.c.isLaidOut()) {
                    int i = expandableActionVkSearchView.f0;
                    int i2 = expandableActionVkSearchView.d0;
                    expandableActionVkSearchView.f0 = i;
                    expandableActionVkSearchView.g0 = krv0.l(i);
                    expandableActionVkSearchView.d0 = i2;
                    expandableActionVkSearchView.e0 = krv0.l(i2);
                    h(menuItem);
                    expandableActionVkSearchView.m5(false, new j3(11, this, menuItem));
                    return false;
                }
                expandableActionVkSearchView.setExpanded(false);
                izs<? super Boolean, s3q0> izsVar2 = this.g;
                if (izsVar2 != null) {
                    izsVar2.invoke(Boolean.FALSE);
                }
            }
        }
        return true;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        if (this.h) {
            return true;
        }
        ExpandableActionVkSearchView expandableActionVkSearchView = this.e;
        if (expandableActionVkSearchView.getExpandState() != ExpandableActionVkSearchView.ExpandState.COLLAPSED) {
            return false;
        }
        izs<? super Boolean, s3q0> izsVar = this.g;
        if (izsVar != null) {
            izsVar.invoke(Boolean.TRUE);
        }
        if (!this.c.isLaidOut()) {
            expandableActionVkSearchView.setExpanded(true);
            return true;
        }
        h(menuItem);
        expandableActionVkSearchView.m5(true, new obh(this, 8));
        return true;
    }

    @Override // xsna.lrv0.a
    public final void xb() {
        this.f.setBackground(null);
        if (this.d.isActionViewExpanded()) {
            return;
        }
        dhr0.W(this.e);
    }
}
