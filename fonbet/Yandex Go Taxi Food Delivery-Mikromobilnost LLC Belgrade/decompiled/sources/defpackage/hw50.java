package defpackage;

import com.yandex.plus.home.datasource.openapi.models.NetworkLineWidgetGroupModel$Orientation;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class hw50 implements h260 {
    public static final gw50 Companion = new gw50();
    public static final i3y[] i;
    public final yr50 a;
    public final pq50 b;
    public final String c;
    public final String d;
    public final List e;
    public final NetworkLineWidgetGroupModel$Orientation f;
    public final List g;
    public final co50 h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new i3y[]{null, null, null, null, a.b(lazyThreadSafetyMode, new ew50(0)), a.b(lazyThreadSafetyMode, new ew50(1)), a.b(lazyThreadSafetyMode, new ew50(2)), null};
    }

    public /* synthetic */ hw50(int i2, yr50 yr50Var, pq50 pq50Var, String str, String str2, List list, NetworkLineWidgetGroupModel$Orientation networkLineWidgetGroupModel$Orientation, List list2, co50 co50Var) {
        if (63 != (i2 & 63)) {
            qje.Z(i2, 63, fw50.a.getDescriptor());
            throw null;
        }
        this.a = yr50Var;
        this.b = pq50Var;
        this.c = str;
        this.d = str2;
        this.e = list;
        this.f = networkLineWidgetGroupModel$Orientation;
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = list2;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = co50Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw50)) {
            return false;
        }
        hw50 hw50Var = (hw50) obj;
        return jl40.l(this.a, hw50Var.a) && jl40.l(this.b, hw50Var.b) && jl40.l(this.c, hw50Var.c) && jl40.l(this.d, hw50Var.d) && jl40.l(this.e, hw50Var.e) && this.f == hw50Var.f && jl40.l(this.g, hw50Var.g) && jl40.l(this.h, hw50Var.h);
    }

    @Override // defpackage.h260
    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + unr0.c(unr0.b(unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e)) * 31;
        List list = this.g;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        co50 co50Var = this.h;
        return hashCode2 + (co50Var != null ? co50Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkLineWidgetGroupModel(displayRules=" + this.a + ", contentDescription=" + this.b + ", id=" + this.c + ", type=" + this.d + ", widgetIds=" + this.e + ", orientation=" + this.f + ", templates=" + this.g + ", action=" + this.h + ')';
    }
}
