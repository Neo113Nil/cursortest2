package defpackage;

import com.yandex.messaging.experiments.ExperimentName;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class nqo {
    public final long a;
    public final ExperimentName b;
    public final c c;

    public nqo(long j, ExperimentName experimentName, c cVar) {
        this.a = j;
        this.b = experimentName;
        this.c = cVar;
    }

    public final c a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqo)) {
            return false;
        }
        nqo nqoVar = (nqo) obj;
        return this.a == nqoVar.a && this.b == nqoVar.b && jl40.l(this.c, nqoVar.c);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        ExperimentName experimentName = this.b;
        int hashCode2 = (hashCode + (experimentName == null ? 0 : experimentName.hashCode())) * 31;
        c cVar = this.c;
        return hashCode2 + (cVar != null ? cVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "ExperimentEntity(internalId=" + this.a + ", name=" + this.b + ", data=" + this.c + Extension.C_BRAKE;
    }
}
