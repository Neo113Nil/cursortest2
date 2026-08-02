package xsna;

import com.vk.feed.core.models.Description;
import com.vk.feed.design.view.newsfeed.header.type.VkFeedHeaderIconSizeType;
import java.util.ArrayList;

/* compiled from: VkFeedPostHeaderUiModel.kt */
/* loaded from: classes18.dex */
public final class fvu0 {
    public final CharSequence a;
    public final ArrayList<Description> b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final vtu0 f;
    public final VkFeedHeaderIconSizeType g;
    public final int h;

    public fvu0() {
        this(null, null, null, 2097151);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvu0)) {
            return false;
        }
        fvu0 fvu0Var = (fvu0) obj;
        return epx.f(this.a, fvu0Var.a) && epx.f(this.b, fvu0Var.b) && epx.f(this.c, fvu0Var.c) && this.d == fvu0Var.d && this.e == fvu0Var.e && epx.f(this.f, fvu0Var.f) && this.g == fvu0Var.g && this.h == fvu0Var.h;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(urd0.a(qoy.b((this.b.hashCode() + ((charSequence == null ? 0 : charSequence.hashCode()) * 29791)) * 31, 31, false), 961, this.c), 31, false), 31, this.d), 31, false), 31, this.e), 31, false);
        vtu0 vtu0Var = this.f;
        return qoy.b(shy.a(this.h, (this.g.hashCode() + qoy.b((b + (vtu0Var == null ? 0 : vtu0Var.hashCode())) * 961, 31, false)) * 961, 961), 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkFeedPostHeaderUiModel(titleText=");
        sb.append((Object) this.a);
        sb.append(", dateText=null, dateAccessibilityText=null, descriptions=");
        sb.append(this.b);
        sb.append(", shouldAnimateDescriptions=false, delimiter=");
        sb.append(this.c);
        sb.append(", badge=null, pinned=false, isHeaderClickable=");
        sb.append(this.d);
        sb.append(", publishedByOwner=false, isAdvertisement=");
        sb.append(this.e);
        sb.append(", isAuthorAd=false, avatarState=");
        sb.append(this.f);
        sb.append(", verifiedDrawable=null, isVerifiedDrawableVisible=false, verifiedDrawableSize=");
        sb.append(this.g);
        sb.append(", verifiedDrawableContentDescription=null, photoImportantForAccessibility=");
        return h5s.c(this.h, ", photoContentDescription=null, isPhotoClickable=false, icon=null)", sb);
    }

    public fvu0(String str, ArrayList arrayList, vtu0 vtu0Var, int i) {
        str = (i & 1) != 0 ? null : str;
        arrayList = (i & 8) != 0 ? new ArrayList() : arrayList;
        boolean z = (i & 256) == 0;
        boolean z2 = (i & 1024) == 0;
        vtu0Var = (i & 4096) != 0 ? null : vtu0Var;
        VkFeedHeaderIconSizeType vkFeedHeaderIconSizeType = VkFeedHeaderIconSizeType.DP_16;
        this.a = str;
        this.b = arrayList;
        this.c = "·";
        this.d = z;
        this.e = z2;
        this.f = vtu0Var;
        this.g = vkFeedHeaderIconSizeType;
        this.h = 2;
    }
}
