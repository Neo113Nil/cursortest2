package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import defpackage.b64;
import defpackage.gnr;
import defpackage.hnr;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.shr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class b {
    public final shr a;
    public boolean[] b;
    public int[] c;
    public long[] d;
    public long[] e;

    public b(shr shrVar) {
        this.a = shrVar;
    }

    public static ArrayList e(int i, int i2, List list) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        a aVar = new a();
        aVar.g = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(aVar);
            }
            arrayList.add((a) list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public static int[] r(int i, ArrayList arrayList, SparseIntArray sparseIntArray) {
        Collections.sort(arrayList);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            hnr hnrVar = (hnr) it.next();
            int i3 = hnrVar.a;
            iArr[i2] = i3;
            sparseIntArray.append(i3, hnrVar.b);
            i2++;
        }
        return iArr;
    }

    public final void a(List list, a aVar, int i, int i2) {
        aVar.m = i2;
        this.a.onNewFlexLineAdded(aVar);
        aVar.p = i;
        list.add(aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x01f7, code lost:
    
        if (r8 < (r9 + r14)) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x038c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0391 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0306  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(gnr gnrVar, int i, int i2, int i3, int i4, int i5, List list) {
        List list2;
        int i6;
        int childHeightMeasureSpec;
        FlexItem flexItem;
        int i7;
        int[] iArr;
        boolean z;
        int i8 = i;
        shr shrVar = this.a;
        boolean isMainAxisDirectionHorizontal = shrVar.isMainAxisDirectionHorizontal();
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        List arrayList = list == null ? new ArrayList() : list;
        gnrVar.a = arrayList;
        boolean z2 = i5 == -1;
        int paddingStart = isMainAxisDirectionHorizontal ? shrVar.getPaddingStart() : shrVar.getPaddingTop();
        int paddingEnd = isMainAxisDirectionHorizontal ? shrVar.getPaddingEnd() : shrVar.getPaddingBottom();
        int paddingTop = isMainAxisDirectionHorizontal ? shrVar.getPaddingTop() : shrVar.getPaddingStart();
        int paddingBottom = isMainAxisDirectionHorizontal ? shrVar.getPaddingBottom() : shrVar.getPaddingEnd();
        a aVar = new a();
        int i9 = i4;
        int i10 = 1;
        aVar.o = i9;
        int i11 = paddingStart + paddingEnd;
        aVar.e = i11;
        int flexItemCount = shrVar.getFlexItemCount();
        boolean z3 = z2;
        int i12 = Integer.MIN_VALUE;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i9 < flexItemCount) {
            int i16 = flexItemCount;
            View reorderedFlexItemAt = shrVar.getReorderedFlexItemAt(i9);
            if (reorderedFlexItemAt == null) {
                if (i9 == i16 - 1 && aVar.a() != 0) {
                    a(arrayList, aVar, i9, i14);
                }
            } else if (reorderedFlexItemAt.getVisibility() == 8) {
                aVar.i++;
                aVar.h++;
                if (i9 == i16 - 1 && aVar.a() != 0) {
                    a(arrayList, aVar, i9, i14);
                }
            } else {
                if (reorderedFlexItemAt instanceof CompoundButton) {
                    CompoundButton compoundButton = (CompoundButton) reorderedFlexItemAt;
                    FlexItem flexItem2 = (FlexItem) compoundButton.getLayoutParams();
                    int minWidth = flexItem2.getMinWidth();
                    i6 = i11;
                    int minHeight = flexItem2.getMinHeight();
                    Drawable buttonDrawable = compoundButton.getButtonDrawable();
                    int minimumWidth = buttonDrawable == null ? 0 : buttonDrawable.getMinimumWidth();
                    int minimumHeight = buttonDrawable == null ? 0 : buttonDrawable.getMinimumHeight();
                    list2 = arrayList;
                    if (minWidth == -1) {
                        minWidth = minimumWidth;
                    }
                    flexItem2.setMinWidth(minWidth);
                    if (minHeight == -1) {
                        minHeight = minimumHeight;
                    }
                    flexItem2.setMinHeight(minHeight);
                } else {
                    list2 = arrayList;
                    i6 = i11;
                }
                FlexItem flexItem3 = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                if (flexItem3.getAlignSelf() == 4) {
                    aVar.n.add(Integer.valueOf(i9));
                }
                int width = isMainAxisDirectionHorizontal ? flexItem3.getWidth() : flexItem3.getHeight();
                if (flexItem3.getFlexBasisPercent() != -1.0f && mode == 1073741824) {
                    width = Math.round(size * flexItem3.getFlexBasisPercent());
                }
                if (isMainAxisDirectionHorizontal) {
                    childHeightMeasureSpec = shrVar.getChildWidthMeasureSpec(i8, i6 + flexItem3.getMarginLeft() + flexItem3.getMarginRight(), width);
                    int childHeightMeasureSpec2 = shrVar.getChildHeightMeasureSpec(i2, paddingTop + paddingBottom + flexItem3.getMarginTop() + flexItem3.getMarginBottom() + i14, flexItem3.getHeight());
                    reorderedFlexItemAt.measure(childHeightMeasureSpec, childHeightMeasureSpec2);
                    v(i9, childHeightMeasureSpec, childHeightMeasureSpec2, reorderedFlexItemAt);
                } else {
                    int childWidthMeasureSpec = shrVar.getChildWidthMeasureSpec(i2, paddingTop + paddingBottom + flexItem3.getMarginLeft() + flexItem3.getMarginRight() + i14, flexItem3.getWidth());
                    childHeightMeasureSpec = shrVar.getChildHeightMeasureSpec(i8, i6 + flexItem3.getMarginTop() + flexItem3.getMarginBottom(), width);
                    reorderedFlexItemAt.measure(childWidthMeasureSpec, childHeightMeasureSpec);
                    v(i9, childWidthMeasureSpec, childHeightMeasureSpec, reorderedFlexItemAt);
                }
                shrVar.updateViewCache(i9, reorderedFlexItemAt);
                c(i9, reorderedFlexItemAt);
                i13 = View.combineMeasuredStates(i13, reorderedFlexItemAt.getMeasuredState());
                int i17 = aVar.e;
                int measuredWidth = (isMainAxisDirectionHorizontal ? reorderedFlexItemAt.getMeasuredWidth() : reorderedFlexItemAt.getMeasuredHeight()) + (isMainAxisDirectionHorizontal ? flexItem3.getMarginLeft() : flexItem3.getMarginTop()) + (isMainAxisDirectionHorizontal ? flexItem3.getMarginRight() : flexItem3.getMarginBottom());
                int size2 = list2.size();
                if (shrVar.getFlexWrap() != 0) {
                    if (flexItem3.isWrapBefore()) {
                        flexItem = flexItem3;
                    } else if (mode != 0) {
                        flexItem = flexItem3;
                        int maxLine = shrVar.getMaxLine();
                        if (maxLine == -1 || maxLine > size2 + 1) {
                            int decorationLengthMainAxis = shrVar.getDecorationLengthMainAxis(reorderedFlexItemAt, i9, i15);
                            if (decorationLengthMainAxis > 0) {
                                measuredWidth += decorationLengthMainAxis;
                            }
                        }
                        i11 = i6;
                        arrayList = list2;
                        aVar.h += i10;
                        i15++;
                        i7 = i12;
                        aVar.q |= flexItem.getFlexGrow() != 0.0f;
                        aVar.r |= flexItem.getFlexShrink() != 0.0f;
                        iArr = this.c;
                        if (iArr != null) {
                            iArr[i9] = arrayList.size();
                        }
                        aVar.e = (isMainAxisDirectionHorizontal ? reorderedFlexItemAt.getMeasuredWidth() : reorderedFlexItemAt.getMeasuredHeight()) + (isMainAxisDirectionHorizontal ? flexItem.getMarginLeft() : flexItem.getMarginTop()) + (isMainAxisDirectionHorizontal ? flexItem.getMarginRight() : flexItem.getMarginBottom()) + aVar.e;
                        aVar.j += flexItem.getFlexGrow();
                        aVar.k += flexItem.getFlexShrink();
                        shrVar.onNewFlexItemAdded(reorderedFlexItemAt, i9, i15, aVar);
                        int max = Math.max(i7, shrVar.getDecorationLengthCrossAxis(reorderedFlexItemAt) + (isMainAxisDirectionHorizontal ? reorderedFlexItemAt.getMeasuredHeight() : reorderedFlexItemAt.getMeasuredWidth()) + (isMainAxisDirectionHorizontal ? flexItem.getMarginTop() : flexItem.getMarginLeft()) + (isMainAxisDirectionHorizontal ? flexItem.getMarginBottom() : flexItem.getMarginRight()));
                        aVar.g = Math.max(aVar.g, max);
                        if (isMainAxisDirectionHorizontal) {
                            int flexWrap = shrVar.getFlexWrap();
                            int i18 = aVar.l;
                            i12 = max;
                            if (flexWrap != 2) {
                                aVar.l = Math.max(i18, reorderedFlexItemAt.getBaseline() + flexItem.getMarginTop());
                            } else {
                                aVar.l = Math.max(i18, (reorderedFlexItemAt.getMeasuredHeight() - reorderedFlexItemAt.getBaseline()) + flexItem.getMarginBottom());
                            }
                        } else {
                            i12 = max;
                        }
                        if (i9 == i16 - 1 && aVar.a() != 0) {
                            a(arrayList, aVar, i9, i14);
                            i14 += aVar.g;
                        }
                        if (i5 == -1 && arrayList.size() > 0) {
                            if (((a) b64.c(1, arrayList)).p >= i5 && i9 >= i5 && !z3) {
                                i14 = -aVar.g;
                                z = true;
                                if (i14 > i3 && z) {
                                    break;
                                }
                                i9++;
                                i8 = i;
                                z3 = z;
                                flexItemCount = i16;
                                i10 = 1;
                            }
                        }
                        z = z3;
                        if (i14 > i3) {
                            break;
                            break;
                        }
                        continue;
                        i9++;
                        i8 = i;
                        z3 = z;
                        flexItemCount = i16;
                        i10 = 1;
                    }
                    if (aVar.a() > 0) {
                        arrayList = list2;
                        a(arrayList, aVar, i9 > 0 ? i9 - 1 : 0, i14);
                        i14 += aVar.g;
                    } else {
                        arrayList = list2;
                    }
                    if (isMainAxisDirectionHorizontal) {
                        if (flexItem.getHeight() == -1) {
                            reorderedFlexItemAt.measure(childHeightMeasureSpec, shrVar.getChildHeightMeasureSpec(i2, shrVar.getPaddingBottom() + shrVar.getPaddingTop() + flexItem.getMarginTop() + flexItem.getMarginBottom() + i14, flexItem.getHeight()));
                            c(i9, reorderedFlexItemAt);
                        }
                    } else if (flexItem.getWidth() == -1) {
                        reorderedFlexItemAt.measure(shrVar.getChildWidthMeasureSpec(i2, shrVar.getPaddingRight() + shrVar.getPaddingLeft() + flexItem.getMarginLeft() + flexItem.getMarginRight() + i14, flexItem.getWidth()), childHeightMeasureSpec);
                        c(i9, reorderedFlexItemAt);
                    }
                    aVar = new a();
                    aVar.h = i10;
                    i11 = i6;
                    aVar.e = i11;
                    aVar.o = i9;
                    i7 = Integer.MIN_VALUE;
                    i15 = 0;
                    aVar.q |= flexItem.getFlexGrow() != 0.0f;
                    aVar.r |= flexItem.getFlexShrink() != 0.0f;
                    iArr = this.c;
                    if (iArr != null) {
                    }
                    aVar.e = (isMainAxisDirectionHorizontal ? reorderedFlexItemAt.getMeasuredWidth() : reorderedFlexItemAt.getMeasuredHeight()) + (isMainAxisDirectionHorizontal ? flexItem.getMarginLeft() : flexItem.getMarginTop()) + (isMainAxisDirectionHorizontal ? flexItem.getMarginRight() : flexItem.getMarginBottom()) + aVar.e;
                    aVar.j += flexItem.getFlexGrow();
                    aVar.k += flexItem.getFlexShrink();
                    shrVar.onNewFlexItemAdded(reorderedFlexItemAt, i9, i15, aVar);
                    int max2 = Math.max(i7, shrVar.getDecorationLengthCrossAxis(reorderedFlexItemAt) + (isMainAxisDirectionHorizontal ? reorderedFlexItemAt.getMeasuredHeight() : reorderedFlexItemAt.getMeasuredWidth()) + (isMainAxisDirectionHorizontal ? flexItem.getMarginTop() : flexItem.getMarginLeft()) + (isMainAxisDirectionHorizontal ? flexItem.getMarginBottom() : flexItem.getMarginRight()));
                    aVar.g = Math.max(aVar.g, max2);
                    if (isMainAxisDirectionHorizontal) {
                    }
                    if (i9 == i16 - 1) {
                        a(arrayList, aVar, i9, i14);
                        i14 += aVar.g;
                    }
                    if (i5 == -1) {
                    }
                    z = z3;
                    if (i14 > i3) {
                    }
                    i9++;
                    i8 = i;
                    z3 = z;
                    flexItemCount = i16;
                    i10 = 1;
                }
                flexItem = flexItem3;
                i11 = i6;
                arrayList = list2;
                aVar.h += i10;
                i15++;
                i7 = i12;
                aVar.q |= flexItem.getFlexGrow() != 0.0f;
                aVar.r |= flexItem.getFlexShrink() != 0.0f;
                iArr = this.c;
                if (iArr != null) {
                }
                aVar.e = (isMainAxisDirectionHorizontal ? reorderedFlexItemAt.getMeasuredWidth() : reorderedFlexItemAt.getMeasuredHeight()) + (isMainAxisDirectionHorizontal ? flexItem.getMarginLeft() : flexItem.getMarginTop()) + (isMainAxisDirectionHorizontal ? flexItem.getMarginRight() : flexItem.getMarginBottom()) + aVar.e;
                aVar.j += flexItem.getFlexGrow();
                aVar.k += flexItem.getFlexShrink();
                shrVar.onNewFlexItemAdded(reorderedFlexItemAt, i9, i15, aVar);
                int max22 = Math.max(i7, shrVar.getDecorationLengthCrossAxis(reorderedFlexItemAt) + (isMainAxisDirectionHorizontal ? reorderedFlexItemAt.getMeasuredHeight() : reorderedFlexItemAt.getMeasuredWidth()) + (isMainAxisDirectionHorizontal ? flexItem.getMarginTop() : flexItem.getMarginLeft()) + (isMainAxisDirectionHorizontal ? flexItem.getMarginBottom() : flexItem.getMarginRight()));
                aVar.g = Math.max(aVar.g, max22);
                if (isMainAxisDirectionHorizontal) {
                }
                if (i9 == i16 - 1) {
                }
                if (i5 == -1) {
                }
                z = z3;
                if (i14 > i3) {
                }
                i9++;
                i8 = i;
                z3 = z;
                flexItemCount = i16;
                i10 = 1;
            }
            z = z3;
            i9++;
            i8 = i;
            z3 = z;
            flexItemCount = i16;
            i10 = 1;
        }
        gnrVar.b = i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i, View view) {
        boolean z;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth < flexItem.getMinWidth()) {
            measuredWidth = flexItem.getMinWidth();
        } else {
            if (measuredWidth <= flexItem.getMaxWidth()) {
                z = false;
                if (measuredHeight >= flexItem.getMinHeight()) {
                    measuredHeight = flexItem.getMinHeight();
                } else if (measuredHeight > flexItem.getMaxHeight()) {
                    measuredHeight = flexItem.getMaxHeight();
                } else {
                    z2 = z;
                }
                if (z2) {
                    return;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                v(i, makeMeasureSpec, makeMeasureSpec2, view);
                this.a.updateViewCache(i, view);
                return;
            }
            measuredWidth = flexItem.getMaxWidth();
        }
        z = true;
        if (measuredHeight >= flexItem.getMinHeight()) {
        }
        if (z2) {
        }
    }

    public final void d(int i, List list) {
        int i2 = this.c[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    public final ArrayList f(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            FlexItem flexItem = (FlexItem) this.a.getFlexItemAt(i2).getLayoutParams();
            hnr hnrVar = new hnr();
            hnrVar.b = flexItem.getOrder();
            hnrVar.a = i2;
            arrayList.add(hnrVar);
        }
        return arrayList;
    }

    public final void g(int i, int i2, int i3) {
        int i4;
        int i5;
        shr shrVar = this.a;
        int flexDirection = shrVar.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            i4 = mode;
            i5 = size;
        } else if (flexDirection != 2 && flexDirection != 3) {
            ny61.g(oyr.i(flexDirection, "Invalid flex direction: "));
            return;
        } else {
            i4 = View.MeasureSpec.getMode(i);
            i5 = View.MeasureSpec.getSize(i);
        }
        List<a> flexLinesInternal = shrVar.getFlexLinesInternal();
        if (i4 == 1073741824) {
            int sumOfCrossSize = shrVar.getSumOfCrossSize() + i3;
            int i6 = 0;
            if (flexLinesInternal.size() == 1) {
                ((a) flexLinesInternal.get(0)).g = i5 - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = shrVar.getAlignContent();
                if (alignContent == 1) {
                    a aVar = new a();
                    aVar.g = i5 - sumOfCrossSize;
                    flexLinesInternal.add(0, aVar);
                    return;
                }
                if (alignContent == 2) {
                    shrVar.setFlexLines(e(i5, sumOfCrossSize, flexLinesInternal));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= i5) {
                        return;
                    }
                    float size2 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size3 = flexLinesInternal.size();
                    float f = 0.0f;
                    while (i6 < size3) {
                        arrayList.add((a) flexLinesInternal.get(i6));
                        if (i6 != flexLinesInternal.size() - 1) {
                            a aVar2 = new a();
                            if (i6 == flexLinesInternal.size() - 2) {
                                aVar2.g = Math.round(f + size2);
                                f = 0.0f;
                            } else {
                                aVar2.g = Math.round(size2);
                            }
                            int i7 = aVar2.g;
                            float f2 = (size2 - i7) + f;
                            if (f2 > 1.0f) {
                                aVar2.g = i7 + 1;
                                f2 -= 1.0f;
                            } else if (f2 < -1.0f) {
                                aVar2.g = i7 - 1;
                                f2 += 1.0f;
                            }
                            f = f2;
                            arrayList.add(aVar2);
                        }
                        i6++;
                    }
                    shrVar.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= i5) {
                        shrVar.setFlexLines(e(i5, sumOfCrossSize, flexLinesInternal));
                        return;
                    }
                    int size4 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    a aVar3 = new a();
                    aVar3.g = size4;
                    for (a aVar4 : flexLinesInternal) {
                        arrayList2.add(aVar3);
                        arrayList2.add(aVar4);
                        arrayList2.add(aVar3);
                    }
                    shrVar.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < i5) {
                    float size5 = (i5 - sumOfCrossSize) / flexLinesInternal.size();
                    int size6 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i6 < size6) {
                        a aVar5 = (a) flexLinesInternal.get(i6);
                        float f4 = aVar5.g + size5;
                        if (i6 == flexLinesInternal.size() - 1) {
                            f4 += f3;
                            f3 = 0.0f;
                        }
                        int round = Math.round(f4);
                        float f5 = (f4 - round) + f3;
                        if (f5 > 1.0f) {
                            round++;
                            f5 -= 1.0f;
                        } else if (f5 < -1.0f) {
                            round--;
                            f5 += 1.0f;
                        }
                        f3 = f5;
                        aVar5.g = round;
                        i6++;
                    }
                }
            }
        }
    }

    public final void h(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        b bVar;
        int i4;
        int i5;
        shr shrVar = this.a;
        int flexItemCount = shrVar.getFlexItemCount();
        boolean[] zArr = this.b;
        if (zArr == null) {
            this.b = new boolean[Math.max(flexItemCount, 10)];
        } else if (zArr.length < flexItemCount) {
            this.b = new boolean[Math.max(zArr.length * 2, flexItemCount)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 >= shrVar.getFlexItemCount()) {
            return;
        }
        int flexDirection = shrVar.getFlexDirection();
        int flexDirection2 = shrVar.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = shrVar.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = shrVar.getPaddingLeft();
            paddingRight = shrVar.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                ny61.g(oyr.i(flexDirection, "Invalid flex direction: "));
                return;
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = shrVar.getLargestMainSize();
            }
            paddingLeft = shrVar.getPaddingTop();
            paddingRight = shrVar.getPaddingBottom();
        }
        int i6 = paddingRight + paddingLeft;
        int i7 = size;
        int[] iArr = this.c;
        int i8 = iArr != null ? iArr[i3] : 0;
        List flexLinesInternal = shrVar.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i8 < size2) {
            a aVar = (a) flexLinesInternal.get(i8);
            int i9 = aVar.e;
            if (i9 >= i7 || !aVar.q) {
                bVar = this;
                i4 = i;
                i5 = i2;
                if (i9 > i7 && aVar.r) {
                    bVar.q(i4, i5, aVar, i7, i6, false);
                }
            } else {
                bVar = this;
                i4 = i;
                i5 = i2;
                bVar.l(i4, i5, aVar, i7, i6, false);
            }
            i8++;
            this = bVar;
            i = i4;
            i2 = i5;
        }
    }

    public final void i(int i) {
        int[] iArr = this.c;
        if (iArr == null) {
            this.c = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.c = Arrays.copyOf(this.c, Math.max(iArr.length * 2, i));
        }
    }

    public final void j(int i) {
        long[] jArr = this.d;
        if (jArr == null) {
            this.d = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.d = Arrays.copyOf(this.d, Math.max(jArr.length * 2, i));
        }
    }

    public final void k(int i) {
        long[] jArr = this.e;
        if (jArr == null) {
            this.e = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.e = Arrays.copyOf(this.e, Math.max(jArr.length * 2, i));
        }
    }

    public final void l(int i, int i2, a aVar, int i3, int i4, boolean z) {
        int i5;
        float f;
        int i6;
        float f2;
        boolean z2;
        int i7;
        int i8;
        double d;
        float f3;
        boolean z3;
        boolean z4;
        double d2;
        float f4 = aVar.j;
        float f5 = 0.0f;
        if (f4 <= 0.0f || i3 < (i5 = aVar.e)) {
            return;
        }
        float f6 = (i3 - i5) / f4;
        aVar.e = i4 + aVar.f;
        if (!z) {
            aVar.g = Integer.MIN_VALUE;
        }
        int i9 = 0;
        boolean z5 = false;
        int i10 = 0;
        float f7 = 0.0f;
        while (i9 < aVar.h) {
            int i11 = aVar.o + i9;
            shr shrVar = this.a;
            View reorderedFlexItemAt = shrVar.getReorderedFlexItemAt(i11);
            if (reorderedFlexItemAt == null || reorderedFlexItemAt.getVisibility() == 8) {
                f = f5;
                i6 = i5;
                f2 = f6;
                z2 = z5;
                i7 = i9;
            } else {
                FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                int flexDirection = shrVar.getFlexDirection();
                f = f5;
                if (flexDirection == 0 || flexDirection == 1) {
                    i6 = i5;
                    float f8 = f6;
                    z2 = z5;
                    int measuredWidth = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i11];
                    }
                    int measuredHeight = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i11] >> 32);
                    }
                    if (this.b[i11] || flexItem.getFlexGrow() <= f) {
                        i7 = i9;
                        f2 = f8;
                    } else {
                        float flexGrow = (flexItem.getFlexGrow() * f8) + measuredWidth;
                        if (i9 == aVar.h - 1) {
                            flexGrow += f7;
                            f7 = f;
                        }
                        int round = Math.round(flexGrow);
                        if (round > flexItem.getMaxWidth()) {
                            round = flexItem.getMaxWidth();
                            this.b[i11] = true;
                            aVar.j -= flexItem.getFlexGrow();
                            z2 = true;
                            i7 = i9;
                            f2 = f8;
                        } else {
                            float f9 = (flexGrow - round) + f7;
                            i7 = i9;
                            f2 = f8;
                            double d3 = f9;
                            if (d3 > 1.0d) {
                                round++;
                                d = d3 - 1.0d;
                            } else if (d3 < -1.0d) {
                                round--;
                                d = d3 + 1.0d;
                            } else {
                                f7 = f9;
                            }
                            f7 = (float) d;
                        }
                        int m = m(i2, flexItem, aVar.m);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        reorderedFlexItemAt.measure(makeMeasureSpec, m);
                        int measuredWidth2 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight2 = reorderedFlexItemAt.getMeasuredHeight();
                        v(i11, makeMeasureSpec, m, reorderedFlexItemAt);
                        shrVar.updateViewCache(i11, reorderedFlexItemAt);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int max = Math.max(i10, shrVar.getDecorationLengthCrossAxis(reorderedFlexItemAt) + measuredHeight + flexItem.getMarginTop() + flexItem.getMarginBottom());
                    aVar.e = measuredWidth + flexItem.getMarginLeft() + flexItem.getMarginRight() + aVar.e;
                    i8 = max;
                } else {
                    int measuredHeight3 = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        long j = jArr3[i11];
                        f3 = f6;
                        z3 = z5;
                        measuredHeight3 = (int) (j >> 32);
                    } else {
                        f3 = f6;
                        z3 = z5;
                    }
                    int measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i11];
                    }
                    if (this.b[i11] || flexItem.getFlexGrow() <= f) {
                        i6 = i5;
                        z4 = z3;
                    } else {
                        float flexGrow2 = (flexItem.getFlexGrow() * f3) + measuredHeight3;
                        if (i9 == aVar.h - 1) {
                            flexGrow2 += f7;
                            f7 = f;
                        }
                        int round2 = Math.round(flexGrow2);
                        if (round2 > flexItem.getMaxHeight()) {
                            round2 = flexItem.getMaxHeight();
                            this.b[i11] = true;
                            aVar.j -= flexItem.getFlexGrow();
                            z4 = true;
                            i6 = i5;
                        } else {
                            float f10 = (flexGrow2 - round2) + f7;
                            i6 = i5;
                            double d4 = f10;
                            if (d4 > 1.0d) {
                                round2++;
                                d2 = d4 - 1.0d;
                            } else if (d4 < -1.0d) {
                                round2--;
                                d2 = d4 + 1.0d;
                            } else {
                                f7 = f10;
                                z4 = z3;
                            }
                            f7 = (float) d2;
                            z4 = z3;
                        }
                        int n = n(i, flexItem, aVar.m);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        reorderedFlexItemAt.measure(n, makeMeasureSpec2);
                        int measuredWidth4 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight4 = reorderedFlexItemAt.getMeasuredHeight();
                        v(i11, n, makeMeasureSpec2, reorderedFlexItemAt);
                        shrVar.updateViewCache(i11, reorderedFlexItemAt);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    i8 = Math.max(i10, shrVar.getDecorationLengthCrossAxis(reorderedFlexItemAt) + measuredWidth3 + flexItem.getMarginLeft() + flexItem.getMarginRight());
                    aVar.e = measuredHeight3 + flexItem.getMarginTop() + flexItem.getMarginBottom() + aVar.e;
                    f2 = f3;
                    z2 = z4;
                    i7 = i9;
                }
                aVar.g = Math.max(aVar.g, i8);
                i10 = i8;
            }
            i9 = i7 + 1;
            f6 = f2;
            f5 = f;
            i5 = i6;
            z5 = z2;
        }
        int i12 = i5;
        if (!z5 || i12 == aVar.e) {
            return;
        }
        l(i, i2, aVar, i3, i4, true);
    }

    public final int m(int i, FlexItem flexItem, int i2) {
        shr shrVar = this.a;
        int childHeightMeasureSpec = shrVar.getChildHeightMeasureSpec(i, shrVar.getPaddingBottom() + shrVar.getPaddingTop() + flexItem.getMarginTop() + flexItem.getMarginBottom() + i2, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(childHeightMeasureSpec);
        return size > flexItem.getMaxHeight() ? View.MeasureSpec.makeMeasureSpec(flexItem.getMaxHeight(), View.MeasureSpec.getMode(childHeightMeasureSpec)) : size < flexItem.getMinHeight() ? View.MeasureSpec.makeMeasureSpec(flexItem.getMinHeight(), View.MeasureSpec.getMode(childHeightMeasureSpec)) : childHeightMeasureSpec;
    }

    public final int n(int i, FlexItem flexItem, int i2) {
        shr shrVar = this.a;
        int childWidthMeasureSpec = shrVar.getChildWidthMeasureSpec(i, shrVar.getPaddingRight() + shrVar.getPaddingLeft() + flexItem.getMarginLeft() + flexItem.getMarginRight() + i2, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(childWidthMeasureSpec);
        return size > flexItem.getMaxWidth() ? View.MeasureSpec.makeMeasureSpec(flexItem.getMaxWidth(), View.MeasureSpec.getMode(childWidthMeasureSpec)) : size < flexItem.getMinWidth() ? View.MeasureSpec.makeMeasureSpec(flexItem.getMinWidth(), View.MeasureSpec.getMode(childWidthMeasureSpec)) : childWidthMeasureSpec;
    }

    public final void o(View view, a aVar, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        shr shrVar = this.a;
        int alignItems = shrVar.getAlignItems();
        if (flexItem.getAlignSelf() != -1) {
            alignItems = flexItem.getAlignSelf();
        }
        int i5 = aVar.g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (shrVar.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - flexItem.getMarginBottom(), i3, i6 - flexItem.getMarginBottom());
                    return;
                } else {
                    view.layout(i, view.getMeasuredHeight() + (i2 - i5) + flexItem.getMarginTop(), i3, view.getMeasuredHeight() + (i4 - i5) + flexItem.getMarginTop());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.getMarginTop()) - flexItem.getMarginBottom()) / 2;
                if (shrVar.getFlexWrap() != 2) {
                    int i7 = i2 + measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - measuredHeight;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (alignItems == 3) {
                int flexWrap = shrVar.getFlexWrap();
                int i9 = aVar.l;
                if (flexWrap != 2) {
                    int max = Math.max(i9 - view.getBaseline(), flexItem.getMarginTop());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                } else {
                    int max2 = Math.max(view.getBaseline() + (i9 - view.getMeasuredHeight()), flexItem.getMarginBottom());
                    view.layout(i, i2 - max2, i3, i4 - max2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (shrVar.getFlexWrap() != 2) {
            view.layout(i, i2 + flexItem.getMarginTop(), i3, i4 + flexItem.getMarginTop());
        } else {
            view.layout(i, i2 - flexItem.getMarginBottom(), i3, i4 - flexItem.getMarginBottom());
        }
    }

    public final void p(View view, a aVar, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.a.getAlignItems();
        if (flexItem.getAlignSelf() != -1) {
            alignItems = flexItem.getAlignSelf();
        }
        int i5 = aVar.g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.getMarginRight(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.getMarginRight(), i4);
                    return;
                }
                view.layout(view.getMeasuredWidth() + (i - i5) + flexItem.getMarginLeft(), i2, view.getMeasuredWidth() + (i3 - i5) + flexItem.getMarginLeft(), i4);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int marginStart = ((marginLayoutParams.getMarginStart() + (i5 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                if (z) {
                    view.layout(i - marginStart, i2, i3 - marginStart, i4);
                    return;
                } else {
                    view.layout(i + marginStart, i2, i3 + marginStart, i4);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z) {
            view.layout(i - flexItem.getMarginRight(), i2, i3 - flexItem.getMarginRight(), i4);
        } else {
            view.layout(i + flexItem.getMarginLeft(), i2, i3 + flexItem.getMarginLeft(), i4);
        }
    }

    public final void q(int i, int i2, a aVar, int i3, int i4, boolean z) {
        float f;
        float f2;
        int i5;
        int i6;
        int i7;
        int i8 = aVar.e;
        float f3 = aVar.k;
        float f4 = 0.0f;
        if (f3 <= 0.0f || i3 > i8) {
            return;
        }
        float f5 = (i8 - i3) / f3;
        aVar.e = i4 + aVar.f;
        if (!z) {
            aVar.g = Integer.MIN_VALUE;
        }
        int i9 = 0;
        boolean z2 = false;
        int i10 = 0;
        float f6 = 0.0f;
        while (i9 < aVar.h) {
            int i11 = aVar.o + i9;
            shr shrVar = this.a;
            View reorderedFlexItemAt = shrVar.getReorderedFlexItemAt(i11);
            if (reorderedFlexItemAt == null || reorderedFlexItemAt.getVisibility() == 8) {
                f = f4;
                f2 = f5;
            } else {
                FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                int flexDirection = shrVar.getFlexDirection();
                f = f4;
                if (flexDirection == 0 || flexDirection == 1) {
                    f2 = f5;
                    int measuredWidth = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i11];
                    }
                    int measuredHeight = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i11] >> 32);
                    }
                    if (!this.b[i11] && flexItem.getFlexShrink() > f) {
                        float flexShrink = measuredWidth - (f2 * flexItem.getFlexShrink());
                        if (i9 == aVar.h - 1) {
                            flexShrink += f6;
                            f6 = f;
                        }
                        int round = Math.round(flexShrink);
                        if (round < flexItem.getMinWidth()) {
                            i6 = flexItem.getMinWidth();
                            this.b[i11] = true;
                            aVar.k -= flexItem.getFlexShrink();
                            z2 = true;
                        } else {
                            float f7 = (flexShrink - round) + f6;
                            double d = f7;
                            if (d > 1.0d) {
                                i6 = round + 1;
                                f7 -= 1.0f;
                            } else if (d < -1.0d) {
                                i6 = round - 1;
                                f7 += 1.0f;
                            } else {
                                i6 = round;
                            }
                            f6 = f7;
                        }
                        int m = m(i2, flexItem, aVar.m);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                        reorderedFlexItemAt.measure(makeMeasureSpec, m);
                        int measuredWidth2 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight2 = reorderedFlexItemAt.getMeasuredHeight();
                        v(i11, makeMeasureSpec, m, reorderedFlexItemAt);
                        shrVar.updateViewCache(i11, reorderedFlexItemAt);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int max = Math.max(i10, shrVar.getDecorationLengthCrossAxis(reorderedFlexItemAt) + measuredHeight + flexItem.getMarginTop() + flexItem.getMarginBottom());
                    aVar.e = measuredWidth + flexItem.getMarginLeft() + flexItem.getMarginRight() + aVar.e;
                    i5 = max;
                } else {
                    int measuredHeight3 = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i11] >> 32);
                    }
                    int measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i11];
                    }
                    if (this.b[i11] || flexItem.getFlexShrink() <= f) {
                        f2 = f5;
                    } else {
                        float flexShrink2 = measuredHeight3 - (flexItem.getFlexShrink() * f5);
                        if (i9 == aVar.h - 1) {
                            flexShrink2 += f6;
                            f6 = f;
                        }
                        int round2 = Math.round(flexShrink2);
                        if (round2 < flexItem.getMinHeight()) {
                            i7 = flexItem.getMinHeight();
                            this.b[i11] = true;
                            aVar.k -= flexItem.getFlexShrink();
                            z2 = true;
                            f2 = f5;
                        } else {
                            float f8 = (flexShrink2 - round2) + f6;
                            f2 = f5;
                            double d2 = f8;
                            if (d2 > 1.0d) {
                                i7 = round2 + 1;
                                f8 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                i7 = round2 - 1;
                                f8 += 1.0f;
                            } else {
                                i7 = round2;
                            }
                            f6 = f8;
                        }
                        int n = n(i, flexItem, aVar.m);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                        reorderedFlexItemAt.measure(n, makeMeasureSpec2);
                        int measuredWidth4 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight4 = reorderedFlexItemAt.getMeasuredHeight();
                        v(i11, n, makeMeasureSpec2, reorderedFlexItemAt);
                        shrVar.updateViewCache(i11, reorderedFlexItemAt);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    i5 = Math.max(i10, shrVar.getDecorationLengthCrossAxis(reorderedFlexItemAt) + measuredWidth3 + flexItem.getMarginLeft() + flexItem.getMarginRight());
                    aVar.e = measuredHeight3 + flexItem.getMarginTop() + flexItem.getMarginBottom() + aVar.e;
                }
                aVar.g = Math.max(aVar.g, i5);
                i10 = i5;
            }
            i9++;
            f4 = f;
            f5 = f2;
        }
        if (!z2 || i8 == aVar.e) {
            return;
        }
        q(i, i2, aVar, i3, i4, true);
    }

    public final void s(int i, int i2, View view) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int marginLeft = (i - flexItem.getMarginLeft()) - flexItem.getMarginRight();
        shr shrVar = this.a;
        int min = Math.min(Math.max(marginLeft - shrVar.getDecorationLengthCrossAxis(view), flexItem.getMinWidth()), flexItem.getMaxWidth());
        long[] jArr = this.e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i2] >> 32) : view.getMeasuredHeight(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        v(i2, makeMeasureSpec2, makeMeasureSpec, view);
        shrVar.updateViewCache(i2, view);
    }

    public final void t(int i, int i2, View view) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int marginTop = (i - flexItem.getMarginTop()) - flexItem.getMarginBottom();
        shr shrVar = this.a;
        int min = Math.min(Math.max(marginTop - shrVar.getDecorationLengthCrossAxis(view), flexItem.getMinHeight()), flexItem.getMaxHeight());
        long[] jArr = this.e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        v(i2, makeMeasureSpec, makeMeasureSpec2, view);
        shrVar.updateViewCache(i2, view);
    }

    public final void u(int i) {
        View reorderedFlexItemAt;
        shr shrVar = this.a;
        if (i >= shrVar.getFlexItemCount()) {
            return;
        }
        int flexDirection = shrVar.getFlexDirection();
        if (shrVar.getAlignItems() != 4) {
            for (a aVar : shrVar.getFlexLinesInternal()) {
                Iterator it = aVar.n.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    View reorderedFlexItemAt2 = shrVar.getReorderedFlexItemAt(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        t(aVar.g, num.intValue(), reorderedFlexItemAt2);
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            ny61.g(oyr.i(flexDirection, "Invalid flex direction: "));
                            return;
                        }
                        s(aVar.g, num.intValue(), reorderedFlexItemAt2);
                    }
                }
            }
            return;
        }
        int[] iArr = this.c;
        List flexLinesInternal = shrVar.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
            a aVar2 = (a) flexLinesInternal.get(i2);
            int i3 = aVar2.h;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = aVar2.o + i4;
                if (i4 < shrVar.getFlexItemCount() && (reorderedFlexItemAt = shrVar.getReorderedFlexItemAt(i5)) != null && reorderedFlexItemAt.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                    if (flexItem.getAlignSelf() == -1 || flexItem.getAlignSelf() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            t(aVar2.g, i5, reorderedFlexItemAt);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                ny61.g(oyr.i(flexDirection, "Invalid flex direction: "));
                                return;
                            }
                            s(aVar2.g, i5, reorderedFlexItemAt);
                        }
                    }
                }
            }
        }
    }

    public final void v(int i, int i2, int i3, View view) {
        long[] jArr = this.d;
        if (jArr != null) {
            jArr[i] = (i2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (i3 << 32);
        }
        long[] jArr2 = this.e;
        if (jArr2 != null) {
            jArr2[i] = (view.getMeasuredHeight() << 32) | (view.getMeasuredWidth() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        }
    }
}
