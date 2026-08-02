package xsna;

import com.vk.dto.common.data.InaccessibilityMessage;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.design.compose.tile.model.ProductCtaButton;

/* compiled from: ProductItem.kt */
/* loaded from: classes18.dex */
public final class zjk {
    public final ProductCtaButton.Type a;
    public final String b;
    public final String c;
    public final UserId d;
    public final String e;
    public final String f;
    public final boolean g;
    public final InaccessibilityMessage h;

    public zjk(ProductCtaButton.Type type, String str, String str2, UserId userId, String str3, String str4, boolean z, InaccessibilityMessage inaccessibilityMessage) {
        this.a = type;
        this.b = str;
        this.c = str2;
        this.d = userId;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = inaccessibilityMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjk)) {
            return false;
        }
        zjk zjkVar = (zjk) obj;
        return this.a == zjkVar.a && epx.f(this.b, zjkVar.b) && epx.f(this.c, zjkVar.c) && epx.f(this.d, zjkVar.d) && epx.f(this.e, zjkVar.e) && epx.f(this.f, zjkVar.f) && this.g == zjkVar.g && epx.f(this.h, zjkVar.h);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        UserId userId = this.d;
        int b = qoy.b(urd0.a(urd0.a((a + (userId == null ? 0 : Long.hashCode(userId.b))) * 31, 31, this.e), 31, this.f), 31, this.g);
        InaccessibilityMessage inaccessibilityMessage = this.h;
        return b + (inaccessibilityMessage != null ? inaccessibilityMessage.hashCode() : 0);
    }

    public final String toString() {
        return "CtaButton(type=" + this.a + ", title=" + this.b + ", url=" + this.c + ", user=" + this.d + ", phone=" + this.e + ", customText=" + this.f + ", isAvailableNow=" + this.g + ", inaccessibilityMessage=" + this.h + ')';
    }
}
