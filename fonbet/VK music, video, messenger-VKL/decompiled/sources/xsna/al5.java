package xsna;

import androidx.annotation.NonNull;
import java.util.Arrays;
import xsna.j5k;

/* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
/* loaded from: classes.dex */
public final class al5 extends j5k.d.b {
    public final String a;
    public final byte[] b;

    public al5(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    @Override // xsna.j5k.d.b
    @NonNull
    public final byte[] a() {
        return this.b;
    }

    @Override // xsna.j5k.d.b
    @NonNull
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j5k.d.b)) {
            return false;
        }
        j5k.d.b bVar = (j5k.d.b) obj;
        if (this.a.equals(bVar.b())) {
            return Arrays.equals(this.b, bVar instanceof al5 ? ((al5) bVar).b : bVar.a());
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}
