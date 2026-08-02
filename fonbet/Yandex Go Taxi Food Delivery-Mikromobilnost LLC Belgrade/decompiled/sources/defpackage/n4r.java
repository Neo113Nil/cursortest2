package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class n4r implements q4r {
    public final String a;
    public final List b;

    public n4r(String str, List list) {
        this.a = str;
        this.b = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj instanceof n4r) {
                n4r n4rVar = (n4r) obj;
                String str = n4rVar.a;
                String str2 = this.a;
                if (str2 == null) {
                    if (str == null) {
                        equals = true;
                        if (equals && this.b.equals(n4rVar.b)) {
                        }
                    }
                    equals = false;
                    if (equals) {
                    }
                } else {
                    if (str != null) {
                        equals = str2.equals(str);
                        if (equals) {
                        }
                    }
                    equals = false;
                    if (equals) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        String str = this.a;
        return nnm.h("Selectable(chosenOption=", str == null ? "null" : tab0.a(str), ", options=", Extension.C_BRAKE, this.b);
    }
}
