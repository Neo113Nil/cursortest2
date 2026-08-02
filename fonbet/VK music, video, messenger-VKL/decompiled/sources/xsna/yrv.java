package xsna;

import androidx.annotation.Nullable;
import java.util.Arrays;
import xsna.fi20;
import xsna.vr10;

/* compiled from: IcyInfo.java */
/* loaded from: classes12.dex */
public final class yrv implements fi20.a {
    public final byte[] a;

    @Nullable
    public final String b;

    @Nullable
    public final String c;

    public yrv(byte[] bArr, @Nullable String str, @Nullable String str2) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // xsna.fi20.a
    public final void c(vr10.a aVar) {
        String str = this.b;
        if (str != null) {
            aVar.a = str;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yrv.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((yrv) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return h5s.c(this.a.length, "\"", xe9.a("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""));
    }
}
