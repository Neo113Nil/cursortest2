package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.UploadedImagesPreviewSize;

/* loaded from: classes5.dex */
public final class pd21 implements pre {
    public static final o690 f = new o690(16, 16, 0, 0);
    public final String a;
    public final c0k0 b;
    public final UploadedImagesPreviewSize c;
    public final o690 d;
    public final String e;

    public pd21(String str, c0k0 c0k0Var, UploadedImagesPreviewSize uploadedImagesPreviewSize, o690 o690Var, String str2) {
        this.a = str;
        this.b = c0k0Var;
        this.c = uploadedImagesPreviewSize;
        this.d = o690Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd21)) {
            return false;
        }
        pd21 pd21Var = (pd21) obj;
        return jl40.l(this.a, pd21Var.a) && this.b.equals(pd21Var.b) && this.c == pd21Var.c && this.d.equals(pd21Var.d) && jl40.l(this.e, pd21Var.e);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "uploaded-images-preview";
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UploadedImagesPreviewCoreWidget(id=");
        sb.append(this.a);
        sb.append(", resultPosition=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", contentPaddings=");
        sb.append(this.d);
        sb.append(", metricaLabel=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
