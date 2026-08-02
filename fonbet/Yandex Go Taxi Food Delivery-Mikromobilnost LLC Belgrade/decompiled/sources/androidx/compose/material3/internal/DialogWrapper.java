package androidx.compose.material3.internal;

import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import defpackage.bvf0;
import defpackage.fwi;
import defpackage.g1i0;
import defpackage.g5b1;
import defpackage.ifj;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.o751;
import defpackage.ohh0;
import defpackage.p751;
import defpackage.q751;
import defpackage.rzo;
import defpackage.s8o;
import defpackage.sej;
import defpackage.sls;
import defpackage.ttd;
import defpackage.va90;
import defpackage.vng;
import defpackage.w511;
import defpackage.wls;
import java.util.UUID;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J#\u0010$\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b$\u0010%J;\u0010&\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0016¢\u0006\u0004\b-\u0010)R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010:\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Landroidx/compose/material3/internal/DialogWrapper;", "Landroidx/activity/ComponentDialog;", "", "Lkotlin/Function0;", "Lzy11;", "onDismissRequest", "Lsej;", "properties", "Landroid/view/View;", "composeView", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lfwi;", "density", "Ljava/util/UUID;", "dialogId", "", "lightStatusBars", "lightNavigationBars", "<init>", "(Lsls;Lsej;Landroid/view/View;Landroidx/compose/ui/unit/LayoutDirection;Lfwi;Ljava/util/UUID;ZZ)V", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "setSecurePolicy", "(Landroidx/compose/ui/window/SecureFlagPolicy;)V", "", "keyCode", "Landroid/view/KeyEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "Lttd;", "parentComposition", "children", "setContent", "(Lttd;Lwls;)V", "updateParameters", "(Lsls;Lsej;Landroidx/compose/ui/unit/LayoutDirection;ZZ)V", "disposeComposition", "()V", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "cancel", "Lsls;", "Lsej;", "Landroid/view/View;", "Landroidx/compose/material3/internal/DialogLayout;", "dialogLayout", "Landroidx/compose/material3/internal/DialogLayout;", "Ly7m;", "maxSupportedElevation", "F", "Landroidx/compose/ui/platform/AbstractComposeView;", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class DialogWrapper extends ComponentDialog {
    private final View composeView;
    private final DialogLayout dialogLayout;
    private final float maxSupportedElevation;
    private sls onDismissRequest;
    private sej properties;

    public DialogWrapper(sls slsVar, sej sejVar, View view, LayoutDirection layoutDirection, fwi fwiVar, UUID uuid, boolean z, boolean z2) {
        super(new ContextThemeWrapper(view.getContext(), g1i0.EdgeToEdgeFloatingDialogWindowTheme), 0, 2, null);
        this.onDismissRequest = slsVar;
        this.properties = sejVar;
        this.composeView = view;
        this.maxSupportedElevation = 8.0f;
        Window window = getWindow();
        if (window == null) {
            ny61.r("Dialog has no window");
            throw null;
        }
        jl40.L(window, false);
        DialogLayout dialogLayout = new DialogLayout(getContext(), window);
        dialogLayout.setTag(ohh0.compose_view_saveable_id_tag, "Dialog:" + uuid);
        dialogLayout.setClipChildren(false);
        dialogLayout.setElevation(fwiVar.w0(8.0f));
        dialogLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.material3.internal.DialogWrapper$1$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline result) {
                result.setRect(0, 0, view2.getWidth(), view2.getHeight());
                result.setAlpha(0.0f);
            }
        });
        this.dialogLayout = dialogLayout;
        setContentView(dialogLayout);
        vng.E(dialogLayout, vng.o(view));
        rzo.T(dialogLayout, rzo.z(view));
        s8o.R(dialogLayout, s8o.l(view));
        updateParameters(this.onDismissRequest, this.properties, layoutDirection, z, z2);
    }

    private final void setLayoutDirection(LayoutDirection layoutDirection) {
        DialogLayout dialogLayout = this.dialogLayout;
        int i = ifj.a[layoutDirection.ordinal()];
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
        getWindow().setFlags(g5b1.a(securePolicy, androidx.compose.material3.a.g(this.composeView)) ? 8192 : -8193, 8192);
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
        if (onTouchEvent) {
            this.onDismissRequest.invoke();
        }
        return onTouchEvent;
    }

    public final void setContent(ttd parentComposition, wls children) {
        this.dialogLayout.setContent(parentComposition, children);
    }

    public final void updateParameters(sls onDismissRequest, sej properties, LayoutDirection layoutDirection, boolean lightStatusBars, boolean lightNavigationBars) {
        this.onDismissRequest = onDismissRequest;
        this.properties = properties;
        setSecurePolicy(properties.c);
        setLayoutDirection(layoutDirection);
        Window window = getWindow();
        if (window != null) {
            va90 va90Var = new va90(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            bvf0 q751Var = i >= 35 ? new q751(window, va90Var) : i >= 30 ? new p751(window, va90Var) : new o751(window, va90Var);
            q751Var.U(lightStatusBars);
            q751Var.T(lightNavigationBars);
            window.setLayout(-1, -1);
            window.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }
}
