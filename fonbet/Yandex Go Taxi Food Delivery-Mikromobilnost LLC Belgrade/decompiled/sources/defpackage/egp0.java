package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import java.util.List;

/* loaded from: classes6.dex */
public final class egp0 implements j9s0 {
    public final List a;

    public egp0(Screen... screenArr) {
        this.a = j73.d0(screenArr);
    }

    @Override // defpackage.j9s0
    public final boolean a(Screen screen) {
        return this.a.contains(screen);
    }

    @Override // defpackage.j9s0
    public final x060 b() {
        return null;
    }

    @Override // defpackage.j9s0
    public final boolean c(Screen screen) {
        return this.a.contains(screen);
    }
}
