package defpackage;

import com.yandex.go.requirements.api.domain.model.CompoundSelect$CompoundSelectItemType;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class ovd {
    public final ArrayList a;
    public final CompoundSelect$CompoundSelectItemType b;

    public ovd(ArrayList arrayList, CompoundSelect$CompoundSelectItemType compoundSelect$CompoundSelectItemType) {
        this.a = arrayList;
        this.b = compoundSelect$CompoundSelectItemType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovd)) {
            return false;
        }
        ovd ovdVar = (ovd) obj;
        return this.a.equals(ovdVar.a) && this.b == ovdVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CompoundSelect(items=" + this.a + ", type=" + this.b + Extension.C_BRAKE;
    }
}
