package defpackage;

import kotlin.Metadata;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lpcj0;", "", "Companion", "ncj0", "ocj0", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class pcj0 {
    public static final ocj0 Companion = new ocj0();
    public final String a;
    public final String b;
    public final b c;

    public /* synthetic */ pcj0(int i, String str, String str2, b bVar) {
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
            this.c = new c(kotlin.collections.b.f());
        } else {
            this.c = bVar;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final b getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcj0)) {
            return false;
        }
        pcj0 pcj0Var = (pcj0) obj;
        return jl40.l(this.a, pcj0Var.a) && jl40.l(this.b, pcj0Var.b) && jl40.l(this.c, pcj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("RequirementAddressInputPromoblockDto(imageTag=", this.a, ", title=", this.b, ", payload=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public pcj0() {
        c cVar = new c(kotlin.collections.b.f());
        this.a = "";
        this.b = "";
        this.c = cVar;
    }
}
