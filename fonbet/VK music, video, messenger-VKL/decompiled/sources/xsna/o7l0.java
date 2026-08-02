package xsna;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.details.holders.PackStylesListHolder;
import com.vk.stickers.views.LongtapRecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: StickerStyleSelectorView.kt */
/* loaded from: classes6.dex */
public final class o7l0 extends LinearLayout implements g7l0 {
    public f7l0 b;
    public LongtapRecyclerView c;
    public e7l0 d;
    public t3l0 e;
    public ViewGroup f;
    public int g;
    public View h;
    public ucl0 i;

    public final void b() {
        this.c.setVisibility(0);
        f4m.j(this.h);
    }

    public final void c(StickerStockItem stickerStockItem, StickerStockItem stickerStockItem2, List<qai0> list, PackStylesListHolder.State state, int i, int i2) {
        e7l0 e7l0Var = this.d;
        kcl0 kcl0Var = e7l0Var.j;
        ArrayList arrayList = new ArrayList();
        List<qai0> list2 = list;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        for (qai0 qai0Var : list2) {
            StickerStockItem stickerStockItem3 = qai0Var.a;
            arrayList2.add(new qai0(stickerStockItem3, qai0Var.b, kcl0Var.j(stickerStockItem3)));
        }
        arrayList.add(new a790(state, arrayList2, i, i2));
        arrayList.add(iki0.b);
        arrayList.add(new y690(stickerStockItem));
        for (StickerItem stickerItem : stickerStockItem.g) {
            if (stickerItem.g.V0() && kcl0Var.K0() && yse0.c.a()) {
                arrayList.add(new zl2(stickerItem, stickerStockItem));
            } else {
                arrayList.add(new y1l0(stickerItem, stickerStockItem));
            }
        }
        arrayList.add(new u690(stickerStockItem));
        e7l0Var.setItems(arrayList);
        t3l0 t3l0Var = this.e;
        if (t3l0Var != null) {
            t3l0Var.m6(stickerStockItem, stickerStockItem2);
        }
        ViewGroup viewGroup = this.f;
        if (viewGroup != null) {
            awt0.s(viewGroup, new k75(17, this, viewGroup));
        }
    }

    public final ucl0 getPackSearchClickTracker() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f7l0 presenter = getPresenter();
        if (presenter != null) {
            presenter.onResume();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f7l0 presenter = getPresenter();
        if (presenter != null) {
            presenter.onDestroy();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        LongtapRecyclerView longtapRecyclerView = this.c;
        if (motionEvent.getAction() != 0 || longtapRecyclerView.getScrollState() != 2) {
            return false;
        }
        longtapRecyclerView.stopScroll();
        return false;
    }

    public final void setPackSearchClickTracker(ucl0 ucl0Var) {
        this.i = ucl0Var;
    }

    public final void setStickerDetailsStateListener(t3l0 t3l0Var) {
        this.e = t3l0Var;
    }

    @Override // xsna.dc6
    public f7l0 getPresenter() {
        return this.b;
    }

    @Override // xsna.dc6
    public void setPresenter(f7l0 f7l0Var) {
        this.b = f7l0Var;
    }
}
