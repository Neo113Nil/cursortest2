package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.kyc.internal.screens.photo.model.KycBottomSheetContent$Type;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bnx implements enx {
    public final Text.Resource a;
    public final Text.Resource b;
    public final KycBottomSheetContent$Type c;
    public final YbButtonViewGroup.b d;

    public bnx(Text.Resource resource, Text.Resource resource2, KycBottomSheetContent$Type kycBottomSheetContent$Type, YbButtonViewGroup.b bVar) {
        this.a = resource;
        this.b = resource2;
        this.c = kycBottomSheetContent$Type;
        this.d = bVar;
    }

    @Override // defpackage.enx
    public final YbButtonViewGroup.b a() {
        return this.d;
    }

    public final Text b() {
        return this.b;
    }

    public final Text c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnx)) {
            return false;
        }
        bnx bnxVar = (bnx) obj;
        return this.a.equals(bnxVar.a) && this.b.equals(bnxVar.b) && this.c == bnxVar.c && this.d.equals(bnxVar.d);
    }

    @Override // defpackage.enx
    public final KycBottomSheetContent$Type getType() {
        return this.c;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + uw51.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "General(title=" + this.a + ", description=" + this.b + ", type=" + this.c + ", buttonsState=" + this.d + Extension.C_BRAKE;
    }
}
