package xsna;

import android.graphics.Bitmap;
import com.vk.dto.common.id.UserId;

/* compiled from: ClipDownloadSetting.kt */
/* loaded from: classes14.dex */
public final class pao {
    public final UserId a;
    public final String b;
    public final String c;
    public Bitmap d;

    public pao(UserId userId, String str, String str2) {
        this.a = userId;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pao)) {
            return false;
        }
        pao paoVar = (pao) obj;
        return this.a.equals(paoVar.a) && epx.f(this.b, paoVar.b) && epx.f(this.c, paoVar.c);
    }

    public final int hashCode() {
        return urd0.a(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadUserInfo(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", domain=");
        return i5s.a(sb, this.c, ", photo=null)");
    }
}
