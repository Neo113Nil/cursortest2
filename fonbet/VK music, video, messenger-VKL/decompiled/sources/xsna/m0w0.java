package xsna;

import android.graphics.drawable.Drawable;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.VideoFile;

/* compiled from: VkVideoUiDto.kt */
/* loaded from: classes4.dex */
public final class m0w0 {
    public final VideoFile a;
    public final boolean b;
    public final Drawable c;
    public final ktc0 d;
    public final String e;
    public final VkCell.Middle.b f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final int m;
    public final String n;

    public m0w0(VideoFile videoFile, boolean z, Drawable drawable, jwx jwxVar, String str, VkCell.Middle.b bVar, boolean z2, boolean z3, boolean z4, String str2, boolean z5, boolean z6, int i, String str3) {
        this.a = videoFile;
        this.b = z;
        this.c = drawable;
        this.d = jwxVar;
        this.e = str;
        this.f = bVar;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = str2;
        this.k = z5;
        this.l = z6;
        this.m = i;
        this.n = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0w0)) {
            return false;
        }
        m0w0 m0w0Var = (m0w0) obj;
        return epx.f(this.a, m0w0Var.a) && this.b == m0w0Var.b && epx.f(this.c, m0w0Var.c) && epx.f(this.d, m0w0Var.d) && epx.f(this.e, m0w0Var.e) && epx.f(this.f, m0w0Var.f) && this.g == m0w0Var.g && this.h == m0w0Var.h && this.i == m0w0Var.i && epx.f(this.j, m0w0Var.j) && this.k == m0w0Var.k && this.l == m0w0Var.l && this.m == m0w0Var.m && epx.f(this.n, m0w0Var.n);
    }

    public final int hashCode() {
        int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
        Drawable drawable = this.c;
        int hashCode = (b + (drawable == null ? 0 : drawable.hashCode())) * 31;
        ktc0 ktc0Var = this.d;
        int hashCode2 = (hashCode + (ktc0Var == null ? 0 : ktc0Var.hashCode())) * 31;
        String str = this.e;
        int a = shy.a(this.m, qoy.b(qoy.b(urd0.a(qoy.b(qoy.b(qoy.b((this.f.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31);
        String str2 = this.n;
        return a + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkVideoUiDto(videoFile=");
        sb.append(this.a);
        sb.append(", isSelected=");
        sb.append(this.b);
        sb.append(", videoImageBackground=");
        sb.append(this.c);
        sb.append(", videoImagePostprocessor=");
        sb.append(this.d);
        sb.append(", videoImageUrl=");
        sb.append(this.e);
        sb.append(", videoTextInfo=");
        sb.append(this.f);
        sb.append(", isOverlayVisible=");
        sb.append(this.g);
        sb.append(", isInteractiveDurationVisible=");
        sb.append(this.h);
        sb.append(", isDurationVisible=");
        sb.append(this.i);
        sb.append(", durationText=");
        sb.append(this.j);
        sb.append(", isCheckBoxVisible=");
        sb.append(this.k);
        sb.append(", isRestrictionIconVisible=");
        sb.append(this.l);
        sb.append(", restrictionIconColor=");
        sb.append(this.m);
        sb.append(", restrictionIconUrl=");
        return ho8.a(sb, this.n, ')');
    }
}
