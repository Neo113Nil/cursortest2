package defpackage;

import flex.feature.divkit.scaffold.DivKitScaffoldPadding;
import flex.theme.ThemedColor;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lhrx;", "", "Companion", "frx", "grx", "flex-divkit-scaffold-feature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class hrx {
    public static final grx Companion = new grx();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new vix(12))};
    public final DivKitScaffoldPadding a;
    public final ThemedColor b;

    public /* synthetic */ hrx(int i, DivKitScaffoldPadding divKitScaffoldPadding, ThemedColor themedColor) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = divKitScaffoldPadding;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = themedColor;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!hrx.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        hrx hrxVar = (hrx) obj;
        return jl40.l(this.a, hrxVar.a) && jl40.l(this.b, hrxVar.b);
    }

    public final int hashCode() {
        DivKitScaffoldPadding divKitScaffoldPadding = this.a;
        int hashCode = (divKitScaffoldPadding != null ? divKitScaffoldPadding.hashCode() : 0) * 31;
        ThemedColor themedColor = this.b;
        return hashCode + (themedColor != null ? themedColor.hashCode() : 0);
    }

    public final String toString() {
        return "LandscapeSettings(horizontalPadding=" + this.a + ", paddingColor=" + this.b + Extension.C_BRAKE;
    }

    public hrx() {
        this.a = null;
        this.b = null;
    }
}
