package xsna;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$integer;
import com.google.android.material.navigation.NavigationBarPresenter;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashSet;
import java.util.WeakHashMap;
import xsna.am;

/* compiled from: NavigationBarMenuView.java */
/* loaded from: classes13.dex */
public abstract class rw50 extends ViewGroup implements androidx.appcompat.view.menu.k {
    public static final int[] G = {R.attr.state_checked};
    public static final int[] H = {-16842910};
    public int A;
    public com.google.android.material.shape.a B;
    public boolean C;
    public ColorStateList D;
    public NavigationBarPresenter E;
    public androidx.appcompat.view.menu.f F;

    @Nullable
    public final mk5 b;

    @NonNull
    public final a c;
    public final vvb0 d;

    @NonNull
    public final SparseArray<View.OnTouchListener> e;
    public int f;

    @Nullable
    public ow50[] g;
    public int h;
    public int i;

    @Nullable
    public ColorStateList j;
    public int k;
    public ColorStateList l;

    @Nullable
    public final ColorStateList m;
    public int n;
    public int o;
    public boolean p;
    public Drawable q;

    @Nullable
    public ColorStateList r;
    public int s;

    @NonNull
    public final SparseArray<com.google.android.material.badge.a> t;
    public int u;
    public int v;
    public int w;
    public boolean x;
    public int y;
    public int z;

    /* compiled from: NavigationBarMenuView.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            androidx.appcompat.view.menu.h itemData = ((ow50) view).getItemData();
            rw50 rw50Var = rw50.this;
            if (rw50Var.F.q(itemData, rw50Var.E, 0)) {
                return;
            }
            itemData.setChecked(true);
        }
    }

    public rw50(@NonNull Context context) {
        super(context);
        this.d = new vvb0(5);
        this.e = new SparseArray<>(5);
        this.h = 0;
        this.i = 0;
        this.t = new SparseArray<>(5);
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.C = false;
        this.m = c();
        if (isInEditMode()) {
            this.b = null;
        } else {
            mk5 mk5Var = new mk5();
            this.b = mk5Var;
            mk5Var.g(0);
            mk5Var.e(tb30.c(R$attr.motionDurationMedium4, getResources().getInteger(R$integer.material_motion_duration_long_1), getContext()));
            mk5Var.setInterpolator(tb30.d(getContext(), R$attr.motionEasingStandard, rq2.b));
            mk5Var.c(new vko0());
        }
        this.c = new a();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        setImportantForAccessibility(1);
    }

    public static boolean f(int i, int i2) {
        return i == -1 ? i2 > 3 : i == 0;
    }

    private ow50 getNewItem() {
        ow50 ow50Var = (ow50) this.d.c();
        return ow50Var == null ? e(getContext()) : ow50Var;
    }

    private void setBadgeIfNeeded(@NonNull ow50 ow50Var) {
        com.google.android.material.badge.a aVar;
        int id = ow50Var.getId();
        if (id == -1 || (aVar = this.t.get(id)) == null) {
            return;
        }
        ow50Var.setBadge(aVar);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void a() {
        removeAllViews();
        ow50[] ow50VarArr = this.g;
        if (ow50VarArr != null) {
            for (ow50 ow50Var : ow50VarArr) {
                if (ow50Var != null) {
                    this.d.a(ow50Var);
                    ImageView imageView = ow50Var.o;
                    if (ow50Var.G != null) {
                        if (imageView != null) {
                            ow50Var.setClipChildren(true);
                            ow50Var.setClipToPadding(true);
                            com.google.android.material.badge.a aVar = ow50Var.G;
                            if (aVar != null) {
                                if (aVar.d() != null) {
                                    aVar.d().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(aVar);
                                }
                            }
                        }
                        ow50Var.G = null;
                    }
                    ow50Var.u = null;
                    ow50Var.A = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    ow50Var.b = false;
                }
            }
        }
        if (this.F.f.size() == 0) {
            this.h = 0;
            this.i = 0;
            this.g = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.F.f.size(); i++) {
            hashSet.add(Integer.valueOf(this.F.getItem(i).getItemId()));
        }
        int i2 = 0;
        while (true) {
            SparseArray<com.google.android.material.badge.a> sparseArray = this.t;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                sparseArray.delete(keyAt);
            }
            i2++;
        }
        this.g = new ow50[this.F.f.size()];
        boolean f = f(this.f, this.F.l().size());
        for (int i3 = 0; i3 < this.F.f.size(); i3++) {
            this.E.c = true;
            this.F.getItem(i3).setCheckable(true);
            this.E.c = false;
            ow50 newItem = getNewItem();
            this.g[i3] = newItem;
            newItem.setIconTintList(this.j);
            newItem.setIconSize(this.k);
            newItem.setTextColor(this.m);
            newItem.setTextAppearanceInactive(this.n);
            newItem.setTextAppearanceActive(this.o);
            newItem.setTextAppearanceActiveBoldEnabled(this.p);
            newItem.setTextColor(this.l);
            int i4 = this.u;
            if (i4 != -1) {
                newItem.setItemPaddingTop(i4);
            }
            int i5 = this.v;
            if (i5 != -1) {
                newItem.setItemPaddingBottom(i5);
            }
            int i6 = this.w;
            if (i6 != -1) {
                newItem.setActiveIndicatorLabelPadding(i6);
            }
            newItem.setActiveIndicatorWidth(this.y);
            newItem.setActiveIndicatorHeight(this.z);
            newItem.setActiveIndicatorMarginHorizontal(this.A);
            newItem.setActiveIndicatorDrawable(d());
            newItem.setActiveIndicatorResizeable(this.C);
            newItem.setActiveIndicatorEnabled(this.x);
            Drawable drawable = this.q;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.s);
            }
            newItem.setItemRippleColor(this.r);
            newItem.setShifting(f);
            newItem.setLabelVisibilityMode(this.f);
            androidx.appcompat.view.menu.h hVar = (androidx.appcompat.view.menu.h) this.F.getItem(i3);
            newItem.c(hVar);
            newItem.setItemPosition(i3);
            int i7 = hVar.a;
            newItem.setOnTouchListener(this.e.get(i7));
            newItem.setOnClickListener(this.c);
            int i8 = this.h;
            if (i8 != 0 && i7 == i8) {
                this.i = i3;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.F.f.size() - 1, this.i);
        this.i = min;
        this.F.getItem(min).setChecked(true);
    }

    @Override // androidx.appcompat.view.menu.k
    public final void b(@NonNull androidx.appcompat.view.menu.f fVar) {
        this.F = fVar;
    }

    @Nullable
    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList b = anj.b(typedValue.resourceId, getContext());
        if (!getContext().getTheme().resolveAttribute(com.vkontakte.android.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = b.getDefaultColor();
        int[] iArr = G;
        int[] iArr2 = ViewGroup.EMPTY_STATE_SET;
        int[] iArr3 = H;
        return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{b.getColorForState(iArr3, defaultColor), i, defaultColor});
    }

    @Nullable
    public final MaterialShapeDrawable d() {
        if (this.B == null || this.D == null) {
            return null;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.B);
        materialShapeDrawable.setFillColor(this.D);
        return materialShapeDrawable;
    }

    @NonNull
    public abstract ow50 e(@NonNull Context context);

    public int getActiveIndicatorLabelPadding() {
        return this.w;
    }

    public SparseArray<com.google.android.material.badge.a> getBadgeDrawables() {
        return this.t;
    }

    @Nullable
    public ColorStateList getIconTintList() {
        return this.j;
    }

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.D;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.x;
    }

    public int getItemActiveIndicatorHeight() {
        return this.z;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.A;
    }

    @Nullable
    public com.google.android.material.shape.a getItemActiveIndicatorShapeAppearance() {
        return this.B;
    }

    public int getItemActiveIndicatorWidth() {
        return this.y;
    }

    @Nullable
    public Drawable getItemBackground() {
        ow50[] ow50VarArr = this.g;
        return (ow50VarArr == null || ow50VarArr.length <= 0) ? this.q : ow50VarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.s;
    }

    public int getItemIconSize() {
        return this.k;
    }

    public int getItemPaddingBottom() {
        return this.v;
    }

    public int getItemPaddingTop() {
        return this.u;
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.r;
    }

    public int getItemTextAppearanceActive() {
        return this.o;
    }

    public int getItemTextAppearanceInactive() {
        return this.n;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.l;
    }

    public int getLabelVisibilityMode() {
        return this.f;
    }

    @Nullable
    public androidx.appcompat.view.menu.f getMenu() {
        return this.F;
    }

    public int getSelectedItemId() {
        return this.h;
    }

    public int getSelectedItemPosition() {
        return this.i;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) am.g.a(1, this.F.l().size(), 1, false).a);
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.w = i;
        ow50[] ow50VarArr = this.g;
        if (ow50VarArr != null) {
            for (ow50 ow50Var : ow50VarArr) {
                ow50Var.setActiveIndicatorLabelPadding(i);
            }
        }
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        this.j = colorStateList;
        ow50[] ow50VarArr = this.g;
        if (ow50VarArr != null) {
            for (ow50 ow50Var : ow50VarArr) {
                ow50Var.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList) {
        this.D = colorStateList;
        ow50[] ow50VarArr = this.g;
        if (ow50VarArr != null) {
            for (ow50 ow50Var : ow50VarArr) {
                ow50Var.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.x = z;
        ow50[] ow50VarArr = this.g;
        if (ow50VarArr != null) {
            for (ow50 ow50Var : ow50VarArr) {
                ow50Var.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.z = i;
        ow50[] ow50VarArr = this.g;
        if (ow50VarArr != null) {
            for (ow50 ow50Var : ow50VarArr) {
                ow50Var.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.A = i;
        ow50[] ow50VarArr = this.g;
        if (ow50VarArr != null) {
            for (ow50 ow50Var : ow50VarArr) {
                ow50Var.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.C = z;
        ow50[] ow50VarArr = this.g;
        if (ow50VarArr != null) {
            for (ow50 ow50Var : ow50VarArr) {
                ow50Var.setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable com.google.android.material.shape.a aVar) {
        this.B = aVar;
        ow50[] ow50VarArr = this.g;
        if (ow50VarArr != null) {
            for (ow50 ow50Var : ow50VarArr) {
                ow50Var.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.y = i;
        ow50[] ow50VarArr = this.g;
        if (ow50VarArr != null) {
            for (ow50 ow50Var : ow50VarArr) {
                ow50Var.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.q = drawable;
        ow50[] ow50VarArr = this.g;
        if (ow50VarArr != null) {
            for (ow50 ow50Var : ow50VarArr) {
                ow50Var.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.s = i;
        ow50[] ow50VarArr = this.g;
        if (ow50VarArr != null) {
            for (ow50 ow50Var : ow50VarArr) {
                ow50Var.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.k = i;
        ow50[] ow50VarArr = this.g;
        if (ow50VarArr != null) {
            for (ow50 ow50Var : ow50VarArr) {
                ow50Var.setIconSize(i);
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.v = i;
        ow50[] ow50VarArr = this.g;
        if (ow50VarArr != null) {
            for (ow50 ow50Var : ow50VarArr) {
                ow50Var.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.u = i;
        ow50[] ow50VarArr = this.g;
        if (ow50VarArr != null) {
            for (ow50 ow50Var : ow50VarArr) {
                ow50Var.setItemPaddingTop(i);
            }
        }
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.r = colorStateList;
        ow50[] ow50VarArr = this.g;
        if (ow50VarArr != null) {
            for (ow50 ow50Var : ow50VarArr) {
                ow50Var.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.o = i;
        ow50[] ow50VarArr = this.g;
        if (ow50VarArr != null) {
            for (ow50 ow50Var : ow50VarArr) {
                ow50Var.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.l;
                if (colorStateList != null) {
                    ow50Var.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.p = z;
        ow50[] ow50VarArr = this.g;
        if (ow50VarArr != null) {
            for (ow50 ow50Var : ow50VarArr) {
                ow50Var.setTextAppearanceActiveBoldEnabled(z);
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.n = i;
        ow50[] ow50VarArr = this.g;
        if (ow50VarArr != null) {
            for (ow50 ow50Var : ow50VarArr) {
                ow50Var.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.l;
                if (colorStateList != null) {
                    ow50Var.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.l = colorStateList;
        ow50[] ow50VarArr = this.g;
        if (ow50VarArr != null) {
            for (ow50 ow50Var : ow50VarArr) {
                ow50Var.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f = i;
    }

    public void setPresenter(@NonNull NavigationBarPresenter navigationBarPresenter) {
        this.E = navigationBarPresenter;
    }
}
