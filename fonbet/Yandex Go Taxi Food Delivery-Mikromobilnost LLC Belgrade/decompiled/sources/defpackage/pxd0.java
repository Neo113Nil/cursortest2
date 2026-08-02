package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class pxd0 extends n351 {
    public final dbu c;
    public final ArrayList d;
    public final LinkedHashMap e;
    public final boolean f;

    public pxd0(dbu dbuVar, ArrayList arrayList, LinkedHashMap linkedHashMap, boolean z) {
        super("poll-key", false, 14);
        this.c = dbuVar;
        this.d = arrayList;
        this.e = linkedHashMap;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxd0)) {
            return false;
        }
        pxd0 pxd0Var = (pxd0) obj;
        return this.c.equals(pxd0Var.c) && this.d.equals(pxd0Var.d) && this.e.equals(pxd0Var.e) && this.f == pxd0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ly3.b(this.c.hashCode() * 31, 31, this.d)) * 31);
    }

    public final String toString() {
        return "PollModel(header=" + this.c + ", visibleQuestionIds=" + this.d + ", questionsMap=" + this.e + ", isCompleted=" + this.f + Extension.C_BRAKE;
    }
}
