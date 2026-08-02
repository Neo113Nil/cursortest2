package com.yandex.go.navigation.compose.modal;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import defpackage.b230;
import defpackage.co91;
import defpackage.e230;
import defpackage.g030;
import defpackage.h030;
import defpackage.mw0;
import defpackage.oa;
import defpackage.pz40;
import defpackage.sz20;
import defpackage.wls;
import defpackage.zw20;
import defpackage.zy11;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0014¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001fH\u0014¢\u0006\u0004\b&\u0010#J\u0017\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010+R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010,R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/yandex/go/navigation/compose/modal/ComposeAdapterModalView;", "Lru/yandex/taxi/widget/ModalView;", "Lg030;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "Lzy11;", "content", "Lpz40;", "Luz20;", "events", "Lzw20;", "accessibilityDelegate", "", "modalScreenName", "<init>", "(Landroid/content/Context;Lwls;Lpz40;Lzw20;Ljava/lang/String;)V", "screenName", "()Ljava/lang/String;", "Le230;", "insetsType", "()Le230;", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "", "duration", "animateShowBackground", "(J)V", "animateDismissBackground", "()V", "Ljava/lang/Runnable;", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "startAction", "endAction", "animateDismiss", "Lh030;", "listener", "setAccessibilityListener", "(Lh030;)V", "Lpz40;", "Lzw20;", "Ljava/lang/String;", "Landroidx/compose/ui/platform/ComposeView;", "resultView", "Landroidx/compose/ui/platform/ComposeView;", "compose"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposeAdapterModalView extends ModalView implements g030 {
    public static final int $stable = 8;
    private final zw20 accessibilityDelegate;
    private final pz40 events;
    private final String modalScreenName;
    private final ComposeView resultView;

    public ComposeAdapterModalView(Context context, wls wlsVar, pz40 pz40Var, zw20 zw20Var, String str) {
        super(context);
        this.events = pz40Var;
        this.accessibilityDelegate = zw20Var;
        this.modalScreenName = str;
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        co91.c(composeView, wlsVar);
        this.resultView = composeView;
        addView(composeView);
        setClickable(false);
        setDismissOnTouchOutside(false);
        setDismissOnBackPressed(false);
        setInterceptOnBackPress(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 animateDismiss$lambda$0(Runnable runnable) {
        runnable.run();
        return zy11.a;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        startAction.run();
        if (((Number) ((oa) this.events).j().getValue()).intValue() <= 0) {
            endAction.run();
            return;
        }
        pz40 pz40Var = this.events;
        sz20 sz20Var = new sz20(new mw0(3, endAction));
        r0 r0Var = (r0) pz40Var;
        r0Var.getClass();
        r0Var.m(null, sz20Var);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismissBackground() {
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        onAnimateShowStartAction.run();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShowBackground(long duration) {
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContentView() {
        return this.resultView;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return b230.a;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName, reason: from getter */
    public String getModalScreenName() {
        return this.modalScreenName;
    }

    @Override // defpackage.g030
    public void setAccessibilityListener(h030 listener) {
        this.accessibilityDelegate.a = listener;
    }
}
