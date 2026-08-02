package xsna;

import com.vk.im.engine.models.mentions.MassMentionType;

/* compiled from: Mention.kt */
/* loaded from: classes2.dex */
public final class xi10 extends k320 {
    public final MassMentionType a;
    public final String b;
    public final String c;

    public xi10(MassMentionType massMentionType, String str, String str2) {
        this.a = massMentionType;
        this.b = str;
        this.c = str2;
    }

    @Override // xsna.k320
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi10)) {
            return false;
        }
        xi10 xi10Var = (xi10) obj;
        return this.a == xi10Var.a && epx.f(this.b, xi10Var.b) && epx.f(this.c, xi10Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MassMention(type=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", nickName=");
        return ho8.a(sb, this.c, ')');
    }

    public /* synthetic */ xi10(MassMentionType massMentionType, String str) {
        this(massMentionType, str, "");
    }
}
