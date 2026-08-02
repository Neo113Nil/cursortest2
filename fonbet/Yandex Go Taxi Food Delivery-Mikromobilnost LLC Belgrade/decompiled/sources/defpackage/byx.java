package defpackage;

import com.yandex.go.layers.api.model.LayersCondition$Endpoint;
import com.yandex.go.layers.api.model.params.Screen;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class byx {
    public static final List d = scc.g(LayersCondition$Endpoint.OBJECTS, LayersCondition$Endpoint.POLYGONS, LayersCondition$Endpoint.POLYLINES);
    public final Screen a;
    public final c430 b;
    public final List c;

    public byx(Screen screen, c430 c430Var, List list) {
        this.a = screen;
        this.b = c430Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byx)) {
            return false;
        }
        byx byxVar = (byx) obj;
        return this.a == byxVar.a && jl40.l(this.b, byxVar.b) && jl40.l(this.c, byxVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LayersCondition(screen=");
        sb.append(this.a);
        sb.append(", modeContext=");
        sb.append(this.b);
        sb.append(", endpoints=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }

    public /* synthetic */ byx(Screen screen, c430 c430Var) {
        this(screen, c430Var, d);
    }
}
