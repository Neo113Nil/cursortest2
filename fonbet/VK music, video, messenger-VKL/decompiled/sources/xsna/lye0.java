package xsna;

import com.google.protobuf.MessageLite;
import com.google.protobuf.ProtoSyntax;

/* compiled from: RawMessageInfo.java */
/* loaded from: classes.dex */
public final class lye0 implements aa20 {
    public final MessageLite a;
    public final String b;
    public final Object[] c;
    public final int d;

    public lye0(MessageLite messageLite, String str, Object[] objArr) {
        this.a = messageLite;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.d = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // xsna.aa20
    public final boolean a() {
        return (this.d & 2) == 2;
    }

    @Override // xsna.aa20
    public final MessageLite b() {
        return this.a;
    }

    @Override // xsna.aa20
    public final ProtoSyntax getSyntax() {
        int i = this.d;
        return (i & 1) != 0 ? ProtoSyntax.PROTO2 : (i & 4) == 4 ? ProtoSyntax.EDITIONS : ProtoSyntax.PROTO3;
    }
}
