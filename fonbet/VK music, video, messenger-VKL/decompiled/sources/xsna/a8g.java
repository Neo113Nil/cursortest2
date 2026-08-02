package xsna;

import com.vk.core.compose.generated.VkColorToken;

/* compiled from: ColorSourceToken.kt */
@vby
/* loaded from: classes17.dex */
public final class a8g implements ipi {
    public final VkColorToken a;

    public /* synthetic */ a8g(VkColorToken vkColorToken) {
        this.a = vkColorToken;
    }

    @Override // xsna.ipi
    public final long a(int i, androidx.compose.runtime.a aVar) {
        aVar.K(1887517397);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1887517397, i, -1, "com.vk.core.view.model.ColorSourceToken.asComposeColor (ColorSourceToken.kt:8)");
        }
        long a = this.a.a(0, aVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a8g) {
            return this.a == ((a8g) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ColorSourceToken(token=" + this.a + ')';
    }
}
