package xsna;

import com.google.crypto.tink.shaded.protobuf.ProtoSyntax;

/* compiled from: RawMessageInfo.java */
/* loaded from: classes.dex */
public final class kye0 implements z920 {
    public final ka20 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public kye0(ka20 ka20Var, String str, Object[] objArr) {
        this.a = ka20Var;
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

    @Override // xsna.z920
    public final boolean a() {
        return (this.d & 2) == 2;
    }

    @Override // xsna.z920
    public final ka20 b() {
        return this.a;
    }

    @Override // xsna.z920
    public final ProtoSyntax getSyntax() {
        return (this.d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }
}
