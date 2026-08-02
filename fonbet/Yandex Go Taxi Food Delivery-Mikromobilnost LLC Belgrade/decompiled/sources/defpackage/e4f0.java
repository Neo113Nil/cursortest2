package defpackage;

import com.yandex.messaging.ui.settings.privacy.PrivacyType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class e4f0 {
    public final List a;
    public final PrivacyType b;

    public e4f0(PrivacyType privacyType, List list) {
        Object obj;
        this.a = list;
        this.b = privacyType;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((w3f0) obj).a == this.b) {
                    break;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    public static e4f0 a(e4f0 e4f0Var, ArrayList arrayList, PrivacyType privacyType, int i) {
        ArrayList arrayList2 = arrayList;
        if ((i & 1) != 0) {
            arrayList2 = e4f0Var.a;
        }
        if ((i & 2) != 0) {
            privacyType = e4f0Var.b;
        }
        e4f0Var.getClass();
        return new e4f0(privacyType, arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4f0)) {
            return false;
        }
        e4f0 e4f0Var = (e4f0) obj;
        return jl40.l(this.a, e4f0Var.a) && this.b == e4f0Var.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        PrivacyType privacyType = this.b;
        return hashCode + (privacyType == null ? 0 : privacyType.hashCode());
    }

    public final String toString() {
        return "PrivacyScreenUiState(privacyItems=" + this.a + ", selectedItemType=" + this.b + Extension.C_BRAKE;
    }

    public e4f0() {
        this(0);
    }

    public /* synthetic */ e4f0(int i) {
        this(null, EmptyList.a);
    }
}
