package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class eoj0 {

    /* loaded from: classes6.dex */
    public static final class a {
        public final List a;
        public final List b;

        public a(List list, List list2) {
            this.a = list;
            this.b = list2;
        }

        public final List a() {
            return this.b;
        }

        public final List b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return xvz.l("Diff(updatedRequirements=", this.a, ", removedRequirements=", this.b, Extension.C_BRAKE);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a() {
            this(r0, r0);
            EmptyList emptyList = EmptyList.a;
        }
    }
}
