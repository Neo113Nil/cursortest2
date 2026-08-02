package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.Owner;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseVideoAutoplayHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class jq6 {
    public final VideoAttachment a;
    public final VideoFile b;
    public final ShitAttachment c;
    public final float d;
    public final float e;
    public final int f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final Image l;
    public final String m;
    public final boolean n;
    public final int o;
    public final List<ImageSize> p;
    public final boolean q;
    public final Owner r;
    public final String s;
    public final String t;
    public final String u;

    public jq6(VideoAttachment videoAttachment, VideoFile videoFile, ShitAttachment shitAttachment, float f, float f2, int i, String str, String str2, String str3, boolean z, boolean z2, Image image, String str4, boolean z3, int i2, ArrayList arrayList, boolean z4, Owner owner, String str5, String str6, String str7) {
        this.a = videoAttachment;
        this.b = videoFile;
        this.c = shitAttachment;
        this.d = f;
        this.e = f2;
        this.f = i;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = z;
        this.k = z2;
        this.l = image;
        this.m = str4;
        this.n = z3;
        this.o = i2;
        this.p = arrayList;
        this.q = z4;
        this.r = owner;
        this.s = str5;
        this.t = str6;
        this.u = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq6)) {
            return false;
        }
        jq6 jq6Var = (jq6) obj;
        return epx.f(this.a, jq6Var.a) && epx.f(this.b, jq6Var.b) && epx.f(this.c, jq6Var.c) && Float.compare(this.d, jq6Var.d) == 0 && Float.compare(this.e, jq6Var.e) == 0 && this.f == jq6Var.f && epx.f(this.g, jq6Var.g) && epx.f(this.h, jq6Var.h) && epx.f(this.i, jq6Var.i) && this.j == jq6Var.j && this.k == jq6Var.k && epx.f(this.l, jq6Var.l) && epx.f(this.m, jq6Var.m) && this.n == jq6Var.n && this.o == jq6Var.o && epx.f(this.p, jq6Var.p) && this.q == jq6Var.q && epx.f(this.r, jq6Var.r) && epx.f(this.s, jq6Var.s) && epx.f(this.t, jq6Var.t) && epx.f(this.u, jq6Var.u);
    }

    public final int hashCode() {
        int b = jq.b(this.b, this.a.hashCode() * 31, 31);
        ShitAttachment shitAttachment = this.c;
        int a = shy.a(this.f, io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, (b + (shitAttachment == null ? 0 : shitAttachment.hashCode())) * 31, 31), 31), 31);
        String str = this.g;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int b2 = fq.b(this.l, qoy.b(qoy.b((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.j), 31, this.k), 31);
        String str4 = this.m;
        int b3 = qoy.b(fw3.a(shy.a(this.o, qoy.b((b2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.n), 31), 31, this.p), 31, this.q);
        Owner owner = this.r;
        int hashCode3 = (b3 + (owner == null ? 0 : owner.hashCode())) * 31;
        String str5 = this.s;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.t;
        int hashCode5 = (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.u;
        return hashCode5 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseVideoAutoplayHolderUiDto(attachment=");
        sb.append(this.a);
        sb.append(", video=");
        sb.append(this.b);
        sb.append(", shitAttachment=");
        sb.append(this.c);
        sb.append(", width=");
        sb.append(this.d);
        sb.append(", height=");
        sb.append(this.e);
        sb.append(", duration=");
        sb.append(this.f);
        sb.append(", title=");
        sb.append(this.g);
        sb.append(", ref=");
        sb.append(this.h);
        sb.append(", trackCode=");
        sb.append(this.i);
        sb.append(", isContentRestricted=");
        sb.append(this.j);
        sb.append(", isRestricted=");
        sb.append(this.k);
        sb.append(", image=");
        sb.append(this.l);
        sb.append(", videoContext=");
        sb.append(this.m);
        sb.append(", fromCommonCatalog=");
        sb.append(this.n);
        sb.append(", progressBarMaxValue=");
        sb.append(this.o);
        sb.append(", thumbnailImageList=");
        sb.append(this.p);
        sb.append(", advertisement=");
        sb.append(this.q);
        sb.append(", shittyAdsOwner=");
        sb.append(this.r);
        sb.append(", shittyAdsDescription=");
        sb.append(this.s);
        sb.append(", shittyAdsActionText=");
        sb.append(this.t);
        sb.append(", shittyAdsMessage=");
        return ho8.a(sb, this.u, ')');
    }
}
