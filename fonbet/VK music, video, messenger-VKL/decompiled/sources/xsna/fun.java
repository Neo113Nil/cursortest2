package xsna;

import com.vk.api.base.Document;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.id.UserId;
import java.util.Iterator;

/* compiled from: DocsSave.kt */
/* loaded from: classes14.dex */
public final class fun implements d1h0 {
    public final int a;
    public final UserId b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final Image i;

    public fun(int i, UserId userId, String str, long j, String str2, String str3, int i2, int i3, Image image) {
        this.a = i;
        this.b = userId;
        this.c = str;
        this.d = j;
        this.e = str2;
        this.f = str3;
        this.g = i2;
        this.h = i3;
        this.i = image;
    }

    @Override // xsna.d1h0
    public final Document a() {
        ImageSize imageSize;
        Document document = new Document();
        document.b = this.a;
        document.h = this.b;
        document.l = this.c;
        document.g = this.d;
        document.m = this.e;
        document.k = this.f;
        document.c = this.g;
        document.i = this.h;
        Image image = this.i;
        if (image != null) {
            document.t = image;
            char i = ImageSizeKey.SIZE_M_0130.i();
            Iterator it = image.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    imageSize = null;
                    break;
                }
                imageSize = (ImageSize) it.next();
                if (imageSize.b == i) {
                    break;
                }
            }
            if (imageSize != null) {
                com.vk.dto.common.im.Image image2 = imageSize.d;
                document.n = image2.d;
                document.d = image2.b;
                document.e = image2.c;
            }
        }
        return document;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fun)) {
            return false;
        }
        fun funVar = (fun) obj;
        return this.a == funVar.a && epx.f(this.b, funVar.b) && epx.f(this.c, funVar.c) && this.d == funVar.d && epx.f(this.e, funVar.e) && epx.f(this.f, funVar.f) && this.g == funVar.g && this.h == funVar.h && epx.f(this.i, funVar.i);
    }

    public final int hashCode() {
        int a = bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b);
        String str = this.c;
        int a2 = bh10.a((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int a3 = shy.a(this.h, shy.a(this.g, urd0.a((a2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31), 31);
        Image image = this.i;
        return a3 + (image != null ? image.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DocumentSaveResult(id=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", size=");
        sb.append(this.d);
        sb.append(", extension=");
        sb.append(this.e);
        sb.append(", url=");
        sb.append(this.f);
        sb.append(", date=");
        sb.append(this.g);
        sb.append(", type=");
        sb.append(this.h);
        sb.append(", image=");
        return er.d(sb, this.i, ')');
    }
}
