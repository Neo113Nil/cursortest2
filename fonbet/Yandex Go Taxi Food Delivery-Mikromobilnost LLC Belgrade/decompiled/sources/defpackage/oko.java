package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class oko implements ig5 {
    public static final nko Companion = new nko();
    public static final i3y[] h;
    public final String a;
    public final String b;
    public final String c;
    public final vm50 d;
    public final vm50 e;
    public final vm50 f;
    public final c g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, null, null, a.b(lazyThreadSafetyMode, new cao(16)), a.b(lazyThreadSafetyMode, new cao(17)), a.b(lazyThreadSafetyMode, new cao(18)), null};
    }

    public /* synthetic */ oko(int i, String str, String str2, String str3, vm50 vm50Var, vm50 vm50Var2, vm50 vm50Var3, c cVar) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, mko.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = vm50Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = vm50Var2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = vm50Var3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = cVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oko)) {
            return false;
        }
        oko okoVar = (oko) obj;
        return jl40.l(this.a, okoVar.a) && jl40.l(this.b, okoVar.b) && jl40.l(this.c, okoVar.c) && jl40.l(this.d, okoVar.d) && jl40.l(this.e, okoVar.e) && jl40.l(this.f, okoVar.f) && jl40.l(this.g, okoVar.g);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        vm50 vm50Var = this.d;
        int hashCode = (b + (vm50Var == null ? 0 : vm50Var.hashCode())) * 31;
        vm50 vm50Var2 = this.e;
        int hashCode2 = (hashCode + (vm50Var2 == null ? 0 : vm50Var2.hashCode())) * 31;
        vm50 vm50Var3 = this.f;
        int hashCode3 = (hashCode2 + (vm50Var3 == null ? 0 : vm50Var3.hashCode())) * 31;
        c cVar = this.g;
        return hashCode3 + (cVar != null ? cVar.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ExecuteOnWidgetDivAction(logId=", this.a, ", url=", this.b, ", widgetId=");
        v.append(this.c);
        v.append(", onFail=");
        v.append(this.d);
        v.append(", onSuccess=");
        v.append(this.e);
        v.append(", onWidgetNotFound=");
        v.append(this.f);
        v.append(", payload=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
