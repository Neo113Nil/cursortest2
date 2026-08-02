package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.yandex.taxi.scooters.data.model.VehicleType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lj48;", "", "Companion", "h48", "i48", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class j48 {
    public static final i48 Companion = new i48();
    public static final i3y[] k = {null, null, null, null, null, null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new ij7(18))};
    public final String a;
    public final String b;
    public final String c;
    public final fdy0 d;
    public final w6z e;
    public final xmp f;
    public final String g;
    public final String h;
    public final String i;
    public final VehicleType j;

    public /* synthetic */ j48(int i, String str, String str2, String str3, fdy0 fdy0Var, w6z w6zVar, xmp xmpVar, String str4, String str5, String str6, VehicleType vehicleType) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = fdy0Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = w6zVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = xmpVar;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str4;
        }
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str5;
        }
        if ((i & 256) == 0) {
            this.i = "";
        } else {
            this.i = str6;
        }
        if ((i & 512) == 0) {
            this.j = VehicleType.SCOOTER;
        } else {
            this.j = vehicleType;
        }
    }

    public static final /* synthetic */ void l(j48 j48Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(j48Var.a, "")) {
            yjdVar.o(serialDescriptor, 0, j48Var.a);
        }
        if (yjdVar.F() || !jl40.l(j48Var.b, "")) {
            yjdVar.o(serialDescriptor, 1, j48Var.b);
        }
        if (yjdVar.F() || !jl40.l(j48Var.c, "")) {
            yjdVar.o(serialDescriptor, 2, j48Var.c);
        }
        if (yjdVar.F() || j48Var.d != null) {
            yjdVar.g(serialDescriptor, 3, ddy0.a, j48Var.d);
        }
        if (yjdVar.F() || j48Var.e != null) {
            yjdVar.g(serialDescriptor, 4, j6z.a, j48Var.e);
        }
        if (yjdVar.F() || j48Var.f != null) {
            yjdVar.g(serialDescriptor, 5, vmp.a, j48Var.f);
        }
        if (yjdVar.F() || !jl40.l(j48Var.g, "")) {
            yjdVar.o(serialDescriptor, 6, j48Var.g);
        }
        if (yjdVar.F() || !jl40.l(j48Var.h, "")) {
            yjdVar.o(serialDescriptor, 7, j48Var.h);
        }
        if (yjdVar.F() || !jl40.l(j48Var.i, "")) {
            yjdVar.o(serialDescriptor, 8, j48Var.i);
        }
        if (!yjdVar.F() && j48Var.j == VehicleType.SCOOTER) {
            return;
        }
        yjdVar.e(serialDescriptor, 9, (KSerializer) k[9].getValue(), j48Var.j);
    }

    /* renamed from: b, reason: from getter */
    public final xmp getF() {
        return this.f;
    }

    /* renamed from: c, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: d, reason: from getter */
    public final String getH() {
        return this.h;
    }

    /* renamed from: e, reason: from getter */
    public final w6z getE() {
        return this.e;
    }

    /* renamed from: f, reason: from getter */
    public final String getG() {
        return this.g;
    }

    /* renamed from: g, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: h, reason: from getter */
    public final String getI() {
        return this.i;
    }

    /* renamed from: i, reason: from getter */
    public final fdy0 getD() {
        return this.d;
    }

    /* renamed from: j, reason: from getter */
    public final VehicleType getJ() {
        return this.j;
    }

    /* renamed from: k, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public j48() {
        VehicleType vehicleType = VehicleType.SCOOTER;
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = vehicleType;
    }
}
