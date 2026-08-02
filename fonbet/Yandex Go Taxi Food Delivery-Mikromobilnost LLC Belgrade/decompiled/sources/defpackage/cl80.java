package defpackage;

import android.net.Uri;
import com.yandex.go.places.webview.api.navigation.PlacesWebAuthType;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class cl80 extends lsj {
    public final yvf0 b;
    public final dl80 c;
    public final yvf0 d;
    public final rs2 e;

    public cl80(tj70 tj70Var, dl80 dl80Var, yvf0 yvf0Var, rs2 rs2Var) {
        this.b = tj70Var;
        this.c = dl80Var;
        this.d = yvf0Var;
        this.e = rs2Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        Uri a = ((ksj) obj).a();
        this.c.getClass();
        dm80 a2 = dl80.a(a, true, false);
        if (a2 instanceof bm80) {
            ((pep0) oep0Var).f(new rwo0((vgc0) this.d.get()), new ugc0(this.e.f(), PlacesWebAuthType.OAUTH, ((bm80) a2).a().equals(l76.I), 4), hxx.a);
        } else {
            boolean z = a2 instanceof xl80;
            yvf0 yvf0Var = this.b;
            if (z) {
                xl80 xl80Var = (xl80) a2;
                ((pep0) oep0Var).f((m950) yvf0Var.get(), deeplinkSource == DeeplinkSource.PLACES ? hl80.a(xl80Var) : gl80.a(xl80Var), hxx.a);
            } else {
                ((pep0) oep0Var).f((m950) yvf0Var.get(), hl80.a(a2), hxx.a);
            }
        }
        return zy11.a;
    }
}
