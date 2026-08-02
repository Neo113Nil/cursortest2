package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.navigation.screen.c;

/* loaded from: classes8.dex */
public final class mgv0 {
    public final c a;
    public final urv0 b;
    public final mzb c;
    public volatile boolean d;
    public volatile zzs e;
    public volatile zzs f;

    public mgv0(c cVar, urv0 urv0Var, mzb mzbVar) {
        this.a = cVar;
        this.b = urv0Var;
        this.c = mzbVar;
    }

    public final boolean a() {
        if (!this.d) {
            return false;
        }
        c cVar = this.a;
        Screen d = cVar.d();
        Screen b = cVar.b();
        if (this.b.a()) {
            Screen screen = Screen.SUMMARY;
            if (d != screen) {
                return true;
            }
            b.getClass();
            if (b == screen || b == Screen.ROUTE_SELECTOR || b == Screen.CHOOSE_B) {
                return true;
            }
        } else if (d != Screen.ROUTE_SELECTOR || b != Screen.SUMMARY) {
            return true;
        }
        this.d = false;
        this.e = null;
        this.f = null;
        return false;
    }
}
