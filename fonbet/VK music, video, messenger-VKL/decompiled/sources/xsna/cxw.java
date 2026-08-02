package xsna;

import com.vk.core.ui.themes.VKTheme;
import xsna.dhr0;

/* compiled from: InitBeforeTaskLogic.kt */
/* loaded from: classes11.dex */
public final class cxw implements dhr0.e {
    @Override // xsna.dhr0.e
    public final void sb(VKTheme vKTheme) {
        boolean z = !vKTheme.b;
        bqi.a = z;
        if (bqi.b.isInitialized()) {
            bqi.a().setValue(Boolean.valueOf(z));
        }
    }
}
