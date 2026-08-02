package xsna;

import androidx.health.platform.client.proto.ProtoSyntax;

/* compiled from: RawMessageInfo.java */
/* loaded from: classes12.dex */
public final class jye0 implements y920 {
    public final ja20 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public jye0(ja20 ja20Var, String str, Object[] objArr) {
        this.a = ja20Var;
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

    @Override // xsna.y920
    public final boolean a() {
        return (this.d & 2) == 2;
    }

    @Override // xsna.y920
    public final ja20 b() {
        return this.a;
    }

    @Override // xsna.y920
    public final ProtoSyntax getSyntax() {
        int i = this.d;
        return (i & 1) != 0 ? ProtoSyntax.PROTO2 : (i & 4) == 4 ? ProtoSyntax.EDITIONS : ProtoSyntax.PROTO3;
    }
}
