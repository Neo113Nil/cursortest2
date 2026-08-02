package xsna;

import com.vk.dto.common.Image$ConvertToImage$Type;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.DocumentAttachment;

/* compiled from: AnimationHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class qp2 extends ol60 {
    public final NewsEntry h;
    public final DocumentAttachment i;
    public final VideoFile j;
    public final yg5 k;
    public final float l;
    public final float m;
    public final String n;
    public final int o;
    public final String p;
    public final Image$ConvertToImage$Type q;
    public final float r;
    public final ImageSize s;
    public final long t;

    public qp2(NewsEntry newsEntry, DocumentAttachment documentAttachment, VideoFile videoFile, yg5 yg5Var, float f, float f2, String str, int i, String str2, Image$ConvertToImage$Type image$ConvertToImage$Type, float f3, ImageSize imageSize, long j) {
        super(i, 0, 0, 0, null);
        this.h = newsEntry;
        this.i = documentAttachment;
        this.j = videoFile;
        this.k = yg5Var;
        this.l = f;
        this.m = f2;
        this.n = str;
        this.o = i;
        this.p = str2;
        this.q = image$ConvertToImage$Type;
        this.r = f3;
        this.s = imageSize;
        this.t = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp2)) {
            return false;
        }
        qp2 qp2Var = (qp2) obj;
        return epx.f(this.h, qp2Var.h) && epx.f(this.i, qp2Var.i) && epx.f(this.j, qp2Var.j) && epx.f(this.k, qp2Var.k) && Float.compare(this.l, qp2Var.l) == 0 && Float.compare(this.m, qp2Var.m) == 0 && epx.f(this.n, qp2Var.n) && this.o == qp2Var.o && epx.f(this.p, qp2Var.p) && this.q == qp2Var.q && Float.compare(this.r, qp2Var.r) == 0 && epx.f(this.s, qp2Var.s) && this.t == qp2Var.t;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = (this.i.hashCode() + (this.h.hashCode() * 31)) * 31;
        VideoFile videoFile = this.j;
        int hashCode2 = (hashCode + (videoFile == null ? 0 : videoFile.hashCode())) * 31;
        yg5 yg5Var = this.k;
        int a = io.reactivex.rxjava3.subjects.b.a(this.m, io.reactivex.rxjava3.subjects.b.a(this.l, (hashCode2 + (yg5Var == null ? 0 : yg5Var.hashCode())) * 31, 31), 31);
        String str = this.n;
        int a2 = shy.a(this.o, (a + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.p;
        int hashCode3 = (a2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image$ConvertToImage$Type image$ConvertToImage$Type = this.q;
        return Integer.hashCode(0) + bh10.a((this.s.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.r, (hashCode3 + (image$ConvertToImage$Type == null ? 0 : image$ConvertToImage$Type.hashCode())) * 31, 31)) * 31, 31, this.t);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationHolderUiDto(entry=");
        sb.append(this.h);
        sb.append(", attachment=");
        sb.append(this.i);
        sb.append(", videoFile=");
        sb.append(this.j);
        sb.append(", autoPlay=");
        sb.append(this.k);
        sb.append(", width=");
        sb.append(this.l);
        sb.append(", height=");
        sb.append(this.m);
        sb.append(", thumbUrl=");
        sb.append(this.n);
        sb.append(", holderViewType=");
        sb.append(this.o);
        sb.append(", title=");
        sb.append(this.p);
        sb.append(", type=");
        sb.append(this.q);
        sb.append(", ratio=");
        sb.append(this.r);
        sb.append(", thumb=");
        sb.append(this.s);
        sb.append(", size=");
        return efz.b(this.t, ", seqId=0)", sb);
    }
}
