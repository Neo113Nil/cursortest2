package androidx.compose.ui.window;

import android.R;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import androidx.activity.ComponentDialog;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.fwi;
import defpackage.hfj;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.ohh0;
import defpackage.pub1;
import defpackage.r1i0;
import defpackage.rzo;
import defpackage.s6q0;
import defpackage.s8o;
import defpackage.sej;
import defpackage.sls;
import defpackage.sm2;
import defpackage.tls;
import defpackage.tm2;
import defpackage.ttd;
import defpackage.vng;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.UUID;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J#\u0010$\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b$\u0010%J+\u0010&\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0016¢\u0006\u0004\b-\u0010)R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Landroidx/compose/ui/window/DialogWrapper;", "Landroidx/activity/ComponentDialog;", "", "Lkotlin/Function0;", "Lzy11;", "onDismissRequest", "Lsej;", "properties", "Landroid/view/View;", "composeView", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lfwi;", "density", "Ljava/util/UUID;", "dialogId", "<init>", "(Lsls;Lsej;Landroid/view/View;Landroidx/compose/ui/unit/LayoutDirection;Lfwi;Ljava/util/UUID;)V", "applyWindowTypeAndToken", "(Lsej;)V", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "setSecurePolicy", "(Landroidx/compose/ui/window/SecureFlagPolicy;)V", "", "keyCode", "Landroid/view/KeyEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "Lttd;", "parentComposition", "children", "setContent", "(Lttd;Lwls;)V", "updateParameters", "(Lsls;Lsej;Landroidx/compose/ui/unit/LayoutDirection;)V", "disposeComposition", "()V", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "cancel", "Lsls;", "Lsej;", "Landroid/view/View;", "Landroidx/compose/ui/window/DialogLayout;", "dialogLayout", "Landroidx/compose/ui/window/DialogLayout;", "Ly7m;", "maxSupportedElevation", "F", "isPressOutside", "Z", "Landroidx/compose/ui/platform/AbstractComposeView;", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class DialogWrapper extends ComponentDialog {
    private final View composeView;
    private final DialogLayout dialogLayout;
    private boolean isPressOutside;
    private final float maxSupportedElevation;
    private sls onDismissRequest;
    private sej properties;

    /* JADX WARN: Multi-variable type inference failed */
    public DialogWrapper(sls slsVar, sej sejVar, View view, LayoutDirection layoutDirection, fwi fwiVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), sejVar.e ? r1i0.DialogWindowTheme : r1i0.FloatingDialogWindowTheme), 0, 2, 0 == true ? 1 : 0);
        this.onDismissRequest = slsVar;
        this.properties = sejVar;
        this.composeView = view;
        this.maxSupportedElevation = 8.0f;
        Window window = getWindow();
        if (window == null) {
            ny61.r("Dialog has no window");
            throw null;
        }
        applyWindowTypeAndToken(this.properties);
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        jl40.L(window, this.properties.e);
        window.setGravity(17);
        if (!this.properties.e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            sm2.a.a(attributes);
            if (Build.VERSION.SDK_INT >= 30) {
                tm2 tm2Var = tm2.a;
                tm2Var.b(attributes, 0);
                tm2Var.c(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        DialogLayout dialogLayout = new DialogLayout(getContext(), window);
        setTitle(this.properties.f);
        dialogLayout.setTag(ohh0.compose_view_saveable_id_tag, "Dialog:" + uuid);
        dialogLayout.setClipChildren(false);
        dialogLayout.setElevation(fwiVar.w0(8.0f));
        dialogLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.ui.window.DialogWrapper$1$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline result) {
                result.setRect(0, 0, view2.getWidth(), view2.getHeight());
                result.setAlpha(0.0f);
            }
        });
        this.dialogLayout = dialogLayout;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            _init_$disableClipping(viewGroup);
        }
        setContentView(dialogLayout);
        vng.E(dialogLayout, vng.o(view));
        rzo.T(dialogLayout, rzo.z(view));
        s8o.R(dialogLayout, s8o.l(view));
        updateParameters(this.onDismissRequest, this.properties, layoutDirection);
        pub1.c(getOnBackPressedDispatcher(), this, new tls() { // from class: androidx.compose.ui.window.DialogWrapper.2
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                if (DialogWrapper.this.properties.a) {
                    DialogWrapper.this.onDismissRequest.invoke();
                }
                return zy11.a;
            }
        });
    }

    private static final void _init_$disableClipping(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof DialogLayout) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                _init_$disableClipping(viewGroup2);
            }
        }
    }

    private final void applyWindowTypeAndToken(sej properties) {
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.type = properties.g;
            window.setAttributes(attributes);
        }
    }

    private final void setLayoutDirection(LayoutDirection layoutDirection) {
        DialogLayout dialogLayout = this.dialogLayout;
        int i = hfj.a[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            w511.b();
            return;
        }
        dialogLayout.setLayoutDirection(i2);
    }

    private final void setSecurePolicy(SecureFlagPolicy securePolicy) {
        boolean c = e.c(this.composeView);
        int i = s6q0.a[securePolicy.ordinal()];
        if (i == 1) {
            c = false;
        } else if (i == 2) {
            c = true;
        } else if (i != 3) {
            w511.b();
            return;
        }
        getWindow().setFlags(c ? 8192 : -8193, 8192);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    public final void disposeComposition() {
        this.dialogLayout.disposeComposition();
    }

    public AbstractComposeView getSubCompositionView() {
        return this.dialogLayout;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (!this.properties.a || !event.isTracking() || event.isCanceled() || keyCode != 111) {
            return super.onKeyUp(keyCode, event);
        }
        this.onDismissRequest.invoke();
        return true;
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent event) {
        boolean onTouchEvent = super.onTouchEvent(event);
        if (!this.properties.b || this.dialogLayout.isInsideContent(event)) {
            int actionMasked = event.getActionMasked();
            if (actionMasked == 0 || actionMasked == 1 || actionMasked == 3) {
                this.isPressOutside = false;
                return onTouchEvent;
            }
        } else {
            int actionMasked2 = event.getActionMasked();
            if (actionMasked2 == 0) {
                this.isPressOutside = true;
                return true;
            }
            if (actionMasked2 != 1) {
                if (actionMasked2 == 3) {
                    this.isPressOutside = false;
                    return onTouchEvent;
                }
            } else if (this.isPressOutside) {
                this.onDismissRequest.invoke();
                this.isPressOutside = false;
                return true;
            }
        }
        return onTouchEvent;
    }

    public final void setContent(ttd parentComposition, wls children) {
        this.dialogLayout.setContent(parentComposition, children);
    }

    public final void updateParameters(sls onDismissRequest, sej properties, LayoutDirection layoutDirection) {
        this.onDismissRequest = onDismissRequest;
        this.properties = properties;
        setSecurePolicy(properties.c);
        setLayoutDirection(layoutDirection);
        boolean z = properties.e;
        this.dialogLayout.updateProperties(properties.d, z);
        setCanceledOnTouchOutside(properties.b);
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(z ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }
}
