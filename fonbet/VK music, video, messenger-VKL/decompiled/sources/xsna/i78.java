package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import xsna.bqx0;
import xsna.t1u0;

/* compiled from: BottomSheetBehavior.java */
/* loaded from: classes13.dex */
public final class i78 implements t1u0.b {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ BottomSheetBehavior b;

    public i78(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.b = bottomSheetBehavior;
        this.a = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    @Override // xsna.t1u0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bqx0 a(View view, bqx0 bqx0Var, t1u0.c cVar) {
        boolean z;
        boolean z2;
        bqx0.q qVar = bqx0Var.a;
        h4x i = qVar.i(519);
        h4x i2 = qVar.i(32);
        int i3 = i.b;
        int i4 = i.c;
        int i5 = i.a;
        BottomSheetBehavior bottomSheetBehavior = this.b;
        bottomSheetBehavior.x = i3;
        boolean d = t1u0.d(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        if (bottomSheetBehavior.p) {
            int a = bqx0Var.a();
            bottomSheetBehavior.w = a;
            paddingBottom = a + cVar.d;
        }
        if (bottomSheetBehavior.q) {
            paddingLeft = (d ? cVar.c : cVar.a) + i5;
        }
        if (bottomSheetBehavior.r) {
            paddingRight = (d ? cVar.a : cVar.c) + i4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z3 = true;
        if (!bottomSheetBehavior.t || marginLayoutParams.leftMargin == i5) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i5;
            z = true;
        }
        if (bottomSheetBehavior.u && marginLayoutParams.rightMargin != i4) {
            marginLayoutParams.rightMargin = i4;
            z = true;
        }
        if (bottomSheetBehavior.v) {
            int i6 = marginLayoutParams.topMargin;
            int i7 = i.b;
            if (i6 != i7) {
                marginLayoutParams.topMargin = i7;
                if (z3) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z2 = this.a;
                if (z2) {
                    bottomSheetBehavior.n = i2.d;
                }
                if (bottomSheetBehavior.p && !z2) {
                    return bqx0Var;
                }
                bottomSheetBehavior.f0(false);
                return bqx0Var;
            }
        }
        z3 = z;
        if (z3) {
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        z2 = this.a;
        if (z2) {
        }
        if (bottomSheetBehavior.p) {
        }
        bottomSheetBehavior.f0(false);
        return bqx0Var;
    }
}
