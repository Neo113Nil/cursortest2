package defpackage;

import com.yandex.go.navigation.screen.c;
import com.yandex.go.zone.model.ZoneMode;
import com.yandex.go.zone.model.h;

/* loaded from: classes6.dex */
public final class od61 {
    public final c a;
    public final dqe0 b;

    public od61(c cVar, dqe0 dqe0Var) {
        this.a = cVar;
        this.b = dqe0Var;
    }

    public final boolean a() {
        String str;
        boolean g = this.a.g();
        h hVar = ZoneMode.Companion;
        String str2 = this.b.a.Q;
        hVar.getClass();
        return (g || (h.a(str2) || (str = this.b.a.Q) == null || str.length() == 0)) ? false : true;
    }
}
