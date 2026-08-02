package defpackage;

import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.widgets.common.segmented.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hee {
    public final FragmentScreen a;
    public final a b;

    public hee(FragmentScreen fragmentScreen, a aVar) {
        this.a = fragmentScreen;
        this.b = aVar;
    }

    public final FragmentScreen a() {
        return this.a;
    }

    public final a b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hee)) {
            return false;
        }
        hee heeVar = (hee) obj;
        return this.a.equals(heeVar.a) && this.b.equals(heeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ContainerViewItem(itemScreen=" + this.a + ", tab=" + this.b + Extension.C_BRAKE;
    }
}
