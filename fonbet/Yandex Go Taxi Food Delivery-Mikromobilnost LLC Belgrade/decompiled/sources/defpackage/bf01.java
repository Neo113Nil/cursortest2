package defpackage;

import java.util.List;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class bf01 implements cf01 {
    public final ListBuilder a;

    public bf01(ListBuilder listBuilder) {
        this.a = listBuilder;
    }

    @Override // defpackage.cf01
    public final boolean a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bf01) && this.a.equals(((bf01) obj).a);
    }

    @Override // defpackage.cf01
    public final List getItems() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Content(items=" + this.a + Extension.C_BRAKE;
    }
}
