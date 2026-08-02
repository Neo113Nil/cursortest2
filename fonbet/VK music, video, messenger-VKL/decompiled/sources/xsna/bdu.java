package xsna;

import com.vk.api.base.Document;
import com.vk.dto.common.id.UserId;

/* compiled from: DocsSave.kt */
/* loaded from: classes14.dex */
public final class bdu implements d1h0 {
    public final int a;
    public final UserId b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;

    public bdu(int i, UserId userId, String str, int i2, int i3, String str2) {
        this.a = i;
        this.b = userId;
        this.c = str;
        this.d = i2;
        this.e = i3;
        this.f = str2;
    }

    @Override // xsna.d1h0
    public final Document a() {
        Document document = new Document();
        document.b = this.a;
        document.h = this.b;
        document.k = this.c;
        document.d = this.d;
        document.e = this.e;
        document.o = this.f;
        return document;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdu)) {
            return false;
        }
        bdu bduVar = (bdu) obj;
        return this.a == bduVar.a && epx.f(this.b, bduVar.b) && epx.f(this.c, bduVar.c) && this.d == bduVar.d && this.e == bduVar.e && epx.f(this.f, bduVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + shy.a(this.e, shy.a(this.d, urd0.a(bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b), 31, this.c), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraffitiSaveResult(id=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.c);
        sb.append(", width=");
        sb.append(this.d);
        sb.append(", height=");
        sb.append(this.e);
        sb.append(", accessKey=");
        return ho8.a(sb, this.f, ')');
    }
}
