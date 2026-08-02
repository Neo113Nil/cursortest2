package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkhh;", "Lw96;", "Companion", "jhh", "ihh", "go-client-android.features.experiments:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class khh extends w96 {
    public static final jhh Companion = new jhh();
    public final boolean b;

    static {
        new khh(0);
    }

    public /* synthetic */ khh(int i, boolean z) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof khh) && this.b == ((khh) obj).b;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return nzs.b("DefaultPersistentBooleanExperiment(enabled=", Extension.C_BRAKE, this.b);
    }

    public khh(int i) {
        this.b = false;
    }

    public khh() {
        this(0);
    }
}
