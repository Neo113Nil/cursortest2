package com.yandex.messaging.views.bottomsheet;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.yandex.bricks.BrickSlotView;
import com.yandex.bricks.c;
import com.yandex.messaging.views.bottomsheet.NavigableBottomSheetDialog;
import com.yandex.messaging.views.bottomsheet.a;
import defpackage.ai91;
import defpackage.e9h0;
import defpackage.i3y;
import defpackage.kgx;
import defpackage.n751;
import defpackage.ny61;
import defpackage.olh0;
import defpackage.op3;
import defpackage.sc20;
import defpackage.sls;
import defpackage.u1w;
import defpackage.w0i0;
import defpackage.wwg0;
import defpackage.zf6;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/yandex/messaging/views/bottomsheet/NavigableBottomSheetDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Lzy11;", "setupInsetsHandling", "()V", "onAttachedToWindow", "onDialogDismissed", "Landroid/content/DialogInterface$OnDismissListener;", "listener", "setOnDismissListener", "(Landroid/content/DialogInterface$OnDismissListener;)V", "", "layoutResID", "setContentView", "(I)V", "Landroid/view/View;", "bgView$delegate", "Li3y;", "getBgView", "()Landroid/view/View;", "bgView", "Lcom/yandex/messaging/views/bottomsheet/a;", "navigator$delegate", "getNavigator", "()Lcom/yandex/messaging/views/bottomsheet/a;", "navigator", "onDismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class NavigableBottomSheetDialog extends BottomSheetDialog {
    public static final int $stable = 8;

    /* renamed from: bgView$delegate, reason: from kotlin metadata */
    private final i3y bgView;

    /* renamed from: navigator$delegate, reason: from kotlin metadata */
    private final i3y navigator;
    private final DialogInterface.OnDismissListener onDismissListener;

    public NavigableBottomSheetDialog(Activity activity) {
        super(activity, w0i0.Messaging_Theme_BottomSheetDialog_Navigable);
        final int i = 0;
        this.bgView = kotlin.a.a(new sls(this) { // from class: v550
            public final /* synthetic */ NavigableBottomSheetDialog b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                View bgView_delegate$lambda$0;
                a navigator_delegate$lambda$1;
                int i2 = i;
                NavigableBottomSheetDialog navigableBottomSheetDialog = this.b;
                switch (i2) {
                    case 0:
                        bgView_delegate$lambda$0 = NavigableBottomSheetDialog.bgView_delegate$lambda$0(navigableBottomSheetDialog);
                        return bgView_delegate$lambda$0;
                    default:
                        navigator_delegate$lambda$1 = NavigableBottomSheetDialog.navigator_delegate$lambda$1(navigableBottomSheetDialog);
                        return navigator_delegate$lambda$1;
                }
            }
        });
        final int i2 = 1;
        this.navigator = kotlin.a.a(new sls(this) { // from class: v550
            public final /* synthetic */ NavigableBottomSheetDialog b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                View bgView_delegate$lambda$0;
                a navigator_delegate$lambda$1;
                int i22 = i2;
                NavigableBottomSheetDialog navigableBottomSheetDialog = this.b;
                switch (i22) {
                    case 0:
                        bgView_delegate$lambda$0 = NavigableBottomSheetDialog.bgView_delegate$lambda$0(navigableBottomSheetDialog);
                        return bgView_delegate$lambda$0;
                    default:
                        navigator_delegate$lambda$1 = NavigableBottomSheetDialog.navigator_delegate$lambda$1(navigableBottomSheetDialog);
                        return navigator_delegate$lambda$1;
                }
            }
        });
        zf6 zf6Var = new zf6(5, this);
        this.onDismissListener = zf6Var;
        setCanceledOnTouchOutside(true);
        getBehavior().Q(false);
        getBehavior().g0 = true;
        setContentView(olh0.msg_d_bottomsheet_navigable);
        getBgView().setBackgroundResource(wwg0.msg_bg_rounded_dialog);
        super.setOnDismissListener(zf6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View bgView_delegate$lambda$0(NavigableBottomSheetDialog navigableBottomSheetDialog) {
        View findViewById = navigableBottomSheetDialog.findViewById(e9h0.navigable_bottomsheet_bg);
        if (findViewById != null) {
            return findViewById;
        }
        ny61.r("not found");
        return null;
    }

    private final View getBgView() {
        return (View) this.bgView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a navigator_delegate$lambda$1(NavigableBottomSheetDialog navigableBottomSheetDialog) {
        BrickSlotView brickSlotView = (BrickSlotView) navigableBottomSheetDialog.findViewById(e9h0.navigable_bottomsheet_container);
        if (brickSlotView != null) {
            return new a(new c(brickSlotView), navigableBottomSheetDialog.getBgView(), navigableBottomSheetDialog);
        }
        ny61.r("container required");
        return null;
    }

    private final void setupInsetsHandling() {
        View findViewById = findViewById(e9h0.navigable_bottomsheet_root);
        if (findViewById != null) {
            ai91.b(new sc20(18, this), findViewById);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n751 setupInsetsHandling$lambda$3(NavigableBottomSheetDialog navigableBottomSheetDialog, View view, n751 n751Var) {
        u1w g = n751Var.a.g(2);
        View findViewById = navigableBottomSheetDialog.findViewById(e9h0.navigable_bottomsheet_container);
        if (findViewById != null) {
            findViewById.setPadding(g.a, g.b, g.c, g.d);
        }
        return n751Var;
    }

    public final a getNavigator() {
        return (a) this.navigator.getValue();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setupInsetsHandling();
    }

    public void onDialogDismissed() {
        a navigator = getNavigator();
        ViewPropertyAnimator viewPropertyAnimator = navigator.i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        navigator.i = null;
        ViewPropertyAnimator viewPropertyAnimator2 = navigator.j;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        navigator.j = null;
        ValueAnimator valueAnimator = navigator.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        navigator.h = null;
        op3 op3Var = navigator.k;
        kgx kgxVar = a.m[0];
        op3Var.b(null);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public final void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener listener) {
        throw new IllegalArgumentException("Don't reset base listener, override onDialogDismissed instead");
    }
}
