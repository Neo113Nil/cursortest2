package com.yandex.div.core.view2.backbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ryh;
import defpackage.ve4;
import defpackage.ye4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0007H\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/yandex/div/core/view2/backbutton/BackHandlingRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "keyCode", "Landroid/view/KeyEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onKeyPreIme", "(ILandroid/view/KeyEvent;)Z", "hasWindowFocus", "Lzy11;", "onWindowFocusChanged", "(Z)V", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "Lve4;", "listener", "setOnBackClickListener", "(Lve4;)V", "Lye4;", "backKeyPressedHelper", "Lye4;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class BackHandlingRecyclerView extends RecyclerView {
    private final ye4 backKeyPressedHelper;

    public /* synthetic */ BackHandlingRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.view.View
    public boolean onKeyPreIme(int keyCode, KeyEvent event) {
        boolean z;
        ye4 ye4Var = this.backKeyPressedHelper;
        BackHandlingRecyclerView backHandlingRecyclerView = ye4Var.a;
        if (ye4Var.b != null && keyCode == 4) {
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = backHandlingRecyclerView.getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(event, ye4Var);
                }
                z = true;
            } else if (event.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = backHandlingRecyclerView.getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(event);
                }
                if (event.isTracking() && !event.isCanceled()) {
                    z = ((ryh) ye4Var.b).A();
                }
            }
            return !z || super.onKeyPreIme(keyCode, event);
        }
        z = false;
        if (z) {
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        this.backKeyPressedHelper.a();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
        ye4 ye4Var = this.backKeyPressedHelper;
        if (hasWindowFocus) {
            ye4Var.a();
        } else {
            ye4Var.getClass();
        }
    }

    public void setOnBackClickListener(ve4 listener) {
        setDescendantFocusability(listener != null ? 131072 : 262144);
        ye4 ye4Var = this.backKeyPressedHelper;
        ye4Var.b = listener;
        ye4Var.a();
    }

    public BackHandlingRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.backKeyPressedHelper = new ye4(this);
    }
}
