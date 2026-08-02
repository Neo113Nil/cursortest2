package com.yandex.messaging.extension.view;

import android.view.View;
import defpackage.sls;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"com/yandex/messaging/extension/view/ViewExtensionsKt$onHeightChanged$listener$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "v", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lzy11;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "", "wasNotified", "Z", "getWasNotified", "()Z", "setWasNotified", "(Z)V", "currentHeight", CA20Status.STATUS_USER_I, "getCurrentHeight", "()I", "setCurrentHeight", "(I)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ViewExtensionsKt$onHeightChanged$listener$1 implements View.OnLayoutChangeListener {
    final /* synthetic */ sls $action;
    final /* synthetic */ View $this_onHeightChanged;
    private int currentHeight;
    private boolean wasNotified;

    public ViewExtensionsKt$onHeightChanged$listener$1(View view, sls slsVar) {
        this.$this_onHeightChanged = view;
        this.$action = slsVar;
        this.currentHeight = view.getHeight();
    }

    public final int getCurrentHeight() {
        return this.currentHeight;
    }

    public final boolean getWasNotified() {
        return this.wasNotified;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        if (this.currentHeight != v.getHeight()) {
            this.$action.invoke();
            this.wasNotified = true;
        } else if (!this.wasNotified && this.$this_onHeightChanged.isLaidOut()) {
            this.$action.invoke();
            this.wasNotified = true;
        }
        this.currentHeight = v.getHeight();
    }

    public final void setCurrentHeight(int i) {
        this.currentHeight = i;
    }

    public final void setWasNotified(boolean z) {
        this.wasNotified = z;
    }
}
