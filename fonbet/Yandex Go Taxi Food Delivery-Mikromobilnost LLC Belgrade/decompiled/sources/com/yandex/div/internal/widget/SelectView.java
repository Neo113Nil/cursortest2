package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import androidx.appcompat.widget.DropDownListView;
import com.yandex.div.internal.widget.SelectView;
import defpackage.jzv;
import defpackage.t37;
import defpackage.tls;
import defpackage.veq0;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!R0\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010*\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/yandex/div/internal/widget/SelectView;", "Lcom/yandex/div/internal/widget/EllipsizedTextView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "", "items", "Lzy11;", "setItems", "(Ljava/util/List;)V", "", "changed", "", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "onDetachedFromWindow", "()V", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "onInitializeAccessibilityNodeInfo", "(Landroid/view/accessibility/AccessibilityNodeInfo;)V", "getAccessibilityClassName", "()Ljava/lang/String;", "Lkotlin/Function1;", "onItemSelectedListener", "Ltls;", "getOnItemSelectedListener", "()Ltls;", "setOnItemSelectedListener", "(Ltls;)V", "Ljzv;", "focusTracker", "Ljzv;", "getFocusTracker", "()Ljzv;", "setFocusTracker", "(Ljzv;)V", "Lveq0;", "popupWindow", "Lveq0;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class SelectView extends EllipsizedTextView {
    private jzv focusTracker;
    private tls onItemSelectedListener;
    private final veq0 popupWindow;

    public SelectView(Context context) {
        super(context, null, 0, 6, null);
        setOnClickListener(new t37(4, this));
        final veq0 veq0Var = new veq0(context);
        veq0Var.e();
        veq0Var.H = this;
        veq0Var.I = new AdapterView.OnItemClickListener() { // from class: ueq0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                SelectView.popupWindow$lambda$3$lambda$2(SelectView.this, veq0Var, adapterView, view, i, j);
            }
        };
        veq0Var.D = true;
        veq0Var.C = true;
        veq0Var.setBackgroundDrawable(new ColorDrawable(-1));
        veq0Var.setAdapter(veq0Var.U);
        this.popupWindow = veq0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(SelectView selectView, View view) {
        jzv jzvVar = selectView.focusTracker;
        if (jzvVar != null) {
            com.yandex.div.core.view2.divs.a.m(selectView, jzvVar);
        }
        DropDownListView dropDownListView = selectView.popupWindow.c;
        if (dropDownListView != null) {
            dropDownListView.setSelectionAfterHeaderView();
        }
        selectView.popupWindow.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void popupWindow$lambda$3$lambda$2(SelectView selectView, veq0 veq0Var, AdapterView adapterView, View view, int i, long j) {
        selectView.sendAccessibilityEvent(4);
        tls tlsVar = selectView.onItemSelectedListener;
        if (tlsVar != null) {
            tlsVar.invoke(Integer.valueOf(i));
        }
        veq0Var.dismiss();
    }

    public final jzv getFocusTracker() {
        return this.focusTracker;
    }

    public final tls getOnItemSelectedListener() {
        return this.onItemSelectedListener;
    }

    @Override // com.yandex.div.internal.widget.EllipsizedTextView, androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.popupWindow.S.isShowing()) {
            this.popupWindow.dismiss();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        info.setCanOpenPopup(true);
        info.setText(getText());
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed && this.popupWindow.S.isShowing()) {
            this.popupWindow.show();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        super.onVisibilityChanged(changedView, visibility);
        if (visibility == 0 || !this.popupWindow.S.isShowing()) {
            return;
        }
        this.popupWindow.dismiss();
    }

    public final void setFocusTracker(jzv jzvVar) {
        this.focusTracker = jzvVar;
    }

    public final void setItems(List<String> items) {
        this.popupWindow.U.setItems(items);
    }

    public final void setOnItemSelectedListener(tls tlsVar) {
        this.onItemSelectedListener = tlsVar;
    }

    @Override // android.widget.TextView, android.view.View
    public String getAccessibilityClassName() {
        return "android.widget.Spinner";
    }
}
