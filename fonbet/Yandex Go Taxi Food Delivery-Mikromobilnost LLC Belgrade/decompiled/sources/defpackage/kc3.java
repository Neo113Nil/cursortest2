package defpackage;

import com.yandex.messaging.attachments.AttachmentsChooserMode;
import com.yandex.messaging.attachments.AttachmentsFileTypes;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class kc3 {
    public final AttachmentsFileTypes a;
    public final AttachmentsChooserMode b;
    public final String c;
    public final boolean d;
    public final Integer e;

    public kc3(AttachmentsFileTypes attachmentsFileTypes, AttachmentsChooserMode attachmentsChooserMode, String str, boolean z, Integer num) {
        this.a = attachmentsFileTypes;
        this.b = attachmentsChooserMode;
        this.c = str;
        this.d = z;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc3)) {
            return false;
        }
        kc3 kc3Var = (kc3) obj;
        return this.a == kc3Var.a && this.b == kc3Var.b && jl40.l(this.c, kc3Var.c) && this.d == kc3Var.d && this.e.equals(kc3Var.e);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e((this.b.hashCode() + unr0.e(this.a.hashCode() * 31, 31, false)) * 31, 31, true), 31, true);
        String str = this.c;
        return this.e.hashCode() + unr0.e((e + (str != null ? str.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachmentsShowData(fileTypes=");
        sb.append(this.a);
        sb.append(", isCapture=false, chooserMode=");
        sb.append(this.b);
        sb.append(", isMultipleSelectionEnabled=true, isGifSupported=true, auxButton=");
        tse0.y(this.c, ", createPollButtonEnabled=", ", storagePermissionExplainMessageResId=", sb, this.d);
        return oo31.j(sb, this.e, Extension.C_BRAKE);
    }
}
