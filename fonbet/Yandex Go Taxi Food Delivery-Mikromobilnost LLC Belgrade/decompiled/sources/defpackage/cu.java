package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.personalstate.api.network.objects.DataType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcu;", "", "Companion", "au", "bu", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class cu {
    public static final bu Companion = new bu();
    public static final i3y[] d = {a.b(LazyThreadSafetyMode.PUBLICATION, new lq(28)), null, null};
    public final DataType a;
    public final ju b;
    public final gu c;

    public /* synthetic */ cu(int i, DataType dataType, ju juVar, gu guVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = dataType;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = juVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = guVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu)) {
            return false;
        }
        cu cuVar = (cu) obj;
        return this.a == cuVar.a && jl40.l(this.b, cuVar.b) && jl40.l(this.c, cuVar.c);
    }

    public final int hashCode() {
        DataType dataType = this.a;
        int hashCode = (dataType == null ? 0 : dataType.hashCode()) * 31;
        ju juVar = this.b;
        int hashCode2 = (hashCode + (juVar == null ? 0 : juVar.hashCode())) * 31;
        gu guVar = this.c;
        return hashCode2 + (guVar != null ? guVar.hashCode() : 0);
    }

    public final String toString() {
        return "ActionData(type=" + this.a + ", popup=" + this.b + ", notification=" + this.c + Extension.C_BRAKE;
    }

    public cu(int i) {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public cu() {
        this(0);
    }
}
