package com.yandex.div.core.view2.divs.gallery;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.e0;
import androidx.recyclerview.widget.f0;
import androidx.recyclerview.widget.g0;
import xsna.epx;

/* compiled from: PagerSnapStartHelper.kt */
/* loaded from: classes7.dex */
public final class PagerSnapStartHelper extends g0 {
    private f0 _horizontalHelper;
    private f0 _verticalHelper;
    private int itemSpacing;

    public PagerSnapStartHelper(int i) {
        this.itemSpacing = i;
    }

    private final int distanceToCenter(RecyclerView.o oVar, View view, f0 f0Var) {
        float y;
        int height;
        int f;
        if (oVar.canScrollHorizontally()) {
            y = view.getX();
            height = view.getWidth() / 2;
        } else {
            y = view.getY();
            height = view.getHeight() / 2;
        }
        int i = (int) (y + height);
        if (oVar.getClipToPadding()) {
            f = (f0Var.l() / 2) + f0Var.k();
        } else {
            f = f0Var.f() / 2;
        }
        return i - f;
    }

    private final f0 getHorizontalHelper(RecyclerView.o oVar) {
        f0 f0Var = this._horizontalHelper;
        if (f0Var != null) {
            if (!epx.f(f0Var.a, oVar)) {
                f0Var = null;
            }
            if (f0Var != null) {
                return f0Var;
            }
        }
        d0 d0Var = new d0(oVar);
        this._horizontalHelper = d0Var;
        return d0Var;
    }

    private final f0 getVerticalHelper(RecyclerView.o oVar) {
        f0 f0Var = this._verticalHelper;
        if (f0Var != null) {
            if (!epx.f(f0Var.a, oVar)) {
                f0Var = null;
            }
            if (f0Var != null) {
                return f0Var;
            }
        }
        e0 e0Var = new e0(oVar);
        this._verticalHelper = e0Var;
        return e0Var;
    }

    @Override // androidx.recyclerview.widget.g0, androidx.recyclerview.widget.o0
    public int[] calculateDistanceToFinalSnap(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.canScrollHorizontally()) {
            iArr[0] = distanceToCenter(oVar, view, getHorizontalHelper(oVar));
            return iArr;
        }
        if (oVar.canScrollVertically()) {
            iArr[1] = distanceToCenter(oVar, view, getVerticalHelper(oVar));
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.g0, androidx.recyclerview.widget.o0
    public int findTargetSnapPosition(RecyclerView.o oVar, int i, int i2) {
        DivGalleryItemHelper divGalleryItemHelper = (DivGalleryItemHelper) oVar;
        if (divGalleryItemHelper.getLayoutManagerOrientation() != 0) {
            i = i2;
        } else if (oVar.getLayoutDirection() != 0) {
            i = -i;
        }
        int firstCompletelyVisibleItemPosition = i < 0 ? divGalleryItemHelper.firstCompletelyVisibleItemPosition() : divGalleryItemHelper.lastCompletelyVisibleItemPosition();
        if (firstCompletelyVisibleItemPosition != -1) {
            return firstCompletelyVisibleItemPosition;
        }
        int firstVisibleItemPosition = divGalleryItemHelper.firstVisibleItemPosition();
        int lastVisibleItemPosition = divGalleryItemHelper.lastVisibleItemPosition();
        if (lastVisibleItemPosition == firstVisibleItemPosition) {
            if (lastVisibleItemPosition == -1) {
                return 0;
            }
        } else if (i < 0) {
            return firstVisibleItemPosition;
        }
        return lastVisibleItemPosition;
    }

    public final void setItemSpacing(int i) {
        this.itemSpacing = i;
    }
}
