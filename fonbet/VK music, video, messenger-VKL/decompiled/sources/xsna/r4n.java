package xsna;

import android.graphics.drawable.Drawable;
import com.vk.dto.common.VideoFile;
import java.util.List;

/* compiled from: DiscoverMediaPreviewUiModel.kt */
/* loaded from: classes4.dex */
public final class r4n {
    public final String a;
    public final Drawable b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final List<ean> g;
    public final String h;
    public final VideoFile i;
    public final String j;
    public final String k;
    public final String l;
    public final boolean m;
    public final boolean n;

    public r4n(String str, l3n l3nVar, boolean z, boolean z2, String str2, String str3, List list, String str4, VideoFile videoFile, String str5, String str6, String str7, boolean z3, boolean z4) {
        this.a = str;
        this.b = l3nVar;
        this.c = z;
        this.d = z2;
        this.e = str2;
        this.f = str3;
        this.g = list;
        this.h = str4;
        this.i = videoFile;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = z3;
        this.n = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4n)) {
            return false;
        }
        r4n r4nVar = (r4n) obj;
        return epx.f(this.a, r4nVar.a) && epx.f(this.b, r4nVar.b) && this.c == r4nVar.c && this.d == r4nVar.d && epx.f(this.e, r4nVar.e) && epx.f(this.f, r4nVar.f) && epx.f(this.g, r4nVar.g) && epx.f(this.h, r4nVar.h) && epx.f(this.i, r4nVar.i) && epx.f(this.j, r4nVar.j) && epx.f(this.k, r4nVar.k) && epx.f(this.l, r4nVar.l) && this.m == r4nVar.m && this.n == r4nVar.n;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Drawable drawable = this.b;
        int b = qoy.b(qoy.b((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31, 31, this.c), 31, this.d);
        String str2 = this.e;
        int hashCode2 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int b2 = jq.b(this.i, urd0.a(fw3.a((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.g), 31, this.h), 31);
        String str4 = this.j;
        int hashCode3 = (b2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.k;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.l;
        return Boolean.hashCode(this.n) + qoy.b((hashCode4 + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.m);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Video(imageUrl=");
        sb.append(this.a);
        sb.append(", foregroundDrawable=");
        sb.append(this.b);
        sb.append(", shouldShowText=");
        sb.append(this.c);
        sb.append(", isSmallCell=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", subtitle=");
        sb.append(this.f);
        sb.append(", tags=");
        sb.append(this.g);
        sb.append(", contentDescription=");
        sb.append(this.h);
        sb.append(", videoFile=");
        sb.append(this.i);
        sb.append(", videoReferrer=");
        sb.append(this.j);
        sb.append(", videoContext=");
        sb.append(this.k);
        sb.append(", videoTrackCode=");
        sb.append(this.l);
        sb.append(", canAutoPlay=");
        sb.append(this.m);
        sb.append(", isOzonClip=");
        return defpackage.q0.a(sb, this.n, ')');
    }
}
