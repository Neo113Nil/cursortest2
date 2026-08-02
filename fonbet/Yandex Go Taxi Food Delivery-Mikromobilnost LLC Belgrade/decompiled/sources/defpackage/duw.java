package defpackage;

import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class duw {
    public final ArrayList a;
    public final PageHeaderEntity b;

    public duw(ArrayList arrayList, PageHeaderEntity pageHeaderEntity) {
        this.a = arrayList;
        this.b = pageHeaderEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof duw)) {
            return false;
        }
        duw duwVar = (duw) obj;
        return this.a.equals(duwVar.a) && this.b.equals(duwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InternetProvidersListEntity(providers=" + this.a + ", header=" + this.b + Extension.C_BRAKE;
    }
}
