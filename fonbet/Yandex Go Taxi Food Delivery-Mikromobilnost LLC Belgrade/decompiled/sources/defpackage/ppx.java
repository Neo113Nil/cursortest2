package defpackage;

import com.ybsdk.widgets.common.YbButtonView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ppx {
    public final vrc a;
    public final YbButtonView.a b;

    public ppx(vrc vrcVar, YbButtonView.a aVar) {
        this.a = vrcVar;
        this.b = aVar;
    }

    public final YbButtonView.a a() {
        return this.b;
    }

    public final vrc b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppx)) {
            return false;
        }
        ppx ppxVar = (ppx) obj;
        return this.a.equals(ppxVar.a) && this.b.equals(ppxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BottomSheetContent(viewState=" + this.a + ", buttonsState=" + this.b + Extension.C_BRAKE;
    }
}
