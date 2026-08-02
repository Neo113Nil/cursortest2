package xsna;

import com.vk.dto.photo.Photo;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Triple;

/* compiled from: PrimaryLinkHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class u9d0 extends ol60 {
    public final String h;
    public final Triple<String, Integer, String> i;
    public final Photo j;
    public final String k;

    public u9d0(String str, Triple<String, Integer, String> triple, Photo photo, String str2, ea60 ea60Var) {
        super(Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 0, 0, 0, ea60Var);
        this.h = str;
        this.i = triple;
        this.j = photo;
        this.k = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!u9d0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        u9d0 u9d0Var = (u9d0) obj;
        return epx.f(this.h, u9d0Var.h) && epx.f(this.i, u9d0Var.i) && epx.f(this.j, u9d0Var.j) && epx.f(this.k, u9d0Var.k);
    }

    public final int hashCode() {
        int hashCode = (this.i.hashCode() + (this.h.hashCode() * 31)) * 31;
        Photo photo = this.j;
        int hashCode2 = (hashCode + (photo != null ? photo.hashCode() : 0)) * 31;
        String str = this.k;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }
}
