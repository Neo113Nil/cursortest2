package defpackage;

import android.view.View;
import com.yandex.plus.core.debug.panel.internal.presentation.controller.DebugPanelViewControllerImpl;

/* loaded from: classes2.dex */
public final class hwg implements gje {
    public final View a;

    public hwg(DebugPanelViewControllerImpl debugPanelViewControllerImpl) {
        this.a = debugPanelViewControllerImpl.getView();
    }

    @Override // defpackage.gje
    public final View getView() {
        return this.a;
    }

    @Override // defpackage.gje
    public final boolean onBackPressed() {
        return false;
    }
}
