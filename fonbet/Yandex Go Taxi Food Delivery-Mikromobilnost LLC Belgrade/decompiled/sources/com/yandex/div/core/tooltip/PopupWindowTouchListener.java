package com.yandex.div.core.tooltip;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.yandex.div.core.view2.Div2View;
import defpackage.aw5;
import defpackage.izz0;
import defpackage.rvo;
import defpackage.sls;
import defpackage.tis0;
import defpackage.v3k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/yandex/div/core/tooltip/PopupWindowTouchListener;", "Landroid/view/View$OnTouchListener;", "Lcom/yandex/div/core/tooltip/DivTooltipContainer;", "tooltipContainer", "", "isModal", "shouldDismissByOutsideTouch", "", "Lv3k;", "tapOutsideActions", "Law5;", "bindingContext", "Lizz0;", "touchTranslationCoordinator", "handleSubstrateClick", "Lkotlin/Function0;", "Lzy11;", "onTouchOutside", "<init>", "(Lcom/yandex/div/core/tooltip/DivTooltipContainer;ZZLjava/util/List;Law5;Lizz0;ZLsls;)V", "Landroid/view/View;", "view", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Lcom/yandex/div/core/tooltip/DivTooltipContainer;", "Z", "Ljava/util/List;", "Law5;", "Lizz0;", "Lsls;", "Landroid/graphics/Rect;", "hitRect", "Landroid/graphics/Rect;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
final class PopupWindowTouchListener implements View.OnTouchListener {
    private final aw5 bindingContext;
    private final boolean handleSubstrateClick;
    private final Rect hitRect = new Rect();
    private final boolean isModal;
    private final sls onTouchOutside;
    private final boolean shouldDismissByOutsideTouch;
    private final List<v3k> tapOutsideActions;
    private final DivTooltipContainer tooltipContainer;
    private final izz0 touchTranslationCoordinator;

    public PopupWindowTouchListener(DivTooltipContainer divTooltipContainer, boolean z, boolean z2, List<v3k> list, aw5 aw5Var, izz0 izz0Var, boolean z3, sls slsVar) {
        this.tooltipContainer = divTooltipContainer;
        this.isModal = z;
        this.shouldDismissByOutsideTouch = z2;
        this.tapOutsideActions = list;
        this.bindingContext = aw5Var;
        this.touchTranslationCoordinator = izz0Var;
        this.handleSubstrateClick = z3;
        this.onTouchOutside = slsVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent event) {
        izz0 izz0Var = this.touchTranslationCoordinator;
        tis0 tis0Var = izz0Var.a;
        boolean z = tis0Var.b;
        if (z) {
            tis0Var.H(event);
            if (event.getActionMasked() == 1 || event.getActionMasked() == 3) {
                tis0Var.b = false;
            }
        }
        if (z && !tis0Var.b) {
            izz0Var.b.dismiss();
        }
        boolean z2 = this.handleSubstrateClick;
        DivTooltipContainer divTooltipContainer = this.tooltipContainer;
        if (z2) {
            View substrateView = divTooltipContainer.getSubstrateView();
            if (substrateView != null) {
                substrateView.getHitRect(this.hitRect);
            }
        } else {
            View tooltipView = divTooltipContainer.getTooltipView();
            if (tooltipView != null) {
                tooltipView.getHitRect(this.hitRect);
            }
        }
        if (this.hitRect.contains((int) event.getX(), (int) event.getY())) {
            return false;
        }
        if (event.getAction() == 1) {
            List<v3k> list = this.tapOutsideActions;
            if (list != null) {
                aw5 aw5Var = this.bindingContext;
                rvo rvoVar = aw5Var.b;
                Div2View div2View = aw5Var.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((Boolean) ((v3k) obj).b.a(rvoVar)).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    div2View.getDiv2Component().b().handleActionWithReason((v3k) it.next(), div2View, rvoVar, "click");
                }
            }
            if (this.shouldDismissByOutsideTouch) {
                this.onTouchOutside.invoke();
            }
        }
        return this.isModal;
    }
}
