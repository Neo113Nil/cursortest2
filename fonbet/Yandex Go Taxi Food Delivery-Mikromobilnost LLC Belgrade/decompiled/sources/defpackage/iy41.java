package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import java.util.ArrayList;
import ru.yandex.taxi.widget.wheel.WheelView;

/* loaded from: classes6.dex */
public final class iy41 extends xso {
    public final /* synthetic */ WheelView G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy41(WheelView wheelView, WheelView wheelView2) {
        super(wheelView2);
        this.G = wheelView;
    }

    @Override // defpackage.xso
    public final int e(float f, float f2) {
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        WheelView wheelView = this.G;
        rectF = wheelView.virtualA11YPreviousRect;
        if (rectF.contains(f, f2)) {
            return 0;
        }
        rectF2 = wheelView.virtualA11YNextRect;
        if (rectF2.contains(f, f2)) {
            return 2;
        }
        rectF3 = wheelView.virtualA11YSelectedValueRect;
        return rectF3.contains(f, f2) ? 1 : -1;
    }

    @Override // defpackage.xso
    public final void f(ArrayList arrayList) {
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
    
        r1 = r0.adapter;
     */
    @Override // defpackage.xso
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(int i, int i2, Bundle bundle) {
        int i3;
        int i4;
        wd11 wd11Var;
        int i5;
        int i6;
        if (i2 != 16) {
            return false;
        }
        WheelView wheelView = this.G;
        if (i == 0) {
            i3 = wheelView.selectedItem;
            if (i3 > 0) {
                i4 = wheelView.selectedItem;
                wheelView.setCurrentItem(i4 - 1, true);
                wheelView.onItemSelected();
            }
        } else if (i == 2 && wd11Var != null) {
            i5 = wheelView.selectedItem;
            if (i5 < wd11Var.a() - 1) {
                i6 = wheelView.selectedItem;
                wheelView.setCurrentItem(i6 + 1, true);
                wheelView.onItemSelected();
                return true;
            }
        }
        return true;
    }

    @Override // defpackage.xso
    public final void m(int i, wh whVar) {
        int i2;
        RectF rectF;
        wd11 wd11Var;
        String str;
        RectF rectF2;
        int i3;
        wd11 wd11Var2;
        RectF rectF3;
        int i4;
        WheelView wheelView = this.G;
        if (i == 0) {
            i2 = wheelView.selectedItem;
            whVar.v(!(i2 == 0));
            whVar.a(16);
            whVar.E(wheelView.getResources().getString(mzh0.wheel_picker_previous_button_content_description));
            whVar.p("android.widget.Button");
            Rect rect = new Rect();
            rectF = wheelView.virtualA11YPreviousRect;
            rectF.round(rect);
            whVar.k(rect);
            return;
        }
        if (i == 1) {
            wd11Var = wheelView.adapter;
            if (wd11Var == null || wd11Var.a() <= 0) {
                str = "";
            } else {
                i3 = wheelView.selectedItem;
                str = wheelView.getContentText(wd11Var.a.a(i3));
            }
            whVar.E(str);
            whVar.C(true);
            Rect rect2 = new Rect();
            rectF2 = wheelView.virtualA11YSelectedValueRect;
            rectF2.round(rect2);
            whVar.k(rect2);
            return;
        }
        if (i != 2) {
            return;
        }
        Rect rect3 = new Rect();
        whVar.E(wheelView.getResources().getString(mzh0.wheel_picker_next_button_content_description));
        wd11Var2 = wheelView.adapter;
        if (wd11Var2 != null) {
            i4 = wheelView.selectedItem;
            if (i4 == wd11Var2.a() - 1) {
                r2 = true;
            }
        }
        whVar.v(!r2);
        whVar.p("android.widget.Button");
        whVar.a(16);
        rectF3 = wheelView.virtualA11YNextRect;
        rectF3.round(rect3);
        whVar.k(rect3);
    }
}
