package com.yandex.div.core.widget;

import android.view.View;
import com.yandex.div.core.widget.GridContainer;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.internal.widget.DivViewGroup;
import defpackage.d6w;
import defpackage.gpl;
import defpackage.sls;
import defpackage.tig0;
import defpackage.u0u;
import defpackage.v0u;
import defpackage.w0u;
import defpackage.wls;
import defpackage.xcc;
import defpackage.y0u;
import defpackage.y6i0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class c {
    public int a = 1;
    public final tig0 b = new tig0(new sls() { // from class: com.yandex.div.core.widget.GridContainer$Grid$_cells$1
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            Integer num;
            c cVar = c.this;
            GridContainer gridContainer = cVar.g;
            if (gridContainer.getChildCount() == 0) {
                return new v0u(EmptyList.a, 0);
            }
            int i = cVar.a;
            ArrayList arrayList = new ArrayList(gridContainer.getChildCount());
            int[] iArr = new int[i];
            int[] iArr2 = new int[i];
            int childCount = gridContainer.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                num = null;
                if (i3 >= childCount) {
                    break;
                }
                View childAt = gridContainer.getChildAt(i3);
                if (childAt.getVisibility() != 8) {
                    if (i != 0) {
                        int i4 = iArr2[0];
                        int i5 = i - 1;
                        if (1 <= i5) {
                            while (true) {
                                int i6 = iArr2[r9];
                                if (i4 > i6) {
                                    i4 = i6;
                                }
                                if (r9 == i5) {
                                    break;
                                }
                                r9++;
                            }
                        }
                        num = Integer.valueOf(i4);
                    }
                    int intValue = num != null ? num.intValue() : 0;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= i) {
                            i7 = -1;
                            break;
                        }
                        if (intValue == iArr2[i7]) {
                            break;
                        }
                        i7++;
                    }
                    int i8 = i2 + intValue;
                    d6w n = y6i0.n(0, i);
                    int i9 = n.a;
                    int i10 = n.b;
                    if (i9 <= i10) {
                        while (true) {
                            iArr2[i9] = Math.max(0, iArr2[i9] - intValue);
                            if (i9 == i10) {
                                break;
                            }
                            i9++;
                        }
                    }
                    gpl gplVar = DivViewGroup.Companion;
                    DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                    int min = Math.min(divLayoutParams.getColumnSpan(), i - i7);
                    int rowSpan = divLayoutParams.getRowSpan();
                    int i11 = i7;
                    arrayList.add(new u0u(i3, i11, i8, min, rowSpan));
                    int i12 = i11 + min;
                    while (i11 < i12) {
                        if (iArr2[i11] > 0) {
                            u0u u0uVar = (u0u) arrayList.get(iArr[i11]);
                            int i13 = u0uVar.b;
                            int i14 = u0uVar.d + i13;
                            while (i13 < i14) {
                                int i15 = iArr2[i13];
                                iArr2[i13] = 0;
                                i13++;
                            }
                            u0uVar.e = i8 - u0uVar.c;
                        }
                        iArr[i11] = i3;
                        iArr2[i11] = rowSpan;
                        i11++;
                    }
                    i2 = i8;
                }
                i3++;
            }
            if (i != 0) {
                int i16 = iArr2[0];
                if (i16 < 1) {
                    i16 = 1;
                }
                Integer valueOf = Integer.valueOf(i16);
                int i17 = i - 1;
                if (1 <= i17) {
                    int i18 = 1;
                    while (true) {
                        int i19 = iArr2[i18];
                        if (i19 < 1) {
                            i19 = 1;
                        }
                        Integer valueOf2 = Integer.valueOf(i19);
                        if (valueOf.compareTo(valueOf2) < 0) {
                            valueOf = valueOf2;
                        }
                        if (i18 == i17) {
                            break;
                        }
                        i18++;
                    }
                }
                num = valueOf;
            }
            return new v0u(arrayList, ((u0u) kotlin.collections.a.Z(arrayList)).c + (num != null ? num.intValue() : 1));
        }
    });
    public final tig0 c = new tig0(new sls() { // from class: com.yandex.div.core.widget.GridContainer$Grid$_columns$1
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            c cVar = c.this;
            return cVar.b(cVar.a, cVar.e, GridContainer$Grid$measureColumns$1.w);
        }
    });
    public final tig0 d = new tig0(new sls() { // from class: com.yandex.div.core.widget.GridContainer$Grid$_rows$1
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            c cVar = c.this;
            return cVar.b(((v0u) cVar.b.f()).b, cVar.f, GridContainer$Grid$measureRows$1.w);
        }
    });
    public final GridContainer.b e = new GridContainer.b(0);
    public final GridContainer.b f = new GridContainer.b(0);
    public final /* synthetic */ GridContainer g;

    public c(GridContainer gridContainer) {
        this.g = gridContainer;
    }

    public static int a(List list) {
        if (list.isEmpty()) {
            return 0;
        }
        GridContainer.a aVar = (GridContainer.a) kotlin.collections.a.Z(list);
        return aVar.a + aVar.c;
    }

    public final ArrayList b(int i, GridContainer.b bVar, wls wlsVar) {
        GridContainer gridContainer;
        int i2;
        int i3;
        int i4;
        int i5;
        v0u v0uVar = (v0u) this.b.f();
        List list = v0uVar.a;
        ArrayList arrayList = new ArrayList(i);
        int i6 = 0;
        for (int i7 = 0; i7 < i; i7++) {
            arrayList.add(new GridContainer.a());
        }
        int size = list.size();
        int i8 = 0;
        while (true) {
            gridContainer = this.g;
            i2 = 1;
            if (i8 >= size) {
                break;
            }
            u0u u0uVar = (u0u) v0uVar.get(i8);
            w0u w0uVar = (w0u) wlsVar.invoke(u0uVar, gridContainer.getChildAt(u0uVar.a));
            int i9 = w0uVar.e;
            float f = w0uVar.f;
            int i10 = w0uVar.a;
            if (i9 == 1) {
                GridContainer.a aVar = (GridContainer.a) arrayList.get(i10);
                int i11 = w0uVar.b;
                int i12 = w0uVar.c + i11 + w0uVar.d;
                aVar.b = Math.max(aVar.b, i11);
                aVar.c = Math.max(aVar.c, i12);
                aVar.d = Math.max(aVar.d, f);
            } else {
                int i13 = i9 - 1;
                float f2 = f / i9;
                if (i13 >= 0) {
                    while (true) {
                        GridContainer.a.a((GridContainer.a) arrayList.get(i10 + i5), 0, 0, f2, 3);
                        i5 = i5 != i13 ? i5 + 1 : 0;
                    }
                }
            }
            i8++;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = list.size();
        for (int i14 = 0; i14 < size2; i14++) {
            u0u u0uVar2 = (u0u) v0uVar.get(i14);
            w0u w0uVar2 = (w0u) wlsVar.invoke(u0uVar2, gridContainer.getChildAt(u0uVar2.a));
            if (w0uVar2.e > 1) {
                arrayList2.add(w0uVar2);
            }
        }
        xcc.q(arrayList2, y0u.b);
        int size3 = arrayList2.size();
        int i15 = 0;
        while (i15 < size3) {
            w0u w0uVar3 = (w0u) arrayList2.get(i15);
            int i16 = w0uVar3.a;
            int i17 = w0uVar3.e;
            int i18 = (i16 + i17) - i2;
            int i19 = w0uVar3.b + w0uVar3.c + w0uVar3.d;
            float f3 = 0.0f;
            if (i16 <= i18) {
                i4 = i6;
                int i20 = i16;
                i3 = i19;
                while (true) {
                    GridContainer.a aVar2 = (GridContainer.a) arrayList.get(i20);
                    i19 -= aVar2.c;
                    if (aVar2.b()) {
                        f3 += aVar2.d;
                    } else {
                        if (aVar2.b == 0) {
                            i4++;
                        }
                        i3 -= aVar2.c;
                    }
                    if (i20 == i18) {
                        break;
                    }
                    i20++;
                }
            } else {
                i3 = i19;
                i4 = 0;
            }
            if (f3 > 0.0f) {
                if (i16 <= i18) {
                    while (true) {
                        GridContainer.a aVar3 = (GridContainer.a) arrayList.get(i16);
                        if (aVar3.b()) {
                            int ceil = (int) Math.ceil((aVar3.d / f3) * i3);
                            GridContainer.a.a(aVar3, ceil - (aVar3.c - aVar3.b), ceil, 0.0f, 4);
                        }
                        if (i16 != i18) {
                            i16++;
                        }
                    }
                }
            } else if (i19 > 0 && i16 <= i18) {
                while (true) {
                    GridContainer.a aVar4 = (GridContainer.a) arrayList.get(i16);
                    if (i4 <= 0) {
                        int i21 = i19 / i17;
                        GridContainer.a.a(aVar4, aVar4.b + i21, aVar4.c + i21, 0.0f, 4);
                    } else if (aVar4.b == 0 && !aVar4.b()) {
                        int i22 = i19 / i4;
                        GridContainer.a.a(aVar4, aVar4.b + i22, aVar4.c + i22, 0.0f, 4);
                    }
                    if (i16 != i18) {
                        i16++;
                    }
                }
            }
            i15++;
            i6 = 0;
            i2 = 1;
        }
        int size4 = arrayList.size();
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i23 = 0;
        for (int i24 = 0; i24 < size4; i24++) {
            GridContainer.a aVar5 = (GridContainer.a) arrayList.get(i24);
            if (aVar5.b()) {
                float f6 = aVar5.d;
                f4 += f6;
                f5 = Math.max(f5, aVar5.c / f6);
            } else {
                i23 += aVar5.c;
            }
        }
        int size5 = arrayList.size();
        int i25 = 0;
        for (int i26 = 0; i26 < size5; i26++) {
            GridContainer.a aVar6 = (GridContainer.a) arrayList.get(i26);
            i25 += aVar6.b() ? (int) Math.ceil(aVar6.d * f5) : aVar6.c;
        }
        int i27 = 0;
        float max = Math.max(0, Math.max(bVar.a, i25) - i23) / f4;
        int size6 = arrayList.size();
        for (int i28 = 0; i28 < size6; i28++) {
            GridContainer.a aVar7 = (GridContainer.a) arrayList.get(i28);
            if (aVar7.b()) {
                int ceil2 = (int) Math.ceil(aVar7.d * max);
                GridContainer.a.a(aVar7, ceil2 - (aVar7.c - aVar7.b), ceil2, 0.0f, 4);
            }
        }
        int size7 = arrayList.size();
        for (int i29 = 0; i29 < size7; i29++) {
            GridContainer.a aVar8 = (GridContainer.a) arrayList.get(i29);
            aVar8.a = i27;
            i27 += aVar8.c;
        }
        return arrayList;
    }
}
