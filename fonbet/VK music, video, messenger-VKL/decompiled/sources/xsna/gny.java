package xsna;

import android.graphics.Bitmap;
import com.vk.dto.common.id.UserId;

/* compiled from: LayerDownloadSetting.kt */
/* loaded from: classes3.dex */
public final class gny {
    public final UserId a;
    public final String b;
    public final String c;
    public Bitmap d;

    public gny(UserId userId, String str, String str2, Bitmap bitmap) {
        this.a = userId;
        this.b = str;
        this.c = str2;
        this.d = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gny)) {
            return false;
        }
        gny gnyVar = (gny) obj;
        return epx.f(this.a, gnyVar.a) && epx.f(this.b, gnyVar.b) && epx.f(this.c, gnyVar.c) && epx.f(this.d, gnyVar.d);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b), 961, this.c);
        Bitmap bitmap = this.d;
        return a + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LayerDownloadUserInfo(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", domain=");
        sb.append(this.c);
        sb.append(", photo=null, photoBitmap=");
        return qr.c(sb, this.d, ')');
    }
}
