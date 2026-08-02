package defpackage;

import kotlin.Metadata;
import kotlinx.serialization.json.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lk52;", "", "Companion", "i52", "j52", "go-client-android.features.analytics:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class k52 {
    public static final j52 Companion = new j52();
    public final String a;
    public final b b;

    public /* synthetic */ k52(int i, String str, b bVar) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bVar;
        }
    }

    /* renamed from: a, reason: from getter */
    public final b getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k52)) {
            return false;
        }
        k52 k52Var = (k52) obj;
        return jl40.l(this.a, k52Var.a) && jl40.l(this.b, k52Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b bVar = this.b;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "AnalyticsWebViewEvent(name=" + this.a + ", data=" + this.b + Extension.C_BRAKE;
    }

    public k52(String str, b bVar) {
        this.a = str;
        this.b = bVar;
    }

    public k52() {
        this("", null);
    }
}
