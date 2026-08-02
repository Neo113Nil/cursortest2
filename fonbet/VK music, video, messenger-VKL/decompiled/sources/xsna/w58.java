package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.EmptyList;

/* compiled from: BottomNavigationMenuView.java */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes11.dex */
public final class w58 extends ViewGroup implements androidx.appcompat.view.menu.k {
    public final int b;
    public final uvt0 c;

    @Nullable
    public View.OnLongClickListener d;
    public final hep e;
    public final d58 f;
    public j58[] g;
    public int h;
    public ColorStateList i;
    public ColorStateList j;
    public int k;
    public final int[] l;
    public y58 m;
    public androidx.appcompat.view.menu.f n;
    public final e58 o;

    public w58(Context context) {
        super(context, null);
        this.d = null;
        this.f = d58.a;
        this.h = 0;
        e58 e58Var = new e58();
        e58Var.a = true;
        e58Var.b = true;
        e58Var.c = true;
        e58Var.e = EmptyList.b;
        this.o = e58Var;
        Resources resources = getResources();
        resources.getDimensionPixelSize(R.dimen.vk_bottom_navigation_active_item_max_width);
        this.b = resources.getDimensionPixelSize(R.dimen.vk_bottom_navigation_height);
        this.e = new hep();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: xsna.v58
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w58 w58Var = w58.this;
                w58Var.getClass();
                j58 j58Var = (j58) view;
                int itemPosition = j58Var.getItemPosition();
                if (w58Var.n.q(j58Var.getItemData(), w58Var.m, 0)) {
                    return;
                }
                w58Var.a(itemPosition, true);
            }
        };
        qcy<Object>[] qcyVarArr = bwt0.a;
        this.c = new uvt0(100L, onClickListener);
        this.l = new int[6];
        setClipChildren(false);
    }

    public final void a(int i, boolean z) {
        if (this.h == i) {
            return;
        }
        if (z) {
            hep hepVar = this.e;
            hepVar.getClass();
            try {
                zmp0.a(this, (mk5) hepVar.a);
            } catch (Exception e) {
                L.E(e, new Object[0]);
            }
        }
        this.m.d = true;
        this.g[this.h].setChecked(false);
        this.g[i].setChecked(true);
        this.m.d = false;
        this.h = i;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void b(androidx.appcompat.view.menu.f fVar) {
        this.n = fVar;
    }

    public final void c() {
        List w0;
        j58[] j58VarArr = this.g;
        d58 d58Var = this.f;
        if (j58VarArr != null) {
            d58Var.getClass();
            if (j58VarArr.length == 0) {
                w0 = EmptyList.b;
            } else {
                w0 = rl3.w0(j58VarArr);
                Collections.reverse(w0);
            }
            int size = w0.size();
            for (int i = 0; i < size; i++) {
                d58.f.a((j58) w0.get(i));
            }
        }
        removeAllViews();
        if (this.n.f.size() == 0) {
            return;
        }
        this.g = new j58[this.n.f.size()];
        androidx.appcompat.view.menu.f fVar = this.n;
        e58 e58Var = this.o;
        e58Var.getClass();
        boolean z = true;
        e58Var.b = fVar.f.size() > 3;
        Context context = getContext();
        androidx.appcompat.view.menu.f fVar2 = this.n;
        int i2 = iah0.f().widthPixels;
        ArrayList<androidx.appcompat.view.menu.h> arrayList = fVar2.f;
        int size2 = i2 / arrayList.size();
        d58 d58Var2 = d58.a;
        j58 a = d58.a(context);
        a.setStaticMode(true);
        int[] iArr = j58.v;
        int i3 = 0;
        while (true) {
            if (i3 >= 2) {
                d58 d58Var3 = d58.a;
                d58.f.a(a);
                e58Var.d = null;
                break;
            }
            int i4 = iArr[i3];
            a.setTextSize(i4);
            int size3 = arrayList.size();
            boolean z2 = z;
            for (int i5 = 0; i5 < size3; i5++) {
                CharSequence title = fVar2.getItem(i5).getTitle();
                z2 = ((float) size2) >= Math.max(a.l.getPaint().measureText(title.toString()), a.k.getPaint().measureText(title.toString())) + ((float) iah0.a((float) 2));
                if (!z2) {
                    break;
                }
            }
            if (z2) {
                d58 d58Var4 = d58.a;
                d58.f.a(a);
                e58Var.d = Integer.valueOf(i4);
                break;
            }
            i3++;
            z = true;
        }
        e58Var.a();
        for (int i6 = 0; i6 < this.n.f.size(); i6++) {
            MenuItem item = this.n.getItem(i6);
            this.m.d = true;
            item.setCheckable(true);
            this.m.d = false;
            Context context2 = getContext();
            d58Var.getClass();
            j58 a2 = d58.a(context2);
            this.g[i6] = a2;
            e58Var.b(a2, item);
            a2.setTextColor(this.j);
            a2.setItemBackground(this.k);
            a2.m.setVisibility(8);
            a2.setShiftingMode(e58Var.b && !e58Var.c);
            a2.c((androidx.appcompat.view.menu.h) item);
            if (a2.getItemData().s == null) {
                a2.setIconTintList(this.i);
            }
            a2.setItemPosition(i6);
            a2.setOnClickListener(this.c);
            final u58 u58Var = new u58(this);
            qcy<Object>[] qcyVarArr = bwt0.a;
            a2.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.qvt0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    if (bwt0.B().a()) {
                        return true;
                    }
                    return u58.this.onLongClick(view);
                }
            });
            e58Var.c(a2, item);
            addView(a2);
        }
        y58 y58Var = this.m;
        j58[] j58VarArr2 = this.g;
        y58Var.getClass();
        if (j58VarArr2 != null) {
            for (j58 j58Var : j58VarArr2) {
                if (y58Var.e.b(j58Var.getItemData().a)) {
                    y58Var.f.d(j58Var);
                }
            }
        }
        int min = Math.min(this.n.f.size() - 1, this.h);
        this.h = min;
        this.n.getItem(min).setChecked(true);
    }

    public final void d() {
        int size = this.n.f.size();
        if (size != this.g.length) {
            c();
            return;
        }
        for (int i = 0; i < size; i++) {
            this.m.d = true;
            this.g[i].c((androidx.appcompat.view.menu.h) this.n.getItem(i));
            this.m.d = false;
        }
    }

    public int getActiveButton() {
        return this.h;
    }

    @Nullable
    public ColorStateList getIconTintList() {
        return this.i;
    }

    public int getItemBackgroundRes() {
        return this.k;
    }

    public ColorStateList getItemTextColor() {
        return this.j;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        boolean z2 = getLayoutDirection() == 1;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (z2) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int[] iArr;
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        int i3 = this.b;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int i4 = size / (childCount == 0 ? 1 : childCount);
        int i5 = size - (i4 * childCount);
        int i6 = 0;
        while (true) {
            iArr = this.l;
            if (i6 >= childCount) {
                break;
            }
            iArr[i6] = i4;
            if (i5 > 0) {
                iArr[i6] = i4 + 1;
                i5--;
            }
            i6++;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(iArr[i8], 1073741824), makeMeasureSpec);
                childAt.getLayoutParams().width = childAt.getMeasuredWidth();
                i7 += childAt.getMeasuredWidth();
            }
        }
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        setMeasuredDimension(View.resolveSizeAndState(i7, makeMeasureSpec2, 0), View.resolveSizeAndState(i3, makeMeasureSpec, 0));
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.i = colorStateList;
        j58[] j58VarArr = this.g;
        if (j58VarArr == null) {
            return;
        }
        for (j58 j58Var : j58VarArr) {
            if (j58Var.getItemData() == null || j58Var.getItemData().s == null) {
                j58Var.setIconTintList(colorStateList);
            }
        }
    }

    public void setIndicatorDot(int i) {
        for (int i2 = 0; i2 < this.n.f.size(); i2++) {
            if (this.n.getItem(i2).getItemId() == i) {
                j58 j58Var = this.g[i2];
                j58Var.m.setVisibility(0);
                j58Var.o.setVisibility(0);
                j58Var.n.setVisibility(8);
                return;
            }
        }
    }

    public void setIndicatorInvisible(int i) {
        for (int i2 = 0; i2 < this.n.f.size(); i2++) {
            if (this.n.getItem(i2).getItemId() == i) {
                this.g[i2].m.setVisibility(8);
                return;
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.k = i;
        j58[] j58VarArr = this.g;
        if (j58VarArr == null) {
            return;
        }
        for (j58 j58Var : j58VarArr) {
            j58Var.setItemBackground(i);
        }
    }

    public void setItemOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.d = onLongClickListener;
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.j = colorStateList;
        j58[] j58VarArr = this.g;
        if (j58VarArr == null) {
            return;
        }
        for (j58 j58Var : j58VarArr) {
            j58Var.setTextColor(colorStateList);
        }
    }

    public void setPresenter(y58 y58Var) {
        this.m = y58Var;
        this.o.e = y58Var.e.d();
    }

    public void setTitlesVisibility(boolean z) {
        e58 e58Var = this.o;
        if (e58Var.a == z) {
            return;
        }
        e58Var.a = z;
        androidx.appcompat.view.menu.f fVar = this.n;
        if (fVar == null) {
            return;
        }
        e58Var.a();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            j58 j58Var = childAt instanceof j58 ? (j58) childAt : null;
            if (j58Var == null || i >= fVar.f.size()) {
                return;
            }
            MenuItem item = fVar.getItem(i);
            e58Var.b(j58Var, item);
            j58Var.setShiftingMode(e58Var.b && !e58Var.c);
            e58Var.c(j58Var, item);
        }
    }
}
