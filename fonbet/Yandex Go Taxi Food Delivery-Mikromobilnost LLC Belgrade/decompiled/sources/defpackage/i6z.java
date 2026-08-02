package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final /* synthetic */ class i6z implements cdx {
    public final /* synthetic */ int b;
    public final /* synthetic */ String[] c;

    public /* synthetic */ i6z(String[] strArr, int i) {
        this.b = i;
        this.c = strArr;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        switch (this.b) {
        }
        return cdx.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        int i = this.b;
        String[] strArr = this.c;
        switch (i) {
            case 0:
                if (!(obj instanceof cdx) || !Arrays.equals(strArr, ((cdx) obj).names())) {
                    break;
                }
                break;
            case 1:
                if (!(obj instanceof cdx) || !Arrays.equals(strArr, ((cdx) obj).names())) {
                    break;
                }
                break;
            default:
                if (!(obj instanceof cdx) || !Arrays.equals(strArr, ((cdx) obj).names())) {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        int hashCode;
        int i = this.b;
        String[] strArr = this.c;
        switch (i) {
            case 0:
                hashCode = Arrays.hashCode(strArr);
                break;
            case 1:
                hashCode = Arrays.hashCode(strArr);
                break;
            default:
                hashCode = Arrays.hashCode(strArr);
                break;
        }
        return hashCode ^ 397397176;
    }

    @Override // defpackage.cdx
    public final /* synthetic */ String[] names() {
        int i = this.b;
        return this.c;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        int i = this.b;
        String arrays = Arrays.toString(this.c);
        switch (i) {
        }
        return oyr.p("@kotlinx.serialization.json.JsonNames(names=", arrays, Extension.C_BRAKE);
    }
}
