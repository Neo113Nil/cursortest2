package com.yandex.div.legacy.view;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.legacy.view.FitTableLayout;
import defpackage.i6z0;
import defpackage.rvr;
import defpackage.udr;
import defpackage.unr0;
import defpackage.vdr;
import defpackage.x4e;
import defpackage.z83;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes11.dex */
public final class b {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final i6z0 d = new i6z0(5);
    public final i6z0 e = new i6z0(5);
    public final rvr f = new rvr(7);
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final /* synthetic */ FitTableLayout l;

    public b(FitTableLayout fitTableLayout) {
        this.l = fitTableLayout;
    }

    public static void e(i6z0 i6z0Var, int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            i6z0Var.b = 0;
            i6z0Var.c = size;
        } else if (mode == 0) {
            i6z0Var.b = 0;
            i6z0Var.c = 32768;
        } else {
            if (mode != 1073741824) {
                return;
            }
            i6z0Var.b = size;
            i6z0Var.c = size;
        }
    }

    public final void a() {
        FitTableLayout.LayoutParams layoutParams;
        if (this.i) {
            z83.j("Rectreation of valid structure is not allowed");
            return;
        }
        int i = this.g;
        FitTableLayout fitTableLayout = this.l;
        int childCount = fitTableLayout.getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            layoutParams = FitTableLayout.getLayoutParams(fitTableLayout.getChildAt(i3));
            int i4 = i2 % i;
            int min = Math.min(layoutParams.span, i - i4);
            this.c.add(new vdr(i3, i4, i2 / i, min));
            i2 += min;
        }
        this.h = x4e.c(i2, 1, i, 1);
        this.i = true;
    }

    public final ArrayList b() {
        float f;
        FitTableLayout fitTableLayout;
        FitTableLayout.LayoutParams layoutParams;
        if (!this.i) {
            a();
        }
        boolean z = this.j;
        ArrayList arrayList = this.a;
        if (!z) {
            int i = 0;
            while (true) {
                f = 0.0f;
                if (i >= this.g) {
                    break;
                }
                c cVar = new c();
                cVar.e = 0.0f;
                arrayList.add(cVar);
                i++;
            }
            ArrayList arrayList2 = new ArrayList(this.c);
            Collections.sort(arrayList2, this.f);
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            int i2 = 0;
            while (true) {
                int size = arrayList2.size();
                fitTableLayout = this.l;
                if (i2 >= size) {
                    break;
                }
                vdr vdrVar = (vdr) arrayList2.get(i2);
                int i3 = vdrVar.a;
                int i4 = vdrVar.d;
                int i5 = vdrVar.b;
                View childAt = fitTableLayout.getChildAt(i3);
                if (childAt.getVisibility() != 8) {
                    layoutParams = FitTableLayout.getLayoutParams(childAt);
                    c cVar2 = (c) arrayList.get(i5);
                    if (i4 == 1) {
                        int measuredWidth = childAt.getMeasuredWidth();
                        int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                        int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        float f2 = layoutParams.weight;
                        cVar2.a(measuredWidth, i6, i7);
                        cVar2.e = Math.max(cVar2.e, f2);
                    } else {
                        if (i4 != 1) {
                            for (int i8 = 0; i8 < i4; i8++) {
                                if (((c) arrayList.get(i5 + i8)).b()) {
                                    arrayList4.add(vdrVar);
                                    break;
                                }
                            }
                        }
                        arrayList3.add(vdrVar);
                        udr udrVar = (udr) arrayList.get((i5 + i4) - 1);
                        int i9 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                        float f3 = layoutParams.weight;
                        cVar2.a(0, i9, Integer.MIN_VALUE);
                        cVar2.e = Math.max(cVar2.e, f3);
                        udrVar.a(0, Integer.MIN_VALUE, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    }
                }
                i2++;
            }
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                vdr vdrVar2 = (vdr) arrayList3.get(i10);
                int i11 = vdrVar2.a;
                int i12 = vdrVar2.d;
                int i13 = vdrVar2.b;
                View childAt2 = fitTableLayout.getChildAt(i11);
                udr udrVar2 = (udr) arrayList.get(i13);
                udr udrVar3 = (udr) arrayList.get((i13 + i12) - 1);
                int measuredWidth2 = childAt2.getMeasuredWidth() + udrVar2.c;
                for (int i14 = 0; i14 < i12 - 1; i14++) {
                    measuredWidth2 -= ((c) arrayList.get(i13 + i14)).a;
                }
                int i15 = udrVar3.c;
                udrVar3.a(measuredWidth2 - i15, i15, udrVar3.d);
            }
            int i16 = 0;
            while (i16 < arrayList4.size()) {
                vdr vdrVar3 = (vdr) arrayList4.get(i16);
                int i17 = vdrVar3.a;
                int i18 = vdrVar3.d;
                int i19 = vdrVar3.b;
                int measuredWidth3 = fitTableLayout.getChildAt(i17).getMeasuredWidth() + ((udr) arrayList.get(i19)).c + ((udr) arrayList.get((i19 + i18) - 1)).d;
                float f4 = f;
                for (int i20 = 0; i20 < i18; i20++) {
                    c cVar3 = (c) arrayList.get(i19 + i20);
                    if (cVar3.b()) {
                        f4 += cVar3.e;
                    } else {
                        measuredWidth3 -= cVar3.a;
                    }
                }
                for (int i21 = 0; i21 < i18; i21++) {
                    c cVar4 = (c) arrayList.get(i19 + i21);
                    if (cVar4.b()) {
                        int ceil = (int) Math.ceil((cVar4.e / f4) * measuredWidth3);
                        int i22 = cVar4.c;
                        int i23 = cVar4.d;
                        cVar4.a(ceil - (i22 + i23), i22, i23);
                    }
                }
                i16++;
                f = 0.0f;
            }
            float f5 = 0.0f;
            float f6 = 0.0f;
            for (int i24 = 0; i24 < this.g; i24++) {
                c cVar5 = (c) arrayList.get(i24);
                if (cVar5.b()) {
                    float f7 = cVar5.e;
                    f6 += f7;
                    f5 = Math.max(f5, (cVar5.a - (cVar5.c + cVar5.d)) / f7);
                }
            }
            int i25 = 0;
            for (int i26 = 0; i26 < this.g; i26++) {
                c cVar6 = (c) arrayList.get(i26);
                if (cVar6.b()) {
                    cVar6.a((int) Math.ceil(cVar6.e * f5), cVar6.c, cVar6.d);
                }
                i25 += cVar6.a;
            }
            int max = Math.max(0, this.d.c - i25);
            for (int i27 = 0; i27 < this.g; i27++) {
                c cVar7 = (c) arrayList.get(i27);
                if (cVar7.b()) {
                    cVar7.a((int) Math.ceil(((max * cVar7.e) / f6) + (cVar7.a - (cVar7.c + cVar7.d))), cVar7.c, cVar7.d);
                }
            }
            int i28 = 0;
            for (int i29 = 0; i29 < this.g; i29++) {
                udr udrVar4 = (udr) arrayList.get(i29);
                udrVar4.b = i28;
                i28 += udrVar4.a;
            }
            this.j = true;
        }
        return arrayList;
    }

    public final int c() {
        ArrayList b = b();
        if (b.isEmpty()) {
            return 0;
        }
        udr udrVar = (udr) unr0.k(1, b);
        return udrVar.b + udrVar.a;
    }

    public final ArrayList d() {
        FitTableLayout.LayoutParams layoutParams;
        if (!this.i) {
            a();
        }
        boolean z = this.k;
        ArrayList arrayList = this.b;
        if (!z) {
            for (int i = 0; i < this.h; i++) {
                arrayList.add(new udr());
            }
            int i2 = 0;
            while (true) {
                ArrayList arrayList2 = this.c;
                if (i2 >= arrayList2.size()) {
                    break;
                }
                vdr vdrVar = (vdr) arrayList2.get(i2);
                udr udrVar = (udr) arrayList.get(vdrVar.c);
                View childAt = this.l.getChildAt(vdrVar.a);
                layoutParams = FitTableLayout.getLayoutParams(childAt);
                udrVar.a(childAt.getMeasuredHeight(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                i2++;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.h; i4++) {
                udr udrVar2 = (udr) arrayList.get(i4);
                udrVar2.b = i3;
                i3 += udrVar2.a;
            }
            this.k = true;
        }
        return arrayList;
    }
}
