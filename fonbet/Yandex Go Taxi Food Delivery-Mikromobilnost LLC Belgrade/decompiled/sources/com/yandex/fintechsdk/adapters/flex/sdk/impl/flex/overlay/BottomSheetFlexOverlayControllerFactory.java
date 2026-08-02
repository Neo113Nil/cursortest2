package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.overlay;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.DocumentEngineCreatorHolder;
import defpackage.c190;
import defpackage.j0g;
import defpackage.j190;
import defpackage.l95;
import defpackage.p85;
import defpackage.tkr;
import defpackage.ukr;
import defpackage.vg10;
import flex.engine.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/overlay/BottomSheetFlexOverlayControllerFactory;", "Lukr;", "Lp85;", "Landroidx/fragment/app/FragmentActivity;", "activityProvider", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/DocumentEngineCreatorHolder;", "documentEngineCreatorHolder", "Lc190;", "overlayConfigProvider", "<init>", "(Lp85;Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/DocumentEngineCreatorHolder;Lc190;)V", "Lj190;", "overlayListener", "Ltkr;", "create", "(Lj190;)Ltkr;", "Lp85;", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/DocumentEngineCreatorHolder;", "Lc190;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BottomSheetFlexOverlayControllerFactory extends ukr {
    private final p85 activityProvider;
    private final DocumentEngineCreatorHolder documentEngineCreatorHolder;
    private final c190 overlayConfigProvider;

    public BottomSheetFlexOverlayControllerFactory(p85 p85Var, DocumentEngineCreatorHolder documentEngineCreatorHolder, c190 c190Var) {
        this.activityProvider = p85Var;
        this.documentEngineCreatorHolder = documentEngineCreatorHolder;
        this.overlayConfigProvider = c190Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a create$lambda$0(BottomSheetFlexOverlayControllerFactory bottomSheetFlexOverlayControllerFactory) {
        return bottomSheetFlexOverlayControllerFactory.documentEngineCreatorHolder.get();
    }

    @Override // defpackage.ukr
    public tkr create(j190 overlayListener) {
        FragmentActivity fragmentActivity = (FragmentActivity) this.activityProvider.b();
        Lifecycle.State b = fragmentActivity.getLifecycle().b();
        if (b == Lifecycle.State.DESTROYED || b == Lifecycle.State.INITIALIZED) {
            vg10.p("Cannot create overlay controller: Activity lifecycle is in state ", b, ". Activity must be at least CREATED.");
            return null;
        }
        return new BottomSheetFlexOverlayController(fragmentActivity, new j0g(fragmentActivity, fragmentActivity.getLifecycle()), new l95(27, this), overlayListener, this.overlayConfigProvider);
    }
}
