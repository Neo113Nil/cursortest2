package defpackage;

import com.yandex.passport.api.g;
import kotlin.a;

/* loaded from: classes9.dex */
public final class ip90 {
    public final i3y a;

    public ip90(hp90 hp90Var) {
        this.a = a.a(new csz(28, hp90Var));
    }

    public final g a() {
        i3y i3yVar = this.a;
        if (!i3yVar.isInitialized()) {
            gtq0.F("UiApiAcquireBeforeHeat", null, new IllegalStateException("KPassportUiApi should be initialized from Activity::onCreate before first use"));
        }
        return (g) i3yVar.getValue();
    }
}
