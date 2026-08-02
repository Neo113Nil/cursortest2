package xsna;

import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ejm0;

/* compiled from: StoryTemplateState.kt */
/* loaded from: classes6.dex */
public final class ojm0 implements km50 {
    public final b b;
    public final List<ejm0> c;
    public final ejm0.b d;
    public final boolean e;

    /* compiled from: StoryTemplateState.kt */
    public static final class a {
        public static ojm0 a() {
            ejm0.c cVar = ejm0.c.a;
            return new ojm0(new b(true, e43.l(cVar, cVar, cVar, cVar, cVar, cVar)), EmptyList.b, null, false);
        }
    }

    /* compiled from: StoryTemplateState.kt */
    public static final class b implements km50 {
        public final boolean b;
        public final List<ejm0.c> c;

        public b(boolean z, List<ejm0.c> list) {
            this.b = z;
            this.c = list;
        }

        public static b a(b bVar, boolean z) {
            List<ejm0.c> list = bVar.c;
            bVar.getClass();
            return new b(z, list);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StateSkeleton(show=");
            sb.append(this.b);
            sb.append(", skeleton=");
            return ms9.a(')', sb, this.c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ojm0(b bVar, List<? extends ejm0> list, ejm0.b bVar2, boolean z) {
        this.b = bVar;
        this.c = list;
        this.d = bVar2;
        this.e = z;
    }

    public static ojm0 a(ojm0 ojm0Var, b bVar, List list, ejm0.b bVar2, boolean z, int i) {
        if ((i & 1) != 0) {
            bVar = ojm0Var.b;
        }
        if ((i & 2) != 0) {
            list = ojm0Var.c;
        }
        if ((i & 4) != 0) {
            bVar2 = ojm0Var.d;
        }
        if ((i & 8) != 0) {
            z = ojm0Var.e;
        }
        ojm0Var.getClass();
        return new ojm0(bVar, list, bVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojm0)) {
            return false;
        }
        ojm0 ojm0Var = (ojm0) obj;
        return epx.f(this.b, ojm0Var.b) && epx.f(this.c, ojm0Var.c) && epx.f(this.d, ojm0Var.d) && this.e == ojm0Var.e;
    }

    public final int hashCode() {
        int a2 = fw3.a(this.b.hashCode() * 31, 31, this.c);
        ejm0.b bVar = this.d;
        return Boolean.hashCode(this.e) + ((a2 + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryTemplateState(stateSkeleton=");
        sb.append(this.b);
        sb.append(", templateItems=");
        sb.append(this.c);
        sb.append(", memoriesBanner=");
        sb.append(this.d);
        sb.append(", showError=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
