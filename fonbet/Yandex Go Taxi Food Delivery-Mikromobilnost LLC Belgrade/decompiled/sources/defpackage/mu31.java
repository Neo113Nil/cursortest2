package defpackage;

import com.ybsdk.navigation.NavigationFragment;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class mu31 {
    public final pey a;

    public mu31(NavigationFragment navigationFragment) {
        this.a = navigationFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mu31) && jl40.l(this.a, ((mu31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ViewScopeHolder(owner=" + this.a + Extension.C_BRAKE;
    }
}
