package xsna;

import com.vk.api.base.Document;
import com.vk.dto.common.id.UserId;
import java.util.Arrays;

/* compiled from: DocsSave.kt */
/* loaded from: classes14.dex */
public final class tq4 implements d1h0 {
    public final int a;
    public final UserId b;
    public final int c;
    public final byte[] d;
    public final String e;
    public final String f;
    public final String g;

    public tq4(int i, UserId userId, int i2, byte[] bArr, String str, String str2, String str3) {
        this.a = i;
        this.b = userId;
        this.c = i2;
        this.d = bArr;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    @Override // xsna.d1h0
    public final Document a() {
        Document document = new Document();
        document.b = this.a;
        document.h = this.b;
        document.f = this.c;
        document.r = this.d;
        document.q = this.e;
        document.p = this.f;
        document.o = this.g;
        return document;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq4)) {
            return false;
        }
        tq4 tq4Var = (tq4) obj;
        return this.a == tq4Var.a && epx.f(this.b, tq4Var.b) && this.c == tq4Var.c && epx.f(this.d, tq4Var.d) && epx.f(this.e, tq4Var.e) && epx.f(this.f, tq4Var.f) && epx.f(this.g, tq4Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + urd0.a(urd0.a((Arrays.hashCode(this.d) + shy.a(this.c, bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b), 31)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioMessageSaveResult(id=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", duration=");
        sb.append(this.c);
        sb.append(", waveForm=");
        sb.append(Arrays.toString(this.d));
        sb.append(", linkMp3=");
        sb.append(this.e);
        sb.append(", linkOgg=");
        sb.append(this.f);
        sb.append(", accessKey=");
        return ho8.a(sb, this.g, ')');
    }
}
