package defpackage;

import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ls3 {
    public final List a;
    public final PageHeaderEntity b;
    public final fwn c;

    public ls3(List list, PageHeaderEntity pageHeaderEntity, fwn fwnVar) {
        this.a = list;
        this.b = pageHeaderEntity;
        this.c = fwnVar;
    }

    public static ls3 a(ls3 ls3Var, ArrayList arrayList) {
        PageHeaderEntity pageHeaderEntity = ls3Var.b;
        fwn fwnVar = ls3Var.c;
        ls3Var.getClass();
        return new ls3(arrayList, pageHeaderEntity, fwnVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls3)) {
            return false;
        }
        ls3 ls3Var = (ls3) obj;
        return this.a.equals(ls3Var.a) && this.b.equals(ls3Var.b) && this.c.equals(ls3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AutoPullPermissionsSuccessEntity(items=" + this.a + ", header=" + this.b + ", emptyListInfoEntity=" + this.c + Extension.C_BRAKE;
    }
}
