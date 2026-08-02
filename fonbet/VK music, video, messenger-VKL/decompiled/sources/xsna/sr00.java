package xsna;

import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.attachments.MarketAlbumAttachment;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MarketAlbumGridItemUiDto.kt */
/* loaded from: classes4.dex */
public final class sr00 extends v64<MarketAlbumAttachment> {
    public final MarketAlbumAttachment e;
    public final int f;
    public final UserId g;
    public final int h;
    public final int i;
    public final String j;
    public final List<ImageSize> k;
    public final int l;
    public final int m;

    public sr00(MarketAlbumAttachment marketAlbumAttachment, int i, UserId userId, int i2, int i3, String str, ArrayList arrayList, int i4, int i5) {
        super(3, marketAlbumAttachment, i4, i5);
        this.e = marketAlbumAttachment;
        this.f = i;
        this.g = userId;
        this.h = i2;
        this.i = i3;
        this.j = str;
        this.k = arrayList;
        this.l = i4;
        this.m = i5;
    }

    @Override // xsna.v64
    public final MarketAlbumAttachment a() {
        return this.e;
    }

    @Override // xsna.v64
    public final int b() {
        return this.m;
    }

    @Override // xsna.v64
    public final int d() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr00)) {
            return false;
        }
        sr00 sr00Var = (sr00) obj;
        return epx.f(this.e, sr00Var.e) && this.f == sr00Var.f && epx.f(this.g, sr00Var.g) && this.h == sr00Var.h && this.i == sr00Var.i && epx.f(this.j, sr00Var.j) && epx.f(this.k, sr00Var.k) && this.l == sr00Var.l && this.m == sr00Var.m;
    }

    public final int hashCode() {
        int a = urd0.a(shy.a(this.i, shy.a(this.h, bh10.a(shy.a(this.f, this.e.hashCode() * 31, 31), 31, this.g.b), 31), 31), 31, this.j);
        List<ImageSize> list = this.k;
        return Integer.hashCode(this.m) + shy.a(this.l, (a + (list == null ? 0 : list.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketAlbumGridItemUiDto(attachment=");
        sb.append(this.e);
        sb.append(", id=");
        sb.append(this.f);
        sb.append(", ownerId=");
        sb.append(this.g);
        sb.append(", contentDescriptionResId=");
        sb.append(this.h);
        sb.append(", count=");
        sb.append(this.i);
        sb.append(", labelCount=");
        sb.append(this.j);
        sb.append(", images=");
        sb.append(this.k);
        sb.append(", width=");
        sb.append(this.l);
        sb.append(", height=");
        return vu5.b(sb, this.m, ')');
    }
}
