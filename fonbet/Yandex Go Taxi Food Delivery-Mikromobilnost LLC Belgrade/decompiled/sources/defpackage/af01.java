package defpackage;

import java.util.Collections;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class af01 implements cf01 {
    public final gc5 a;

    public af01(gc5 gc5Var) {
        this.a = gc5Var;
    }

    @Override // defpackage.cf01
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof af01) && this.a.equals(((af01) obj).a);
    }

    @Override // defpackage.cf01
    public final List getItems() {
        return Collections.singletonList(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Alert(item=" + this.a + Extension.C_BRAKE;
    }
}
