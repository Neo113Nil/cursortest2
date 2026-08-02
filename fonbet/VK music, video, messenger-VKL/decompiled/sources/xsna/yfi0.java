package xsna;

import com.vk.core.compose.component.semantics.SemanticsConfiguration;

/* compiled from: SemanticsConfigurationHolder.kt */
@vby
/* loaded from: classes17.dex */
public final class yfi0 {
    public final SemanticsConfiguration a;

    public static String a(SemanticsConfiguration semanticsConfiguration) {
        return "SemanticsConfigurationHolder(value=" + semanticsConfiguration + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yfi0) {
            return epx.f(this.a, ((yfi0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a(this.a);
    }
}
