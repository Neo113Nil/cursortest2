package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.requirements.models.net.PersistenceTypeDto;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lf1b0;", "", "Companion", "d1b0", "e1b0", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class f1b0 {
    public static final e1b0 Companion = new e1b0();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new f9a0(29)), null};
    public final PersistenceTypeDto a;
    public final String b;

    public /* synthetic */ f1b0(int i, PersistenceTypeDto persistenceTypeDto, String str) {
        this.a = (i & 1) == 0 ? PersistenceTypeDto.UNKNOWN : persistenceTypeDto;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1b0)) {
            return false;
        }
        f1b0 f1b0Var = (f1b0) obj;
        return this.a == f1b0Var.a && jl40.l(this.b, f1b0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PersistencePolicyDto(type=" + this.a + ", storageKey=" + this.b + Extension.C_BRAKE;
    }

    public f1b0() {
        this.a = PersistenceTypeDto.UNKNOWN;
        this.b = "";
    }
}
