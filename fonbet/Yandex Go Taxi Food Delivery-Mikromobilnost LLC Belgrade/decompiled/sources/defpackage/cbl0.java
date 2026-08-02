package defpackage;

import com.yandex.go.taxi.tariffs.internal.routestats.models.RouteStatsMode;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes8.dex */
public final class cbl0 implements jne0 {
    public final bbl0 a;
    public final RouteStatsMode b;

    public cbl0(bbl0 bbl0Var, RouteStatsMode routeStatsMode) {
        this.a = bbl0Var;
        this.b = routeStatsMode;
    }

    public final kne0 a(jne0 jne0Var) {
        boolean z = false;
        if (!(jne0Var instanceof cbl0)) {
            return new kne0(false, (String) null);
        }
        cbl0 cbl0Var = (cbl0) jne0Var;
        ListBuilder b = this.a.b(cbl0Var.a);
        String X = b.isEmpty() ? null : a.X(b, " | ", null, null, new z0l0(14), 30);
        if (b.isEmpty() && this.b == cbl0Var.b) {
            z = true;
        }
        return new kne0(z, X);
    }
}
