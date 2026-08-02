package xsna;

import androidx.annotation.NonNull;
import java.io.File;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class v101 extends vp01 {
    public final File a;
    public final String b;

    public v101(File file, String str) {
        this.a = file;
        if (str == null) {
            throw new NullPointerException("Null splitId");
        }
        this.b = str;
    }

    @Override // xsna.vp01
    @NonNull
    public final File a() {
        return this.a;
    }

    @Override // xsna.vp01
    @NonNull
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vp01)) {
            return false;
        }
        vp01 vp01Var = (vp01) obj;
        return this.a.equals(vp01Var.a()) && this.b.equals(vp01Var.b());
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return ss9.a("SplitFileInfo{splitFile=", this.a.toString(), ", splitId=", this.b, "}");
    }
}
