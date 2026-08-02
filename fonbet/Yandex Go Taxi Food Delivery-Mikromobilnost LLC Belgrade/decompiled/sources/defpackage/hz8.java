package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class hz8 implements rcx0 {
    public final bpl0 a;
    public final LinkedHashSet b;

    public hz8(bpl0 bpl0Var) {
        this.a = bpl0Var;
        List list = bpl0Var.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ycc.r(((hx8) it.next()).b, linkedHashSet);
        }
        this.b = linkedHashSet;
    }

    @Override // defpackage.fex0
    public final Set c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hz8) && this.a.equals(((hz8) obj).a);
    }

    @Override // defpackage.rcx0
    public final String getId() {
        return "carousel";
    }

    public final int hashCode() {
        return this.a.a.hashCode() + 90163872;
    }

    public final String toString() {
        return "CarouselUiState(id=carousel, carouselCells=" + this.a + Extension.C_BRAKE;
    }
}
