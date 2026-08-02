package yads;

import xsna.vu5;

/* loaded from: classes10.dex */
public final class zk {
    public static final zk e = new zk(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public zk(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = mc3.e(i3) ? mc3.b(i3, i2) : -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.a);
        sb.append(", channelCount=");
        sb.append(this.b);
        sb.append(", encoding=");
        return vu5.b(sb, this.c, ']');
    }
}
