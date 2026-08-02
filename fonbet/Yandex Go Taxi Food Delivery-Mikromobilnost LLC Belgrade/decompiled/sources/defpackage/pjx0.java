package defpackage;

import com.yandex.go.zone.dto.objects.ServiceLevel;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lpjx0;", "", "Companion", "njx0", "ojx0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class pjx0 {
    public static final ojx0 Companion = new ojx0();
    public final ServiceLevel a;
    public final String b;
    public final rjx0 c;

    public /* synthetic */ pjx0(int i, ServiceLevel serviceLevel, String str, rjx0 rjx0Var) {
        this.a = (i & 1) == 0 ? new ServiceLevel(0) : serviceLevel;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = x121.INSTANCE;
        } else {
            this.c = rjx0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!pjx0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        pjx0 pjx0Var = (pjx0) obj;
        return jl40.l(this.a.f, pjx0Var.a.f) && jl40.l(this.b, pjx0Var.b) && jl40.l(this.c, pjx0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.b.hashCode() * 31, 31, this.a.f);
    }

    public final String toString() {
        return "TariffOverride(serviceLevel=" + this.a + ", baseServiceLevelClass=" + this.b + ", extra=" + this.c + Extension.C_BRAKE;
    }

    public pjx0(ServiceLevel serviceLevel, String str, rjx0 rjx0Var) {
        this.a = serviceLevel;
        this.b = str;
        this.c = rjx0Var;
    }

    public pjx0() {
        this(new ServiceLevel(0), "", x121.INSTANCE);
    }
}
