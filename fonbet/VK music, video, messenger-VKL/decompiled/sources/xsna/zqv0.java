package xsna;

/* compiled from: VkLinkAnnotation.kt */
/* loaded from: classes17.dex */
public final class zqv0 {
    public final klv0 a;

    public zqv0() {
        this(null, 15);
    }

    public final tjo0 a(androidx.compose.runtime.a aVar) {
        hik0 c;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(53422920, 0, -1, "com.vk.core.compose.annotated.VkTextLinkStyles.toTextLinkStyles (VkLinkAnnotation.kt:114)");
        }
        klv0 klv0Var = this.a;
        if (klv0Var == null) {
            aVar.K(-1910542612);
            aVar.j();
            c = null;
        } else {
            aVar.K(-200177739);
            c = bkt0.c(klv0Var, aVar);
            aVar.j();
        }
        aVar.K(-1910487060);
        aVar.j();
        aVar.K(-1910431508);
        aVar.j();
        aVar.K(-1910375956);
        aVar.j();
        tjo0 tjo0Var = new tjo0(c, (hik0) null, (hik0) null, (hik0) null);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return tjo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zqv0)) {
            return false;
        }
        return epx.f(this.a, ((zqv0) obj).a);
    }

    public final int hashCode() {
        klv0 klv0Var = this.a;
        return (klv0Var != null ? klv0Var.hashCode() : 0) * 29791;
    }

    public zqv0(klv0 klv0Var, int i) {
        this.a = (i & 1) != 0 ? null : klv0Var;
    }
}
