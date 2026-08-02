package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.communications.model.widgets.ArrowActionType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lbaq0;", "", "Companion", "z9q0", "aaq0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class baq0 {
    public static final aaq0 Companion = new aaq0();
    public static final i3y[] j;
    public final ArrowActionType a;
    public final vu1 b;
    public final b c;
    public final String d;
    public final String e;
    public final List f;
    public final String g;
    public final String h;
    public final swz0 i;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new i3y[]{a.b(lazyThreadSafetyMode, new w0q0(16)), null, null, null, null, a.b(lazyThreadSafetyMode, new w0q0(17)), null, null};
    }

    public /* synthetic */ baq0(int i, ArrowActionType arrowActionType, vu1 vu1Var, b bVar, String str, String str2, List list, String str3, String str4) {
        this.a = (i & 1) == 0 ? ArrowActionType.UNKNOWN : arrowActionType;
        if ((i & 2) == 0) {
            this.b = new vu1(0);
        } else {
            this.b = vu1Var;
        }
        if ((i & 4) == 0) {
            this.c = new c(kotlin.collections.b.f());
        } else {
            this.c = bVar;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = EmptyList.a;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str3;
        }
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str4;
        }
        this.i = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof baq0)) {
            return false;
        }
        baq0 baq0Var = (baq0) obj;
        return this.a == baq0Var.a && jl40.l(this.b, baq0Var.b) && jl40.l(this.c, baq0Var.c) && jl40.l(this.d, baq0Var.d) && jl40.l(this.e, baq0Var.e) && jl40.l(this.f, baq0Var.f) && jl40.l(this.g, baq0Var.g) && jl40.l(this.h, baq0Var.h) && jl40.l(this.i, baq0Var.i);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.c(unr0.b(unr0.b((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b.a)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        swz0 swz0Var = this.i;
        return b + (swz0Var == null ? 0 : swz0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectAction(actionType=");
        sb.append(this.a);
        sb.append(", altOffer=");
        sb.append(this.b);
        sb.append(", requirementInfoPayload=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", subtitle=");
        tse0.x(this.e, ", goals=", ", buttonText=", sb, this.f);
        g8e.D(sb, this.g, ", acceptRulesText=", this.h, ", topUpCardDeposit=");
        sb.append(this.i);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public baq0() {
        this(null, null, 511);
    }

    public baq0(ArrowActionType arrowActionType, swz0 swz0Var, int i) {
        arrowActionType = (i & 1) != 0 ? ArrowActionType.UNKNOWN : arrowActionType;
        vu1 vu1Var = new vu1(0);
        c cVar = new c(kotlin.collections.b.f());
        swz0Var = (i & 256) != 0 ? null : swz0Var;
        this.a = arrowActionType;
        this.b = vu1Var;
        this.c = cVar;
        this.d = "";
        this.e = "";
        this.f = EmptyList.a;
        this.g = "";
        this.h = "";
        this.i = swz0Var;
    }
}
