package xsna;

import java.util.List;

/* compiled from: QrCodeMlkitReader.kt */
/* loaded from: classes5.dex */
public final class mne0 {
    public final List<y36> a;
    public final int b;
    public final int c;

    /* JADX WARN: Multi-variable type inference failed */
    public mne0(List<? extends y36> list, int i, int i2) {
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mne0)) {
            return false;
        }
        mne0 mne0Var = (mne0) obj;
        return epx.f(this.a, mne0Var.a) && this.b == mne0Var.b && this.c == mne0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QrDecodeMlkitResult(barcodes=");
        sb.append(this.a);
        sb.append(", imageWidth=");
        sb.append(this.b);
        sb.append(", imageHeight=");
        return vu5.b(sb, this.c, ')');
    }
}
