package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lc7h;", "Ln96;", "Companion", "b7h", "a7h", "go-client-android.features.experiments:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class c7h extends n96 {
    public static final b7h Companion = new b7h();
    public final boolean b;

    static {
        new c7h(0);
    }

    public /* synthetic */ c7h(int i, boolean z) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c7h) && this.b == ((c7h) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return nzs.b("DefaultBooleanExperiment(enabled=", Extension.C_BRAKE, this.b);
    }

    public c7h(int i) {
        this.b = false;
    }

    public c7h() {
        this(0);
    }
}
