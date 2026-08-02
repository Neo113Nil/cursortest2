package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: VideoAttachItem.kt */
/* loaded from: classes17.dex */
public final class e2s0 {
    public final String a;
    public final UserId b;
    public final String c;
    public final String d;
    public final Integer e;

    public e2s0(UserId userId, String str, String str2, String str3, Integer num) {
        this.a = str;
        this.b = userId;
        this.c = str2;
        this.d = str3;
        this.e = num;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAttachItem(videoId='");
        sb.append(this.a);
        sb.append("', ownerId=");
        sb.append(this.b);
        sb.append(", title='");
        sb.append(this.c);
        sb.append("', imageUrl='");
        sb.append(this.d);
        sb.append("', albumId=");
        return oq.b(sb, this.e, ", rawActionButton=null)");
    }
}
