package defpackage;

import com.yandex.go.chargers.discovery.domain.c;
import com.yandex.go.navigation.screen.api.Screen;
import ru.yandex.taxi.systemrequeirements.location.n;

/* loaded from: classes12.dex */
public final class bx9 extends ad5 {
    public final cyx A;
    public final o6a B;
    public final c C;
    public final c29 D;
    public final qw9 E;
    public final com.yandex.go.navigation.screen.c x;
    public final en9 y;
    public final n z;

    public bx9(com.yandex.go.navigation.screen.c cVar, en9 en9Var, n nVar, cyx cyxVar, o6a o6aVar, c cVar2, c29 c29Var, qw9 qw9Var) {
        super(ix9.class);
        this.x = cVar;
        this.y = en9Var;
        this.z = nVar;
        this.A = cyxVar;
        this.B = o6aVar;
        this.C = cVar2;
        this.D = c29Var;
        this.E = qw9Var;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.x.i(Screen.UNSUPPORTED);
    }
}
