package me.grishka.appkit.views;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.log.L;
import com.vk.toggle.Features;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.bgz;
import xsna.hkf0;
import xsna.jk9;
import xsna.ljf0;
import xsna.m33;
import xsna.njf0;
import xsna.pjf0;
import xsna.pro0;
import xsna.qjf0;
import xsna.ue5;
import xsna.xq3;
import xsna.zzc0;

/* loaded from: classes8.dex */
public class UsableRecyclerView extends RecyclerView {
    public static final /* synthetic */ int J = 0;
    public final g A;
    public final f B;
    public bgz C;
    public View D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public final boolean I;
    public final qjf0 b;

    @Nullable
    public p c;
    public int d;
    public int e;
    public int f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public final PointF m;
    public RecyclerView.e0 n;
    public View o;
    public final Rect p;
    public Drawable q;
    public d r;
    public q s;
    public boolean t;
    public GestureDetector u;
    public final a v;
    public m w;
    public boolean x;
    public v y;
    public final h z;

    public class a extends RecyclerView.i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            UsableRecyclerView usableRecyclerView = UsableRecyclerView.this;
            usableRecyclerView.C.d(usableRecyclerView.b.a(), usableRecyclerView.b.b());
            usableRecyclerView.i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int i, int i2) {
            UsableRecyclerView usableRecyclerView = UsableRecyclerView.this;
            usableRecyclerView.C.d(usableRecyclerView.b.a(), usableRecyclerView.b.b());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void d(int i, int i2, Object obj) {
            UsableRecyclerView usableRecyclerView = UsableRecyclerView.this;
            usableRecyclerView.C.d(usableRecyclerView.b.a(), usableRecyclerView.b.b());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            UsableRecyclerView usableRecyclerView = UsableRecyclerView.this;
            usableRecyclerView.C.d(usableRecyclerView.b.a(), usableRecyclerView.b.b());
            usableRecyclerView.i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i, int i2) {
            UsableRecyclerView usableRecyclerView = UsableRecyclerView.this;
            bgz bgzVar = usableRecyclerView.C;
            qjf0 qjf0Var = usableRecyclerView.b;
            bgzVar.d(qjf0Var.a(), qjf0Var.b());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            UsableRecyclerView usableRecyclerView = UsableRecyclerView.this;
            usableRecyclerView.C.d(usableRecyclerView.b.a(), usableRecyclerView.b.b());
            usableRecyclerView.i();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            UsableRecyclerView usableRecyclerView = UsableRecyclerView.this;
            View view = usableRecyclerView.o;
            if (view != null) {
                view.setPressed(false);
            }
            usableRecyclerView.q.setState(ViewGroup.EMPTY_STATE_SET);
        }
    }

    public static abstract class c<VH extends x> extends RecyclerView.Adapter<VH> implements zzc0 {
        public String B(int i, int i2) {
            return null;
        }

        public int G(int i) {
            return 0;
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            UsableRecyclerView usableRecyclerView = UsableRecyclerView.this;
            if (usableRecyclerView.n == null) {
                return;
            }
            usableRecyclerView.r = null;
            View view = usableRecyclerView.o;
            if (view != null) {
                view.setPressed(true);
            }
            Drawable drawable = usableRecyclerView.q;
            if (drawable != null) {
                drawable.setState(ViewGroup.PRESSED_ENABLED_FOCUSED_STATE_SET);
            }
        }
    }

    public interface e {
        void onClick();
    }

    public class f implements i {
        public final LinkedHashSet a = new LinkedHashSet();

        @Override // me.grishka.appkit.views.UsableRecyclerView.i
        public final void detach() {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((i) it.next()).detach();
            }
        }
    }

    public class g implements k {
        public final LinkedHashSet b = new LinkedHashSet();

        @Override // me.grishka.appkit.views.UsableRecyclerView.k
        public final boolean c(Drawable drawable) {
            Iterator it = this.b.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (((k) it.next()).c(drawable)) {
                    z = true;
                }
            }
            return z;
        }
    }

    public class h implements t {
        public final LinkedHashSet a = new LinkedHashSet();

        @Override // me.grishka.appkit.views.UsableRecyclerView.t
        public final void a(int i, int i2, int i3, int i4) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((t) it.next()).a(i, i2, i3, i4);
            }
        }
    }

    public interface i {
        void detach();
    }

    public interface j extends e {
        boolean isEnabled();
    }

    public interface k {
        boolean c(Drawable drawable);
    }

    public interface l extends p {
        void Zd(int i, int i2, int i3);
    }

    public static class n extends x {
    }

    public interface o {
    }

    public interface p {
        void M();

        void N0();
    }

    public class q implements Runnable {
        public q() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            UsableRecyclerView usableRecyclerView = UsableRecyclerView.this;
            if (usableRecyclerView.n == null) {
                return;
            }
            usableRecyclerView.s = null;
            View view = usableRecyclerView.o;
            if (view != null) {
                view.setPressed(false);
            }
            usableRecyclerView.q.setState(ViewGroup.EMPTY_STATE_SET);
            if (((r) usableRecyclerView.n).P4()) {
                usableRecyclerView.performHapticFeedback(0);
            }
            usableRecyclerView.n = null;
        }
    }

    public interface r {
        boolean P4();
    }

    public interface s extends e {
    }

    public interface t {
        void a(int i, int i2, int i3, int i4);
    }

    public static class u extends RuntimeException {
    }

    public interface v {
        void a(Rect rect, View view);
    }

    public static class w extends GestureDetector.SimpleOnGestureListener {
        public final int b;

        public w(Context context) {
            this.b = ViewConfiguration.get(context).getScaledTouchSlop();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            float abs = Math.abs(f2);
            return abs > Math.abs(f) && abs > ((float) this.b);
        }
    }

    public static class x extends RecyclerView.e0 {
    }

    public UsableRecyclerView(Context context) {
        super(context);
        this.b = new qjf0(this);
        this.c = null;
        this.m = new PointF();
        this.p = new Rect();
        this.t = true;
        this.v = new a();
        this.x = false;
        this.z = new h();
        this.A = new g();
        this.B = new f();
        this.E = false;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = com.vk.toggle.b.A.a(Features.Type.FEATURE_CORE_RECYCLER_DEBUG_ENABLED);
        g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View view;
        if (this.x) {
            super.dispatchDraw(canvas);
        }
        if (this.q != null && (view = this.o) != null) {
            v vVar = this.y;
            Rect rect = this.p;
            if (vVar != null) {
                vVar.a(rect, view);
            } else {
                rect.set(view.getLeft(), this.o.getTop(), this.o.getRight(), this.o.getBottom());
            }
            this.q.setBounds(rect);
            this.q.setHotspot(this.k, this.l);
            this.q.draw(canvas);
        }
        if (this.x) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    public final void e(View view) {
        view.setLayoutParams(new RecyclerView.p(-1, -2));
        m mVar = this.w;
        if (mVar != null) {
            mVar.d.add(view);
            this.w.notifyDataSetChanged();
            return;
        }
        m mVar2 = new m(getAdapter());
        ArrayList<View> arrayList = new ArrayList<>();
        mVar2.d = arrayList;
        this.w = mVar2;
        arrayList.add(view);
        super.setAdapter(this.w);
    }

    public final void f() {
        this.n = null;
        View view = this.o;
        if (view != null) {
            view.setPressed(false);
            this.q.setState(ViewGroup.EMPTY_STATE_SET);
            d dVar = this.r;
            if (dVar != null) {
                removeCallbacks(dVar);
                this.r = null;
            }
            q qVar = this.s;
            if (qVar != null) {
                removeCallbacks(qVar);
                this.s = null;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final RecyclerView.e0 findViewHolderForAdapterPosition(int i2) {
        try {
            return super.findViewHolderForAdapterPosition(i2);
        } catch (Exception e2) {
            L.C("error: ", e2);
            return null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    @Nullable
    public final View focusSearch(@Nullable View view, int i2) {
        if (view instanceof EditText) {
            if (isInLayout()) {
                return null;
            }
            if (!this.E) {
                this.E = true;
                this.F = 0;
                this.G = 0;
            }
        }
        try {
            return super.focusSearch(view, i2);
        } finally {
            if (this.E) {
                int i3 = this.F;
                if (i3 != 0 || this.G != 0) {
                    scrollBy(-i3, -this.G);
                }
                this.E = false;
            }
        }
    }

    public final void g() {
        if (isInEditMode()) {
            return;
        }
        this.d = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.e = ViewConfiguration.getTapTimeout();
        this.f = ViewConfiguration.getLongPressTimeout();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        setSelector(obtainStyledAttributes.getDrawable(0));
        obtainStyledAttributes.recycle();
        setRecycledViewPool(new ue5());
        me.grishka.appkit.views.a aVar = new me.grishka.appkit.views.a(this);
        qjf0 qjf0Var = this.b;
        qjf0Var.a.addOnScrollListener(new pjf0(qjf0Var, aVar));
        pro0.c(new xq3(this, 15));
        bgz bgzVar = new bgz();
        this.C = bgzVar;
        addOnScrollListener(new ljf0(bgzVar));
        this.A.b.add(new k() { // from class: xsna.ufq0
            @Override // me.grishka.appkit.views.UsableRecyclerView.k
            public final boolean c(Drawable drawable) {
                return drawable == UsableRecyclerView.this.q;
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public RecyclerView.Adapter getAdapter() {
        RecyclerView.Adapter adapter = super.getAdapter();
        return adapter instanceof m ? ((m) adapter).c : adapter instanceof njf0 ? ((njf0) adapter).c : adapter;
    }

    public int getCount() {
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    public PointF getLastTouchPoint() {
        return this.m;
    }

    public Drawable getSelector() {
        return this.q;
    }

    public int getTotalScrollDy() {
        return this.H;
    }

    public final void i() {
        if (this.D == null) {
            return;
        }
        this.D.setVisibility(getAdapter() != null && getAdapter().getItemCount() == 0 ? 0 : 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.B.detach();
        super.onDetachedFromWindow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.m.set(motionEvent.getX(), motionEvent.getY());
        }
        if (!this.t) {
            View findChildViewUnder = findChildViewUnder(motionEvent.getX(), motionEvent.getY());
            if (findChildViewUnder != null ? findContainingViewHolder(findChildViewUnder) instanceof o : false) {
                if (motionEvent.getActionMasked() != 0 || getScrollState() != 2) {
                    super.onInterceptTouchEvent(motionEvent);
                    return this.u.onTouchEvent(motionEvent);
                }
                super.onInterceptTouchEvent(motionEvent);
                this.u.onTouchEvent(motionEvent);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onScrolled(int i2, int i3) {
        super.onScrolled(i2, i3);
        if (!this.E) {
            this.H += i3;
        } else {
            this.F += i2;
            this.G += i3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        h hVar = this.z;
        if (hVar != null) {
            hVar.a(i2, i3, i4, i5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        RecyclerView.e0 childViewHolder;
        if (motionEvent.getAction() == 0 && getScrollState() == 0) {
            float x2 = motionEvent.getX();
            this.k = x2;
            this.g = x2;
            float y = motionEvent.getY();
            this.l = y;
            this.h = y;
            this.i = motionEvent.getRawX();
            this.j = motionEvent.getRawY();
            this.o = null;
            View a2 = hkf0.a(this, motionEvent.getX(), motionEvent.getY());
            if (a2 != null && (childViewHolder = super.getChildViewHolder(a2)) != 0 && (childViewHolder instanceof e)) {
                if (!(childViewHolder instanceof j) || ((j) childViewHolder).isEnabled()) {
                    this.n = childViewHolder;
                    if (!(childViewHolder instanceof s)) {
                        this.o = a2;
                    }
                    Runnable runnable = this.r;
                    if (runnable != null) {
                        removeCallbacks(runnable);
                    }
                    d dVar = new d();
                    this.r = dVar;
                    postDelayed(dVar, this.e);
                }
                if (childViewHolder instanceof r) {
                    q qVar = new q();
                    this.s = qVar;
                    postDelayed(qVar, this.f);
                }
            }
        }
        if (motionEvent.getAction() == 3) {
            f();
        }
        if (motionEvent.getAction() == 2 && this.n != null) {
            this.k = motionEvent.getX();
            this.l = motionEvent.getY();
            if (Math.abs(motionEvent.getX() - this.g) > this.d || Math.abs(motionEvent.getY() - this.h) > this.d || Math.abs(motionEvent.getRawX() - this.i) > this.d || Math.abs(motionEvent.getRawY() - this.j) > this.d) {
                f();
            }
        }
        if (motionEvent.getAction() == 1) {
            this.k = motionEvent.getX();
            this.l = motionEvent.getY();
            Runnable runnable2 = this.s;
            if (runnable2 != null) {
                removeCallbacks(runnable2);
                this.s = null;
            }
            if (this.n != null && (Math.abs(motionEvent.getX() - this.g) < this.d || Math.abs(motionEvent.getY() - this.h) < this.d)) {
                ((e) this.n).onClick();
                playSoundEffect(0);
                Runnable runnable3 = this.r;
                if (runnable3 != null) {
                    removeCallbacks(runnable3);
                    this.r.run();
                    this.r = null;
                }
                this.n = null;
                postDelayed(new b(), 50L);
            }
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e2) {
            Log.e("error", "error", e2);
            return false;
        }
    }

    @Override // android.view.View
    public final boolean post(Runnable runnable) {
        if (this.I && (runnable instanceof androidx.recyclerview.widget.q)) {
            runnable = new jk9(runnable, 14);
        }
        return super.post(runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        if (isInEditMode()) {
            super.setAdapter(adapter);
            return;
        }
        RecyclerView.Adapter adapter2 = getAdapter();
        a aVar = this.v;
        if (adapter2 != null) {
            try {
                getAdapter().unregisterAdapterDataObserver(aVar);
            } catch (Exception unused) {
            }
        }
        if (adapter instanceof zzc0) {
            this.C.c = (zzc0) adapter;
        }
        njf0 njf0Var = adapter == 0 ? null : new njf0(adapter);
        super.setAdapter(njf0Var);
        if (njf0Var != null) {
            njf0Var.registerAdapterDataObserver(aVar);
        }
        i();
    }

    public void setDrawSelectorOnTop(boolean z) {
        this.x = z;
    }

    public void setEmptyView(View view) {
        this.D = view;
        i();
    }

    public void setInterceptHorizontalScrollTouches(boolean z) {
        this.t = z;
    }

    public void setListener(@Nullable p pVar) {
        this.c = pVar;
    }

    public void setSelector(int i2) {
        setSelector(m33.a(i2, getContext()));
    }

    public void setSelectorBoundsProvider(v vVar) {
        this.y = vVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void smoothScrollBy(int i2, int i3, @Nullable Interpolator interpolator) {
        if (this.E) {
            scrollBy(i2, i3);
        } else {
            super.smoothScrollBy(i2, i3, interpolator);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void swapAdapter(RecyclerView.Adapter adapter, boolean z) {
        super.swapAdapter(adapter, z);
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.v);
        }
        i();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.A.c(drawable);
    }

    public static class m extends njf0 {
        public ArrayList<View> d;

        public m() {
            throw null;
        }

        @Override // xsna.njf0, androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.d.size() + this.c.getItemCount();
        }

        @Override // xsna.njf0, androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i) {
            RecyclerView.Adapter<RecyclerView.e0> adapter = this.c;
            if (i < adapter.getItemCount()) {
                return adapter.getItemId(i);
            }
            return 0L;
        }

        @Override // xsna.njf0, androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            RecyclerView.Adapter<RecyclerView.e0> adapter = this.c;
            return i < adapter.getItemCount() ? adapter.getItemViewType(i) : (i - 1000) - adapter.getItemCount();
        }

        @Override // xsna.njf0, androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            if (i < this.c.getItemCount()) {
                super.onBindViewHolder(e0Var, i);
            }
        }

        @Override // xsna.njf0, androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            ArrayList<View> arrayList = this.d;
            return (i < -1000 || i >= arrayList.size() + (-1000)) ? this.c.onCreateViewHolder(viewGroup, i) : new n(arrayList.get(i - (-1000)));
        }

        @Override // xsna.njf0, androidx.recyclerview.widget.RecyclerView.Adapter
        public final boolean onFailedToRecycleView(RecyclerView.e0 e0Var) {
            return !(e0Var instanceof n) && this.c.onFailedToRecycleView(e0Var);
        }

        @Override // xsna.njf0, androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewAttachedToWindow(RecyclerView.e0 e0Var) {
            if (e0Var instanceof n) {
                return;
            }
            this.c.onViewAttachedToWindow(e0Var);
        }

        @Override // xsna.njf0, androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewDetachedFromWindow(RecyclerView.e0 e0Var) {
            if (e0Var instanceof n) {
                return;
            }
            this.c.onViewDetachedFromWindow(e0Var);
        }

        @Override // xsna.njf0, androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewRecycled(RecyclerView.e0 e0Var) {
            if (e0Var instanceof n) {
                return;
            }
            this.c.onViewRecycled(e0Var);
        }

        @Override // xsna.njf0, androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, @NonNull List<Object> list) {
            if (i < this.c.getItemCount()) {
                super.onBindViewHolder(e0Var, i, list);
            }
        }
    }

    public void setSelector(Drawable drawable) {
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.q = drawable;
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
    }

    public UsableRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new qjf0(this);
        this.c = null;
        this.m = new PointF();
        this.p = new Rect();
        this.t = true;
        this.v = new a();
        this.x = false;
        this.z = new h();
        this.A = new g();
        this.B = new f();
        this.E = false;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = com.vk.toggle.b.A.a(Features.Type.FEATURE_CORE_RECYCLER_DEBUG_ENABLED);
        g();
    }
}
