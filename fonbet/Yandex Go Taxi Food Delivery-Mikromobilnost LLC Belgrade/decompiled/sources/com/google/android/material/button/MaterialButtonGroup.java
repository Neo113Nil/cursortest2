package com.google.android.material.button;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.k;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.shape.StateListSizeChange;
import com.google.android.material.shape.b;
import com.google.android.material.shape.c;
import com.google.android.material.shape.e;
import defpackage.eng0;
import defpackage.fhr0;
import defpackage.g2i0;
import defpackage.g810;
import defpackage.h710;
import defpackage.i710;
import defpackage.jvh0;
import defpackage.kxh0;
import defpackage.ny61;
import defpackage.oe7;
import defpackage.org0;
import defpackage.s4u0;
import defpackage.s6;
import defpackage.u4u0;
import defpackage.xre;
import defpackage.yib1;
import defpackage.yvy0;
import defpackage.z2i0;
import defpackage.z610;
import defpackage.zgv;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes11.dex */
public class MaterialButtonGroup extends LinearLayout {
    private static final String LOG_TAG = "MButtonGroup";
    public static final int OVERFLOW_MODE_MENU = 1;
    public static final int OVERFLOW_MODE_NONE = 0;
    public static final int OVERFLOW_MODE_WRAP = 2;
    private boolean buttonOverflowInitialized;
    private StateListSizeChange buttonSizeChange;
    private final Map<Button, MenuItem> buttonToMenuItemMapping;
    private Integer[] childOrder;
    private final Comparator<MaterialButton> childOrderComparator;
    private boolean childShapesDirty;
    private c groupStateListShapeAppearance;
    s4u0 innerCornerSize;
    private final List<fhr0> originalChildShapeAppearanceModels;
    private MaterialButton overflowButton;
    private final List<Button> overflowButtonsList;
    private final int overflowMenuItemIconPadding;
    private int overflowMode;
    private k popupMenu;
    private final Map<Integer, Button> popupMenuItemToButtonMapping;
    private final i710 pressedStateTracker;
    private final List<Integer> rowButtonFirstIndices;
    private int spacing;
    private final List<Button> tempOverflowButtonsList;
    private static final int DEF_STYLE_RES = g2i0.Widget_Material3_MaterialButtonGroup;
    public static final Object OVERFLOW_BUTTON_TAG = new Object();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialButtonGroup(Context context, AttributeSet attributeSet, int i) {
        super(g810.b(context, attributeSet, i, r5), attributeSet, i);
        s4u0 b;
        XmlResourceParser xml;
        int next;
        int next2;
        int i2 = DEF_STYLE_RES;
        this.overflowMode = 0;
        this.originalChildShapeAppearanceModels = new ArrayList();
        this.pressedStateTracker = new i710(this);
        this.childOrderComparator = new oe7(5, this);
        this.childShapesDirty = true;
        this.popupMenuItemToButtonMapping = new HashMap();
        this.buttonToMenuItemMapping = new HashMap();
        this.tempOverflowButtonsList = new ArrayList();
        this.overflowButtonsList = new ArrayList();
        this.rowButtonFirstIndices = new ArrayList();
        Context context2 = getContext();
        TypedArray d = yvy0.d(context2, attributeSet, z2i0.MaterialButtonGroup, i, i2, new int[0]);
        if (d.hasValue(z2i0.MaterialButtonGroup_buttonSizeChange)) {
            int resourceId = d.getResourceId(z2i0.MaterialButtonGroup_buttonSizeChange, 0);
            StateListSizeChange stateListSizeChange = null;
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        StateListSizeChange stateListSizeChange2 = new StateListSizeChange();
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                        if (next2 != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            stateListSizeChange2.a(context2, xml, asAttributeSet, context2.getTheme());
                        }
                        xml.close();
                        stateListSizeChange = stateListSizeChange2;
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
            }
            this.buttonSizeChange = stateListSizeChange;
        }
        if (d.hasValue(z2i0.MaterialButtonGroup_shapeAppearance)) {
            c h = c.h(context2, d, z2i0.MaterialButtonGroup_shapeAppearance);
            this.groupStateListShapeAppearance = h;
            if (h == null) {
                this.groupStateListShapeAppearance = new u4u0(b.g(context2, d.getResourceId(z2i0.MaterialButtonGroup_shapeAppearance, 0), d.getResourceId(z2i0.MaterialButtonGroup_shapeAppearanceOverlay, 0)).a()).b();
            }
        }
        if (d.hasValue(z2i0.MaterialButtonGroup_innerCornerSize)) {
            int i3 = z2i0.MaterialButtonGroup_innerCornerSize;
            s6 s6Var = new s6(0.0f);
            int resourceId2 = d.getResourceId(i3, 0);
            if (resourceId2 == 0) {
                b = s4u0.b(b.k(d, i3, s6Var));
            } else if (context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId2);
                    try {
                        s4u0 s4u0Var = new s4u0();
                        AttributeSet asAttributeSet2 = Xml.asAttributeSet(xml);
                        do {
                            next = xml.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            s4u0Var.d(context2, xml, asAttributeSet2, context2.getTheme());
                        }
                        xml.close();
                        b = s4u0Var;
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    b = s4u0.b(s6Var);
                }
            } else {
                b = s4u0.b(b.k(d, i3, s6Var));
            }
            this.innerCornerSize = b;
        }
        this.spacing = d.getDimensionPixelSize(z2i0.MaterialButtonGroup_android_spacing, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(d.getBoolean(z2i0.MaterialButtonGroup_android_enabled, true));
        setOverflowMode(d.getInt(z2i0.MaterialButtonGroup_overflowMode, 0));
        this.overflowMenuItemIconPadding = getResources().getDimensionPixelOffset(org0.m3_btn_group_overflow_item_icon_horizontal_padding);
        if (isOverflowMenuSupported()) {
            initializeButtonOverflow(context2, d);
        }
        d.recycle();
    }

    private MenuItem addMenuItemForButton(Menu menu, Button button) {
        if (!(button.getLayoutParams() instanceof LayoutParams)) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) button.getLayoutParams();
        CharSequence e = yib1.e(button, layoutParams.overflowText);
        Drawable drawable = layoutParams.overflowIcon;
        MenuItem add = menu.add(e);
        if (drawable != null) {
            int i = this.overflowMenuItemIconPadding;
            add.setIcon(new InsetDrawable(drawable, i, 0, i, 0));
        }
        add.setOnMenuItemClickListener(new h710(0, button));
        return add;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void adjustChildMarginsAndUpdateLayout() {
        int i;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            View childAt2 = getChildAt(i2 - 1);
            if ((childAt instanceof MaterialButton) && (childAt2 instanceof MaterialButton)) {
                MaterialButton materialButton = (MaterialButton) childAt;
                MaterialButton materialButton2 = (MaterialButton) childAt2;
                if (this.spacing <= 0) {
                    i = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                    materialButton.setShouldDrawSurfaceColorStroke(true);
                    materialButton2.setShouldDrawSurfaceColorStroke(true);
                    LinearLayout.LayoutParams buildLayoutParams = buildLayoutParams(childAt);
                    if (getOrientation() != 0) {
                        buildLayoutParams.setMarginEnd(0);
                        buildLayoutParams.setMarginStart(this.spacing - i);
                        buildLayoutParams.topMargin = 0;
                    } else {
                        buildLayoutParams.bottomMargin = 0;
                        buildLayoutParams.topMargin = this.spacing - i;
                        buildLayoutParams.setMarginStart(0);
                    }
                    childAt.setLayoutParams(buildLayoutParams);
                } else {
                    materialButton.setShouldDrawSurfaceColorStroke(false);
                    materialButton2.setShouldDrawSurfaceColorStroke(false);
                }
            }
            i = 0;
            LinearLayout.LayoutParams buildLayoutParams2 = buildLayoutParams(childAt);
            if (getOrientation() != 0) {
            }
            childAt.setLayoutParams(buildLayoutParams2);
        }
        resetChildMargins(firstVisibleChildIndex);
    }

    private void adjustChildSizeChange() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        if (firstVisibleChildIndex == -1 || this.buttonSizeChange == null) {
            return;
        }
        if (this.overflowMode != 2) {
            adjustChildSizeChangeInRange(firstVisibleChildIndex, lastVisibleChildIndex);
            return;
        }
        int i = 0;
        while (i < this.rowButtonFirstIndices.size()) {
            adjustChildSizeChangeInRange(this.rowButtonFirstIndices.get(i).intValue(), (i == this.rowButtonFirstIndices.size() + (-1) ? getChildCount() : this.rowButtonFirstIndices.get(i + 1).intValue()) - 1);
            i++;
        }
    }

    private void adjustChildSizeChangeInRange(int i, int i2) {
        if (i == i2) {
            getChildButton(i).setWidthChangeDirection(MaterialButton.WidthChangeDirection.NONE);
            return;
        }
        int i3 = Integer.MAX_VALUE;
        int i4 = i;
        while (i4 <= i2) {
            if (isChildVisible(i4)) {
                getChildButton(i4).setWidthChangeDirection(i4 == i ? MaterialButton.WidthChangeDirection.END : i4 == i2 ? MaterialButton.WidthChangeDirection.START : MaterialButton.WidthChangeDirection.BOTH);
                int buttonAllowedWidthIncrease = getButtonAllowedWidthIncrease(i4);
                if (i4 != i && i4 != i2) {
                    buttonAllowedWidthIncrease /= 2;
                }
                i3 = Math.min(i3, buttonAllowedWidthIncrease);
            }
            i4++;
        }
        while (i <= i2) {
            if (isChildVisible(i)) {
                MaterialButton childButton = getChildButton(i);
                childButton.setSizeChange(this.buttonSizeChange);
                childButton.setWidthChangeMax(i3 * 2);
            }
            i++;
        }
    }

    private int getButtonAllowedWidthIncrease(int i) {
        float max;
        if (!isChildVisible(i) || this.buttonSizeChange == null) {
            return 0;
        }
        MaterialButton childButton = getChildButton(i);
        StateListSizeChange stateListSizeChange = this.buttonSizeChange;
        int width = childButton.getWidth();
        int i2 = -width;
        for (int i3 = 0; i3 < stateListSizeChange.a; i3++) {
            e eVar = stateListSizeChange.d[i3].a;
            StateListSizeChange.SizeChangeType sizeChangeType = eVar.a;
            float f = eVar.b;
            if (sizeChangeType == StateListSizeChange.SizeChangeType.PIXELS) {
                max = Math.max(i2, f);
            } else if (sizeChangeType == StateListSizeChange.SizeChangeType.PERCENT) {
                max = Math.max(i2, width * f);
            }
            i2 = (int) max;
        }
        int max2 = Math.max(0, i2);
        MaterialButton prevVisibleChildButton = getPrevVisibleChildButton(i, true);
        int allowedWidthDecrease = prevVisibleChildButton == null ? 0 : prevVisibleChildButton.getAllowedWidthDecrease();
        MaterialButton nextVisibleChildButton = getNextVisibleChildButton(i, true);
        return Math.min(max2, allowedWidthDecrease + (nextVisibleChildButton != null ? nextVisibleChildButton.getAllowedWidthDecrease() : 0));
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (isChildVisible(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (isChildVisible(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private MaterialButton getNextVisibleChildButton(int i, boolean z) {
        int childCount = getChildCount();
        int i2 = i + 1;
        while (true) {
            if (i2 >= childCount) {
                i2 = -1;
                break;
            }
            if (isChildVisible(i2)) {
                break;
            }
            i2++;
        }
        if (z && !this.rowButtonFirstIndices.isEmpty()) {
            int i3 = 0;
            while (i3 < this.rowButtonFirstIndices.size()) {
                int intValue = this.rowButtonFirstIndices.get(i3).intValue();
                int intValue2 = i3 == this.rowButtonFirstIndices.size() + (-1) ? childCount - 1 : this.rowButtonFirstIndices.get(i3 + 1).intValue() - 1;
                if (i >= intValue && i <= intValue2 && (i2 < intValue || i2 > intValue2)) {
                    return null;
                }
                i3++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return getChildButton(i2);
    }

    private u4u0 getOriginalStateListShapeBuilder(boolean z, boolean z2, int i) {
        Object obj = this.groupStateListShapeAppearance;
        if (obj == null || (!z && !z2)) {
            obj = (fhr0) this.originalChildShapeAppearanceModels.get(i);
        }
        return !(obj instanceof c) ? new u4u0((b) this.originalChildShapeAppearanceModels.get(i)) : ((c) obj).j();
    }

    private MaterialButton getPrevVisibleChildButton(int i, boolean z) {
        int childCount = getChildCount();
        int i2 = i - 1;
        while (true) {
            if (i2 < 0) {
                i2 = -1;
                break;
            }
            if (isChildVisible(i2)) {
                break;
            }
            i2--;
        }
        if (z && !this.rowButtonFirstIndices.isEmpty()) {
            int i3 = 0;
            while (i3 < this.rowButtonFirstIndices.size()) {
                int intValue = this.rowButtonFirstIndices.get(i3).intValue();
                int intValue2 = i3 == this.rowButtonFirstIndices.size() + (-1) ? childCount : this.rowButtonFirstIndices.get(i3 + 1).intValue();
                if (i >= intValue && i < intValue2 && (i2 < intValue || i2 >= intValue2)) {
                    return null;
                }
                i3++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return getChildButton(i2);
    }

    private boolean isChildVisible(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$addMenuItemForButton$2(Button button, MenuItem menuItem) {
        button.performClick();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeButtonOverflow$1(View view) {
        updateOverflowMenuItemsState();
        this.popupMenu.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int lambda$new$0(MaterialButton materialButton, MaterialButton materialButton2) {
        int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
        return compareTo2 != 0 ? compareTo2 : Integer.compare(indexOfChild(materialButton), indexOfChild(materialButton2));
    }

    private void maybeUpdateOverflowMenu(int i, int i2) {
        if (this.buttonOverflowInitialized) {
            if (this.overflowMode != 1) {
                this.overflowButton.setVisibility(8);
                return;
            }
            boolean z = getOrientation() == 0;
            this.tempOverflowButtonsList.clear();
            int size = z ? View.MeasureSpec.getSize(i) : View.MeasureSpec.getSize(i2);
            int measureAndGetChildButtonSize = measureAndGetChildButtonSize(z, this.overflowButton, i, i2);
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i3 >= getChildCount() - 1) {
                    this.overflowButton.setVisibility(8);
                    this.tempOverflowButtonsList.clear();
                    break;
                }
                MaterialButton childButton = getChildButton(i3);
                i4 += measureAndGetChildButtonSize(z, childButton, i, i2);
                if (i4 + measureAndGetChildButtonSize > size) {
                    this.tempOverflowButtonsList.add(childButton);
                }
                if (i4 > size) {
                    for (int i5 = i3 + 1; i5 < getChildCount() - 1; i5++) {
                        this.tempOverflowButtonsList.add(getChildButton(i5));
                    }
                    this.overflowButton.setVisibility(0);
                } else {
                    i3++;
                }
            }
            maybeUpdateOverflowMenuItemsAndChildVisibility();
        }
    }

    private void maybeUpdateOverflowMenuItemsAndChildVisibility() {
        if (this.tempOverflowButtonsList.equals(this.overflowButtonsList)) {
            return;
        }
        for (int i = 0; i < getChildCount() - 1; i++) {
            MaterialButton childButton = getChildButton(i);
            if (this.buttonToMenuItemMapping.containsKey(childButton)) {
                childButton.setVisibility(0);
            }
        }
        this.overflowButtonsList.clear();
        this.overflowButtonsList.addAll(this.tempOverflowButtonsList);
        MenuBuilder menuBuilder = this.popupMenu.a;
        this.popupMenuItemToButtonMapping.clear();
        this.buttonToMenuItemMapping.clear();
        menuBuilder.clear();
        for (Button button : this.overflowButtonsList) {
            MenuItem addMenuItemForButton = addMenuItemForButton(menuBuilder, button);
            if (addMenuItemForButton != null) {
                this.popupMenuItemToButtonMapping.put(Integer.valueOf(addMenuItemForButton.getItemId()), button);
                this.buttonToMenuItemMapping.put(button, addMenuItemForButton);
                button.setVisibility(8);
            }
        }
        updateOverflowMenuItemsState();
    }

    private int maybeWrapButtons(int i, int i2) {
        this.rowButtonFirstIndices.clear();
        int size = View.MeasureSpec.getSize(i);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            if (isChildVisible(i6)) {
                MaterialButton childButton = getChildButton(i6);
                measureChild(childButton, i, i2);
                int measuredWidth = childButton.getMeasuredWidth();
                int measuredHeight = childButton.getMeasuredHeight();
                if (measuredWidth > 0) {
                    LinearLayout.LayoutParams buildLayoutParams = buildLayoutParams(childButton);
                    if (i3 + measuredWidth + (arrayList.isEmpty() ? 0 : this.spacing) > size || arrayList.isEmpty()) {
                        if (!arrayList.isEmpty()) {
                            arrayList2.add(Integer.valueOf(i3));
                        }
                        i5 += i4 + (this.rowButtonFirstIndices.isEmpty() ? 0 : this.spacing);
                        this.rowButtonFirstIndices.add(Integer.valueOf(i6));
                        buildLayoutParams.setMarginStart(-i3);
                        arrayList.clear();
                        i3 = 0;
                        i4 = 0;
                    }
                    i3 += measuredWidth + (i3 == 0 ? 0 : this.spacing);
                    i4 = Math.max(i4, measuredHeight);
                    arrayList.add(Integer.valueOf(i6));
                    buildLayoutParams.topMargin += i5;
                    childButton.setLayoutParams(buildLayoutParams);
                }
            }
        }
        arrayList2.add(Integer.valueOf(i3));
        int intValue = ((Integer) Collections.max(arrayList2)).intValue();
        int i7 = 0;
        for (int i8 = 0; i8 < this.rowButtonFirstIndices.size(); i8++) {
            int intValue2 = this.rowButtonFirstIndices.get(i8).intValue();
            int intValue3 = ((Integer) arrayList2.get(i8)).intValue();
            MaterialButton childButton2 = getChildButton(intValue2);
            LinearLayout.LayoutParams buildLayoutParams2 = buildLayoutParams(childButton2);
            int i9 = buildLayoutParams2.gravity & 8388615;
            int absoluteGravity = Gravity.getAbsoluteGravity(i9, getLayoutDirection());
            int i10 = intValue - intValue3;
            if (i9 != 8388611) {
                if (absoluteGravity == 1) {
                    i10 /= 2;
                }
                buildLayoutParams2.setMarginStart((buildLayoutParams2.getMarginStart() + i10) - i7);
                childButton2.setLayoutParams(buildLayoutParams2);
                i7 = i10;
            }
        }
        return getPaddingBottom() + getPaddingTop() + i5 + i4;
    }

    private int measureAndGetChildButtonSize(boolean z, Button button, int i, int i2) {
        int i3;
        int i4;
        measureChild(button, i, i2);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        int measuredWidth = z ? button.getMeasuredWidth() : button.getMeasuredHeight();
        if (z) {
            i3 = layoutParams.leftMargin;
            i4 = layoutParams.rightMargin;
        } else {
            i3 = layoutParams.topMargin;
            i4 = layoutParams.bottomMargin;
        }
        int i5 = i3 + i4;
        if (measuredWidth == 0) {
            measuredWidth = z ? button.getMinimumWidth() : button.getMinimumHeight();
        }
        return measuredWidth + i5;
    }

    private void recoverAllChildrenLayoutParams() {
        for (int i = 0; i < getChildCount(); i++) {
            getChildButton(i).recoverOriginalLayoutParams();
        }
    }

    private void resetChildMargins(int i) {
        if (getChildCount() == 0 || i == -1) {
            return;
        }
        LinearLayout.LayoutParams buildLayoutParams = buildLayoutParams(getChildButton(i));
        if (getOrientation() == 1) {
            buildLayoutParams.topMargin = 0;
            buildLayoutParams.bottomMargin = 0;
        } else {
            buildLayoutParams.setMarginEnd(0);
            buildLayoutParams.setMarginStart(0);
            buildLayoutParams.leftMargin = 0;
            buildLayoutParams.rightMargin = 0;
        }
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    private void updateChildOrder() {
        TreeMap treeMap = new TreeMap(this.childOrderComparator);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(getChildButton(i), Integer.valueOf(i));
        }
        this.childOrder = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void updateOverflowMenuItemsState() {
        for (Map.Entry<Button, MenuItem> entry : this.buttonToMenuItemMapping.entrySet()) {
            Button key = entry.getKey();
            MenuItem value = entry.getValue();
            if (entry.getKey() instanceof MaterialButton) {
                MaterialButton materialButton = (MaterialButton) key;
                value.setCheckable(materialButton.isCheckable());
                value.setChecked(materialButton.isChecked());
            }
            value.setEnabled(key.isEnabled());
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(LOG_TAG, "Child views must be of type MaterialButton.");
            return;
        }
        recoverAllChildrenLayoutParams();
        this.childShapesDirty = true;
        int indexOfChild = indexOfChild(this.overflowButton);
        if (indexOfChild < 0 || i != -1) {
            super.addView(view, i, layoutParams);
        } else {
            super.addView(view, indexOfChild, layoutParams);
        }
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.pressedStateTracker);
        this.originalChildShapeAppearanceModels.add(materialButton.getShapeAppearance());
        materialButton.setEnabled(isEnabled());
    }

    public LinearLayout.LayoutParams buildLayoutParams(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        updateChildOrder();
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new LayoutParams((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public StateListSizeChange getButtonSizeChange() {
        return this.buttonSizeChange;
    }

    public MaterialButton getChildButton(int i) {
        return (MaterialButton) getChildAt(i);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.childOrder;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    public b getChildOriginalShapeAppearanceModel(int i) {
        return this.originalChildShapeAppearanceModels.get(i).c();
    }

    public xre getInnerCornerSize() {
        return this.innerCornerSize.b;
    }

    public s4u0 getInnerCornerSizeStateList() {
        return this.innerCornerSize;
    }

    public Drawable getOverflowButtonIcon() {
        return this.overflowButton.getIcon();
    }

    public int getOverflowMode() {
        return this.overflowMode;
    }

    public b getShapeAppearance() {
        c cVar = this.groupStateListShapeAppearance;
        if (cVar == null) {
            return null;
        }
        return cVar.i();
    }

    public int getSpacing() {
        return this.spacing;
    }

    public c getStateListShapeAppearance() {
        return this.groupStateListShapeAppearance;
    }

    public void initializeButtonOverflow(Context context, TypedArray typedArray) {
        Drawable drawable = typedArray.getDrawable(z2i0.MaterialButtonGroup_overflowButtonIcon);
        MaterialButton materialButton = (MaterialButton) LayoutInflater.from(context).inflate(jvh0.m3_button_group_overflow_button, (ViewGroup) this, false);
        this.overflowButton = materialButton;
        materialButton.setTag(OVERFLOW_BUTTON_TAG);
        setOverflowButtonIcon(drawable);
        if (this.overflowButton.getContentDescription() == null) {
            this.overflowButton.setContentDescription(getResources().getString(kxh0.mtrl_button_overflow_icon_content_description));
        }
        this.overflowButton.setVisibility(8);
        k kVar = new k(getContext(), this.overflowButton, 17, 0, z610.e(eng0.materialButtonGroupPopupMenuStyle, this).data);
        this.popupMenu = kVar;
        kVar.c.e(true);
        this.overflowButton.setOnClickListener(new zgv(9, this));
        addView(this.overflowButton);
        this.buttonOverflowInitialized = true;
    }

    public boolean isOverflowMenuSupported() {
        return true;
    }

    public void onButtonWidthChanged(MaterialButton materialButton, int i) {
        int indexOfChild = indexOfChild(materialButton);
        if (indexOfChild < 0) {
            return;
        }
        MaterialButton prevVisibleChildButton = getPrevVisibleChildButton(indexOfChild, true);
        MaterialButton nextVisibleChildButton = getNextVisibleChildButton(indexOfChild, true);
        if (prevVisibleChildButton == null && nextVisibleChildButton == null) {
            return;
        }
        if (prevVisibleChildButton == null) {
            nextVisibleChildButton.setDisplayedWidthDecrease(i);
        }
        if (nextVisibleChildButton == null) {
            prevVisibleChildButton.setDisplayedWidthDecrease(i);
        }
        if (prevVisibleChildButton == null || nextVisibleChildButton == null) {
            return;
        }
        prevVisibleChildButton.setDisplayedWidthDecrease(i / 2);
        nextVisibleChildButton.setDisplayedWidthDecrease((i + 1) / 2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            recoverAllChildrenLayoutParams();
            adjustChildSizeChange();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        adjustChildMarginsAndUpdateLayout();
        if (this.overflowMode != 2) {
            i3 = 0;
        } else if (getOrientation() == 1) {
            ny61.g("The wrap overflow mode is not compatible to the vertical orientation.");
            return;
        } else {
            if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                ny61.g("The wrap overflow mode is not compatible with wrap_content layout width.");
                return;
            }
            i3 = maybeWrapButtons(i, i2);
        }
        maybeUpdateOverflowMenu(i, i2);
        updateChildShapes();
        super.onMeasure(i, i2);
        if (this.overflowMode != 2 || i3 == getMeasuredHeight()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), i3);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.originalChildShapeAppearanceModels.remove(indexOfChild);
        }
        this.childShapesDirty = true;
        updateChildShapes();
        recoverAllChildrenLayoutParams();
        adjustChildMarginsAndUpdateLayout();
    }

    public void setButtonSizeChange(StateListSizeChange stateListSizeChange) {
        if (this.buttonSizeChange != stateListSizeChange) {
            this.buttonSizeChange = stateListSizeChange;
            adjustChildSizeChange();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            getChildButton(i).setEnabled(z);
        }
    }

    public void setInnerCornerSize(xre xreVar) {
        this.innerCornerSize = s4u0.b(xreVar);
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    public void setInnerCornerSizeStateList(s4u0 s4u0Var) {
        this.innerCornerSize = s4u0Var;
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.childShapesDirty = true;
        }
        super.setOrientation(i);
    }

    public void setOverflowButtonIcon(Drawable drawable) {
        this.overflowButton.lambda$setSecondaryIcon$3(drawable);
    }

    public void setOverflowButtonIconResource(int i) {
        this.overflowButton.setIconResource(i);
    }

    public void setOverflowMode(int i) {
        if (this.overflowMode != i) {
            this.overflowMode = i;
            requestLayout();
            invalidate();
        }
    }

    public void setShapeAppearance(b bVar) {
        this.groupStateListShapeAppearance = new u4u0(bVar).b();
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    public void setSpacing(int i) {
        this.spacing = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(c cVar) {
        this.groupStateListShapeAppearance = cVar;
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    public void updateChildShapes() {
        int i;
        if (!(this.innerCornerSize == null && this.groupStateListShapeAppearance == null) && this.childShapesDirty) {
            this.childShapesDirty = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = 0;
            while (i2 < childCount) {
                MaterialButton childButton = getChildButton(i2);
                if (childButton.getVisibility() != 8) {
                    boolean z = i2 == firstVisibleChildIndex;
                    boolean z2 = i2 == lastVisibleChildIndex;
                    u4u0 originalStateListShapeBuilder = getOriginalStateListShapeBuilder(z, z2, i2);
                    boolean z3 = getOrientation() == 0;
                    boolean z4 = getLayoutDirection() == 1;
                    if (z3) {
                        i = z ? 5 : 0;
                        if (z2) {
                            i |= 10;
                        }
                        if (z4) {
                            i = ((i & 5) << 1) | ((i & 10) >> 1);
                        }
                    } else {
                        i = z ? 3 : 0;
                        if (z2) {
                            i |= 12;
                        }
                    }
                    int i3 = ~i;
                    s4u0 s4u0Var = this.innerCornerSize;
                    if ((i3 | 1) == i3) {
                        originalStateListShapeBuilder.e = s4u0Var;
                    }
                    if ((i3 | 2) == i3) {
                        originalStateListShapeBuilder.f = s4u0Var;
                    }
                    if ((i3 | 4) == i3) {
                        originalStateListShapeBuilder.g = s4u0Var;
                    }
                    if ((i3 | 8) == i3) {
                        originalStateListShapeBuilder.h = s4u0Var;
                    } else {
                        originalStateListShapeBuilder.getClass();
                    }
                    c b = originalStateListShapeBuilder.b();
                    boolean f = b.f();
                    fhr0 fhr0Var = b;
                    if (!f) {
                        fhr0Var = b.i();
                    }
                    childButton.setShapeAppearance(fhr0Var);
                }
                i2++;
            }
        }
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public Drawable overflowIcon;
        public CharSequence overflowText;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.overflowIcon = null;
            this.overflowText = null;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2i0.MaterialButtonGroup_Layout);
            this.overflowIcon = obtainStyledAttributes.getDrawable(z2i0.MaterialButtonGroup_Layout_layout_overflowIcon);
            this.overflowText = obtainStyledAttributes.getText(z2i0.MaterialButtonGroup_Layout_layout_overflowText);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.overflowIcon = null;
            this.overflowText = null;
        }

        public LayoutParams(int i, int i2, float f) {
            super(i, i2, f);
            this.overflowIcon = null;
            this.overflowText = null;
        }

        public LayoutParams(int i, int i2, float f, Drawable drawable, CharSequence charSequence) {
            super(i, i2, f);
            this.overflowIcon = drawable;
            this.overflowText = charSequence;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.overflowIcon = null;
            this.overflowText = null;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.overflowIcon = null;
            this.overflowText = null;
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.overflowIcon = null;
            this.overflowText = null;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((LinearLayout.LayoutParams) layoutParams);
            this.overflowIcon = null;
            this.overflowText = null;
            this.overflowText = layoutParams.overflowText;
            this.overflowIcon = layoutParams.overflowIcon;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    private MaterialButton getPrevVisibleChildButton(int i) {
        return getPrevVisibleChildButton(i, false);
    }

    private MaterialButton getNextVisibleChildButton(int i) {
        return getNextVisibleChildButton(i, false);
    }

    public MaterialButtonGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.materialButtonGroupStyle);
    }

    public MaterialButtonGroup(Context context) {
        this(context, null);
    }
}
