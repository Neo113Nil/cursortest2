package androidx.compose.material3;

import android.R;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import defpackage.bvf0;
import defpackage.dx20;
import defpackage.fwi;
import defpackage.g1i0;
import defpackage.g5b1;
import defpackage.jl40;
import defpackage.ldc;
import defpackage.mx20;
import defpackage.ny61;
import defpackage.o751;
import defpackage.ohh0;
import defpackage.p751;
import defpackage.q751;
import defpackage.rzo;
import defpackage.s8o;
import defpackage.sls;
import defpackage.tse;
import defpackage.ttd;
import defpackage.va90;
import defpackage.vng;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001>Ba\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010#\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b#\u0010$J3\u0010'\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)J\u0017\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u0010)R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00101R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010=\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006?"}, d2 = {"Landroidx/compose/material3/ModalBottomSheetDialogWrapper;", "Landroidx/activity/ComponentDialog;", "", "Lkotlin/Function0;", "Lzy11;", "onDismissRequest", "Lmx20;", "properties", "Lldc;", "contentColor", "Landroid/view/View;", "composeView", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lfwi;", "density", "Ljava/util/UUID;", "dialogId", "Landroidx/compose/animation/core/a;", "", "Loj2;", "predictiveBackProgress", "Ltse;", "scope", "<init>", "(Lsls;Lmx20;JLandroid/view/View;Landroidx/compose/ui/unit/LayoutDirection;Lfwi;Ljava/util/UUID;Landroidx/compose/animation/core/a;Ltse;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "setSecurePolicy", "(Landroidx/compose/ui/window/SecureFlagPolicy;)V", "Lttd;", "parentComposition", "children", "setContent", "(Lttd;Lwls;)V", "updateParameters-9LQNqLg", "(Lsls;Lmx20;JLandroidx/compose/ui/unit/LayoutDirection;)V", "updateParameters", "disposeComposition", "()V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "cancel", "Lsls;", "Lmx20;", "J", "Landroid/view/View;", "Landroidx/compose/material3/ModalBottomSheetDialogLayout;", "dialogLayout", "Landroidx/compose/material3/ModalBottomSheetDialogLayout;", "Ly7m;", "maxSupportedElevation", "F", "Landroidx/compose/ui/platform/AbstractComposeView;", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "androidx/compose/material3/k", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class ModalBottomSheetDialogWrapper extends ComponentDialog {
    private final View composeView;
    private long contentColor;
    private final ModalBottomSheetDialogLayout dialogLayout;
    private final float maxSupportedElevation;
    private sls onDismissRequest;
    private mx20 properties;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ModalBottomSheetDialogWrapper(sls slsVar, mx20 mx20Var, long j, View view, LayoutDirection layoutDirection, fwi fwiVar, UUID uuid, androidx.compose.animation.core.a aVar, tse tseVar) {
        super(new ContextThemeWrapper(view.getContext(), g1i0.EdgeToEdgeFloatingDialogWindowTheme), r1 ? 1 : 0, 2, null);
        boolean z = false;
        z = false;
        this.onDismissRequest = slsVar;
        this.properties = mx20Var;
        this.contentColor = j;
        this.composeView = view;
        this.maxSupportedElevation = 8.0f;
        Window window = getWindow();
        if (window == null) {
            ny61.r("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        jl40.L(window, false);
        ModalBottomSheetDialogLayout modalBottomSheetDialogLayout = new ModalBottomSheetDialogLayout(getContext(), window);
        modalBottomSheetDialogLayout.setTag(ohh0.compose_view_saveable_id_tag, "Dialog:" + uuid);
        modalBottomSheetDialogLayout.setClipChildren(false);
        modalBottomSheetDialogLayout.setElevation(fwiVar.w0(8.0f));
        modalBottomSheetDialogLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.material3.ModalBottomSheetDialogWrapper$1$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline result) {
                result.setRect(0, 0, view2.getWidth(), view2.getHeight());
                result.setAlpha(0.0f);
            }
        });
        this.dialogLayout = modalBottomSheetDialogLayout;
        setContentView(modalBottomSheetDialogLayout);
        vng.E(modalBottomSheetDialogLayout, vng.o(view));
        rzo.T(modalBottomSheetDialogLayout, rzo.z(view));
        s8o.R(modalBottomSheetDialogLayout, s8o.l(view));
        m41updateParameters9LQNqLg(this.onDismissRequest, this.properties, this.contentColor, layoutDirection);
        va90 va90Var = new va90(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        bvf0 q751Var = i >= 35 ? new q751(window, va90Var) : i >= 30 ? new p751(window, va90Var) : new o751(window, va90Var);
        this.properties.getClass();
        long j2 = this.contentColor;
        long j3 = ldc.l;
        q751Var.U(!ldc.c(j2, j3) && ((double) rzo.M(j2)) <= 0.5d);
        this.properties.getClass();
        if (!ldc.c(this.contentColor, j3) && rzo.M(r10) <= 0.5d) {
            z = true;
        }
        q751Var.T(z);
        getOnBackPressedDispatcher().a(this, new k(this.properties.b, tseVar, aVar, new j(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$2(ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper) {
        modalBottomSheetDialogWrapper.onDismissRequest.invoke();
        return zy11.a;
    }

    private final void setLayoutDirection(LayoutDirection layoutDirection) {
        ModalBottomSheetDialogLayout modalBottomSheetDialogLayout = this.dialogLayout;
        int i = dx20.a[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            w511.b();
            return;
        }
        modalBottomSheetDialogLayout.setLayoutDirection(i2);
    }

    private final void setSecurePolicy(SecureFlagPolicy securePolicy) {
        getWindow().setFlags(g5b1.a(securePolicy, a.g(this.composeView)) ? 8192 : -8193, 8192);
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

    /* renamed from: updateParameters-9LQNqLg, reason: not valid java name */
    public final void m41updateParameters9LQNqLg(sls onDismissRequest, mx20 properties, long contentColor, LayoutDirection layoutDirection) {
        this.onDismissRequest = onDismissRequest;
        this.properties = properties;
        this.contentColor = contentColor;
        setSecurePolicy(properties.a);
        setLayoutDirection(layoutDirection);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    public /* synthetic */ ModalBottomSheetDialogWrapper(sls slsVar, mx20 mx20Var, long j, View view, LayoutDirection layoutDirection, fwi fwiVar, UUID uuid, androidx.compose.animation.core.a aVar, tse tseVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(slsVar, mx20Var, j, view, layoutDirection, fwiVar, uuid, aVar, tseVar);
    }
}
