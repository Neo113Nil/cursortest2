package xsna;

import android.graphics.drawable.Drawable;
import com.vk.common.links.AwayLink;
import com.vk.dto.newsfeed.ButtonAction;
import com.vk.feed.core.models.news.NewsEntry;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: AdFooterUiDto.kt */
/* loaded from: classes4.dex */
public final class uf0 extends ol60 {
    public final String h;
    public final ButtonAction i;
    public final boolean j;
    public final float k;
    public final NewsEntry l;
    public final Drawable m;
    public final AwayLink n;

    public uf0(String str, ButtonAction buttonAction, boolean z, float f, NewsEntry newsEntry, Drawable drawable, AwayLink awayLink) {
        super(Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE, 0, 0, 0, null);
        this.h = str;
        this.i = buttonAction;
        this.j = z;
        this.k = f;
        this.l = newsEntry;
        this.m = drawable;
        this.n = awayLink;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf0)) {
            return false;
        }
        uf0 uf0Var = (uf0) obj;
        uf0Var.getClass();
        return epx.f(this.h, uf0Var.h) && epx.f(this.i, uf0Var.i) && this.j == uf0Var.j && Float.compare(this.k, uf0Var.k) == 0 && epx.f(this.l, uf0Var.l) && epx.f(this.m, uf0Var.m) && epx.f(this.n, uf0Var.n);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(0) * 31, 31, this.h);
        ButtonAction buttonAction = this.i;
        int b = e630.b(io.reactivex.rxjava3.subjects.b.a(this.k, qoy.b((a + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31, 31, this.j), 31), 31, this.l);
        Drawable drawable = this.m;
        int hashCode = (b + (drawable == null ? 0 : drawable.hashCode())) * 31;
        AwayLink awayLink = this.n;
        return hashCode + (awayLink != null ? awayLink.hashCode() : 0);
    }

    public final String toString() {
        return "AdFooterUiDto(seqId=0, buttonText=" + this.h + ", buttonAction=" + this.i + ", buttonRecolorAvailable=" + this.j + ", rating=" + this.k + ", entry=" + this.l + ", endDrawable=" + this.m + ", awayLink=" + this.n + ')';
    }
}
