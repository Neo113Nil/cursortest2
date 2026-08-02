package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.MaterialCheckable;
import defpackage.bqb;
import defpackage.cqb;
import defpackage.dqb;
import defpackage.eng0;
import defpackage.g2i0;
import defpackage.g810;
import defpackage.gib;
import defpackage.th;
import defpackage.yfa;
import defpackage.yvy0;
import defpackage.z2i0;
import java.util.List;

/* loaded from: classes11.dex */
public class ChipGroup extends FlowLayout {
    private static final int DEF_STYLE_RES = g2i0.Widget_MaterialComponents_ChipGroup;
    private final gib checkableGroup;
    private int chipSpacingHorizontal;
    private int chipSpacingVertical;
    private final int defaultCheckedId;
    private dqb onCheckedStateChangeListener;
    private final PassThroughHierarchyChangeListener passThroughListener;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(g810.b(context, attributeSet, i, r4), attributeSet, i);
        int i2 = DEF_STYLE_RES;
        gib gibVar = new gib();
        this.checkableGroup = gibVar;
        PassThroughHierarchyChangeListener passThroughHierarchyChangeListener = new PassThroughHierarchyChangeListener(this, null);
        this.passThroughListener = passThroughHierarchyChangeListener;
        TypedArray d = yvy0.d(getContext(), attributeSet, z2i0.ChipGroup, i, i2, new int[0]);
        int dimensionPixelOffset = d.getDimensionPixelOffset(z2i0.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(d.getDimensionPixelOffset(z2i0.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(d.getDimensionPixelOffset(z2i0.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(d.getBoolean(z2i0.ChipGroup_singleLine, false));
        setSingleSelection(d.getBoolean(z2i0.ChipGroup_singleSelection, false));
        setSelectionRequired(d.getBoolean(z2i0.ChipGroup_selectionRequired, false));
        this.defaultCheckedId = d.getResourceId(z2i0.ChipGroup_checkedChip, -1);
        d.recycle();
        gibVar.c = new bqb(this);
        super.setOnHierarchyChangeListener(passThroughHierarchyChangeListener);
    }

    private int getVisibleChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof Chip) && isChildVisible(i2)) {
                i++;
            }
        }
        return i;
    }

    private boolean isChildVisible(int i) {
        return getChildAt(i).getVisibility() == 0;
    }

    public void check(int i) {
        gib gibVar = this.checkableGroup;
        MaterialCheckable materialCheckable = (MaterialCheckable) gibVar.a.get(Integer.valueOf(i));
        if (materialCheckable != null && gibVar.a(materialCheckable)) {
            gibVar.e();
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public void clearCheck() {
        this.checkableGroup.b();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.checkableGroup.d();
    }

    public List<Integer> getCheckedChipIds() {
        return this.checkableGroup.c(this);
    }

    public int getChipSpacingHorizontal() {
        return this.chipSpacingHorizontal;
    }

    public int getChipSpacingVertical() {
        return this.chipSpacingVertical;
    }

    public int getIndexOfChip(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof Chip) && isChildVisible(i2)) {
                if (((Chip) childAt) == view) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public boolean isSelectionRequired() {
        return this.checkableGroup.e;
    }

    @Override // com.google.android.material.internal.FlowLayout
    public boolean isSingleLine() {
        return super.isSingleLine();
    }

    public boolean isSingleSelection() {
        return this.checkableGroup.d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.defaultCheckedId;
        if (i != -1) {
            gib gibVar = this.checkableGroup;
            MaterialCheckable materialCheckable = (MaterialCheckable) gibVar.a.get(Integer.valueOf(i));
            if (materialCheckable != null && gibVar.a(materialCheckable)) {
                gibVar.e();
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) th.a(getRowCount(), isSingleLine() ? getVisibleChipCount() : -1, isSingleSelection() ? 1 : 2, false).a);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.chipSpacingHorizontal != i) {
            this.chipSpacingHorizontal = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.chipSpacingVertical != i) {
            this.chipSpacingVertical = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(cqb cqbVar) {
        if (cqbVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new yfa(this));
        }
    }

    public void setOnCheckedStateChangeListener(dqb dqbVar) {
        this.onCheckedStateChangeListener = dqbVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.passThroughListener.onHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.checkableGroup.e = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        gib gibVar = this.checkableGroup;
        if (gibVar.d != z) {
            gibVar.d = z;
            gibVar.b();
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public class PassThroughHierarchyChangeListener implements ViewGroup.OnHierarchyChangeListener {
        private ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener;

        private PassThroughHierarchyChangeListener() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(View.generateViewId());
                }
                gib gibVar = ChipGroup.this.checkableGroup;
                Chip chip = (Chip) view2;
                gibVar.a.put(Integer.valueOf(chip.getId()), chip);
                if (chip.isChecked()) {
                    gibVar.a(chip);
                }
                chip.setInternalOnCheckedChangeListener(new yfa(gibVar));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.onHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                gib gibVar = chipGroup.checkableGroup;
                Chip chip = (Chip) view2;
                gibVar.getClass();
                chip.setInternalOnCheckedChangeListener(null);
                gibVar.a.remove(Integer.valueOf(chip.getId()));
                gibVar.b.remove(Integer.valueOf(chip.getId()));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.onHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        public /* synthetic */ PassThroughHierarchyChangeListener(ChipGroup chipGroup, bqb bqbVar) {
            this();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.chipGroupStyle);
    }

    public ChipGroup(Context context) {
        this(context, null);
    }
}
