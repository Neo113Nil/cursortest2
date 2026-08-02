package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.tool.view.NestedScrollableRecyclerView;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ClipProductAttachesTileView.kt */
/* loaded from: classes18.dex */
public final class bbd extends NestedScrollableRecyclerView {
    public w35 d;
    public sid0 e;
    public u9 f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public final int l;
    public final Object m;

    /* compiled from: View.kt */
    public static final class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            bbd bbdVar = bbd.this;
            bbdVar.g = (bbdVar.getMeasuredWidth() - iah0.a(170)) / 2;
            f4m.x(bbdVar.g, bbdVar);
            bbdVar.setClipToPadding(false);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bbd(Context context) {
        super(r0 != null ? new l7s(context, r0.intValue()) : context, null, 0);
        TypedValue typedValue = krv0.a;
        Integer d = krv0.d();
        this.l = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.m = msy.a(LazyThreadSafetyMode.NONE, new defpackage.r(this, 27));
        setLayoutManager(new LinearLayoutManager(0, false));
        setAdapter(getClipAdapter());
        addItemDecoration(new ehk0(iah0.a(8)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final zad getClipAdapter() {
        return (zad) this.m.getValue();
    }

    public final void a(List list, w35 w35Var, sid0 sid0Var, u9 u9Var) {
        if (this.g <= 0) {
            setShouldScroll(true);
            c();
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new qad((MarketProductTileConfig) it.next()));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (!list.isEmpty()) {
            arrayList2.add(pad.b);
        }
        getClipAdapter().setItems(arrayList2);
        if (this.h) {
            scrollToPosition(0);
        }
        this.d = w35Var;
        this.e = sid0Var;
        this.f = u9Var;
    }

    public final void c() {
        if (getMeasuredWidth() > 0) {
            int measuredWidth = (getMeasuredWidth() - iah0.a(170)) / 2;
            this.g = measuredWidth;
            f4m.x(measuredWidth, this);
            setClipToPadding(false);
            return;
        }
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new a());
            return;
        }
        int measuredWidth2 = (getMeasuredWidth() - iah0.a(170)) / 2;
        this.g = measuredWidth2;
        f4m.x(measuredWidth2, this);
        setClipToPadding(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RecyclerView.o layoutManager = getLayoutManager();
        Parcelable onSaveInstanceState = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
        c();
        RecyclerView.o layoutManager2 = getLayoutManager();
        if (layoutManager2 != null) {
            layoutManager2.onRestoreInstanceState(onSaveInstanceState);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.j = (int) motionEvent.getRawX();
            this.k = (int) motionEvent.getRawY();
            this.i = true;
            return onTouchEvent;
        }
        int i = this.l;
        if (valueOf != null && valueOf.intValue() == 2) {
            float f = i;
            if (Math.abs(motionEvent.getRawX() - this.j) > f || Math.abs(motionEvent.getRawY() - this.k) > f) {
                this.i = false;
                return onTouchEvent;
            }
        } else if (valueOf != null && valueOf.intValue() == 1 && this.i) {
            float f2 = i;
            if (Math.abs(motionEvent.getRawX() - this.j) < f2 && Math.abs(motionEvent.getRawY() - this.k) < f2) {
                Rect rect = new Rect();
                getGlobalVisibleRect(rect);
                rect.left = getPaddingLeft() + rect.left;
                rect.top = getPaddingTop() + rect.top;
                if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    View view = this;
                    boolean z = false;
                    while ((view.getParent() instanceof View) && !z) {
                        view = (View) view.getParent();
                        z = view.performClick();
                    }
                    return false;
                }
            }
        }
        return onTouchEvent;
    }

    public final void setShouldScroll(boolean z) {
        this.h = z;
    }
}
