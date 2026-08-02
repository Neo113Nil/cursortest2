package xsna;

import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: Descriptor.java */
/* loaded from: classes12.dex */
public final class y2m {
    public final String a;

    @Nullable
    public final String b;

    @Nullable
    public final String c;

    public y2m(String str, @Nullable String str2, @Nullable String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y2m.class == obj.getClass()) {
            y2m y2mVar = (y2m) obj;
            if (Objects.equals(this.a, y2mVar.a) && Objects.equals(this.b, y2mVar.b) && Objects.equals(this.c, y2mVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
