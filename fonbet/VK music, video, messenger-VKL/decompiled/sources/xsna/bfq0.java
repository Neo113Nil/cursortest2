package xsna;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* compiled from: UrlLinkFrame.java */
/* loaded from: classes12.dex */
public final class bfq0 extends asv {

    @Nullable
    public final String b;
    public final String c;

    public bfq0(String str, @Nullable String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bfq0.class == obj.getClass()) {
            bfq0 bfq0Var = (bfq0) obj;
            if (this.a.equals(bfq0Var.a) && Objects.equals(this.b, bfq0Var.b) && Objects.equals(this.c, bfq0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int a = urd0.a(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.a);
        String str = this.b;
        int hashCode = (a + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // xsna.asv
    public final String toString() {
        return this.a + ": url=" + this.c;
    }
}
