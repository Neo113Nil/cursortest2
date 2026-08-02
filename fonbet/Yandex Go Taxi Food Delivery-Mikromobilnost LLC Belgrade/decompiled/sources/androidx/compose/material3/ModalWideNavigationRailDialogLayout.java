package androidx.compose.material3;

import android.content.Context;
import android.os.Build;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.aii0;
import defpackage.bts;
import defpackage.fid;
import defpackage.g6i0;
import defpackage.gfj;
import defpackage.oz40;
import defpackage.qfd;
import defpackage.s330;
import defpackage.sls;
import defpackage.tls;
import defpackage.ttd;
import defpackage.ue4;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u000289B_\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J#\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0014¢\u0006\u0004\b \u0010\u0017J\u000f\u0010!\u001a\u00020\nH\u0014¢\u0006\u0004\b!\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010(R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010*R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010+R7\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b\u001c\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R$\u00106\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00078\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b6\u0010%\u001a\u0004\b7\u0010'¨\u0006:"}, d2 = {"Landroidx/compose/material3/ModalWideNavigationRailDialogLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Lgfj;", "Landroid/content/Context;", "context", "Landroid/view/Window;", "window", "", "shouldDismissOnBackPress", "Lkotlin/Function0;", "Lzy11;", "onDismissRequest", "Lkotlin/Function1;", "", "onPredictiveBack", "onPredictiveBackCancelled", "Lg6i0;", "predictiveBackState", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<init>", "(Landroid/content/Context;Landroid/view/Window;ZLsls;Ltls;Lsls;Lg6i0;Landroidx/compose/ui/unit/LayoutDirection;)V", "maybeRegisterBackCallback", "()V", "maybeUnregisterBackCallback", "Lttd;", "parent", "content", "setContent", "(Lttd;Lwls;)V", "Content", "(Lfid;I)V", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/Window;", "getWindow", "()Landroid/view/Window;", "Z", "getShouldDismissOnBackPress", "()Z", "Lsls;", "Ltls;", "Lg6i0;", "Landroidx/compose/ui/unit/LayoutDirection;", "<set-?>", "content$delegate", "Loz40;", "getContent", "()Lwls;", "(Lwls;)V", "", "backCallback", "Ljava/lang/Object;", "value", "shouldCreateCompositionOnAttachedToWindow", "getShouldCreateCompositionOnAttachedToWindow", "Api34Impl", "s330", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class ModalWideNavigationRailDialogLayout extends AbstractComposeView implements gfj {
    private Object backCallback;

    /* renamed from: content$delegate, reason: from kotlin metadata */
    private final oz40 content;
    private final LayoutDirection layoutDirection;
    private final sls onDismissRequest;
    private final tls onPredictiveBack;
    private final sls onPredictiveBackCancelled;
    private final g6i0 predictiveBackState;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private final boolean shouldDismissOnBackPress;
    private final Window window;

    public abstract class Api34Impl {
        public static final OnBackAnimationCallback a(final sls slsVar, final tls tlsVar, final sls slsVar2, final g6i0 g6i0Var, final LayoutDirection layoutDirection) {
            return new OnBackAnimationCallback() { // from class: androidx.compose.material3.ModalWideNavigationRailDialogLayout$Api34Impl$createBackCallback$1
                public void onBackCancelled() {
                    slsVar2.invoke();
                }

                public void onBackInvoked() {
                    slsVar.invoke();
                }

                public void onBackProgressed(BackEvent backEvent) {
                    g6i0 g6i0Var2 = g6i0.this;
                    boolean z = false;
                    boolean z2 = backEvent.getSwipeEdge() == 0;
                    boolean z3 = layoutDirection == LayoutDirection.Rtl;
                    g6i0Var2.getClass();
                    if ((z2 && !z3) || (!z2 && z3)) {
                        z = true;
                    }
                    g6i0Var2.a.setValue(Boolean.valueOf(z));
                    tlsVar.invoke(Float.valueOf(ue4.a.a(backEvent.getProgress())));
                }

                public void onBackStarted(BackEvent backEvent) {
                    g6i0 g6i0Var2 = g6i0.this;
                    boolean z = false;
                    boolean z2 = backEvent.getSwipeEdge() == 0;
                    boolean z3 = layoutDirection == LayoutDirection.Rtl;
                    g6i0Var2.getClass();
                    if ((z2 && !z3) || (!z2 && z3)) {
                        z = true;
                    }
                    g6i0Var2.a.setValue(Boolean.valueOf(z));
                    tlsVar.invoke(Float.valueOf(ue4.a.a(backEvent.getProgress())));
                }
            };
        }
    }

    public ModalWideNavigationRailDialogLayout(Context context, Window window, boolean z, sls slsVar, tls tlsVar, sls slsVar2, g6i0 g6i0Var, LayoutDirection layoutDirection) {
        super(context, null, 0, 6, null);
        this.window = window;
        this.shouldDismissOnBackPress = z;
        this.onDismissRequest = slsVar;
        this.onPredictiveBack = tlsVar;
        this.onPredictiveBackCancelled = slsVar2;
        this.predictiveBackState = g6i0Var;
        this.layoutDirection = layoutDirection;
        qfd.a.getClass();
        this.content = androidx.compose.runtime.f.j(qfd.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 Content$lambda$0(ModalWideNavigationRailDialogLayout modalWideNavigationRailDialogLayout, int i, fid fidVar, int i2) {
        modalWideNavigationRailDialogLayout.Content(fidVar, vng.O(i | 1));
        return zy11.a;
    }

    private final wls getContent() {
        return (wls) this.content.getValue();
    }

    private final void maybeRegisterBackCallback() {
        int i;
        if (!this.shouldDismissOnBackPress || (i = Build.VERSION.SDK_INT) < 33) {
            return;
        }
        if (this.backCallback == null) {
            sls slsVar = this.onDismissRequest;
            this.backCallback = i >= 34 ? Api34Impl.a(slsVar, this.onPredictiveBack, this.onPredictiveBackCancelled, this.predictiveBackState, this.layoutDirection) : s330.a(slsVar);
        }
        s330.b(this, this.backCallback);
    }

    private final void maybeUnregisterBackCallback() {
        if (Build.VERSION.SDK_INT >= 33) {
            s330.c(this, this.backCallback);
        }
        this.backCallback = null;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-640057148);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            getContent().invoke(btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i(this, i, i3);
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final boolean getShouldDismissOnBackPress() {
        return this.shouldDismissOnBackPress;
    }

    @Override // defpackage.gfj
    public Window getWindow() {
        return this.window;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeRegisterBackCallback();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        maybeUnregisterBackCallback();
    }

    public final void setContent(ttd parent, wls content) {
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        createComposition();
    }

    private final void setContent(wls wlsVar) {
        this.content.setValue(wlsVar);
    }
}
