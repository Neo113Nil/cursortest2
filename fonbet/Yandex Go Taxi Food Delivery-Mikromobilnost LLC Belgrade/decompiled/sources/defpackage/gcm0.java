package defpackage;

import com.ybsdk.core.utils.ColorModel;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gcm0 implements lcm0 {
    public final fcm0 a;
    public final ArrayList b;
    public final yon c;
    public final boolean d;
    public final ColorModel e;

    public gcm0(fcm0 fcm0Var, ArrayList arrayList, yon yonVar, boolean z, ColorModel colorModel) {
        this.a = fcm0Var;
        this.b = arrayList;
        this.c = yonVar;
        this.d = z;
        this.e = colorModel;
    }

    public final boolean a() {
        return this.d;
    }

    public final yon b() {
        return this.c;
    }

    public final fcm0 c() {
        return this.a;
    }

    public final List d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcm0)) {
            return false;
        }
        gcm0 gcm0Var = (gcm0) obj;
        return this.a.equals(gcm0Var.a) && this.b.equals(gcm0Var.b) && jl40.l(this.c, gcm0Var.c) && this.d == gcm0Var.d && this.e.equals(gcm0Var.e);
    }

    @Override // defpackage.lcm0
    public final ColorModel getBackgroundColor() {
        return this.e;
    }

    public final int hashCode() {
        int b = ly3.b(this.a.hashCode() * 31, 31, this.b);
        yon yonVar = this.c;
        return this.e.hashCode() + unr0.e((b + (yonVar == null ? 0 : yonVar.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(header=");
        sb.append(this.a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", educationV2State=");
        sb.append(this.c);
        sb.append(", canShowBalanceAnimation=");
        sb.append(this.d);
        sb.append(", backgroundColor=");
        return n.o(sb, this.e, Extension.C_BRAKE);
    }
}
