package com.yandex.messenger.websdk.internal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.rd00;
import defpackage.we4;
import defpackage.ze4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u0014R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/yandex/messenger/websdk/internal/view/BackHandlingFrameLayout;", "Landroid/widget/FrameLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/KeyEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "dispatchKeyEventPreIme", "(Landroid/view/KeyEvent;)Z", "hasWindowFocus", "Lzy11;", "onWindowFocusChanged", "(Z)V", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "Lwe4;", "listener", "setOnBackClickListener", "(Lwe4;)V", BackendConfig.Restrictions.ENABLED, "setBackClickEnabled", "Lze4;", "backKeyPressedHelper", "Lze4;", "websdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BackHandlingFrameLayout extends FrameLayout {
    private final ze4 backKeyPressedHelper;

    public /* synthetic */ BackHandlingFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (((defpackage.jl40.l(r0.K, defpackage.deb.a) && (r0 = r0.f()) != null) ? r0.onBackPressed() : false) == true) goto L35;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchKeyEventPreIme(KeyEvent event) {
        ze4 ze4Var = this.backKeyPressedHelper;
        int keyCode = event.getKeyCode();
        BackHandlingFrameLayout backHandlingFrameLayout = ze4Var.a;
        if (ze4Var.c != null && keyCode == 4) {
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = backHandlingFrameLayout.getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(event, ze4Var);
                    return true;
                }
            } else if (event.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = backHandlingFrameLayout.getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(event);
                }
                if (event.isTracking() && !event.isCanceled() && (r0 = ((rd00) ze4Var.c).F) != null) {
                }
            }
        }
        return super.dispatchKeyEventPreIme(event);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        ze4 ze4Var = this.backKeyPressedHelper;
        if (changedView == ze4Var.a) {
            ze4Var.a();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
        ze4 ze4Var = this.backKeyPressedHelper;
        if (hasWindowFocus) {
            ze4Var.a();
        } else {
            ze4Var.getClass();
        }
    }

    public void setBackClickEnabled(boolean enabled) {
        ze4 ze4Var = this.backKeyPressedHelper;
        ze4Var.b = enabled;
        ze4Var.a();
    }

    public void setOnBackClickListener(we4 listener) {
        ze4 ze4Var = this.backKeyPressedHelper;
        ze4Var.c = listener;
        ze4Var.a();
    }

    public BackHandlingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public BackHandlingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public BackHandlingFrameLayout(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public BackHandlingFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ze4 ze4Var = new ze4(this);
        this.backKeyPressedHelper = ze4Var;
        getVisibility();
        ze4Var.a();
    }
}
