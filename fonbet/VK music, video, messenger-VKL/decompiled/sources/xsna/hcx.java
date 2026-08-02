package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;

/* compiled from: InteractiveVideoHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class hcx extends ol60 {
    public final NewsEntry h;
    public final VideoAttachment i;
    public final ShitAttachment j;
    public final VideoFile k;
    public final float l;
    public final float m;
    public final int n;
    public final String o;
    public final String p;
    public final String q;
    public final boolean r;
    public final boolean s;
    public final Image t;
    public final int u;

    public hcx(NewsEntry newsEntry, VideoAttachment videoAttachment, ShitAttachment shitAttachment, VideoFile videoFile, float f, float f2, int i, String str, String str2, String str3, boolean z, boolean z2, Image image, int i2) {
        super(i2, 0, 0, 0, null);
        this.h = newsEntry;
        this.i = videoAttachment;
        this.j = shitAttachment;
        this.k = videoFile;
        this.l = f;
        this.m = f2;
        this.n = i;
        this.o = str;
        this.p = str2;
        this.q = str3;
        this.r = z;
        this.s = z2;
        this.t = image;
        this.u = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcx)) {
            return false;
        }
        hcx hcxVar = (hcx) obj;
        return epx.f(this.h, hcxVar.h) && epx.f(this.i, hcxVar.i) && epx.f(this.j, hcxVar.j) && epx.f(this.k, hcxVar.k) && Float.compare(this.l, hcxVar.l) == 0 && Float.compare(this.m, hcxVar.m) == 0 && this.n == hcxVar.n && epx.f(this.o, hcxVar.o) && epx.f(this.p, hcxVar.p) && epx.f(this.q, hcxVar.q) && this.r == hcxVar.r && this.s == hcxVar.s && epx.f(this.t, hcxVar.t) && this.u == hcxVar.u;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = (this.i.hashCode() + (this.h.hashCode() * 31)) * 31;
        ShitAttachment shitAttachment = this.j;
        int a = shy.a(this.n, io.reactivex.rxjava3.subjects.b.a(this.m, io.reactivex.rxjava3.subjects.b.a(this.l, jq.b(this.k, (hashCode + (shitAttachment == null ? 0 : shitAttachment.hashCode())) * 31, 31), 31), 31), 31);
        String str = this.o;
        int hashCode2 = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.p;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.q;
        return Integer.hashCode(0) + shy.a(this.u, fq.b(this.t, qoy.b(qoy.b((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.r), 31, this.s), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InteractiveVideoHolderUiDto(entry=");
        sb.append(this.h);
        sb.append(", attachment=");
        sb.append(this.i);
        sb.append(", shitAttachment=");
        sb.append(this.j);
        sb.append(", video=");
        sb.append(this.k);
        sb.append(", width=");
        sb.append(this.l);
        sb.append(", height=");
        sb.append(this.m);
        sb.append(", duration=");
        sb.append(this.n);
        sb.append(", title=");
        sb.append(this.o);
        sb.append(", ref=");
        sb.append(this.p);
        sb.append(", trackCode=");
        sb.append(this.q);
        sb.append(", isContentRestricted=");
        sb.append(this.r);
        sb.append(", isRestricted=");
        sb.append(this.s);
        sb.append(", image=");
        sb.append(this.t);
        sb.append(", videoViewType=");
        return h5s.c(this.u, ", seqId=0)", sb);
    }
}
