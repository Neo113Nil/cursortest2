package defpackage;

import com.ybsdk.feature.kyc.internal.screens.photo.model.KycBottomSheetContent$Type;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class cnx implements enx {
    public final b800 a;
    public final KycBottomSheetContent$Type b;
    public final YbButtonViewGroup.b c;

    public cnx(b800 b800Var, KycBottomSheetContent$Type kycBottomSheetContent$Type, YbButtonViewGroup.b bVar) {
        this.a = b800Var;
        this.b = kycBottomSheetContent$Type;
        this.c = bVar;
    }

    @Override // defpackage.enx
    public final YbButtonViewGroup.b a() {
        return this.c;
    }

    public final b800 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnx)) {
            return false;
        }
        cnx cnxVar = (cnx) obj;
        return this.a.equals(cnxVar.a) && this.b == cnxVar.b && this.c.equals(cnxVar.c);
    }

    @Override // defpackage.enx
    public final KycBottomSheetContent$Type getType() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MainPage(viewState=" + this.a + ", type=" + this.b + ", buttonsState=" + this.c + Extension.C_BRAKE;
    }
}
