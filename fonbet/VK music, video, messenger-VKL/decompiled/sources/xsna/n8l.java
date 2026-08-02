package xsna;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: DecoderReuseEvaluation.java */
/* loaded from: classes12.dex */
public final class n8l {
    public final String a;
    public final androidx.media3.common.a b;
    public final androidx.media3.common.a c;
    public final int d;
    public final int e;

    public n8l(String str, androidx.media3.common.a aVar, androidx.media3.common.a aVar2, int i, int i2) {
        fxc0.p(i == 0 || i2 == 0);
        fxc0.p(true ^ TextUtils.isEmpty(str));
        this.a = str;
        aVar.getClass();
        this.b = aVar;
        aVar2.getClass();
        this.c = aVar2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n8l.class == obj.getClass()) {
            n8l n8lVar = (n8l) obj;
            if (this.d == n8lVar.d && this.e == n8lVar.e && this.a.equals(n8lVar.a) && this.b.equals(n8lVar.b) && this.c.equals(n8lVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + urd0.a((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
