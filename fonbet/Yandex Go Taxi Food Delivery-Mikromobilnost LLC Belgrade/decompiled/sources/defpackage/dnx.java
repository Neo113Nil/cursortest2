package defpackage;

import com.ybsdk.feature.kyc.internal.screens.photo.model.KycBottomSheetContent$Type;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dnx implements enx {
    public final anq0 a;
    public final KycBottomSheetContent$Type b;
    public final YbButtonViewGroup.b c;

    public dnx(anq0 anq0Var, KycBottomSheetContent$Type kycBottomSheetContent$Type, YbButtonViewGroup.b bVar) {
        this.a = anq0Var;
        this.b = kycBottomSheetContent$Type;
        this.c = bVar;
    }

    @Override // defpackage.enx
    public final YbButtonViewGroup.b a() {
        return this.c;
    }

    public final anq0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnx)) {
            return false;
        }
        dnx dnxVar = (dnx) obj;
        return this.a.equals(dnxVar.a) && this.b == dnxVar.b && this.c.equals(dnxVar.c);
    }

    @Override // defpackage.enx
    public final KycBottomSheetContent$Type getType() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selfie(viewState=" + this.a + ", type=" + this.b + ", buttonsState=" + this.c + Extension.C_BRAKE;
    }
}
