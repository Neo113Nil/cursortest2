package xsna;

import com.vk.feed.core.models.Description;
import com.vk.newsfeed.common.presentation.model.items.header.IconSize;
import java.util.ArrayList;

/* compiled from: PostHeaderHolderBindUiDto.kt */
/* loaded from: classes4.dex */
public final class t3c0 extends ol60 {
    public final ArrayList<Description> h;
    public final String i;
    public final IconSize j;
    public final int k;

    public t3c0() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3c0)) {
            return false;
        }
        t3c0 t3c0Var = (t3c0) obj;
        t3c0Var.getClass();
        return epx.f(this.h, t3c0Var.h) && epx.f(this.i, t3c0Var.i) && this.j == t3c0Var.j && this.k == t3c0Var.k;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + qoy.b(shy.a(this.k, (this.j.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(urd0.a(qoy.b(this.h.hashCode() * 31, 31, false), 961, this.i), 31, false), 31, false), 31, false), 31, false), 29791, false), 31, false)) * 961, 961), 961, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostHeaderHolderBindUiDto(titleText=null, dateText=null, dateAccessibilityText=null, descriptions=");
        sb.append(this.h);
        sb.append(", shouldAnimateDescriptions=false, delimiter=");
        sb.append(this.i);
        sb.append(", badge=null, pinned=false, isHeaderClickable=false, publishedByOwner=false, isAdvertisement=false, isAuthorAd=false, avatarState=null, verifiedDrawable=null, isVerifiedDrawableVisible=false, verifiedDrawableSize=");
        sb.append(this.j);
        sb.append(", verifiedDrawableContentDescription=null, photoImportantForAccessibility=");
        return h5s.c(this.k, ", photoContentDescription=null, isPhotoClickable=false, icon=null, seqId=0)", sb);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3c0(Object obj) {
        super(302, 0, 0, 0, null);
        ArrayList<Description> arrayList = new ArrayList<>();
        IconSize iconSize = IconSize.DP_16;
        this.h = arrayList;
        this.i = "·";
        this.j = iconSize;
        this.k = 2;
    }
}
