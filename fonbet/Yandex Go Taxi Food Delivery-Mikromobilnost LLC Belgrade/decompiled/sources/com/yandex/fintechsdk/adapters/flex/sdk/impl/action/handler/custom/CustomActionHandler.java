package com.yandex.fintechsdk.adapters.flex.sdk.impl.action.handler.custom;

import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.action.CustomAction;
import defpackage.dw;
import defpackage.ig5;
import defpackage.jg5;
import defpackage.jh5;
import defpackage.n6u;
import defpackage.p85;
import defpackage.v8e;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/action/handler/custom/CustomActionHandler;", "Ldw;", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/action/CustomAction;", "Lig5;", "Lp85;", "Landroidx/fragment/app/FragmentActivity;", "activityProvider", "Ljg5;", "handler", "<init>", "(Lp85;Ljg5;)V", "action", "Ln6u;", "context", "Lzy11;", "handle", "(Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/action/CustomAction;Ln6u;)V", "Lp85;", "Ljg5;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CustomActionHandler implements dw {
    private final p85 activityProvider;
    private final jg5 handler;

    public CustomActionHandler(p85 p85Var, jg5 jg5Var) {
        this.activityProvider = p85Var;
        this.handler = jg5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View handle$lambda$0(CustomActionHandler customActionHandler, String str) {
        Window window;
        View decorView;
        FragmentActivity fragmentActivity = (FragmentActivity) customActionHandler.activityProvider.a();
        if (fragmentActivity == null || (window = fragmentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.findViewWithTag(str);
    }

    @Override // defpackage.dw
    public void handle(CustomAction<ig5> action, n6u context) {
        this.handler.y(action.getAction(), new jh5(new NestedActionDispatcherImpl(context.c, context.b), new v8e(7, this)));
    }
}
